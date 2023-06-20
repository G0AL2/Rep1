package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.lang.Thread;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.2 */
/* loaded from: classes2.dex */
public final class zzgd extends FutureTask implements Comparable {
    final boolean zza;
    final /* synthetic */ zzgf zzb;
    private final long zzc;
    private final String zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgd(zzgf zzgfVar, Runnable runnable, boolean z10, String str) {
        super(runnable, null);
        AtomicLong atomicLong;
        this.zzb = zzgfVar;
        Preconditions.checkNotNull(str);
        atomicLong = zzgf.zza;
        long andIncrement = atomicLong.getAndIncrement();
        this.zzc = andIncrement;
        this.zzd = str;
        this.zza = z10;
        if (andIncrement == Long.MAX_VALUE) {
            zzgfVar.zzs.zzaz().zzd().zza("Tasks index overflow");
        }
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        zzgd zzgdVar = (zzgd) obj;
        boolean z10 = this.zza;
        if (z10 != zzgdVar.zza) {
            return !z10 ? 1 : -1;
        }
        int i10 = (this.zzc > zzgdVar.zzc ? 1 : (this.zzc == zzgdVar.zzc ? 0 : -1));
        if (i10 < 0) {
            return -1;
        }
        if (i10 > 0) {
            return 1;
        }
        this.zzb.zzs.zzaz().zzh().zzb("Two tasks share the same index. index", Long.valueOf(this.zzc));
        return 0;
    }

    @Override // java.util.concurrent.FutureTask
    protected final void setException(Throwable th) {
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler;
        this.zzb.zzs.zzaz().zzd().zzb(this.zzd, th);
        if ((th instanceof zzgb) && (defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler()) != null) {
            defaultUncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th);
        }
        super.setException(th);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgd(zzgf zzgfVar, Callable callable, boolean z10, String str) {
        super(callable);
        AtomicLong atomicLong;
        this.zzb = zzgfVar;
        Preconditions.checkNotNull("Task exception on worker thread");
        atomicLong = zzgf.zza;
        long andIncrement = atomicLong.getAndIncrement();
        this.zzc = andIncrement;
        this.zzd = "Task exception on worker thread";
        this.zza = z10;
        if (andIncrement == Long.MAX_VALUE) {
            zzgfVar.zzs.zzaz().zzd().zza("Tasks index overflow");
        }
    }
}
