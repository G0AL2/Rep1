package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
@SafeParcelable.Class(creator = "MediationConfigurationParcelCreator")
/* loaded from: classes2.dex */
public final class zzbqq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbqq> CREATOR = new zzbqr();
    @SafeParcelable.Field(id = 1)
    public final String zza;
    @SafeParcelable.Field(id = 2)
    public final Bundle zzb;

    @SafeParcelable.Constructor
    public zzbqq(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) Bundle bundle) {
        this.zza = str;
        this.zzb = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zza, false);
        SafeParcelWriter.writeBundle(parcel, 2, this.zzb, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
