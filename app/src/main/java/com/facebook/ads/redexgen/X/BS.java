package com.facebook.ads.redexgen.X;

import android.os.Handler;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.Format;

/* loaded from: assets/audience_network.dex */
public final class BS {
    @Nullable
    public final Handler A00;
    @Nullable
    public final BT A01;

    public BS(@Nullable Handler handler, @Nullable BT bt) {
        this.A00 = bt != null ? (Handler) IK.A01(handler) : null;
        this.A01 = bt;
    }

    public final void A01(int i10) {
        if (this.A01 != null) {
            this.A00.post(new BR(this, i10));
        }
    }

    public final void A02(int i10, long j10, long j11) {
        if (this.A01 != null) {
            this.A00.post(new BP(this, i10, j10, j11));
        }
    }

    public final void A03(Format format) {
        if (this.A01 != null) {
            this.A00.post(new BO(this, format));
        }
    }

    public final void A04(C0855Bw c0855Bw) {
        if (this.A01 != null) {
            this.A00.post(new BQ(this, c0855Bw));
        }
    }

    public final void A05(C0855Bw c0855Bw) {
        if (this.A01 != null) {
            this.A00.post(new BM(this, c0855Bw));
        }
    }

    public final void A06(String str, long j10, long j11) {
        if (this.A01 != null) {
            this.A00.post(new BN(this, str, j10, j11));
        }
    }
}
