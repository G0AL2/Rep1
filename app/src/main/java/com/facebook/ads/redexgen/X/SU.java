package com.facebook.ads.redexgen.X;

import android.text.TextUtils;

/* loaded from: assets/audience_network.dex */
public class SU extends AbstractC1219Qv {
    public final /* synthetic */ SQ A00;

    public SU(SQ sq) {
        this.A00 = sq;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1219Qv
    public final void A02() {
        if (!this.A00.A06.A07()) {
            this.A00.A06.A05();
            if (!TextUtils.isEmpty(this.A00.A01.A0U())) {
                this.A00.A04.A93(this.A00.A01.A0U(), new OG().A03(this.A00.A0A).A02(this.A00.A06).A04(this.A00.A01.A0X()).A05());
                this.A00.A03.A0D().A2Y();
                AnonymousClass29.A00(this.A00.A01.A0W());
                this.A00.A08.A3s(this.A00.A09.A6m());
            }
        }
    }
}
