package com.google.android.gms.internal.ads;

import java.util.concurrent.BlockingQueue;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzaim implements Runnable {
    final /* synthetic */ zzajb zza;
    final /* synthetic */ zzain zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaim(zzain zzainVar, zzajb zzajbVar) {
        this.zzb = zzainVar;
        this.zza = zzajbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        BlockingQueue blockingQueue;
        try {
            blockingQueue = this.zzb.zzc;
            blockingQueue.put(this.zza);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
