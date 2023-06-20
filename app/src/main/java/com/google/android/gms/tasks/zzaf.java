package com.google.android.gms.tasks;

import java.util.concurrent.ExecutionException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-tasks@@18.0.1 */
/* loaded from: classes2.dex */
public final class zzaf implements zzae {
    private final Object zza = new Object();
    private final int zzb;
    private final zzw<Void> zzc;
    private int zzd;
    private int zze;
    private int zzf;
    private Exception zzg;
    private boolean zzh;

    public zzaf(int i10, zzw<Void> zzwVar) {
        this.zzb = i10;
        this.zzc = zzwVar;
    }

    private final void zza() {
        if (this.zzd + this.zze + this.zzf == this.zzb) {
            if (this.zzg == null) {
                if (this.zzh) {
                    this.zzc.zzc();
                    return;
                } else {
                    this.zzc.zzb(null);
                    return;
                }
            }
            zzw<Void> zzwVar = this.zzc;
            int i10 = this.zze;
            int i11 = this.zzb;
            StringBuilder sb2 = new StringBuilder(54);
            sb2.append(i10);
            sb2.append(" out of ");
            sb2.append(i11);
            sb2.append(" underlying tasks failed");
            zzwVar.zza(new ExecutionException(sb2.toString(), this.zzg));
        }
    }

    @Override // com.google.android.gms.tasks.OnCanceledListener
    public final void onCanceled() {
        synchronized (this.zza) {
            this.zzf++;
            this.zzh = true;
            zza();
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        synchronized (this.zza) {
            this.zze++;
            this.zzg = exc;
            zza();
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        synchronized (this.zza) {
            this.zzd++;
            zza();
        }
    }
}
