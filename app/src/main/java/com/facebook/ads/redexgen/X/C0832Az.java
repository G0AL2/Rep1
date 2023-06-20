package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Az  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0832Az {
    public int A00;
    public long A01;
    public Object A02;
    public Object A03;
    public long A04;
    public G9 A05;

    public final int A00() {
        return this.A05.A00;
    }

    public final int A01(int i10) {
        return this.A05.A04[i10].A00;
    }

    public final int A02(int i10) {
        return this.A05.A04[i10].A00();
    }

    public final int A03(int i10, int i11) {
        return this.A05.A04[i10].A01(i11);
    }

    public final int A04(long j10) {
        return this.A05.A00(j10);
    }

    public final int A05(long j10) {
        return this.A05.A01(j10);
    }

    public final long A06() {
        return this.A05.A01;
    }

    public final long A07() {
        return this.A01;
    }

    public final long A08() {
        return AG.A01(this.A04);
    }

    public final long A09(int i10) {
        return this.A05.A03[i10];
    }

    public final long A0A(int i10, int i11) {
        G7 g72 = this.A05.A04[i10];
        if (g72.A00 != -1) {
            return g72.A02[i11];
        }
        return -9223372036854775807L;
    }

    public final C0832Az A0B(Object obj, Object obj2, int i10, long j10, long j11) {
        return A0C(obj, obj2, i10, j10, j11, G9.A06);
    }

    public final C0832Az A0C(Object obj, Object obj2, int i10, long j10, long j11, G9 g92) {
        this.A02 = obj;
        this.A03 = obj2;
        this.A00 = i10;
        this.A01 = j10;
        this.A04 = j11;
        this.A05 = g92;
        return this;
    }

    public final boolean A0D(int i10) {
        return !this.A05.A04[i10].A02();
    }

    public final boolean A0E(int i10, int i11) {
        G7 g72 = this.A05.A04[i10];
        return (g72.A00 == -1 || g72.A01[i11] == 0) ? false : true;
    }
}
