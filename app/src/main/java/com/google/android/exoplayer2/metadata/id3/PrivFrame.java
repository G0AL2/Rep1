package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import ea.n0;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class PrivFrame extends Id3Frame {
    public static final Parcelable.Creator<PrivFrame> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    public final String f21207b;

    /* renamed from: c  reason: collision with root package name */
    public final byte[] f21208c;

    /* loaded from: classes2.dex */
    class a implements Parcelable.Creator<PrivFrame> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public PrivFrame createFromParcel(Parcel parcel) {
            return new PrivFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public PrivFrame[] newArray(int i10) {
            return new PrivFrame[i10];
        }
    }

    public PrivFrame(String str, byte[] bArr) {
        super("PRIV");
        this.f21207b = str;
        this.f21208c = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || PrivFrame.class != obj.getClass()) {
            return false;
        }
        PrivFrame privFrame = (PrivFrame) obj;
        return n0.c(this.f21207b, privFrame.f21207b) && Arrays.equals(this.f21208c, privFrame.f21208c);
    }

    public int hashCode() {
        String str = this.f21207b;
        return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + (str != null ? str.hashCode() : 0)) * 31) + Arrays.hashCode(this.f21208c);
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public String toString() {
        String str = this.f21198a;
        String str2 = this.f21207b;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 8 + String.valueOf(str2).length());
        sb2.append(str);
        sb2.append(": owner=");
        sb2.append(str2);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f21207b);
        parcel.writeByteArray(this.f21208c);
    }

    PrivFrame(Parcel parcel) {
        super("PRIV");
        this.f21207b = (String) n0.j(parcel.readString());
        this.f21208c = (byte[]) n0.j(parcel.createByteArray());
    }
}
