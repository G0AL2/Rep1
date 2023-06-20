package com.facebook.ads.redexgen.X;

import android.graphics.drawable.GradientDrawable;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Mn  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1107Mn extends LinearLayout {
    public static byte[] A04;
    public static final int A05;
    public static final int A06;
    public static final int A07;
    public static final int A08;
    public static final int A09;
    public final ImageView A00;
    public final ImageView A01;
    public final C2D A02;
    public final C1400Xy A03;

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 91);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A04 = new byte[]{118, 83};
    }

    static {
        A03();
        A08 = (int) (Lr.A00 * 50.0f);
        A05 = (int) (Lr.A00 * 10.0f);
        A06 = (int) (Lr.A00 * 20.0f);
        A09 = (int) (Lr.A00 * 4.0f);
        A07 = (int) (Lr.A00 * 12.0f);
    }

    public C1107Mn(C1400Xy c1400Xy, int i10) {
        super(c1400Xy);
        this.A03 = c1400Xy;
        this.A02 = C2E.A00(c1400Xy.A00());
        setOrientation(0);
        this.A00 = new ImageView(c1400Xy);
        this.A01 = new ImageView(c1400Xy);
        A04(i10);
    }

    private void A04(int i10) {
        EnumC1094Ma enumC1094Ma;
        A05(this.A00, EnumC1094Ma.AD_CHOICES_ICON);
        if (i10 == 2) {
            int i11 = A05;
            setPadding(i11, i11 / 3, i11, i11 / 3);
            TextView textView = new TextView(this.A03);
            textView.setText(A02(0, 2, 108));
            textView.setTextColor(-1);
            int i12 = A05;
            textView.setPadding(0, i12 / 2, i12 / 2, i12 / 2);
            MS.A0X(textView, true, 13);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 16;
            addView(textView, layoutParams);
            int i13 = A07;
            LinearLayout.LayoutParams adChoicesIconParams = new LinearLayout.LayoutParams(i13, i13);
            adChoicesIconParams.gravity = 16;
            addView(this.A00, adChoicesIconParams);
            return;
        }
        int i14 = A05;
        setPadding(i14, i14, i14, i14);
        if (i10 == 1) {
            enumC1094Ma = EnumC1094Ma.AN_INFO_ICON;
        } else {
            enumC1094Ma = EnumC1094Ma.DEFAULT_INFO_ICON;
        }
        A05(this.A01, enumC1094Ma);
        int i15 = A06;
        LinearLayout.LayoutParams infoButtonParams = new LinearLayout.LayoutParams(i15, i15);
        infoButtonParams.gravity = 17;
        addView(this.A01, infoButtonParams);
        int i16 = A06;
        LinearLayout.LayoutParams infoButtonParams2 = new LinearLayout.LayoutParams(i16, i16);
        infoButtonParams2.setMargins(A09, 0, 0, 0);
        infoButtonParams2.gravity = 17;
        addView(this.A00, infoButtonParams2);
    }

    public static void A05(ImageView imageView, EnumC1094Ma enumC1094Ma) {
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setImageBitmap(C1095Mb.A01(enumC1094Ma));
        imageView.setColorFilter(-1);
    }

    public void setAdDetails(C1U c1u, String str, C1036Jp c1036Jp, InterfaceC1110Mq interfaceC1110Mq) {
        setOnClickListener(new View$OnClickListenerC1106Mm(this, c1036Jp, interfaceC1110Mq, str, c1u));
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(A08);
        gradientDrawable.setColor(i10);
        MS.A0S(this, gradientDrawable);
    }

    public void setIconColors(int i10) {
        this.A00.setColorFilter(i10);
        this.A01.setColorFilter(i10);
    }
}
