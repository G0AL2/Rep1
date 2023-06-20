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
public abstract class NativeWebSocketModuleSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, TurboModule {
    public NativeWebSocketModuleSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    @a
    public abstract void addListener(String str);

    @ReactMethod
    @a
    public abstract void close(double d10, String str, double d11);

    @ReactMethod
    @a
    public abstract void connect(String str, ReadableArray readableArray, ReadableMap readableMap, double d10);

    @ReactMethod
    @a
    public abstract void ping(double d10);

    @ReactMethod
    @a
    public abstract void removeListeners(double d10);

    @ReactMethod
    @a
    public abstract void send(String str, double d10);

    @ReactMethod
    @a
    public abstract void sendBinary(String str, double d10);
}
