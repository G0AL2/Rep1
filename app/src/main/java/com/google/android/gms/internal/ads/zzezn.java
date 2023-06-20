package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzezn implements zzfuy {
    final /* synthetic */ zzemw zza;
    final /* synthetic */ zzfhs zzb;
    final /* synthetic */ zzfhh zzc;
    final /* synthetic */ zzdky zzd;
    final /* synthetic */ zzezo zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzezn(zzezo zzezoVar, zzemw zzemwVar, zzfhs zzfhsVar, zzfhh zzfhhVar, zzdky zzdkyVar) {
        this.zze = zzezoVar;
        this.zza = zzemwVar;
        this.zzb = zzfhsVar;
        this.zzc = zzfhhVar;
        this.zzd = zzdkyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfuy
    public final void zza(Throwable th) {
        zzfhu zzfhuVar;
        zzfhs zzfhsVar;
        Executor executor;
        Executor executor2;
        final com.google.android.gms.ads.internal.client.zze zza = this.zzd.zza().zza(th);
        synchronized (this.zze) {
            this.zze.zzi = null;
            this.zzd.zzb().zza(zza);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzgR)).booleanValue()) {
                executor = this.zze.zzb;
                executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzezl
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzemh zzemhVar;
                        zzezn zzeznVar = zzezn.this;
                        com.google.android.gms.ads.internal.client.zze zzeVar = zza;
                        zzemhVar = zzeznVar.zze.zzd;
                        zzemhVar.zza(zzeVar);
                    }
                });
                executor2 = this.zze.zzb;
                executor2.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzezm
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzfao zzfaoVar;
                        zzezn zzeznVar = zzezn.this;
                        com.google.android.gms.ads.internal.client.zze zzeVar = zza;
                        zzfaoVar = zzeznVar.zze.zze;
                        zzfaoVar.zza(zzeVar);
                    }
                });
            }
            zzfcx.zzb(zza.zza, th, "InterstitialAdLoader.onFailure");
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
        zzfhu zzfhuVar;
        zzfhs zzfhsVar;
        Executor executor;
        Executor executor2;
        zzemh zzemhVar;
        zzfao zzfaoVar;
        zzdjz zzdjzVar = (zzdjz) obj;
        synchronized (this.zze) {
            this.zze.zzi = null;
            zzbhr zzbhrVar = zzbhz.zzgR;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhrVar)).booleanValue()) {
                zzdfx zzn = zzdjzVar.zzn();
                zzemhVar = this.zze.zzd;
                zzn.zza(zzemhVar);
                zzfaoVar = this.zze.zze;
                zzn.zzd(zzfaoVar);
            }
            this.zza.zzb(zzdjzVar);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhrVar)).booleanValue()) {
                executor = this.zze.zzb;
                executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzezj
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzemh zzemhVar2;
                        zzemhVar2 = zzezn.this.zze.zzd;
                        zzemhVar2.zzn();
                    }
                });
                executor2 = this.zze.zzb;
                executor2.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzezk
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzfao zzfaoVar2;
                        zzfaoVar2 = zzezn.this.zze.zze;
                        zzfaoVar2.zzn();
                    }
                });
            }
            if (((Boolean) zzbji.zzc.zze()).booleanValue() && (zzfhsVar = this.zzb) != null) {
                zzfhsVar.zzf(zzdjzVar.zzp().zzb);
                zzfhsVar.zze(zzdjzVar.zzl().zzg());
                zzfhh zzfhhVar = this.zzc;
                zzfhhVar.zze(true);
                zzfhsVar.zza(zzfhhVar);
                zzfhsVar.zzg();
            } else {
                zzfhuVar = this.zze.zzg;
                zzfhh zzfhhVar2 = this.zzc;
                zzfhhVar2.zzb(zzdjzVar.zzp().zzb);
                zzfhhVar2.zzc(zzdjzVar.zzl().zzg());
                zzfhhVar2.zze(true);
                zzfhuVar.zzb(zzfhhVar2.zzj());
            }
        }
    }
}
