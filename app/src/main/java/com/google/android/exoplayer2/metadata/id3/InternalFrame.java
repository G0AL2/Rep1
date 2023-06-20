package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import ea.n0;

/* loaded from: classes2.dex */
public final class InternalFrame extends Id3Frame {
    public static final Parcelable.Creator<InternalFrame> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    public final String f21199b;

    /* renamed from: c  reason: collision with root package name */
    public final String f21200c;

    /* renamed from: d  reason: collision with root package name */
    public final String f21201d;

    /* loaded from: classes2.dex */
    class a implements Parcelable.Creator<InternalFrame> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public InternalFrame createFromParcel(Parcel parcel) {
            return new InternalFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public InternalFrame[] newArray(int i10) {
            return new InternalFrame[i10];
        }
    }

    public InternalFrame(String str, String str2, String str3) {
        super("----");
        this.f21199b = str;
        this.f21200c = str2;
        this.f21201d = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || InternalFrame.class != obj.getClass()) {
            return false;
        }
        InternalFrame internalFrame = (InternalFrame) obj;
        return n0.c(this.f21200c, internalFrame.f21200c) && n0.c(this.f21199b, internalFrame.f21199b) && n0.c(this.f21201d, internalFrame.f21201d);
    }

    public int hashCode() {
        String str = this.f21199b;
        int hashCode = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f21200c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f21201d;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public String toString() {
        String str = this.f21198a;
        String str2 = this.f21199b;
        String str3 = this.f21200c;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 23 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb2.append(str);
        sb2.append(": domain=");
        sb2.append(str2);
        sb2.append(", description=");
        sb2.append(str3);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f21198a);
        parcel.writeString(this.f21199b);
        parcel.writeString(this.f21201d);
    }

    InternalFrame(Parcel parcel) {
        super("----");
        this.f21199b = (String) n0.j(parcel.readString());
        this.f21200c = (String) n0.j(parcel.readString());
        this.f21201d = (String) n0.j(parcel.readString());
    }
}
