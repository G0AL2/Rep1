package com.facebook.react;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.KeyEvent;

/* compiled from: ReactActivity.java */
/* loaded from: classes.dex */
public abstract class j extends androidx.appcompat.app.d implements com.facebook.react.modules.core.b, com.facebook.react.modules.core.e {
    private final k mDelegate = createReactActivityDelegate();

    protected k createReactActivityDelegate() {
        return new k(this, getMainComponentName());
    }

    protected String getMainComponentName() {
        return null;
    }

    protected final p getReactInstanceManager() {
        return this.mDelegate.getReactInstanceManager();
    }

    protected final s getReactNativeHost() {
        return this.mDelegate.getReactNativeHost();
    }

    @Override // com.facebook.react.modules.core.b
    public void invokeDefaultOnBackPressed() {
        super.onBackPressed();
    }

    protected final void loadApp(String str) {
        this.mDelegate.loadApp(str);
    }

    @Override // androidx.fragment.app.d, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        this.mDelegate.onActivityResult(i10, i11, intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.mDelegate.onBackPressed()) {
            return;
        }
        super.onBackPressed();
    }

    @Override // androidx.appcompat.app.d, androidx.fragment.app.d, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.mDelegate.onConfigurationChanged(configuration);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.d, androidx.activity.ComponentActivity, androidx.core.app.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mDelegate.onCreate(bundle);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.d, androidx.fragment.app.d, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.mDelegate.onDestroy();
    }

    @Override // androidx.appcompat.app.d, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        return this.mDelegate.onKeyDown(i10, keyEvent) || super.onKeyDown(i10, keyEvent);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyLongPress(int i10, KeyEvent keyEvent) {
        return this.mDelegate.onKeyLongPress(i10, keyEvent) || super.onKeyLongPress(i10, keyEvent);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        return this.mDelegate.onKeyUp(i10, keyEvent) || super.onKeyUp(i10, keyEvent);
    }

    @Override // androidx.fragment.app.d, android.app.Activity
    public void onNewIntent(Intent intent) {
        if (this.mDelegate.onNewIntent(intent)) {
            return;
        }
        super.onNewIntent(intent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.d, android.app.Activity
    public void onPause() {
        super.onPause();
        this.mDelegate.onPause();
    }

    @Override // androidx.fragment.app.d, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        this.mDelegate.onRequestPermissionsResult(i10, strArr, iArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.d, android.app.Activity
    public void onResume() {
        super.onResume();
        this.mDelegate.onResume();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        this.mDelegate.onWindowFocusChanged(z10);
    }

    @Override // com.facebook.react.modules.core.e
    public void requestPermissions(String[] strArr, int i10, com.facebook.react.modules.core.f fVar) {
        this.mDelegate.requestPermissions(strArr, i10, fVar);
    }
}
