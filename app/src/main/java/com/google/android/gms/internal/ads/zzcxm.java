package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzcxm implements zzddh, zzban {
    private final zzfbl zza;
    private final zzdcl zzb;
    private final zzddq zzc;
    private final AtomicBoolean zzd = new AtomicBoolean();
    private final AtomicBoolean zze = new AtomicBoolean();

    public zzcxm(zzfbl zzfblVar, zzdcl zzdclVar, zzddq zzddqVar) {
        this.zza = zzfblVar;
        this.zzb = zzdclVar;
        this.zzc = zzddqVar;
    }

    private final void zza() {
        if (this.zzd.compareAndSet(false, true)) {
            this.zzb.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzban
    public final void zzc(zzbam zzbamVar) {
        if (this.zza.zzf == 1 && zzbamVar.zzj) {
            zza();
        }
        if (zzbamVar.zzj && this.zze.compareAndSet(false, true)) {
            this.zzc.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddh
    public final synchronized void zzn() {
        if (this.zza.zzf != 1) {
            zza();
        }
    }
}
