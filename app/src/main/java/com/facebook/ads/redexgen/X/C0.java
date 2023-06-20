package com.facebook.ads.redexgen.X;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.IOException;

/* loaded from: assets/audience_network.dex */
public final class C0 extends AbstractC1330Vd implements FV {
    public long A00;
    public boolean A01;
    public final int A02;
    public final int A03;
    public final Uri A04;
    public final InterfaceC0863Cf A05;
    public final InterfaceC0974Hd A06;
    @Nullable
    public final Object A07;
    public final String A08;

    public C0(Uri uri, InterfaceC0974Hd interfaceC0974Hd, InterfaceC0863Cf interfaceC0863Cf, int i10, @Nullable String str, int i11, @Nullable Object obj) {
        this.A04 = uri;
        this.A06 = interfaceC0974Hd;
        this.A05 = interfaceC0863Cf;
        this.A03 = i10;
        this.A08 = str;
        this.A02 = i11;
        this.A00 = -9223372036854775807L;
        this.A07 = obj;
    }

    private void A00(long j10, boolean z10) {
        this.A00 = j10;
        this.A01 = z10;
        A01(new VU(this.A00, this.A01, false, this.A07), null);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1330Vd
    public final void A02() {
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1330Vd
    public final void A03(XH xh, boolean z10) {
        A00(this.A00, false);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0919Fa
    public final VW A4Q(FY fy, HW hw) {
        IK.A03(fy.A02 == 0);
        return new CE(this.A04, this.A06.A4E(), this.A05.A4I(), this.A03, A00(fy), this, hw, this.A08, this.A02);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0919Fa
    public final void A9Z() throws IOException {
    }

    @Override // com.facebook.ads.redexgen.X.FV
    public final void ACL(long j10, boolean z10) {
        if (j10 == -9223372036854775807L) {
            j10 = this.A00;
        }
        if (this.A00 == j10 && this.A01 == z10) {
            return;
        }
        A00(j10, z10);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0919Fa
    public final void ADr(VW vw) {
        ((CE) vw).A0R();
    }
}
