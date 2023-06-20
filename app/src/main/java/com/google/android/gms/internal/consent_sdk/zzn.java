package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import android.app.Application;
import hb.a;
import hb.d;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
/* loaded from: classes2.dex */
public final class zzn {
    private final Application zza;
    private final zzb zzb;
    private final zzam zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzn(Application application, zzb zzbVar, zzam zzamVar) {
        this.zza = application;
        this.zzb = zzbVar;
        this.zzc = zzamVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzbu zzd(Activity activity, d dVar) throws zzj {
        a a10 = dVar.a();
        if (a10 == null) {
            a10 = new a.C0399a(this.zza).b();
        }
        return zzo.zza(new zzo(this, activity, a10, dVar, null));
    }
}
