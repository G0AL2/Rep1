package com.vehiclecloud.app.videofetch.rnads;

import android.app.Activity;
import android.os.Bundle;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.vehiclecloud.app.videofetch.rnads.api.RNAdsFullScreenAdListener;
import com.vehiclecloud.app.videofetch.rnads.api.RNAdsInterstitial;
import com.vehiclecloud.app.videofetch.rnbillingclient.Analytics;
import com.vehiclecloud.app.videofetch.unit.AsyncStorageHelper;
import downloader.video.download.free.R;
import ee.o;
import ee.u;
import ie.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;
import org.json.JSONObject;
import pe.p;
import qe.g;
import timber.log.a;
import we.e;
import we.e0;
import we.f0;
import we.n1;
import we.q;
import we.s0;

/* compiled from: RNAdsSplashModule.kt */
/* loaded from: classes3.dex */
public final class RNAdsSplashModule extends RNAdsReactContextBaseModule implements RNAdsFullScreenAdListener {
    public static final Companion Companion = new Companion(null);
    private static final String EVENT_SPLASH = "RNAdsSplashEvent";
    private static final int RESULT_OK = 1;
    private static final String TAG = "RNAdsSplash";
    private String adUnitId;
    private final RNAdsInterstitial<?> interstitialAd;
    private boolean isLoadingAd;
    private long loadTime;
    private Object mAd;
    private String mFailedCause;
    private e0 scope;
    private final String screen;
    private int state;

