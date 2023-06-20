package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class S6 implements AnonymousClass57 {
    public final /* synthetic */ AnonymousClass59 A00;
    public final /* synthetic */ C8L A01;

    public S6(C8L c8l, AnonymousClass59 anonymousClass59) {
        this.A01 = c8l;
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
