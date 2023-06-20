package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Wq  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1366Wq implements InterfaceC0867Cl {
    public final long A00;
    public final C0866Ck A01;

    public C1366Wq(long j10) {
        this(j10, 0L);
    }

    public C1366Wq(long j10, long j11) {
        this.A00 = j10;
        this.A01 = new C0866Ck(j11 == 0 ? C0868Cm.A04 : new C0868Cm(0L, j11));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0867Cl
    public final long A6S() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0867Cl
    public final C0866Ck A7O(long j10) {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0867Cl
    public final boolean A8g() {
        return false;
    }
}
