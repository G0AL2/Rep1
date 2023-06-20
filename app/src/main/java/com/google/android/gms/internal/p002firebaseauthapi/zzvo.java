package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.Preconditions;
import com.vehiclecloud.app.videofetch.rnbillingclient.Analytics;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzvo  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzvo implements zzts {
    private final String zza = Preconditions.checkNotEmpty("phone");
    private String zzb;
    private final String zzc;
    private final String zzd;
    private final String zze;

    zzvo(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.zzb = Preconditions.checkNotEmpty(str2);
        this.zzc = str3;
        this.zze = str4;
        this.zzd = str7;
    }

    public static zzvo zzb(String str, String str2, String str3, String str4) {
        Preconditions.checkNotEmpty(str3);
        Preconditions.checkNotEmpty(str2);
        return new zzvo("phone", str, str2, str3, null, null, str4);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzts
    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("idToken", this.zzb);
        this.zza.hashCode();
        jSONObject.put("mfaProvider", 1);
        String str = this.zzd;
        if (str != null) {
            jSONObject.put("displayName", str);
        }
        JSONObject jSONObject2 = new JSONObject();
        String str2 = this.zzc;
        if (str2 != null) {
            jSONObject2.put("sessionInfo", str2);
        }
        String str3 = this.zze;
        if (str3 != null) {
            jSONObject2.put(Analytics.Param.CODE, str3);
        }
        jSONObject.put("phoneVerificationInfo", jSONObject2);
        return jSONObject.toString();
    }

    public final zzvo zzc(String str) {
        this.zzb = str;
        return this;
    }
}
