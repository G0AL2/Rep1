package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzxa  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzxa implements zzts {
    private final String zza = Preconditions.checkNotEmpty("phone");
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final String zze;
    private final String zzf;
    private final String zzg;
    private zzvg zzh;

    private zzxa(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.zzb = Preconditions.checkNotEmpty(str2);
        this.zzc = Preconditions.checkNotEmpty(str3);
        this.zze = str4;
        this.zzd = str5;
        this.zzf = str6;
        this.zzg = str7;
    }

    public static zzxa zzb(String str, String str2, String str3, String str4, String str5, String str6) {
        Preconditions.checkNotEmpty(str3);
        return new zzxa("phone", str, str2, str3, str4, str5, str6);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzts
    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("mfaPendingCredential", this.zzb);
        jSONObject.put("mfaEnrollmentId", this.zzc);
        this.zza.hashCode();
        jSONObject.put("mfaProvider", 1);
        if (this.zze != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("phoneNumber", this.zze);
            if (!TextUtils.isEmpty(this.zzf)) {
                jSONObject2.put("recaptchaToken", this.zzf);
            }
            if (!TextUtils.isEmpty(this.zzg)) {
                jSONObject2.put("safetyNetToken", this.zzg);
            }
            zzvg zzvgVar = this.zzh;
            if (zzvgVar != null) {
                jSONObject2.put("autoRetrievalInfo", zzvgVar.zza());
            }
            jSONObject.put("phoneSignInInfo", jSONObject2);
        }
        return jSONObject.toString();
    }

    public final String zzc() {
        return this.zzd;
    }

    public final void zzd(zzvg zzvgVar) {
        this.zzh = zzvgVar;
    }
}
