package com.facebook.fbreact.specs;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import g6.a;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class NativeToastAndroidSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, TurboModule {
    public NativeToastAndroidSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    @a
    public final Map<String, Object> getConstants() {
        return getTypedExportedConstants();
    }

    protected abstract Map<String, Object> getTypedExportedConstants();

    @ReactMethod
    @a
    public abstract void show(String str, double d10);

    @ReactMethod
    @a
    public abstract void showWithGravity(String str, double d10, double d11);

    @ReactMethod
    @a
    public abstract void showWithGravityAndOffset(String str, double d10, double d11, double d12, double d13);
}
