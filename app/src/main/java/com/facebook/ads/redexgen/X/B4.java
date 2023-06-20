package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;

/* loaded from: assets/audience_network.dex */
public final class B4 {
    public final int A00;
    public final FY A01;

    public B4(int i10, FY fy) {
        this.A00 = i10;
        this.A01 = fy;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        B4 b42 = (B4) obj;
        return this.A00 == b42.A00 && this.A01.equals(b42.A01);
    }

    public final int hashCode() {
        return (this.A00 * 31) + this.A01.hashCode();
    }
}
