package com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.player.exoplayer2.util.u;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* loaded from: classes2.dex */
public final class j extends h {
    public static final Parcelable.Creator<j> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    public final String f19212b;

    /* renamed from: c  reason: collision with root package name */
    public final String f19213c;

    /* loaded from: classes2.dex */
    public class a implements Parcelable.Creator<j> {
        @Override // android.os.Parcelable.Creator
        public j createFromParcel(Parcel parcel) {
            return new j(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public j[] newArray(int i10) {
            return new j[i10];
        }
    }

    public j(String str, String str2, String str3) {
        super(str);
        this.f19212b = str2;
        this.f19213c = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j.class != obj.getClass()) {
            return false;
        }
        j jVar = (j) obj;
        return this.f19209a.equals(jVar.f19209a) && u.a(this.f19212b, jVar.f19212b) && u.a(this.f19213c, jVar.f19213c);
    }

    public int hashCode() {
        int hashCode = (this.f19209a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        String str = this.f19212b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f19213c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f19209a);
        parcel.writeString(this.f19212b);
        parcel.writeString(this.f19213c);
    }

    public j(Parcel parcel) {
        super(parcel.readString());
        this.f19212b = parcel.readString();
        this.f19213c = parcel.readString();
    }
}
