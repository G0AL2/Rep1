package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzeyt implements zzfok {
    final /* synthetic */ zzeyw zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzeyt(zzeyw zzeywVar) {
        this.zza = zzeywVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfok
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        zzeyv zzeyvVar;
        zzbzv zzbzvVar = (zzbzv) obj;
        this.zza.zzd = new zzeyv(zzbzvVar, new zzfea(zzbzvVar.zzj), null);
        zzeyvVar = this.zza.zzd;
        return zzeyvVar;
    }
}
