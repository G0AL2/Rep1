package com.google.android.gms.internal.consent_sdk;

import android.text.TextUtils;
import android.util.Log;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
/* loaded from: classes2.dex */
public final class zzh {
    private final Executor zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzh(Executor executor) {
        this.zza = executor;
    }

    public final Executor zza() {
        return this.zza;
    }

    public final void zzb(final String str, final String str2, final zzg... zzgVarArr) {
        this.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zze
            @Override // java.lang.Runnable
            public final void run() {
                final JSONObject jSONObject;
                String str3 = str;
                String str4 = str2;
                zzg[] zzgVarArr2 = zzgVarArr;
                if (TextUtils.isEmpty(str3)) {
                    Log.d("UserMessagingPlatform", "Error on action: empty action name");
                    return;
                }
                final String lowerCase = str3.toLowerCase();
                if (TextUtils.isEmpty(str4)) {
                    jSONObject = new JSONObject();
                } else {
                    try {
                        jSONObject = new JSONObject(str4);
                    } catch (JSONException unused) {
                        StringBuilder sb2 = new StringBuilder(String.valueOf(lowerCase).length() + 32 + String.valueOf(str4).length());
                        sb2.append("Action[");
                        sb2.append(lowerCase);
                        sb2.append("]: failed to parse args: ");
                        sb2.append(str4);
                        Log.d("UserMessagingPlatform", sb2.toString());
                        return;
                    }
                }
                String valueOf = String.valueOf(jSONObject);
                StringBuilder sb3 = new StringBuilder(String.valueOf(lowerCase).length() + 10 + valueOf.length());
                sb3.append("Action[");
                sb3.append(lowerCase);
                sb3.append("]: ");
                sb3.append(valueOf);
                Log.d("UserMessagingPlatform", sb3.toString());
                for (final zzg zzgVar : zzgVarArr2) {
                    FutureTask futureTask = new FutureTask(new Callable() { // from class: com.google.android.gms.internal.consent_sdk.zzf
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return Boolean.valueOf(zzg.this.zzb(lowerCase, jSONObject));
                        }
                    });
                    zzgVar.zza().execute(futureTask);
                    try {
                    } catch (InterruptedException e10) {
                        StringBuilder sb4 = new StringBuilder(String.valueOf(lowerCase).length() + 33);
                        sb4.append("Thread interrupted for Action[");
                        sb4.append(lowerCase);
                        sb4.append("]: ");
                        Log.d("UserMessagingPlatform", sb4.toString(), e10);
                    } catch (ExecutionException e11) {
                        StringBuilder sb5 = new StringBuilder(String.valueOf(lowerCase).length() + 24);
                        sb5.append("Failed to run Action[");
                        sb5.append(lowerCase);
                        sb5.append("]: ");
                        Log.d("UserMessagingPlatform", sb5.toString(), e11.getCause());
                    }
                    if (((Boolean) futureTask.get()).booleanValue()) {
                        return;
                    }
                }
            }
        });
    }
}
