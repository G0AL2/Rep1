package com.ironsource.sdk.controller;

import android.os.Bundle;
import com.ironsource.sdk.utils.Logger;

/* loaded from: classes3.dex */
public class InterstitialActivity extends ControllerActivity {

    /* renamed from: p  reason: collision with root package name */
    private static final String f27686p = "InterstitialActivity";

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.ironsource.sdk.controller.ControllerActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Logger.i(f27686p, "onCreate");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.ironsource.sdk.controller.ControllerActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        Logger.i(f27686p, "onPause");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.ironsource.sdk.controller.ControllerActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        Logger.i(f27686p, "onResume");
    }
}
