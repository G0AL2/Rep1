package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.vehiclecloud.app.videofetch.rnbillingclient.Analytics;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzxm  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzxm implements zzts {
    private String zza;
    private String zzb;
    private String zzc;
    private String zzd;
    private String zze;
    private boolean zzf;

    private zzxm() {
    }

    public static zzxm zzb(String str, String str2, boolean z10) {
        zzxm zzxmVar = new zzxm();
        zzxmVar.zzb = Preconditions.checkNotEmpty(str);
        zzxmVar.zzc = Preconditions.checkNotEmpty(str2);
        zzxmVar.zzf = z10;
        return zzxmVar;
    }

    public static zzxm zzc(String str, String str2, boolean z10) {
        zzxm zzxmVar = new zzxm();
        zzxmVar.zza = Preconditions.checkNotEmpty(str);
        zzxmVar.zzd = Preconditions.checkNotEmpty(str2);
        zzxmVar.zzf = z10;
        return zzxmVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzts
    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (!TextUtils.isEmpty(this.zzd)) {
            jSONObject.put("phoneNumber", this.zza);
            jSONObject.put("temporaryProof", this.zzd);
        } else {
            jSONObject.put("sessionInfo", this.zzb);
            jSONObject.put(Analytics.Param.CODE, this.zzc);
        }
        String str = this.zze;
        if (str != null) {
            jSONObject.put("idToken", str);
        }
        if (!this.zzf) {
            jSONObject.put("operation", 2);
        }
        return jSONObject.toString();
    }

    public final void zzd(String str) {
        this.zze = str;
    }
}
