package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.Preconditions;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzvi  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzvi implements zzts {
    private final String zza;
    private final String zzb = "http://localhost";
    private final String zzc;

    public zzvi(String str, String str2) {
        this.zza = Preconditions.checkNotEmpty(str);
        this.zzc = str2;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzts
    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("identifier", this.zza);
        jSONObject.put("continueUri", this.zzb);
        String str = this.zzc;
        if (str != null) {
            jSONObject.put("tenantId", str);
        }
        return jSONObject.toString();
    }
}
