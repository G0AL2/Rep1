package com.facebook.fbreact.specs;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import g6.a;

/* loaded from: classes.dex */
public abstract class NativeDevSettingsSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, TurboModule {
    public NativeDevSettingsSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    @a
    public abstract void addListener(String str);

    @ReactMethod
    @a
    public abstract void addMenuItem(String str);

    @ReactMethod
    @a
    public void onFastRefresh() {
    }

    @ReactMethod
    @a
    public abstract void reload();

    @ReactMethod
    @a
    public void reloadWithReason(String str) {
    }

    @ReactMethod
    @a
    public abstract void removeListeners(double d10);

    @ReactMethod
    @a
    public abstract void setHotLoadingEnabled(boolean z10);

    @ReactMethod
    @a
    public abstract void setIsDebuggingRemotely(boolean z10);

    @ReactMethod
    @a
    public abstract void setIsShakeToShowDevMenuEnabled(boolean z10);

    @ReactMethod
    @a
    public abstract void setProfilingEnabled(boolean z10);

    @ReactMethod
    @a
    public abstract void toggleElementInspector();
}
