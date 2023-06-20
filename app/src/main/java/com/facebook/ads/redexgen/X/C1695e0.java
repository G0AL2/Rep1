package com.facebook.ads.redexgen.X;

import java.io.ByteArrayInputStream;

/* renamed from: com.facebook.ads.redexgen.X.e0  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1695e0 implements C0K {
    public ByteArrayInputStream A00;
    public final byte[] A01;

    public C1695e0(byte[] bArr) {
        this.A01 = bArr;
    }

    @Override // com.facebook.ads.redexgen.X.C0K
    public final void ACx(int i10) throws C1694dz {
        this.A00 = new ByteArrayInputStream(this.A01);
        this.A00.skip(i10);
    }

    @Override // com.facebook.ads.redexgen.X.C0K
    public final void close() throws C1694dz {
    }

    @Override // com.facebook.ads.redexgen.X.C0K
    public final int length() throws C1694dz {
        return this.A01.length;
    }

    @Override // com.facebook.ads.redexgen.X.C0K
    public final int read(byte[] bArr) throws C1694dz {
        return this.A00.read(bArr, 0, bArr.length);
    }
}
