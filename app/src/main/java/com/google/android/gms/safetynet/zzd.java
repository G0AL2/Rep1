package com.google.android.gms.safetynet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-safetynet@@17.0.1 */
@SafeParcelable.Class(creator = "HarmfulAppsInfoCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes2.dex */
public final class zzd extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzd> CREATOR = new zze();
    @SafeParcelable.Field(id = 2)
    public final long zza;
    @SafeParcelable.Field(id = 3)
    public final HarmfulAppsData[] zzb;
    @SafeParcelable.Field(id = 4)
    public final int zzc;
    @SafeParcelable.Field(id = 5)
    public final boolean zzd;

    @SafeParcelable.Constructor
    public zzd(@SafeParcelable.Param(id = 2) long j10, @SafeParcelable.Param(id = 3) HarmfulAppsData[] harmfulAppsDataArr, @SafeParcelable.Param(id = 4) int i10, @SafeParcelable.Param(id = 5) boolean z10) {
        this.zza = j10;
        this.zzb = harmfulAppsDataArr;
        this.zzd = z10;
        if (z10) {
            this.zzc = i10;
        } else {
            this.zzc = -1;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeLong(parcel, 2, this.zza);
        SafeParcelWriter.writeTypedArray(parcel, 3, this.zzb, i10, false);
        SafeParcelWriter.writeInt(parcel, 4, this.zzc);
        SafeParcelWriter.writeBoolean(parcel, 5, this.zzd);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
