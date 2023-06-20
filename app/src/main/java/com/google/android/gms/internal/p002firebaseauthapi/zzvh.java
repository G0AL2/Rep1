package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import android.util.Log;
import com.vehiclecloud.app.videofetch.rnbillingclient.Analytics;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzvh  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzvh implements zztt {
    private static final String zza = "com.google.android.gms.internal.firebase-auth-api.zzvh";
    private String zzb;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zztt
    public final /* bridge */ /* synthetic */ zztt zza(String str) throws zzrm {
        zzb(str);
        return this;
    }

    public final zzvh zzb(String str) throws zzrm {
        try {
            JSONObject jSONObject = new JSONObject(new JSONObject(str).getString("error"));
            jSONObject.getInt(Analytics.Param.CODE);
            this.zzb = jSONObject.getString("message");
            return this;
        } catch (NullPointerException | JSONException e10) {
            String str2 = zza;
            String message = e10.getMessage();
            Log.e(str2, "Failed to parse error for string [" + str + "] with exception: " + message);
            throw new zzrm("Failed to parse error for string [" + str + "]", e10);
        }
    }

    public final String zzc() {
        return this.zzb;
    }

    public final boolean zzd() {
        return !TextUtils.isEmpty(this.zzb);
    }
}
