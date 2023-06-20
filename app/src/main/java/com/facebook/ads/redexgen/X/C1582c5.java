package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.c5  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1582c5 implements InterfaceC06543n {
    public final /* synthetic */ F9 A00;

    public C1582c5(F9 f92) {
        this.A00 = f92;
    }

    private final void A00(C06553o c06553o) {
        int i10 = c06553o.A00;
        if (i10 == 1) {
            this.A00.A06.A1Q(this.A00, c06553o.A02, c06553o.A01);
        } else if (i10 == 2) {
            this.A00.A06.A1R(this.A00, c06553o.A02, c06553o.A01);
        } else if (i10 == 4) {
            this.A00.A06.A1T(this.A00, c06553o.A02, c06553o.A01, c06553o.A03);
        } else if (i10 != 8) {
        } else {
            this.A00.A06.A1S(this.A00, c06553o.A02, c06553o.A01, 1);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06543n
    public final AbstractC06774l A5Q(int i10) {
        AbstractC06774l A1G = this.A00.A1G(i10, true);
        if (A1G == null || this.A00.A01.A0K(A1G.A0H)) {
            return null;
        }
        return A1G;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06543n
    public final void A9U(int i10, int i11, Object obj) {
        this.A00.A1f(i10, i11, obj);
        this.A00.A0H = true;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06543n
    public final void A9o(int i10, int i11) {
        this.A00.A1c(i10, i11);
        this.A00.A0G = true;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06543n
    public final void A9p(int i10, int i11) {
        this.A00.A1d(i10, i11);
        this.A00.A0G = true;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06543n
    public final void A9q(int i10, int i11) {
        this.A00.A1g(i10, i11, true);
        F9 f92 = this.A00;
        f92.A0G = true;
        f92.A0s.A00 += i11;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06543n
    public final void A9r(int i10, int i11) {
        this.A00.A1g(i10, i11, false);
        this.A00.A0G = true;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06543n
    public final void AAV(C06553o c06553o) {
        A00(c06553o);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06543n
    public final void AAX(C06553o c06553o) {
        A00(c06553o);
    }
}
