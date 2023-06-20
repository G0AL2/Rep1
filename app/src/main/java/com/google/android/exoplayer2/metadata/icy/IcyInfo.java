package com.google.android.exoplayer2.metadata.icy;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.Metadata;
import j8.b2;
import j8.p1;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class IcyInfo implements Metadata.Entry {
    public static final Parcelable.Creator<IcyInfo> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f21172a;

    /* renamed from: b  reason: collision with root package name */
    public final String f21173b;

    /* renamed from: c  reason: collision with root package name */
    public final String f21174c;

    /* loaded from: classes2.dex */
    class a implements Parcelable.Creator<IcyInfo> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public IcyInfo createFromParcel(Parcel parcel) {
            return new IcyInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public IcyInfo[] newArray(int i10) {
            return new IcyInfo[i10];
        }
    }

    public IcyInfo(byte[] bArr, String str, String str2) {
        this.f21172a = bArr;
        this.f21173b = str;
        this.f21174c = str2;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public void Z0(b2.b bVar) {
        String str = this.f21173b;
        if (str != null) {
            bVar.k0(str);
        }
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public /* synthetic */ byte[] c1() {
        return c9.a.a(this);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || IcyInfo.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f21172a, ((IcyInfo) obj).f21172a);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f21172a);
    }

    public String toString() {
        return String.format("ICY: title=\"%s\", url=\"%s\", rawMetadata.length=\"%s\"", this.f21173b, this.f21174c, Integer.valueOf(this.f21172a.length));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeByteArray(this.f21172a);
        parcel.writeString(this.f21173b);
        parcel.writeString(this.f21174c);
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public /* synthetic */ p1 z() {
        return c9.a.b(this);
    }

    IcyInfo(Parcel parcel) {
        this.f21172a = (byte[]) ea.a.e(parcel.createByteArray());
        this.f21173b = parcel.readString();
        this.f21174c = parcel.readString();
    }
}
