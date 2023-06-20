package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbsb implements zzcge {
    final /* synthetic */ zzbsl zza;
    final /* synthetic */ zzfhh zzb;
    final /* synthetic */ zzbsm zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbsb(zzbsm zzbsmVar, zzbsl zzbslVar, zzfhh zzfhhVar) {
        this.zzc = zzbsmVar;
        this.zza = zzbslVar;
        this.zzb = zzfhhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcge
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Object obj2;
        zzbsl zzbslVar;
        zzfhu zzfhuVar;
        zzfhu zzfhuVar2;
        zzbsl zzbslVar2;
        zzbsl zzbslVar3;
        zzbrh zzbrhVar = (zzbrh) obj;
        obj2 = this.zzc.zza;
        synchronized (obj2) {
            this.zzc.zzi = 0;
            zzbsm zzbsmVar = this.zzc;
            zzbslVar = zzbsmVar.zzh;
            if (zzbslVar != null) {
                zzbsl zzbslVar4 = this.zza;
                zzbslVar2 = zzbsmVar.zzh;
                if (zzbslVar4 != zzbslVar2) {
                    com.google.android.gms.ads.internal.util.zze.zza("New JS engine is loaded, marking previous one as destroyable.");
                    zzbslVar3 = this.zzc.zzh;
                    zzbslVar3.zzb();
                }
            }
            this.zzc.zzh = this.zza;
            if (((Boolean) zzbji.zzd.zze()).booleanValue()) {
                zzbsm zzbsmVar2 = this.zzc;
                zzfhuVar = zzbsmVar2.zze;
                if (zzfhuVar != null) {
                    zzfhuVar2 = zzbsmVar2.zze;
                    zzfhh zzfhhVar = this.zzb;
                    zzfhhVar.zze(true);
                    zzfhuVar2.zzb(zzfhhVar.zzj());
                }
            }
        }
    }
}
