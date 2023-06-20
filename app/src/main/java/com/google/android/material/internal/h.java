package com.google.android.material.internal;

import android.content.Context;
import android.graphics.PorterDuff;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewParent;
import androidx.core.view.z;

/* compiled from: ViewUtils.java */
/* loaded from: classes3.dex */
public class h {
    public static float a(Context context, int i10) {
        return TypedValue.applyDimension(1, i10, context.getResources().getDisplayMetrics());
    }

    public static float b(View view) {
        float f10 = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            f10 += z.w((View) parent);
        }
        return f10;
    }

    public static PorterDuff.Mode c(int i10, PorterDuff.Mode mode) {
        if (i10 != 3) {
            if (i10 != 5) {
                if (i10 != 9) {
                    switch (i10) {
                        case 14:
                            return PorterDuff.Mode.MULTIPLY;
                        case 15:
                            return PorterDuff.Mode.SCREEN;
                        case 16:
                            return PorterDuff.Mode.ADD;
                        default:
                            return mode;
                    }
                }
                return PorterDuff.Mode.SRC_ATOP;
            }
            return PorterDuff.Mode.SRC_IN;
        }
        return PorterDuff.Mode.SRC_OVER;
    }
}
