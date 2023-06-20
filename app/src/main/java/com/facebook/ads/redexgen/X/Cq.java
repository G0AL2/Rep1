package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public abstract class Cq {
    public final InterfaceC0870Co A00;

    public abstract void A0B(C1004Ij c1004Ij, long j10) throws C0813Af;

    public abstract boolean A0C(C1004Ij c1004Ij) throws C0813Af;

    public Cq(InterfaceC0870Co interfaceC0870Co) {
        this.A00 = interfaceC0870Co;
    }

    public final void A00(C1004Ij c1004Ij, long j10) throws C0813Af {
        if (A0C(c1004Ij)) {
            A0B(c1004Ij, j10);
        }
    }
}
