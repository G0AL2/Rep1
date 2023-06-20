package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import ea.a0;
import ea.j0;

/* loaded from: classes2.dex */
public final class TimeSignalCommand extends SpliceCommand {
    public static final Parcelable.Creator<TimeSignalCommand> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final long f21266a;

    /* renamed from: b  reason: collision with root package name */
    public final long f21267b;

    /* loaded from: classes2.dex */
    class a implements Parcelable.Creator<TimeSignalCommand> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public TimeSignalCommand createFromParcel(Parcel parcel) {
            return new TimeSignalCommand(parcel.readLong(), parcel.readLong(), null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public TimeSignalCommand[] newArray(int i10) {
            return new TimeSignalCommand[i10];
        }
    }

    /* synthetic */ TimeSignalCommand(long j10, long j11, a aVar) {
        this(j10, j11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static TimeSignalCommand c(a0 a0Var, long j10, j0 j0Var) {
        long e10 = e(a0Var, j10);
        return new TimeSignalCommand(e10, j0Var.b(e10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long e(a0 a0Var, long j10) {
        long D = a0Var.D();
        if ((128 & D) != 0) {
            return 8589934591L & ((((D & 1) << 32) | a0Var.F()) + j10);
        }
        return -9223372036854775807L;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f21266a);
        parcel.writeLong(this.f21267b);
    }

    private TimeSignalCommand(long j10, long j11) {
        this.f21266a = j10;
        this.f21267b = j11;
    }
}
