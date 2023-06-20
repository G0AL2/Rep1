package com.vehiclecloud.app.videofetch.rnads;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;

/* loaded from: classes3.dex */
public class RNAdsNativeModule extends ReactContextBaseJavaModule {
    private static final String TAG = "RNAdsNative";
    private final RNAdsNativeAdLoader mNativeAdLoader;

    public RNAdsNativeModule(ReactApplicationContext reactApplicationContext, RNAdsNativeAdLoader rNAdsNativeAdLoader) {
        super(reactApplicationContext);
        this.mNativeAdLoader = rNAdsNativeAdLoader;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return TAG;
    }

    @ReactMethod
    public void init(ReadableArray readableArray, Promise promise) {
        this.mNativeAdLoader.init(readableArray);
        promise.resolve(null);
    }
}
