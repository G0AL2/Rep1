package com.google.android.gms.measurement.internal;

import android.os.Process;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Semaphore;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.2 */
/* loaded from: classes2.dex */
public final class zzge extends Thread {
    final /* synthetic */ zzgf zza;
    private final Object zzb;
    private final BlockingQueue zzc;
    private boolean zzd = false;

    public zzge(zzgf zzgfVar, String str, BlockingQueue blockingQueue) {
        this.zza = zzgfVar;
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(blockingQueue);
        this.zzb = new Object();
        this.zzc = blockingQueue;
        setName(str);
    }

    private final void zzb() {
        Object obj;
        Semaphore semaphore;
        Object obj2;
        zzge zzgeVar;
        zzge zzgeVar2;
        obj = this.zza.zzh;
        synchronized (obj) {
            if (!this.zzd) {
                semaphore = this.zza.zzi;
                semaphore.release();
                obj2 = this.zza.zzh;
                obj2.notifyAll();
                zzgf zzgfVar = this.zza;
                zzgeVar = zzgfVar.zzb;
                if (this == zzgeVar) {
                    zzgfVar.zzb = null;
                } else {
                    zzgeVar2 = zzgfVar.zzc;
                    if (this == zzgeVar2) {
                        zzgfVar.zzc = null;
                    } else {
                        zzgfVar.zzs.zzaz().zzd().zza("Current scheduler thread is neither worker nor network");
                    }
                }
                this.zzd = true;
            }
        }
    }

    private final void zzc(InterruptedException interruptedException) {
        this.zza.zzs.zzaz().zzk().zzb(String.valueOf(getName()).concat(" was interrupted"), interruptedException);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Semaphore semaphore;
        Object obj;
        boolean z10 = false;
        while (!z10) {
            try {
                semaphore = this.zza.zzi;
                semaphore.acquire();
                z10 = true;
            } catch (InterruptedException e10) {
                zzc(e10);
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                zzgd zzgdVar = (zzgd) this.zzc.poll();
                if (zzgdVar != null) {
                    Process.setThreadPriority(true != zzgdVar.zza ? 10 : threadPriority);
                    zzgdVar.run();
                } else {
                    synchronized (this.zzb) {
                        if (this.zzc.peek() == null) {
                            zzgf.zzr(this.zza);
                            try {
                                this.zzb.wait(30000L);
                            } catch (InterruptedException e11) {
                                zzc(e11);
                            }
                        }
                    }
                    obj = this.zza.zzh;
                    synchronized (obj) {
                        if (this.zzc.peek() == null) {
                            break;
                        }
                    }
                }
            }
            if (this.zza.zzs.zzf().zzs(null, zzel.zzaf)) {
                zzb();
            }
        } finally {
            zzb();
        }
    }

    public final void zza() {
        synchronized (this.zzb) {
            this.zzb.notifyAll();
        }
    }
}
