package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
@SafeParcelable.Class(creator = "CreateAuthUriResponseCreator")
@SafeParcelable.Reserved({1})
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzvj  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzvj extends AbstractSafeParcelable implements zztt<zzvj> {
    @SafeParcelable.Field(getter = "getAuthUri", id = 2)
    private String zzb;
    @SafeParcelable.Field(getter = "isRegistered", id = 3)
    private boolean zzc;
    @SafeParcelable.Field(getter = "getProviderId", id = 4)
    private String zzd;
    @SafeParcelable.Field(getter = "isForExistingProvider", id = 5)
    private boolean zze;
    @SafeParcelable.Field(getter = "getStringList", id = 6)
    private zzxc zzf;
    @SafeParcelable.Field(getter = "getSignInMethods", id = 7)
    private List zzg;
    private static final String zza = zzvj.class.getSimpleName();
    public static final Parcelable.Creator<zzvj> CREATOR = new zzvk();

    public zzvj() {
        this.zzf = new zzxc(null);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeBoolean(parcel, 3, this.zzc);
        SafeParcelWriter.writeString(parcel, 4, this.zzd, false);
        SafeParcelWriter.writeBoolean(parcel, 5, this.zze);
        SafeParcelWriter.writeParcelable(parcel, 6, this.zzf, i10, false);
        SafeParcelWriter.writeStringList(parcel, 7, this.zzg, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zztt
    public final /* bridge */ /* synthetic */ zztt zza(String str) throws zzrm {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = jSONObject.optString("authUri", null);
            this.zzc = jSONObject.optBoolean("registered", false);
            this.zzd = jSONObject.optString("providerId", null);
            this.zze = jSONObject.optBoolean("forExistingProvider", false);
            if (!jSONObject.has("allProviders")) {
                this.zzf = new zzxc(null);
            } else {
                this.zzf = new zzxc(1, zzxq.zzb(jSONObject.optJSONArray("allProviders")));
            }
            this.zzg = zzxq.zzb(jSONObject.optJSONArray("signinMethods"));
            return this;
        } catch (NullPointerException | JSONException e10) {
            throw zzxq.zza(e10, zza, str);
        }
    }

    public final List zzb() {
        return this.zzg;
    }

    @SafeParcelable.Constructor
    public zzvj(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) boolean z10, @SafeParcelable.Param(id = 4) String str2, @SafeParcelable.Param(id = 5) boolean z11, @SafeParcelable.Param(id = 6) zzxc zzxcVar, @SafeParcelable.Param(id = 7) List list) {
        zzxc zza2;
        this.zzb = str;
        this.zzc = z10;
        this.zzd = str2;
        this.zze = z11;
        if (zzxcVar == null) {
            zza2 = new zzxc(null);
        } else {
            zza2 = zzxc.zza(zzxcVar);
        }
        this.zzf = zza2;
        this.zzg = list;
    }
}
