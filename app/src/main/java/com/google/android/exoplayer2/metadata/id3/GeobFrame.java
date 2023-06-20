package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import ea.n0;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class GeobFrame extends Id3Frame {
    public static final Parcelable.Creator<GeobFrame> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    public final String f21194b;

    /* renamed from: c  reason: collision with root package name */
    public final String f21195c;

    /* renamed from: d  reason: collision with root package name */
    public final String f21196d;

    /* renamed from: e  reason: collision with root package name */
    public final byte[] f21197e;

    /* loaded from: classes2.dex */
    class a implements Parcelable.Creator<GeobFrame> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public GeobFrame createFromParcel(Parcel parcel) {
            return new GeobFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public GeobFrame[] newArray(int i10) {
            return new GeobFrame[i10];
        }
    }

    public GeobFrame(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f21194b = str;
        this.f21195c = str2;
        this.f21196d = str3;
        this.f21197e = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || GeobFrame.class != obj.getClass()) {
            return false;
        }
        GeobFrame geobFrame = (GeobFrame) obj;
        return n0.c(this.f21194b, geobFrame.f21194b) && n0.c(this.f21195c, geobFrame.f21195c) && n0.c(this.f21196d, geobFrame.f21196d) && Arrays.equals(this.f21197e, geobFrame.f21197e);
    }

    public int hashCode() {
        String str = this.f21194b;
        int hashCode = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f21195c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f21196d;
        return ((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + Arrays.hashCode(this.f21197e);
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public String toString() {
        String str = this.f21198a;
        String str2 = this.f21194b;
        String str3 = this.f21195c;
        String str4 = this.f21196d;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 36 + String.valueOf(str2).length() + String.valueOf(str3).length() + String.valueOf(str4).length());
        sb2.append(str);
        sb2.append(": mimeType=");
        sb2.append(str2);
        sb2.append(", filename=");
        sb2.append(str3);
        sb2.append(", description=");
        sb2.append(str4);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f21194b);
        parcel.writeString(this.f21195c);
        parcel.writeString(this.f21196d);
        parcel.writeByteArray(this.f21197e);
    }

    GeobFrame(Parcel parcel) {
        super("GEOB");
        this.f21194b = (String) n0.j(parcel.readString());
        this.f21195c = (String) n0.j(parcel.readString());
        this.f21196d = (String) n0.j(parcel.readString());
        this.f21197e = (byte[]) n0.j(parcel.createByteArray());
    }
}
