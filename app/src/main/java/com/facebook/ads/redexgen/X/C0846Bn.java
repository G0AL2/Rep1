package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.source.TrackGroup;

/* renamed from: com.facebook.ads.redexgen.X.Bn  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0846Bn extends VE {
    public float A00;
    public int A01;
    public int A02;
    public long A03;
    public final float A04;
    public final float A05;
    public final long A06;
    public final long A07;
    public final long A08;
    public final long A09;
    public final HZ A0A;
    public final IN A0B;

    public C0846Bn(TrackGroup trackGroup, int[] iArr, HZ hz, long j10, long j11, long j12, float f10, float f11, long j13, IN in) {
        super(trackGroup, iArr);
        this.A0A = hz;
        this.A07 = j10 * 1000;
        this.A06 = j11 * 1000;
        this.A08 = 1000 * j12;
        this.A04 = f10;
        this.A05 = f11;
        this.A09 = j13;
        this.A0B = in;
        this.A00 = 1.0f;
        this.A01 = 1;
        this.A03 = -9223372036854775807L;
        this.A02 = A00(Long.MIN_VALUE);
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x000f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int A00(long r8) {
        /*
            r7 = this;
            com.facebook.ads.redexgen.X.HZ r0 = r7.A0A
            long r2 = r0.A5n()
            float r1 = (float) r2
            float r0 = r7.A04
            float r1 = r1 * r0
            long r3 = (long) r1
            r6 = 0
            r5 = 0
        Ld:
            int r0 = r7.A03
            if (r5 >= r0) goto L35
            r1 = -9223372036854775808
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 == 0) goto L1d
            boolean r0 = r7.A00(r5, r8)
            if (r0 != 0) goto L32
        L1d:
            com.facebook.ads.internal.exoplayer2.Format r0 = r7.A6h(r5)
            int r0 = r0.A04
            float r1 = (float) r0
            float r0 = r7.A00
            float r1 = r1 * r0
            int r0 = java.lang.Math.round(r1)
            long r1 = (long) r0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 > 0) goto L31
            return r5
        L31:
            r6 = r5
        L32:
            int r5 = r5 + 1
            goto Ld
        L35:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0846Bn.A00(long):int");
    }

    @Override // com.facebook.ads.redexgen.X.VE, com.facebook.ads.redexgen.X.HQ
    public final void A59() {
        this.A03 = -9223372036854775807L;
    }

    @Override // com.facebook.ads.redexgen.X.HQ
    public final int A7Q() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.X.VE, com.facebook.ads.redexgen.X.HQ
    public final void ABp(float f10) {
        this.A00 = f10;
    }
}
