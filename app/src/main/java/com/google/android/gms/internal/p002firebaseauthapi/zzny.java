package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
@SafeParcelable.Class(creator = "GetProvidersForEmailAidlRequestCreator")
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzny  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzny extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzny> CREATOR = new zznz();
    @SafeParcelable.Field(getter = "getEmail", id = 1)
    private final String zza;
    @SafeParcelable.Field(getter = "getTenantId", id = 2)
    private final String zzb;

    @SafeParcelable.Constructor
    public zzny(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zza, false);
        SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final String zza() {
        return this.zza;
    }

    public final String zzb() {
        return this.zzb;
    }
}
