package org.devio.rn.splashscreen;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import pf.c;

/* loaded from: classes3.dex */
public class SplashScreenModule extends ReactContextBaseJavaModule {
    public SplashScreenModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "SplashScreen";
    }

    @ReactMethod
    public void hide() {
        c.d(getCurrentActivity());
    }

    @ReactMethod
    public void show() {
        c.f(getCurrentActivity());
    }
}
