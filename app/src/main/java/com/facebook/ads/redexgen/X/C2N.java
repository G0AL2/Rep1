package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.2N  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C2N extends BJ {
    public final int A00;
    public final int A01;
    public final I0<? super InterfaceC0975He> A02;
    public final String A03;
    public final boolean A04;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.I0 != com.facebook.ads.internal.exoplayer2.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.upstream.DataSource> */
    public C2N(String str, I0<? super InterfaceC0975He> i02) {
        this(str, i02, 8000, 8000, false);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.I0 != com.facebook.ads.internal.exoplayer2.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.upstream.DataSource> */
    public C2N(String str, I0<? super InterfaceC0975He> i02, int i10, int i11, boolean z10) {
        this.A03 = str;
        this.A02 = i02;
        this.A00 = i10;
        this.A01 = i11;
        this.A04 = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.BJ
    /* renamed from: A00 */
    public final C0833Ba A01(C0984Hp c0984Hp) {
        return new C0833Ba(this.A03, null, this.A02, this.A00, this.A01, this.A04, c0984Hp);
    }
}
