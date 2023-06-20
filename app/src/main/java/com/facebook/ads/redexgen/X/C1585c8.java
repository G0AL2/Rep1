package com.facebook.ads.redexgen.X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.c8  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1585c8 extends C4D {
    public C1585c8(C4T c4t) {
        super(c4t, null);
    }

    @Override // com.facebook.ads.redexgen.X.C4D
    public final int A06() {
        return this.A02.A0X();
    }

    @Override // com.facebook.ads.redexgen.X.C4D
    public final int A07() {
        return this.A02.A0X() - this.A02.A0d();
    }

    @Override // com.facebook.ads.redexgen.X.C4D
    public final int A08() {
        return this.A02.A0d();
    }

    @Override // com.facebook.ads.redexgen.X.C4D
    public final int A09() {
        return this.A02.A0Y();
    }

    @Override // com.facebook.ads.redexgen.X.C4D
    public final int A0A() {
        return this.A02.A0g();
    }

    @Override // com.facebook.ads.redexgen.X.C4D
    public final int A0B() {
        return (this.A02.A0X() - this.A02.A0g()) - this.A02.A0d();
    }

    @Override // com.facebook.ads.redexgen.X.C4D
    public final int A0C(View view) {
        return this.A02.A0j(view) + ((C4U) view.getLayoutParams()).bottomMargin;
    }

    @Override // com.facebook.ads.redexgen.X.C4D
    public final int A0D(View view) {
        C4U c4u = (C4U) view.getLayoutParams();
        return this.A02.A0l(view) + c4u.topMargin + c4u.bottomMargin;
    }

    @Override // com.facebook.ads.redexgen.X.C4D
    public final int A0E(View view) {
        C4U c4u = (C4U) view.getLayoutParams();
        return this.A02.A0m(view) + c4u.leftMargin + c4u.rightMargin;
    }

    @Override // com.facebook.ads.redexgen.X.C4D
    public final int A0F(View view) {
        return this.A02.A0o(view) - ((C4U) view.getLayoutParams()).topMargin;
    }

    @Override // com.facebook.ads.redexgen.X.C4D
    public final int A0G(View view) {
        this.A02.A1E(view, true, this.A01);
        return this.A01.bottom;
    }

    @Override // com.facebook.ads.redexgen.X.C4D
    public final int A0H(View view) {
        this.A02.A1E(view, true, this.A01);
        return this.A01.top;
    }

    @Override // com.facebook.ads.redexgen.X.C4D
    public final void A0J(int i10) {
        this.A02.A10(i10);
    }
}
