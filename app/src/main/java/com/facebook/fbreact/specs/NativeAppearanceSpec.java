package com.facebook.fbreact.specs;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import fm.castbox.mediation.BuildConfig;
import g6.a;

/* loaded from: classes.dex */
public abstract class NativeAppearanceSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, TurboModule {
    public NativeAppearanceSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    @a
    public abstract void addListener(String str);

    @ReactMethod(isBlockingSynchronousMethod = BuildConfig.SHOULD_GZIP_HTTP_REQUEST)
    @a
    public abstract String getColorScheme();

    @ReactMethod
    @a
    public abstract void removeListeners(double d10);
}
