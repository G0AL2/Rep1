package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public abstract class zzfuv extends zzfra implements Future {
    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        return zzb().cancel(z10);
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException, ExecutionException {
        return zzb().get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return zzb().isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return zzb().isDone();
    }

    @Override // com.google.android.gms.internal.ads.zzfra
    protected /* bridge */ /* synthetic */ Object zza() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract Future zzb();

    @Override // java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return zzb().get(j10, timeUnit);
    }
}
