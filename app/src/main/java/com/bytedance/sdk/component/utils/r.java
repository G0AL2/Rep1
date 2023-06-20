package com.bytedance.sdk.component.utils;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import java.lang.reflect.Method;
import java.util.List;

/* compiled from: ProcessUtil.java */
/* loaded from: classes.dex */
public class r {

    /* renamed from: a  reason: collision with root package name */
    private static String f10467a;

    public static boolean a(Context context) {
        if (context == null) {
            return false;
        }
        return context.getApplicationContext().getPackageName().equals(b(context));
    }

    public static String b(Context context) {
        if (!TextUtils.isEmpty(f10467a)) {
            return f10467a;
        }
        String a10 = a();
        f10467a = a10;
        if (!TextUtils.isEmpty(a10)) {
            return f10467a;
        }
        String b10 = b();
        f10467a = b10;
        if (!TextUtils.isEmpty(b10)) {
            return f10467a;
        }
        String c10 = c(context);
        f10467a = c10;
        return c10;
    }

    private static String c(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        if (context == null) {
            return null;
        }
        int myPid = Process.myPid();
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null) {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.pid == myPid) {
                    return runningAppProcessInfo.processName;
                }
            }
        }
        return null;
    }

    private static String a() {
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                return Application.getProcessName();
            } catch (Exception e10) {
                e10.printStackTrace();
                return null;
            }
        }
        return null;
    }

    private static String b() {
        try {
            Method declaredMethod = Class.forName("android.app.ActivityThread", false, Application.class.getClassLoader()).getDeclaredMethod("currentProcessName", new Class[0]);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(null, new Object[0]);
            if (invoke instanceof String) {
                return (String) invoke;
            }
            return null;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }
}
