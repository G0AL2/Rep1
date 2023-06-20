package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfvz extends zzfvk {
    final /* synthetic */ zzfwa zza;
    private final Callable zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfvz(zzfwa zzfwaVar, Callable callable) {
        this.zza = zzfwaVar;
        Objects.requireNonNull(callable);
        this.zzb = callable;
    }

    @Override // com.google.android.gms.internal.ads.zzfvk
    final Object zza() throws Exception {
        return this.zzb.call();
    }

    @Override // com.google.android.gms.internal.ads.zzfvk
    final String zzb() {
        return this.zzb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfvk
    final void zzd(Throwable th) {
        this.zza.zze(th);
    }

    @Override // com.google.android.gms.internal.ads.zzfvk
    final void zze(Object obj) {
        this.zza.zzd(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzfvk
    final boolean zzg() {
        return this.zza.isDone();
    }
}
