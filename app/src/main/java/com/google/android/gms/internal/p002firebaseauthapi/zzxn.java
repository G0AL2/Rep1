package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.util.Strings;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzxn  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzxn implements zztt {
    private static final String zza = "zzxn";
    private String zzb;
    private String zzc;
    private long zzd;
    private String zze;
    private boolean zzf;
    private String zzg;
    private String zzh;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zztt
    public final /* bridge */ /* synthetic */ zztt zza(String str) throws zzrm {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = Strings.emptyToNull(jSONObject.optString("idToken", null));
            this.zzc = Strings.emptyToNull(jSONObject.optString("refreshToken", null));
            this.zzd = jSONObject.optLong("expiresIn", 0L);
            this.zze = Strings.emptyToNull(jSONObject.optString("localId", null));
            this.zzf = jSONObject.optBoolean("isNewUser", false);
            this.zzg = Strings.emptyToNull(jSONObject.optString("temporaryProof", null));
            this.zzh = Strings.emptyToNull(jSONObject.optString("phoneNumber", null));
            return this;
        } catch (NullPointerException | JSONException e10) {
            throw zzxq.zza(e10, zza, str);
        }
    }

    public final long zzb() {
        return this.zzd;
    }

    public final String zzc() {
        return this.zzb;
    }

    public final String zzd() {
        return this.zzh;
    }

    public final String zze() {
        return this.zzc;
    }

    public final String zzf() {
        return this.zzg;
    }

    public final boolean zzg() {
        return this.zzf;
    }
}
