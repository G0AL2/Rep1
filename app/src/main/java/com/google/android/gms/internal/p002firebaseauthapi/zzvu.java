package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.Preconditions;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzvu  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzvu implements zzts {
    private final String zza;

    public zzvu(String str) {
        this.zza = Preconditions.checkNotEmpty(str);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzts
    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("idToken", this.zza);
        return jSONObject.toString();
    }
}
