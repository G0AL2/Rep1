package com.facebook.fbreact.specs;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import g6.a;

/* loaded from: classes.dex */
public abstract class NativeLinkingManagerSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, TurboModule {
    public NativeLinkingManagerSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    @a
    public abstract void addListener(String str);

    @ReactMethod
    @a
    public abstract void canOpenURL(String str, Promise promise);

    @ReactMethod
    @a
    public abstract void getInitialURL(Promise promise);

    @ReactMethod
    @a
    public abstract void openSettings(Promise promise);

    @ReactMethod
    @a
    public abstract void openURL(String str, Promise promise);

    @ReactMethod
    @a
    public abstract void removeListeners(double d10);
}
