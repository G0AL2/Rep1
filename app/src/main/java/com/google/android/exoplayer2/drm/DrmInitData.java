package com.google.android.exoplayer2.drm;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import ea.n0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

/* loaded from: classes2.dex */
public final class DrmInitData implements Comparator<SchemeData>, Parcelable {
    public static final Parcelable.Creator<DrmInitData> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    private final SchemeData[] f21018a;

    /* renamed from: b  reason: collision with root package name */
    private int f21019b;

    /* renamed from: c  reason: collision with root package name */
    public final String f21020c;

    /* renamed from: d  reason: collision with root package name */
    public final int f21021d;

    /* loaded from: classes2.dex */
    public static final class SchemeData implements Parcelable {
        public static final Parcelable.Creator<SchemeData> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        private int f21022a;

        /* renamed from: b  reason: collision with root package name */
        public final UUID f21023b;

        /* renamed from: c  reason: collision with root package name */
        public final String f21024c;

        /* renamed from: d  reason: collision with root package name */
        public final String f21025d;

        /* renamed from: e  reason: collision with root package name */
        public final byte[] f21026e;

        /* loaded from: classes2.dex */
        class a implements Parcelable.Creator<SchemeData> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public SchemeData createFromParcel(Parcel parcel) {
                return new SchemeData(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public SchemeData[] newArray(int i10) {
                return new SchemeData[i10];
            }
        }

        public SchemeData(UUID uuid, String str, byte[] bArr) {
            this(uuid, null, str, bArr);
        }

        public boolean c(SchemeData schemeData) {
            return f() && !schemeData.f() && g(schemeData.f21023b);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public SchemeData e(byte[] bArr) {
            return new SchemeData(this.f21023b, this.f21024c, this.f21025d, bArr);
        }

        public boolean equals(Object obj) {
            if (obj instanceof SchemeData) {
                if (obj == this) {
                    return true;
                }
                SchemeData schemeData = (SchemeData) obj;
                return n0.c(this.f21024c, schemeData.f21024c) && n0.c(this.f21025d, schemeData.f21025d) && n0.c(this.f21023b, schemeData.f21023b) && Arrays.equals(this.f21026e, schemeData.f21026e);
            }
            return false;
        }

        public boolean f() {
            return this.f21026e != null;
        }

        public boolean g(UUID uuid) {
            return j8.h.f32425a.equals(this.f21023b) || uuid.equals(this.f21023b);
        }

        public int hashCode() {
            if (this.f21022a == 0) {
                int hashCode = this.f21023b.hashCode() * 31;
                String str = this.f21024c;
                this.f21022a = ((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f21025d.hashCode()) * 31) + Arrays.hashCode(this.f21026e);
            }
            return this.f21022a;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeLong(this.f21023b.getMostSignificantBits());
            parcel.writeLong(this.f21023b.getLeastSignificantBits());
            parcel.writeString(this.f21024c);
            parcel.writeString(this.f21025d);
            parcel.writeByteArray(this.f21026e);
        }

        public SchemeData(UUID uuid, String str, String str2, byte[] bArr) {
            this.f21023b = (UUID) ea.a.e(uuid);
            this.f21024c = str;
            this.f21025d = (String) ea.a.e(str2);
            this.f21026e = bArr;
        }

        SchemeData(Parcel parcel) {
            this.f21023b = new UUID(parcel.readLong(), parcel.readLong());
            this.f21024c = parcel.readString();
            this.f21025d = (String) n0.j(parcel.readString());
            this.f21026e = parcel.createByteArray();
        }
    }

    /* loaded from: classes2.dex */
    class a implements Parcelable.Creator<DrmInitData> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public DrmInitData createFromParcel(Parcel parcel) {
            return new DrmInitData(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public DrmInitData[] newArray(int i10) {
            return new DrmInitData[i10];
        }
    }

