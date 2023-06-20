package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Oe  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1150Oe {
    public static final int A00 = Lr.A01.heightPixels;
    public static final int A01 = Lr.A01.widthPixels;

    public static float A00(C1B c1b) {
        int A012 = c1b.A0D().A01();
        int height = c1b.A0D().A00();
        if (height > 0) {
            return A012 / height;
        }
        return -1.0f;
    }

    public static int A01(double d10) {
        return (int) ((A01 - (AbstractC1151Of.A08 * 2)) / d10);
    }

    public static int A02(int ctaTextHeight) {
        int ctaMargin = MS.A01(16);
        int i10 = OQ.A0A * 2;
        int ctaSpacing = AbstractC1151Of.A08;
        int ctaMargin2 = ctaMargin + i10 + (ctaSpacing * 2);
        int bottomMargin = A00;
        return (bottomMargin - ctaTextHeight) - ctaMargin2;
    }

    public static boolean A03(double d10) {
        return d10 < 0.9d;
    }

    public static boolean A04(double d10, int i10) {
        return A02(i10) < A01(d10);
    }

    public static boolean A05(int i10, int i11, double d10) {
        return i10 == 2 || A04(d10, i11);
    }
}
