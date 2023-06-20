package com.google.android.gms.internal.p002firebaseauthapi;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzvp  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzvp implements zztt {
    private static final String zza = "zzvp";
    private String zzb;
    private String zzc;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zztt
    public final /* bridge */ /* synthetic */ zztt zza(String str) throws zzrm {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = jSONObject.optString("idToken", null);
            this.zzc = jSONObject.optString("refreshToken", null);
            return this;
        } catch (NullPointerException | JSONException e10) {
            throw zzxq.zza(e10, zza, str);
        }
    }

    public final String zzb() {
        return this.zzb;
    }

    public final String zzc() {
        return this.zzc;
    }
}
