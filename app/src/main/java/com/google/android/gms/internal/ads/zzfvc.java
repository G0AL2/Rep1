package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfvc extends zzfve {
    public static zzfvb zza(Iterable iterable) {
        return new zzfvb(false, zzfrj.zzl(iterable), null);
    }

    @SafeVarargs
    public static zzfvb zzb(zzfvl... zzfvlVarArr) {
        return new zzfvb(false, zzfrj.zzn(zzfvlVarArr), null);
    }

    public static zzfvb zzc(Iterable iterable) {
        return new zzfvb(true, zzfrj.zzl(iterable), null);
    }

    @SafeVarargs
    public static zzfvb zzd(zzfvl... zzfvlVarArr) {
        return new zzfvb(true, zzfrj.zzn(zzfvlVarArr), null);
    }

    public static zzfvl zze(Iterable iterable) {
        return new zzfuk(zzfrj.zzl(iterable), true);
    }

    public static zzfvl zzf(zzfvl zzfvlVar, Class cls, zzfok zzfokVar, Executor executor) {
        zzftr zzftrVar = new zzftr(zzfvlVar, cls, zzfokVar);
        zzfvlVar.zzc(zzftrVar, zzfvs.zzc(executor, zzftrVar));
        return zzftrVar;
    }

    public static zzfvl zzg(zzfvl zzfvlVar, Class cls, zzfuj zzfujVar, Executor executor) {
        zzftq zzftqVar = new zzftq(zzfvlVar, cls, zzfujVar);
        zzfvlVar.zzc(zzftqVar, zzfvs.zzc(executor, zzftqVar));
        return zzftqVar;
    }

    public static zzfvl zzh(Throwable th) {
        Objects.requireNonNull(th);
        return new zzfvf(th);
    }

    public static zzfvl zzi(Object obj) {
        if (obj == null) {
            return zzfvg.zza;
        }
        return new zzfvg(obj);
    }

    public static zzfvl zzj() {
        return zzfvg.zza;
    }

    public static zzfvl zzk(Callable callable, Executor executor) {
        zzfwa zzfwaVar = new zzfwa(callable);
        executor.execute(zzfwaVar);
        return zzfwaVar;
    }

    public static zzfvl zzl(zzfui zzfuiVar, Executor executor) {
        zzfwa zzfwaVar = new zzfwa(zzfuiVar);
        executor.execute(zzfwaVar);
        return zzfwaVar;
    }

    public static zzfvl zzm(zzfvl zzfvlVar, zzfok zzfokVar, Executor executor) {
        int i10 = zzftz.zzc;
        Objects.requireNonNull(zzfokVar);
        zzfty zzftyVar = new zzfty(zzfvlVar, zzfokVar);
        zzfvlVar.zzc(zzftyVar, zzfvs.zzc(executor, zzftyVar));
        return zzftyVar;
    }

    public static zzfvl zzn(zzfvl zzfvlVar, zzfuj zzfujVar, Executor executor) {
        int i10 = zzftz.zzc;
        Objects.requireNonNull(executor);
        zzftx zzftxVar = new zzftx(zzfvlVar, zzfujVar);
        zzfvlVar.zzc(zzftxVar, zzfvs.zzc(executor, zzftxVar));
        return zzftxVar;
    }

    public static zzfvl zzo(zzfvl zzfvlVar, long j10, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        return zzfvlVar.isDone() ? zzfvlVar : zzfvx.zzg(zzfvlVar, j10, timeUnit, scheduledExecutorService);
    }

    public static Object zzp(Future future) throws ExecutionException {
        if (future.isDone()) {
            return zzfwc.zza(future);
        }
        throw new IllegalStateException(zzfpi.zzb("Future was expected to be done: %s", future));
    }

    public static Object zzq(Future future) {
        try {
            return zzfwc.zza(future);
        } catch (ExecutionException e10) {
            Throwable cause = e10.getCause();
            if (cause instanceof Error) {
                throw new zzfur((Error) cause);
            }
            throw new zzfwb(cause);
        }
    }

    public static void zzr(zzfvl zzfvlVar, zzfuy zzfuyVar, Executor executor) {
        Objects.requireNonNull(zzfuyVar);
        zzfvlVar.zzc(new zzfva(zzfvlVar, zzfuyVar), executor);
    }
}
