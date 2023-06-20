package com.facebook.ads.redexgen.X;

import android.widget.LinearLayout;

/* loaded from: assets/audience_network.dex */
public final class OY extends LinearLayout {
    public static final int A06 = (int) (Lr.A00 * 4.0f);
    public int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final C1400Xy A04;
    public final OZ[] A05;

    public OY(C1400Xy c1400Xy, int i10, int i11, int i12, int i13) {
        super(c1400Xy);
        this.A00 = A06;
        this.A04 = c1400Xy;
        setOrientation(0);
        this.A03 = i10;
        this.A01 = i12;
        this.A02 = i13;
        this.A05 = new OZ[i11];
        for (int i14 = 0; i14 < i11; i14++) {
            this.A05[i14] = A00();
            addView(this.A05[i14]);
        }
        A01();
    }

    private OZ A00() {
        OZ oz = new OZ(this.A04, this.A01, this.A02);
        int i10 = this.A03;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i10, i10);
        layoutParams.gravity = 16;
        oz.setLayoutParams(layoutParams);
        return oz;
    }

    private void A01() {
        int i10 = 0;
        while (true) {
            OZ[] ozArr = this.A05;
            if (i10 < ozArr.length) {
                ((LinearLayout.LayoutParams) ozArr[i10].getLayoutParams()).leftMargin = i10 == 0 ? 0 : this.A00;
                i10++;
            } else {
                requestLayout();
                return;
            }
        }
    }

    private void A02(float f10) {
        for (int i10 = 0; i10 < this.A05.length; i10++) {
            float min = Math.min(1.0f, f10 - i10);
            if (min < 0.0f) {
                min = 0.0f;
            }
            this.A05[i10].setFillRatio(min);
        }
    }

    public void setItemSpacing(int i10) {
        this.A00 = i10;
        A01();
    }

    public void setRating(float f10) {
        A02(f10);
    }
}
