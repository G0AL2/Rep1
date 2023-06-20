package com.google.android.exoplayer2.metadata.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.Metadata;
import ea.n0;
import ib.i;
import j8.b2;
import j8.p1;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class SlowMotionData implements Metadata.Entry {
    public static final Parcelable.Creator<SlowMotionData> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final List<Segment> f21227a;

    /* loaded from: classes2.dex */
    public static final class Segment implements Parcelable {
        public static final Parcelable.Creator<Segment> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        public final long f21228a;

        /* renamed from: b  reason: collision with root package name */
        public final long f21229b;

        /* renamed from: c  reason: collision with root package name */
        public final int f21230c;

        /* loaded from: classes2.dex */
        class a implements Parcelable.Creator<Segment> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public Segment createFromParcel(Parcel parcel) {
                return new Segment(parcel.readLong(), parcel.readLong(), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public Segment[] newArray(int i10) {
                return new Segment[i10];
            }
        }

        public Segment(long j10, long j11, int i10) {
            ea.a.a(j10 < j11);
            this.f21228a = j10;
            this.f21229b = j11;
            this.f21230c = i10;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || Segment.class != obj.getClass()) {
                return false;
            }
            Segment segment = (Segment) obj;
            return this.f21228a == segment.f21228a && this.f21229b == segment.f21229b && this.f21230c == segment.f21230c;
        }

        public int hashCode() {
            return i.b(Long.valueOf(this.f21228a), Long.valueOf(this.f21229b), Integer.valueOf(this.f21230c));
        }

        public String toString() {
            return n0.C("Segment: startTimeMs=%d, endTimeMs=%d, speedDivisor=%d", Long.valueOf(this.f21228a), Long.valueOf(this.f21229b), Integer.valueOf(this.f21230c));
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeLong(this.f21228a);
            parcel.writeLong(this.f21229b);
            parcel.writeInt(this.f21230c);
        }
    }

    /* loaded from: classes2.dex */
    class a implements Parcelable.Creator<SlowMotionData> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public SlowMotionData createFromParcel(Parcel parcel) {
            ArrayList arrayList = new ArrayList();
            parcel.readList(arrayList, Segment.class.getClassLoader());
            return new SlowMotionData(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public SlowMotionData[] newArray(int i10) {
            return new SlowMotionData[i10];
        }
    }

    public SlowMotionData(List<Segment> list) {
        this.f21227a = list;
        ea.a.a(!c(list));
    }

    private static boolean c(List<Segment> list) {
        if (list.isEmpty()) {
            return false;
        }
        long j10 = list.get(0).f21229b;
        for (int i10 = 1; i10 < list.size(); i10++) {
            if (list.get(i10).f21228a < j10) {
                return true;
            }
            j10 = list.get(i10).f21229b;
        }
        return false;
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
        if (obj == null || SlowMotionData.class != obj.getClass()) {
            return false;
        }
        return this.f21227a.equals(((SlowMotionData) obj).f21227a);
    }

    public int hashCode() {
        return this.f21227a.hashCode();
    }

    public String toString() {
        String valueOf = String.valueOf(this.f21227a);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 21);
        sb2.append("SlowMotion: segments=");
        sb2.append(valueOf);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeList(this.f21227a);
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public /* synthetic */ p1 z() {
        return c9.a.b(this);
    }
}
