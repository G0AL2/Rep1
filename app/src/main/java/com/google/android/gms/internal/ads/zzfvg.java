package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzfvg implements zzfvl {
    static final zzfvl zza = new zzfvg(null);
    private static final Logger zzb = Logger.getLogger(zzfvg.class.getName());
    private final Object zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfvg(Object obj) {
        this.zzc = obj;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.zzc;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) throws ExecutionException {
        Objects.requireNonNull(timeUnit);
        return this.zzc;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }

    public final String toString() {
        return super.toString() + "[status=SUCCESS, result=[" + this.zzc + "]]";
    }

    @Override // com.google.android.gms.internal.ads.zzfvl
    public final void zzc(Runnable runnable, Executor executor) {
        zzfou.zzc(runnable, "Runnable was null.");
        zzfou.zzc(executor, "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            Logger logger = zzb;
            Level level = Level.SEVERE;
            logger.logp(level, "com.google.common.util.concurrent.ImmediateFuture", "addListener", "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e10);
        }
    }
}
