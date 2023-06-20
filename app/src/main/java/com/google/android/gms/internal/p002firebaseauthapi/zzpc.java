package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
@SafeParcelable.Class(creator = "StartMfaPhoneNumberEnrollmentAidlRequestCreator")
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzpc  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzpc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzpc> CREATOR = new zzpd();
    @SafeParcelable.Field(getter = "getIdToken", id = 1)
    private final String zza;
    @SafeParcelable.Field(getter = "getPhoneNumber", id = 2)
    private final String zzb;
    @SafeParcelable.Field(getter = "getLocaleHeader", id = 3)
    private final String zzc;
    @SafeParcelable.Field(getter = "getTimeoutInSeconds", id = 4)
    private final long zzd;
    @SafeParcelable.Field(getter = "getForceNewSmsVerificationSession", id = 5)
    private final boolean zze;
    @SafeParcelable.Field(getter = "getRequireSmsVerification", id = 6)
    private final boolean zzf;
    @SafeParcelable.Field(getter = "getSafetyNetToken", id = 7)
    private final String zzg;
    @SafeParcelable.Field(getter = "getRecaptchaToken", id = 8)
    private final String zzh;
    @SafeParcelable.Field(getter = "getIsGooglePlayServicesAvailable", id = 9)
    private final boolean zzi;

    @SafeParcelable.Constructor
    public zzpc(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) String str2, @SafeParcelable.Param(id = 3) String str3, @SafeParcelable.Param(id = 4) long j10, @SafeParcelable.Param(id = 5) boolean z10, @SafeParcelable.Param(id = 6) boolean z11, @SafeParcelable.Param(id = 7) String str4, @SafeParcelable.Param(id = 8) String str5, @SafeParcelable.Param(id = 9) boolean z12) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = j10;
        this.zze = z10;
        this.zzf = z11;
        this.zzg = str4;
        this.zzh = str5;
        this.zzi = z12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zza, false);
        SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzc, false);
        SafeParcelWriter.writeLong(parcel, 4, this.zzd);
        SafeParcelWriter.writeBoolean(parcel, 5, this.zze);
        SafeParcelWriter.writeBoolean(parcel, 6, this.zzf);
        SafeParcelWriter.writeString(parcel, 7, this.zzg, false);
        SafeParcelWriter.writeString(parcel, 8, this.zzh, false);
        SafeParcelWriter.writeBoolean(parcel, 9, this.zzi);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final long zza() {
        return this.zzd;
    }

    public final String zzb() {
        return this.zza;
    }

    public final String zzc() {
        return this.zzc;
    }

    public final String zzd() {
        return this.zzb;
    }

    public final String zze() {
        return this.zzh;
    }

    public final String zzf() {
        return this.zzg;
    }

    public final boolean zzg() {
        return this.zze;
    }

    public final boolean zzh() {
        return this.zzi;
    }
}
