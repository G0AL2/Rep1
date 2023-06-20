package com.facebook.react.modules.core;

import android.net.Uri;
import com.facebook.fbreact.specs.NativeDeviceEventManagerSpec;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableMap;
import com.google.android.gms.common.internal.ImagesContract;

@o6.a(name = DeviceEventManagerModule.NAME)
/* loaded from: classes.dex */
public class DeviceEventManagerModule extends NativeDeviceEventManagerSpec {
    public static final String NAME = "DeviceEventManager";
    private final Runnable mInvokeDefaultBackPressRunnable;

    @g6.a
    /* loaded from: classes.dex */
    public interface RCTDeviceEventEmitter extends JavaScriptModule {
        void emit(String str, Object obj);
    }

    /* loaded from: classes.dex */
    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f15467a;

        a(DeviceEventManagerModule deviceEventManagerModule, b bVar) {
            this.f15467a = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            UiThreadUtil.assertOnUiThread();
            this.f15467a.invokeDefaultOnBackPressed();
        }
    }

    public DeviceEventManagerModule(ReactApplicationContext reactApplicationContext, b bVar) {
        super(reactApplicationContext);
        this.mInvokeDefaultBackPressRunnable = new a(this, bVar);
    }

    public void emitHardwareBackPressed() {
        ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        if (reactApplicationContextIfActiveOrWarn != null) {
            ((RCTDeviceEventEmitter) reactApplicationContextIfActiveOrWarn.getJSModule(RCTDeviceEventEmitter.class)).emit("hardwareBackPress", null);
        }
    }

    public void emitNewIntentReceived(Uri uri) {
        ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        if (reactApplicationContextIfActiveOrWarn != null) {
            WritableMap createMap = Arguments.createMap();
            createMap.putString(ImagesContract.URL, uri.toString());
            ((RCTDeviceEventEmitter) reactApplicationContextIfActiveOrWarn.getJSModule(RCTDeviceEventEmitter.class)).emit(ImagesContract.URL, createMap);
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @Override // com.facebook.fbreact.specs.NativeDeviceEventManagerSpec
    public void invokeDefaultBackPressHandler() {
        getReactApplicationContext().runOnUiQueueThread(this.mInvokeDefaultBackPressRunnable);
    }
}
