package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import ea.n0;

/* loaded from: classes2.dex */
public final class CommentFrame extends Id3Frame {
    public static final Parcelable.Creator<CommentFrame> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    public final String f21191b;

    /* renamed from: c  reason: collision with root package name */
    public final String f21192c;

    /* renamed from: d  reason: collision with root package name */
    public final String f21193d;

    /* loaded from: classes2.dex */
    class a implements Parcelable.Creator<CommentFrame> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public CommentFrame createFromParcel(Parcel parcel) {
            return new CommentFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public CommentFrame[] newArray(int i10) {
            return new CommentFrame[i10];
        }
    }

    public CommentFrame(String str, String str2, String str3) {
        super("COMM");
        this.f21191b = str;
        this.f21192c = str2;
        this.f21193d = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CommentFrame.class != obj.getClass()) {
            return false;
        }
        CommentFrame commentFrame = (CommentFrame) obj;
        return n0.c(this.f21192c, commentFrame.f21192c) && n0.c(this.f21191b, commentFrame.f21191b) && n0.c(this.f21193d, commentFrame.f21193d);
    }

    public int hashCode() {
        String str = this.f21191b;
        int hashCode = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f21192c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f21193d;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public String toString() {
        String str = this.f21198a;
        String str2 = this.f21191b;
        String str3 = this.f21192c;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 25 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb2.append(str);
        sb2.append(": language=");
        sb2.append(str2);
        sb2.append(", description=");
        sb2.append(str3);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f21198a);
        parcel.writeString(this.f21191b);
        parcel.writeString(this.f21193d);
    }

    CommentFrame(Parcel parcel) {
        super("COMM");
        this.f21191b = (String) n0.j(parcel.readString());
        this.f21192c = (String) n0.j(parcel.readString());
        this.f21193d = (String) n0.j(parcel.readString());
    }
}
