package com.facebook.ads.redexgen.X;

import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class TG extends NN {
    public static byte[] A05;
    public static final int A06;
    public static final int A07;
    public static final int A08;
    public final ImageView A00;
    public final LinearLayout A01;
    public final ScrollView A02;
    public final C2D A03;
    public final C1400Xy A04;

    public static String A0B(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 55);
        }
        return new String(copyOfRange);
    }

    public static void A0C() {
        A05 = new byte[]{53, 22, 20, 28, 105, 70, 69, 89, 79, 10, 107, 78, 10, 120, 79, 90, 69, 88, 94, 67, 68, 77};
    }

    static {
        A0C();
        A08 = (int) (Lr.A00 * 8.0f);
        A07 = (int) (Lr.A00 * 10.0f);
        A06 = (int) (Lr.A00 * 44.0f);
    }

    public TG(C1400Xy c1400Xy, InterfaceC1028Jh interfaceC1028Jh, String str) {
        super(c1400Xy, interfaceC1028Jh, str);
        this.A04 = c1400Xy;
        this.A03 = C2E.A00(this.A04.A00());
        this.A00 = new ImageView(getContext());
        ImageView imageView = this.A00;
        int i10 = A07;
        imageView.setPadding(i10, i10, i10, i10);
        this.A00.setColorFilter(-10459280);
        int i11 = A06;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i11, i11);
        layoutParams.gravity = 3;
        this.A00.setLayoutParams(layoutParams);
        this.A02 = new ScrollView(getContext());
        this.A02.setFillViewport(true);
        MS.A0M(this.A02, -218103809);
        this.A01 = new LinearLayout(getContext());
        this.A01.setOrientation(1);
        LinearLayout linearLayout = this.A01;
        int i12 = A08;
        linearLayout.setPadding(i12, i12, i12, i12);
        this.A02.addView(this.A01, new FrameLayout.LayoutParams(-1, -2));
        addView(this.A02, new FrameLayout.LayoutParams(-1, -1));
    }

    @Override // com.facebook.ads.redexgen.X.NN
    public final void A0L() {
        this.A00.setImageBitmap(C1095Mb.A01(EnumC1094Ma.CROSS));
        this.A00.setOnClickListener(new View$OnClickListenerC1126Ng(this));
        this.A00.setContentDescription(A0B(4, 18, 29));
        NR nr = new NR(this.A04);
        nr.setData(this.A03.A0H(), EnumC1094Ma.HIDE_AD);
        nr.setOnClickListener(new View$OnClickListenerC1127Nh(this, nr));
        NR nr2 = new NR(this.A04);
        nr2.setData(this.A03.A0L(), EnumC1094Ma.REPORT_AD);
        nr2.setOnClickListener(new View$OnClickListenerC1128Ni(this, nr2));
        NR nr3 = new NR(this.A04);
        nr3.setData(this.A03.A0M(), EnumC1094Ma.AD_CHOICES_ICON);
        nr3.setOnClickListener(new View$OnClickListenerC1129Nj(this, nr3));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        int i10 = A08;
        layoutParams.setMargins(i10, i10, i10, i10);
        layoutParams.gravity = 17;
        LinearLayout menuLayout = new LinearLayout(getContext());
        menuLayout.setOrientation(1);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, 0);
        layoutParams2.gravity = 17;
        layoutParams2.weight = 1.0f;
        MS.A0T(this.A01);
        this.A01.removeAllViews();
        this.A01.addView(this.A00);
        this.A01.addView(menuLayout, layoutParams2);
        menuLayout.addView(nr, layoutParams);
        menuLayout.addView(nr2, layoutParams);
        menuLayout.addView(nr3, layoutParams);
    }

    @Override // com.facebook.ads.redexgen.X.NN
    public final void A0M() {
        MS.A0I(this);
        MS.A0J(this);
    }

    @Override // com.facebook.ads.redexgen.X.NN
    public final void A0N(C2H c2h, C2F c2f) {
        String A0H;
        EnumC1094Ma enumC1094Ma;
        int i10;
        this.A00.setOnClickListener(null);
        if (c2f == C2F.A05) {
            A0H = this.A03.A0F();
            enumC1094Ma = EnumC1094Ma.REPORT_AD;
            i10 = -552389;
        } else {
            A0H = this.A03.A0H();
            enumC1094Ma = EnumC1094Ma.HIDE_AD;
            i10 = -13272859;
        }
        NM A0M = new NL(this.A04, this.A0B).A0I(A0H).A0H(this.A03.A0D()).A0F(c2h.A04()).A0K(false).A0E(enumC1094Ma).A0D(i10).A0L(false).A0J(false).A0M();
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
        layoutParams.gravity = 17;
        layoutParams.weight = 1.0f;
        MS.A0T(this.A01);
        this.A02.fullScroll(33);
        this.A01.removeAllViews();
        this.A01.addView(A0M, layoutParams);
    }

    @Override // com.facebook.ads.redexgen.X.NN
    public final void A0O(C2H c2h, C2F c2f) {
        C1125Nf c1125Nf = new C1125Nf(this.A04, c2h, this.A0B, c2f == C2F.A05 ? EnumC1094Ma.REPORT_AD : EnumC1094Ma.HIDE_AD);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, 0);
        layoutParams.gravity = 17;
        layoutParams.weight = 1.0f;
        this.A00.setImageBitmap(C1095Mb.A01(EnumC1094Ma.BACK_ARROW));
        this.A00.setOnClickListener(new View$OnClickListenerC1130Nk(this));
        this.A00.setContentDescription(A0B(0, 4, 64));
        MS.A0T(this.A01);
        this.A02.fullScroll(33);
        this.A01.removeAllViews();
        this.A01.addView(this.A00);
        this.A01.addView(c1125Nf, layoutParams);
    }

    @Override // com.facebook.ads.redexgen.X.NN
    public final boolean A0P() {
        return true;
    }
}
