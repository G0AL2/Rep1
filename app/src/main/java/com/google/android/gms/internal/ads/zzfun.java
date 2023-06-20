package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfun extends zzfuo {
    final /* synthetic */ zzfup zza;
    private final Callable zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfun(zzfup zzfupVar, Callable callable, Executor executor) {
        super(zzfupVar, executor);
        this.zza = zzfupVar;
        Objects.requireNonNull(callable);
        this.zzc = callable;
    }

    @Override // com.google.android.gms.internal.ads.zzfvk
    final Object zza() throws Exception {
        return this.zzc.call();
    }

    @Override // com.google.android.gms.internal.ads.zzfvk
    final String zzb() {
        return this.zzc.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfuo
    final void zzc(Object obj) {
        this.zza.zzd(obj);
    }
}
