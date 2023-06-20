package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

/* loaded from: assets/audience_network.dex */
public final class PZ extends LinearLayout {
    public static final int A04 = (int) (Lr.A00 * 32.0f);
    public static final int A05 = (int) (Lr.A00 * 8.0f);
    public TextView A00;
    public TextView A01;
    public OW A02;
    public final C1400Xy A03;

    public PZ(C1400Xy c1400Xy) {
        super(c1400Xy);
        this.A03 = c1400Xy;
        A00(c1400Xy);
    }

    private final void A00(C1400Xy c1400Xy) {
        setGravity(16);
        this.A02 = new OW(c1400Xy);
        this.A02.setFullCircleCorners(true);
        int i10 = A04;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i10, i10);
        layoutParams.setMargins(0, 0, A05, 0);
        addView(this.A02, layoutParams);
        LinearLayout linearLayout = new LinearLayout(c1400Xy);
        linearLayout.setOrientation(1);
        this.A00 = new TextView(c1400Xy);
        ViewGroup.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        MS.A0X(this.A00, true, 16);
        this.A00.setEllipsize(TextUtils.TruncateAt.END);
        this.A00.setSingleLine(true);
        this.A01 = new TextView(c1400Xy);
        MS.A0X(this.A01, false, 14);
        linearLayout.addView(this.A00);
        linearLayout.addView(this.A01);
        addView(linearLayout, layoutParams2);
    }

    public final void A01(int i10, int i11) {
        this.A00.setTextColor(i10);
        this.A01.setTextColor(i11);
    }

    public void setPageDetails(C1U c1u) {
        T3 t32 = new T3(this.A02, this.A03);
        int i10 = A04;
        t32.A05(i10, i10);
        t32.A07(c1u.A01());
        this.A00.setText(c1u.A02());
        this.A01.setText(c1u.A03());
    }
}
