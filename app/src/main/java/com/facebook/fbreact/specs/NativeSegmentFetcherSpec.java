package com.facebook.fbreact.specs;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import g6.a;

/* loaded from: classes.dex */
public abstract class NativeSegmentFetcherSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, TurboModule {
    public NativeSegmentFetcherSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    @a
    public abstract void fetchSegment(double d10, ReadableMap readableMap, Callback callback);

    @ReactMethod
    @a
    public void getSegment(double d10, ReadableMap readableMap, Callback callback) {
    }
}
