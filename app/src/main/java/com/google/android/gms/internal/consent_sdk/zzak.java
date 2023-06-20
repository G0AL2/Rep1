package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import android.text.TextUtils;
import android.util.Log;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
/* loaded from: classes2.dex */
public final class zzak implements zzg {
    private final Application zza;
    private final zzam zzb;
    private final Executor zzc;

    public zzak(Application application, zzam zzamVar, Executor executor) {
        this.zza = application;
        this.zzb = zzamVar;
        this.zzc = executor;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzg
    public final Executor zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzg
    public final boolean zzb(String str, JSONObject jSONObject) {
        char c10;
        int hashCode = str.hashCode();
        if (hashCode != 94746189) {
            if (hashCode == 113399775 && str.equals("write")) {
                c10 = 0;
            }
            c10 = 65535;
        } else {
            if (str.equals("clear")) {
                c10 = 1;
            }
            c10 = 65535;
        }
        if (c10 == 0) {
            zzbz zzbzVar = new zzbz(this.zza);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Object opt = jSONObject.opt(next);
                String valueOf = String.valueOf(opt);
                StringBuilder sb2 = new StringBuilder(String.valueOf(next).length() + 23 + valueOf.length());
                sb2.append("Writing to storage: [");
                sb2.append(next);
                sb2.append("] ");
                sb2.append(valueOf);
                Log.d("UserMessagingPlatform", sb2.toString());
                if (zzbzVar.zzc(next, opt)) {
                    this.zzb.zzc().add(next);
                } else {
                    String valueOf2 = String.valueOf(next);
                    Log.d("UserMessagingPlatform", valueOf2.length() != 0 ? "Failed writing key: ".concat(valueOf2) : new String("Failed writing key: "));
                }
            }
            this.zzb.zze();
            zzbzVar.zzb();
            return true;
        } else if (c10 != 1) {
            return false;
        } else {
            JSONArray optJSONArray = jSONObject.optJSONArray("keys");
            if (optJSONArray != null && optJSONArray.length() != 0) {
                HashSet hashSet = new HashSet();
                int length = optJSONArray.length();
                for (int i10 = 0; i10 < length; i10++) {
                    String optString = optJSONArray.optString(i10);
                    if (TextUtils.isEmpty(optString)) {
                        StringBuilder sb3 = new StringBuilder(46);
                        sb3.append("Action[clear]: empty key at index: ");
                        sb3.append(i10);
                        Log.d("UserMessagingPlatform", sb3.toString());
                    } else {
                        hashSet.add(optString);
                    }
                }
                zzca.zzb(this.zza, hashSet);
            } else {
                String valueOf3 = String.valueOf(jSONObject.toString());
                Log.d("UserMessagingPlatform", valueOf3.length() != 0 ? "Action[clear]: wrong args.".concat(valueOf3) : new String("Action[clear]: wrong args."));
            }
            return true;
        }
    }
}
