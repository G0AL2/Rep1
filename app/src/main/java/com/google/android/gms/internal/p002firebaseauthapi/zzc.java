package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzc  reason: invalid package */
/* loaded from: classes2.dex */
final class zzc implements zza {
    private zzc() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzc(zzb zzbVar) {
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zza
    public final ExecutorService zza(int i10) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), Executors.defaultThreadFactory());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return Executors.unconfigurableExecutorService(threadPoolExecutor);
    }
}
