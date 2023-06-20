package com.facebook.ads.redexgen.X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.c9  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1586c9 extends C4D {
    public C1586c9(C4T c4t) {
        super(c4t, null);
    }

    @Override // com.facebook.ads.redexgen.X.C4D
    public final int A06() {
        return this.A02.A0h();
    }

    @Override // com.facebook.ads.redexgen.X.C4D
    public final int A07() {
        return this.A02.A0h() - this.A02.A0f();
    }

    @Override // com.facebook.ads.redexgen.X.C4D
    public final int A08() {
        return this.A02.A0f();
    }

    @Override // com.facebook.ads.redexgen.X.C4D
    public final int A09() {
        return this.A02.A0i();
    }

    @Override // com.facebook.ads.redexgen.X.C4D
    public final int A0A() {
        return this.A02.A0e();
    }

    @Override // com.facebook.ads.redexgen.X.C4D
    public final int A0B() {
        return (this.A02.A0h() - this.A02.A0e()) - this.A02.A0f();
    }

    @Override // com.facebook.ads.redexgen.X.C4D
    public final int A0C(View view) {
        return this.A02.A0n(view) + ((C4U) view.getLayoutParams()).rightMargin;
    }

    @Override // com.facebook.ads.redexgen.X.C4D
    public final int A0D(View view) {
        C4U c4u = (C4U) view.getLayoutParams();
        return this.A02.A0m(view) + c4u.leftMargin + c4u.rightMargin;
    }

    @Override // com.facebook.ads.redexgen.X.C4D
    public final int A0E(View view) {
        C4U c4u = (C4U) view.getLayoutParams();
        return this.A02.A0l(view) + c4u.topMargin + c4u.bottomMargin;
    }

    @Override // com.facebook.ads.redexgen.X.C4D
    public final int A0F(View view) {
        return this.A02.A0k(view) - ((C4U) view.getLayoutParams()).leftMargin;
    }

    @Override // com.facebook.ads.redexgen.X.C4D
    public final int A0G(View view) {
        this.A02.A1E(view, true, this.A01);
        return this.A01.right;
    }

    @Override // com.facebook.ads.redexgen.X.C4D
    public final int A0H(View view) {
        this.A02.A1E(view, true, this.A01);
        return this.A01.left;
    }

    @Override // com.facebook.ads.redexgen.X.C4D
    public final void A0J(int i10) {
        this.A02.A0z(i10);
    }
}
