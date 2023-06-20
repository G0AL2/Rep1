package com.google.android.gms.internal.gcm;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
final class zzi implements zzf {
    private zzi() {
    }

    @Override // com.google.android.gms.internal.gcm.zzf
    public final ExecutorService zzd(int i10, ThreadFactory threadFactory, int i11) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i10, i10, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return Executors.unconfigurableExecutorService(threadPoolExecutor);
    }

    @Override // com.google.android.gms.internal.gcm.zzf
    public final ScheduledExecutorService zze(int i10, ThreadFactory threadFactory, int i11) {
        return Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, threadFactory));
    }

    @Override // com.google.android.gms.internal.gcm.zzf
    public final ExecutorService zzd(ThreadFactory threadFactory, int i10) {
        return zzd(1, threadFactory, 9);
    }
}
