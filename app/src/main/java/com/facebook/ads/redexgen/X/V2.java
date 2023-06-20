package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public final class V2 implements InterfaceC0974Hd {
    public final I0<? super V3> A00;

    public V2() {
        this(null);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.I0 != com.facebook.ads.internal.exoplayer2.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.upstream.FileDataSource> */
    public V2(I0<? super V3> i02) {
        this.A00 = i02;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0974Hd
    public final InterfaceC0975He A4E() {
        return new V3(this.A00);
    }
}
