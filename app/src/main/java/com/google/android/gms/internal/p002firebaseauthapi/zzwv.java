package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.Scopes;
import com.google.android.gms.common.util.Strings;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzwv  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzwv implements zztt {
    private static final String zza = "zzwv";
    private String zzb;
    private String zzc;
    private Boolean zzd;
    private String zze;
    private String zzf;
    private zzwm zzg;
    private String zzh;
    private String zzi;
    private long zzj;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zztt
    public final /* bridge */ /* synthetic */ zztt zza(String str) throws zzrm {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = Strings.emptyToNull(jSONObject.optString(Scopes.EMAIL, null));
            this.zzc = Strings.emptyToNull(jSONObject.optString("passwordHash", null));
            this.zzd = Boolean.valueOf(jSONObject.optBoolean("emailVerified", false));
            this.zze = Strings.emptyToNull(jSONObject.optString("displayName", null));
            this.zzf = Strings.emptyToNull(jSONObject.optString("photoUrl", null));
            this.zzg = zzwm.zza(jSONObject.optJSONArray("providerUserInfo"));
            this.zzh = Strings.emptyToNull(jSONObject.optString("idToken", null));
            this.zzi = Strings.emptyToNull(jSONObject.optString("refreshToken", null));
            this.zzj = jSONObject.optLong("expiresIn", 0L);
            return this;
        } catch (NullPointerException | JSONException e10) {
            throw zzxq.zza(e10, zza, str);
        }
    }

    public final long zzb() {
        return this.zzj;
    }

    public final String zzc() {
        return this.zzb;
    }

    public final String zzd() {
        return this.zzh;
    }

    public final String zze() {
        return this.zzi;
    }

    public final List zzf() {
        zzwm zzwmVar = this.zzg;
        if (zzwmVar != null) {
            return zzwmVar.zzc();
        }
        return null;
    }
}
