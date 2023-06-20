package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public abstract class zzfux extends zzfuv implements zzfvl {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzfuv
    public /* bridge */ /* synthetic */ Future zzb() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzfvl
    public final void zzc(Runnable runnable, Executor executor) {
        zzd().zzc(runnable, executor);
    }

    protected abstract zzfvl zzd();
}
