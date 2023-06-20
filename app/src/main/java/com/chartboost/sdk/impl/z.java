package com.chartboost.sdk.impl;

import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.ViewGroup;
import com.chartboost.sdk.Banner.BannerSize;

/* loaded from: classes.dex */
class z {
    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a(h0 h0Var, BannerSize bannerSize) {
        return a(h0Var, BannerSize.getWidth(bannerSize), BannerSize.getHeight(bannerSize));
    }

    private boolean a(h0 h0Var, int i10, int i11) {
        DisplayMetrics c10;
        if (h0Var == null || i10 <= 0 || i11 <= 0 || (c10 = h0Var.c()) == null) {
            return false;
        }
        ViewGroup.LayoutParams b10 = h0Var.b();
        if (b10 == null) {
            b10 = new ViewGroup.LayoutParams(-2, -2);
        }
        b10.width = (int) a(i10, c10);
        b10.height = (int) a(i11, c10);
        h0Var.a(b10);
        return true;
    }

    private float a(int i10, DisplayMetrics displayMetrics) {
        return TypedValue.applyDimension(1, i10, displayMetrics);
    }
}
