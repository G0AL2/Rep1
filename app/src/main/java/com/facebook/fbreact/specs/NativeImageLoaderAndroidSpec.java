package com.facebook.fbreact.specs;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import g6.a;

/* loaded from: classes.dex */
public abstract class NativeImageLoaderAndroidSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, TurboModule {
    public NativeImageLoaderAndroidSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    @a
    public abstract void abortRequest(double d10);

    @ReactMethod
    @a
    public abstract void getSize(String str, Promise promise);

    @ReactMethod
    @a
    public abstract void getSizeWithHeaders(String str, ReadableMap readableMap, Promise promise);

    @ReactMethod
    @a
    public abstract void prefetchImage(String str, double d10, Promise promise);

    @ReactMethod
    @a
    public abstract void queryCache(ReadableArray readableArray, Promise promise);
}
