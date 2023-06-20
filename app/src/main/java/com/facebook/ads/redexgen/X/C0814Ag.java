package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.source.TrackGroupArray;

/* renamed from: com.facebook.ads.redexgen.X.Ag  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0814Ag {
    public final int A00;
    public final long A01;
    public final long A02;
    public final B1 A03;
    public final FY A04;
    public final TrackGroupArray A05;
    public final HU A06;
    @Nullable
    public final Object A07;
    public final boolean A08;
    public volatile long A09;
    public volatile long A0A;

    public C0814Ag(B1 b12, long j10, TrackGroupArray trackGroupArray, HU hu) {
        this(b12, null, new FY(0), j10, -9223372036854775807L, 1, false, trackGroupArray, hu);
    }

    public C0814Ag(B1 b12, @Nullable Object obj, FY fy, long j10, long j11, int i10, boolean z10, TrackGroupArray trackGroupArray, HU hu) {
        this.A03 = b12;
        this.A07 = obj;
        this.A04 = fy;
        this.A02 = j10;
        this.A01 = j11;
        this.A0A = j10;
        this.A09 = j10;
        this.A00 = i10;
        this.A08 = z10;
        this.A05 = trackGroupArray;
        this.A06 = hu;
    }

    public static void A00(C0814Ag c0814Ag, C0814Ag c0814Ag2) {
        c0814Ag2.A0A = c0814Ag.A0A;
        c0814Ag2.A09 = c0814Ag.A09;
    }

    public final C0814Ag A01(int i10) {
        C0814Ag c0814Ag = new C0814Ag(this.A03, this.A07, this.A04.A00(i10), this.A02, this.A01, this.A00, this.A08, this.A05, this.A06);
        A00(this, c0814Ag);
        return c0814Ag;
    }

    public final C0814Ag A02(int i10) {
        C0814Ag c0814Ag = new C0814Ag(this.A03, this.A07, this.A04, this.A02, this.A01, i10, this.A08, this.A05, this.A06);
        A00(this, c0814Ag);
        return c0814Ag;
    }

    public final C0814Ag A03(B1 b12, Object obj) {
        C0814Ag c0814Ag = new C0814Ag(b12, obj, this.A04, this.A02, this.A01, this.A00, this.A08, this.A05, this.A06);
        A00(this, c0814Ag);
        return c0814Ag;
    }

    public final C0814Ag A04(FY fy, long j10, long j11) {
        long j12 = j11;
        B1 b12 = this.A03;
        Object obj = this.A07;
        if (!fy.A01()) {
            j12 = -9223372036854775807L;
        }
        return new C0814Ag(b12, obj, fy, j10, j12, this.A00, this.A08, this.A05, this.A06);
    }

    public final C0814Ag A05(TrackGroupArray trackGroupArray, HU hu) {
        C0814Ag c0814Ag = new C0814Ag(this.A03, this.A07, this.A04, this.A02, this.A01, this.A00, this.A08, trackGroupArray, hu);
        A00(this, c0814Ag);
        return c0814Ag;
    }

    public final C0814Ag A06(boolean z10) {
        C0814Ag c0814Ag = new C0814Ag(this.A03, this.A07, this.A04, this.A02, this.A01, this.A00, z10, this.A05, this.A06);
        A00(this, c0814Ag);
        return c0814Ag;
    }
}
