package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzfbg implements zzemw {
    final /* synthetic */ zzfbi zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfbg(zzfbi zzfbiVar) {
        this.zza = zzfbiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzemw
    public final void zza() {
        synchronized (this.zza) {
            this.zza.zzd = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzemw
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzdst zzdstVar;
        zzdst zzdstVar2 = (zzdst) obj;
        synchronized (this.zza) {
            this.zza.zzd = zzdstVar2;
            zzdstVar = this.zza.zzd;
            zzdstVar.zzW();
        }
    }
}
