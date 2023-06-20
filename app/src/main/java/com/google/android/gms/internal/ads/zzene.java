package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzene implements zzemx {
    private final zzfcb zza;
    private final zzcnf zzb;
    private final Context zzc;
    private final zzemu zzd;
    private final zzfhu zze;
    private zzcyl zzf;

    public zzene(zzcnf zzcnfVar, Context context, zzemu zzemuVar, zzfcb zzfcbVar) {
        this.zzb = zzcnfVar;
        this.zzc = context;
        this.zzd = zzemuVar;
        this.zza = zzfcbVar;
        this.zze = zzcnfVar.zzy();
        zzfcbVar.zzu(zzemuVar.zzd());
    }

    @Override // com.google.android.gms.internal.ads.zzemx
    public final boolean zza() {
        zzcyl zzcylVar = this.zzf;
        return zzcylVar != null && zzcylVar.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzemx
    public final boolean zzb(com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzemv zzemvVar, zzemw zzemwVar) throws RemoteException {
        zzfhs zzfhsVar;
        com.google.android.gms.ads.internal.zzt.zzp();
        if (com.google.android.gms.ads.internal.util.zzs.zzD(this.zzc) && zzlVar.zzs == null) {
            zzcfi.zzg("Failed to load the ad because app ID is missing.");
            this.zzb.zzA().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzemz
                @Override // java.lang.Runnable
                public final void run() {
                    zzene.this.zzf();
                }
            });
            return false;
        } else if (str == null) {
            zzcfi.zzg("Ad unit ID should not be null for NativeAdLoader.");
            this.zzb.zzA().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzena
                @Override // java.lang.Runnable
                public final void run() {
                    zzene.this.zzg();
                }
            });
            return false;
        } else {
            zzfcx.zza(this.zzc, zzlVar.zzf);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzhv)).booleanValue() && zzlVar.zzf) {
                this.zzb.zzk().zzl(true);
            }
            int i10 = ((zzemy) zzemvVar).zza;
            zzfcb zzfcbVar = this.zza;
            zzfcbVar.zzE(zzlVar);
            zzfcbVar.zzz(i10);
            zzfcd zzG = zzfcbVar.zzG();
            zzfhh zzb = zzfhg.zzb(this.zzc, zzfhr.zzf(zzG), 8, zzlVar);
            com.google.android.gms.ads.internal.client.zzbz zzbzVar = zzG.zzn;
            if (zzbzVar != null) {
                this.zzd.zzd().zzi(zzbzVar);
            }
            zzdlt zzh = this.zzb.zzh();
            zzdbd zzdbdVar = new zzdbd();
            zzdbdVar.zzc(this.zzc);
            zzdbdVar.zzf(zzG);
            zzh.zzf(zzdbdVar.zzg());
            zzdhd zzdhdVar = new zzdhd();
            zzdhdVar.zzk(this.zzd.zzd(), this.zzb.zzA());
            zzh.zze(zzdhdVar.zzn());
            zzh.zzd(this.zzd.zzc());
            zzh.zzc(new zzcvs(null));
            zzdlu zzg = zzh.zzg();
            if (((Boolean) zzbji.zzc.zze()).booleanValue()) {
                zzfhs zzf = zzg.zzf();
                zzf.zzh(8);
                zzf.zzb(zzlVar.zzp);
                zzfhsVar = zzf;
            } else {
                zzfhsVar = null;
            }
            this.zzb.zzw().zzc(1);
            zzfvm zzfvmVar = zzcfv.zza;
            zzgrc.zzb(zzfvmVar);
            ScheduledExecutorService zzB = this.zzb.zzB();
            zzcza zza = zzg.zza();
            zzcyl zzcylVar = new zzcyl(zzfvmVar, zzB, zza.zzh(zza.zzi()));
            this.zzf = zzcylVar;
            zzcylVar.zze(new zzend(this, zzemwVar, zzfhsVar, zzb, zzg));
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzf() {
        this.zzd.zza().zza(zzfdc.zzd(4, null, null));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzg() {
        this.zzd.zza().zza(zzfdc.zzd(6, null, null));
    }
}
