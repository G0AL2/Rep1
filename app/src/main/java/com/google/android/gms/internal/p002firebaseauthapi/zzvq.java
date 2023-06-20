package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.Preconditions;
import com.vehiclecloud.app.videofetch.rnbillingclient.Analytics;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzvq  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzvq implements zzts {
    private final String zza = Preconditions.checkNotEmpty("phone");
    private final String zzb;
    private final String zzc;
    private final String zzd;

    zzvq(String str, String str2, String str3, String str4, String str5, String str6) {
        this.zzb = Preconditions.checkNotEmpty(str2);
        this.zzc = str3;
        this.zzd = str4;
    }

    public static zzvq zzb(String str, String str2, String str3) {
        Preconditions.checkNotEmpty(str3);
        Preconditions.checkNotEmpty(str2);
        return new zzvq("phone", str, str2, str3, null, null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzts
    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        this.zza.hashCode();
        jSONObject.put("mfaProvider", 1);
        jSONObject.put("mfaPendingCredential", this.zzb);
        JSONObject jSONObject2 = new JSONObject();
        String str = this.zzc;
        if (str != null) {
            jSONObject2.put("sessionInfo", str);
        }
        String str2 = this.zzd;
        if (str2 != null) {
            jSONObject2.put(Analytics.Param.CODE, str2);
        }
        jSONObject.put("phoneVerificationInfo", jSONObject2);
        return jSONObject.toString();
    }
}
