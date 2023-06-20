package com.fyber.inneractive.sdk.player.exoplayer2.metadata;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0257a();

    /* renamed from: a  reason: collision with root package name */
    public final b[] f19180a;

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.metadata.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0257a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public a[] newArray(int i10) {
            return new a[0];
        }
    }

    /* loaded from: classes2.dex */
    public interface b extends Parcelable {
    }

    public a(List<? extends b> list) {
        b[] bVarArr = new b[list.size()];
        this.f19180a = bVarArr;
        list.toArray(bVarArr);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f19180a, ((a) obj).f19180a);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f19180a);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f19180a.length);
        for (b bVar : this.f19180a) {
            parcel.writeParcelable(bVar, 0);
        }
    }

    public a(Parcel parcel) {
        this.f19180a = new b[parcel.readInt()];
        int i10 = 0;
        while (true) {
            b[] bVarArr = this.f19180a;
            if (i10 >= bVarArr.length) {
                return;
            }
            bVarArr[i10] = (b) parcel.readParcelable(b.class.getClassLoader());
            i10++;
        }
    }
}
