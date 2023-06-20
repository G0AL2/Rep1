package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.Ah  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0815Ah {
    public static final C0815Ah A04 = new C0815Ah(1.0f);
    public final float A00;
    public final float A01;
    public final boolean A02;
    public final int A03;

    public C0815Ah(float f10) {
        this(f10, 1.0f, false);
    }

    public C0815Ah(float f10, float f11, boolean z10) {
        IK.A03(f10 > 0.0f);
        IK.A03(f11 > 0.0f);
        this.A01 = f10;
        this.A00 = f11;
        this.A02 = z10;
        this.A03 = Math.round(1000.0f * f10);
    }

    public final long A00(long j10) {
        return this.A03 * j10;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C0815Ah c0815Ah = (C0815Ah) obj;
        return this.A01 == c0815Ah.A01 && this.A00 == c0815Ah.A00 && this.A02 == c0815Ah.A02;
    }

    public final int hashCode() {
        int result = Float.floatToRawIntBits(this.A00);
        return (((((17 * 31) + Float.floatToRawIntBits(this.A01)) * 31) + result) * 31) + (this.A02 ? 1 : 0);
    }
}
