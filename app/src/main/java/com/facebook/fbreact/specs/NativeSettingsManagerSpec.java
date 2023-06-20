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
public abstract class NativeSettingsManagerSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, TurboModule {
    public NativeSettingsManagerSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    @a
    public abstract void deleteValues(ReadableArray readableArray);

    @Override // com.facebook.react.bridge.BaseJavaModule
    @a
    public final Map<String, Object> getConstants() {
        return getTypedExportedConstants();
    }

    protected abstract Map<String, Object> getTypedExportedConstants();

    @ReactMethod
    @a
    public abstract void setValues(ReadableMap readableMap);
}
