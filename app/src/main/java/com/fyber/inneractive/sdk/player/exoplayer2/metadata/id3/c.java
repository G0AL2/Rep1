package com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.player.exoplayer2.util.u;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class c extends h {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    public final String f19186b;

    /* renamed from: c  reason: collision with root package name */
    public final int f19187c;

    /* renamed from: d  reason: collision with root package name */
    public final int f19188d;

    /* renamed from: e  reason: collision with root package name */
    public final long f19189e;

    /* renamed from: f  reason: collision with root package name */
    public final long f19190f;

    /* renamed from: g  reason: collision with root package name */
    public final h[] f19191g;

    /* loaded from: classes2.dex */
    public class a implements Parcelable.Creator<c> {
        @Override // android.os.Parcelable.Creator
        public c createFromParcel(Parcel parcel) {
            return new c(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public c[] newArray(int i10) {
            return new c[i10];
        }
    }

    public c(String str, int i10, int i11, long j10, long j11, h[] hVarArr) {
        super("CHAP");
        this.f19186b = str;
        this.f19187c = i10;
        this.f19188d = i11;
        this.f19189e = j10;
        this.f19190f = j11;
        this.f19191g = hVarArr;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.h, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return this.f19187c == cVar.f19187c && this.f19188d == cVar.f19188d && this.f19189e == cVar.f19189e && this.f19190f == cVar.f19190f && u.a(this.f19186b, cVar.f19186b) && Arrays.equals(this.f19191g, cVar.f19191g);
    }

    public int hashCode() {
        int i10 = (((((((this.f19187c + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f19188d) * 31) + ((int) this.f19189e)) * 31) + ((int) this.f19190f)) * 31;
        String str = this.f19186b;
        return i10 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f19186b);
        parcel.writeInt(this.f19187c);
        parcel.writeInt(this.f19188d);
        parcel.writeLong(this.f19189e);
        parcel.writeLong(this.f19190f);
        parcel.writeInt(this.f19191g.length);
        for (h hVar : this.f19191g) {
            parcel.writeParcelable(hVar, 0);
        }
    }

    public c(Parcel parcel) {
        super("CHAP");
        this.f19186b = parcel.readString();
        this.f19187c = parcel.readInt();
        this.f19188d = parcel.readInt();
        this.f19189e = parcel.readLong();
        this.f19190f = parcel.readLong();
        int readInt = parcel.readInt();
        this.f19191g = new h[readInt];
        for (int i10 = 0; i10 < readInt; i10++) {
            this.f19191g[i10] = (h) parcel.readParcelable(h.class.getClassLoader());
        }
    }
}
