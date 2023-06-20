package com.google.android.gms.measurement.internal;

import android.os.Handler;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.2 */
/* loaded from: classes2.dex */
public final class zzkn {
    final /* synthetic */ zzkr zza;
    private zzkm zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzkn(zzkr zzkrVar) {
        this.zza = zzkrVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(long j10) {
        Handler handler;
        this.zzb = new zzkm(this, this.zza.zzs.zzaw().currentTimeMillis(), j10);
        handler = this.zza.zzd;
        handler.postDelayed(this.zzb, Constants.MIN_PROGRESS_TIME);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzb() {
        Handler handler;
        this.zza.zzg();
        zzkm zzkmVar = this.zzb;
        if (zzkmVar != null) {
            handler = this.zza.zzd;
            handler.removeCallbacks(zzkmVar);
        }
        this.zza.zzs.zzm().zzl.zza(false);
    }
}
