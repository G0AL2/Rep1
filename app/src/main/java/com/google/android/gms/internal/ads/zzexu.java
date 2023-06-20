package com.google.android.gms.internal.ads;

import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzexu implements zzfuy {
    final /* synthetic */ zzemw zza;
    final /* synthetic */ zzfhs zzb;
    final /* synthetic */ zzfhh zzc;
    final /* synthetic */ zzcws zzd;
    final /* synthetic */ zzexv zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzexu(zzexv zzexvVar, zzemw zzemwVar, zzfhs zzfhsVar, zzfhh zzfhhVar, zzcws zzcwsVar) {
        this.zze = zzexvVar;
        this.zza = zzemwVar;
        this.zzb = zzfhsVar;
        this.zzc = zzfhhVar;
        this.zzd = zzcwsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfuy
    public final void zza(Throwable th) {
        zzdei zzdeiVar;
        zzdgo zzdgoVar;
        zzfhu zzfhuVar;
        zzfhs zzfhsVar;
        Executor executor;
        final com.google.android.gms.ads.internal.client.zze zza = this.zzd.zzd().zza(th);
        synchronized (this.zze) {
            this.zze.zzl = null;
            this.zzd.zzf().zza(zza);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzgP)).booleanValue()) {
                executor = this.zze.zzb;
                executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzext
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzemh zzemhVar;
                        zzexu zzexuVar = zzexu.this;
                        com.google.android.gms.ads.internal.client.zze zzeVar = zza;
                        zzemhVar = zzexuVar.zze.zzd;
                        zzemhVar.zza(zzeVar);
                    }
                });
            }
            zzexv zzexvVar = this.zze;
            zzdeiVar = zzexvVar.zzh;
            zzdgoVar = zzexvVar.zzj;
            zzdeiVar.zzd(zzdgoVar.zzc());
            zzfcx.zzb(zza.zza, th, "BannerAdLoader.onFailure");
            this.zza.zza();
            if (((Boolean) zzbji.zzc.zze()).booleanValue() && (zzfhsVar = this.zzb) != null) {
                zzfhsVar.zzc(zza);
                zzfhh zzfhhVar = this.zzc;
                zzfhhVar.zze(false);
                zzfhsVar.zza(zzfhhVar);
                zzfhsVar.zzg();
            } else {
                zzfhuVar = this.zze.zzi;
                zzfhh zzfhhVar2 = this.zzc;
                zzfhhVar2.zza(zza);
                zzfhhVar2.zze(false);
                zzfhuVar.zzb(zzfhhVar2.zzj());
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfuy
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        zzdei zzdeiVar;
        zzfhu zzfhuVar;
        zzfhs zzfhsVar;
        Executor executor;
        final zzemh zzemhVar;
        zzemh zzemhVar2;
        zzeml zzemlVar;
        zzcvv zzcvvVar = (zzcvv) obj;
        synchronized (this.zze) {
            this.zze.zzl = null;
            viewGroup = this.zze.zzf;
            viewGroup.removeAllViews();
            if (zzcvvVar.zzc() != null) {
                ViewParent parent = zzcvvVar.zzc().getParent();
                if (parent instanceof ViewGroup) {
                    String zzg = zzcvvVar.zzl() != null ? zzcvvVar.zzl().zzg() : "";
                    zzcfi.zzj("Banner view provided from " + zzg + " already has a parent view. Removing its old parent.");
                    ((ViewGroup) parent).removeView(zzcvvVar.zzc());
                }
            }
            zzbhr zzbhrVar = zzbhz.zzgP;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhrVar)).booleanValue()) {
                zzdfx zzn = zzcvvVar.zzn();
                zzemhVar2 = this.zze.zzd;
                zzn.zza(zzemhVar2);
                zzemlVar = this.zze.zze;
                zzn.zzc(zzemlVar);
            }
            viewGroup2 = this.zze.zzf;
            viewGroup2.addView(zzcvvVar.zzc());
            this.zza.zzb(zzcvvVar);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhrVar)).booleanValue()) {
                zzexv zzexvVar = this.zze;
                executor = zzexvVar.zzb;
                zzemhVar = zzexvVar.zzd;
                zzemhVar.getClass();
                executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzexs
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzemh.this.zzn();
                    }
                });
            }
            zzdeiVar = this.zze.zzh;
            zzdeiVar.zzd(zzcvvVar.zza());
            if (((Boolean) zzbji.zzc.zze()).booleanValue() && (zzfhsVar = this.zzb) != null) {
                zzfhsVar.zzf(zzcvvVar.zzp().zzb);
                zzfhsVar.zze(zzcvvVar.zzl().zzg());
                zzfhh zzfhhVar = this.zzc;
                zzfhhVar.zze(true);
                zzfhsVar.zza(zzfhhVar);
                zzfhsVar.zzg();
            } else {
                zzfhuVar = this.zze.zzi;
                zzfhh zzfhhVar2 = this.zzc;
                zzfhhVar2.zzb(zzcvvVar.zzp().zzb);
                zzfhhVar2.zzc(zzcvvVar.zzl().zzg());
                zzfhhVar2.zze(true);
                zzfhuVar.zzb(zzfhhVar2.zzj());
            }
        }
    }
}
