package com.facebook.react.bridge;

import android.app.Activity;
import android.content.Intent;

/* loaded from: classes.dex */
public class BaseActivityEventListener implements ActivityEventListener {
    @Deprecated
    public void onActivityResult(int i10, int i11, Intent intent) {
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onActivityResult(Activity activity, int i10, int i11, Intent intent) {
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onNewIntent(Intent intent) {
    }
}
