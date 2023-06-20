package com.facebook.react.uimanager;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;

/* compiled from: DisplayMetricsHolder.java */
/* loaded from: classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private static DisplayMetrics f15753a;

    /* renamed from: b  reason: collision with root package name */
    private static DisplayMetrics f15754b;

    public static WritableMap a(double d10) {
        f6.a.b((f15753a == null || f15754b == null) ? false : true, "DisplayMetricsHolder must be initialized with initDisplayMetricsIfNotInitialized or initDisplayMetrics");
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putMap("windowPhysicalPixels", b(f15753a, d10));
        writableNativeMap.putMap("screenPhysicalPixels", b(f15754b, d10));
        return writableNativeMap;
    }

    private static WritableMap b(DisplayMetrics displayMetrics, double d10) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putInt("width", displayMetrics.widthPixels);
        writableNativeMap.putInt("height", displayMetrics.heightPixels);
        writableNativeMap.putDouble("scale", displayMetrics.density);
        writableNativeMap.putDouble("fontScale", d10);
        writableNativeMap.putDouble("densityDpi", displayMetrics.densityDpi);
        return writableNativeMap;
    }

    public static DisplayMetrics c() {
        return f15754b;
    }

    @Deprecated
    public static DisplayMetrics d() {
        return f15753a;
    }

    public static void e(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        h(displayMetrics);
        DisplayMetrics displayMetrics2 = new DisplayMetrics();
        displayMetrics2.setTo(displayMetrics);
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        f6.a.d(windowManager, "WindowManager is null!");
        windowManager.getDefaultDisplay().getRealMetrics(displayMetrics2);
        g(displayMetrics2);
    }

    public static void f(Context context) {
        if (c() != null) {
            return;
        }
        e(context);
    }

    public static void g(DisplayMetrics displayMetrics) {
        f15754b = displayMetrics;
    }

    public static void h(DisplayMetrics displayMetrics) {
        f15753a = displayMetrics;
    }
}
