package com.bytedance.sdk.openadsdk.utils;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;

/* compiled from: OpenUtils.java */
/* loaded from: classes.dex */
public class k {
    public static void a(Activity activity, String str) {
        if (c(activity, str)) {
            com.bytedance.sdk.component.utils.b.a(activity, new Intent("android.intent.action.VIEW", Uri.parse(str)), null);
        }
    }

    public static boolean b(Activity activity, String str) {
        if (c(activity, str)) {
            Uri parse = Uri.parse(str);
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(parse);
            try {
                activity.startActivity(intent);
                return true;
            } catch (Throwable th) {
                th.printStackTrace();
                return false;
            }
        }
        return false;
    }

    public static boolean c(Activity activity, String str) {
        return a(activity) && !TextUtils.isEmpty(str);
    }

    public static boolean a(Activity activity) {
        return (activity == null || activity.isDestroyed() || activity.isFinishing()) ? false : true;
    }
}
