package com.facebook.ads.redexgen.X;

import java.util.Set;

/* loaded from: assets/audience_network.dex */
public final class R7 {
    public RA A00;
    public Set<String> A01;
    public Set<String> A02;
    public boolean A03;
    public boolean A04;

    public R7(RA ra2, boolean z10, Set<String> pinnedPublicKeys, Set<String> pinnedCertificates, boolean z11) {
        this.A00 = ra2;
        this.A04 = z10;
        this.A02 = pinnedPublicKeys;
        this.A01 = pinnedCertificates;
        this.A03 = z11;
    }

    public final RA A00() {
        return this.A00;
    }

    public final Set<String> A01() {
        return this.A01;
    }

    public final Set<String> A02() {
        return this.A02;
    }

    public final boolean A03() {
        return this.A04;
    }

    public final boolean A04() {
        return this.A03;
    }
}