    public DrmInitData(List<SchemeData> list) {
        this(null, false, (SchemeData[]) list.toArray(new SchemeData[0]));
    }

    private static boolean e(ArrayList<SchemeData> arrayList, int i10, UUID uuid) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (arrayList.get(i11).f21023b.equals(uuid)) {
                return true;
            }
        }
        return false;
    }

    public static DrmInitData g(DrmInitData drmInitData, DrmInitData drmInitData2) {
        String str;
        SchemeData[] schemeDataArr;
        SchemeData[] schemeDataArr2;
        ArrayList arrayList = new ArrayList();
        if (drmInitData != null) {
            str = drmInitData.f21020c;
            for (SchemeData schemeData : drmInitData.f21018a) {
                if (schemeData.f()) {
                    arrayList.add(schemeData);
                }
            }
        } else {
            str = null;
        }
        if (drmInitData2 != null) {
            if (str == null) {
                str = drmInitData2.f21020c;
            }
            int size = arrayList.size();
            for (SchemeData schemeData2 : drmInitData2.f21018a) {
                if (schemeData2.f() && !e(arrayList, size, schemeData2.f21023b)) {
                    arrayList.add(schemeData2);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new DrmInitData(str, arrayList);
    }

    @Override // java.util.Comparator
    /* renamed from: c */
    public int compare(SchemeData schemeData, SchemeData schemeData2) {
        UUID uuid = j8.h.f32425a;
        if (uuid.equals(schemeData.f21023b)) {
            return uuid.equals(schemeData2.f21023b) ? 0 : 1;
        }
        return schemeData.f21023b.compareTo(schemeData2.f21023b);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DrmInitData.class != obj.getClass()) {
            return false;
        }
        DrmInitData drmInitData = (DrmInitData) obj;
        return n0.c(this.f21020c, drmInitData.f21020c) && Arrays.equals(this.f21018a, drmInitData.f21018a);
    }

    public DrmInitData f(String str) {
        return n0.c(this.f21020c, str) ? this : new DrmInitData(str, false, this.f21018a);
    }

    public SchemeData h(int i10) {
        return this.f21018a[i10];
    }

    public int hashCode() {
        if (this.f21019b == 0) {
            String str = this.f21020c;
            this.f21019b = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f21018a);
        }
        return this.f21019b;
    }

    public DrmInitData i(DrmInitData drmInitData) {
        String str;
        String str2 = this.f21020c;
        ea.a.f(str2 == null || (str = drmInitData.f21020c) == null || TextUtils.equals(str2, str));
        String str3 = this.f21020c;
        if (str3 == null) {
            str3 = drmInitData.f21020c;
        }
        return new DrmInitData(str3, (SchemeData[]) n0.G0(this.f21018a, drmInitData.f21018a));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f21020c);
        parcel.writeTypedArray(this.f21018a, 0);
    }

    public DrmInitData(String str, List<SchemeData> list) {
        this(str, false, (SchemeData[]) list.toArray(new SchemeData[0]));
    }

    public DrmInitData(SchemeData... schemeDataArr) {
        this((String) null, schemeDataArr);
    }

    public DrmInitData(String str, SchemeData... schemeDataArr) {
        this(str, true, schemeDataArr);
    }

    private DrmInitData(String str, boolean z10, SchemeData... schemeDataArr) {
        this.f21020c = str;
        schemeDataArr = z10 ? (SchemeData[]) schemeDataArr.clone() : schemeDataArr;
        this.f21018a = schemeDataArr;
        this.f21021d = schemeDataArr.length;
        Arrays.sort(schemeDataArr, this);
    }

    DrmInitData(Parcel parcel) {
        this.f21020c = parcel.readString();
        SchemeData[] schemeDataArr = (SchemeData[]) n0.j((SchemeData[]) parcel.createTypedArray(SchemeData.CREATOR));
        this.f21018a = schemeDataArr;
        this.f21021d = schemeDataArr.length;
    }
}
