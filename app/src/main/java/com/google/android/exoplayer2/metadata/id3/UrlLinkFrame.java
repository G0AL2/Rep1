package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import ea.n0;

/* loaded from: classes2.dex */
public final class UrlLinkFrame extends Id3Frame {
    public static final Parcelable.Creator<UrlLinkFrame> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    public final String f21211b;

    /* renamed from: c  reason: collision with root package name */
    public final String f21212c;

    /* loaded from: classes2.dex */
    class a implements Parcelable.Creator<UrlLinkFrame> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public UrlLinkFrame createFromParcel(Parcel parcel) {
            return new UrlLinkFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public UrlLinkFrame[] newArray(int i10) {
            return new UrlLinkFrame[i10];
        }
    }

    public UrlLinkFrame(String str, String str2, String str3) {
        super(str);
        this.f21211b = str2;
        this.f21212c = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || UrlLinkFrame.class != obj.getClass()) {
            return false;
        }
        UrlLinkFrame urlLinkFrame = (UrlLinkFrame) obj;
        return this.f21198a.equals(urlLinkFrame.f21198a) && n0.c(this.f21211b, urlLinkFrame.f21211b) && n0.c(this.f21212c, urlLinkFrame.f21212c);
    }

    public int hashCode() {
        int hashCode = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f21198a.hashCode()) * 31;
        String str = this.f21211b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f21212c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public String toString() {
        String str = this.f21198a;
        String str2 = this.f21212c;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 6 + String.valueOf(str2).length());
        sb2.append(str);
        sb2.append(": url=");
        sb2.append(str2);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f21198a);
        parcel.writeString(this.f21211b);
        parcel.writeString(this.f21212c);
    }

    UrlLinkFrame(Parcel parcel) {
        super((String) n0.j(parcel.readString()));
        this.f21211b = parcel.readString();
        this.f21212c = (String) n0.j(parcel.readString());
    }
}
