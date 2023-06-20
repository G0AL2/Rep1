package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import ea.a0;
import ea.n0;

/* loaded from: classes2.dex */
public final class PrivateCommand extends SpliceCommand {
    public static final Parcelable.Creator<PrivateCommand> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final long f21233a;

    /* renamed from: b  reason: collision with root package name */
    public final long f21234b;

    /* renamed from: c  reason: collision with root package name */
    public final byte[] f21235c;

    /* loaded from: classes2.dex */
    class a implements Parcelable.Creator<PrivateCommand> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public PrivateCommand createFromParcel(Parcel parcel) {
            return new PrivateCommand(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public PrivateCommand[] newArray(int i10) {
            return new PrivateCommand[i10];
        }
    }

    /* synthetic */ PrivateCommand(Parcel parcel, a aVar) {
        this(parcel);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static PrivateCommand c(a0 a0Var, int i10, long j10) {
        long F = a0Var.F();
        int i11 = i10 - 4;
        byte[] bArr = new byte[i11];
        a0Var.j(bArr, 0, i11);
        return new PrivateCommand(F, bArr, j10);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f21233a);
        parcel.writeLong(this.f21234b);
        parcel.writeByteArray(this.f21235c);
    }

    private PrivateCommand(long j10, byte[] bArr, long j11) {
        this.f21233a = j11;
        this.f21234b = j10;
        this.f21235c = bArr;
    }

    private PrivateCommand(Parcel parcel) {
        this.f21233a = parcel.readLong();
        this.f21234b = parcel.readLong();
        this.f21235c = (byte[]) n0.j(parcel.createByteArray());
    }
}
