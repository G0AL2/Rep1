package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzdcg extends zzdhc implements zzdbx {
    private final ScheduledExecutorService zzb;
    private ScheduledFuture zzc;
    private boolean zzd;

    public zzdcg(zzdcf zzdcfVar, Set set, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        super(set);
        this.zzd = false;
        this.zzb = scheduledExecutorService;
        zzj(zzdcfVar, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzdbx
    public final void zza(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzo(new zzdhb() { // from class: com.google.android.gms.internal.ads.zzdbz
            @Override // com.google.android.gms.internal.ads.zzdhb
            public final void zza(Object obj) {
                ((zzdbx) obj).zza(com.google.android.gms.ads.internal.client.zze.this);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdbx
    public final void zzb() {
        zzo(new zzdhb() { // from class: com.google.android.gms.internal.ads.zzdcb
            @Override // com.google.android.gms.internal.ads.zzdhb
            public final void zza(Object obj) {
                ((zzdbx) obj).zzb();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzc() {
        synchronized (this) {
            zzcfi.zzg("Timeout waiting for show call succeed to be called.");
            zze(new zzdlf("Timeout for show call succeed."));
            this.zzd = true;
        }
    }

    public final synchronized void zzd() {
        ScheduledFuture scheduledFuture = this.zzc;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdbx
    public final void zze(final zzdlf zzdlfVar) {
        if (this.zzd) {
            return;
        }
        ScheduledFuture scheduledFuture = this.zzc;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        zzo(new zzdhb() { // from class: com.google.android.gms.internal.ads.zzdby
            @Override // com.google.android.gms.internal.ads.zzdhb
            public final void zza(Object obj) {
                ((zzdbx) obj).zze(zzdlf.this);
            }
        });
    }

    public final void zzf() {
        this.zzc = this.zzb.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdca
            @Override // java.lang.Runnable
            public final void run() {
                zzdcg.this.zzc();
            }
        }, ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzig)).intValue(), TimeUnit.MILLISECONDS);
    }
}
