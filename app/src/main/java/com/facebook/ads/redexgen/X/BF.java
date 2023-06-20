package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public final class BF extends C1588cB {
    public static String[] A08 = {"bHvO3zM", "7z8VpEP", "iw2Y0c", "LME8njBPiXs011hhslbtp", "9K0lNzbR5X2b0vS5", "Pt0EnZUFnGQLsNks8pQcEgn0FivkNzUh", "t6anbflpJj2CGicCnIMdWTRCydsD", "D9TL9YTSSd0lWzGeUvgWfvwaUF0YdAOx"};
    public float A00;
    public int A01;
    public int A02;
    public BG A03;
    public int[] A04;
    public final C1400Xy A05;
    public final PT A06;
    public final PU A07;

    public BF(C1400Xy c1400Xy, PU pu, PT pt) {
        super(c1400Xy);
        this.A02 = 0;
        this.A00 = 50.0f;
        this.A05 = c1400Xy;
        this.A07 = pu;
        this.A06 = pt;
        this.A01 = -1;
        this.A03 = new BG(this, this.A05);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0029, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
        if (r0 != 1) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0022, code lost:
        if (r0 == 0) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:
        super.A1J(r17, r18, r19, r20);
     */
    @Override // com.facebook.ads.redexgen.X.C4T
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A1J(com.facebook.ads.redexgen.X.C06674b r17, com.facebook.ads.redexgen.X.C06744i r18, int r19, int r20) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.BF.A1J(com.facebook.ads.redexgen.X.4b, com.facebook.ads.redexgen.X.4i, int, int):void");
    }

    @Override // com.facebook.ads.redexgen.X.C1588cB, com.facebook.ads.redexgen.X.C4T
    public final void A1t(int i10) {
        A2F(i10, this.A02);
    }

    @Override // com.facebook.ads.redexgen.X.C1588cB, com.facebook.ads.redexgen.X.C4T
    public final void A21(F9 f92, C06744i c06744i, int i10) {
        this.A03.A0A(i10);
        A1L(this.A03);
    }

    public final void A2K(double d10) {
        if (d10 <= 0.0d) {
            d10 = 1.0d;
        }
        this.A00 = (float) (50.0d / d10);
        this.A03 = new BG(this, this.A05);
    }

    public final void A2L(int i10) {
        this.A01 = i10;
    }

    public final void A2M(int i10) {
        this.A02 = i10;
    }
}
