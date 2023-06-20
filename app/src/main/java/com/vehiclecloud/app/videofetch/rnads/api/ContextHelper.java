package com.vehiclecloud.app.videofetch.rnads.api;

import android.app.Activity;
import android.content.Context;
import com.facebook.react.bridge.ReactApplicationContext;

/* loaded from: classes3.dex */
public class ContextHelper {
    private ContextHelper() {
    }

    public static Context getActivity(ReactApplicationContext reactApplicationContext) {
        Activity currentActivity = reactApplicationContext.getCurrentActivity();
        return currentActivity != null ? currentActivity : reactApplicationContext;
    }

    public static String getString(Context context, String str) {
        return context.getString(context.getResources().getIdentifier(str, "string", context.getPackageName()));
    }

    public static boolean isDebug(Context context) {
        return (context.getApplicationInfo() == null || (context.getApplicationInfo().flags & 2) == 0) ? false : true;
    }
}
