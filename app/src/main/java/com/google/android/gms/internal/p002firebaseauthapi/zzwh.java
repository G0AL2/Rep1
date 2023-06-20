package com.google.android.gms.internal.p002firebaseauthapi;

import android.util.Log;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzwh  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzwh {
    private String zza;
    private String zzb;
    private String zzc;
    private Long zzd;
    private Long zze;

    public static zzwh zza(String str) throws UnsupportedEncodingException {
        try {
            zzwh zzwhVar = new zzwh();
            JSONObject jSONObject = new JSONObject(str);
            zzwhVar.zza = jSONObject.optString("iss");
            zzwhVar.zzb = jSONObject.optString("aud");
            zzwhVar.zzc = jSONObject.optString("sub");
            zzwhVar.zzd = Long.valueOf(jSONObject.optLong("iat"));
            zzwhVar.zze = Long.valueOf(jSONObject.optLong("exp"));
            jSONObject.optBoolean("is_anonymous");
            return zzwhVar;
        } catch (JSONException e10) {
            if (Log.isLoggable("JwtToken", 3)) {
                Log.d("JwtToken", "Failed to read JwtToken from JSONObject. ".concat(e10.toString()));
            }
            throw new UnsupportedEncodingException("Failed to read JwtToken from JSONObject. ".concat(e10.toString()));
        }
    }

    public final Long zzb() {
        return this.zze;
    }

    public final Long zzc() {
        return this.zzd;
    }

    public final String zzd() {
        return this.zzc;
    }
}
