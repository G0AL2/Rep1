package com.facebook.ads.redexgen.X;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.Uv  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1322Uv implements InterfaceC0975He {
    public final int A00;
    public final InterfaceC0975He A01;
    public final C1008In A02;

    public C1322Uv(InterfaceC0975He interfaceC0975He, C1008In c1008In, int i10) {
        this.A01 = (InterfaceC0975He) IK.A01(interfaceC0975He);
        this.A02 = (C1008In) IK.A01(c1008In);
        this.A00 = i10;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0975He
    @Nullable
    public final Uri A7k() {
        return this.A01.A7k();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0975He
    public final long ACw(C0979Hi c0979Hi) throws IOException {
        this.A02.A02(this.A00);
        return this.A01.ACw(c0979Hi);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0975He
    public final void close() throws IOException {
        this.A01.close();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0975He
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        this.A02.A02(this.A00);
        return this.A01.read(bArr, i10, i11);
    }
}
