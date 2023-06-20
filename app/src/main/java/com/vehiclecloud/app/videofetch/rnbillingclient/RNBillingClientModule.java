package com.vehiclecloud.app.videofetch.rnbillingclient;

import android.app.Activity;
import android.text.TextUtils;
import android.util.Log;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.SkuDetails;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ObjectAlreadyConsumedException;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import com.vehiclecloud.app.videofetch.rnbillingclient.Analytics;
import com.vehiclecloud.app.videofetch.rnbillingclient.RNBillingClientModule;
import com.vehiclecloud.app.videofetch.rndownloader.util.RN;
import com.vehiclecloud.app.videofetch.rndownloader.util.Scopes;
import com.vehiclecloud.app.videofetch.unit.AnalyticsParamsBuilder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jb.v;
import jb.y;

/* loaded from: classes3.dex */
public class RNBillingClientModule extends ReactContextBaseJavaModule implements o2.h {
    private static final String TAG = "RNBillingClient";
    private final FirebaseAnalytics analytics;
    private com.android.billingclient.api.a mBillingClient;

    /* renamed from: com.vehiclecloud.app.videofetch.rnbillingclient.RNBillingClientModule$1 */
    /* loaded from: classes3.dex */
    public class AnonymousClass1 implements o2.c {
        final /* synthetic */ h0.a val$onSuccess;
        final /* synthetic */ Promise val$promise;

        AnonymousClass1(h0.a aVar, Promise promise) {
            RNBillingClientModule.this = r1;
            this.val$onSuccess = aVar;
            this.val$promise = promise;
        }

        public static /* synthetic */ void a(h0.a aVar, com.android.billingclient.api.e eVar) {
            aVar.accept(eVar);
        }

        @Override // o2.c
        public void onBillingServiceDisconnected() {
            try {
                this.val$promise.reject("101", "Billing service disconnected");
            } catch (ObjectAlreadyConsumedException e10) {
                Log.e(RNBillingClientModule.TAG, "startConnection onBillingServiceDisconnected get ex:", e10);
            }
        }

        @Override // o2.c
        public void onBillingSetupFinished(final com.android.billingclient.api.e eVar) {
            try {
                if (eVar.b() == 0) {
                    Scopes.IHandler io2 = Scopes.io();
                    final h0.a aVar = this.val$onSuccess;
                    io2.post(new Runnable() { // from class: com.vehiclecloud.app.videofetch.rnbillingclient.j
                        @Override // java.lang.Runnable
                        public final void run() {
                            RNBillingClientModule.AnonymousClass1.a(h0.a.this, eVar);
                        }
                    });
                } else {
                    Result.ERR.reject(this.val$promise, eVar);
                }
            } catch (ObjectAlreadyConsumedException e10) {
                Log.e(RNBillingClientModule.TAG, "startConnection send reject get ex:", e10);
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class Result {

        /* loaded from: classes3.dex */
        public static final class ERR {
            static final String ACTIVITY_NOT_FOUND = "104";
            static final String NOT_PREPARED = "103";
            static final String PARAMS = "105";
            static final String SERVICE_DISCONNECTED = "101";
            static final String SERVICE_END_CONNECTION = "102";

            ERR() {
            }

            static void reject(Promise promise, com.android.billingclient.api.e eVar) {
                try {
                    promise.reject(String.valueOf(eVar.b()), eVar.a());
                } catch (ObjectAlreadyConsumedException e10) {
                    Log.e(RNBillingClientModule.TAG, "startConnection onBillingServiceDisconnected get ex:", e10);
                }
            }
        }

        /* loaded from: classes3.dex */
        interface Event {
            public static final String PURCHASES_UPDATE = "vcRNBillingClientPurchasesUpdate";
        }

        /* loaded from: classes3.dex */
        interface Params {
            public static final String DEBUG_MESSAGE = "debugMessage";
            public static final String ITEMS = "items";
            public static final String RESPONSE_CODE = "responseCode";
        }

        private Result() {
        }

        static WritableMap resultOf(com.android.billingclient.api.e eVar) {
            WritableMap createMap = Arguments.createMap();
            createMap.putInt(Params.RESPONSE_CODE, eVar.b());
            createMap.putString(Params.DEBUG_MESSAGE, eVar.a());
            return createMap;
        }

        static void sendPurchasesUpdateEvent(ReactApplicationContext reactApplicationContext, WritableMap writableMap) {
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) reactApplicationContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(Event.PURCHASES_UPDATE, writableMap);
        }
    }

    public RNBillingClientModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.analytics = FirebaseAnalytics.getInstance(getReactApplicationContext());
        initDestroyLifecycleEventListener();
    }

