package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzfuu extends zzfut {
    private final zzfvl zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfuu(zzfvl zzfvlVar) {
        Objects.requireNonNull(zzfvlVar);
        this.zza = zzfvlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzftt, java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        return this.zza.cancel(z10);
    }

    @Override // com.google.android.gms.internal.ads.zzftt, java.util.concurrent.Future
    public final Object get() throws InterruptedException, ExecutionException {
        return this.zza.get();
    }

    @Override // com.google.android.gms.internal.ads.zzftt, java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.zza.isCancelled();
    }

    @Override // com.google.android.gms.internal.ads.zzftt, java.util.concurrent.Future
    public final boolean isDone() {
        return this.zza.isDone();
    }

    @Override // com.google.android.gms.internal.ads.zzftt
    public final String toString() {
        return this.zza.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzftt, com.google.android.gms.internal.ads.zzfvl
    public final void zzc(Runnable runnable, Executor executor) {
        this.zza.zzc(runnable, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzftt, java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return this.zza.get(j10, timeUnit);
    }
}
