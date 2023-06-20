package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public class zzcga implements zzfvl {
    private final zzfvt zza = zzfvt.zzf();

    private static final boolean zza(boolean z10) {
        if (!z10) {
            com.google.android.gms.ads.internal.zzt.zzo().zzs(new IllegalStateException("Provided SettableFuture with multiple values."), "SettableFuture");
        }
        return z10;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        return this.zza.cancel(z10);
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws ExecutionException, InterruptedException {
        return this.zza.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.zza.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.zza.isDone();
    }

    @Override // com.google.android.gms.internal.ads.zzfvl
    public final void zzc(Runnable runnable, Executor executor) {
        this.zza.zzc(runnable, executor);
    }

    public final boolean zzd(Object obj) {
        boolean zzd = this.zza.zzd(obj);
        zza(zzd);
        return zzd;
    }

    public final boolean zze(Throwable th) {
        boolean zze = this.zza.zze(th);
        zza(zze);
        return zze;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return this.zza.get(j10, timeUnit);
    }
}
