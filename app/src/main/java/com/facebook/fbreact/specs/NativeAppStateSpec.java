package com.facebook.fbreact.specs;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import g6.a;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class NativeAppStateSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, TurboModule {
    public NativeAppStateSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    @a
    public abstract void addListener(String str);

    @Override // com.facebook.react.bridge.BaseJavaModule
    @a
    public final Map<String, Object> getConstants() {
        return getTypedExportedConstants();
    }

    @ReactMethod
    @a
    public abstract void getCurrentAppState(Callback callback, Callback callback2);

    protected abstract Map<String, Object> getTypedExportedConstants();

    @ReactMethod
    @a
    public abstract void removeListeners(double d10);
}
