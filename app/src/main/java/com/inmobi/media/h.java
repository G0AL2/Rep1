package com.inmobi.media;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* compiled from: CustomTabsPackageHelper.java */
/* loaded from: classes3.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    private static final String f25637a = "h";

    /* renamed from: b  reason: collision with root package name */
    private static String f25638b;

    private h() {
    }

    public static String a(Context context) {
        if (context != null && f25638b == null) {
            try {
                PackageManager packageManager = context.getPackageManager();
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.google.com"));
                ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 0);
                String str = resolveActivity != null ? resolveActivity.activityInfo.packageName : null;
                List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 0);
                ArrayList arrayList = new ArrayList();
                for (ResolveInfo resolveInfo : queryIntentActivities) {
                    Intent intent2 = new Intent();
                    intent2.setAction("android.support.customtabs.action.CustomTabsService");
                    intent2.setPackage(resolveInfo.activityInfo.packageName);
                    if (packageManager.resolveService(intent2, 0) != null) {
                        arrayList.add(resolveInfo.activityInfo.packageName);
                    }
                }
                if (arrayList.isEmpty()) {
                    f25638b = null;
                } else if (arrayList.size() == 1) {
                    f25638b = (String) arrayList.get(0);
                } else if (!TextUtils.isEmpty(str) && !a(context, intent) && arrayList.contains(str)) {
                    f25638b = str;
                } else if (arrayList.contains("com.android.chrome")) {
                    f25638b = "com.android.chrome";
                } else if (arrayList.contains("com.chrome.beta")) {
                    f25638b = "com.chrome.beta";
                } else if (arrayList.contains("com.chrome.dev")) {
                    f25638b = "com.chrome.dev";
                } else if (arrayList.contains("com.google.android.apps.chrome")) {
                    f25638b = "com.google.android.apps.chrome";
                }
            } catch (Exception unused) {
            }
            return f25638b;
        }
        return f25638b;
    }

    private static boolean a(Context context, Intent intent) {
        List<ResolveInfo> queryIntentActivities;
        try {
            queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 64);
        } catch (RuntimeException unused) {
            Log.e(f25637a, "Runtime exception while getting specialized handlers");
        }
        if (queryIntentActivities != null && queryIntentActivities.size() != 0) {
            for (ResolveInfo resolveInfo : queryIntentActivities) {
                IntentFilter intentFilter = resolveInfo.filter;
                if (intentFilter != null && intentFilter.countDataAuthorities() != 0 && intentFilter.countDataPaths() != 0 && resolveInfo.activityInfo != null) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }
}
