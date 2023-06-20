package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzexv implements zzemx {
    private final Context zza;
    private final Executor zzb;
    private final zzcnf zzc;
    private final zzemh zzd;
    private final zzeml zze;
    private final ViewGroup zzf;
    private zzbiu zzg;
    private final zzdei zzh;
    private final zzfhu zzi;
    private final zzdgo zzj;
    private final zzfcb zzk;
    private zzfvl zzl;

    public zzexv(Context context, Executor executor, com.google.android.gms.ads.internal.client.zzq zzqVar, zzcnf zzcnfVar, zzemh zzemhVar, zzeml zzemlVar, zzfcb zzfcbVar, zzdgo zzdgoVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzcnfVar;
        this.zzd = zzemhVar;
        this.zze = zzemlVar;
        this.zzk = zzfcbVar;
        this.zzh = zzcnfVar.zzf();
        this.zzi = zzcnfVar.zzy();
        this.zzf = new FrameLayout(context);
        this.zzj = zzdgoVar;
        zzfcbVar.zzr(zzqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzemx
    public final boolean zza() {
        zzfvl zzfvlVar = this.zzl;
        return (zzfvlVar == null || zzfvlVar.isDone()) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzemx
    public final boolean zzb(com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzemv zzemvVar, zzemw zzemwVar) throws RemoteException {
        zzcws zzj;
        zzfhs zzfhsVar;
        if (str == null) {
            zzcfi.zzg("Ad unit ID should not be null for banner ad.");
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzexr
                @Override // java.lang.Runnable
                public final void run() {
                    zzexv.this.zzm();
                }
            });
            return false;
        } else if (zza()) {
            return false;
        } else {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzhv)).booleanValue() && zzlVar.zzf) {
                this.zzc.zzk().zzl(true);
            }
            zzfcb zzfcbVar = this.zzk;
            zzfcbVar.zzs(str);
            zzfcbVar.zzE(zzlVar);
            zzfcd zzG = zzfcbVar.zzG();
            zzfhh zzb = zzfhg.zzb(this.zza, zzfhr.zzf(zzG), 3, zzlVar);
            if (((Boolean) zzbju.zzc.zze()).booleanValue() && this.zzk.zzg().zzk) {
                zzemh zzemhVar = this.zzd;
                if (zzemhVar != null) {
                    zzemhVar.zza(zzfdc.zzd(7, null, null));
                }
                return false;
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzgP)).booleanValue()) {
                zzcwr zze = this.zzc.zze();
                zzdbd zzdbdVar = new zzdbd();
                zzdbdVar.zzc(this.zza);
                zzdbdVar.zzf(zzG);
                zze.zzi(zzdbdVar.zzg());
                zzdhd zzdhdVar = new zzdhd();
                zzdhdVar.zzj(this.zzd, this.zzb);
                zzdhdVar.zzk(this.zzd, this.zzb);
                zze.zzf(zzdhdVar.zzn());
                zze.zze(new zzekr(this.zzg));
                zze.zzd(new zzdlp(zzdns.zza, null));
                zze.zzg(new zzcxp(this.zzh, this.zzj));
                zze.zzc(new zzcvs(this.zzf));
                zzj = zze.zzj();
            } else {
                zzcwr zze2 = this.zzc.zze();
                zzdbd zzdbdVar2 = new zzdbd();
                zzdbdVar2.zzc(this.zza);
                zzdbdVar2.zzf(zzG);
                zze2.zzi(zzdbdVar2.zzg());
                zzdhd zzdhdVar2 = new zzdhd();
                zzdhdVar2.zzj(this.zzd, this.zzb);
                zzdhdVar2.zza(this.zzd, this.zzb);
                zzdhdVar2.zza(this.zze, this.zzb);
                zzdhdVar2.zzl(this.zzd, this.zzb);
                zzdhdVar2.zzd(this.zzd, this.zzb);
                zzdhdVar2.zze(this.zzd, this.zzb);
                zzdhdVar2.zzf(this.zzd, this.zzb);
                zzdhdVar2.zzb(this.zzd, this.zzb);
                zzdhdVar2.zzk(this.zzd, this.zzb);
                zzdhdVar2.zzi(this.zzd, this.zzb);
                zze2.zzf(zzdhdVar2.zzn());
                zze2.zze(new zzekr(this.zzg));
                zze2.zzd(new zzdlp(zzdns.zza, null));
                zze2.zzg(new zzcxp(this.zzh, this.zzj));
                zze2.zzc(new zzcvs(this.zzf));
                zzj = zze2.zzj();
            }
            zzcws zzcwsVar = zzj;
            if (((Boolean) zzbji.zzc.zze()).booleanValue()) {
                zzfhs zzj2 = zzcwsVar.zzj();
                zzj2.zzh(3);
                zzj2.zzb(zzlVar.zzp);
                zzfhsVar = zzj2;
            } else {
                zzfhsVar = null;
            }
            zzcza zzd = zzcwsVar.zzd();
            zzfvl zzh = zzd.zzh(zzd.zzi());
            this.zzl = zzh;
            zzfvc.zzr(zzh, new zzexu(this, zzemwVar, zzfhsVar, zzb, zzcwsVar), this.zzb);
            return true;
        }
    }

    public final ViewGroup zzd() {
        return this.zzf;
    }

    public final zzfcb zzi() {
        return this.zzk;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzm() {
        this.zzd.zza(zzfdc.zzd(6, null, null));
    }

    public final void zzn() {
        this.zzh.zzd(this.zzj.zzc());
    }

    public final void zzo(com.google.android.gms.ads.internal.client.zzbc zzbcVar) {
        this.zze.zza(zzbcVar);
    }

    public final void zzp(zzdej zzdejVar) {
        this.zzh.zzj(zzdejVar, this.zzb);
    }

    public final void zzq(zzbiu zzbiuVar) {
        this.zzg = zzbiuVar;
    }

    public final boolean zzr() {
        ViewParent parent = this.zzf.getParent();
        if (parent instanceof View) {
            View view = (View) parent;
            com.google.android.gms.ads.internal.zzt.zzp();
            return com.google.android.gms.ads.internal.util.zzs.zzR(view, view.getContext());
        }
        return false;
    }
}
