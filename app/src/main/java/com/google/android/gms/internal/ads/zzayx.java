package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzayx {
    private final ExecutorService zza = zzazo.zzl("Loader:ExtractorMediaPeriod");
    private zzayu zzb;
    private IOException zzc;

    public zzayx(String str) {
    }

    public final long zza(zzayv zzayvVar, zzayt zzaytVar, int i10) {
        Looper myLooper = Looper.myLooper();
        zzayz.zze(myLooper != null);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new zzayu(this, myLooper, zzayvVar, zzaytVar, i10, elapsedRealtime).zzc(0L);
        return elapsedRealtime;
    }

    public final void zzf() {
        this.zzb.zza(false);
    }

    public final void zzg(int i10) throws IOException {
        IOException iOException = this.zzc;
        if (iOException != null) {
            throw iOException;
        }
        zzayu zzayuVar = this.zzb;
        if (zzayuVar != null) {
            zzayuVar.zzb(zzayuVar.zza);
        }
    }

    public final void zzh(Runnable runnable) {
        zzayu zzayuVar = this.zzb;
        if (zzayuVar != null) {
            zzayuVar.zza(true);
        }
        this.zza.execute(runnable);
        this.zza.shutdown();
    }

    public final boolean zzi() {
        return this.zzb != null;
    }
}
