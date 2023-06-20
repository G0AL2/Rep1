package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzezo implements zzemx {
    private final Context zza;
    private final Executor zzb;
    private final zzcnf zzc;
    private final zzemh zzd;
    private final zzfao zze;
    private zzbiu zzf;
    private final zzfhu zzg;
    private final zzfcb zzh;
    private zzfvl zzi;

    public zzezo(Context context, Executor executor, zzcnf zzcnfVar, zzemh zzemhVar, zzfao zzfaoVar, zzfcb zzfcbVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzcnfVar;
        this.zzd = zzemhVar;
        this.zzh = zzfcbVar;
        this.zze = zzfaoVar;
        this.zzg = zzcnfVar.zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzemx
    public final boolean zza() {
        zzfvl zzfvlVar = this.zzi;
        return (zzfvlVar == null || zzfvlVar.isDone()) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzemx
    public final boolean zzb(com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzemv zzemvVar, zzemw zzemwVar) {
        zzdky zzf;
        zzfhs zzfhsVar;
        if (str == null) {
            zzcfi.zzg("Ad unit ID should not be null for interstitial ad.");
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzezi
                @Override // java.lang.Runnable
                public final void run() {
                    zzezo.this.zzh();
                }
            });
            return false;
        } else if (zza()) {
            return false;
        } else {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzhv)).booleanValue() && zzlVar.zzf) {
                this.zzc.zzk().zzl(true);
            }
            com.google.android.gms.ads.internal.client.zzq zzqVar = ((zzezh) zzemvVar).zza;
            zzfcb zzfcbVar = this.zzh;
            zzfcbVar.zzs(str);
            zzfcbVar.zzr(zzqVar);
            zzfcbVar.zzE(zzlVar);
            zzfcd zzG = zzfcbVar.zzG();
            zzfhh zzb = zzfhg.zzb(this.zza, zzfhr.zzf(zzG), 4, zzlVar);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzgR)).booleanValue()) {
                zzdkx zzg = this.zzc.zzg();
                zzdbd zzdbdVar = new zzdbd();
                zzdbdVar.zzc(this.zza);
                zzdbdVar.zzf(zzG);
                zzg.zze(zzdbdVar.zzg());
                zzdhd zzdhdVar = new zzdhd();
                zzdhdVar.zzj(this.zzd, this.zzb);
                zzdhdVar.zzk(this.zzd, this.zzb);
                zzg.zzd(zzdhdVar.zzn());
                zzg.zzc(new zzekr(this.zzf));
                zzf = zzg.zzf();
            } else {
                zzdhd zzdhdVar2 = new zzdhd();
                zzfao zzfaoVar = this.zze;
                if (zzfaoVar != null) {
                    zzdhdVar2.zze(zzfaoVar, this.zzb);
                    zzdhdVar2.zzf(this.zze, this.zzb);
                    zzdhdVar2.zzb(this.zze, this.zzb);
                }
                zzdkx zzg2 = this.zzc.zzg();
                zzdbd zzdbdVar2 = new zzdbd();
                zzdbdVar2.zzc(this.zza);
                zzdbdVar2.zzf(zzG);
                zzg2.zze(zzdbdVar2.zzg());
                zzdhdVar2.zzj(this.zzd, this.zzb);
                zzdhdVar2.zze(this.zzd, this.zzb);
                zzdhdVar2.zzf(this.zzd, this.zzb);
                zzdhdVar2.zzb(this.zzd, this.zzb);
                zzdhdVar2.zza(this.zzd, this.zzb);
                zzdhdVar2.zzl(this.zzd, this.zzb);
                zzdhdVar2.zzk(this.zzd, this.zzb);
                zzdhdVar2.zzi(this.zzd, this.zzb);
                zzdhdVar2.zzc(this.zzd, this.zzb);
                zzg2.zzd(zzdhdVar2.zzn());
                zzg2.zzc(new zzekr(this.zzf));
                zzf = zzg2.zzf();
            }
            zzdky zzdkyVar = zzf;
            if (((Boolean) zzbji.zzc.zze()).booleanValue()) {
                zzfhs zzf2 = zzdkyVar.zzf();
                zzf2.zzh(4);
                zzf2.zzb(zzlVar.zzp);
                zzfhsVar = zzf2;
            } else {
                zzfhsVar = null;
            }
            zzcza zza = zzdkyVar.zza();
            zzfvl zzh = zza.zzh(zza.zzi());
            this.zzi = zzh;
            zzfvc.zzr(zzh, new zzezn(this, zzemwVar, zzfhsVar, zzb, zzdkyVar), this.zzb);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzh() {
        this.zzd.zza(zzfdc.zzd(6, null, null));
    }

    public final void zzi(zzbiu zzbiuVar) {
        this.zzf = zzbiuVar;
    }
}
