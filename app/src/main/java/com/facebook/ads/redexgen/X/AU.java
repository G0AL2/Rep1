package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public final class AU {
    public int A00;
    public int A01;
    public C0814Ag A02;
    public boolean A03;

    public AU() {
    }

    public /* synthetic */ AU(AR ar) {
        this();
    }

    public static /* synthetic */ int A00(AU au) {
        return au.A01;
    }

    public static /* synthetic */ int A01(AU au) {
        return au.A00;
    }

    public static /* synthetic */ boolean A02(AU au) {
        return au.A03;
    }

    public final void A03(int i10) {
        this.A01 += i10;
    }

    public final void A04(int i10) {
        if (this.A03 && this.A00 != 4) {
            IK.A03(i10 == 4);
            return;
        }
        this.A03 = true;
        this.A00 = i10;
    }

    public final void A05(C0814Ag c0814Ag) {
        this.A02 = c0814Ag;
        this.A01 = 0;
        this.A03 = false;
    }

    public final boolean A06(C0814Ag c0814Ag) {
        return c0814Ag != this.A02 || this.A01 > 0 || this.A03;
    }
}
