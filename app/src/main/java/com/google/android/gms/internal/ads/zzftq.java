package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzftq extends zzfts {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzftq(zzfvl zzfvlVar, Class cls, zzfuj zzfujVar) {
        super(zzfvlVar, cls, zzfujVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfts
    final /* bridge */ /* synthetic */ Object zzf(Object obj, Throwable th) throws Exception {
        zzfuj zzfujVar = (zzfuj) obj;
        zzfvl zza = zzfujVar.zza(th);
        zzfou.zzd(zza, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzfujVar);
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfts
    final /* synthetic */ void zzg(Object obj) {
        zzt((zzfvl) obj);
    }
}
