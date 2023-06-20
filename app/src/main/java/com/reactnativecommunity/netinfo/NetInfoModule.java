package com.reactnativecommunity.netinfo;

import android.os.Build;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.reactnativecommunity.netinfo.a;
import jd.b;
import jd.f;

@o6.a(name = NetInfoModule.NAME)
/* loaded from: classes3.dex */
public class NetInfoModule extends ReactContextBaseJavaModule implements a.b {
    public static final String NAME = "RNCNetInfo";
    private final a mAmazonConnectivityChecker;
    private final b mConnectivityReceiver;
    private int numberOfListeners;

    public NetInfoModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.numberOfListeners = 0;
        if (Build.VERSION.SDK_INT >= 24) {
            this.mConnectivityReceiver = new f(reactApplicationContext);
        } else {
            this.mConnectivityReceiver = new jd.a(reactApplicationContext);
        }
        this.mAmazonConnectivityChecker = new a(reactApplicationContext, this);
    }

    @ReactMethod
    public void addListener(String str) {
        this.numberOfListeners++;
        this.mConnectivityReceiver.f33090e = true;
    }

    @ReactMethod
    public void getCurrentState(String str, Promise promise) {
        this.mConnectivityReceiver.d(str, promise);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        this.mConnectivityReceiver.f();
        this.mAmazonConnectivityChecker.g();
    }

    @Override // com.reactnativecommunity.netinfo.a.b
    public void onAmazonFireDeviceConnectivityChanged(boolean z10) {
        this.mConnectivityReceiver.h(z10);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        this.mAmazonConnectivityChecker.k();
        this.mConnectivityReceiver.i();
        this.mConnectivityReceiver.f33090e = false;
    }

    @ReactMethod
    public void removeListeners(Integer num) {
        int intValue = this.numberOfListeners - num.intValue();
        this.numberOfListeners = intValue;
        if (intValue == 0) {
            this.mConnectivityReceiver.f33090e = false;
        }
    }
}
