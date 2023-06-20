package com.facebook.react.uimanager;

import android.util.DisplayMetrics;
import android.util.TypedValue;

/* compiled from: PixelUtil.java */
/* loaded from: classes.dex */
public class r {
    public static float a(float f10) {
        return f10 / c.d().density;
    }

    public static float b(double d10) {
        return c((float) d10);
    }

    public static float c(float f10) {
        return TypedValue.applyDimension(1, f10, c.d());
    }

    public static float d(double d10) {
        return e((float) d10);
    }

    public static float e(float f10) {
        return f(f10, Float.NaN);
    }

    public static float f(float f10, float f11) {
        DisplayMetrics d10 = c.d();
        float f12 = d10.scaledDensity;
        float f13 = d10.density;
        float f14 = f12 / f13;
        if (f11 >= 1.0f && f11 < f14) {
            f12 = f13 * f11;
        }
        return f10 * f12;
    }
}
