package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzdat implements zzdbt, zzdiq, zzdgk, zzdcj {
    private final zzdcl zza;
    private final zzfbl zzb;
    private final ScheduledExecutorService zzc;
    private final Executor zzd;
    private final zzfvt zze = zzfvt.zzf();
    private ScheduledFuture zzf;

    public zzdat(zzdcl zzdclVar, zzfbl zzfblVar, ScheduledExecutorService scheduledExecutorService, Executor executor) {
        this.zza = zzdclVar;
        this.zzb = zzfblVar;
        this.zzc = scheduledExecutorService;
        this.zzd = executor;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzb() {
        synchronized (this) {
            if (this.zze.isDone()) {
                return;
            }
            this.zze.zzd(Boolean.TRUE);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    public final void zzbv() {
    }

    @Override // com.google.android.gms.internal.ads.zzdgk
    public final void zzc() {
    }

    @Override // com.google.android.gms.internal.ads.zzdgk
    public final synchronized void zzd() {
        if (this.zze.isDone()) {
            return;
        }
        ScheduledFuture scheduledFuture = this.zzf;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        this.zze.zzd(Boolean.TRUE);
    }

    @Override // com.google.android.gms.internal.ads.zzdiq
    public final void zze() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzbp)).booleanValue()) {
            zzfbl zzfblVar = this.zzb;
            if (zzfblVar.zzZ == 2) {
                if (zzfblVar.zzr == 0) {
                    this.zza.zza();
                    return;
                }
                zzfvc.zzr(this.zze, new zzdas(this), this.zzd);
                this.zzf = this.zzc.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdar
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzdat.this.zzb();
                    }
                }, this.zzb.zzr, TimeUnit.MILLISECONDS);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdiq
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    public final void zzj() {
    }

    @Override // com.google.android.gms.internal.ads.zzdcj
    public final synchronized void zzk(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (this.zze.isDone()) {
            return;
        }
        ScheduledFuture scheduledFuture = this.zzf;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        this.zze.zze(new Exception());
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    public final void zzm() {
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    public final void zzo() {
        int i10 = this.zzb.zzZ;
        if (i10 == 0 || i10 == 1) {
            this.zza.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    public final void zzp(zzcal zzcalVar, String str, String str2) {
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    public final void zzr() {
    }
}