    /* compiled from: RNAdsSplashModule.kt */
    @f(c = "com.vehiclecloud.app.videofetch.rnads.RNAdsSplashModule$1", f = "RNAdsSplashModule.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.vehiclecloud.app.videofetch.rnads.RNAdsSplashModule$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    static final class AnonymousClass1 extends k implements p<e0, d<? super u>, Object> {
        final /* synthetic */ ReactApplicationContext $reactContext;
        int label;
        final /* synthetic */ RNAdsSplashModule this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ReactApplicationContext reactApplicationContext, RNAdsSplashModule rNAdsSplashModule, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$reactContext = reactApplicationContext;
            this.this$0 = rNAdsSplashModule;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<u> create(Object obj, d<?> dVar) {
            return new AnonymousClass1(this.$reactContext, this.this$0, dVar);
        }

        @Override // pe.p
        public final Object invoke(e0 e0Var, d<? super u> dVar) {
            return ((AnonymousClass1) create(e0Var, dVar)).invokeSuspend(u.f29813a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            je.d.c();
            if (this.label == 0) {
                o.b(obj);
                com.google.firebase.remoteconfig.a q10 = com.google.firebase.remoteconfig.a.q();
                qe.k.e(q10, "getInstance()");
                String s10 = q10.s("ad");
                qe.k.e(s10, "remoteConfig.getString(\"ad\")");
                String string = this.$reactContext.getString(R.string.gms_interstitial_first_id);
                qe.k.e(string, "reactContext.getString(R…ms_interstitial_first_id)");
                RNAdsSplashModule rNAdsSplashModule = this.this$0;
                if (!(s10.length() == 0)) {
                    try {
                        string = new JSONObject(s10).optString("interAppOpen", string);
                    } catch (Exception unused) {
                    }
                    qe.k.e(string, "{\n                try {\n…          }\n            }");
                }
                rNAdsSplashModule.adUnitId = string;
                if (this.this$0.getStartTimes() > 4) {
                    this.this$0.loadAd();
                }
                return u.f29813a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: RNAdsSplashModule.kt */
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RNAdsSplashModule(ReactApplicationContext reactApplicationContext, RNAdsInterstitial<?> rNAdsInterstitial) {
        super(reactApplicationContext);
        q b10;
        qe.k.f(reactApplicationContext, "reactContext");
        qe.k.f(rNAdsInterstitial, "interstitialAd");
        this.interstitialAd = rNAdsInterstitial;
        this.screen = "splash";
        b10 = n1.b(null, 1, null);
        this.scope = f0.a(b10.plus(s0.b()));
        e0 scope = getScope();
        if (scope == null) {
            return;
        }
        e.b(scope, s0.b(), null, new AnonymousClass1(reactApplicationContext, this, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0068 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object doLoad(ie.d<? super ee.u> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.vehiclecloud.app.videofetch.rnads.RNAdsSplashModule$doLoad$1
            if (r0 == 0) goto L13
            r0 = r9
            com.vehiclecloud.app.videofetch.rnads.RNAdsSplashModule$doLoad$1 r0 = (com.vehiclecloud.app.videofetch.rnads.RNAdsSplashModule$doLoad$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.vehiclecloud.app.videofetch.rnads.RNAdsSplashModule$doLoad$1 r0 = new com.vehiclecloud.app.videofetch.rnads.RNAdsSplashModule$doLoad$1
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = je.b.c()
            int r2 = r0.label
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3d
            if (r2 == r5) goto L35
            if (r2 != r4) goto L2d
            ee.o.b(r9)
            goto L69
        L2d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L35:
            java.lang.Object r2 = r0.L$0
            com.vehiclecloud.app.videofetch.rnads.RNAdsSplashModule r2 = (com.vehiclecloud.app.videofetch.rnads.RNAdsSplashModule) r2
            ee.o.b(r9)
            goto L5e
        L3d:
            ee.o.b(r9)
            timber.log.a$b r9 = timber.log.a.f37331a
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r6 = "splash Interstitial doLoad"
            r9.i(r6, r2)
            android.app.Activity r9 = r8.getCurrentActivity()
            if (r9 != 0) goto L6c
            r6 = 200(0xc8, double:9.9E-322)
            r0.L$0 = r8
            r0.label = r5
            java.lang.Object r9 = we.n0.a(r6, r0)
            if (r9 != r1) goto L5d
            return r1
        L5d:
            r2 = r8
        L5e:
            r0.L$0 = r3
            r0.label = r4
            java.lang.Object r9 = r2.doLoad(r0)
            if (r9 != r1) goto L69
            return r1
        L69:
            ee.u r9 = ee.u.f29813a
            return r9
        L6c:
            long r0 = java.lang.System.currentTimeMillis()
            r8.loadTime = r0
            com.vehiclecloud.app.videofetch.rnads.api.RNAdsInterstitial<?> r9 = r8.interstitialAd
            com.facebook.react.bridge.ReactApplicationContext r0 = r8.getReactApplicationContext()
            java.lang.String r1 = r8.adUnitId
            if (r1 != 0) goto L82
            java.lang.String r1 = "adUnitId"
            qe.k.s(r1)
            goto L83
        L82:
            r3 = r1
        L83:
            r9.load(r0, r3, r8)
            android.os.Bundle r9 = r8.getAnalyticsCommonParams()
            java.lang.String r0 = "iads_load"
            r8.logEvent(r0, r9)
            ee.u r9 = ee.u.f29813a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vehiclecloud.app.videofetch.rnads.RNAdsSplashModule.doLoad(ie.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Bundle getAnalyticsCommonParams() {
        Bundle bundle = new Bundle();
        bundle.putString("item_category", this.screen);
        bundle.putString(Analytics.Param.ITEM_NAME, this.screen);
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getStartTimes() {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        qe.k.e(reactApplicationContext, "reactApplicationContext");
        JSONObject query = AsyncStorageHelper.query(reactApplicationContext, "appRuntimeLog");
        if (query == null) {
            return 0;
        }
        return query.optInt("startupTimes");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadAd() {
        if (this.isLoadingAd) {
            return;
        }
        this.isLoadingAd = true;
        e0 scope = getScope();
        if (scope == null) {
            return;
        }
        e.b(scope, s0.c(), null, new RNAdsSplashModule$loadAd$1(this, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendSplashEvent(String str, String str2, String str3) {
        e0 scope = getScope();
        if (scope == null) {
            return;
        }
        e.b(scope, s0.b(), null, new RNAdsSplashModule$sendSplashEvent$1(str, str2, str3, this, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void sendSplashEvent$default(RNAdsSplashModule rNAdsSplashModule, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str3 = null;
        }
        rNAdsSplashModule.sendSplashEvent(str, str2, str3);
    }

    private final void showAd(Object obj) {
        e0 scope;
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null || (scope = getScope()) == null) {
            return;
        }
        e.b(scope, s0.c(), null, new RNAdsSplashModule$showAd$1$1(this, currentActivity, obj, null), 2, null);
    }

    @ReactMethod
    public final void addListener(String str) {
    }

    @ReactMethod
    public final void cancel() {
        timber.log.a.f37331a.i("splash Interstitial cancel", new Object[0]);
        this.state = 2;
        e0 scope = getScope();
        if (scope == null) {
            return;
        }
        f0.c(scope, null, 1, null);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return TAG;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.vehiclecloud.app.videofetch.rnads.RNAdsReactContextBaseModule
    public e0 getScope() {
        return this.scope;
    }

    @Override // com.vehiclecloud.app.videofetch.rnads.api.RNAdsFullScreenAdListener
    public void onAdClicked() {
        e0 scope = getScope();
        if (scope == null) {
            return;
        }
        e.b(scope, s0.b(), null, new RNAdsSplashModule$onAdClicked$1(this, null), 2, null);
    }

    @Override // com.vehiclecloud.app.videofetch.rnads.api.RNAdsFullScreenAdListener
    public void onAdDismissed() {
        e0 scope = getScope();
        if (scope == null) {
            return;
        }
        e.b(scope, s0.b(), null, new RNAdsSplashModule$onAdDismissed$1(this, null), 2, null);
    }

    @Override // com.vehiclecloud.app.videofetch.rnads.api.RNAdsFullScreenAdListener
    public void onAdFailedToLoad(String str) {
        qe.k.f(str, "cause");
        this.isLoadingAd = false;
        e0 scope = getScope();
        if (scope == null) {
            return;
        }
        e.b(scope, s0.b(), null, new RNAdsSplashModule$onAdFailedToLoad$1(this, str, null), 2, null);
    }

    @Override // com.vehiclecloud.app.videofetch.rnads.api.RNAdsFullScreenAdListener
    public void onAdFailedToShow(String str) {
        qe.k.f(str, "cause");
    }

    @Override // com.vehiclecloud.app.videofetch.rnads.api.RNAdsFullScreenAdListener
    public void onAdLoaded(Object obj) {
        qe.k.f(obj, "ad");
        a.b bVar = timber.log.a.f37331a;
        Object[] objArr = new Object[2];
        objArr[0] = this.screen;
        String str = this.adUnitId;
        if (str == null) {
            qe.k.s("adUnitId");
            str = null;
        }
        objArr[1] = str;
        bVar.i("splash Interstitial loaded screen: %s, id: %s", objArr);
        this.isLoadingAd = false;
        int i10 = this.state;
        if (i10 == 0) {
            this.mAd = obj;
        } else if (i10 == 1) {
            showAd(obj);
        }
        e0 scope = getScope();
        if (scope == null) {
            return;
        }
        e.b(scope, s0.b(), null, new RNAdsSplashModule$onAdLoaded$1(this, null), 2, null);
    }

    @Override // com.vehiclecloud.app.videofetch.rnads.api.RNAdsFullScreenAdListener
    public void onAdShowed() {
        e0 scope = getScope();
        if (scope == null) {
            return;
        }
        e.b(scope, s0.b(), null, new RNAdsSplashModule$onAdShowed$1(this, null), 2, null);
    }

    @ReactMethod
    public final void removeListeners(double d10) {
    }

    public void setScope(e0 e0Var) {
        this.scope = e0Var;
    }

    @ReactMethod
    public final void show(Promise promise) {
        Object obj = this.mAd;
        if (obj != null) {
            qe.k.c(obj);
            showAd(obj);
        } else if (this.mFailedCause != null) {
            String str = this.adUnitId;
            if (str == null) {
                qe.k.s("adUnitId");
                str = null;
            }
            sendSplashEvent("error", str, this.mFailedCause);
        } else {
            this.state = 1;
        }
        if (promise == null) {
            return;
        }
        promise.resolve(1);
    }
}
