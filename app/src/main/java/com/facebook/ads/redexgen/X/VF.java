package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.source.TrackGroup;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;

/* loaded from: assets/audience_network.dex */
public final class VF implements HP {
    public final float A00;
    public final float A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final long A05;
    public final HZ A06;
    public final IN A07;

    public VF(HZ hz) {
        this(hz, 10000, 25000, 25000, 0.75f, 0.75f, Constants.MIN_PROGRESS_TIME, IN.A00);
    }

    public VF(HZ hz, int i10, int i11, int i12, float f10, float f11, long j10, IN in) {
        this.A06 = hz;
        this.A03 = i10;
        this.A02 = i11;
        this.A04 = i12;
        this.A00 = f10;
        this.A01 = f11;
        this.A05 = j10;
        this.A07 = in;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.HP
    /* renamed from: A00 */
    public final C0846Bn A4U(TrackGroup trackGroup, int... iArr) {
        return new C0846Bn(trackGroup, iArr, this.A06, this.A03, this.A02, this.A04, this.A00, this.A01, this.A05, this.A07);
    }
}
