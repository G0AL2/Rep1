package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Tn  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1288Tn implements M8 {
    public final M7 A00;
    public final M8 A01;

    public C1288Tn(M8 m82, int i10, int i11) {
        this.A01 = m82;
        this.A00 = new M7(i10, i11);
    }

    @Override // com.facebook.ads.redexgen.X.M8
    public final void ADK(String str) {
        boolean A08;
        this.A00.A04(str);
        if (this.A00.A02() != null) {
            A08 = MA.A08(this.A00);
            if (A08) {
                this.A01.ADK(this.A00.A02());
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.M8
    public final void flush() {
        boolean A08;
        this.A00.A03();
        while (this.A00.A02() != null) {
            A08 = MA.A08(this.A00);
            if (A08) {
                this.A01.ADK(this.A00.A02());
            }
            this.A00.A03();
        }
    }
}
