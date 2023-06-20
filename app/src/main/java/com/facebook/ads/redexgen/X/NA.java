package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/* loaded from: assets/audience_network.dex */
public final class NA extends LinearLayout {
    public static final int A06 = (int) (Lr.A00 * 10.0f);
    public static final int A07 = (int) (Lr.A00 * 44.0f);
    public int A00;
    public boolean A01;
    public final ImageView A02;
    public final LinearLayout A03;
    public final TextView A04;
    public final OP A05;

    public NA(C1400Xy c1400Xy, int i10) {
        super(c1400Xy);
        this.A01 = false;
        this.A02 = new ImageView(c1400Xy);
        ImageView imageView = this.A02;
        int i11 = A06;
        imageView.setPadding(i11, i11, i11, i11);
        this.A05 = new OP(c1400Xy);
        this.A05.setProgress(0.0f);
        OP op = this.A05;
        int i12 = A06;
        op.setPadding(i12, i12, i12, i12);
        this.A04 = new TextView(c1400Xy);
        setOrientation(0);
        this.A03 = new LinearLayout(c1400Xy);
        this.A00 = i10;
        A00();
    }

    private void A00() {
        setToolbarActionMode(this.A00);
        LinearLayout.LayoutParams actionIconParams = new LinearLayout.LayoutParams(-2, -2);
        setGravity(17);
        int i10 = A07;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i10, i10);
        MS.A0X(this.A04, true, 16);
        this.A04.setTextColor(-1);
        this.A04.setVisibility(8);
        this.A03.addView(this.A02, layoutParams);
        this.A03.addView(this.A05, layoutParams);
        addView(this.A03, actionIconParams);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 17;
        addView(this.A04, layoutParams2);
    }

    private void A01() {
        int i10;
        OP op = this.A05;
        if (this.A00 == 2) {
            i10 = this.A01 ? 4 : 0;
        } else {
            i10 = 8;
        }
        op.setVisibility(i10);
        this.A02.setVisibility(this.A00 == 2 ? 8 : 0);
    }

    public final boolean A02() {
        return !this.A04.getText().toString().isEmpty();
    }

    public final boolean A03() {
        int i10 = this.A00;
        return (i10 == 2 || i10 == 4) ? false : true;
    }

    public void setActionClickListener(View.OnClickListener onClickListener) {
        setOnClickListener(onClickListener);
    }

    public void setColors(int i10) {
        this.A05.A02(C2U.A01(i10, 77), i10);
        this.A02.setColorFilter(i10);
    }

    public void setInitialUnskippableSeconds(int i10) {
        if (i10 > 0) {
            setToolbarActionMode(2);
        }
    }

    public void setProgress(float f10) {
        this.A05.setProgressWithAnimation(f10);
    }

    public void setProgressSpinnerInvisible(boolean z10) {
        this.A01 = z10;
        A01();
    }

    public void setToolbarActionMode(int i10) {
        EnumC1094Ma enumC1094Ma;
        this.A00 = i10;
        A01();
        setVisibility(0);
        if (i10 == 0) {
            enumC1094Ma = EnumC1094Ma.CROSS;
        } else if (i10 == 1) {
            enumC1094Ma = EnumC1094Ma.SKIP_ARROW;
        } else if (i10 == 3) {
            enumC1094Ma = EnumC1094Ma.MINIMIZE_ARROW;
        } else if (i10 != 4) {
            enumC1094Ma = EnumC1094Ma.CROSS;
        } else {
            enumC1094Ma = EnumC1094Ma.CROSS;
            this.A02.setVisibility(8);
            setVisibility(8);
        }
        this.A02.setImageBitmap(C1095Mb.A01(enumC1094Ma));
        MS.A0G(1002, this.A02);
    }

    public void setToolbarMessage(String str) {
        this.A04.setText(str);
        this.A04.setVisibility(TextUtils.isEmpty(str) ? 8 : 0);
    }

    public void setToolbarMessageEnabled(boolean z10) {
        this.A04.setVisibility(z10 ? 0 : 4);
    }
}
