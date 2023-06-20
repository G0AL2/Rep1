package com.bytedance.sdk.component.adexpress.c;

import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import java.lang.reflect.Method;

/* compiled from: ScreenUtils.java */
/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f9455a;

    public static float a(Context context, float f10) {
        if (context == null) {
            context = com.bytedance.sdk.component.adexpress.a.a.a.a().c().b();
        }
        return (f10 * d(context)) + 0.5f;
    }

    public static int a(float f10, float f11, float f12, float f13) {
        return (((int) ((f10 * 255.0f) + 0.5f)) << 24) | (((int) ((f11 * 255.0f) + 0.5f)) << 16) | (((int) ((f12 * 255.0f) + 0.5f)) << 8) | ((int) ((f13 * 255.0f) + 0.5f));
    }

    public static int b(Context context, float f10) {
        if (context == null) {
            context = com.bytedance.sdk.component.adexpress.a.a.a.a().c().b();
        }
        float d10 = d(context);
        if (d10 <= 0.0f) {
            d10 = 1.0f;
        }
        return (int) ((f10 / d10) + 0.5f);
    }

    public static float c(Context context, float f10) {
        if (context == null) {
            context = com.bytedance.sdk.component.adexpress.a.a.a.a().c().b();
        }
        return f10 * d(context);
    }

    private static float d(Context context) {
        try {
            if (f9455a) {
                Class<?> loadClass = context.getClassLoader().loadClass("android.util.DisplayMetrics");
                Method declaredMethod = loadClass.getDeclaredMethod("getDeviceDensity", new Class[0]);
                declaredMethod.setAccessible(true);
                return ((Integer) declaredMethod.invoke(loadClass, new Object[0])).intValue() / 160.0f;
            }
        } catch (Exception unused) {
        }
        return context.getResources().getDisplayMetrics().density;
    }

    public static int a(Context context) {
        if (context == null) {
            context = com.bytedance.sdk.component.adexpress.a.a.a.a().c().b();
        }
        return context.getResources().getDisplayMetrics().widthPixels;
    }

    public static int b(Context context) {
        if (context == null) {
            context = com.bytedance.sdk.component.adexpress.a.a.a.a().c().b();
        }
        return context.getResources().getDisplayMetrics().heightPixels;
    }

    public static int c(Context context) {
        if (context == null) {
            context = com.bytedance.sdk.component.adexpress.a.a.a.a().c().b();
        }
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        if (Build.VERSION.SDK_INT >= 17) {
            defaultDisplay.getRealMetrics(displayMetrics);
        } else {
            defaultDisplay.getMetrics(displayMetrics);
        }
        return displayMetrics.heightPixels;
    }
}
