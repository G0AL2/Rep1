package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import ea.n0;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class MlltFrame extends Id3Frame {
    public static final Parcelable.Creator<MlltFrame> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    public final int f21202b;

    /* renamed from: c  reason: collision with root package name */
    public final int f21203c;

    /* renamed from: d  reason: collision with root package name */
    public final int f21204d;

    /* renamed from: e  reason: collision with root package name */
    public final int[] f21205e;

    /* renamed from: f  reason: collision with root package name */
    public final int[] f21206f;

    /* loaded from: classes2.dex */
    class a implements Parcelable.Creator<MlltFrame> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public MlltFrame createFromParcel(Parcel parcel) {
            return new MlltFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public MlltFrame[] newArray(int i10) {
            return new MlltFrame[i10];
        }
    }

    public MlltFrame(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f21202b = i10;
        this.f21203c = i11;
        this.f21204d = i12;
        this.f21205e = iArr;
        this.f21206f = iArr2;
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || MlltFrame.class != obj.getClass()) {
            return false;
        }
        MlltFrame mlltFrame = (MlltFrame) obj;
        return this.f21202b == mlltFrame.f21202b && this.f21203c == mlltFrame.f21203c && this.f21204d == mlltFrame.f21204d && Arrays.equals(this.f21205e, mlltFrame.f21205e) && Arrays.equals(this.f21206f, mlltFrame.f21206f);
    }

    public int hashCode() {
        return ((((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f21202b) * 31) + this.f21203c) * 31) + this.f21204d) * 31) + Arrays.hashCode(this.f21205e)) * 31) + Arrays.hashCode(this.f21206f);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f21202b);
        parcel.writeInt(this.f21203c);
        parcel.writeInt(this.f21204d);
        parcel.writeIntArray(this.f21205e);
        parcel.writeIntArray(this.f21206f);
    }

    MlltFrame(Parcel parcel) {
        super("MLLT");
        this.f21202b = parcel.readInt();
        this.f21203c = parcel.readInt();
        this.f21204d = parcel.readInt();
        this.f21205e = (int[]) n0.j(parcel.createIntArray());
        this.f21206f = (int[]) n0.j(parcel.createIntArray());
    }
}
