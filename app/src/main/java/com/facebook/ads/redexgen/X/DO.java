package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.Format;

/* loaded from: assets/audience_network.dex */
public final class DO {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final Format A07;
    @Nullable
    public final long[] A08;
    @Nullable
    public final long[] A09;
    @Nullable
    public final DP[] A0A;

    public DO(int i10, int i11, long j10, long j11, long j12, Format format, int i12, @Nullable DP[] dpArr, int i13, @Nullable long[] jArr, @Nullable long[] jArr2) {
        this.A00 = i10;
        this.A03 = i11;
        this.A06 = j10;
        this.A05 = j11;
        this.A04 = j12;
        this.A07 = format;
        this.A02 = i12;
        this.A0A = dpArr;
        this.A01 = i13;
        this.A08 = jArr;
        this.A09 = jArr2;
    }

    public final DP A00(int i10) {
        DP[] dpArr = this.A0A;
        if (dpArr == null) {
            return null;
        }
        return dpArr[i10];
    }
}
