package com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.player.exoplayer2.util.u;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class i extends h {
    public static final Parcelable.Creator<i> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    public final String f19210b;

    /* renamed from: c  reason: collision with root package name */
    public final byte[] f19211c;

    /* loaded from: classes2.dex */
    public class a implements Parcelable.Creator<i> {
        @Override // android.os.Parcelable.Creator
        public i createFromParcel(Parcel parcel) {
            return new i(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public i[] newArray(int i10) {
            return new i[i10];
        }
    }

    public i(String str, byte[] bArr) {
        super("PRIV");
        this.f19210b = str;
        this.f19211c = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        return u.a(this.f19210b, iVar.f19210b) && Arrays.equals(this.f19211c, iVar.f19211c);
    }

    public int hashCode() {
        String str = this.f19210b;
        return (((str != null ? str.hashCode() : 0) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + Arrays.hashCode(this.f19211c);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f19210b);
        parcel.writeByteArray(this.f19211c);
    }

    public i(Parcel parcel) {
        super("PRIV");
        this.f19210b = parcel.readString();
        this.f19211c = parcel.createByteArray();
    }
}
