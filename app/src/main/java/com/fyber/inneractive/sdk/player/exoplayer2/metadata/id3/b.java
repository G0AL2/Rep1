package com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class b extends h {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f19185b;

    /* loaded from: classes2.dex */
    public class a implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public b[] newArray(int i10) {
            return new b[i10];
        }
    }

    public b(String str, byte[] bArr) {
        super(str);
        this.f19185b = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f19209a.equals(bVar.f19209a) && Arrays.equals(this.f19185b, bVar.f19185b);
    }

    public int hashCode() {
        return ((this.f19209a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + Arrays.hashCode(this.f19185b);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f19209a);
        parcel.writeByteArray(this.f19185b);
    }

    public b(Parcel parcel) {
        super(parcel.readString());
        this.f19185b = parcel.createByteArray();
    }
}
