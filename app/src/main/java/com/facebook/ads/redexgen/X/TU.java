package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class TU implements OT {
    public final /* synthetic */ TO A00;

    public TU(TO to) {
        this.A00 = to;
    }

    @Override // com.facebook.ads.redexgen.X.OT
    public final void A9x() {
        boolean A0Y;
        A0Y = this.A00.A0Y();
        if (A0Y) {
            this.A00.A0M();
            this.A00.A0V.setToolbarActionMessage("");
            this.A00.A0V.setToolbarActionMode(0);
        }
    }

    @Override // com.facebook.ads.redexgen.X.OT
    public final void ABP() {
        C1081Ll c1081Ll;
        this.A00.A0A = false;
        c1081Ll = this.A00.A0J;
        c1081Ll.A07();
    }

    @Override // com.facebook.ads.redexgen.X.OT
    public final void ABQ() {
        C1081Ll c1081Ll;
        this.A00.A0A = true;
        c1081Ll = this.A00.A0J;
        c1081Ll.A06();
    }
}
