package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.SystemClock;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzjq {
    private final zzjp zza;
    private final zzjo zzb;
    private final zzcx zzc;
    private final zzci zzd;
    private int zze;
    private Object zzf;
    private final Looper zzg;
    private final int zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;

    public zzjq(zzjo zzjoVar, zzjp zzjpVar, zzci zzciVar, int i10, zzcx zzcxVar, Looper looper) {
        this.zzb = zzjoVar;
        this.zza = zzjpVar;
        this.zzd = zzciVar;
        this.zzg = looper;
        this.zzc = zzcxVar;
        this.zzh = i10;
    }

    public final int zza() {
        return this.zze;
    }

    public final Looper zzb() {
        return this.zzg;
    }

    public final zzjp zzc() {
        return this.zza;
    }

    public final zzjq zzd() {
        zzcw.zzf(!this.zzi);
        this.zzi = true;
        this.zzb.zzm(this);
        return this;
    }

    public final zzjq zze(Object obj) {
        zzcw.zzf(!this.zzi);
        this.zzf = obj;
        return this;
    }

    public final zzjq zzf(int i10) {
        zzcw.zzf(!this.zzi);
        this.zze = i10;
        return this;
    }

    public final Object zzg() {
        return this.zzf;
    }

    public final synchronized void zzh(boolean z10) {
        this.zzj = z10 | this.zzj;
        this.zzk = true;
        notifyAll();
    }

    public final synchronized boolean zzi(long j10) throws InterruptedException, TimeoutException {
        zzcw.zzf(this.zzi);
        zzcw.zzf(this.zzg.getThread() != Thread.currentThread());
        long elapsedRealtime = SystemClock.elapsedRealtime() + j10;
        while (!this.zzk) {
            if (j10 > 0) {
                wait(j10);
                j10 = elapsedRealtime - SystemClock.elapsedRealtime();
            } else {
                throw new TimeoutException("Message delivery timed out.");
            }
        }
        return this.zzj;
    }

    public final synchronized boolean zzj() {
        return false;
    }
}
