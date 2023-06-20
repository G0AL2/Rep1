package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.lang.Thread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.2 */
/* loaded from: classes2.dex */
public final class zzgf extends zzhc {
    private static final AtomicLong zza = new AtomicLong(Long.MIN_VALUE);
    private zzge zzb;
    private zzge zzc;
    private final PriorityBlockingQueue zzd;
    private final BlockingQueue zze;
    private final Thread.UncaughtExceptionHandler zzf;
    private final Thread.UncaughtExceptionHandler zzg;
    private final Object zzh;
    private final Semaphore zzi;
    private volatile boolean zzj;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgf(zzgi zzgiVar) {
        super(zzgiVar);
        this.zzh = new Object();
        this.zzi = new Semaphore(2);
        this.zzd = new PriorityBlockingQueue();
        this.zze = new LinkedBlockingQueue();
        this.zzf = new zzgc(this, "Thread death: Uncaught exception on worker thread");
        this.zzg = new zzgc(this, "Thread death: Uncaught exception on network thread");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ boolean zzr(zzgf zzgfVar) {
        boolean z10 = zzgfVar.zzj;
        return false;
    }

    private final void zzt(zzgd zzgdVar) {
        synchronized (this.zzh) {
            this.zzd.add(zzgdVar);
            zzge zzgeVar = this.zzb;
            if (zzgeVar == null) {
                zzge zzgeVar2 = new zzge(this, "Measurement Worker", this.zzd);
                this.zzb = zzgeVar2;
                zzgeVar2.setUncaughtExceptionHandler(this.zzf);
                this.zzb.start();
            } else {
                zzgeVar.zza();
            }
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzhb
    public final void zzay() {
        if (Thread.currentThread() != this.zzc) {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Object zzd(AtomicReference atomicReference, long j10, String str, Runnable runnable) {
        synchronized (atomicReference) {
            this.zzs.zzaA().zzp(runnable);
            try {
                atomicReference.wait(j10);
            } catch (InterruptedException unused) {
                zzew zzk = this.zzs.zzaz().zzk();
                zzk.zza("Interrupted waiting for " + str);
                return null;
            }
        }
        Object obj = atomicReference.get();
        if (obj == null) {
            this.zzs.zzaz().zzk().zza("Timed out waiting for ".concat(str));
        }
        return obj;
    }

    @Override // com.google.android.gms.measurement.internal.zzhc
    protected final boolean zzf() {
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.zzhb
    public final void zzg() {
        if (Thread.currentThread() != this.zzb) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    public final Future zzh(Callable callable) throws IllegalStateException {
        zzu();
        Preconditions.checkNotNull(callable);
        zzgd zzgdVar = new zzgd(this, callable, false, "Task exception on worker thread");
        if (Thread.currentThread() == this.zzb) {
            if (!this.zzd.isEmpty()) {
                this.zzs.zzaz().zzk().zza("Callable skipped the worker queue.");
            }
            zzgdVar.run();
        } else {
            zzt(zzgdVar);
        }
        return zzgdVar;
    }

    public final Future zzi(Callable callable) throws IllegalStateException {
        zzu();
        Preconditions.checkNotNull(callable);
        zzgd zzgdVar = new zzgd(this, callable, true, "Task exception on worker thread");
        if (Thread.currentThread() == this.zzb) {
            zzgdVar.run();
        } else {
            zzt(zzgdVar);
        }
        return zzgdVar;
    }

    public final void zzo(Runnable runnable) throws IllegalStateException {
        zzu();
        Preconditions.checkNotNull(runnable);
        zzgd zzgdVar = new zzgd(this, runnable, false, "Task exception on network thread");
        synchronized (this.zzh) {
            this.zze.add(zzgdVar);
            zzge zzgeVar = this.zzc;
            if (zzgeVar == null) {
                zzge zzgeVar2 = new zzge(this, "Measurement Network", this.zze);
                this.zzc = zzgeVar2;
                zzgeVar2.setUncaughtExceptionHandler(this.zzg);
                this.zzc.start();
            } else {
                zzgeVar.zza();
            }
        }
    }

    public final void zzp(Runnable runnable) throws IllegalStateException {
        zzu();
        Preconditions.checkNotNull(runnable);
        zzt(new zzgd(this, runnable, false, "Task exception on worker thread"));
    }

    public final void zzq(Runnable runnable) throws IllegalStateException {
        zzu();
        Preconditions.checkNotNull(runnable);
        zzt(new zzgd(this, runnable, true, "Task exception on worker thread"));
    }

    public final boolean zzs() {
        return Thread.currentThread() == this.zzb;
    }
}
