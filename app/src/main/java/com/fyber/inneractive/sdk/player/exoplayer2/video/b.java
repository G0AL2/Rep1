package com.fyber.inneractive.sdk.player.exoplayer2.video;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final int f19667a;

    /* renamed from: b  reason: collision with root package name */
    public final int f19668b;

    /* renamed from: c  reason: collision with root package name */
    public final int f19669c;

    /* renamed from: d  reason: collision with root package name */
    public final byte[] f19670d;

    /* renamed from: e  reason: collision with root package name */
    public int f19671e;

    /* loaded from: classes2.dex */
    public class a implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public b[] newArray(int i10) {
            return new b[0];
        }
    }

    public b(int i10, int i11, int i12, byte[] bArr) {
        this.f19667a = i10;
        this.f19668b = i11;
        this.f19669c = i12;
        this.f19670d = bArr;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f19667a == bVar.f19667a && this.f19668b == bVar.f19668b && this.f19669c == bVar.f19669c && Arrays.equals(this.f19670d, bVar.f19670d)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        if (this.f19671e == 0) {
            this.f19671e = ((((((this.f19667a + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f19668b) * 31) + this.f19669c) * 31) + Arrays.hashCode(this.f19670d);
        }
        return this.f19671e;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ColorInfo(");
        sb2.append(this.f19667a);
        sb2.append(", ");
        sb2.append(this.f19668b);
        sb2.append(", ");
        sb2.append(this.f19669c);
        sb2.append(", ");
        sb2.append(this.f19670d != null);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f19667a);
        parcel.writeInt(this.f19668b);
        parcel.writeInt(this.f19669c);
        parcel.writeInt(this.f19670d != null ? 1 : 0);
        byte[] bArr = this.f19670d;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
    }

    public b(Parcel parcel) {
        this.f19667a = parcel.readInt();
        this.f19668b = parcel.readInt();
        this.f19669c = parcel.readInt();
        this.f19670d = parcel.readInt() != 0 ? parcel.createByteArray() : null;
    }
}
