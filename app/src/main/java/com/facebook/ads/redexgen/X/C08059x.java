package com.facebook.ads.redexgen.X;

import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.9x  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C08059x {
    public final int A00;
    public final C08029u A01;

    public C08059x(int i10, C08029u c08029u) {
        this.A00 = i10;
        this.A01 = c08029u;
    }

    public final int A00() {
        return this.A00;
    }

    public final int A01() throws IOException {
        return this.A01.A05();
    }

    public final C9l A02(int i10, byte[] bArr, int i11, int[] iArr, int i12) throws IOException {
        return this.A01.A06(i10, bArr, i11, iArr, i12);
    }

    public final void A03() throws IOException {
        this.A01.A07();
    }

    public final void A04() throws IOException {
        this.A01.A08();
    }

    public final boolean A05(byte[] bArr) throws IOException {
        return this.A01.A09(bArr);
    }
}
