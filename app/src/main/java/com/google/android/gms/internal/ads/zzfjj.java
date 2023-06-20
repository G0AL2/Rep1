package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfjj {
    private static zzfjj zza;
    private float zzb = 0.0f;
    private final zzfjb zzc;
    private final zzfiz zzd;
    private zzfja zze;
    private zzfjc zzf;

    public zzfjj(zzfjb zzfjbVar, zzfiz zzfizVar) {
        this.zzc = zzfjbVar;
        this.zzd = zzfizVar;
    }

    public static zzfjj zzb() {
        if (zza == null) {
            zza = new zzfjj(new zzfjb(), new zzfiz());
        }
        return zza;
    }

    public final float zza() {
        return this.zzb;
    }

    public final void zzc(Context context) {
        this.zze = new zzfja(new Handler(), context, new zzfiy(), this, null);
    }

    public final void zzd(float f10) {
        this.zzb = f10;
        if (this.zzf == null) {
            this.zzf = zzfjc.zza();
        }
        for (zzfir zzfirVar : this.zzf.zzb()) {
            zzfirVar.zzg().zzh(f10);
        }
    }

    public final void zze() {
        zzfje.zza().zzg(this);
        zzfje.zza().zzd();
        if (zzfje.zza().zzf()) {
            zzfkf.zzd().zzi();
        }
        this.zze.zza();
    }

    public final void zzf() {
        zzfkf.zzd().zzj();
        zzfje.zza().zze();
        this.zze.zzb();
    }
}
