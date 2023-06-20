package com.vehiclecloud.app.videofetch.rnfullscreen;

import android.app.Activity;
import android.view.Window;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.UiThreadUtil;
import com.vehiclecloud.app.videofetch.rnfullscreen.RNFullScreenModule;
import fm.castbox.mediation.BuildConfig;

/* loaded from: classes3.dex */
public class RNFullScreenModule extends ReactContextBaseJavaModule {
    private static final int DISABLED_VALUE = -1;
    private static final int FLAG_HIDDEN = 5894;
    private static final String TAG = "RNFullScreen";
    private int cachedVisibility;

    public RNFullScreenModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.cachedVisibility = -1;
    }

    public static /* synthetic */ void g(RNFullScreenModule rNFullScreenModule) {
        rNFullScreenModule.lambda$disable$1();
    }

    public static /* synthetic */ void i(RNFullScreenModule rNFullScreenModule) {
        rNFullScreenModule.lambda$enable$0();
    }

    public /* synthetic */ void lambda$disable$1() {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            return;
        }
        currentActivity.getWindow().getDecorView().setSystemUiVisibility(this.cachedVisibility);
        this.cachedVisibility = -1;
    }

    public /* synthetic */ void lambda$enable$0() {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            return;
        }
        Window window = currentActivity.getWindow();
        int systemUiVisibility = window.getDecorView().getSystemUiVisibility();
        if (!isEnabled()) {
            this.cachedVisibility = systemUiVisibility;
        }
        if (systemUiVisibility == FLAG_HIDDEN) {
            return;
        }
        window.getDecorView().setSystemUiVisibility(FLAG_HIDDEN);
    }

    @ReactMethod
    public void disable() {
        if (isEnabled()) {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: ae.a
                @Override // java.lang.Runnable
                public final void run() {
                    RNFullScreenModule.g(RNFullScreenModule.this);
                }
            });
        }
    }

    @ReactMethod
    public void enable() {
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: ae.b
            @Override // java.lang.Runnable
            public final void run() {
                RNFullScreenModule.i(RNFullScreenModule.this);
            }
        });
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return TAG;
    }

    @ReactMethod(isBlockingSynchronousMethod = BuildConfig.SHOULD_GZIP_HTTP_REQUEST)
    public boolean isEnabled() {
        return this.cachedVisibility != -1;
    }
}
