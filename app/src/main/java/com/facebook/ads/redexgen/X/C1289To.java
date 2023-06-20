package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.To  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1289To implements M8 {
    public int A00;
    public final M8 A01;

    public C1289To(M8 m82, int i10) {
        this.A01 = m82;
        this.A00 = i10;
    }

    @Override // com.facebook.ads.redexgen.X.M8
    public final void ADK(String str) {
        if (this.A00 > 0) {
            this.A01.ADK(str);
            this.A00--;
        }
    }

    @Override // com.facebook.ads.redexgen.X.M8
    public final void flush() {
        this.A01.flush();
    }
}
