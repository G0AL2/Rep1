package com.applovin.impl.mediation.c;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import com.applovin.impl.mediation.MaxAdWaterfallInfoImpl;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.mediation.MaxMediatedNetworkInfoImpl;
import com.applovin.impl.mediation.MaxNetworkResponseInfoImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.sdk.m;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.utils.j;
import com.applovin.impl.sdk.v;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxNetworkResponseInfo;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class e extends com.applovin.impl.sdk.e.a {

    /* renamed from: a  reason: collision with root package name */
    private static final AtomicBoolean f7396a = new AtomicBoolean();

    /* renamed from: c  reason: collision with root package name */
    private final String f7397c;

    /* renamed from: d  reason: collision with root package name */
    private final MaxAdFormat f7398d;

    /* renamed from: e  reason: collision with root package name */
    private final JSONObject f7399e;

    /* renamed from: f  reason: collision with root package name */
    private final List<com.applovin.impl.mediation.a.a> f7400f;

    /* renamed from: g  reason: collision with root package name */
    private final a.InterfaceC0115a f7401g;

    /* renamed from: h  reason: collision with root package name */
    private final WeakReference<Context> f7402h;

    /* renamed from: i  reason: collision with root package name */
    private long f7403i;

    /* renamed from: j  reason: collision with root package name */
    private final List<MaxNetworkResponseInfo> f7404j;

    /* loaded from: classes.dex */
    private class a extends com.applovin.impl.sdk.e.a {

        /* renamed from: c  reason: collision with root package name */
        private final long f7409c;

        /* renamed from: d  reason: collision with root package name */
        private final int f7410d;

        /* renamed from: e  reason: collision with root package name */
        private final com.applovin.impl.mediation.a.a f7411e;

        /* renamed from: f  reason: collision with root package name */
        private final List<com.applovin.impl.mediation.a.a> f7412f;

        a(int i10, List<com.applovin.impl.mediation.a.a> list) {
            super(e.this.e(), e.this.f8349b);
            this.f7409c = SystemClock.elapsedRealtime();
            this.f7410d = i10;
            this.f7411e = list.get(i10);
            this.f7412f = list;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(com.applovin.impl.mediation.a.a aVar, MaxNetworkResponseInfo.AdLoadState adLoadState, long j10, MaxError maxError) {
            e.this.f7404j.add(new MaxNetworkResponseInfoImpl(adLoadState, aVar.h(), new MaxMediatedNetworkInfoImpl(com.applovin.impl.mediation.d.c.a(aVar.K(), this.f8349b)), j10, maxError));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void e(String str) {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (v.a()) {
                a("Loading ad " + (this.f7410d + 1) + " of " + this.f7412f.size() + ": " + this.f7411e.L());
            }
            e("started to load ad");
            Context context = (Context) e.this.f7402h.get();
            this.f8349b.E().loadThirdPartyMediatedAd(e.this.f7397c, this.f7411e, context instanceof Activity ? (Activity) context : this.f8349b.an(), new com.applovin.impl.mediation.d.a(e.this.f7401g) { // from class: com.applovin.impl.mediation.c.e.a.1
                @Override // com.applovin.impl.mediation.d.a, com.applovin.mediation.MaxAdListener
                public void onAdLoadFailed(String str, MaxError maxError) {
                    long elapsedRealtime = SystemClock.elapsedRealtime() - a.this.f7409c;
                    if (v.a()) {
                        a aVar = a.this;
                        aVar.a("Ad failed to load in " + elapsedRealtime + " ms with error: " + maxError);
                    }
                    if (v.a()) {
                        a aVar2 = a.this;
                        aVar2.e("failed to load ad: " + maxError.getCode());
                    }
                    a aVar3 = a.this;
                    aVar3.a(aVar3.f7411e, MaxNetworkResponseInfo.AdLoadState.FAILED_TO_LOAD, elapsedRealtime, maxError);
                    if (a.this.f7410d >= a.this.f7412f.size() - 1) {
                        e.this.a(new MaxErrorImpl(-5001, "MAX returned eligible ads from mediated networks, but all ads failed to load. Inspect getWaterfall() for more info."));
                        return;
                    }
                    a aVar4 = a.this;
                    ((com.applovin.impl.sdk.e.a) a.this).f8349b.S().a(new a(aVar4.f7410d + 1, a.this.f7412f), com.applovin.impl.mediation.d.c.a(e.this.f7398d));
                }

                @Override // com.applovin.impl.mediation.d.a, com.applovin.mediation.MaxAdListener
                public void onAdLoaded(MaxAd maxAd) {
                    a.this.e("loaded ad");
                    long elapsedRealtime = SystemClock.elapsedRealtime() - a.this.f7409c;
                    if (v.a()) {
                        a aVar = a.this;
                        aVar.a("Ad loaded in " + elapsedRealtime + "ms");
                    }
                    com.applovin.impl.mediation.a.a aVar2 = (com.applovin.impl.mediation.a.a) maxAd;
                    a.this.a(aVar2, MaxNetworkResponseInfo.AdLoadState.AD_LOADED, elapsedRealtime, null);
                    int i10 = a.this.f7410d;
                    while (true) {
                        i10++;
                        if (i10 >= a.this.f7412f.size()) {
                            e.this.a(aVar2);
                            return;
                        } else {
                            a aVar3 = a.this;
                            aVar3.a((com.applovin.impl.mediation.a.a) aVar3.f7412f.get(i10), MaxNetworkResponseInfo.AdLoadState.AD_LOAD_NOT_ATTEMPTED, -1L, null);
                        }
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(String str, MaxAdFormat maxAdFormat, Map<String, Object> map, JSONObject jSONObject, Context context, m mVar, a.InterfaceC0115a interfaceC0115a) {
        super("TaskProcessMediationWaterfall:" + str + ":" + maxAdFormat.getLabel(), mVar);
        this.f7397c = str;
        this.f7398d = maxAdFormat;
        this.f7399e = jSONObject;
        this.f7401g = interfaceC0115a;
        this.f7402h = new WeakReference<>(context);
        this.f7400f = new ArrayList(jSONObject.length());
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "ads", new JSONArray());
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            this.f7400f.add(com.applovin.impl.mediation.a.a.a(map, JsonUtils.getJSONObject(jSONArray, i10, (JSONObject) null), jSONObject, mVar));
        }
        this.f7404j = new ArrayList(this.f7400f.size());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.applovin.impl.mediation.a.a aVar) {
        this.f8349b.F().a(aVar);
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f7403i;
        if (v.a()) {
            b("Waterfall loaded in " + elapsedRealtime + "ms for " + aVar.L());
        }
        aVar.a(new MaxAdWaterfallInfoImpl(aVar, elapsedRealtime, this.f7404j));
        j.a((MaxAdListener) this.f7401g, (MaxAd) aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(MaxError maxError) {
        com.applovin.impl.sdk.d.g T;
        com.applovin.impl.sdk.d.f fVar;
        if (maxError.getCode() == 204) {
            T = this.f8349b.T();
            fVar = com.applovin.impl.sdk.d.f.f8333p;
        } else if (maxError.getCode() == -5001) {
            T = this.f8349b.T();
            fVar = com.applovin.impl.sdk.d.f.f8334q;
        } else {
            T = this.f8349b.T();
            fVar = com.applovin.impl.sdk.d.f.f8335r;
        }
        T.a(fVar);
        ArrayList arrayList = new ArrayList(this.f7404j.size());
        for (MaxNetworkResponseInfo maxNetworkResponseInfo : this.f7404j) {
            if (maxNetworkResponseInfo.getAdLoadState() == MaxNetworkResponseInfo.AdLoadState.FAILED_TO_LOAD) {
                arrayList.add(maxNetworkResponseInfo);
            }
        }
        if (arrayList.size() > 0) {
            StringBuilder sb2 = new StringBuilder("======FAILED AD LOADS======");
            sb2.append("\n");
            int i10 = 0;
            while (i10 < arrayList.size()) {
                MaxNetworkResponseInfo maxNetworkResponseInfo2 = (MaxNetworkResponseInfo) arrayList.get(i10);
                i10++;
                sb2.append(i10);
                sb2.append(") ");
                sb2.append(maxNetworkResponseInfo2.getMediatedNetwork().getName());
                sb2.append("\n");
                sb2.append("..code: ");
                sb2.append(maxNetworkResponseInfo2.getError().getCode());
                sb2.append("\n");
                sb2.append("..message: ");
                sb2.append(maxNetworkResponseInfo2.getError().getMessage());
                sb2.append("\n");
            }
            ((MaxErrorImpl) maxError).setAdLoadFailureInfo(sb2.toString());
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f7403i;
        if (v.a()) {
            b("Waterfall failed in " + elapsedRealtime + "ms with error: " + maxError);
        }
        ((MaxErrorImpl) maxError).setWaterfall(new MaxAdWaterfallInfoImpl(null, JsonUtils.getString(this.f7399e, "waterfall_name", ""), JsonUtils.getString(this.f7399e, "waterfall_test_name", ""), elapsedRealtime, this.f7404j));
        j.a(this.f7401g, this.f7397c, maxError);
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f7403i = SystemClock.elapsedRealtime();
        if (this.f7399e.optBoolean("is_testing", false) && !this.f8349b.J().a() && f7396a.compareAndSet(false, true)) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.mediation.c.e.1
                @Override // java.lang.Runnable
                public void run() {
                    Utils.showAlert("MAX SDK Not Initialized In Test Mode", "Test ads may not load. Please force close and restart the app if you experience issues.", ((com.applovin.impl.sdk.e.a) e.this).f8349b.an());
                }
            });
        }
        if (this.f7400f.size() > 0) {
            if (v.a()) {
                a("Starting waterfall for " + this.f7400f.size() + " ad(s)...");
            }
            this.f8349b.S().a((com.applovin.impl.sdk.e.a) new a(0, this.f7400f));
            return;
        }
        if (v.a()) {
            c("No ads were returned from the server");
        }
        Utils.maybeHandleNoFillResponseForPublisher(this.f7397c, this.f7398d, this.f7399e, this.f8349b);
        JSONObject jSONObject = JsonUtils.getJSONObject(this.f7399e, "settings", new JSONObject());
        long j10 = JsonUtils.getLong(jSONObject, "alfdcs", 0L);
        final MaxErrorImpl maxErrorImpl = new MaxErrorImpl(204, "MAX returned no eligible ads from any mediated networks for this app/device.");
        if (j10 <= 0) {
            a(maxErrorImpl);
            return;
        }
        long millis = TimeUnit.SECONDS.toMillis(j10);
        Runnable runnable = new Runnable() { // from class: com.applovin.impl.mediation.c.e.2
            @Override // java.lang.Runnable
            public void run() {
                e.this.a(maxErrorImpl);
            }
        };
        if (JsonUtils.getBoolean(jSONObject, "alfdcs_iba", Boolean.FALSE).booleanValue()) {
            com.applovin.impl.sdk.utils.e.a(millis, this.f8349b, runnable);
        } else {
            AppLovinSdkUtils.runOnUiThreadDelayed(runnable, millis);
        }
    }
}
