package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.Preconditions;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzxh  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzxh implements zzts {
    private final String zza;
    private final String zzb;

    public zzxh(String str, String str2) {
        this.zza = Preconditions.checkNotEmpty(str);
        this.zzb = str2;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzts
    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(IronSourceConstants.IRONSOURCE_BIDDING_TOKEN_KEY, this.zza);
        jSONObject.put("returnSecureToken", true);
        String str = this.zzb;
        if (str != null) {
            jSONObject.put("tenantId", str);
        }
        return jSONObject.toString();
    }
}
