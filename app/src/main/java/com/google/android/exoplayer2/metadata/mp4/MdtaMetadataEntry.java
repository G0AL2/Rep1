package com.google.android.exoplayer2.metadata.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.Metadata;
import com.ironsource.mediationsdk.logger.IronSourceError;
import ea.n0;
import j8.b2;
import j8.p1;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class MdtaMetadataEntry implements Metadata.Entry {
    public static final Parcelable.Creator<MdtaMetadataEntry> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final String f21218a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f21219b;

    /* renamed from: c  reason: collision with root package name */
    public final int f21220c;

    /* renamed from: d  reason: collision with root package name */
    public final int f21221d;

    /* loaded from: classes2.dex */
    class a implements Parcelable.Creator<MdtaMetadataEntry> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public MdtaMetadataEntry createFromParcel(Parcel parcel) {
            return new MdtaMetadataEntry(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public MdtaMetadataEntry[] newArray(int i10) {
            return new MdtaMetadataEntry[i10];
        }
    }

    /* synthetic */ MdtaMetadataEntry(Parcel parcel, a aVar) {
        this(parcel);
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

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || MdtaMetadataEntry.class != obj.getClass()) {
            return false;
        }
        MdtaMetadataEntry mdtaMetadataEntry = (MdtaMetadataEntry) obj;
        return this.f21218a.equals(mdtaMetadataEntry.f21218a) && Arrays.equals(this.f21219b, mdtaMetadataEntry.f21219b) && this.f21220c == mdtaMetadataEntry.f21220c && this.f21221d == mdtaMetadataEntry.f21221d;
    }

    public int hashCode() {
        return ((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f21218a.hashCode()) * 31) + Arrays.hashCode(this.f21219b)) * 31) + this.f21220c) * 31) + this.f21221d;
    }

    public String toString() {
        String valueOf = String.valueOf(this.f21218a);
        return valueOf.length() != 0 ? "mdta: key=".concat(valueOf) : new String("mdta: key=");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f21218a);
        parcel.writeByteArray(this.f21219b);
        parcel.writeInt(this.f21220c);
        parcel.writeInt(this.f21221d);
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public /* synthetic */ p1 z() {
        return c9.a.b(this);
    }

    public MdtaMetadataEntry(String str, byte[] bArr, int i10, int i11) {
        this.f21218a = str;
        this.f21219b = bArr;
        this.f21220c = i10;
        this.f21221d = i11;
    }

    private MdtaMetadataEntry(Parcel parcel) {
        this.f21218a = (String) n0.j(parcel.readString());
        this.f21219b = (byte[]) n0.j(parcel.createByteArray());
        this.f21220c = parcel.readInt();
        this.f21221d = parcel.readInt();
    }
}
