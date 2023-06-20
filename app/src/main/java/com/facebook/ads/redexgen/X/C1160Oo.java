package com.facebook.ads.redexgen.X;

import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.Oo  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1160Oo extends RelativeLayout {
    public final View A00;
    public final OX A01;

    public C1160Oo(C1400Xy c1400Xy, View view) {
        super(c1400Xy);
        this.A00 = view;
        this.A01 = new OX(c1400Xy);
        MS.A0K(this.A01);
    }

    public final void A00(int i10) {
        this.A00.setLayoutParams(new RelativeLayout.LayoutParams(-1, i10));
    }

    public final void A01(@Nullable C1148Oc c1148Oc, boolean z10) {
        this.A01.addView(this.A00, new RelativeLayout.LayoutParams(-1, -2));
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(8, this.A00.getId());
        if (c1148Oc != null) {
            if (z10) {
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
                c1148Oc.setAlignment(3);
                layoutParams2.setMargins(AbstractC1151Of.A08 / 2, AbstractC1151Of.A08 / 2, AbstractC1151Of.A08 / 2, AbstractC1151Of.A08 / 2);
                linearLayout.addView(c1148Oc, layoutParams2);
                GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{-1778384896, 0});
                gradientDrawable.setCornerRadius(0.0f);
                gradientDrawable.setGradientType(0);
                MS.A0S(linearLayout, gradientDrawable);
            } else {
                RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams3.addRule(3, this.A01.getId());
                layoutParams3.setMargins(0, AbstractC1151Of.A08, 0, 0);
                c1148Oc.setAlignment(17);
                addView(c1148Oc, layoutParams3);
            }
        }
        this.A01.addView(linearLayout, layoutParams);
        addView(this.A01, new RelativeLayout.LayoutParams(-1, -2));
    }
}
