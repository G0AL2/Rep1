package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.Format;
import java.io.EOFException;
import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.Ws  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1368Ws implements InterfaceC0870Co {
    @Override // com.facebook.ads.redexgen.X.InterfaceC0870Co
    public final void A5V(Format format) {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0870Co
    public final int AEF(InterfaceC0861Cd interfaceC0861Cd, int i10, boolean z10) throws IOException, InterruptedException {
        int AEq = interfaceC0861Cd.AEq(i10);
        if (AEq == -1) {
            if (z10) {
                return -1;
            }
            throw new EOFException();
        }
        return AEq;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0870Co
    public final void AEG(C1004Ij c1004Ij, int i10) {
        c1004Ij.A0Z(i10);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0870Co
    public final void AEH(long j10, int i10, int i11, int i12, C0869Cn c0869Cn) {
    }
}
