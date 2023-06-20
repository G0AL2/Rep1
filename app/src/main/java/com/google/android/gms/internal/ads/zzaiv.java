package com.google.android.gms.internal.ads;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzaiv extends Thread {
    private final BlockingQueue zza;
    private final zzaiu zzb;
    private final zzail zzc;
    private volatile boolean zzd = false;
    private final zzais zze;

    public zzaiv(BlockingQueue blockingQueue, zzaiu zzaiuVar, zzail zzailVar, zzais zzaisVar, byte[] bArr) {
        this.zza = blockingQueue;
        this.zzb = zzaiuVar;
        this.zzc = zzailVar;
        this.zze = zzaisVar;
    }

    private void zzb() throws InterruptedException {
        zzajb zzajbVar = (zzajb) this.zza.take();
        SystemClock.elapsedRealtime();
        zzajbVar.zzt(3);
        try {
            zzajbVar.zzm("network-queue-take");
            zzajbVar.zzw();
            TrafficStats.setThreadStatsTag(zzajbVar.zzc());
            zzaix zza = this.zzb.zza(zzajbVar);
            zzajbVar.zzm("network-http-complete");
            if (zza.zze && zzajbVar.zzv()) {
                zzajbVar.zzp("not-modified");
                zzajbVar.zzr();
                return;
            }
            zzajh zzh = zzajbVar.zzh(zza);
            zzajbVar.zzm("network-parse-complete");
            if (zzh.zzb != null) {
                this.zzc.zzd(zzajbVar.zzj(), zzh.zzb);
                zzajbVar.zzm("network-cache-written");
            }
            zzajbVar.zzq();
            this.zze.zzb(zzajbVar, zzh, null);
            zzajbVar.zzs(zzh);
        } catch (zzajk e10) {
            SystemClock.elapsedRealtime();
            this.zze.zza(zzajbVar, e10);
            zzajbVar.zzr();
        } catch (Exception e11) {
            zzajn.zzc(e11, "Unhandled exception %s", e11.toString());
            zzajk zzajkVar = new zzajk(e11);
            SystemClock.elapsedRealtime();
            this.zze.zza(zzajbVar, zzajkVar);
            zzajbVar.zzr();
        } finally {
            zzajbVar.zzt(4);
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                zzb();
            } catch (InterruptedException unused) {
                if (this.zzd) {
                    Thread.currentThread().interrupt();
                    return;
                }
                zzajn.zzb("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }

    public final void zza() {
        this.zzd = true;
        interrupt();
    }
}
