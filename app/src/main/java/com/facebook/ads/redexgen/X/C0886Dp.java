package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Dp  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0886Dp {
    public int A00;
    public long A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final InterfaceC0879Di A05;
    public final C1003Ii A06 = new C1003Ii(new byte[64]);
    public final C1016Iv A07;

    public C0886Dp(InterfaceC0879Di interfaceC0879Di, C1016Iv c1016Iv) {
        this.A05 = interfaceC0879Di;
        this.A07 = c1016Iv;
    }

    private void A00() {
        this.A06.A08(8);
        this.A03 = this.A06.A0F();
        this.A02 = this.A06.A0F();
        this.A06.A08(6);
        this.A00 = this.A06.A04(8);
    }

    private void A01() {
        this.A01 = 0L;
        if (this.A03) {
            this.A06.A08(4);
            this.A06.A08(1);
            this.A06.A08(1);
            long A04 = (this.A06.A04(3) << 30) | (this.A06.A04(15) << 15) | this.A06.A04(15);
            this.A06.A08(1);
            if (!this.A04 && this.A02) {
                this.A06.A08(4);
                this.A06.A08(1);
                this.A06.A08(1);
                this.A06.A08(1);
                this.A07.A07((this.A06.A04(3) << 30) | (this.A06.A04(15) << 15) | this.A06.A04(15));
                this.A04 = true;
            }
            long pts = this.A07.A07(A04);
            this.A01 = pts;
        }
    }

    public final void A02() {
        this.A04 = false;
        this.A05.AEK();
    }

    public final void A03(C1004Ij c1004Ij) throws C0813Af {
        c1004Ij.A0c(this.A06.A00, 0, 3);
        this.A06.A07(0);
        A00();
        c1004Ij.A0c(this.A06.A00, 0, this.A00);
        this.A06.A07(0);
        A01();
        this.A05.AD4(this.A01, true);
        this.A05.A48(c1004Ij);
        this.A05.AD3();
    }
}
