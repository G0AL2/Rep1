package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.Up  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1316Up implements InterfaceC0974Hd {
    public final int A00;
    @Nullable
    public final InterfaceC0972Hb A01;
    public final InterfaceC0974Hd A02;
    public final InterfaceC0974Hd A03;
    public final I4 A04;
    @Nullable
    public final I6 A05;

    public C1316Up(I4 i42, InterfaceC0974Hd interfaceC0974Hd, InterfaceC0974Hd interfaceC0974Hd2, InterfaceC0972Hb interfaceC0972Hb, int i10, I6 i62) {
        this.A04 = i42;
        this.A03 = interfaceC0974Hd;
        this.A02 = interfaceC0974Hd2;
        this.A01 = interfaceC0972Hb;
        this.A00 = i10;
        this.A05 = i62;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0974Hd
    /* renamed from: A00 */
    public final C1317Uq A4E() {
        I4 i42 = this.A04;
        InterfaceC0975He A4E = this.A03.A4E();
        InterfaceC0975He A4E2 = this.A02.A4E();
        InterfaceC0972Hb interfaceC0972Hb = this.A01;
        return new C1317Uq(i42, A4E, A4E2, interfaceC0972Hb != null ? interfaceC0972Hb.createDataSink() : null, this.A00, this.A05);
    }
}
