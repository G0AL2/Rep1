package com.fyber.inneractive.sdk.player.exoplayer2.drm;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.player.exoplayer2.util.u;
import java.util.Arrays;
import java.util.Comparator;
import java.util.UUID;

/* loaded from: classes.dex */
public final class a implements Comparator<b>, Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0246a();

    /* renamed from: a  reason: collision with root package name */
    public final b[] f18127a;

    /* renamed from: b  reason: collision with root package name */
    public int f18128b;

    /* renamed from: c  reason: collision with root package name */
    public final int f18129c;

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.drm.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0246a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public a[] newArray(int i10) {
            return new a[i10];
        }
    }

    public a(boolean z10, b... bVarArr) {
        bVarArr = z10 ? (b[]) bVarArr.clone() : bVarArr;
        Arrays.sort(bVarArr, this);
        for (int i10 = 1; i10 < bVarArr.length; i10++) {
            if (bVarArr[i10 - 1].f18131b.equals(bVarArr[i10].f18131b)) {
                throw new IllegalArgumentException("Duplicate data for uuid: " + bVarArr[i10].f18131b);
            }
        }
        this.f18127a = bVarArr;
        this.f18129c = bVarArr.length;
    }

    @Override // java.util.Comparator
    public int compare(b bVar, b bVar2) {
        b bVar3 = bVar;
        b bVar4 = bVar2;
        UUID uuid = com.fyber.inneractive.sdk.player.exoplayer2.b.f18104b;
        if (uuid.equals(bVar3.f18131b)) {
            return uuid.equals(bVar4.f18131b) ? 0 : 1;
        }
        return bVar3.f18131b.compareTo(bVar4.f18131b);
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
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f18127a, ((a) obj).f18127a);
    }

    public int hashCode() {
        if (this.f18128b == 0) {
            this.f18128b = Arrays.hashCode(this.f18127a);
        }
        return this.f18128b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeTypedArray(this.f18127a, 0);
    }

    /* loaded from: classes.dex */
    public static final class b implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new C0247a();

        /* renamed from: a  reason: collision with root package name */
        public int f18130a;

        /* renamed from: b  reason: collision with root package name */
        public final UUID f18131b;

        /* renamed from: c  reason: collision with root package name */
        public final String f18132c;

        /* renamed from: d  reason: collision with root package name */
        public final byte[] f18133d;

        /* renamed from: e  reason: collision with root package name */
        public final boolean f18134e;

        /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.drm.a$b$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0247a implements Parcelable.Creator<b> {
            @Override // android.os.Parcelable.Creator
            public b createFromParcel(Parcel parcel) {
                return new b(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public b[] newArray(int i10) {
                return new b[i10];
            }
        }

        public b(UUID uuid, String str, byte[] bArr, boolean z10) {
            this.f18131b = (UUID) com.fyber.inneractive.sdk.player.exoplayer2.util.a.a(uuid);
            this.f18132c = (String) com.fyber.inneractive.sdk.player.exoplayer2.util.a.a(str);
            this.f18133d = (byte[]) com.fyber.inneractive.sdk.player.exoplayer2.util.a.a(bArr);
            this.f18134e = z10;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                if (obj == this) {
                    return true;
                }
                b bVar = (b) obj;
                return this.f18132c.equals(bVar.f18132c) && u.a(this.f18131b, bVar.f18131b) && Arrays.equals(this.f18133d, bVar.f18133d);
            }
            return false;
        }

        public int hashCode() {
            if (this.f18130a == 0) {
                this.f18130a = (((this.f18131b.hashCode() * 31) + this.f18132c.hashCode()) * 31) + Arrays.hashCode(this.f18133d);
            }
            return this.f18130a;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeLong(this.f18131b.getMostSignificantBits());
            parcel.writeLong(this.f18131b.getLeastSignificantBits());
            parcel.writeString(this.f18132c);
            parcel.writeByteArray(this.f18133d);
            parcel.writeByte(this.f18134e ? (byte) 1 : (byte) 0);
        }

        public b(Parcel parcel) {
            this.f18131b = new UUID(parcel.readLong(), parcel.readLong());
            this.f18132c = parcel.readString();
            this.f18133d = parcel.createByteArray();
            this.f18134e = parcel.readByte() != 0;
        }
    }

    public a(Parcel parcel) {
        b[] bVarArr = (b[]) parcel.createTypedArray(b.CREATOR);
        this.f18127a = bVarArr;
        this.f18129c = bVarArr.length;
    }
}
