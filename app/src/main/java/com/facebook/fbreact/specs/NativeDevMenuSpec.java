package com.facebook.fbreact.specs;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import g6.a;

/* loaded from: classes.dex */
public abstract class NativeDevMenuSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, TurboModule {
    public NativeDevMenuSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    @a
    public abstract void debugRemotely(boolean z10);

    @ReactMethod
    @a
    public abstract void reload();

    @ReactMethod
    @a
    public abstract void setHotLoadingEnabled(boolean z10);

    @ReactMethod
    @a
    public abstract void setProfilingEnabled(boolean z10);

    @ReactMethod
    @a
    public abstract void show();
}
