package com.facebook.ads.redexgen.X;

import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.Dy  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0895Dy {
    public final int A00;
    public final long A01;

    public C0895Dy(int i10, long j10) {
        this.A00 = i10;
        this.A01 = j10;
    }

    public static C0895Dy A00(InterfaceC0861Cd interfaceC0861Cd, C1004Ij c1004Ij) throws IOException, InterruptedException {
        interfaceC0861Cd.AD7(c1004Ij.A00, 0, 8);
        c1004Ij.A0Y(0);
        int id2 = c1004Ij.A08();
        return new C0895Dy(id2, c1004Ij.A0K());
    }
}
