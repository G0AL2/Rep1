package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzexo implements zzemw {
    final /* synthetic */ zzexp zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzexo(zzexp zzexpVar) {
        this.zza = zzexpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzemw
    public final void zza() {
        synchronized (this.zza) {
            this.zza.zza = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzemw
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzexh zzexhVar;
        zzexh zzexhVar2;
        zzcvo zzcvoVar = (zzcvo) obj;
        synchronized (this.zza) {
            zzcvo zzcvoVar2 = this.zza.zza;
            if (zzcvoVar2 != null) {
                zzcvoVar2.zzV();
            }
            zzexp zzexpVar = this.zza;
            zzexpVar.zza = zzcvoVar;
            zzcvoVar.zzc(zzexpVar);
            zzexp zzexpVar2 = this.zza;
            zzexhVar = zzexpVar2.zzg;
            zzexhVar2 = zzexpVar2.zzg;
            zzexhVar.zzl(new zzcvp(zzcvoVar, zzexpVar2, zzexhVar2));
            zzcvoVar.zzW();
        }
    }
}
