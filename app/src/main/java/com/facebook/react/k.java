package com.facebook.react;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.KeyEvent;
import com.facebook.react.bridge.Callback;

/* compiled from: ReactActivityDelegate.java */
/* loaded from: classes.dex */
public class k {
    private final Activity mActivity;
    private final String mMainComponentName;
    private com.facebook.react.modules.core.f mPermissionListener;
    private Callback mPermissionsCallback;
    private n mReactDelegate;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ReactActivityDelegate.java */
    /* loaded from: classes.dex */
    public class a extends n {
        a(Activity activity, s sVar, String str, Bundle bundle) {
            super(activity, sVar, str, bundle);
        }

        @Override // com.facebook.react.n
        protected x a() {
            return k.this.createRootView();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ReactActivityDelegate.java */
    /* loaded from: classes.dex */
    public class b implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f15439a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String[] f15440b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int[] f15441c;

        b(int i10, String[] strArr, int[] iArr) {
            this.f15439a = i10;
            this.f15440b = strArr;
            this.f15441c = iArr;
        }

        @Override // com.facebook.react.bridge.Callback
        public void invoke(Object... objArr) {
            if (k.this.mPermissionListener == null || !k.this.mPermissionListener.onRequestPermissionsResult(this.f15439a, this.f15440b, this.f15441c)) {
                return;
            }
            k.this.mPermissionListener = null;
        }
    }

    @Deprecated
    public k(Activity activity, String str) {
        this.mActivity = activity;
        this.mMainComponentName = str;
    }

    protected x createRootView() {
        return new x(getContext());
    }

    protected Context getContext() {
        return (Context) f6.a.c(this.mActivity);
    }

    protected Bundle getLaunchOptions() {
        return null;
    }

    public String getMainComponentName() {
        return this.mMainComponentName;
    }

    protected Activity getPlainActivity() {
        return (Activity) getContext();
    }

    public p getReactInstanceManager() {
        return this.mReactDelegate.b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public s getReactNativeHost() {
        return ((m) getPlainActivity().getApplication()).getReactNativeHost();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void loadApp(String str) {
        this.mReactDelegate.e(str);
        getPlainActivity().setContentView(this.mReactDelegate.d());
    }

    public void onActivityResult(int i10, int i11, Intent intent) {
        this.mReactDelegate.f(i10, i11, intent, true);
    }

    public boolean onBackPressed() {
        return this.mReactDelegate.g();
    }

    public void onConfigurationChanged(Configuration configuration) {
        if (getReactNativeHost().hasInstance()) {
            getReactInstanceManager().N(getContext(), configuration);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        String mainComponentName = getMainComponentName();
        this.mReactDelegate = new a(getPlainActivity(), getReactNativeHost(), mainComponentName, getLaunchOptions());
        if (mainComponentName != null) {
            loadApp(mainComponentName);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void onDestroy() {
        this.mReactDelegate.h();
    }

    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (getReactNativeHost().hasInstance() && getReactNativeHost().getUseDeveloperSupport() && i10 == 90) {
            keyEvent.startTracking();
            return true;
        }
        return false;
    }

    public boolean onKeyLongPress(int i10, KeyEvent keyEvent) {
        if (getReactNativeHost().hasInstance() && getReactNativeHost().getUseDeveloperSupport() && i10 == 90) {
            getReactNativeHost().getReactInstanceManager().g0();
            return true;
        }
        return false;
    }

    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        return this.mReactDelegate.k(i10, keyEvent);
    }

    public boolean onNewIntent(Intent intent) {
        if (getReactNativeHost().hasInstance()) {
            getReactNativeHost().getReactInstanceManager().V(intent);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void onPause() {
        this.mReactDelegate.i();
    }

    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        this.mPermissionsCallback = new b(i10, strArr, iArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void onResume() {
        this.mReactDelegate.j();
        Callback callback = this.mPermissionsCallback;
        if (callback != null) {
            callback.invoke(new Object[0]);
            this.mPermissionsCallback = null;
        }
    }

    public void onWindowFocusChanged(boolean z10) {
        if (getReactNativeHost().hasInstance()) {
            getReactNativeHost().getReactInstanceManager().W(z10);
        }
    }

    @TargetApi(23)
    public void requestPermissions(String[] strArr, int i10, com.facebook.react.modules.core.f fVar) {
        this.mPermissionListener = fVar;
        getPlainActivity().requestPermissions(strArr, i10);
    }

    public k(j jVar, String str) {
        this.mActivity = jVar;
        this.mMainComponentName = str;
    }
}
