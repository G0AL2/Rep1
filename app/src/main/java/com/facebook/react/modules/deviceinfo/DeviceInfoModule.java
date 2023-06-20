package com.facebook.react.modules.deviceinfo;

import android.content.Context;
import com.facebook.fbreact.specs.NativeDeviceInfoSpec;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.uimanager.c;
import java.util.HashMap;
import java.util.Map;
import o6.a;

@a(name = DeviceInfoModule.NAME)
/* loaded from: classes.dex */
public class DeviceInfoModule extends NativeDeviceInfoSpec implements LifecycleEventListener {
    public static final String NAME = "DeviceInfo";
    private float mFontScale;
    private ReadableMap mPreviousDisplayMetrics;
    private ReactApplicationContext mReactApplicationContext;

    public DeviceInfoModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        c.f(reactApplicationContext);
        this.mFontScale = reactApplicationContext.getResources().getConfiguration().fontScale;
        this.mReactApplicationContext = reactApplicationContext;
        reactApplicationContext.addLifecycleEventListener(this);
    }

    public void emitUpdateDimensionsEvent() {
        ReactApplicationContext reactApplicationContext = this.mReactApplicationContext;
        if (reactApplicationContext == null) {
            return;
        }
        if (reactApplicationContext.hasActiveReactInstance()) {
            WritableMap a10 = c.a(this.mFontScale);
            ReadableMap readableMap = this.mPreviousDisplayMetrics;
            if (readableMap == null) {
                this.mPreviousDisplayMetrics = a10.copy();
                return;
            } else if (a10.equals(readableMap)) {
                return;
            } else {
                this.mPreviousDisplayMetrics = a10.copy();
                ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.mReactApplicationContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("didUpdateDimensions", a10);
                return;
            }
        }
        ReactSoftExceptionLogger.logSoftException(NAME, new ReactNoCrashSoftException("No active CatalystInstance, cannot emitUpdateDimensionsEvent"));
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @Override // com.facebook.fbreact.specs.NativeDeviceInfoSpec
    public Map<String, Object> getTypedExportedConstants() {
        WritableMap a10 = c.a(this.mFontScale);
        this.mPreviousDisplayMetrics = a10.copy();
        HashMap hashMap = new HashMap();
        hashMap.put("Dimensions", a10.toHashMap());
        return hashMap;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        super.invalidate();
        ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        if (reactApplicationContextIfActiveOrWarn != null) {
            reactApplicationContextIfActiveOrWarn.removeLifecycleEventListener(this);
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        ReactApplicationContext reactApplicationContext = this.mReactApplicationContext;
        if (reactApplicationContext == null) {
            return;
        }
        float f10 = reactApplicationContext.getResources().getConfiguration().fontScale;
        if (this.mFontScale != f10) {
            this.mFontScale = f10;
            emitUpdateDimensionsEvent();
        }
    }

    public DeviceInfoModule(Context context) {
        super(null);
        this.mReactApplicationContext = null;
        c.f(context);
        this.mFontScale = context.getResources().getConfiguration().fontScale;
    }
}
