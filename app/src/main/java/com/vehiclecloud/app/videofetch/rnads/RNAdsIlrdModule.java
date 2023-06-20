package com.vehiclecloud.app.videofetch.rnads;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.google.common.util.concurrent.b;
import com.vehiclecloud.app.videofetch.rnads.api.RNAdsIlrd;
import qe.g;
import qe.k;
import we.e;
import we.e0;
import we.s0;

/* compiled from: RNAdsIlrdModule.kt */
/* loaded from: classes3.dex */
public final class RNAdsIlrdModule extends RNAdsReactContextBaseModule {
    private static final String CONF_ENABLED = "enableFbRevData";
    private static final String CONF_VALUE_THRESHOLD = "valueThreshold";
    public static final Companion Companion = new Companion(null);
    private static final String SERVICE = "RNAdsIlrd";
    private final RNAdsIlrd mRnAdsIlrd;

    /* compiled from: RNAdsIlrdModule.kt */
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: RNAdsIlrdModule.kt */
    /* loaded from: classes3.dex */
    public final class ILRDDataUploader implements RNAdsIlrd.Uploader {
        private final String mAdPlatform;
        private final b mValue;
        private double mValueThreshold;
        final /* synthetic */ RNAdsIlrdModule this$0;

        public ILRDDataUploader(RNAdsIlrdModule rNAdsIlrdModule, String str, ReadableMap readableMap) {
            k.f(rNAdsIlrdModule, "this$0");
            k.f(str, "mAdPlatform");
            k.f(readableMap, "conf");
            this.this$0 = rNAdsIlrdModule;
            this.mAdPlatform = str;
            this.mValue = new b();
            this.mValueThreshold = 0.01d;
            if (readableMap.hasKey(RNAdsIlrdModule.CONF_VALUE_THRESHOLD)) {
                try {
                    this.mValueThreshold = readableMap.getDouble(RNAdsIlrdModule.CONF_VALUE_THRESHOLD);
                } catch (Exception unused) {
                }
            }
        }

        @Override // com.vehiclecloud.app.videofetch.rnads.api.RNAdsIlrd.Uploader
        public void onPaidEvent(String str, double d10) {
            e0 scope;
            if ((d10 == 0.0d) || (scope = this.this$0.getScope()) == null) {
                return;
            }
            e.b(scope, s0.b(), null, new RNAdsIlrdModule$ILRDDataUploader$onPaidEvent$1(this, d10, this.this$0, str, null), 2, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RNAdsIlrdModule(ReactApplicationContext reactApplicationContext, RNAdsIlrd rNAdsIlrd) {
        super(reactApplicationContext);
        k.f(reactApplicationContext, "reactContext");
        k.f(rNAdsIlrd, "mRnAdsIlrd");
        this.mRnAdsIlrd = rNAdsIlrd;
    }

    private final boolean isEnabled(ReadableMap readableMap) {
        try {
            if (readableMap.hasKey(CONF_ENABLED)) {
                return readableMap.getBoolean(CONF_ENABLED);
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return SERVICE;
    }

    @ReactMethod
    public final void init(ReadableMap readableMap) {
        k.f(readableMap, "conf");
        timber.log.a.f37331a.d("init: %s", readableMap);
        if (isEnabled(readableMap)) {
            String adPlatform = this.mRnAdsIlrd.getAdPlatform();
            k.e(adPlatform, "mRnAdsIlrd.adPlatform");
            this.mRnAdsIlrd.init(readableMap, new ILRDDataUploader(this, adPlatform, readableMap));
        }
    }
}
