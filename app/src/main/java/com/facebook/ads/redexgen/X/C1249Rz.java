package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Rz  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1249Rz implements AnonymousClass57 {
    public final /* synthetic */ AnonymousClass59 A00;
    public final /* synthetic */ C8K A01;

    public C1249Rz(C8K c8k, AnonymousClass59 anonymousClass59) {
        this.A01 = c8k;
        this.A00 = anonymousClass59;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass57
    public final boolean A8M() {
        boolean A0Y;
        boolean A0Z;
        if (!this.A01.A0X()) {
            A0Y = this.A01.A0Y();
            if (A0Y) {
                return true;
            }
            A0Z = this.A01.A0Z();
            return A0Z;
        }
        this.A01.A0W(this.A00);
        return true;
    }
}
