package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.util.Strings;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzxb  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzxb implements zztt {
    private static final String zza = "zzxb";
    private String zzb;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zztt
    public final /* bridge */ /* synthetic */ zztt zza(String str) throws zzrm {
        try {
            JSONObject optJSONObject = new JSONObject(str).optJSONObject("phoneResponseInfo");
            if (optJSONObject != null) {
                this.zzb = Strings.emptyToNull(optJSONObject.optString("sessionInfo"));
            }
            return this;
        } catch (NullPointerException | JSONException e10) {
            throw zzxq.zza(e10, zza, str);
        }
    }

    public final String zzb() {
        return this.zzb;
    }
}
