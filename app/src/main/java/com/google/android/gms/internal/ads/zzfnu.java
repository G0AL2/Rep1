package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
final class zzfnu implements zzfns {
    private zzfnu() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzfnu(zzfnt zzfntVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzfns
    public final ExecutorService zza(int i10) {
        return zzc(1, Executors.defaultThreadFactory(), 2);
    }

    @Override // com.google.android.gms.internal.ads.zzfns
    public final ExecutorService zzb(ThreadFactory threadFactory, int i10) {
        return zzc(1, threadFactory, 1);
    }

    @Override // com.google.android.gms.internal.ads.zzfns
    public final ExecutorService zzc(int i10, ThreadFactory threadFactory, int i11) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i10, i10, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return Executors.unconfigurableExecutorService(threadPoolExecutor);
    }
}
