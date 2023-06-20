package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzffk implements zzfvl {
    private final Object zza;
    private final String zzb;
    private final zzfvl zzc;

    public zzffk(Object obj, String str, zzfvl zzfvlVar) {
        this.zza = obj;
        this.zzb = str;
        this.zzc = zzfvlVar;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        return this.zzc.cancel(z10);
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException, ExecutionException {
        return this.zzc.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.zzc.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.zzc.isDone();
    }

    public final String toString() {
        String str = this.zzb;
        int identityHashCode = System.identityHashCode(this);
        return str + "@" + identityHashCode;
    }

    public final Object zza() {
        return this.zza;
    }

    public final String zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfvl
    public final void zzc(Runnable runnable, Executor executor) {
        this.zzc.zzc(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return this.zzc.get(j10, timeUnit);
    }
}
