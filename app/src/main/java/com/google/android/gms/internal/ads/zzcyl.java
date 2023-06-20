package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzcyl {
    private final Executor zza;
    private final ScheduledExecutorService zzb;
    private final zzfvl zzc;
    private volatile boolean zzd = true;

    public zzcyl(Executor executor, ScheduledExecutorService scheduledExecutorService, zzfvl zzfvlVar) {
        this.zza = executor;
        this.zzb = scheduledExecutorService;
        this.zzc = zzfvlVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void zzb(zzcyl zzcylVar, List list, final zzfuy zzfuyVar) {
        if (list != null && !list.isEmpty()) {
            zzfvl zzi = zzfvc.zzi(null);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                final zzfvl zzfvlVar = (zzfvl) it.next();
                zzi = zzfvc.zzn(zzfvc.zzg(zzi, Throwable.class, new zzfuj() { // from class: com.google.android.gms.internal.ads.zzcyg
                    @Override // com.google.android.gms.internal.ads.zzfuj
                    public final zzfvl zza(Object obj) {
                        zzfuy.this.zza((Throwable) obj);
                        return zzfvc.zzi(null);
                    }
                }, zzcylVar.zza), new zzfuj() { // from class: com.google.android.gms.internal.ads.zzcyh
                    @Override // com.google.android.gms.internal.ads.zzfuj
                    public final zzfvl zza(Object obj) {
                        return zzcyl.this.zza(zzfuyVar, zzfvlVar, (zzcxx) obj);
                    }
                }, zzcylVar.zza);
            }
            zzfvc.zzr(zzi, new zzcyk(zzcylVar, zzfuyVar), zzcylVar.zza);
            return;
        }
        zzcylVar.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcyf
            @Override // java.lang.Runnable
            public final void run() {
                zzfuy.this.zza(new zzdzl(3));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzfvl zza(zzfuy zzfuyVar, zzfvl zzfvlVar, zzcxx zzcxxVar) throws Exception {
        if (zzcxxVar != null) {
            zzfuyVar.zzb(zzcxxVar);
        }
        return zzfvc.zzo(zzfvlVar, ((Long) zzbkb.zzb.zze()).longValue(), TimeUnit.MILLISECONDS, this.zzb);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzd() {
        this.zzd = false;
    }

    public final void zze(zzfuy zzfuyVar) {
        zzfvc.zzr(this.zzc, new zzcyj(this, zzfuyVar), this.zza);
    }

    public final boolean zzf() {
        return this.zzd;
    }
}
