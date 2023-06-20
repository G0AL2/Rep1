package com.facebook.fbreact.specs;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import g6.a;

/* loaded from: classes.dex */
public abstract class NativeExceptionsManagerSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, TurboModule {
    public NativeExceptionsManagerSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    @a
    public void dismissRedbox() {
    }

    @ReactMethod
    @a
    public void reportException(ReadableMap readableMap) {
    }

    @ReactMethod
    @a
    public abstract void reportFatalException(String str, ReadableArray readableArray, double d10);

    @ReactMethod
    @a
    public abstract void reportSoftException(String str, ReadableArray readableArray, double d10);

    @ReactMethod
    @a
    public abstract void updateExceptionMessage(String str, ReadableArray readableArray, double d10);
}
