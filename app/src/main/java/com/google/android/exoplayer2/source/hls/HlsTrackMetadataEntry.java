package com.google.android.exoplayer2.source.hls;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.exoplayer2.metadata.Metadata;
import j8.b2;
import j8.p1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class HlsTrackMetadataEntry implements Metadata.Entry {
    public static final Parcelable.Creator<HlsTrackMetadataEntry> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final String f21425a;

    /* renamed from: b  reason: collision with root package name */
    public final String f21426b;

    /* renamed from: c  reason: collision with root package name */
    public final List<VariantInfo> f21427c;

    /* loaded from: classes2.dex */
    class a implements Parcelable.Creator<HlsTrackMetadataEntry> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public HlsTrackMetadataEntry createFromParcel(Parcel parcel) {
            return new HlsTrackMetadataEntry(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public HlsTrackMetadataEntry[] newArray(int i10) {
            return new HlsTrackMetadataEntry[i10];
        }
    }

    public HlsTrackMetadataEntry(String str, String str2, List<VariantInfo> list) {
        this.f21425a = str;
        this.f21426b = str2;
        this.f21427c = Collections.unmodifiableList(new ArrayList(list));
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
        if (obj == null || HlsTrackMetadataEntry.class != obj.getClass()) {
            return false;
        }
        HlsTrackMetadataEntry hlsTrackMetadataEntry = (HlsTrackMetadataEntry) obj;
        return TextUtils.equals(this.f21425a, hlsTrackMetadataEntry.f21425a) && TextUtils.equals(this.f21426b, hlsTrackMetadataEntry.f21426b) && this.f21427c.equals(hlsTrackMetadataEntry.f21427c);
    }

    public int hashCode() {
        String str = this.f21425a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f21426b;
        return ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f21427c.hashCode();
    }

    public String toString() {
        String str;
        String str2 = this.f21425a;
        if (str2 != null) {
            String str3 = this.f21426b;
            StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 5 + String.valueOf(str3).length());
            sb2.append(" [");
            sb2.append(str2);
            sb2.append(", ");
            sb2.append(str3);
            sb2.append("]");
            str = sb2.toString();
        } else {
            str = "";
        }
        String valueOf = String.valueOf(str);
        return valueOf.length() != 0 ? "HlsTrackMetadataEntry".concat(valueOf) : new String("HlsTrackMetadataEntry");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f21425a);
        parcel.writeString(this.f21426b);
        int size = this.f21427c.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            parcel.writeParcelable(this.f21427c.get(i11), 0);
        }
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public /* synthetic */ p1 z() {
        return c9.a.b(this);
    }

    HlsTrackMetadataEntry(Parcel parcel) {
        this.f21425a = parcel.readString();
        this.f21426b = parcel.readString();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i10 = 0; i10 < readInt; i10++) {
            arrayList.add((VariantInfo) parcel.readParcelable(VariantInfo.class.getClassLoader()));
        }
        this.f21427c = Collections.unmodifiableList(arrayList);
    }

    /* loaded from: classes2.dex */
    public static final class VariantInfo implements Parcelable {
        public static final Parcelable.Creator<VariantInfo> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        public final int f21428a;

        /* renamed from: b  reason: collision with root package name */
        public final int f21429b;

        /* renamed from: c  reason: collision with root package name */
        public final String f21430c;

        /* renamed from: d  reason: collision with root package name */
        public final String f21431d;

        /* renamed from: e  reason: collision with root package name */
        public final String f21432e;

        /* renamed from: f  reason: collision with root package name */
        public final String f21433f;

        /* loaded from: classes2.dex */
        class a implements Parcelable.Creator<VariantInfo> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public VariantInfo createFromParcel(Parcel parcel) {
                return new VariantInfo(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public VariantInfo[] newArray(int i10) {
                return new VariantInfo[i10];
            }
        }

        public VariantInfo(int i10, int i11, String str, String str2, String str3, String str4) {
            this.f21428a = i10;
            this.f21429b = i11;
            this.f21430c = str;
            this.f21431d = str2;
            this.f21432e = str3;
            this.f21433f = str4;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || VariantInfo.class != obj.getClass()) {
                return false;
            }
            VariantInfo variantInfo = (VariantInfo) obj;
            return this.f21428a == variantInfo.f21428a && this.f21429b == variantInfo.f21429b && TextUtils.equals(this.f21430c, variantInfo.f21430c) && TextUtils.equals(this.f21431d, variantInfo.f21431d) && TextUtils.equals(this.f21432e, variantInfo.f21432e) && TextUtils.equals(this.f21433f, variantInfo.f21433f);
        }

        public int hashCode() {
            int i10 = ((this.f21428a * 31) + this.f21429b) * 31;
            String str = this.f21430c;
            int hashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f21431d;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f21432e;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.f21433f;
            return hashCode3 + (str4 != null ? str4.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f21428a);
            parcel.writeInt(this.f21429b);
            parcel.writeString(this.f21430c);
            parcel.writeString(this.f21431d);
            parcel.writeString(this.f21432e);
            parcel.writeString(this.f21433f);
        }

        VariantInfo(Parcel parcel) {
            this.f21428a = parcel.readInt();
            this.f21429b = parcel.readInt();
            this.f21430c = parcel.readString();
            this.f21431d = parcel.readString();
            this.f21432e = parcel.readString();
            this.f21433f = parcel.readString();
        }
    }
}
