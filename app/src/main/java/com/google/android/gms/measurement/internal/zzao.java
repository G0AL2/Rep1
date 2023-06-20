package com.google.android.gms.measurement.internal;

import android.os.Handler;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.2 */
/* loaded from: classes2.dex */
public abstract class zzao {
    private static volatile Handler zza;
    private final zzhd zzb;
    private final Runnable zzc;
    private volatile long zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzao(zzhd zzhdVar) {
        Preconditions.checkNotNull(zzhdVar);
        this.zzb = zzhdVar;
        this.zzc = new zzan(this, zzhdVar);
    }

    private final Handler zzf() {
        Handler handler;
        if (zza != null) {
            return zza;
        }
        synchronized (zzao.class) {
            if (zza == null) {
                zza = new com.google.android.gms.internal.measurement.zzby(this.zzb.zzav().getMainLooper());
            }
            handler = zza;
        }
        return handler;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzb() {
        this.zzd = 0L;
        zzf().removeCallbacks(this.zzc);
    }

    public abstract void zzc();

    public final void zzd(long j10) {
        zzb();
        if (j10 >= 0) {
            this.zzd = this.zzb.zzaw().currentTimeMillis();
            if (zzf().postDelayed(this.zzc, j10)) {
                return;
            }
            this.zzb.zzaz().zzd().zzb("Failed to schedule delayed post. time", Long.valueOf(j10));
        }
    }

    public final boolean zze() {
        return this.zzd != 0;
    }
}
