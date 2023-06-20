package com.vehiclecloud.app.videofetch.webview;

import android.app.Activity;
import android.util.Log;
import android.webkit.WebView;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.vehiclecloud.app.videofetch.rndownloader.util.Scopes;

/* loaded from: classes3.dex */
public class RNWebViewModule extends ReactContextBaseJavaModule {
    private static final String TAG = "RNWebViewModule";

    /* renamed from: ua */
    private String f28649ua;

    public RNWebViewModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    public static /* synthetic */ void g(RNWebViewModule rNWebViewModule, Promise promise) {
        rNWebViewModule.lambda$userAgent$0(promise);
    }

    private String getWebViewUA() {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity != null) {
            return new WebView(currentActivity).getSettings().getUserAgentString();
        }
        throw new RuntimeException("activity not available");
    }

    public /* synthetic */ void lambda$userAgent$0(Promise promise) {
        try {
            String webViewUA = getWebViewUA();
            this.f28649ua = webViewUA;
            promise.resolve(webViewUA);
        } catch (Exception e10) {
            Log.e(TAG, "getWebViewUA get ex:", e10);
            promise.reject(e10);
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return TAG;
    }

    @ReactMethod
    public void userAgent(final Promise promise) {
        String str = this.f28649ua;
        if (str != null) {
            promise.resolve(str);
        } else {
            Scopes.main().post(new Runnable() { // from class: com.vehiclecloud.app.videofetch.webview.c
                @Override // java.lang.Runnable
                public final void run() {
                    RNWebViewModule.g(RNWebViewModule.this, promise);
                }
            });
        }
    }
}
