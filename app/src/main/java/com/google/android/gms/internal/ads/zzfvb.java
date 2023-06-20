package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfvb {
    private final boolean zza;
    private final zzfrj zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzfvb(boolean z10, zzfrj zzfrjVar, zzfuz zzfuzVar) {
        this.zza = z10;
        this.zzb = zzfrjVar;
    }

    public final zzfvl zza(Callable callable, Executor executor) {
        return new zzfup(this.zzb, this.zza, executor, callable);
    }
}
