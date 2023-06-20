package com.facebook.fbreact.specs;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import g6.a;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class NativeStatusBarManagerAndroidSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, TurboModule {
    public NativeStatusBarManagerAndroidSpec(ReactApplicationContext reactApplicationContext) {
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
    public abstract void setColor(double d10, boolean z10);

    @ReactMethod
    @a
    public abstract void setHidden(boolean z10);

    @ReactMethod
    @a
    public abstract void setStyle(String str);

    @ReactMethod
    @a
    public abstract void setTranslucent(boolean z10);
}
