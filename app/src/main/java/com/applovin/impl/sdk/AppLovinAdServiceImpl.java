package com.applovin.impl.sdk;

import android.content.Context;
import android.graphics.PointF;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.StrictMode;
import android.text.TextUtils;
import com.applovin.adview.AppLovinAdView;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.ad.c;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdService;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class AppLovinAdServiceImpl implements AppLovinAdService {

    /* renamed from: a  reason: collision with root package name */
    private final m f7919a;

    /* renamed from: b  reason: collision with root package name */
    private final v f7920b;

    /* renamed from: d  reason: collision with root package name */
    private final Map<com.applovin.impl.sdk.ad.d, b> f7922d;

    /* renamed from: c  reason: collision with root package name */
    private final Handler f7921c = new Handler(Looper.getMainLooper());

    /* renamed from: e  reason: collision with root package name */
    private final Object f7923e = new Object();

    /* renamed from: f  reason: collision with root package name */
    private final Map<String, String> f7924f = new HashMap();

    /* renamed from: g  reason: collision with root package name */
    private final AtomicReference<JSONObject> f7925g = new AtomicReference<>();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class a implements AppLovinAdLoadListener {

        /* renamed from: b  reason: collision with root package name */
        private final b f7935b;

        private a(b bVar) {
            this.f7935b = bVar;
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void adReceived(AppLovinAd appLovinAd) {
            HashSet<AppLovinAdLoadListener> hashSet;
            AppLovinAdImpl appLovinAdImpl = (AppLovinAdImpl) appLovinAd;
            com.applovin.impl.sdk.ad.d adZone = appLovinAdImpl.getAdZone();
            if (!(appLovinAd instanceof com.applovin.impl.sdk.ad.f)) {
                AppLovinAdServiceImpl.this.f7919a.Z().a(appLovinAdImpl);
                appLovinAd = new com.applovin.impl.sdk.ad.f(adZone, AppLovinAdServiceImpl.this.f7919a);
            }
            synchronized (this.f7935b.f7936a) {
                hashSet = new HashSet(this.f7935b.f7938c);
                this.f7935b.f7938c.clear();
                this.f7935b.f7937b = false;
            }
            for (AppLovinAdLoadListener appLovinAdLoadListener : hashSet) {
                AppLovinAdServiceImpl.this.a(appLovinAd, appLovinAdLoadListener);
            }
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void failedToReceiveAd(int i10) {
            HashSet<AppLovinAdLoadListener> hashSet;
            synchronized (this.f7935b.f7936a) {
                hashSet = new HashSet(this.f7935b.f7938c);
                this.f7935b.f7938c.clear();
                this.f7935b.f7937b = false;
            }
            for (AppLovinAdLoadListener appLovinAdLoadListener : hashSet) {
                AppLovinAdServiceImpl.this.a(i10, appLovinAdLoadListener);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        final Object f7936a;

        /* renamed from: b  reason: collision with root package name */
        boolean f7937b;

        /* renamed from: c  reason: collision with root package name */
        final Collection<AppLovinAdLoadListener> f7938c;

        private b() {
            this.f7936a = new Object();
            this.f7938c = new HashSet();
        }

        public String toString() {
            return "AdLoadState{, isWaitingForAd=" + this.f7937b + ", pendingAdListeners=" + this.f7938c + '}';
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AppLovinAdServiceImpl(m mVar) {
        this.f7919a = mVar;
        this.f7920b = mVar.A();
        HashMap hashMap = new HashMap(5);
        this.f7922d = hashMap;
        hashMap.put(com.applovin.impl.sdk.ad.d.g(), new b());
        hashMap.put(com.applovin.impl.sdk.ad.d.h(), new b());
        hashMap.put(com.applovin.impl.sdk.ad.d.i(), new b());
        hashMap.put(com.applovin.impl.sdk.ad.d.j(), new b());
        hashMap.put(com.applovin.impl.sdk.ad.d.k(), new b());
    }

    private Uri a(Uri uri, String str) {
        try {
            return Uri.parse(uri.getQueryParameter(str));
        } catch (Throwable unused) {
            if (v.a()) {
                v A = this.f7919a.A();
                A.d("AppLovinAdService", "Unable to parse query parameter into Uri: " + str);
                return null;
            }
            return null;
        }
    }

    private b a(com.applovin.impl.sdk.ad.d dVar) {
        b bVar;
        synchronized (this.f7923e) {
            bVar = this.f7922d.get(dVar);
            if (bVar == null) {
                bVar = new b();
                this.f7922d.put(dVar, bVar);
            }
        }
        return bVar;
    }

    private String a(String str, long j10, int i10, String str2, boolean z10) {
        try {
            if (StringUtils.isValidString(str)) {
                return Uri.parse(str).buildUpon().appendQueryParameter("et_s", Long.toString(j10)).appendQueryParameter("pv", Integer.toString((i10 < 0 || i10 > 100) ? 0 : 0)).appendQueryParameter("vid_ts", str2).appendQueryParameter("uvs", Boolean.toString(z10)).build().toString();
            }
            return null;
        } catch (Throwable th) {
            if (v.a()) {
                v vVar = this.f7920b;
                vVar.b("AppLovinAdService", "Unknown error parsing the video end url: " + str, th);
            }
            return null;
        }
    }

    private String a(String str, long j10, long j11, List<Long> list, boolean z10, int i10) {
        if (StringUtils.isValidString(str)) {
            Uri.Builder appendQueryParameter = Uri.parse(str).buildUpon().appendQueryParameter("et_ms", Long.toString(j10)).appendQueryParameter("vs_ms", Long.toString(j11));
            if (list != null && list.size() > 0) {
                appendQueryParameter.appendQueryParameter("ec_ms", list.toString());
            }
            if (i10 != h.f8485a) {
                appendQueryParameter.appendQueryParameter("musw_ch", Boolean.toString(z10));
                appendQueryParameter.appendQueryParameter("musw_st", Boolean.toString(h.a(i10)));
            }
            return appendQueryParameter.build().toString();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final int i10, final AppLovinAdLoadListener appLovinAdLoadListener) {
        this.f7921c.post(new Runnable() { // from class: com.applovin.impl.sdk.AppLovinAdServiceImpl.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    appLovinAdLoadListener.failedToReceiveAd(i10);
                } catch (Throwable th) {
                    if (v.a()) {
                        v.c("AppLovinAdService", "Unable to notify listener about ad load failure", th);
                    }
                }
            }
        });
    }

    private void a(Uri uri, com.applovin.impl.sdk.ad.e eVar, AppLovinAdView appLovinAdView, com.applovin.impl.adview.b bVar) {
        if (Utils.openUri(appLovinAdView.getContext(), uri, this.f7919a)) {
            com.applovin.impl.sdk.utils.j.c(bVar.g(), eVar, appLovinAdView);
        }
        bVar.o();
    }

    private void a(Uri uri, com.applovin.impl.sdk.ad.e eVar, AppLovinAdView appLovinAdView, com.applovin.impl.adview.b bVar, Context context, m mVar) {
        if (uri == null || !StringUtils.isValidString(uri.getQuery())) {
            if (v.a()) {
                mVar.A().e("AppLovinAdService", "Failed to execute Deep Link+ command - no query parameters found");
                return;
            }
            return;
        }
        Uri a10 = a(uri, "primaryUrl");
        List<Uri> b10 = b(uri, "primaryTrackingUrl");
        Uri a11 = a(uri, "fallbackUrl");
        List<Uri> b11 = b(uri, "fallbackTrackingUrl");
        if (a10 == null && a11 == null) {
            if (v.a()) {
                mVar.A().e("AppLovinAdService", "Failed to parse both primary and backup URLs for Deep Link+ command");
                return;
            }
            return;
        }
        if (!a(a10, "primary", b10, eVar, appLovinAdView, bVar, context, mVar)) {
            a(a11, "backup", b11, eVar, appLovinAdView, bVar, context, mVar);
        }
        if (bVar != null) {
            bVar.o();
        }
    }

    private void a(Uri uri, com.applovin.impl.sdk.ad.e eVar, com.applovin.impl.adview.b bVar, final com.applovin.impl.adview.activity.b.a aVar) {
        if (v.a(this.f7919a)) {
            v vVar = this.f7920b;
            vVar.b("AppLovinAdService", "Forwarding click " + uri);
        }
        eVar.setMaxAdValue("forwarding_clicked_url", uri.toString());
        String str = this.f7919a.p().getExtraParameters().get("close_ad_on_forwarding_click_scheme");
        if (StringUtils.isValidString(str) && Boolean.parseBoolean(str)) {
            if (aVar != null) {
                this.f7921c.post(new Runnable() { // from class: com.applovin.impl.sdk.AppLovinAdServiceImpl.3
                    @Override // java.lang.Runnable
                    public void run() {
                        if (aVar != null) {
                            if (v.a(AppLovinAdServiceImpl.this.f7919a)) {
                                AppLovinAdServiceImpl.this.f7920b.b("AppLovinAdService", "Dismissing ad after forwarding click");
                            }
                            aVar.h();
                        }
                    }
                });
            } else if (bVar == null || Utils.isBML(eVar.getSize())) {
            } else {
                if (v.a(this.f7919a)) {
                    this.f7920b.b("AppLovinAdService", "Closing ad after forwarding click");
                }
                bVar.l();
            }
        }
    }

    private void a(com.applovin.impl.sdk.ad.d dVar, a aVar) {
        AppLovinAdImpl a10 = this.f7919a.Z().a(dVar);
        if (a10 == null) {
            a(new com.applovin.impl.sdk.e.k(dVar, aVar, this.f7919a));
            return;
        }
        if (v.a()) {
            v vVar = this.f7920b;
            vVar.b("AppLovinAdService", "Using pre-loaded ad: " + a10 + " for " + dVar);
        }
        aVar.adReceived(a10);
    }

    private void a(com.applovin.impl.sdk.ad.d dVar, AppLovinAdLoadListener appLovinAdLoadListener) {
        if (dVar == null) {
            throw new IllegalArgumentException("No zone specified");
        }
        if (appLovinAdLoadListener == null) {
            throw new IllegalArgumentException("No callback specified");
        }
        if (v.a()) {
            v A = this.f7919a.A();
            A.b("AppLovinAdService", "Loading next ad of zone {" + dVar + "}...");
        }
        b a10 = a(dVar);
        synchronized (a10.f7936a) {
            a10.f7938c.add(appLovinAdLoadListener);
            if (!a10.f7937b) {
                a10.f7937b = true;
                a(dVar, new a(a10));
            } else if (v.a()) {
                this.f7920b.b("AppLovinAdService", "Already waiting on an ad load...");
            }
        }
    }

    private void a(com.applovin.impl.sdk.d.a aVar) {
        if (StringUtils.isValidString(aVar.a())) {
            this.f7919a.U().a(com.applovin.impl.sdk.network.h.o().c(aVar.a()).d(StringUtils.isValidString(aVar.b()) ? aVar.b() : null).b(aVar.c()).a(false).c(aVar.d()).a());
        } else if (v.a()) {
            this.f7920b.d("AppLovinAdService", "Requested a postback dispatch for a null URL; nothing to do...");
        }
    }

    private void a(com.applovin.impl.sdk.e.a aVar) {
        if (!this.f7919a.d() && v.a()) {
            v.h("AppLovinSdk", "Attempted to load ad before SDK initialization. Please wait until after the SDK has initialized, e.g. AppLovinSdk.initializeSdk(Context, SdkInitializationListener).");
        }
        this.f7919a.a();
        this.f7919a.S().a(aVar, o.a.MAIN);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final AppLovinAd appLovinAd, final AppLovinAdLoadListener appLovinAdLoadListener) {
        this.f7921c.post(new Runnable() { // from class: com.applovin.impl.sdk.AppLovinAdServiceImpl.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    appLovinAdLoadListener.adReceived(appLovinAd);
                } catch (Throwable th) {
                    if (v.a()) {
                        v.c("AppLovinAdService", "Unable to notify listener about a newly loaded ad", th);
                    }
                }
            }
        });
    }

    private boolean a(Uri uri, String str, List<Uri> list, com.applovin.impl.sdk.ad.e eVar, AppLovinAdView appLovinAdView, com.applovin.impl.adview.b bVar, Context context, m mVar) {
        if (v.a()) {
            v A = mVar.A();
            A.b("AppLovinAdService", "Opening " + str + " URL: " + uri);
        }
        boolean openUri = Utils.openUri(context, uri, mVar);
        boolean a10 = v.a();
        if (openUri) {
            if (a10) {
                v A2 = mVar.A();
                A2.b("AppLovinAdService", "URL opened successfully, dispatching tracking URLs: " + list);
            }
            for (Uri uri2 : list) {
                mVar.X().dispatchPostbackAsync(uri2.toString(), null);
            }
            if (bVar != null) {
                com.applovin.impl.sdk.utils.j.c(bVar.g(), eVar, appLovinAdView);
            }
        } else if (a10) {
            mVar.A().e("AppLovinAdService", "URL failed to open");
        }
        return openUri;
    }

    private boolean a(String str) {
        String str2 = this.f7919a.p().getExtraParameters().get("forwarding_click_scheme");
        return StringUtils.isValidString(str2) && StringUtils.isValidString(str) && str.equalsIgnoreCase(str2);
    }

    private List<Uri> b(Uri uri, String str) {
        List<String> queryParameters = uri.getQueryParameters(str);
        ArrayList arrayList = new ArrayList(queryParameters.size());
        for (String str2 : queryParameters) {
            try {
                arrayList.add(Uri.parse(str2));
            } catch (Throwable unused) {
                if (v.a()) {
                    v A = this.f7919a.A();
                    A.d("AppLovinAdService", "Unable to parse query parameter into Uri: " + str);
                }
            }
        }
        return arrayList;
    }

    public void addCustomQueryParams(Map<String, String> map) {
        synchronized (this.f7924f) {
            this.f7924f.putAll(map);
        }
    }

    public AppLovinAd dequeueAd(com.applovin.impl.sdk.ad.d dVar) {
        AppLovinAdImpl b10 = this.f7919a.Z().b(dVar);
        if (v.a()) {
            v vVar = this.f7920b;
            vVar.b("AppLovinAdService", "Dequeued ad: " + b10 + " for zone: " + dVar + "...");
        }
        return b10;
    }

    public JSONObject getAndResetCustomPostBody() {
        return this.f7925g.getAndSet(null);
    }

    public Map<String, String> getAndResetCustomQueryParams() {
        HashMap hashMap;
        synchronized (this.f7924f) {
            hashMap = new HashMap(this.f7924f);
            this.f7924f.clear();
        }
        return hashMap;
    }

    @Override // com.applovin.sdk.AppLovinAdService
    public String getBidToken() {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        String a10 = this.f7919a.V().a();
        StrictMode.setThreadPolicy(allowThreadDiskReads);
        return a10;
    }

    @Override // com.applovin.sdk.AppLovinAdService
    public void loadNextAd(AppLovinAdSize appLovinAdSize, AppLovinAdLoadListener appLovinAdLoadListener) {
        a(com.applovin.impl.sdk.ad.d.a(appLovinAdSize, AppLovinAdType.REGULAR), appLovinAdLoadListener);
    }

    public void loadNextAd(String str, AppLovinAdSize appLovinAdSize, AppLovinAdLoadListener appLovinAdLoadListener) {
        if (v.a()) {
            v vVar = this.f7920b;
            vVar.b("AppLovinAdService", "Loading next ad of zone {" + str + "} with size " + appLovinAdSize);
        }
        a(com.applovin.impl.sdk.ad.d.a(appLovinAdSize, AppLovinAdType.REGULAR, str), appLovinAdLoadListener);
    }

    @Override // com.applovin.sdk.AppLovinAdService
    public void loadNextAdForAdToken(String str, AppLovinAdLoadListener appLovinAdLoadListener) {
        StringBuilder sb2;
        String str2;
        com.applovin.impl.sdk.e.a pVar;
        String trim = str != null ? str.trim() : null;
        if (TextUtils.isEmpty(trim)) {
            if (v.a()) {
                v.i("AppLovinAdService", "Invalid ad token specified");
            }
            a(-8, appLovinAdLoadListener);
            return;
        }
        com.applovin.impl.sdk.ad.c cVar = new com.applovin.impl.sdk.ad.c(trim, this.f7919a);
        if (cVar.b() == c.a.REGULAR) {
            if (v.a()) {
                v vVar = this.f7920b;
                vVar.b("AppLovinAdService", "Loading next ad for token: " + cVar);
            }
            pVar = new com.applovin.impl.sdk.e.l(cVar, appLovinAdLoadListener, this.f7919a);
        } else if (cVar.b() != c.a.AD_RESPONSE_JSON) {
            if (v.a()) {
                sb2 = new StringBuilder();
                str2 = "Invalid ad token specified: ";
                sb2.append(str2);
                sb2.append(cVar);
                v.i("AppLovinAdService", sb2.toString());
            }
            appLovinAdLoadListener.failedToReceiveAd(-8);
            return;
        } else {
            JSONObject d10 = cVar.d();
            if (d10 == null) {
                if (v.a()) {
                    sb2 = new StringBuilder();
                    str2 = "Unable to retrieve ad response JSON from token: ";
                    sb2.append(str2);
                    sb2.append(cVar);
                    v.i("AppLovinAdService", sb2.toString());
                }
                appLovinAdLoadListener.failedToReceiveAd(-8);
                return;
            }
            com.applovin.impl.sdk.utils.h.f(d10, this.f7919a);
            com.applovin.impl.sdk.utils.h.d(d10, this.f7919a);
            com.applovin.impl.sdk.utils.h.c(d10, this.f7919a);
            com.applovin.impl.sdk.utils.h.e(d10, this.f7919a);
            f.a(this.f7919a);
            if (JsonUtils.getJSONArray(d10, "ads", new JSONArray()).length() <= 0) {
                if (v.a()) {
                    v vVar2 = this.f7920b;
                    vVar2.e("AppLovinAdService", "No ad returned from the server for token: " + cVar);
                }
                appLovinAdLoadListener.failedToReceiveAd(204);
                return;
            }
            if (v.a()) {
                v vVar3 = this.f7920b;
                vVar3.b("AppLovinAdService", "Rendering ad for token: " + cVar);
            }
            pVar = new com.applovin.impl.sdk.e.p(d10, Utils.getZone(d10, this.f7919a), com.applovin.impl.sdk.ad.b.DECODED_AD_TOKEN_JSON, appLovinAdLoadListener, this.f7919a);
        }
        a(pVar);
    }

    @Override // com.applovin.sdk.AppLovinAdService
    public void loadNextAdForZoneId(String str, AppLovinAdLoadListener appLovinAdLoadListener) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("No zone id specified");
        }
        if (v.a()) {
            v vVar = this.f7920b;
            vVar.b("AppLovinAdService", "Loading next ad of zone {" + str + "}");
        }
        a(com.applovin.impl.sdk.ad.d.a(str), appLovinAdLoadListener);
    }

    @Override // com.applovin.sdk.AppLovinAdService
    public void loadNextAdForZoneIds(List<String> list, AppLovinAdLoadListener appLovinAdLoadListener) {
        List<String> removeTrimmedEmptyStrings = CollectionUtils.removeTrimmedEmptyStrings(list);
        if (removeTrimmedEmptyStrings == null || removeTrimmedEmptyStrings.isEmpty()) {
            if (v.a()) {
                v.i("AppLovinAdService", "No zones were provided");
            }
            a(-7, appLovinAdLoadListener);
            return;
        }
        if (v.a()) {
            v vVar = this.f7920b;
            vVar.b("AppLovinAdService", "Loading next ad for zones: " + removeTrimmedEmptyStrings);
        }
        a(new com.applovin.impl.sdk.e.j(removeTrimmedEmptyStrings, appLovinAdLoadListener, this.f7919a));
    }

    public void loadNextIncentivizedAd(String str, AppLovinAdLoadListener appLovinAdLoadListener) {
        if (v.a()) {
            v vVar = this.f7920b;
            vVar.b("AppLovinAdService", "Loading next incentivized ad of zone {" + str + "}");
        }
        a(com.applovin.impl.sdk.ad.d.b(str), appLovinAdLoadListener);
    }

    public void maybeSubmitPersistentPostbacks(List<com.applovin.impl.sdk.d.a> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (com.applovin.impl.sdk.d.a aVar : list) {
            a(aVar);
        }
    }

    public void setCustomPostBody(JSONObject jSONObject) {
        this.f7925g.set(jSONObject);
    }

    public String toString() {
        return "AppLovinAdService{adLoadStates=" + this.f7922d + '}';
    }

    public void trackAndLaunchClick(com.applovin.impl.sdk.ad.e eVar, AppLovinAdView appLovinAdView, com.applovin.impl.adview.b bVar, Uri uri, PointF pointF, boolean z10) {
        if (eVar == null) {
            if (v.a()) {
                this.f7920b.e("AppLovinAdService", "Unable to track ad view click. No ad specified");
                return;
            }
            return;
        }
        if (v.a()) {
            this.f7920b.b("AppLovinAdService", "Tracking click on an ad...");
        }
        maybeSubmitPersistentPostbacks(eVar.a(pointF, z10));
        if (appLovinAdView == null || uri == null) {
            if (v.a()) {
                this.f7920b.e("AppLovinAdService", "Unable to launch click - adView has been prematurely destroyed");
            }
        } else if (a(uri.getScheme())) {
            a(uri, eVar, bVar, (com.applovin.impl.adview.activity.b.a) null);
        } else if (Utils.isDeepLinkPlusUrl(uri)) {
            a(uri, eVar, appLovinAdView, bVar, appLovinAdView.getContext(), this.f7919a);
        } else {
            a(uri, eVar, appLovinAdView, bVar);
        }
    }

    public void trackAndLaunchVideoClick(com.applovin.impl.sdk.ad.e eVar, Uri uri, PointF pointF, com.applovin.impl.adview.activity.b.a aVar, Context context) {
        if (eVar == null) {
            if (v.a()) {
                this.f7920b.e("AppLovinAdService", "Unable to track video click. No ad specified");
                return;
            }
            return;
        }
        if (v.a()) {
            this.f7920b.b("AppLovinAdService", "Tracking VIDEO click on an ad...");
        }
        maybeSubmitPersistentPostbacks(eVar.a(pointF));
        if (a(uri.getScheme())) {
            a(uri, eVar, (com.applovin.impl.adview.b) null, aVar);
        } else if (Utils.isDeepLinkPlusUrl(uri)) {
            a(uri, eVar, (AppLovinAdView) null, (com.applovin.impl.adview.b) null, context, this.f7919a);
        } else {
            Utils.openUri(context, uri, this.f7919a);
        }
    }

    public void trackAppKilled(com.applovin.impl.sdk.ad.e eVar) {
        if (eVar == null) {
            if (v.a()) {
                this.f7920b.e("AppLovinAdService", "Unable to track app killed. No ad specified");
                return;
            }
            return;
        }
        if (v.a()) {
            this.f7920b.b("AppLovinAdService", "Tracking app killed during ad...");
        }
        List<com.applovin.impl.sdk.d.a> as = eVar.as();
        if (as != null && !as.isEmpty()) {
            for (com.applovin.impl.sdk.d.a aVar : as) {
                a(new com.applovin.impl.sdk.d.a(aVar.a(), aVar.b()));
            }
        } else if (v.a()) {
            v vVar = this.f7920b;
            vVar.d("AppLovinAdService", "Unable to track app killed during AD #" + eVar.getAdIdNumber() + ". Missing app killed tracking URL.");
        }
    }

    public void trackFullScreenAdClosed(com.applovin.impl.sdk.ad.e eVar, long j10, List<Long> list, long j11, boolean z10, int i10) {
        boolean a10 = v.a();
        if (eVar == null) {
            if (a10) {
                this.f7920b.e("AppLovinAdService", "Unable to track ad closed. No ad specified.");
                return;
            }
            return;
        }
        if (a10) {
            this.f7920b.b("AppLovinAdService", "Tracking ad closed...");
        }
        List<com.applovin.impl.sdk.d.a> ar = eVar.ar();
        if (ar == null || ar.isEmpty()) {
            if (v.a()) {
                v vVar = this.f7920b;
                vVar.d("AppLovinAdService", "Unable to track ad closed for AD #" + eVar.getAdIdNumber() + ". Missing ad close tracking URL." + eVar.getAdIdNumber());
                return;
            }
            return;
        }
        for (com.applovin.impl.sdk.d.a aVar : ar) {
            String a11 = a(aVar.a(), j10, j11, list, z10, i10);
            String a12 = a(aVar.b(), j10, j11, list, z10, i10);
            if (StringUtils.isValidString(a11)) {
                a(new com.applovin.impl.sdk.d.a(a11, a12));
            } else if (v.a()) {
                v vVar2 = this.f7920b;
                vVar2.e("AppLovinAdService", "Failed to parse url: " + aVar.a());
            }
        }
    }

    public void trackImpression(com.applovin.impl.sdk.ad.e eVar) {
        if (eVar == null) {
            if (v.a()) {
                this.f7920b.e("AppLovinAdService", "Unable to track impression click. No ad specified");
                return;
            }
            return;
        }
        if (v.a()) {
            this.f7920b.b("AppLovinAdService", "Tracking impression on ad...");
        }
        maybeSubmitPersistentPostbacks(eVar.at());
    }

    public void trackVideoEnd(com.applovin.impl.sdk.ad.e eVar, long j10, int i10, boolean z10) {
        boolean a10 = v.a();
        if (eVar == null) {
            if (a10) {
                this.f7920b.e("AppLovinAdService", "Unable to track video end. No ad specified");
                return;
            }
            return;
        }
        if (a10) {
            this.f7920b.b("AppLovinAdService", "Tracking video end on ad...");
        }
        List<com.applovin.impl.sdk.d.a> aq = eVar.aq();
        if (aq == null || aq.isEmpty()) {
            if (v.a()) {
                v vVar = this.f7920b;
                vVar.d("AppLovinAdService", "Unable to submit persistent postback for AD #" + eVar.getAdIdNumber() + ". Missing video end tracking URL.");
                return;
            }
            return;
        }
        String l10 = Long.toString(System.currentTimeMillis());
        for (com.applovin.impl.sdk.d.a aVar : aq) {
            if (StringUtils.isValidString(aVar.a())) {
                String a11 = a(aVar.a(), j10, i10, l10, z10);
                String a12 = a(aVar.b(), j10, i10, l10, z10);
                if (a11 != null) {
                    a(new com.applovin.impl.sdk.d.a(a11, a12));
                } else if (v.a()) {
                    v vVar2 = this.f7920b;
                    vVar2.e("AppLovinAdService", "Failed to parse url: " + aVar.a());
                }
            } else if (v.a()) {
                this.f7920b.d("AppLovinAdService", "Requested a postback dispatch for an empty video end URL; nothing to do...");
            }
        }
    }
}
