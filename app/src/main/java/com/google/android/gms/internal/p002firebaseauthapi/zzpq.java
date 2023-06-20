package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.firebase.auth.zze;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
@SafeParcelable.Class(creator = "OnFailedIdpSignInAidlResponseCreator")
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzpq  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzpq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzpq> CREATOR = new zzpr();
    @SafeParcelable.Field(getter = "getStatus", id = 1)
    private final Status zza;
    @SafeParcelable.Field(getter = "getDefaultOAuthCredential", id = 2)
    private final zze zzb;
    @SafeParcelable.Field(getter = "getEmail", id = 3)
    private final String zzc;
    @SafeParcelable.Field(getter = "getTenantId", id = 4)
    private final String zzd;

    @SafeParcelable.Constructor
    public zzpq(@SafeParcelable.Param(id = 1) Status status, @SafeParcelable.Param(id = 2) zze zzeVar, @SafeParcelable.Param(id = 3) String str, @SafeParcelable.Param(id = 4) String str2) {
        this.zza = status;
        this.zzb = zzeVar;
        this.zzc = str;
        this.zzd = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.zza, i10, false);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zzb, i10, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzc, false);
        SafeParcelWriter.writeString(parcel, 4, this.zzd, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final Status zza() {
        return this.zza;
    }

    public final zze zzb() {
        return this.zzb;
    }

    public final String zzc() {
        return this.zzc;
    }

    public final String zzd() {
        return this.zzd;
    }
}
