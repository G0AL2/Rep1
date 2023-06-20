package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzegx implements zzefd {
    private final zzcws zza;
    private final zzege zzb;
    private final zzfvm zzc;
    private final zzdbv zzd;
    private final ScheduledExecutorService zze;

    public zzegx(zzcws zzcwsVar, zzege zzegeVar, zzdbv zzdbvVar, ScheduledExecutorService scheduledExecutorService, zzfvm zzfvmVar) {
        this.zza = zzcwsVar;
        this.zzb = zzegeVar;
        this.zzd = zzdbvVar;
        this.zze = scheduledExecutorService;
        this.zzc = zzfvmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzefd
    public final zzfvl zza(final zzfbx zzfbxVar, final zzfbl zzfblVar) {
        return this.zzc.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzegu
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzegx.this.zzc(zzfbxVar, zzfblVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzefd
    public final boolean zzb(zzfbx zzfbxVar, zzfbl zzfblVar) {
        return zzfbxVar.zza.zza.zza() != null && this.zzb.zzb(zzfbxVar, zzfblVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzcvv zzc(final zzfbx zzfbxVar, final zzfbl zzfblVar) throws Exception {
        return this.zza.zzb(new zzcym(zzfbxVar, zzfblVar, null), new zzcxf(zzfbxVar.zza.zza.zza(), new Runnable() { // from class: com.google.android.gms.internal.ads.zzegv
            @Override // java.lang.Runnable
            public final void run() {
                zzegx.this.zzf(zzfbxVar, zzfblVar);
            }
        })).zza();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzf(zzfbx zzfbxVar, zzfbl zzfblVar) {
        zzfvc.zzr(zzfvc.zzo(this.zzb.zza(zzfbxVar, zzfblVar), zzfblVar.zzS, TimeUnit.SECONDS, this.zze), new zzegw(this), this.zzc);
    }
}
