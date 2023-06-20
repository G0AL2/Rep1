package com.inmobi.media;

import android.os.Parcel;
import android.os.Parcelable;
import com.inmobi.unification.sdk.model.ASRequestParams;
import java.util.Map;
import java.util.UUID;

/* compiled from: AdPlacement.java */
/* loaded from: classes3.dex */
public final class ba implements Parcelable {
    public static final Parcelable.Creator<ba> CREATOR = new Parcelable.Creator<ba>() { // from class: com.inmobi.media.ba.1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ba createFromParcel(Parcel parcel) {
            return new ba(parcel, (byte) 0);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ba[] newArray(int i10) {
            return new ba[i10];
        }
    };

    /* renamed from: a  reason: collision with root package name */
    private final long f24663a;

    /* renamed from: b  reason: collision with root package name */
    private final long f24664b;

    /* renamed from: c  reason: collision with root package name */
    private final String f24665c;

    /* renamed from: d  reason: collision with root package name */
    private String f24666d;

    /* renamed from: e  reason: collision with root package name */
    private Map<String, String> f24667e;

    /* renamed from: f  reason: collision with root package name */
    private String f24668f;

    /* renamed from: g  reason: collision with root package name */
    private final String f24669g;

    /* renamed from: h  reason: collision with root package name */
    private String f24670h;

    /* renamed from: i  reason: collision with root package name */
    private String f24671i;

    /* renamed from: j  reason: collision with root package name */
    private String f24672j;

    /* renamed from: k  reason: collision with root package name */
    private String f24673k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f24674l;

    /* renamed from: m  reason: collision with root package name */
    private ASRequestParams f24675m;

    /* renamed from: n  reason: collision with root package name */
    private String f24676n;

    /* compiled from: AdPlacement.java */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: c  reason: collision with root package name */
        private String f24679c;

        /* renamed from: d  reason: collision with root package name */
        private Map<String, String> f24680d;

        /* renamed from: e  reason: collision with root package name */
        private String f24681e;

        /* renamed from: f  reason: collision with root package name */
        private String f24682f;

        /* renamed from: g  reason: collision with root package name */
        private String f24683g;

        /* renamed from: j  reason: collision with root package name */
        private boolean f24686j;

        /* renamed from: l  reason: collision with root package name */
        private ASRequestParams f24688l;

        /* renamed from: m  reason: collision with root package name */
        private String f24689m;

        /* renamed from: a  reason: collision with root package name */
        private long f24677a = Long.MIN_VALUE;

        /* renamed from: b  reason: collision with root package name */
        private long f24678b = Long.MIN_VALUE;

        /* renamed from: i  reason: collision with root package name */
        private String f24685i = "";

        /* renamed from: k  reason: collision with root package name */
        private String f24687k = "activity";

        /* renamed from: h  reason: collision with root package name */
        private String f24684h = UUID.randomUUID().toString();

        public a(String str, String str2) {
            this.f24682f = str;
            this.f24679c = str2;
        }

        public final a a(long j10) {
            this.f24677a = j10;
            return this;
        }

        public final a b(long j10) {
            this.f24678b = j10;
            return this;
        }

        public final a c(String str) {
            this.f24681e = str;
            return this;
        }

        public final a d(String str) {
            this.f24683g = str;
            return this;
        }

        public final a e(String str) {
            this.f24689m = str;
            return this;
        }

        public final a a(ba baVar) {
            this.f24678b = baVar.f24664b;
            this.f24677a = baVar.f24663a;
            this.f24687k = baVar.f24673k;
            this.f24680d = baVar.f24667e;
            this.f24685i = baVar.f24672j;
            return this;
        }

        public final a b(String str) {
            this.f24687k = str;
            return this;
        }

        public final a a(String str) {
            this.f24685i = str;
            return this;
        }

        public final a a(Map<String, String> map) {
            this.f24680d = map;
            return this;
        }

        public final a a(boolean z10) {
            this.f24686j = z10;
            return this;
        }

        public final a a(ASRequestParams aSRequestParams) {
            this.f24688l = aSRequestParams;
            return this;
        }

