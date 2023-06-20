package com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.player.exoplayer2.util.u;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class a extends h {
    public static final Parcelable.Creator<a> CREATOR = new C0258a();

    /* renamed from: b  reason: collision with root package name */
    public final String f19181b;

    /* renamed from: c  reason: collision with root package name */
    public final String f19182c;

    /* renamed from: d  reason: collision with root package name */
    public final int f19183d;

    /* renamed from: e  reason: collision with root package name */
    public final byte[] f19184e;

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0258a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public a[] newArray(int i10) {
            return new a[i10];
        }
    }

    public a(String str, String str2, int i10, byte[] bArr) {
        super("APIC");
        this.f19181b = str;
        this.f19182c = str2;
        this.f19183d = i10;
        this.f19184e = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return this.f19183d == aVar.f19183d && u.a(this.f19181b, aVar.f19181b) && u.a(this.f19182c, aVar.f19182c) && Arrays.equals(this.f19184e, aVar.f19184e);
    }

    public int hashCode() {
        int i10 = (this.f19183d + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        String str = this.f19181b;
        int hashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f19182c;
        return ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + Arrays.hashCode(this.f19184e);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f19181b);
        parcel.writeString(this.f19182c);
        parcel.writeInt(this.f19183d);
        parcel.writeByteArray(this.f19184e);
    }

    public a(Parcel parcel) {
        super("APIC");
        this.f19181b = parcel.readString();
        this.f19182c = parcel.readString();
        this.f19183d = parcel.readInt();
        this.f19184e = parcel.createByteArray();
    }
}
