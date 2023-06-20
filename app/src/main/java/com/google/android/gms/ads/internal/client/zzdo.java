package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
@SafeParcelable.Class(creator = "IconAdOptionsParcelCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes2.dex */
public final class zzdo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzdo> CREATOR = new zzdp();
    @SafeParcelable.Field(id = 2)
    public final int zza;

    @SafeParcelable.Constructor
    public zzdo(@SafeParcelable.Param(id = 2) int i10) {
        this.zza = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, this.zza);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
