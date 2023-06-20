package com.ironsource.sdk.d;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.ironsource.mediationsdk.impressionData.ImpressionData;
import com.ironsource.sdk.controller.FeaturesManager;
import com.ironsource.sdk.g.d;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sdk.utils.SDKUtils;
import com.vehiclecloud.app.videofetch.rnads.api.RNAdsEvents;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class b implements com.ironsource.sdk.d.c, com.ironsource.sdk.e, com.ironsource.sdk.f, com.ironsource.sdk.j.a.a, com.ironsource.sdk.j.a.b, com.ironsource.sdk.j.a.c, com.ironsource.sdk.j.a.d {

    /* renamed from: j  reason: collision with root package name */
    private static b f28043j;

    /* renamed from: a  reason: collision with root package name */
    public com.ironsource.sdk.controller.g f28044a;

    /* renamed from: b  reason: collision with root package name */
    com.ironsource.sdk.j.e f28045b;

    /* renamed from: c  reason: collision with root package name */
    String f28046c;

    /* renamed from: d  reason: collision with root package name */
    String f28047d;

    /* renamed from: e  reason: collision with root package name */
    com.ironsource.sdk.controller.j f28048e;

    /* renamed from: f  reason: collision with root package name */
    private com.ironsource.sdk.service.d f28049f;

    /* renamed from: g  reason: collision with root package name */
    private com.ironsource.sdk.service.c f28050g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f28051h = false;

    /* renamed from: i  reason: collision with root package name */
    private com.ironsource.sdk.controller.c f28052i;

    /* loaded from: classes3.dex */
    final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private /* synthetic */ Map f28053a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ com.ironsource.sdk.j.e f28054b;

        a(Map map, com.ironsource.sdk.j.e eVar) {
            this.f28053a = map;
            this.f28054b = eVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            b bVar = b.this;
            bVar.f28044a.a(bVar.f28046c, bVar.f28047d, this.f28053a, this.f28054b);
        }
    }

    /* renamed from: com.ironsource.sdk.d.b$b  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    final class RunnableC0350b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private /* synthetic */ Map f28056a;

        RunnableC0350b(Map map) {
            this.f28056a = map;
        }

        @Override // java.lang.Runnable
        public final void run() {
            b bVar = b.this;
            bVar.f28044a.a(this.f28056a, bVar.f28045b);
        }
    }

    /* loaded from: classes3.dex */
    final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private /* synthetic */ String f28058a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ String f28059b;

        /* renamed from: c  reason: collision with root package name */
        private /* synthetic */ com.ironsource.sdk.j.e f28060c;

        c(String str, String str2, com.ironsource.sdk.j.e eVar) {
            this.f28058a = str;
            this.f28059b = str2;
            this.f28060c = eVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            b.this.f28044a.a(this.f28058a, this.f28059b, this.f28060c);
        }
    }

    /* loaded from: classes3.dex */
    final class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private /* synthetic */ com.ironsource.sdk.j.e f28062a;

        d(com.ironsource.sdk.j.e eVar) {
            this.f28062a = eVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            b bVar = b.this;
            bVar.f28044a.a(bVar.f28046c, bVar.f28047d, this.f28062a);
        }
    }

    /* loaded from: classes3.dex */
    final class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private /* synthetic */ String f28064a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ String f28065b;

        /* renamed from: c  reason: collision with root package name */
        private /* synthetic */ com.ironsource.sdk.g.c f28066c;

        e(String str, String str2, com.ironsource.sdk.g.c cVar) {
            this.f28064a = str;
            this.f28065b = str2;
            this.f28066c = cVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            b bVar = b.this;
            bVar.f28044a.a(this.f28064a, this.f28065b, this.f28066c, (com.ironsource.sdk.j.a.c) bVar);
        }
    }

    /* loaded from: classes3.dex */
    final class f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private /* synthetic */ String f28068a;

        f(String str) {
            this.f28068a = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            b bVar = b.this;
            bVar.f28044a.a(this.f28068a, bVar);
        }
    }

    /* loaded from: classes3.dex */
    final class g implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private /* synthetic */ String f28070a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ String f28071b;

        /* renamed from: c  reason: collision with root package name */
        private /* synthetic */ com.ironsource.sdk.g.c f28072c;

        g(String str, String str2, com.ironsource.sdk.g.c cVar) {
            this.f28070a = str;
            this.f28071b = str2;
            this.f28072c = cVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            b bVar = b.this;
            bVar.f28044a.a(this.f28070a, this.f28071b, this.f28072c, (com.ironsource.sdk.j.a.d) bVar);
        }
    }

    /* loaded from: classes3.dex */
    final class h implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private /* synthetic */ JSONObject f28074a;

        h(JSONObject jSONObject) {
            this.f28074a = jSONObject;
        }

        @Override // java.lang.Runnable
        public final void run() {
            b bVar = b.this;
            bVar.f28044a.a(this.f28074a, (com.ironsource.sdk.j.a.c) bVar);
        }
    }

    /* loaded from: classes3.dex */
    final class i implements Runnable {
        i() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            b.this.f28044a.d();
        }
    }

    /* loaded from: classes3.dex */
    final class j implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private /* synthetic */ JSONObject f28077a;

        j(JSONObject jSONObject) {
            this.f28077a = jSONObject;
        }

        @Override // java.lang.Runnable
        public final void run() {
            b.this.f28044a.a(this.f28077a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public final class k implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private /* synthetic */ com.ironsource.sdk.b f28079a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Map f28080b;

        k(com.ironsource.sdk.b bVar, Map map) {
            this.f28079a = bVar;
            this.f28080b = map;
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.ironsource.sdk.g.c a10 = b.this.f28048e.a(d.e.Interstitial, this.f28079a.f27607b);
            if (a10 != null) {
                b bVar = b.this;
                bVar.f28044a.a(a10, this.f28080b, (com.ironsource.sdk.j.a.c) bVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public final class l implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private /* synthetic */ com.ironsource.sdk.b f28082a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Map f28083b;

        l(com.ironsource.sdk.b bVar, Map map) {
            this.f28082a = bVar;
            this.f28083b = map;
        }

        @Override // java.lang.Runnable
        public final void run() {
            d.e eVar = this.f28082a.a() ? d.e.Banner : d.e.Interstitial;
            com.ironsource.sdk.controller.j jVar = b.this.f28048e;
            com.ironsource.sdk.b bVar = this.f28082a;
            String str = bVar.f27607b;
            String str2 = bVar.f27608c;
            HashMap hashMap = new HashMap();
            hashMap.put(ImpressionData.IMPRESSION_DATA_KEY_INSTANCE_ID, bVar.f27607b);
            hashMap.put(ImpressionData.IMPRESSION_DATA_KEY_INSTANCE_NAME, bVar.f27608c);
            hashMap.put(RNAdsEvents.EVENT_REWARDED, Boolean.toString(bVar.f27606a));
            hashMap.put("inAppBidding", Boolean.toString(bVar.f27609d));
            hashMap.put("apiVersion", "2");
            com.ironsource.sdk.a aVar = bVar.f27610e;
            hashMap.put("width", aVar != null ? Integer.toString(aVar.f27572a) : "0");
            com.ironsource.sdk.a aVar2 = bVar.f27610e;
            hashMap.put("height", aVar2 != null ? Integer.toString(aVar2.f27573b) : "0");
            com.ironsource.sdk.a aVar3 = bVar.f27610e;
            hashMap.put("label", aVar3 != null ? aVar3.f27574c : "");
            hashMap.put("isBanner", Boolean.toString(bVar.a()));
            Map<String, String> map = bVar.f27611f;
            if (map != null) {
                hashMap.putAll(map);
            }
            com.ironsource.sdk.g.c cVar = new com.ironsource.sdk.g.c(str, str2, hashMap, bVar.f27612g);
            jVar.a(eVar, str, cVar);
            com.ironsource.sdk.a.a aVar4 = new com.ironsource.sdk.a.a();
            com.ironsource.sdk.a.a a10 = aVar4.a("isbiddinginstance", Boolean.valueOf(this.f28082a.f27609d)).a("demandsourcename", this.f28082a.f27608c).a("producttype", com.ironsource.sdk.d.a(this.f28082a));
            com.ironsource.sdk.service.a aVar5 = com.ironsource.sdk.service.a.f28229a;
            a10.a("custom_c", Long.valueOf(com.ironsource.sdk.service.a.c(this.f28082a.f27607b)));
            com.ironsource.sdk.a.d.a(com.ironsource.sdk.a.f.f27589g, aVar4.f27575a);
            if (eVar == d.e.Banner) {
                b bVar2 = b.this;
                bVar2.f28044a.a(bVar2.f28046c, bVar2.f28047d, cVar, (com.ironsource.sdk.j.a.b) bVar2);
                this.f28082a.f27613h = true;
                b bVar3 = b.this;
                bVar3.f28044a.a(cVar, this.f28083b, (com.ironsource.sdk.j.a.b) bVar3);
                return;
            }
            b bVar4 = b.this;
            bVar4.f28044a.a(bVar4.f28046c, bVar4.f28047d, cVar, (com.ironsource.sdk.j.a.c) bVar4);
            this.f28082a.f27613h = true;
            b bVar5 = b.this;
            bVar5.f28044a.a(cVar, this.f28083b, (com.ironsource.sdk.j.a.c) bVar5);
        }
    }

    /* loaded from: classes3.dex */
    final class m implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private /* synthetic */ com.ironsource.sdk.g.c f28085a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Map f28086b;

        m(com.ironsource.sdk.g.c cVar, Map map) {
            this.f28085a = cVar;
            this.f28086b = map;
        }

        @Override // java.lang.Runnable
        public final void run() {
            b bVar = b.this;
            bVar.f28044a.b(this.f28085a, this.f28086b, bVar);
        }
    }

    /* loaded from: classes3.dex */
    final class n implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private /* synthetic */ JSONObject f28088a;

        n(JSONObject jSONObject) {
            this.f28088a = jSONObject;
        }

        @Override // java.lang.Runnable
        public final void run() {
            b bVar = b.this;
            bVar.f28044a.a(this.f28088a, (com.ironsource.sdk.j.a.d) bVar);
        }
    }

    /* loaded from: classes3.dex */
    final class o implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private /* synthetic */ String f28090a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ String f28091b;

        /* renamed from: c  reason: collision with root package name */
        private /* synthetic */ Map f28092c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ com.ironsource.sdk.j.e f28093d;

        o(String str, String str2, Map map, com.ironsource.sdk.j.e eVar) {
            this.f28090a = str;
            this.f28091b = str2;
            this.f28092c = map;
            this.f28093d = eVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            b.this.f28044a.a(this.f28090a, this.f28091b, this.f28092c, this.f28093d);
        }
    }

    private b(Context context) {
        e(context);
    }

    private b(String str, String str2, Context context) {
        this.f28046c = str;
        this.f28047d = str2;
        e(context);
    }

    public static synchronized b a(Context context) {
        b a10;
        synchronized (b.class) {
            a10 = a(context, 0);
        }
        return a10;
    }

    public static synchronized b a(Context context, int i10) {
        b bVar;
        synchronized (b.class) {
            Logger.i("IronSourceAdsPublisherAgent", "getInstance()");
            if (f28043j == null) {
                f28043j = new b(context);
            }
            bVar = f28043j;
        }
        return bVar;
    }

    public static synchronized com.ironsource.sdk.e a(String str, String str2, Context context) {
        b bVar;
        synchronized (b.class) {
            if (f28043j == null) {
                com.ironsource.sdk.a.d.a(com.ironsource.sdk.a.f.f27583a);
                f28043j = new b(str, str2, context);
            } else {
                com.ironsource.sdk.service.d.a().b(str);
                com.ironsource.sdk.service.d.a().a(str2);
            }
            bVar = f28043j;
        }
        return bVar;
    }

    private static com.ironsource.sdk.j.f b(com.ironsource.sdk.g.c cVar) {
        if (cVar == null) {
            return null;
        }
        return (com.ironsource.sdk.j.f) cVar.f28148g;
    }

    private void c(Context context, JSONObject jSONObject) {
        boolean optBoolean = jSONObject.optBoolean("enableLifeCycleListeners", false);
        this.f28051h = optBoolean;
        if (optBoolean) {
            try {
                ((Application) context).registerActivityLifecycleCallbacks(new com.ironsource.sdk.d.a(this));
            } catch (Throwable th) {
                com.ironsource.sdk.a.a aVar = new com.ironsource.sdk.a.a();
                aVar.a("generalmessage", th.getMessage());
                com.ironsource.sdk.a.d.a(com.ironsource.sdk.a.f.f27599q, aVar.f27575a);
            }
        }
    }

    private static com.ironsource.sdk.j.c d(com.ironsource.sdk.g.c cVar) {
        if (cVar == null) {
            return null;
        }
        return (com.ironsource.sdk.j.c) cVar.f28148g;
    }

    private void e(Context context) {
        try {
            JSONObject networkConfiguration = SDKUtils.getNetworkConfiguration();
            com.ironsource.sdk.utils.b.a(context);
            IronSourceStorageUtils.initializeCacheDirectory(context, new com.ironsource.sdk.h.e(SDKUtils.getNetworkConfiguration().optJSONObject("storage")));
            com.ironsource.sdk.utils.b.a().a(SDKUtils.getSDKVersion());
            this.f28049f = h(context);
            this.f28048e = new com.ironsource.sdk.controller.j();
            com.ironsource.sdk.controller.c cVar = new com.ironsource.sdk.controller.c();
            this.f28052i = cVar;
            if (context instanceof Activity) {
                cVar.a((Activity) context);
            }
            this.f28044a = new com.ironsource.sdk.controller.g(context, this.f28052i, this.f28049f, this.f28048e, com.ironsource.environment.e.a.f26152a);
            Logger.enableLogging(FeaturesManager.getInstance().getDebugMode());
            Logger.i("IronSourceAdsPublisherAgent", "C'tor");
            c(context, networkConfiguration);
            this.f28050g = new com.ironsource.sdk.service.c();
            com.ironsource.mediationsdk.adunit.a.a.a("sdkv", "5.116");
            this.f28050g.a();
            this.f28050g.a(context);
            this.f28050g.b();
            this.f28050g.c();
            this.f28050g.b(context);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private void f(com.ironsource.sdk.b bVar, Map<String, String> map) {
        if (bVar.f27613h) {
            i(bVar, map);
        } else {
            k(bVar, map);
        }
    }

    private static com.ironsource.sdk.j.b g(com.ironsource.sdk.g.c cVar) {
        if (cVar == null) {
            return null;
        }
        return (com.ironsource.sdk.j.b) cVar.f28148g;
    }

    private com.ironsource.sdk.service.d h(Context context) {
        com.ironsource.sdk.service.d a10 = com.ironsource.sdk.service.d.a();
        a10.b();
        a10.a(context, this.f28046c, this.f28047d);
        return a10;
    }

    private void i(com.ironsource.sdk.b bVar, Map<String, String> map) {
        Logger.d("IronSourceAdsPublisherAgent", "loadOnInitializedInstance " + bVar.f27607b);
        this.f28044a.a(new k(bVar, map));
    }

    private com.ironsource.sdk.g.c j(d.e eVar, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.f28048e.a(eVar, str);
    }

    private void k(com.ironsource.sdk.b bVar, Map<String, String> map) {
        Logger.d("IronSourceAdsPublisherAgent", "loadOnNewInstance " + bVar.f27607b);
        this.f28044a.a(new l(bVar, map));
    }

    @Override // com.ironsource.sdk.e
    public final void a() {
        this.f28044a.a(new i());
    }

    @Override // com.ironsource.sdk.e
    public final void a(Activity activity) {
        try {
            Logger.i("IronSourceAdsPublisherAgent", "release()");
            com.ironsource.sdk.utils.a.a();
            this.f28052i.b();
            this.f28044a.b(activity);
            this.f28044a.destroy();
            this.f28044a = null;
        } catch (Exception unused) {
        }
        f28043j = null;
    }

    @Override // com.ironsource.sdk.e
    public final void a(Activity activity, com.ironsource.sdk.b bVar, Map<String, String> map) {
        this.f28052i.a(activity);
        long currentTimeMillis = System.currentTimeMillis();
        map.put("loadStartTime", String.valueOf(currentTimeMillis));
        com.ironsource.sdk.service.a aVar = com.ironsource.sdk.service.a.f28229a;
        com.ironsource.sdk.service.a.a(bVar.f27607b, currentTimeMillis);
        com.ironsource.sdk.a.a aVar2 = new com.ironsource.sdk.a.a();
        aVar2.a("isbiddinginstance", Boolean.valueOf(bVar.f27609d)).a("demandsourcename", bVar.f27608c).a("producttype", com.ironsource.sdk.d.a(bVar)).a("custom_c", Long.valueOf(currentTimeMillis));
        com.ironsource.sdk.a.d.a(com.ironsource.sdk.a.f.f27587e, aVar2.f27575a);
        Logger.d("IronSourceAdsPublisherAgent", "loadAd " + bVar.f27607b);
        if (!bVar.f27609d) {
            f(bVar, map);
            return;
        }
        try {
            map.put("adm", SDKUtils.decodeString(map.get("adm")));
        } catch (Exception e10) {
            com.ironsource.sdk.a.a a10 = new com.ironsource.sdk.a.a().a("callfailreason", e10.getMessage()).a("generalmessage", bVar.f27613h ? com.ironsource.sdk.f.b.f28118a : com.ironsource.sdk.f.b.f28119b).a("isbiddinginstance", Boolean.valueOf(bVar.f27609d)).a("demandsourcename", bVar.f27608c).a("producttype", com.ironsource.sdk.d.a(bVar));
            com.ironsource.sdk.service.a aVar3 = com.ironsource.sdk.service.a.f28229a;
            com.ironsource.sdk.a.a a11 = a10.a("custom_c", Long.valueOf(com.ironsource.sdk.service.a.c(bVar.f27607b)));
            com.ironsource.sdk.service.a.b(bVar.f27607b);
            com.ironsource.sdk.a.d.a(com.ironsource.sdk.a.f.f27592j, a11.f27575a);
            e10.printStackTrace();
            Logger.d("IronSourceAdsPublisherAgent", "loadInAppBiddingAd failed decoding  ADM " + e10.getMessage());
        }
        f(bVar, map);
    }

    @Override // com.ironsource.sdk.e, com.ironsource.sdk.f
    public final void a(Activity activity, Map<String, String> map) {
        if (activity != null) {
            this.f28052i.a(activity);
        }
        this.f28044a.a(new RunnableC0350b(map));
    }

    @Override // com.ironsource.sdk.e
    public final void a(com.ironsource.sdk.b bVar, Map<String, String> map) {
        Logger.i("IronSourceAdsPublisherAgent", "showAd " + bVar.f27607b);
        com.ironsource.sdk.g.c a10 = this.f28048e.a(d.e.Interstitial, bVar.f27607b);
        if (a10 == null) {
            return;
        }
        this.f28044a.a(new m(a10, map));
    }

    @Override // com.ironsource.sdk.j.a.a, com.ironsource.sdk.j.a.b, com.ironsource.sdk.j.a.c, com.ironsource.sdk.j.a.d
    public final void a(d.e eVar, String str) {
        com.ironsource.sdk.j.c d10;
        com.ironsource.sdk.g.c j10 = j(eVar, str);
        if (j10 != null) {
            if (eVar == d.e.RewardedVideo) {
                com.ironsource.sdk.j.f b10 = b(j10);
                if (b10 != null) {
                    b10.onRVAdClosed();
                }
            } else if (eVar != d.e.Interstitial || (d10 = d(j10)) == null) {
            } else {
                d10.onInterstitialClose();
            }
        }
    }

    @Override // com.ironsource.sdk.j.a.a, com.ironsource.sdk.j.a.b, com.ironsource.sdk.j.a.c, com.ironsource.sdk.j.a.d
    public final void a(d.e eVar, String str, com.ironsource.sdk.g.a aVar) {
        com.ironsource.sdk.j.b g10;
        com.ironsource.sdk.g.c j10 = j(eVar, str);
        if (j10 != null) {
            j10.a(2);
            if (eVar == d.e.RewardedVideo) {
                com.ironsource.sdk.j.f b10 = b(j10);
                if (b10 != null) {
                    b10.onRVInitSuccess(aVar);
                }
            } else if (eVar == d.e.Interstitial) {
                com.ironsource.sdk.j.c d10 = d(j10);
                if (d10 != null) {
                    d10.onInterstitialInitSuccess();
                }
            } else if (eVar != d.e.Banner || (g10 = g(j10)) == null) {
            } else {
                g10.onBannerInitSuccess();
            }
        }
    }

    @Override // com.ironsource.sdk.j.a.a, com.ironsource.sdk.j.a.b, com.ironsource.sdk.j.a.c, com.ironsource.sdk.j.a.d
    public final void a(d.e eVar, String str, String str2) {
        com.ironsource.sdk.j.b g10;
        com.ironsource.sdk.g.c j10 = j(eVar, str);
        com.ironsource.sdk.a.a a10 = new com.ironsource.sdk.a.a().a("demandsourcename", str).a("producttype", eVar).a("callfailreason", str2);
        com.ironsource.sdk.service.a aVar = com.ironsource.sdk.service.a.f28229a;
        com.ironsource.sdk.a.a a11 = a10.a("custom_c", Long.valueOf(com.ironsource.sdk.service.a.c(j10.f28143b)));
        com.ironsource.sdk.service.a.b(j10.f28143b);
        a11.a("isbiddinginstance", Boolean.valueOf(com.ironsource.sdk.a.e.a(j10)));
        j10.a(3);
        if (eVar == d.e.RewardedVideo) {
            com.ironsource.sdk.j.f b10 = b(j10);
            if (b10 != null) {
                b10.onRVInitFail(str2);
            }
        } else if (eVar == d.e.Interstitial) {
            com.ironsource.sdk.j.c d10 = d(j10);
            if (d10 != null) {
                d10.onInterstitialInitFailed(str2);
            }
        } else if (eVar == d.e.Banner && (g10 = g(j10)) != null) {
            g10.onBannerInitFailed(str2);
        }
        com.ironsource.sdk.a.d.a(com.ironsource.sdk.a.f.f27590h, a11.f27575a);
    }

    @Override // com.ironsource.sdk.j.a.a, com.ironsource.sdk.j.a.b, com.ironsource.sdk.j.a.c, com.ironsource.sdk.j.a.d
    public final void a(d.e eVar, String str, String str2, JSONObject jSONObject) {
        com.ironsource.sdk.j.b g10;
        com.ironsource.sdk.g.c j10 = j(eVar, str);
        if (j10 == null || TextUtils.isEmpty(str2)) {
            return;
        }
        try {
            Logger.i("IronSourceAdsPublisherAgent", "Received Event Notification: " + str2 + " for demand source: " + j10.f28142a);
            if (eVar == d.e.Interstitial) {
                com.ironsource.sdk.j.c d10 = d(j10);
                if (d10 != null) {
                    jSONObject.put("demandSourceName", str);
                    d10.onInterstitialEventNotificationReceived(str2, jSONObject);
                }
            } else if (eVar == d.e.RewardedVideo) {
                com.ironsource.sdk.j.f b10 = b(j10);
                if (b10 != null) {
                    jSONObject.put("demandSourceName", str);
                    b10.onRVEventNotificationReceived(str2, jSONObject);
                }
            } else if (eVar != d.e.Banner || (g10 = g(j10)) == null) {
            } else {
                jSONObject.put("demandSourceName", str);
                if (str2.equalsIgnoreCase("impressions")) {
                    g10.onBannerShowSuccess();
                }
            }
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }

    @Override // com.ironsource.sdk.e
    public final void a(com.ironsource.sdk.j.e eVar) {
        this.f28044a.a(new d(eVar));
    }

    @Override // com.ironsource.sdk.j.a.d
    public final void a(String str, int i10) {
        com.ironsource.sdk.j.f b10;
        com.ironsource.sdk.g.c j10 = j(d.e.RewardedVideo, str);
        if (j10 == null || (b10 = b(j10)) == null) {
            return;
        }
        b10.onRVAdCredited(i10);
    }

    @Override // com.ironsource.sdk.j.a.b
    public final void a(String str, com.ironsource.sdk.c.a aVar) {
        com.ironsource.sdk.j.b g10;
        com.ironsource.sdk.g.c j10 = j(d.e.Banner, str);
        if (j10 == null || (g10 = g(j10)) == null) {
            return;
        }
        g10.onBannerLoadSuccess(aVar);
    }

    @Override // com.ironsource.sdk.j.a.d
    public final void a(String str, String str2) {
        com.ironsource.sdk.j.f b10;
        com.ironsource.sdk.g.c j10 = j(d.e.RewardedVideo, str);
        if (j10 == null || (b10 = b(j10)) == null) {
            return;
        }
        b10.onRVShowFail(str2);
    }

    @Override // com.ironsource.sdk.f
    public final void a(String str, String str2, int i10) {
        d.e productType;
        com.ironsource.sdk.g.c a10;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || (productType = SDKUtils.getProductType(str)) == null || (a10 = this.f28048e.a(productType, str2)) == null) {
            return;
        }
        a10.f28144c = i10;
    }

    @Override // com.ironsource.sdk.f
    public final void a(String str, String str2, com.ironsource.sdk.j.e eVar) {
        this.f28046c = str;
        this.f28047d = str2;
        this.f28044a.a(new c(str, str2, eVar));
    }

    @Override // com.ironsource.sdk.f
    public final void a(String str, String str2, String str3, Map<String, String> map, com.ironsource.sdk.j.c cVar) {
        this.f28046c = str;
        this.f28047d = str2;
        this.f28044a.a(new e(str, str2, this.f28048e.a(d.e.Interstitial, str3, map, cVar)));
    }

    @Override // com.ironsource.sdk.f
    public final void a(String str, String str2, String str3, Map<String, String> map, com.ironsource.sdk.j.f fVar) {
        this.f28046c = str;
        this.f28047d = str2;
        this.f28044a.a(new g(str, str2, this.f28048e.a(d.e.RewardedVideo, str3, map, fVar)));
    }

    @Override // com.ironsource.sdk.f
    public final void a(String str, String str2, Map<String, String> map, com.ironsource.sdk.j.e eVar) {
        this.f28046c = str;
        this.f28047d = str2;
        this.f28045b = eVar;
        this.f28044a.a(new o(str, str2, map, eVar));
    }

    @Override // com.ironsource.sdk.e
    public final void a(Map<String, String> map, com.ironsource.sdk.j.e eVar) {
        this.f28045b = eVar;
        this.f28044a.a(new a(map, eVar));
    }

    @Override // com.ironsource.sdk.e, com.ironsource.sdk.f
    public final void a(JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.has("gdprConsentStatus")) {
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("consent", Boolean.parseBoolean(jSONObject.getString("gdprConsentStatus")));
                this.f28049f.a(jSONObject2);
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
        }
        this.f28044a.a(new j(jSONObject));
    }

    @Override // com.ironsource.sdk.e
    public final boolean a(com.ironsource.sdk.b bVar) {
        Logger.d("IronSourceAdsPublisherAgent", "isAdAvailable " + bVar.f27607b);
        com.ironsource.sdk.g.c a10 = this.f28048e.a(d.e.Interstitial, bVar.f27607b);
        if (a10 == null) {
            return false;
        }
        return a10.f28147f;
    }

    @Override // com.ironsource.sdk.f
    public final boolean a(String str) {
        return this.f28044a.c(str);
    }

    @Override // com.ironsource.sdk.e, com.ironsource.sdk.f
    public final void b(Activity activity) {
        if (this.f28051h) {
            return;
        }
        d(activity);
    }

    @Override // com.ironsource.sdk.j.a.a, com.ironsource.sdk.j.a.b, com.ironsource.sdk.j.a.c, com.ironsource.sdk.j.a.d
    public final void b(d.e eVar, String str) {
        com.ironsource.sdk.j.b g10;
        com.ironsource.sdk.g.c j10 = j(eVar, str);
        if (j10 != null) {
            if (eVar == d.e.RewardedVideo) {
                com.ironsource.sdk.j.f b10 = b(j10);
                if (b10 != null) {
                    b10.onRVAdClicked();
                }
            } else if (eVar == d.e.Interstitial) {
                com.ironsource.sdk.j.c d10 = d(j10);
                if (d10 != null) {
                    d10.onInterstitialClick();
                }
            } else if (eVar != d.e.Banner || (g10 = g(j10)) == null) {
            } else {
                g10.onBannerClick();
            }
        }
    }

    @Override // com.ironsource.sdk.j.a.d
    public final void b(String str) {
        com.ironsource.sdk.j.f b10;
        com.ironsource.sdk.g.c j10 = j(d.e.RewardedVideo, str);
        if (j10 == null || (b10 = b(j10)) == null) {
            return;
        }
        b10.onRVNoMoreOffers();
    }

    @Override // com.ironsource.sdk.j.a.c
    public final void b(String str, int i10) {
        com.ironsource.sdk.g.c j10 = j(d.e.Interstitial, str);
        com.ironsource.sdk.j.c d10 = d(j10);
        if (j10 == null || d10 == null) {
            return;
        }
        d10.onInterstitialAdRewarded(str, i10);
    }

    @Override // com.ironsource.sdk.j.a.c
    public final void b(String str, String str2) {
        d.e eVar = d.e.Interstitial;
        com.ironsource.sdk.g.c j10 = j(eVar, str);
        com.ironsource.sdk.a.a aVar = new com.ironsource.sdk.a.a();
        aVar.a("callfailreason", str2).a("demandsourcename", str);
        if (j10 != null) {
            com.ironsource.sdk.a.a a10 = aVar.a("producttype", com.ironsource.sdk.a.e.a(j10, eVar)).a("generalmessage", j10.f28146e == 2 ? com.ironsource.sdk.f.b.f28118a : com.ironsource.sdk.f.b.f28119b).a("isbiddinginstance", Boolean.valueOf(com.ironsource.sdk.a.e.a(j10)));
            com.ironsource.sdk.service.a aVar2 = com.ironsource.sdk.service.a.f28229a;
            a10.a("custom_c", Long.valueOf(com.ironsource.sdk.service.a.c(j10.f28143b)));
            com.ironsource.sdk.service.a.b(j10.f28143b);
            com.ironsource.sdk.j.c d10 = d(j10);
            if (d10 != null) {
                d10.onInterstitialLoadFailed(str2);
            }
        }
        com.ironsource.sdk.a.d.a(com.ironsource.sdk.a.f.f27588f, aVar.f27575a);
    }

    @Override // com.ironsource.sdk.f
    public final void b(JSONObject jSONObject) {
        this.f28044a.a(new n(jSONObject));
    }

    @Override // com.ironsource.sdk.e, com.ironsource.sdk.f
    public final void c(Activity activity) {
        if (this.f28051h) {
            return;
        }
        e(activity);
    }

    @Override // com.ironsource.sdk.j.a.a, com.ironsource.sdk.j.a.b, com.ironsource.sdk.j.a.c, com.ironsource.sdk.j.a.d
    public final void c(d.e eVar, String str) {
        com.ironsource.sdk.j.f b10;
        com.ironsource.sdk.g.c j10 = j(eVar, str);
        if (j10 != null) {
            if (eVar == d.e.Interstitial) {
                com.ironsource.sdk.j.c d10 = d(j10);
                if (d10 != null) {
                    d10.onInterstitialOpen();
                }
            } else if (eVar != d.e.RewardedVideo || (b10 = b(j10)) == null) {
            } else {
                b10.onRVAdOpened();
            }
        }
    }

    @Override // com.ironsource.sdk.j.a.c
    public final void c(String str) {
        d.e eVar = d.e.Interstitial;
        com.ironsource.sdk.g.c j10 = j(eVar, str);
        com.ironsource.sdk.a.a a10 = new com.ironsource.sdk.a.a().a("demandsourcename", str);
        if (j10 != null) {
            com.ironsource.sdk.a.a a11 = a10.a("producttype", com.ironsource.sdk.a.e.a(j10, eVar)).a("isbiddinginstance", Boolean.valueOf(com.ironsource.sdk.a.e.a(j10)));
            com.ironsource.sdk.service.a aVar = com.ironsource.sdk.service.a.f28229a;
            a11.a("custom_c", Long.valueOf(com.ironsource.sdk.service.a.c(j10.f28143b)));
            com.ironsource.sdk.service.a.b(j10.f28143b);
            com.ironsource.sdk.j.c d10 = d(j10);
            if (d10 != null) {
                d10.onInterstitialLoadSuccess();
            }
        }
        com.ironsource.sdk.a.d.a(com.ironsource.sdk.a.f.f27593k, a10.f27575a);
    }

    @Override // com.ironsource.sdk.j.a.c
    public final void c(String str, String str2) {
        com.ironsource.sdk.j.c d10;
        com.ironsource.sdk.g.c j10 = j(d.e.Interstitial, str);
        if (j10 == null || (d10 = d(j10)) == null) {
            return;
        }
        d10.onInterstitialShowFailed(str2);
    }

    @Override // com.ironsource.sdk.f
    public final void c(JSONObject jSONObject) {
        String optString = jSONObject.optString("demandSourceName");
        if (TextUtils.isEmpty(optString)) {
            return;
        }
        this.f28044a.a(new f(optString));
    }

    @Override // com.ironsource.sdk.d.c
    public final void d(Activity activity) {
        try {
            this.f28044a.f();
            this.f28044a.b(activity);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Override // com.ironsource.sdk.j.a.c
    public final void d(String str) {
        com.ironsource.sdk.j.c d10;
        com.ironsource.sdk.g.c j10 = j(d.e.Interstitial, str);
        if (j10 == null || (d10 = d(j10)) == null) {
            return;
        }
        d10.onInterstitialShowSuccess();
    }

    @Override // com.ironsource.sdk.j.a.b
    public final void d(String str, String str2) {
        com.ironsource.sdk.j.b g10;
        com.ironsource.sdk.g.c j10 = j(d.e.Banner, str);
        if (j10 == null || (g10 = g(j10)) == null) {
            return;
        }
        g10.onBannerLoadFail(str2);
    }

    @Override // com.ironsource.sdk.f
    public final void d(JSONObject jSONObject) {
        this.f28044a.a(new h(jSONObject));
    }

    @Override // com.ironsource.sdk.d.c
    public final void e(Activity activity) {
        this.f28052i.a(activity);
        this.f28044a.e();
        this.f28044a.a(activity);
    }
}