        public final ba a() {
            char c10;
            String str = this.f24679c;
            int hashCode = str.hashCode();
            if (hashCode != -2101048242) {
                if (hashCode == 557596132 && str.equals("AerServ")) {
                    c10 = 2;
                }
                c10 = 65535;
            } else {
                if (str.equals("InMobi")) {
                    c10 = 1;
                }
                c10 = 65535;
            }
            if (c10 != 2) {
                if (this.f24677a == Long.MIN_VALUE) {
                    throw new IllegalStateException("When the integration type is IM, IM-Plc can't be empty");
                }
            } else if (this.f24678b == Long.MIN_VALUE) {
                throw new IllegalStateException("When the integration type is AS, AS-Plc can't be empty");
            }
            ba baVar = new ba(this.f24677a, this.f24678b, ba.a(this.f24680d), this.f24682f, this.f24679c, this.f24683g, (byte) 0);
            baVar.f24668f = this.f24681e;
            baVar.f24667e = this.f24680d;
            baVar.f24672j = this.f24685i;
            baVar.f24673k = this.f24687k;
            baVar.f24671i = this.f24684h;
            baVar.f24674l = this.f24686j;
            baVar.f24675m = this.f24688l;
            baVar.f24676n = this.f24689m;
            return baVar;
        }
    }

    /* synthetic */ ba(long j10, long j11, String str, String str2, String str3, String str4, byte b10) {
        this(j10, j11, str, str2, str3, str4);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ba.class == obj.getClass()) {
            ba baVar = (ba) obj;
            if (this.f24663a == baVar.f24663a && this.f24664b == baVar.f24664b && this.f24665c.equals(baVar.f24665c) && this.f24673k.equals(baVar.f24673k) && this.f24666d.equals(baVar.f24666d) && this.f24669g.equals(baVar.f24669g)) {
                return true;
            }
        }
        return false;
    }

    public final boolean f() {
        return this.f24674l;
    }

    public final ASRequestParams g() {
        return this.f24675m;
    }

    public final String h() {
        return this.f24676n;
    }

    public final int hashCode() {
        long j10 = this.f24664b;
        long j11 = this.f24663a;
        return (((((((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) (j11 ^ (j11 >>> 31)))) * 30) + this.f24669g.hashCode()) * 29) + this.f24673k.hashCode();
    }

    public final long i() {
        return this.f24664b;
    }

    public final long j() {
        return this.f24663a;
    }

    public final String k() {
        return this.f24666d;
    }

    public final String l() {
        return this.f24669g;
    }

    public final String m() {
        return this.f24672j;
    }

    public final String n() {
        return this.f24673k;
    }

    public final String o() {
        return this.f24671i;
    }

    public final String p() {
        return this.f24670h;
    }

    public final String toString() {
        char c10;
        String a10 = a();
        int hashCode = a10.hashCode();
        if (hashCode != -2101048242) {
            if (hashCode == 557596132 && a10.equals("AerServ")) {
                c10 = 2;
            }
            c10 = 65535;
        } else {
            if (a10.equals("InMobi")) {
                c10 = 1;
            }
            c10 = 65535;
        }
        if (c10 != 2) {
            return String.valueOf(this.f24663a);
        }
        return String.valueOf(this.f24664b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f24664b);
        parcel.writeLong(this.f24663a);
        parcel.writeString(this.f24665c);
        parcel.writeString(this.f24673k);
        parcel.writeString(this.f24669g);
    }

    /* synthetic */ ba(Parcel parcel, byte b10) {
        this(parcel);
    }

    private ba(long j10, long j11, String str, String str2, String str3, String str4) {
        this.f24672j = "";
        this.f24673k = "activity";
        this.f24663a = j10;
        this.f24664b = j11;
        this.f24665c = str3;
        this.f24666d = str;
        this.f24669g = str2;
        if (str == null) {
            this.f24666d = "";
        }
        this.f24670h = str4;
    }

    public final String b() {
        char c10;
        String str = this.f24665c;
        int hashCode = str.hashCode();
        if (hashCode != -2101048242) {
            if (hashCode == 557596132 && str.equals("AerServ")) {
                c10 = 2;
            }
            c10 = 65535;
        } else {
            if (str.equals("InMobi")) {
                c10 = 1;
            }
            c10 = 65535;
        }
        return c10 != 2 ? "im" : "as";
    }

    public final Map<String, String> c() {
        return this.f24667e;
    }

    public final String d() {
        return this.f24668f;
    }

    public final long e() {
        char c10;
        String str = this.f24665c;
        int hashCode = str.hashCode();
        if (hashCode != -2101048242) {
            if (hashCode == 557596132 && str.equals("AerServ")) {
                c10 = 2;
            }
            c10 = 65535;
        } else {
            if (str.equals("InMobi")) {
                c10 = 1;
            }
            c10 = 65535;
        }
        if (c10 != 2) {
            return this.f24663a;
        }
        return this.f24664b;
    }

    public final void b(Map<String, String> map) {
        this.f24667e = map;
    }

    public final void b(String str) {
        this.f24673k = str;
    }

    public static String a(Map<String, String> map) {
        String str;
        return (map == null || (str = map.get("tp")) == null) ? "" : str;
    }

    public final String a() {
        return this.f24665c;
    }

    public final void a(String str) {
        this.f24672j = str;
    }

    private ba(Parcel parcel) {
        this.f24672j = "";
        String str = "activity";
        this.f24673k = "activity";
        this.f24664b = parcel.readLong();
        this.f24663a = parcel.readLong();
        this.f24665c = parcel.readString();
        String readString = parcel.readString();
        if (readString != null) {
            char c10 = 65535;
            int hashCode = readString.hashCode();
            if (hashCode != -1655966961) {
                if (hashCode == -1006804125 && readString.equals("others")) {
                    c10 = 2;
                }
            } else if (readString.equals("activity")) {
                c10 = 1;
            }
            if (c10 == 2) {
                str = "others";
            }
        }
        this.f24673k = str;
        this.f24669g = parcel.readString();
    }
}
