package com.google.android.gms.internal.ads;

import android.os.ConditionVariable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzanw implements Runnable {
    final /* synthetic */ zzanx zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzanw(zzanx zzanxVar) {
        this.zza = zzanxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ConditionVariable conditionVariable;
        boolean z10;
        zzapc zzapcVar;
        ConditionVariable conditionVariable2;
        if (this.zza.zzb != null) {
            return;
        }
        conditionVariable = zzanx.zzc;
        synchronized (conditionVariable) {
            if (this.zza.zzb != null) {
                return;
            }
            boolean z11 = false;
            try {
                z10 = ((Boolean) zzbhz.zzca.zze()).booleanValue();
            } catch (IllegalStateException unused) {
                z10 = false;
            }
            if (z10) {
                try {
                    zzapcVar = this.zza.zze;
                    zzanx.zza = zzfmw.zzb(zzapcVar.zza, "ADSHIELD", null);
                } catch (Throwable unused2) {
                }
            }
            z11 = z10;
            this.zza.zzb = Boolean.valueOf(z11);
            conditionVariable2 = zzanx.zzc;
            conditionVariable2.open();
        }
    }
}
