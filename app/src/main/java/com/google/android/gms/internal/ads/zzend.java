package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzend implements zzfuy {
    final /* synthetic */ zzemw zza;
    final /* synthetic */ zzfhs zzb;
    final /* synthetic */ zzfhh zzc;
    final /* synthetic */ zzdlu zzd;
    final /* synthetic */ zzene zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzend(zzene zzeneVar, zzemw zzemwVar, zzfhs zzfhsVar, zzfhh zzfhhVar, zzdlu zzdluVar) {
        this.zze = zzeneVar;
        this.zza = zzemwVar;
        this.zzb = zzfhsVar;
        this.zzc = zzfhhVar;
        this.zzd = zzdluVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfuy
    public final void zza(Throwable th) {
        zzcnf zzcnfVar;
        zzfhu zzfhuVar;
        zzfhs zzfhsVar;
        final com.google.android.gms.ads.internal.client.zze zza = this.zzd.zza().zza(th);
        this.zzd.zzb().zza(zza);
        zzcnfVar = this.zze.zzb;
        zzcnfVar.zzA().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzenc
            @Override // java.lang.Runnable
            public final void run() {
                zzemu zzemuVar;
                zzend zzendVar = zzend.this;
                com.google.android.gms.ads.internal.client.zze zzeVar = zza;
                zzemuVar = zzendVar.zze.zzd;
                zzemuVar.zza().zza(zzeVar);
            }
        });
        zzfcx.zzb(zza.zza, th, "NativeAdLoader.onFailure");
        this.zza.zza();
        if (((Boolean) zzbji.zzc.zze()).booleanValue() && (zzfhsVar = this.zzb) != null) {
            zzfhsVar.zzc(zza);
            zzfhh zzfhhVar = this.zzc;
            zzfhhVar.zze(false);
            zzfhsVar.zza(zzfhhVar);
            zzfhsVar.zzg();
            return;
        }
        zzfhuVar = this.zze.zze;
        zzfhh zzfhhVar2 = this.zzc;
        zzfhhVar2.zza(zza);
        zzfhhVar2.zze(false);
        zzfhuVar.zzb(zzfhhVar2.zzj());
    }

    @Override // com.google.android.gms.internal.ads.zzfuy
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzemu zzemuVar;
        zzcnf zzcnfVar;
        zzfhu zzfhuVar;
        zzfhs zzfhsVar;
        zzcxx zzcxxVar = (zzcxx) obj;
        synchronized (this.zze) {
            zzdfx zzn = zzcxxVar.zzn();
            zzemuVar = this.zze.zzd;
            zzn.zza(zzemuVar.zzd());
            this.zza.zzb(zzcxxVar);
            zzcnfVar = this.zze.zzb;
            zzcnfVar.zzA().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzenb
                @Override // java.lang.Runnable
                public final void run() {
                    zzemu zzemuVar2;
                    zzemuVar2 = zzend.this.zze.zzd;
                    zzemuVar2.zzb().zzn();
                }
            });
            if (((Boolean) zzbji.zzc.zze()).booleanValue() && (zzfhsVar = this.zzb) != null) {
                zzfhsVar.zzf(zzcxxVar.zzp().zzb);
                zzfhsVar.zze(zzcxxVar.zzl().zzg());
                zzfhh zzfhhVar = this.zzc;
                zzfhhVar.zze(true);
                zzfhsVar.zza(zzfhhVar);
                zzfhsVar.zzg();
            } else {
                zzfhuVar = this.zze.zze;
                zzfhh zzfhhVar2 = this.zzc;
                zzfhhVar2.zzb(zzcxxVar.zzp().zzb);
                zzfhhVar2.zzc(zzcxxVar.zzl().zzg());
                zzfhhVar2.zze(true);
                zzfhuVar.zzb(zzfhhVar2.zzj());
            }
        }
    }
}
