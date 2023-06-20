package com.google.android.gms.internal.ads;

import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public abstract class zzftw extends AbstractExecutorService implements zzfvm {
    @Override // java.util.concurrent.AbstractExecutorService
    protected final RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return zzfwa.zzf(runnable, obj);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final /* synthetic */ Future submit(Runnable runnable) {
        return (zzfvl) super.submit(runnable);
    }

    @Override // com.google.android.gms.internal.ads.zzfvm
    public final zzfvl zza(Runnable runnable) {
        return (zzfvl) super.submit(runnable);
    }

    @Override // com.google.android.gms.internal.ads.zzfvm
    public final zzfvl zzb(Callable callable) {
        return (zzfvl) super.submit(callable);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    protected final RunnableFuture newTaskFor(Callable callable) {
        return new zzfwa(callable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final /* synthetic */ Future submit(Runnable runnable, Object obj) {
        return (zzfvl) super.submit(runnable, obj);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final /* synthetic */ Future submit(Callable callable) {
        return (zzfvl) super.submit(callable);
    }
}
