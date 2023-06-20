package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfvs {
    public static zzfvm zza(ExecutorService executorService) {
        zzfvm zzfvoVar;
        if (executorService instanceof zzfvm) {
            return (zzfvm) executorService;
        }
        if (executorService instanceof ScheduledExecutorService) {
            zzfvoVar = new zzfvr((ScheduledExecutorService) executorService);
        } else {
            zzfvoVar = new zzfvo(executorService);
        }
        return zzfvoVar;
    }

    public static Executor zzb() {
        return zzfuq.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Executor zzc(Executor executor, zzftt zzfttVar) {
        Objects.requireNonNull(executor);
        return executor == zzfuq.INSTANCE ? executor : new zzfvn(executor, zzfttVar);
    }
}
