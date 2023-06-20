package com.google.android.gms.internal.p002firebaseauthapi;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.io.IOException;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzfc  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzfc implements zzbb {
    private final SharedPreferences.Editor zza;
    private final String zzb = "GenericIdpKeyset";

    public zzfc(Context context, String str, String str2) {
        Context applicationContext = context.getApplicationContext();
        if (str2 == null) {
            this.zza = PreferenceManager.getDefaultSharedPreferences(applicationContext).edit();
        } else {
            this.zza = applicationContext.getSharedPreferences(str2, 0).edit();
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbb
    public final void zzb(zzix zzixVar) throws IOException {
        if (!this.zza.putString(this.zzb, zzmr.zza(zzixVar.zzr())).commit()) {
            throw new IOException("Failed to write to SharedPreferences");
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbb
    public final void zzc(zzkm zzkmVar) throws IOException {
        if (!this.zza.putString(this.zzb, zzmr.zza(zzkmVar.zzr())).commit()) {
            throw new IOException("Failed to write to SharedPreferences");
        }
    }
}
