package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzewo implements zzfuy {
    final /* synthetic */ zzemw zza;
    final /* synthetic */ zzfhs zzb;
    final /* synthetic */ zzfhh zzc;
    final /* synthetic */ zzewq zzd;
    final /* synthetic */ zzewr zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzewo(zzewr zzewrVar, zzemw zzemwVar, zzfhs zzfhsVar, zzfhh zzfhhVar, zzewq zzewqVar) {
        this.zze = zzewrVar;
        this.zza = zzemwVar;
        this.zzb = zzfhsVar;
        this.zzc = zzfhhVar;
        this.zzd = zzewqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfuy
    public final void zza(Throwable th) {
        zzeza zzezaVar;
        final com.google.android.gms.ads.internal.client.zze zza;
        zzexh zzexhVar;
        zzdbb zzm;
        zzfhu zzfhuVar;
        zzfhs zzfhsVar;
        Executor executor;
        zzezaVar = this.zze.zze;
        zzcvd zzcvdVar = (zzcvd) zzezaVar.zzd();
        if (zzcvdVar == null) {
            zza = zzfdc.zzb(th, null);
        } else {
            zza = zzcvdVar.zzb().zza(th);
        }
        synchronized (this.zze) {
            this.zze.zzj = null;
            if (zzcvdVar != null) {
                zzcvdVar.zzc().zza(zza);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzgQ)).booleanValue()) {
                    executor = this.zze.zzc;
                    executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzewn
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzexh zzexhVar2;
                            zzewo zzewoVar = zzewo.this;
                            com.google.android.gms.ads.internal.client.zze zzeVar = zza;
                            zzexhVar2 = zzewoVar.zze.zzd;
                            zzexhVar2.zza(zzeVar);
                        }
                    });
                }
            } else {
                zzexhVar = this.zze.zzd;
                zzexhVar.zza(zza);
                zzm = this.zze.zzm(this.zzd);
                ((zzcvd) zzm.zzh()).zzb().zzc().zzd();
            }
            zzfcx.zzb(zza.zza, th, "AppOpenAdLoader.onFailure");
            this.zza.zza();
            if (((Boolean) zzbji.zzc.zze()).booleanValue() && (zzfhsVar = this.zzb) != null) {
                zzfhsVar.zzc(zza);
                zzfhh zzfhhVar = this.zzc;
                zzfhhVar.zze(false);
                zzfhsVar.zza(zzfhhVar);
                zzfhsVar.zzg();
            } else {
                zzfhuVar = this.zze.zzh;
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
        zzexh zzexhVar;
        zzcxx zzcxxVar = (zzcxx) obj;
        synchronized (this.zze) {
            this.zze.zzj = null;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzgQ)).booleanValue()) {
                zzdfx zzn = zzcxxVar.zzn();
                zzexhVar = this.zze.zzd;
                zzn.zzb(zzexhVar);
            }
            this.zza.zzb(zzcxxVar);
            if (((Boolean) zzbji.zzc.zze()).booleanValue() && (zzfhsVar = this.zzb) != null) {
                zzfhsVar.zzf(zzcxxVar.zzp().zzb);
                zzfhsVar.zze(zzcxxVar.zzl().zzg());
                zzfhh zzfhhVar = this.zzc;
                zzfhhVar.zze(true);
                zzfhsVar.zza(zzfhhVar);
                zzfhsVar.zzg();
            } else {
                zzfhuVar = this.zze.zzh;
                zzfhh zzfhhVar2 = this.zzc;
                zzfhhVar2.zzb(zzcxxVar.zzp().zzb);
                zzfhhVar2.zzc(zzcxxVar.zzl().zzg());
                zzfhhVar2.zze(true);
                zzfhuVar.zzb(zzfhhVar2.zzj());
            }
        }
    }
}
