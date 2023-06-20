package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
@Deprecated
/* loaded from: classes2.dex */
public class zzcgh {
    private final zzcga zza;
    private final AtomicInteger zzb;

    public zzcgh() {
        zzcga zzcgaVar = new zzcga();
        this.zza = zzcgaVar;
        this.zzb = new AtomicInteger(0);
        zzfvc.zzr(zzcgaVar, new zzcgf(this), zzcfv.zzf);
    }

    @Deprecated
    public final int zze() {
        return this.zzb.get();
    }

    @Deprecated
    public final void zzg() {
        this.zza.zze(new Exception());
    }

    @Deprecated
    public final void zzh(Object obj) {
        this.zza.zzd(obj);
    }

    @Deprecated
    public final void zzi(zzcge zzcgeVar, zzcgc zzcgcVar) {
        zzfvc.zzr(this.zza, new zzcgg(this, zzcgeVar, zzcgcVar), zzcfv.zzf);
    }
}
