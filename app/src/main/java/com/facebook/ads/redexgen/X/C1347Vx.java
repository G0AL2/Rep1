package com.facebook.ads.redexgen.X;

import android.util.SparseArray;

/* renamed from: com.facebook.ads.redexgen.X.Vx  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1347Vx implements InterfaceC0887Dq {
    public final C1003Ii A00 = new C1003Ii(new byte[4]);
    public final /* synthetic */ C1345Vv A01;

    public C1347Vx(C1345Vv c1345Vv) {
        this.A01 = c1345Vv;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0887Dq
    public final void A48(C1004Ij c1004Ij) {
        int i10;
        SparseArray sparseArray;
        SparseArray sparseArray2;
        if (c1004Ij.A0E() != 0) {
            return;
        }
        c1004Ij.A0Z(7);
        int A04 = c1004Ij.A04() / 4;
        for (int i11 = 0; i11 < A04; i11++) {
            c1004Ij.A0a(this.A00, 4);
            int A042 = this.A00.A04(16);
            this.A00.A08(3);
            if (A042 == 0) {
                this.A00.A08(13);
            } else {
                int A043 = this.A00.A04(13);
                sparseArray2 = this.A01.A06;
                sparseArray2.put(A043, new W0(new C1346Vw(this.A01, A043)));
                C1345Vv.A01(this.A01);
            }
        }
        i10 = this.A01.A05;
        if (i10 != 2) {
            sparseArray = this.A01.A06;
            sparseArray.remove(0);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0887Dq
    public final void A8K(C1016Iv c1016Iv, InterfaceC0862Ce interfaceC0862Ce, C0893Dw c0893Dw) {
    }
}
