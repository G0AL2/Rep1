package com.google.android.exoplayer2.metadata.icy;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.Metadata;
import com.ironsource.mediationsdk.logger.IronSourceError;
import ea.n0;
import j8.b2;
import j8.p1;

/* loaded from: classes2.dex */
public final class IcyHeaders implements Metadata.Entry {
    public static final Parcelable.Creator<IcyHeaders> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final int f21166a;

    /* renamed from: b  reason: collision with root package name */
    public final String f21167b;

    /* renamed from: c  reason: collision with root package name */
    public final String f21168c;

    /* renamed from: d  reason: collision with root package name */
    public final String f21169d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f21170e;

    /* renamed from: f  reason: collision with root package name */
    public final int f21171f;

    /* loaded from: classes2.dex */
    class a implements Parcelable.Creator<IcyHeaders> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public IcyHeaders createFromParcel(Parcel parcel) {
            return new IcyHeaders(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public IcyHeaders[] newArray(int i10) {
            return new IcyHeaders[i10];
        }
    }

    public IcyHeaders(int i10, String str, String str2, String str3, boolean z10, int i11) {
        ea.a.a(i11 == -1 || i11 > 0);
        this.f21166a = i10;
        this.f21167b = str;
        this.f21168c = str2;
        this.f21169d = str3;
        this.f21170e = z10;
        this.f21171f = i11;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.exoplayer2.metadata.icy.IcyHeaders c(java.util.Map<java.lang.String, java.util.List<java.lang.String>> r13) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.metadata.icy.IcyHeaders.c(java.util.Map):com.google.android.exoplayer2.metadata.icy.IcyHeaders");
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public void Z0(b2.b bVar) {
        String str = this.f21168c;
        if (str != null) {
            bVar.i0(str);
        }
        String str2 = this.f21167b;
        if (str2 != null) {
            bVar.Y(str2);
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
        if (obj == null || IcyHeaders.class != obj.getClass()) {
            return false;
        }
        IcyHeaders icyHeaders = (IcyHeaders) obj;
        return this.f21166a == icyHeaders.f21166a && n0.c(this.f21167b, icyHeaders.f21167b) && n0.c(this.f21168c, icyHeaders.f21168c) && n0.c(this.f21169d, icyHeaders.f21169d) && this.f21170e == icyHeaders.f21170e && this.f21171f == icyHeaders.f21171f;
    }

    public int hashCode() {
        int i10 = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f21166a) * 31;
        String str = this.f21167b;
        int hashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f21168c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f21169d;
        return ((((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.f21170e ? 1 : 0)) * 31) + this.f21171f;
    }

    public String toString() {
        String str = this.f21168c;
        String str2 = this.f21167b;
        int i10 = this.f21166a;
        int i11 = this.f21171f;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 80 + String.valueOf(str2).length());
        sb2.append("IcyHeaders: name=\"");
        sb2.append(str);
        sb2.append("\", genre=\"");
        sb2.append(str2);
        sb2.append("\", bitrate=");
        sb2.append(i10);
        sb2.append(", metadataInterval=");
        sb2.append(i11);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f21166a);
        parcel.writeString(this.f21167b);
        parcel.writeString(this.f21168c);
        parcel.writeString(this.f21169d);
        n0.a1(parcel, this.f21170e);
        parcel.writeInt(this.f21171f);
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public /* synthetic */ p1 z() {
        return c9.a.b(this);
    }

    IcyHeaders(Parcel parcel) {
        this.f21166a = parcel.readInt();
        this.f21167b = parcel.readString();
        this.f21168c = parcel.readString();
        this.f21169d = parcel.readString();
        this.f21170e = n0.M0(parcel);
        this.f21171f = parcel.readInt();
    }
}
