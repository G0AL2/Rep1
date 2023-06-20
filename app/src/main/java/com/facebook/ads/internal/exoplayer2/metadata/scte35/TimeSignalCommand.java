package com.facebook.ads.internal.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.redexgen.X.C1004Ij;
import com.facebook.ads.redexgen.X.C1016Iv;
import com.facebook.ads.redexgen.X.Ef;

/* loaded from: assets/audience_network.dex */
public final class TimeSignalCommand extends SpliceCommand {
    public static final Parcelable.Creator<TimeSignalCommand> CREATOR = new Ef();
    public final long A00;
    public final long A01;

    public TimeSignalCommand(long j10, long j11) {
        this.A01 = j10;
        this.A00 = j11;
    }

    public /* synthetic */ TimeSignalCommand(long j10, long j11, Ef ef2) {
        this(j10, j11);
    }

    public static long A00(C1004Ij c1004Ij, long j10) {
        long A0E = c1004Ij.A0E();
        if ((128 & A0E) == 0) {
            return -9223372036854775807L;
        }
        long ptsTime = 1 & A0E;
        return (((ptsTime << 32) | c1004Ij.A0M()) + j10) & 8589934591L;
    }

    public static TimeSignalCommand A01(C1004Ij c1004Ij, long j10, C1016Iv c1016Iv) {
        long A00 = A00(c1004Ij, j10);
        return new TimeSignalCommand(A00, c1016Iv.A07(A00));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.A01);
        parcel.writeLong(this.A00);
    }
}
