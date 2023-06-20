package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzegi implements zzefl {
    private final Context zza;
    private final zzcws zzb;
    private final Executor zzc;

    public zzegi(Context context, zzcws zzcwsVar, Executor executor) {
        this.zza = context;
        this.zzb = zzcwsVar;
        this.zzc = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzefl
    public final /* bridge */ /* synthetic */ Object zza(zzfbx zzfbxVar, final zzfbl zzfblVar, zzefg zzefgVar) throws zzfci, zzeit {
        final View zza;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzgB)).booleanValue() && zzfblVar.zzai) {
            zzbuj zzc = ((zzfcy) zzefgVar.zzb).zzc();
            if (zzc != null) {
                try {
                    zza = (View) ObjectWrapper.unwrap(zzc.zze());
                    boolean zzf = zzc.zzf();
                    if (zza == null) {
                        throw new zzfci(new Exception("BannerAdapterWrapper interscrollerView should not be null"));
                    }
                    if (zzf) {
                        try {
                            zza = (View) zzfvc.zzn(zzfvc.zzi(null), new zzfuj() { // from class: com.google.android.gms.internal.ads.zzegh
                                @Override // com.google.android.gms.internal.ads.zzfuj
                                public final zzfvl zza(Object obj) {
                                    return zzegi.this.zzc(zza, zzfblVar, obj);
                                }
                            }, zzcfv.zze).get();
                        } catch (InterruptedException | ExecutionException e10) {
                            throw new zzfci(e10);
                        }
                    }
                } catch (RemoteException e11) {
                    throw new zzfci(e11);
                }
            } else {
                zzcfi.zzg("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad.");
                throw new zzfci(new Exception("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad."));
            }
        } else {
            zza = ((zzfcy) zzefgVar.zzb).zza();
        }
        zzcws zzcwsVar = this.zzb;
        zzcym zzcymVar = new zzcym(zzfbxVar, zzfblVar, zzefgVar.zza);
        final zzfcy zzfcyVar = (zzfcy) zzefgVar.zzb;
        zzcvw zza2 = zzcwsVar.zza(zzcymVar, new zzcwc(zza, null, new zzcxv() { // from class: com.google.android.gms.internal.ads.zzegg
            @Override // com.google.android.gms.internal.ads.zzcxv
            public final com.google.android.gms.ads.internal.client.zzdk zza() {
                return zzfcy.this.zzb();
            }
        }, (zzfbm) zzfblVar.zzv.get(0)));
        zza2.zzg().zza(zza);
        zza2.zzd().zzj(new zzctj((zzfcy) zzefgVar.zzb), this.zzc);
        ((zzegz) zzefgVar.zzc).zzc(zza2.zzi());
        return zza2.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzefl
    public final void zzb(zzfbx zzfbxVar, zzfbl zzfblVar, zzefg zzefgVar) throws zzfci {
        com.google.android.gms.ads.internal.client.zzq zza;
        com.google.android.gms.ads.internal.client.zzq zzqVar = zzfbxVar.zza.zza.zze;
        if (zzqVar.zzn) {
            zza = new com.google.android.gms.ads.internal.client.zzq(this.zza, com.google.android.gms.ads.zzb.zzd(zzqVar.zze, zzqVar.zzb));
        } else {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzgB)).booleanValue() && zzfblVar.zzai) {
                zza = new com.google.android.gms.ads.internal.client.zzq(this.zza, com.google.android.gms.ads.zzb.zze(zzqVar.zze, zzqVar.zzb));
            } else {
                zza = zzfch.zza(this.zza, zzfblVar.zzv);
            }
        }
        com.google.android.gms.ads.internal.client.zzq zzqVar2 = zza;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzgB)).booleanValue() && zzfblVar.zzai) {
            ((zzfcy) zzefgVar.zzb).zzm(this.zza, zzqVar2, zzfbxVar.zza.zza.zzd, zzfblVar.zzw.toString(), com.google.android.gms.ads.internal.util.zzbu.zzl(zzfblVar.zzt), (zzbug) zzefgVar.zzc);
        } else {
            ((zzfcy) zzefgVar.zzb).zzl(this.zza, zzqVar2, zzfbxVar.zza.zza.zzd, zzfblVar.zzw.toString(), com.google.android.gms.ads.internal.util.zzbu.zzl(zzfblVar.zzt), (zzbug) zzefgVar.zzc);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzfvl zzc(View view, zzfbl zzfblVar, Object obj) throws Exception {
        return zzfvc.zzi(zzcxj.zza(this.zza, view, zzfblVar));
    }
}
