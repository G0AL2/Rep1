package com.google.android.exoplayer2.metadata;

import android.os.Parcel;
import android.os.Parcelable;
import ea.n0;
import j8.b2;
import j8.p1;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
public final class Metadata implements Parcelable {
    public static final Parcelable.Creator<Metadata> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    private final Entry[] f21133a;

    /* loaded from: classes2.dex */
    public interface Entry extends Parcelable {
        void Z0(b2.b bVar);

        byte[] c1();

        p1 z();
    }

    /* loaded from: classes2.dex */
    class a implements Parcelable.Creator<Metadata> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public Metadata createFromParcel(Parcel parcel) {
            return new Metadata(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public Metadata[] newArray(int i10) {
            return new Metadata[i10];
        }
    }

    public Metadata(Entry... entryArr) {
        this.f21133a = entryArr;
    }

    public Metadata c(Entry... entryArr) {
        return entryArr.length == 0 ? this : new Metadata((Entry[]) n0.G0(this.f21133a, entryArr));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Metadata e(Metadata metadata) {
        return metadata == null ? this : c(metadata.f21133a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Metadata.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f21133a, ((Metadata) obj).f21133a);
    }

    public Entry f(int i10) {
        return this.f21133a[i10];
    }

    public int g() {
        return this.f21133a.length;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f21133a);
    }

    public String toString() {
        String valueOf = String.valueOf(Arrays.toString(this.f21133a));
        return valueOf.length() != 0 ? "entries=".concat(valueOf) : new String("entries=");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f21133a.length);
        for (Entry entry : this.f21133a) {
            parcel.writeParcelable(entry, 0);
        }
    }

    public Metadata(List<? extends Entry> list) {
        this.f21133a = (Entry[]) list.toArray(new Entry[0]);
    }

    Metadata(Parcel parcel) {
        this.f21133a = new Entry[parcel.readInt()];
        int i10 = 0;
        while (true) {
            Entry[] entryArr = this.f21133a;
            if (i10 >= entryArr.length) {
                return;
            }
            entryArr[i10] = (Entry) parcel.readParcelable(Entry.class.getClassLoader());
            i10++;
        }
    }
}
