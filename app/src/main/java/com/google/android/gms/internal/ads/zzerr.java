package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzerr implements zzetg {
    private final zzetg zza;
    private final long zzb;
    private final ScheduledExecutorService zzc;

    public zzerr(zzetg zzetgVar, long j10, ScheduledExecutorService scheduledExecutorService) {
        this.zza = zzetgVar;
        this.zzb = j10;
        this.zzc = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.zzetg
    public final int zza() {
        return this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzetg
    public final zzfvl zzb() {
        zzfvl zzb = this.zza.zzb();
        long j10 = this.zzb;
        if (j10 > 0) {
            zzb = zzfvc.zzo(zzb, j10, TimeUnit.MILLISECONDS, this.zzc);
        }
        return zzfvc.zzg(zzb, Throwable.class, new zzfuj() { // from class: com.google.android.gms.internal.ads.zzerq
            @Override // com.google.android.gms.internal.ads.zzfuj
            public final zzfvl zza(Object obj) {
                Throwable th = (Throwable) obj;
                return zzfvc.zzi(null);
            }
        }, zzcfv.zzf);
    }
}