    private void doStartConnection(Promise promise, h0.a<com.android.billingclient.api.e> aVar) {
        this.mBillingClient.h(new AnonymousClass1(aVar, promise));
    }

    public static /* synthetic */ void g(Promise promise, com.android.billingclient.api.e eVar) {
        lambda$startConnection$0(promise, eVar);
    }

    public static /* synthetic */ void i(Promise promise, com.android.billingclient.api.e eVar, List list) {
        lambda$querySkuDetails$1(promise, eVar, list);
    }

    private void initDestroyLifecycleEventListener() {
        getReactApplicationContext().addLifecycleEventListener(new LifecycleEventListener() { // from class: com.vehiclecloud.app.videofetch.rnbillingclient.RNBillingClientModule.2
            {
                RNBillingClientModule.this = this;
            }

            @Override // com.facebook.react.bridge.LifecycleEventListener
            public void onHostDestroy() {
                if (RNBillingClientModule.this.mBillingClient != null) {
                    RNBillingClientModule.this.mBillingClient.b();
                    RNBillingClientModule.this.mBillingClient = null;
                }
            }

            @Override // com.facebook.react.bridge.LifecycleEventListener
            public void onHostPause() {
            }

            @Override // com.facebook.react.bridge.LifecycleEventListener
            public void onHostResume() {
            }
        });
    }

    public static /* synthetic */ void j(Promise promise, com.android.billingclient.api.e eVar, List list) {
        lambda$queryPurchases$4(promise, eVar, list);
    }

    public static /* synthetic */ void k(RNBillingClientModule rNBillingClientModule, com.android.billingclient.api.e eVar, List list) {
        rNBillingClientModule.lambda$processPurchases$7(eVar, list);
    }

    public static /* synthetic */ void l(RNBillingClientModule rNBillingClientModule, ReadableMap readableMap, Promise promise, com.android.billingclient.api.e eVar) {
        rNBillingClientModule.lambda$querySkuDetails$2(readableMap, promise, eVar);
    }

    public static /* synthetic */ void lambda$acknowledgePurchase$8(com.android.billingclient.api.e eVar) {
        Log.d(TAG, "acknowledgePurchase: " + eVar.b() + ";" + eVar.a());
    }

    public /* synthetic */ void lambda$launchBillingFlow$3(String str, Activity activity, Promise promise) {
        try {
            com.android.billingclient.api.e d10 = this.mBillingClient.d(activity, com.android.billingclient.api.c.b().b(new SkuDetails(str)).a());
            Log.d(TAG, "launchBillingFlow: " + d10.b());
            promise.resolve(Result.resultOf(d10));
        } catch (Exception e10) {
            promise.reject(e10);
        }
    }

    public /* synthetic */ void lambda$processPurchases$7(com.android.billingclient.api.e eVar, List list) {
        WritableMap resultOf = Result.resultOf(eVar);
        if (list != null && !list.isEmpty()) {
            WritableArray createArray = Arguments.createArray();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Purchase purchase = (Purchase) it.next();
                createArray.pushMap(purchaseToWritableMap(purchase));
                if (!purchase.j()) {
                    acknowledgePurchase(purchase);
                }
            }
            resultOf.putArray(Result.Params.ITEMS, createArray);
            Result.sendPurchasesUpdateEvent(getReactApplicationContext(), resultOf);
            return;
        }
        resultOf.putArray(Result.Params.ITEMS, Arguments.createArray());
        Result.sendPurchasesUpdateEvent(getReactApplicationContext(), resultOf);
    }

