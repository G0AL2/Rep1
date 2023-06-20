package com.facebook.ads.redexgen.X;

import java.util.Set;

/* loaded from: assets/audience_network.dex */
public class R6 {
    public RA A00;
    public Set<String> A01;
    public Set<String> A02;
    public boolean A03;
    public boolean A04 = true;

    public final R6 A00(RA ra2) {
        this.A00 = ra2;
        return this;
    }

    public final R6 A01(Set<String> pinnedCertificates) {
        this.A01 = pinnedCertificates;
        return this;
    }

    public final R6 A02(Set<String> pinnedPublicKeys) {
        this.A02 = pinnedPublicKeys;
        return this;
    }

    public final R6 A03(boolean z10) {
        this.A04 = z10;
        return this;
    }

    public final R6 A04(boolean z10) {
        this.A03 = z10;
        return this;
    }

    public final R7 A05() {
        return new R7(this.A00, this.A04, this.A02, this.A01, this.A03);
    }
}
