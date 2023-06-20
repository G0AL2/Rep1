package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.Ax  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0831Ax {
    public final long A00;
    public final long A01;
    public static final C0831Ax A04 = new C0831Ax(0, 0);
    public static final C0831Ax A02 = new C0831Ax(Long.MAX_VALUE, Long.MAX_VALUE);
    public static final C0831Ax A06 = new C0831Ax(Long.MAX_VALUE, 0);
    public static final C0831Ax A05 = new C0831Ax(0, Long.MAX_VALUE);
    public static final C0831Ax A03 = A04;

    public C0831Ax(long j10, long j11) {
        IK.A03(j10 >= 0);
        IK.A03(j11 >= 0);
        this.A01 = j10;
        this.A00 = j11;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C0831Ax c0831Ax = (C0831Ax) obj;
        return this.A01 == c0831Ax.A01 && this.A00 == c0831Ax.A00;
    }

    public final int hashCode() {
        return (((int) this.A01) * 31) + ((int) this.A00);
    }
}
