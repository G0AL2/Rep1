package com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.player.exoplayer2.util.u;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* loaded from: classes2.dex */
public final class e extends h {
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    public final String f19197b;

    /* renamed from: c  reason: collision with root package name */
    public final String f19198c;

    /* renamed from: d  reason: collision with root package name */
    public final String f19199d;

    /* loaded from: classes2.dex */
    public class a implements Parcelable.Creator<e> {
        @Override // android.os.Parcelable.Creator
        public e createFromParcel(Parcel parcel) {
            return new e(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public e[] newArray(int i10) {
            return new e[i10];
        }
    }

    public e(String str, String str2, String str3) {
        super("COMM");
        this.f19197b = str;
        this.f19198c = str2;
        this.f19199d = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        return u.a(this.f19198c, eVar.f19198c) && u.a(this.f19197b, eVar.f19197b) && u.a(this.f19199d, eVar.f19199d);
    }

    public int hashCode() {
        String str = this.f19197b;
        int hashCode = ((str != null ? str.hashCode() : 0) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        String str2 = this.f19198c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f19199d;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f19209a);
        parcel.writeString(this.f19197b);
        parcel.writeString(this.f19199d);
    }

    public e(Parcel parcel) {
        super("COMM");
        this.f19197b = parcel.readString();
        this.f19198c = parcel.readString();
        this.f19199d = parcel.readString();
    }
}
