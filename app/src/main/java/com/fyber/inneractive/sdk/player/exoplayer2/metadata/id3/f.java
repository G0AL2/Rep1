package com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.player.exoplayer2.util.u;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class f extends h {
    public static final Parcelable.Creator<f> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    public final String f19200b;

    /* renamed from: c  reason: collision with root package name */
    public final String f19201c;

    /* renamed from: d  reason: collision with root package name */
    public final String f19202d;

    /* renamed from: e  reason: collision with root package name */
    public final byte[] f19203e;

    /* loaded from: classes2.dex */
    public class a implements Parcelable.Creator<f> {
        @Override // android.os.Parcelable.Creator
        public f createFromParcel(Parcel parcel) {
            return new f(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public f[] newArray(int i10) {
            return new f[i10];
        }
    }

    public f(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f19200b = str;
        this.f19201c = str2;
        this.f19202d = str3;
        this.f19203e = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f.class != obj.getClass()) {
            return false;
        }
        f fVar = (f) obj;
        return u.a(this.f19200b, fVar.f19200b) && u.a(this.f19201c, fVar.f19201c) && u.a(this.f19202d, fVar.f19202d) && Arrays.equals(this.f19203e, fVar.f19203e);
    }

    public int hashCode() {
        String str = this.f19200b;
        int hashCode = ((str != null ? str.hashCode() : 0) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        String str2 = this.f19201c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f19202d;
        return ((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + Arrays.hashCode(this.f19203e);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f19200b);
        parcel.writeString(this.f19201c);
        parcel.writeString(this.f19202d);
        parcel.writeByteArray(this.f19203e);
    }

    public f(Parcel parcel) {
        super("GEOB");
        this.f19200b = parcel.readString();
        this.f19201c = parcel.readString();
        this.f19202d = parcel.readString();
        this.f19203e = parcel.createByteArray();
    }
}
