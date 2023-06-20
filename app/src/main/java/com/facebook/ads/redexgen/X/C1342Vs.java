package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Vs  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1342Vs implements InterfaceC0867Cl {
    public long A00;
    public long A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;

    public C1342Vs(int i10, int i11, int i12, int i13, int i14, int i15) {
        this.A06 = i10;
        this.A07 = i11;
        this.A02 = i12;
        this.A04 = i13;
        this.A03 = i14;
        this.A05 = i15;
    }

    public final int A00() {
        return this.A07 * this.A03 * this.A06;
    }

    public final int A01() {
        return this.A04;
    }

    public final int A02() {
        return this.A05;
    }

    public final int A03() {
        return this.A06;
    }

    public final int A04() {
        return this.A07;
    }

    public final long A05(long j10) {
        return (1000000 * Math.max(0L, j10 - this.A01)) / this.A02;
    }

    public final void A06(long j10, long j11) {
        this.A01 = j10;
        this.A00 = j11;
    }

    public final boolean A07() {
        return (this.A01 == 0 || this.A00 == 0) ? false : true;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0867Cl
    public final long A6S() {
        return (1000000 * (this.A00 / this.A04)) / this.A07;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0867Cl
    public final C0866Ck A7O(long j10) {
        int i10 = this.A04;
        long A0E = C1020Iz.A0E((((this.A02 * j10) / 1000000) / i10) * i10, 0L, this.A00 - i10);
        long j11 = this.A01 + A0E;
        long seekTimeUs = A05(j11);
        C0868Cm c0868Cm = new C0868Cm(seekTimeUs, j11);
        if (seekTimeUs < j10) {
            long j12 = this.A00;
            int i11 = this.A04;
            if (A0E != j12 - i11) {
                long j13 = i11 + j11;
                long seekPosition = A05(j13);
                return new C0866Ck(c0868Cm, new C0868Cm(seekPosition, j13));
            }
        }
        return new C0866Ck(c0868Cm);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0867Cl
    public final boolean A8g() {
        return true;
    }
}
