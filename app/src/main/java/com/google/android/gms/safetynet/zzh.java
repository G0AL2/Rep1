package com.google.android.gms.safetynet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-safetynet@@17.0.1 */
@ShowFirstParty
@SafeParcelable.Class(creator = "RemoveHarmfulAppDataCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes2.dex */
public final class zzh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzh> CREATOR = new zzi();
    @ShowFirstParty
    @SafeParcelable.Field(id = 2)
    public final int zza;
    @ShowFirstParty
    @SafeParcelable.Field(id = 3)
    public final boolean zzb;

    @SafeParcelable.Constructor
    public zzh(@SafeParcelable.Param(id = 2) int i10, @SafeParcelable.Param(id = 3) boolean z10) {
        this.zza = i10;
        this.zzb = z10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, this.zza);
        SafeParcelWriter.writeBoolean(parcel, 3, this.zzb);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
