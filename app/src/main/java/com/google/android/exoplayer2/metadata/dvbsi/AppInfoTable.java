package com.google.android.exoplayer2.metadata.dvbsi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.Metadata;
import j8.b2;
import j8.p1;

/* loaded from: classes2.dex */
public final class AppInfoTable implements Metadata.Entry {
    public static final Parcelable.Creator<AppInfoTable> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final int f21144a;

    /* renamed from: b  reason: collision with root package name */
    public final String f21145b;

    /* loaded from: classes2.dex */
    class a implements Parcelable.Creator<AppInfoTable> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public AppInfoTable createFromParcel(Parcel parcel) {
            return new AppInfoTable(parcel.readInt(), (String) ea.a.e(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public AppInfoTable[] newArray(int i10) {
            return new AppInfoTable[i10];
        }
    }

    public AppInfoTable(int i10, String str) {
        this.f21144a = i10;
        this.f21145b = str;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public /* synthetic */ void Z0(b2.b bVar) {
        c9.a.c(this, bVar);
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public /* synthetic */ byte[] c1() {
        return c9.a.a(this);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        int i10 = this.f21144a;
        String str = this.f21145b;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 33);
        sb2.append("Ait(controlCode=");
        sb2.append(i10);
        sb2.append(",url=");
        sb2.append(str);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f21145b);
        parcel.writeInt(this.f21144a);
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public /* synthetic */ p1 z() {
        return c9.a.b(this);
    }
}
