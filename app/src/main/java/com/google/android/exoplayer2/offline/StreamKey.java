package com.google.android.exoplayer2.offline;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class StreamKey implements Comparable<StreamKey>, Parcelable {
    public static final Parcelable.Creator<StreamKey> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final int f21271a;

    /* renamed from: b  reason: collision with root package name */
    public final int f21272b;

    /* renamed from: c  reason: collision with root package name */
    public final int f21273c;

    /* loaded from: classes2.dex */
    class a implements Parcelable.Creator<StreamKey> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public StreamKey createFromParcel(Parcel parcel) {
            return new StreamKey(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public StreamKey[] newArray(int i10) {
            return new StreamKey[i10];
        }
    }

    public StreamKey(int i10, int i11, int i12) {
        this.f21271a = i10;
        this.f21272b = i11;
        this.f21273c = i12;
    }

    @Override // java.lang.Comparable
    /* renamed from: c */
    public int compareTo(StreamKey streamKey) {
        int i10 = this.f21271a - streamKey.f21271a;
        if (i10 == 0) {
            int i11 = this.f21272b - streamKey.f21272b;
            return i11 == 0 ? this.f21273c - streamKey.f21273c : i11;
        }
        return i10;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || StreamKey.class != obj.getClass()) {
            return false;
        }
        StreamKey streamKey = (StreamKey) obj;
        return this.f21271a == streamKey.f21271a && this.f21272b == streamKey.f21272b && this.f21273c == streamKey.f21273c;
    }

    public int hashCode() {
        return (((this.f21271a * 31) + this.f21272b) * 31) + this.f21273c;
    }

    public String toString() {
        int i10 = this.f21271a;
        int i11 = this.f21272b;
        int i12 = this.f21273c;
        StringBuilder sb2 = new StringBuilder(35);
        sb2.append(i10);
        sb2.append(".");
        sb2.append(i11);
        sb2.append(".");
        sb2.append(i12);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f21271a);
        parcel.writeInt(this.f21272b);
        parcel.writeInt(this.f21273c);
    }

    StreamKey(Parcel parcel) {
        this.f21271a = parcel.readInt();
        this.f21272b = parcel.readInt();
        this.f21273c = parcel.readInt();
    }
}
