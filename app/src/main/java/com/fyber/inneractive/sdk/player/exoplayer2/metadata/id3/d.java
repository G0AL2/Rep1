package com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.player.exoplayer2.util.u;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class d extends h {
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    public final String f19192b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f19193c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f19194d;

    /* renamed from: e  reason: collision with root package name */
    public final String[] f19195e;

    /* renamed from: f  reason: collision with root package name */
    public final h[] f19196f;

    /* loaded from: classes2.dex */
    public class a implements Parcelable.Creator<d> {
        @Override // android.os.Parcelable.Creator
        public d createFromParcel(Parcel parcel) {
            return new d(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public d[] newArray(int i10) {
            return new d[i10];
        }
    }

    public d(String str, boolean z10, boolean z11, String[] strArr, h[] hVarArr) {
        super("CTOC");
        this.f19192b = str;
        this.f19193c = z10;
        this.f19194d = z11;
        this.f19195e = strArr;
        this.f19196f = hVarArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        return this.f19193c == dVar.f19193c && this.f19194d == dVar.f19194d && u.a(this.f19192b, dVar.f19192b) && Arrays.equals(this.f19195e, dVar.f19195e) && Arrays.equals(this.f19196f, dVar.f19196f);
    }

    public int hashCode() {
        int i10 = ((((this.f19193c ? 1 : 0) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + (this.f19194d ? 1 : 0)) * 31;
        String str = this.f19192b;
        return i10 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f19192b);
        parcel.writeByte(this.f19193c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f19194d ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.f19195e);
        parcel.writeInt(this.f19196f.length);
        int i11 = 0;
        while (true) {
            h[] hVarArr = this.f19196f;
            if (i11 >= hVarArr.length) {
                return;
            }
            parcel.writeParcelable(hVarArr[i11], 0);
            i11++;
        }
    }

    public d(Parcel parcel) {
        super("CTOC");
        this.f19192b = parcel.readString();
        this.f19193c = parcel.readByte() != 0;
        this.f19194d = parcel.readByte() != 0;
        this.f19195e = parcel.createStringArray();
        int readInt = parcel.readInt();
        this.f19196f = new h[readInt];
        for (int i10 = 0; i10 < readInt; i10++) {
            this.f19196f[i10] = (h) parcel.readParcelable(h.class.getClassLoader());
        }
    }
}
