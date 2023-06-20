package com.google.android.gms.safetynet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-safetynet@@17.0.1 */
@SafeParcelable.Class(creator = "AttestationDataCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes2.dex */
public final class zza extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zza> CREATOR = new zzb();
    @SafeParcelable.Field(getter = "getJwsResult", id = 2)
    private final String zza;

    @SafeParcelable.Constructor
    public zza(@SafeParcelable.Param(id = 2) String str) {
        this.zza = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.zza, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final String zza() {
        return this.zza;
    }
}
