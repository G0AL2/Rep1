package com.google.android.exoplayer2.metadata.flac;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.Metadata;
import com.ironsource.mediationsdk.logger.IronSourceError;
import ea.a0;
import ea.n0;
import ib.d;
import j8.b2;
import j8.p1;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class PictureFrame implements Metadata.Entry {
    public static final Parcelable.Creator<PictureFrame> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final int f21156a;

    /* renamed from: b  reason: collision with root package name */
    public final String f21157b;

    /* renamed from: c  reason: collision with root package name */
    public final String f21158c;

    /* renamed from: d  reason: collision with root package name */
    public final int f21159d;

    /* renamed from: e  reason: collision with root package name */
    public final int f21160e;

    /* renamed from: f  reason: collision with root package name */
    public final int f21161f;

    /* renamed from: g  reason: collision with root package name */
    public final int f21162g;

    /* renamed from: h  reason: collision with root package name */
    public final byte[] f21163h;

    /* loaded from: classes2.dex */
    class a implements Parcelable.Creator<PictureFrame> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public PictureFrame createFromParcel(Parcel parcel) {
            return new PictureFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public PictureFrame[] newArray(int i10) {
            return new PictureFrame[i10];
        }
    }

    public PictureFrame(int i10, String str, String str2, int i11, int i12, int i13, int i14, byte[] bArr) {
        this.f21156a = i10;
        this.f21157b = str;
        this.f21158c = str2;
        this.f21159d = i11;
        this.f21160e = i12;
        this.f21161f = i13;
        this.f21162g = i14;
        this.f21163h = bArr;
    }

    public static PictureFrame c(a0 a0Var) {
        int n10 = a0Var.n();
        String B = a0Var.B(a0Var.n(), d.f31903a);
        String A = a0Var.A(a0Var.n());
        int n11 = a0Var.n();
        int n12 = a0Var.n();
        int n13 = a0Var.n();
        int n14 = a0Var.n();
        int n15 = a0Var.n();
        byte[] bArr = new byte[n15];
        a0Var.j(bArr, 0, n15);
        return new PictureFrame(n10, B, A, n11, n12, n13, n14, bArr);
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public void Z0(b2.b bVar) {
        bVar.H(this.f21163h, this.f21156a);
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
        if (obj == null || PictureFrame.class != obj.getClass()) {
            return false;
        }
        PictureFrame pictureFrame = (PictureFrame) obj;
        return this.f21156a == pictureFrame.f21156a && this.f21157b.equals(pictureFrame.f21157b) && this.f21158c.equals(pictureFrame.f21158c) && this.f21159d == pictureFrame.f21159d && this.f21160e == pictureFrame.f21160e && this.f21161f == pictureFrame.f21161f && this.f21162g == pictureFrame.f21162g && Arrays.equals(this.f21163h, pictureFrame.f21163h);
    }

    public int hashCode() {
        return ((((((((((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f21156a) * 31) + this.f21157b.hashCode()) * 31) + this.f21158c.hashCode()) * 31) + this.f21159d) * 31) + this.f21160e) * 31) + this.f21161f) * 31) + this.f21162g) * 31) + Arrays.hashCode(this.f21163h);
    }

    public String toString() {
        String str = this.f21157b;
        String str2 = this.f21158c;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 32 + String.valueOf(str2).length());
        sb2.append("Picture: mimeType=");
        sb2.append(str);
        sb2.append(", description=");
        sb2.append(str2);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f21156a);
        parcel.writeString(this.f21157b);
        parcel.writeString(this.f21158c);
        parcel.writeInt(this.f21159d);
        parcel.writeInt(this.f21160e);
        parcel.writeInt(this.f21161f);
        parcel.writeInt(this.f21162g);
        parcel.writeByteArray(this.f21163h);
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public /* synthetic */ p1 z() {
        return c9.a.b(this);
    }

    PictureFrame(Parcel parcel) {
        this.f21156a = parcel.readInt();
        this.f21157b = (String) n0.j(parcel.readString());
        this.f21158c = (String) n0.j(parcel.readString());
        this.f21159d = parcel.readInt();
        this.f21160e = parcel.readInt();
        this.f21161f = parcel.readInt();
        this.f21162g = parcel.readInt();
        this.f21163h = (byte[]) n0.j(parcel.createByteArray());
    }
}
