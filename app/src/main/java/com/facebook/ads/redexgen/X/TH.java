package com.facebook.ads.redexgen.X;

import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class TH extends NN {
    public static byte[] A06;
    public static final int A07;
    public static final int A08;
    public static final int A09;
    public final HorizontalScrollView A00;
    public final ImageView A01;
    public final LinearLayout A02;
    public final LinearLayout A03;
    public final C2D A04;
    public final C1400Xy A05;

    public static String A0B(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 8);
        }
        return new String(copyOfRange);
    }

    public static void A0C() {
        A06 = new byte[]{-57, -26, -24, -16, -92, -51, -48, -44, -58, -127, -94, -59, -127, -77, -58, -47, -48, -45, -43, -54, -49, -56};
    }

    static {
        A0C();
        A09 = (int) (Lr.A00 * 4.0f);
        A08 = (int) (Lr.A00 * 10.0f);
        A07 = (int) (Lr.A00 * 44.0f);
    }

    public TH(C1400Xy c1400Xy, InterfaceC1028Jh interfaceC1028Jh, String str) {
        super(c1400Xy, interfaceC1028Jh, str);
        this.A05 = c1400Xy;
        this.A04 = C2E.A00(c1400Xy.A00());
        this.A01 = new ImageView(getContext());
        ImageView imageView = this.A01;
        int i10 = A08;
        imageView.setPadding(i10, i10, i10, i10);
        this.A01.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.A01.setColorFilter(-10459280);
        int i11 = A07;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i11, i11);
        layoutParams.gravity = 16;
        this.A02 = new LinearLayout(getContext());
        this.A02.setOrientation(0);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.gravity = 17;
        this.A00 = new HorizontalScrollView(getContext());
        this.A00.setHorizontalScrollBarEnabled(false);
        this.A00.setLayoutParams(layoutParams2);
        this.A00.addView(this.A02, layoutParams2);
        this.A03 = new LinearLayout(getContext());
        this.A03.setOrientation(0);
        MS.A0M(this.A03, -218103809);
        this.A03.setMotionEventSplittingEnabled(false);
        this.A03.addView(this.A01, layoutParams);
        this.A03.addView(this.A00, layoutParams2);
        addView(this.A03, new FrameLayout.LayoutParams(-1, -1));
        this.A03.setClickable(true);
    }

    @Override // com.facebook.ads.redexgen.X.NN
    public final void A0L() {
        this.A01.setImageBitmap(C1095Mb.A01(EnumC1094Ma.CROSS));
        this.A01.setOnClickListener(new NW(this));
        this.A01.setContentDescription(A0B(4, 18, 89));
        NR nr = new NR(this.A05);
        nr.setData(this.A04.A0H(), EnumC1094Ma.HIDE_AD);
        nr.setOnClickListener(new NX(this, nr));
        NR nr2 = new NR(this.A05);
        nr2.setData(this.A04.A0L(), EnumC1094Ma.REPORT_AD);
        nr2.setOnClickListener(new NY(this, nr2));
        NR nr3 = new NR(this.A05);
        nr3.setData(this.A04.A0M(), EnumC1094Ma.AD_CHOICES_ICON);
        nr3.setOnClickListener(new NZ(this, nr3));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        int i10 = A09;
        layoutParams.setMargins(0, i10, i10, i10);
        MS.A0T(this.A03);
        this.A02.removeAllViews();
        this.A02.addView(nr, layoutParams);
        this.A02.addView(nr2, layoutParams);
        this.A02.addView(nr3, layoutParams);
    }

    @Override // com.facebook.ads.redexgen.X.NN
    public final void A0M() {
        MS.A0I(this);
        MS.A0J(this);
    }

    @Override // com.facebook.ads.redexgen.X.NN
    public final void A0N(C2H c2h, C2F c2f) {
        this.A01.setOnClickListener(null);
        TextView textView = new TextView(getContext());
        MS.A0X(textView, true, 14);
        textView.setText(this.A04.A0D());
        textView.setGravity(17);
        MS.A0T(this.A03);
        this.A03.removeAllViews();
        this.A03.addView(textView, new LinearLayout.LayoutParams(-1, -1));
    }

    @Override // com.facebook.ads.redexgen.X.NN
    public final void A0O(C2H c2h, C2F c2f) {
        MS.A0T(this.A03);
        this.A01.setImageBitmap(C1095Mb.A01(EnumC1094Ma.BACK_ARROW));
        this.A01.setOnClickListener(new View$OnClickListenerC1120Na(this));
        this.A01.setContentDescription(A0B(0, 4, 125));
        this.A02.removeAllViews();
        this.A00.fullScroll(17);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        int i10 = A09;
        layoutParams.setMargins(0, i10, i10, i10);
        for (C2H c2h2 : c2h.A05()) {
            NR nr = new NR(this.A05);
            nr.setData(c2h2.A04(), null);
            nr.setOnClickListener(new View$OnClickListenerC1121Nb(this, nr, c2h2));
            this.A02.addView(nr, layoutParams);
        }
    }

    @Override // com.facebook.ads.redexgen.X.NN
    public final boolean A0P() {
        return true;
    }
}
