package com.google.android.gms.measurement.internal;

import android.os.Handler;
import android.os.Looper;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.2 */
/* loaded from: classes2.dex */
public final class zzkr extends zzf {
    protected final zzkq zza;
    protected final zzkp zzb;
    protected final zzkn zzc;
    private Handler zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzkr(zzgi zzgiVar) {
        super(zzgiVar);
        this.zza = new zzkq(this);
        this.zzb = new zzkp(this);
        this.zzc = new zzkn(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void zzj(zzkr zzkrVar, long j10) {
        zzkrVar.zzg();
        zzkrVar.zzm();
        zzkrVar.zzs.zzaz().zzj().zzb("Activity paused, time", Long.valueOf(j10));
        zzkrVar.zzc.zza(j10);
        if (zzkrVar.zzs.zzf().zzu()) {
            zzkrVar.zzb.zzb(j10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void zzl(zzkr zzkrVar, long j10) {
        zzkrVar.zzg();
        zzkrVar.zzm();
        zzkrVar.zzs.zzaz().zzj().zzb("Activity resumed, time", Long.valueOf(j10));
        if (zzkrVar.zzs.zzf().zzu() || zzkrVar.zzs.zzm().zzl.zzb()) {
            zzkrVar.zzb.zzc(j10);
        }
        zzkrVar.zzc.zzb();
        zzkq zzkqVar = zzkrVar.zza;
        zzkqVar.zza.zzg();
        if (zzkqVar.zza.zzs.zzJ()) {
            zzkqVar.zzb(zzkqVar.zza.zzs.zzaw().currentTimeMillis(), false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzm() {
        zzg();
        if (this.zzd == null) {
            this.zzd = new com.google.android.gms.internal.measurement.zzby(Looper.getMainLooper());
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    protected final boolean zzf() {
        return false;
    }
}
