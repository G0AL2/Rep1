package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import com.google.android.gms.common.Scopes;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzvn  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzvn implements zztt {
    private static final String zza = "zzvn";
    private String zzb;
    private String zzc;
    private String zzd;
    private String zze;
    private boolean zzf;
    private long zzg;
    private List zzh;
    private String zzi;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zztt
    public final /* bridge */ /* synthetic */ zztt zza(String str) throws zzrm {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = jSONObject.optString("localId", null);
            this.zzc = jSONObject.optString(Scopes.EMAIL, null);
            this.zzd = jSONObject.optString("idToken", null);
            this.zze = jSONObject.optString("refreshToken", null);
            this.zzf = jSONObject.optBoolean("isNewUser", false);
            this.zzg = jSONObject.optLong("expiresIn", 0L);
            this.zzh = zzwi.zzf(jSONObject.optJSONArray("mfaInfo"));
            this.zzi = jSONObject.optString("mfaPendingCredential", null);
            return this;
        } catch (NullPointerException | JSONException e10) {
            throw zzxq.zza(e10, zza, str);
        }
    }

    public final long zzb() {
        return this.zzg;
    }

    public final String zzc() {
        return this.zzd;
    }

    public final String zzd() {
        return this.zzi;
    }

    public final String zze() {
        return this.zze;
    }

    public final List zzf() {
        return this.zzh;
    }

    public final boolean zzg() {
        return !TextUtils.isEmpty(this.zzi);
    }

    public final boolean zzh() {
        return this.zzf;
    }
}
