package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzol;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.2 */
/* loaded from: classes2.dex */
public final class zzkp {
    @VisibleForTesting
    protected long zza;
    @VisibleForTesting
    protected long zzb;
    final /* synthetic */ zzkr zzc;
    private final zzao zzd;

    public zzkp(zzkr zzkrVar) {
        this.zzc = zzkrVar;
        this.zzd = new zzko(this, zzkrVar.zzs);
        long elapsedRealtime = zzkrVar.zzs.zzaw().elapsedRealtime();
        this.zza = elapsedRealtime;
        this.zzb = elapsedRealtime;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza() {
        this.zzd.zzb();
        this.zza = 0L;
        this.zzb = 0L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzb(long j10) {
        this.zzd.zzb();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzc(long j10) {
        this.zzc.zzg();
        this.zzd.zzb();
        this.zza = j10;
        this.zzb = j10;
    }

    public final boolean zzd(boolean z10, boolean z11, long j10) {
        this.zzc.zzg();
        this.zzc.zza();
        zzol.zzc();
        if (this.zzc.zzs.zzf().zzs(null, zzel.zzae)) {
            if (this.zzc.zzs.zzJ()) {
                this.zzc.zzs.zzm().zzj.zzb(this.zzc.zzs.zzaw().currentTimeMillis());
            }
        } else {
            this.zzc.zzs.zzm().zzj.zzb(this.zzc.zzs.zzaw().currentTimeMillis());
        }
        long j11 = j10 - this.zza;
        if (!z10 && j11 < 1000) {
            this.zzc.zzs.zzaz().zzj().zzb("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(j11));
            return false;
        }
        if (!z11) {
            j11 = j10 - this.zzb;
            this.zzb = j10;
        }
        this.zzc.zzs.zzaz().zzj().zzb("Recording user engagement, ms", Long.valueOf(j11));
        Bundle bundle = new Bundle();
        bundle.putLong("_et", j11);
        zzlp.zzK(this.zzc.zzs.zzs().zzj(!this.zzc.zzs.zzf().zzu()), bundle, true);
        if (!z11) {
            this.zzc.zzs.zzq().zzH("auto", "_e", bundle);
        }
        this.zza = j10;
        this.zzd.zzb();
        this.zzd.zzd(3600000L);
        return true;
    }
}
