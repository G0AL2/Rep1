package com.facebook.fbreact.specs;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import g6.a;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class NativeBlobModuleSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, TurboModule {
    public NativeBlobModuleSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    @a
    public abstract void addNetworkingHandler();

    @ReactMethod
    @a
    public abstract void addWebSocketHandler(double d10);

    @ReactMethod
    @a
    public abstract void createFromParts(ReadableArray readableArray, String str);

    @Override // com.facebook.react.bridge.BaseJavaModule
    @a
    public final Map<String, Object> getConstants() {
        return getTypedExportedConstants();
    }

    protected abstract Map<String, Object> getTypedExportedConstants();

    @ReactMethod
    @a
    public abstract void release(String str);

    @ReactMethod
    @a
    public abstract void removeWebSocketHandler(double d10);

    @ReactMethod
    @a
    public abstract void sendOverSocket(ReadableMap readableMap, double d10);
}
