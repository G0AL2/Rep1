package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfav implements zzfuy {
    final /* synthetic */ zzemw zza;
    final /* synthetic */ zzfhs zzb;
    final /* synthetic */ zzfhh zzc;
    final /* synthetic */ zzfax zzd;
    final /* synthetic */ zzfay zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfav(zzfay zzfayVar, zzemw zzemwVar, zzfhs zzfhsVar, zzfhh zzfhhVar, zzfax zzfaxVar) {
        this.zze = zzfayVar;
        this.zza = zzemwVar;
        this.zzb = zzfhsVar;
        this.zzc = zzfhhVar;
        this.zzd = zzfaxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfuy
    public final void zza(Throwable th) {
        zzeza zzezaVar;
        final com.google.android.gms.ads.internal.client.zze zza;
        zzfao zzfaoVar;
        zzdsx zzk;
        zzfhu zzfhuVar;
        zzfhs zzfhsVar;
        Executor executor;
        zzezaVar = this.zze.zze;
        zzdsy zzdsyVar = (zzdsy) zzezaVar.zzd();
        if (zzdsyVar == null) {
            zza = zzfdc.zzb(th, null);
        } else {
            zza = zzdsyVar.zzb().zza(th);
        }
        synchronized (this.zze) {
            if (zzdsyVar != null) {
                zzdsyVar.zza().zza(zza);
                executor = this.zze.zzb;
                executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfau
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzfao zzfaoVar2;
                        zzfav zzfavVar = zzfav.this;
                        com.google.android.gms.ads.internal.client.zze zzeVar = zza;
                        zzfaoVar2 = zzfavVar.zze.zzd;
                        zzfaoVar2.zza(zzeVar);
                    }
                });
            } else {
                zzfaoVar = this.zze.zzd;
                zzfaoVar.zza(zza);
                zzk = this.zze.zzk(this.zzd);
                zzk.zze().zzb().zzc().zzd();
            }
            zzfcx.zzb(zza.zza, th, "RewardedAdLoader.onFailure");
            this.zza.zza();
            if (((Boolean) zzbji.zzc.zze()).booleanValue() && (zzfhsVar = this.zzb) != null) {
                zzfhsVar.zzc(zza);
                zzfhh zzfhhVar = this.zzc;
                zzfhhVar.zze(false);
                zzfhsVar.zza(zzfhhVar);
                zzfhsVar.zzg();
            } else {
                zzfhuVar = this.zze.zzg;
                zzfhh zzfhhVar2 = this.zzc;
                zzfhhVar2.zza(zza);
                zzfhhVar2.zze(false);
                zzfhuVar.zzb(zzfhhVar2.zzj());
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfuy
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfao zzfaoVar;
        Executor executor;
        final zzfao zzfaoVar2;
        zzfao zzfaoVar3;
        zzfhu zzfhuVar;
        zzfhs zzfhsVar;
        zzdst zzdstVar = (zzdst) obj;
        synchronized (this.zze) {
            zzdfx zzn = zzdstVar.zzn();
            zzfaoVar = this.zze.zzd;
            zzn.zzd(zzfaoVar);
            this.zza.zzb(zzdstVar);
            zzfay zzfayVar = this.zze;
            executor = zzfayVar.zzb;
            zzfaoVar2 = zzfayVar.zzd;
            zzfaoVar2.getClass();
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfat
                @Override // java.lang.Runnable
                public final void run() {
                    zzfao.this.zzn();
                }
            });
            zzfaoVar3 = this.zze.zzd;
            zzfaoVar3.zzv();
            if (((Boolean) zzbji.zzc.zze()).booleanValue() && (zzfhsVar = this.zzb) != null) {
                zzfhsVar.zzf(zzdstVar.zzp().zzb);
                zzfhsVar.zze(zzdstVar.zzl().zzg());
                zzfhh zzfhhVar = this.zzc;
                zzfhhVar.zze(true);
                zzfhsVar.zza(zzfhhVar);
                zzfhsVar.zzg();
            } else {
                zzfhuVar = this.zze.zzg;
                zzfhh zzfhhVar2 = this.zzc;
                zzfhhVar2.zzb(zzdstVar.zzp().zzb);
                zzfhhVar2.zzc(zzdstVar.zzl().zzg());
                zzfhhVar2.zze(true);
                zzfhuVar.zzb(zzfhhVar2.zzj());
            }
        }
    }
}
