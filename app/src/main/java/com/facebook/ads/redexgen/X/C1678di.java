package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.protocol.AdErrorType;

/* renamed from: com.facebook.ads.redexgen.X.di  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1678di implements InterfaceC06975f {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C1673dd A01;
    public final /* synthetic */ C1673dd A02;
    public final /* synthetic */ C9I A03;

    public C1678di(C1673dd c1673dd, int i10, C9I c9i, C1673dd c1673dd2) {
        this.A01 = c1673dd;
        this.A00 = i10;
        this.A03 = c9i;
        this.A02 = c1673dd2;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06975f
    public final void AA1() {
        this.A01.A0B(this.A00, this.A03);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06975f
    public final void AA2() {
        InterfaceC05860v interfaceC05860v;
        interfaceC05860v = this.A01.A00;
        interfaceC05860v.ABC(this.A02, KH.A00(AdErrorType.NO_FILL));
    }
}
