package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.Scopes;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.logging.Logger;
import com.google.firebase.auth.EmailAuthCredential;
import com.google.firebase.auth.e;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzvm  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzvm implements zzts {
    private static final String zza = "zzvm";
    private static final Logger zzb = new Logger(zzvm.class.getSimpleName(), new String[0]);
    private final String zzc;
    private final String zzd;
    private final String zze;

    public zzvm(EmailAuthCredential emailAuthCredential, String str) {
        this.zzc = Preconditions.checkNotEmpty(emailAuthCredential.zzd());
        this.zzd = Preconditions.checkNotEmpty(emailAuthCredential.zzf());
        this.zze = str;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzts
    public final String zza() throws JSONException {
        e c10 = e.c(this.zzd);
        String a10 = c10 != null ? c10.a() : null;
        String d10 = c10 != null ? c10.d() : null;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(Scopes.EMAIL, this.zzc);
        if (a10 != null) {
            jSONObject.put("oobCode", a10);
        }
        if (d10 != null) {
            jSONObject.put("tenantId", d10);
        }
        String str = this.zze;
        if (str != null) {
            jSONObject.put("idToken", str);
        }
        return jSONObject.toString();
    }
}
