package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzaiq implements Executor {
    final /* synthetic */ Handler zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaiq(zzais zzaisVar, Handler handler) {
        this.zza = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.zza.post(runnable);
    }
}
