package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
@SafeParcelable.Class(creator = "SendVerificationCodeRequestCreator")
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzwr  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzwr extends AbstractSafeParcelable implements zzts {
    public static final Parcelable.Creator<zzwr> CREATOR = new zzws();
    @SafeParcelable.Field(getter = "getPhoneNumber", id = 1)
    private final String zza;
    @SafeParcelable.Field(getter = "getTimeoutInSeconds", id = 2)
    private final long zzb;
    @SafeParcelable.Field(getter = "getForceNewSmsVerificationSession", id = 3)
    private final boolean zzc;
    @SafeParcelable.Field(getter = "getLanguageHeader", id = 4)
    private final String zzd;
    @SafeParcelable.Field(getter = "getTenantId", id = 5)
    private final String zze;
    @SafeParcelable.Field(getter = "getRecaptchaToken", id = 6)
    private final String zzf;
    @SafeParcelable.Field(getter = "getIsGooglePlayServicesAvailable", id = 7)
    private final boolean zzg;
    @SafeParcelable.Field(getter = "getSafetyNetToken", id = 8)
    private final String zzh;
    private zzvg zzi;

    @SafeParcelable.Constructor
    public zzwr(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) long j10, @SafeParcelable.Param(id = 3) boolean z10, @SafeParcelable.Param(id = 4) String str2, @SafeParcelable.Param(id = 5) String str3, @SafeParcelable.Param(id = 6) String str4, @SafeParcelable.Param(id = 7) boolean z11, @SafeParcelable.Param(id = 8) String str5) {
        this.zza = Preconditions.checkNotEmpty(str);
        this.zzb = j10;
        this.zzc = z10;
        this.zzd = str2;
        this.zze = str3;
        this.zzf = str4;
        this.zzg = z11;
        this.zzh = str5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zza, false);
        SafeParcelWriter.writeLong(parcel, 2, this.zzb);
        SafeParcelWriter.writeBoolean(parcel, 3, this.zzc);
        SafeParcelWriter.writeString(parcel, 4, this.zzd, false);
        SafeParcelWriter.writeString(parcel, 5, this.zze, false);
        SafeParcelWriter.writeString(parcel, 6, this.zzf, false);
        SafeParcelWriter.writeBoolean(parcel, 7, this.zzg);
        SafeParcelWriter.writeString(parcel, 8, this.zzh, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzts
    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("phoneNumber", this.zza);
        String str = this.zze;
        if (str != null) {
            jSONObject.put("tenantId", str);
        }
        String str2 = this.zzf;
        if (str2 != null) {
            jSONObject.put("recaptchaToken", str2);
        }
        zzvg zzvgVar = this.zzi;
        if (zzvgVar != null) {
            jSONObject.put("autoRetrievalInfo", zzvgVar.zza());
        }
        String str3 = this.zzh;
        if (str3 != null) {
            jSONObject.put("safetyNetToken", str3);
        }
        return jSONObject.toString();
    }

    public final long zzb() {
        return this.zzb;
    }

    public final String zzc() {
        return this.zzd;
    }

    public final String zzd() {
        return this.zza;
    }

    public final void zze(zzvg zzvgVar) {
        this.zzi = zzvgVar;
    }

    public final boolean zzf() {
        return this.zzc;
    }

    public final boolean zzg() {
        return this.zzg;
    }
}