    public static /* synthetic */ void lambda$queryPurchases$4(Promise promise, com.android.billingclient.api.e eVar, List list) {
        if (eVar.b() == 0) {
            WritableArray createArray = Arguments.createArray();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                createArray.pushMap(purchaseToWritableMap((Purchase) it.next()));
            }
            WritableMap resultOf = Result.resultOf(eVar);
            resultOf.putArray(Result.Params.ITEMS, createArray);
            promise.resolve(resultOf);
            return;
        }
        Result.ERR.reject(promise, eVar);
    }

    public /* synthetic */ void lambda$queryPurchases$5(String str, final Promise promise, com.android.billingclient.api.e eVar) {
        Log.d(TAG, "queryPurchases: SUBS");
        this.mBillingClient.f(str, new o2.g() { // from class: com.vehiclecloud.app.videofetch.rnbillingclient.h
            @Override // o2.g
            public final void a(com.android.billingclient.api.e eVar2, List list) {
                RNBillingClientModule.j(Promise.this, eVar2, list);
            }
        });
    }

    public static /* synthetic */ void lambda$querySkuDetails$1(Promise promise, com.android.billingclient.api.e eVar, List list) {
        int b10 = eVar.b();
        Log.i(TAG, "onSkuDetailsResponse: " + b10 + "; " + eVar.a());
        if (b10 == 0) {
            WritableMap resultOf = Result.resultOf(eVar);
            WritableArray createArray = Arguments.createArray();
            if (list == null) {
                resultOf.putArray(Result.Params.ITEMS, createArray);
                promise.resolve(resultOf);
                return;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                SkuDetails skuDetails = (SkuDetails) it.next();
                WritableMap createMap = Arguments.createMap();
                createMap.putString("sku", skuDetails.k());
                createMap.putString("currency", skuDetails.j());
                createMap.putString("type", skuDetails.n());
                createMap.putString(InAppPurchaseMetaData.KEY_PRICE, skuDetails.i());
                createMap.putString("title", skuDetails.m());
                createMap.putString("description", skuDetails.a());
                createMap.putString("introductoryPrice", skuDetails.d());
                createMap.putString("originalPrice", skuDetails.h());
                createMap.putString("subscriptionPeriod", skuDetails.l());
                createMap.putString("freeTrialPeriod", skuDetails.b());
                createMap.putString("introductoryPriceCycles", String.valueOf(skuDetails.e()));
                createMap.putString("introductoryPricePeriod", skuDetails.f());
                createMap.putString("iconUrl", skuDetails.c());
                createMap.putString("originalJson", skuDetails.g());
                createArray.pushMap(createMap);
            }
            resultOf.putArray(Result.Params.ITEMS, createArray);
            promise.resolve(resultOf);
            return;
        }
        Result.ERR.reject(promise, eVar);
    }

    public /* synthetic */ void lambda$querySkuDetails$2(ReadableMap readableMap, final Promise promise, com.android.billingclient.api.e eVar) {
        String str = RN.str(readableMap, "skuType", (String) null);
        ReadableArray array = readableMap.getArray("skusList");
        if (array == null) {
            promise.reject("105", "skusList is required");
            return;
        }
        ArrayList h10 = y.h();
        for (int i10 = 0; i10 < array.size(); i10++) {
            h10.add(array.getString(i10));
        }
        this.mBillingClient.g(com.android.billingclient.api.f.c().c(str).b(h10).a(), new o2.i() { // from class: com.vehiclecloud.app.videofetch.rnbillingclient.i
            @Override // o2.i
            public final void a(com.android.billingclient.api.e eVar2, List list) {
                RNBillingClientModule.i(Promise.this, eVar2, list);
            }
        });
    }

    public static /* synthetic */ void lambda$startConnection$0(Promise promise, com.android.billingclient.api.e eVar) {
        if (eVar == null) {
            WritableMap createMap = Arguments.createMap();
            createMap.putInt(Result.Params.RESPONSE_CODE, 0);
            createMap.putString(Result.Params.DEBUG_MESSAGE, "already connected.");
            promise.resolve(createMap);
            return;
        }
        promise.resolve(Result.resultOf(eVar));
    }

    public static /* synthetic */ void m(RNBillingClientModule rNBillingClientModule, String str, Promise promise, com.android.billingclient.api.e eVar) {
        rNBillingClientModule.lambda$queryPurchases$5(str, promise, eVar);
    }

    public static /* synthetic */ void n(h0.a aVar) {
        aVar.accept(null);
    }

    public static /* synthetic */ void o(RNBillingClientModule rNBillingClientModule, String str, Activity activity, Promise promise) {
        rNBillingClientModule.lambda$launchBillingFlow$3(str, activity, promise);
    }

    public static /* synthetic */ void p(com.android.billingclient.api.e eVar) {
        lambda$acknowledgePurchase$8(eVar);
    }

    private void processPurchases(final com.android.billingclient.api.e eVar, final List<Purchase> list) {
        Scopes.io().post(new Runnable() { // from class: com.vehiclecloud.app.videofetch.rnbillingclient.d
            @Override // java.lang.Runnable
            public final void run() {
                RNBillingClientModule.k(RNBillingClientModule.this, eVar, list);
            }
        });
    }

    private static WritableMap purchaseToWritableMap(Purchase purchase) {
        WritableMap createMap = Arguments.createMap();
        WritableArray createArray = Arguments.createArray();
        Iterator<String> it = purchase.i().iterator();
        while (it.hasNext()) {
            createArray.pushString(it.next());
        }
        createMap.putArray("skus", createArray);
        createMap.putString("orderId", purchase.b());
        createMap.putDouble("purchaseTime", purchase.f());
        createMap.putString("purchaseToken", purchase.g());
        createMap.putString(InAppPurchaseMetaData.KEY_SIGNATURE, purchase.h());
        createMap.putBoolean("autoRenewing", purchase.k());
        createMap.putBoolean("acknowledged", purchase.j());
        createMap.putInt("purchaseState", purchase.e());
        createMap.putString("packageName", purchase.d());
        createMap.putString("developerPayload", purchase.a());
        return createMap;
    }

    private static String skuOf(List<Purchase> list) {
        Purchase purchase;
        if (list == null || (purchase = (Purchase) v.b(list, null)) == null) {
            return null;
        }
        return TextUtils.join(",", purchase.i());
    }

    private void withConnection(Promise promise, final h0.a<com.android.billingclient.api.e> aVar) {
        com.android.billingclient.api.a aVar2 = this.mBillingClient;
        if (aVar2 != null && aVar2.c()) {
            Scopes.io().post(new Runnable() { // from class: com.vehiclecloud.app.videofetch.rnbillingclient.f
                @Override // java.lang.Runnable
                public final void run() {
                    RNBillingClientModule.n(h0.a.this);
                }
            });
            return;
        }
        try {
            this.mBillingClient = com.android.billingclient.api.a.e(getReactApplicationContext()).b().c(this).a();
            doStartConnection(promise, aVar);
        } catch (Exception e10) {
            promise.reject("103", e10);
        }
    }

    protected void acknowledgePurchase(Purchase purchase) {
        Log.d(TAG, "acknowledgePurchase");
        this.mBillingClient.a(o2.a.b().b(purchase.g()).a(), new o2.b() { // from class: com.vehiclecloud.app.videofetch.rnbillingclient.g
            @Override // o2.b
            public final void a(com.android.billingclient.api.e eVar) {
                RNBillingClientModule.p(eVar);
            }
        });
    }

    @ReactMethod
    public void addListener(String str) {
    }

    @ReactMethod
    public void endConnection(Promise promise) {
        com.android.billingclient.api.a aVar = this.mBillingClient;
        if (aVar != null) {
            try {
                aVar.b();
                promise.resolve(null);
            } catch (Exception e10) {
                promise.reject("102", e10.getMessage());
            }
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return TAG;
    }

    @ReactMethod
    public void launchBillingFlow(final String str, final Promise promise) {
        final Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            promise.reject("104", "current activity is null");
        } else {
            Scopes.main().post(new Runnable() { // from class: com.vehiclecloud.app.videofetch.rnbillingclient.e
                @Override // java.lang.Runnable
                public final void run() {
                    RNBillingClientModule.o(RNBillingClientModule.this, str, currentActivity, promise);
                }
            });
        }
    }

    @Override // o2.h
    public void onPurchasesUpdated(com.android.billingclient.api.e eVar, List<Purchase> list) {
        int b10 = eVar.b();
        String a10 = eVar.a();
        Log.d(TAG, "onPurchasesUpdated: " + b10 + "; " + a10);
        if (b10 == 0) {
            this.analytics.b(Analytics.Event.IAP_RET_TRUE, new AnalyticsParamsBuilder().str(Analytics.Param.ITEM_NAME, skuOf(list)).build());
            processPurchases(eVar, list);
        } else if (b10 == 1) {
            this.analytics.b(Analytics.Event.IAP_RET_FALSE, new AnalyticsParamsBuilder().str(Analytics.Param.ITEM_NAME, skuOf(list)).str("error", Analytics.PurchaseError.USER_CANCELED).build());
        } else if (b10 == 4) {
            this.analytics.b(Analytics.Event.IAP_RET_FALSE, new AnalyticsParamsBuilder().str(Analytics.Param.ITEM_NAME, skuOf(list)).str("error", Analytics.PurchaseError.ITEM_UNAVAILABLE).build());
        } else if (b10 == 5) {
            Log.e(TAG, "onPurchasesUpdated: Developer error means that Google Play does not recognize the configuration. If you are just getting started, make sure you have configured the application correctly in the Google Play Console. The SKU product ID must match and the APK you are using must be signed with release keys.");
        } else if (b10 != 7) {
        } else {
            this.analytics.b(Analytics.Event.IAP_RET_FALSE, new AnalyticsParamsBuilder().str(Analytics.Param.ITEM_NAME, skuOf(list)).str("error", Analytics.PurchaseError.ITEM_ALREADY_OWNED).build());
            processPurchases(eVar, list);
        }
    }

    @ReactMethod
    public void queryPurchases(final String str, final Promise promise) {
        withConnection(promise, new h0.a() { // from class: com.vehiclecloud.app.videofetch.rnbillingclient.c
            @Override // h0.a
            public final void accept(Object obj) {
                RNBillingClientModule.m(RNBillingClientModule.this, str, promise, (com.android.billingclient.api.e) obj);
            }
        });
    }

    @ReactMethod
    public void querySkuDetails(final ReadableMap readableMap, final Promise promise) {
        withConnection(promise, new h0.a() { // from class: com.vehiclecloud.app.videofetch.rnbillingclient.b
            @Override // h0.a
            public final void accept(Object obj) {
                RNBillingClientModule.l(RNBillingClientModule.this, readableMap, promise, (com.android.billingclient.api.e) obj);
            }
        });
    }

    @ReactMethod
    public void removeListeners(double d10) {
    }

    @ReactMethod
    public void startConnection(final Promise promise) {
        withConnection(promise, new h0.a() { // from class: com.vehiclecloud.app.videofetch.rnbillingclient.a
            @Override // h0.a
            public final void accept(Object obj) {
                RNBillingClientModule.g(Promise.this, (com.android.billingclient.api.e) obj);
            }
        });
    }
}
