package com.facebook.ads.redexgen.X;

import java.util.LinkedList;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class KF {
    public final KD A0B;
    public final boolean A0F;
    public final String A0C = KF.class.getSimpleName();
    public final int A07 = 101;
    public final int A0A = 102;
    public final int A08 = 103;
    public final int A03 = 104;
    public final int A09 = 105;
    public final int A02 = 106;
    public final int A04 = 107;
    public final int A05 = 108;
    public final int A06 = 109;
    public final int A01 = 110;
    public final boolean A0E = false;
    public long A00 = -1;
    public final List<KE> A0D = new LinkedList();

    public KF(C8U c8u, KD kd2) {
        int A0D = JT.A0D(c8u);
        if (A0D < 1) {
            this.A0F = false;
        } else {
            double sessionRandom = A0D;
            this.A0F = c8u.A07().A00() < 1.0d / sessionRandom;
        }
        this.A0B = kd2;
    }

    private int A00() {
        return this.A0B.A6E();
    }

    private int A01() {
        if (this.A00 > 0) {
            return (int) (System.currentTimeMillis() - this.A00);
        }
        return -1;
    }

    private void A03(KE ke2) {
        synchronized (this.A0D) {
            this.A0D.add(ke2);
        }
    }

    public final void A04() {
        if (!this.A0F) {
            return;
        }
        A03(new KE(A01(), 110, A00(), null));
    }

    public final void A05() {
        if (!this.A0F) {
            return;
        }
        A03(new KE(A01(), 106, A00(), null));
    }

    public final void A06() {
        if (!this.A0F) {
            return;
        }
        A03(new KE(A01(), 104, A00(), null));
    }

    public final void A07() {
        if (!this.A0F) {
            return;
        }
        A03(new KE(A01(), 109, -1, null));
    }

    public final void A08() {
        if (!this.A0F) {
            return;
        }
        A03(new KE(A01(), 108, A00(), null));
    }

    public final void A09() {
        if (!this.A0F) {
            return;
        }
        this.A00 = System.currentTimeMillis();
        A03(new KE(0, 101, -1, null));
    }

    public final void A0A() {
        if (!this.A0F) {
            return;
        }
        A03(new KE(A01(), 105, A00(), null));
    }

    public final void A0B() {
        if (!this.A0F) {
            return;
        }
        A03(new KE(A01(), 102, A00(), null));
    }

    public final void A0C(C8U c8u, String str) {
        if (!this.A0F) {
            return;
        }
        A03(new KE(A01(), 103, A00(), null));
        MX.A06.execute(new KC(this, str, c8u));
    }
}
