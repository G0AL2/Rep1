package io.invertase.firebase.common;

import android.app.Activity;
import android.content.Context;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.WritableMap;
import com.vehiclecloud.app.videofetch.rnbillingclient.Analytics;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* loaded from: classes3.dex */
public class ReactNativeFirebaseModule extends ReactContextBaseJavaModule {
    private final b executorService;
    private String moduleName;

    public ReactNativeFirebaseModule(ReactApplicationContext reactApplicationContext, String str) {
        super(reactApplicationContext);
        this.moduleName = str;
        this.executorService = new b(getName());
    }

    public static void rejectPromiseWithCodeAndMessage(Promise promise, String str, String str2) {
        WritableMap createMap = Arguments.createMap();
        createMap.putString(Analytics.Param.CODE, str);
        createMap.putString("message", str2);
        promise.reject(str, str2, createMap);
    }

    public static void rejectPromiseWithExceptionMap(Promise promise, Exception exc) {
        promise.reject(exc, a.b(exc));
    }

    public Activity getActivity() {
        return getCurrentActivity();
    }

    public Context getApplicationContext() {
        return getReactApplicationContext().getApplicationContext();
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        return new HashMap();
    }

    public ReactContext getContext() {
        return getReactApplicationContext();
    }

    public final ExecutorService getExecutor() {
        return this.executorService.b();
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNFB" + this.moduleName + "Module";
    }

    public final ExecutorService getTransactionalExecutor() {
        return this.executorService.f();
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        super.initialize();
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        this.executorService.j();
    }

    public final void removeEventListeningExecutor(String str) {
        this.executorService.i(this.executorService.d(true, str));
    }

    public final ExecutorService getTransactionalExecutor(String str) {
        return this.executorService.g(str);
    }

    public static void rejectPromiseWithCodeAndMessage(Promise promise, String str, String str2, String str3) {
        WritableMap createMap = Arguments.createMap();
        createMap.putString(Analytics.Param.CODE, str);
        createMap.putString("message", str2);
        createMap.putString("nativeErrorMessage", str3);
        promise.reject(str, str2, createMap);
    }
}
