package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfay implements zzemx {
    private final Context zza;
    private final Executor zzb;
    private final zzcnf zzc;
    private final zzfao zzd;
    private final zzeza zze;
    private final zzfby zzf;
    private final zzfhu zzg;
    private final zzfcb zzh;
    private zzfvl zzi;

    public zzfay(Context context, Executor executor, zzcnf zzcnfVar, zzeza zzezaVar, zzfao zzfaoVar, zzfcb zzfcbVar, zzfby zzfbyVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzcnfVar;
        this.zze = zzezaVar;
        this.zzd = zzfaoVar;
        this.zzh = zzfcbVar;
        this.zzf = zzfbyVar;
        this.zzg = zzcnfVar.zzy();
    }

    public static /* synthetic */ zzdsx zzc(zzfay zzfayVar, zzeyy zzeyyVar) {
        return zzfayVar.zzk(zzeyyVar);
    }

    public final zzdsx zzk(zzeyy zzeyyVar) {
        zzdsx zzi = this.zzc.zzi();
        zzdbd zzdbdVar = new zzdbd();
        zzdbdVar.zzc(this.zza);
        zzdbdVar.zzf(((zzfax) zzeyyVar).zza);
        zzdbdVar.zze(this.zzf);
        zzi.zzd(zzdbdVar.zzg());
        zzi.zzc(new zzdhd().zzn());
        return zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzemx
    public final boolean zza() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzemx
    public final boolean zzb(com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzemv zzemvVar, zzemw zzemwVar) throws RemoteException {
        zzfhs zzfhsVar;
        zzcas zzcasVar = new zzcas(zzlVar, str);
        if (zzcasVar.zzb == null) {
            zzcfi.zzg("Ad unit ID should not be null for rewarded video ad.");
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfar
                @Override // java.lang.Runnable
                public final void run() {
                    zzfay.this.zzi();
                }
            });
        } else {
            zzfvl zzfvlVar = this.zzi;
            if (zzfvlVar == null || zzfvlVar.isDone()) {
                if (((Boolean) zzbji.zzc.zze()).booleanValue()) {
                    zzeza zzezaVar = this.zze;
                    if (zzezaVar.zzd() != null) {
                        zzfhs zzh = ((zzdsy) zzezaVar.zzd()).zzh();
                        zzh.zzh(5);
                        zzh.zzb(zzcasVar.zza.zzp);
                        zzfhsVar = zzh;
                        zzfcx.zza(this.zza, zzcasVar.zza.zzf);
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzhv)).booleanValue() && zzcasVar.zza.zzf) {
                            this.zzc.zzk().zzl(true);
                        }
                        zzfcb zzfcbVar = this.zzh;
                        zzfcbVar.zzs(zzcasVar.zzb);
                        zzfcbVar.zzr(com.google.android.gms.ads.internal.client.zzq.zzd());
                        zzfcbVar.zzE(zzcasVar.zza);
                        zzfcd zzG = zzfcbVar.zzG();
                        zzfhh zzb = zzfhg.zzb(this.zza, zzfhr.zzf(zzG), 5, zzcasVar.zza);
                        zzfax zzfaxVar = new zzfax(null);
                        zzfaxVar.zza = zzG;
                        zzfaxVar.zzb = null;
                        zzfvl zzc = this.zze.zzc(new zzezb(zzfaxVar, null), new zzeyz() { // from class: com.google.android.gms.internal.ads.zzfas
                            @Override // com.google.android.gms.internal.ads.zzeyz
                            public final zzdbb zza(zzeyy zzeyyVar) {
                                return zzfay.zzc(zzfay.this, zzeyyVar);
                            }
                        }, null);
                        this.zzi = zzc;
                        zzfvc.zzr(zzc, new zzfav(this, zzemwVar, zzfhsVar, zzb, zzfaxVar), this.zzb);
                        return true;
                    }
                }
                zzfhsVar = null;
                zzfcx.zza(this.zza, zzcasVar.zza.zzf);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzhv)).booleanValue()) {
                    this.zzc.zzk().zzl(true);
                }
                zzfcb zzfcbVar2 = this.zzh;
                zzfcbVar2.zzs(zzcasVar.zzb);
                zzfcbVar2.zzr(com.google.android.gms.ads.internal.client.zzq.zzd());
                zzfcbVar2.zzE(zzcasVar.zza);
                zzfcd zzG2 = zzfcbVar2.zzG();
                zzfhh zzb2 = zzfhg.zzb(this.zza, zzfhr.zzf(zzG2), 5, zzcasVar.zza);
                zzfax zzfaxVar2 = new zzfax(null);
                zzfaxVar2.zza = zzG2;
                zzfaxVar2.zzb = null;
                zzfvl zzc2 = this.zze.zzc(new zzezb(zzfaxVar2, null), new zzeyz() { // from class: com.google.android.gms.internal.ads.zzfas
                    @Override // com.google.android.gms.internal.ads.zzeyz
                    public final zzdbb zza(zzeyy zzeyyVar) {
                        return zzfay.zzc(zzfay.this, zzeyyVar);
                    }
                }, null);
                this.zzi = zzc2;
                zzfvc.zzr(zzc2, new zzfav(this, zzemwVar, zzfhsVar, zzb2, zzfaxVar2), this.zzb);
                return true;
            }
        }
        return false;
    }

    public final /* synthetic */ void zzi() {
        this.zzd.zza(zzfdc.zzd(6, null, null));
    }

    public final void zzj(int i10) {
        this.zzh.zzo().zza(i10);
    }
}
