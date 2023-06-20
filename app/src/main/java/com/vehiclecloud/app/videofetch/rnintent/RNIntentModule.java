package com.vehiclecloud.app.videofetch.rnintent;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.react.bridge.BaseActivityEventListener;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public class RNIntentModule extends ReactContextBaseJavaModule {
    private static final String TAG = "RNIntent";
    private static final Pattern urlRegex = Pattern.compile("(https|http|vc)://[^\\s|^\\n]*");
    private String url;

    public RNIntentModule(final ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        if (reactApplicationContext == null) {
            return;
        }
        reactApplicationContext.addLifecycleEventListener(new LifecycleEventListener() { // from class: com.vehiclecloud.app.videofetch.rnintent.RNIntentModule.1
            @Override // com.facebook.react.bridge.LifecycleEventListener
            public void onHostDestroy() {
            }

            @Override // com.facebook.react.bridge.LifecycleEventListener
            public void onHostPause() {
            }

            @Override // com.facebook.react.bridge.LifecycleEventListener
            public void onHostResume() {
                Activity currentActivity = reactApplicationContext.getCurrentActivity();
                if (currentActivity != null) {
                    RNIntentModule.this.initUrl(currentActivity.getIntent());
                }
                reactApplicationContext.removeLifecycleEventListener(this);
            }
        });
        reactApplicationContext.addActivityEventListener(new BaseActivityEventListener() { // from class: com.vehiclecloud.app.videofetch.rnintent.RNIntentModule.2
            @Override // com.facebook.react.bridge.BaseActivityEventListener, com.facebook.react.bridge.ActivityEventListener
            public void onNewIntent(Intent intent) {
                RNIntentModule.this.initUrl(intent);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void initUrl(Intent intent) {
        if (intent == null) {
            this.url = null;
        } else if ("android.intent.action.VIEW".equals(intent.getAction())) {
            Uri data = intent.getData();
            this.url = data != null ? data.toString() : null;
        } else {
            Bundle extras = intent.getExtras();
            if (extras == null) {
                this.url = null;
                return;
            }
            String string = extras.getString("android.intent.extra.TEXT");
            if (string == null) {
                this.url = null;
                return;
            }
            Matcher matcher = urlRegex.matcher(string);
            if (!matcher.find()) {
                this.url = null;
            } else {
                this.url = matcher.group();
            }
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return TAG;
    }

    @ReactMethod
    public void launchApp(String str, Promise promise) {
        try {
            Intent launchIntentForPackage = getReactApplicationContext().getPackageManager().getLaunchIntentForPackage(str);
            if (launchIntentForPackage == null) {
                promise.resolve(Boolean.FALSE);
                return;
            }
            launchIntentForPackage.addCategory("android.intent.category.LAUNCHER");
            getReactApplicationContext().startActivity(launchIntentForPackage);
            promise.resolve(Boolean.TRUE);
        } catch (Exception unused) {
            promise.resolve(Boolean.FALSE);
        }
    }

    @ReactMethod
    public void sharedUrl(Promise promise) {
        promise.resolve(this.url);
    }
}
