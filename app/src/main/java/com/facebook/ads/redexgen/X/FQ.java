package com.facebook.ads.redexgen.X;

import android.view.View;
import androidx.annotation.Nullable;

/* loaded from: assets/audience_network.dex */
public final class FQ extends d2 {
    @Nullable
    public View A00;
    public C0904El A01;

    public FQ(C0904El c0904El, C06061p c06061p) {
        super(c0904El, c06061p);
        this.A01 = c0904El;
    }

    @Override // com.facebook.ads.redexgen.X.d2
    public final void A0J() {
        if (this.A00 != null) {
            this.A01.A0D().A3n();
            this.A06.A0E(this.A00);
            return;
        }
        this.A01.A0D().A3o();
    }

    @Override // com.facebook.ads.redexgen.X.d2
    public final void A0L(InterfaceC05780n interfaceC05780n, C9H c9h, C9F c9f, C06071q c06071q) {
        this.A01.A0D().A3h();
        C1673dd c1673dd = (C1673dd) interfaceC05780n;
        C1639d5 c1639d5 = new C1639d5(this, c06071q, c1673dd);
        A0C().postDelayed(c1639d5, c9h.A05().A05());
        c1673dd.A0I(this.A01, this.A08, this.A07.A07, new C1638d4(this, c1639d5), c06071q);
    }

    @Override // com.facebook.ads.redexgen.X.d2
    public final void A0O(String str) {
        this.A01.A0D().A3m(str != null);
        super.A0O(str);
    }

    @Override // com.facebook.ads.redexgen.X.d2
    public final void A0R(boolean z10) {
        super.A0R(z10);
        this.A00 = null;
    }
}
