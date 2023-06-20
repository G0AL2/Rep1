package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public final class Dh implements InterfaceC1352Wc {
    public final int A00;
    public final int A01;
    public final long A02;
    public final long A03;
    public final long A04;

    public Dh(long j10, long j11, Ci ci) {
        this.A04 = j11;
        this.A01 = ci.A02;
        this.A00 = ci.A00;
        if (j10 == -1) {
            this.A02 = -1L;
            this.A03 = -9223372036854775807L;
            return;
        }
        this.A02 = j10 - j11;
        this.A03 = A7e(j10);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0867Cl
    public final long A6S() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0867Cl
    public final C0866Ck A7O(long positionOffset) {
        long j10 = this.A02;
        if (j10 == -1) {
            return new C0866Ck(new C0868Cm(0L, this.A04));
        }
        int i10 = this.A01;
        long A0E = C1020Iz.A0E((((this.A00 * positionOffset) / 8000000) / i10) * i10, 0L, j10 - i10);
        long j11 = this.A04 + A0E;
        long A7e = A7e(j11);
        C0868Cm seekPoint = new C0868Cm(A7e, j11);
        if (A7e < positionOffset) {
            long j12 = this.A02;
            int i11 = this.A01;
            if (A0E != j12 - i11) {
                long j13 = i11 + j11;
                return new C0866Ck(seekPoint, new C0868Cm(A7e(j13), j13));
            }
        }
        return new C0866Ck(seekPoint);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1352Wc
    public final long A7e(long j10) {
        return ((Math.max(0L, j10 - this.A04) * 1000000) * 8) / this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0867Cl
    public final boolean A8g() {
        return this.A02 != -1;
    }
}
