package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.source.TrackGroupArray;

/* loaded from: assets/audience_network.dex */
public final class HO {
    @Deprecated
    public final int A00;
    public final int A01;
    public final TrackGroupArray A02;
    public final int[] A03;
    public final int[] A04;
    public final TrackGroupArray[] A05;
    public final int[][][] A06;

    public HO(int[] iArr, TrackGroupArray[] trackGroupArrayArr, int[] iArr2, int[][][] iArr3, TrackGroupArray trackGroupArray) {
        this.A04 = iArr;
        this.A05 = trackGroupArrayArr;
        this.A06 = iArr3;
        this.A03 = iArr2;
        this.A02 = trackGroupArray;
        this.A01 = iArr.length;
        this.A00 = this.A01;
    }

    public final int A00() {
        return this.A01;
    }

    public final int A01(int i10) {
        return this.A04[i10];
    }

    public final TrackGroupArray A02(int i10) {
        return this.A05[i10];
    }
}
