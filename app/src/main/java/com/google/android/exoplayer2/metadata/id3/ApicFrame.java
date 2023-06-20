package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import ea.n0;
import j8.b2;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class ApicFrame extends Id3Frame {
    public static final Parcelable.Creator<ApicFrame> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    public final String f21175b;

    /* renamed from: c  reason: collision with root package name */
    public final String f21176c;

    /* renamed from: d  reason: collision with root package name */
    public final int f21177d;

    /* renamed from: e  reason: collision with root package name */
    public final byte[] f21178e;

    /* loaded from: classes2.dex */
    class a implements Parcelable.Creator<ApicFrame> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public ApicFrame createFromParcel(Parcel parcel) {
            return new ApicFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public ApicFrame[] newArray(int i10) {
            return new ApicFrame[i10];
        }
    }

    public ApicFrame(String str, String str2, int i10, byte[] bArr) {
        super("APIC");
        this.f21175b = str;
        this.f21176c = str2;
        this.f21177d = i10;
        this.f21178e = bArr;
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame, com.google.android.exoplayer2.metadata.Metadata.Entry
    public void Z0(b2.b bVar) {
        bVar.H(this.f21178e, this.f21177d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ApicFrame.class != obj.getClass()) {
            return false;
        }
        ApicFrame apicFrame = (ApicFrame) obj;
        return this.f21177d == apicFrame.f21177d && n0.c(this.f21175b, apicFrame.f21175b) && n0.c(this.f21176c, apicFrame.f21176c) && Arrays.equals(this.f21178e, apicFrame.f21178e);
    }

    public int hashCode() {
        int i10 = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f21177d) * 31;
        String str = this.f21175b;
        int hashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f21176c;
        return ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + Arrays.hashCode(this.f21178e);
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public String toString() {
        String str = this.f21198a;
        String str2 = this.f21175b;
        String str3 = this.f21176c;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 25 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb2.append(str);
        sb2.append(": mimeType=");
        sb2.append(str2);
        sb2.append(", description=");
        sb2.append(str3);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f21175b);
        parcel.writeString(this.f21176c);
        parcel.writeInt(this.f21177d);
        parcel.writeByteArray(this.f21178e);
    }

    ApicFrame(Parcel parcel) {
        super("APIC");
        this.f21175b = (String) n0.j(parcel.readString());
        this.f21176c = parcel.readString();
        this.f21177d = parcel.readInt();
        this.f21178e = (byte[]) n0.j(parcel.createByteArray());
    }
}
