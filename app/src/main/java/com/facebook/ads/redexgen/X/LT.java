package com.facebook.ads.redexgen.X;

import androidx.annotation.VisibleForTesting;

/* loaded from: assets/audience_network.dex */
public final class LT {
    public static final LT A04 = new LT(new C1296Tv(), new C1295Tu());
    public final LS A02;
    public final MI A03;
    public boolean A01 = true;
    public long A00 = -1;

    @VisibleForTesting
    public LT(MI mi, LS ls) {
        this.A03 = mi;
        this.A02 = ls;
    }

    public static LT A00() {
        return A04;
    }

    public final synchronized void A01() {
        this.A01 = false;
        this.A00 = this.A03.A4g();
    }

    public final synchronized void A02() {
        this.A00 = -1L;
    }

    public final boolean A03() {
        boolean z10 = true;
        if (this.A02.A6r() != null) {
            return true;
        }
        synchronized (LT.class) {
            if (this.A01) {
                return true;
            }
            if (this.A00 >= 0 && this.A03.A4g() - this.A00 >= 1000) {
                z10 = false;
            }
            return z10;
        }
    }
}
