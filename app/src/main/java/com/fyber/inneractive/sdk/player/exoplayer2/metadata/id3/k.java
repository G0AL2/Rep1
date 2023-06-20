package com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.player.exoplayer2.util.u;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* loaded from: classes2.dex */
public final class k extends h {
    public static final Parcelable.Creator<k> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    public final String f19214b;

    /* renamed from: c  reason: collision with root package name */
    public final String f19215c;

    /* loaded from: classes2.dex */
    public class a implements Parcelable.Creator<k> {
        @Override // android.os.Parcelable.Creator
        public k createFromParcel(Parcel parcel) {
            return new k(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public k[] newArray(int i10) {
            return new k[i10];
        }
    }

    public k(String str, String str2, String str3) {
        super(str);
        this.f19214b = str2;
        this.f19215c = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k.class != obj.getClass()) {
            return false;
        }
        k kVar = (k) obj;
        return this.f19209a.equals(kVar.f19209a) && u.a(this.f19214b, kVar.f19214b) && u.a(this.f19215c, kVar.f19215c);
    }

    public int hashCode() {
        int hashCode = (this.f19209a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        String str = this.f19214b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f19215c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f19209a);
        parcel.writeString(this.f19214b);
        parcel.writeString(this.f19215c);
    }

    public k(Parcel parcel) {
        super(parcel.readString());
        this.f19214b = parcel.readString();
        this.f19215c = parcel.readString();
    }
}
