package com.reactnativerestart;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.m;
import com.facebook.react.p;

/* loaded from: classes3.dex */
public class RestartModule extends ReactContextBaseJavaModule {
    private static final String REACT_APPLICATION_CLASS_NAME = "com.facebook.react.ReactApplication";
    private static final String REACT_NATIVE_HOST_CLASS_NAME = "com.facebook.react.ReactNativeHost";
    private static com.reactnativerestart.a mReactInstanceHolder;
    private LifecycleEventListener mLifecycleEventListener;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Activity f28401a;

        a(RestartModule restartModule, Activity activity) {
            this.f28401a = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f28401a.recreate();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p f28402a;

        b(p pVar) {
            this.f28402a = pVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f28402a.Z();
            } catch (Throwable unused) {
                RestartModule.this.loadBundleLegacy();
            }
        }
    }

    public RestartModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mLifecycleEventListener = null;
    }

    private void clearLifecycleEventListener() {
        if (this.mLifecycleEventListener != null) {
            getReactApplicationContext().removeLifecycleEventListener(this.mLifecycleEventListener);
            this.mLifecycleEventListener = null;
        }
    }

    static p getReactInstanceManager() {
        com.reactnativerestart.a aVar = mReactInstanceHolder;
        if (aVar == null) {
            return null;
        }
        return aVar.a();
    }

    private void loadBundle() {
        clearLifecycleEventListener();
        try {
            p resolveInstanceManager = resolveInstanceManager();
            if (resolveInstanceManager == null) {
                return;
            }
            new Handler(Looper.getMainLooper()).post(new b(resolveInstanceManager));
        } catch (Throwable unused) {
            loadBundleLegacy();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void loadBundleLegacy() {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            return;
        }
        currentActivity.runOnUiThread(new a(this, currentActivity));
    }

    private p resolveInstanceManager() throws NoSuchFieldException, IllegalAccessException {
        p reactInstanceManager = getReactInstanceManager();
        if (reactInstanceManager != null) {
            return reactInstanceManager;
        }
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            return null;
        }
        return ((m) currentActivity.getApplication()).getReactNativeHost().getReactInstanceManager();
    }

    @ReactMethod
    public void Restart() {
        loadBundle();
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNRestart";
    }
}
