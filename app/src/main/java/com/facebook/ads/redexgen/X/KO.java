package com.facebook.ads.redexgen.X;

import android.util.DisplayMetrics;
import android.view.View;
import android.widget.RelativeLayout;

/* loaded from: assets/audience_network.dex */
public final class KO {
    public static KM A00(DisplayMetrics displayMetrics) {
        int i10 = (int) (displayMetrics.widthPixels / displayMetrics.density);
        int i11 = (int) (displayMetrics.heightPixels / displayMetrics.density);
        if (C1086Ls.A04(i10, i11)) {
            return KM.A0H;
        }
        if (i11 > i10) {
            return KM.A0J;
        }
        return KM.A0G;
    }

    public static void A01(DisplayMetrics displayMetrics, View view, KK kk) {
        int ceil;
        if (((int) (displayMetrics.widthPixels / displayMetrics.density)) >= kk.A03()) {
            ceil = displayMetrics.widthPixels;
        } else {
            ceil = (int) Math.ceil(kk.A03() * displayMetrics.density);
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(ceil, (int) Math.ceil(kk.A02() * displayMetrics.density));
        layoutParams.addRule(14, -1);
        view.setLayoutParams(layoutParams);
    }
}
