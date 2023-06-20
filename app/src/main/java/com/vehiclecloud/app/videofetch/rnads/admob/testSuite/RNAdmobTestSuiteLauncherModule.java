package com.vehiclecloud.app.videofetch.rnads.admob.testSuite;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.google.android.ads.mediationtestsuite.MediationTestSuite;
import com.vehiclecloud.app.videofetch.rnads.api.ContextHelper;

/* loaded from: classes3.dex */
public class RNAdmobTestSuiteLauncherModule extends ReactContextBaseJavaModule {
    public RNAdmobTestSuiteLauncherModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNAdmobTestSuiteLauncher";
    }

    @ReactMethod
    public void launchTestSuite() {
        MediationTestSuite.launch(ContextHelper.getActivity(getReactApplicationContext()));
    }
}
