package com.google.android.exoplayer2.metadata.flac;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.Metadata;
import com.ironsource.mediationsdk.logger.IronSourceError;
import ea.n0;
import j8.b2;
import j8.p1;

@Deprecated
/* loaded from: classes2.dex */
public class VorbisComment implements Metadata.Entry {
    public static final Parcelable.Creator<VorbisComment> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final String f21164a;

    /* renamed from: b  reason: collision with root package name */
    public final String f21165b;

    /* loaded from: classes2.dex */
    class a implements Parcelable.Creator<VorbisComment> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public VorbisComment createFromParcel(Parcel parcel) {
            return new VorbisComment(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public VorbisComment[] newArray(int i10) {
            return new VorbisComment[i10];
        }
    }

    public VorbisComment(String str, String str2) {
        this.f21164a = str;
        this.f21165b = str2;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public void Z0(b2.b bVar) {
        String str = this.f21164a;
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case 62359119:
                if (str.equals("ALBUM")) {
                    c10 = 0;
                    break;
                }
                break;
            case 79833656:
                if (str.equals("TITLE")) {
                    c10 = 1;
                    break;
                }
                break;
            case 428414940:
                if (str.equals("DESCRIPTION")) {
                    c10 = 2;
                    break;
                }
                break;
            case 1746739798:
                if (str.equals("ALBUMARTIST")) {
                    c10 = 3;
                    break;
                }
                break;
            case 1939198791:
                if (str.equals("ARTIST")) {
                    c10 = 4;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                bVar.M(this.f21165b);
                return;
            case 1:
                bVar.k0(this.f21165b);
                return;
            case 2:
                bVar.T(this.f21165b);
                return;
            case 3:
                bVar.L(this.f21165b);
                return;
            case 4:
                bVar.N(this.f21165b);
                return;
            default:
                return;
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
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VorbisComment vorbisComment = (VorbisComment) obj;
        return this.f21164a.equals(vorbisComment.f21164a) && this.f21165b.equals(vorbisComment.f21165b);
    }

    public int hashCode() {
        return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f21164a.hashCode()) * 31) + this.f21165b.hashCode();
    }

    public String toString() {
        String str = this.f21164a;
        String str2 = this.f21165b;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 5 + String.valueOf(str2).length());
        sb2.append("VC: ");
        sb2.append(str);
        sb2.append("=");
        sb2.append(str2);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f21164a);
        parcel.writeString(this.f21165b);
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public /* synthetic */ p1 z() {
        return c9.a.b(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public VorbisComment(Parcel parcel) {
        this.f21164a = (String) n0.j(parcel.readString());
        this.f21165b = (String) n0.j(parcel.readString());
    }
}
