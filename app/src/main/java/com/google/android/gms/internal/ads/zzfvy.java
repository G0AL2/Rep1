package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfvy extends zzfvk {
    final /* synthetic */ zzfwa zza;
    private final zzfui zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfvy(zzfwa zzfwaVar, zzfui zzfuiVar) {
        this.zza = zzfwaVar;
        Objects.requireNonNull(zzfuiVar);
        this.zzb = zzfuiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfvk
    final /* bridge */ /* synthetic */ Object zza() throws Exception {
        zzfvl zza = this.zzb.zza();
        zzfou.zzd(zza, "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", this.zzb);
        return zza;
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
    final /* synthetic */ void zze(Object obj) {
        this.zza.zzt((zzfvl) obj);
    }

    @Override // com.google.android.gms.internal.ads.zzfvk
    final boolean zzg() {
        return this.zza.isDone();
    }
}
