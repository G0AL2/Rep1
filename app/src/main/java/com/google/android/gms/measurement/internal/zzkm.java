package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.2 */
/* loaded from: classes2.dex */
public final class zzkm implements Runnable {
    final long zza;
    final long zzb;
    final /* synthetic */ zzkn zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzkm(zzkn zzknVar, long j10, long j11) {
        this.zzc = zzknVar;
        this.zza = j10;
        this.zzb = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzc.zza.zzs.zzaA().zzp(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzkl
            @Override // java.lang.Runnable
            public final void run() {
                zzkm zzkmVar = zzkm.this;
                zzkn zzknVar = zzkmVar.zzc;
                long j10 = zzkmVar.zza;
                long j11 = zzkmVar.zzb;
                zzknVar.zza.zzg();
                zzknVar.zza.zzs.zzaz().zzc().zza("Application going to the background");
                zzknVar.zza.zzs.zzm().zzl.zza(true);
                Bundle bundle = new Bundle();
                if (!zzknVar.zza.zzs.zzf().zzu()) {
                    zzknVar.zza.zzb.zzb(j11);
                    zzknVar.zza.zzb.zzd(false, false, j11);
                }
                zzknVar.zza.zzs.zzq().zzI("auto", "_ab", j10, bundle);
            }
        });
    }
}
