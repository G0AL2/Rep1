package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzehk implements zzefl {
    private final Context zza;
    private final zzdky zzb;
    private final zzcfo zzc;
    private final Executor zzd;

    public zzehk(Context context, zzcfo zzcfoVar, zzdky zzdkyVar, Executor executor) {
        this.zza = context;
        this.zzc = zzcfoVar;
        this.zzb = zzdkyVar;
        this.zzd = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzefl
    public final /* bridge */ /* synthetic */ Object zza(zzfbx zzfbxVar, zzfbl zzfblVar, final zzefg zzefgVar) throws zzfci, zzeit {
        zzdka zze = this.zzb.zze(new zzcym(zzfbxVar, zzfblVar, zzefgVar.zza), new zzdkd(new zzdlg() { // from class: com.google.android.gms.internal.ads.zzehj
            @Override // com.google.android.gms.internal.ads.zzdlg
            public final void zza(boolean z10, Context context, zzdcg zzdcgVar) {
                zzehk.this.zzc(zzefgVar, z10, context, zzdcgVar);
            }
        }, null));
        zze.zzd().zzj(new zzctj((zzfcy) zzefgVar.zzb), this.zzd);
        ((zzegz) zzefgVar.zzc).zzc(zze.zzi());
        return zze.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzefl
    public final void zzb(zzfbx zzfbxVar, zzfbl zzfblVar, zzefg zzefgVar) throws zzfci {
        ((zzfcy) zzefgVar.zzb).zzn(this.zza, zzfbxVar.zza.zza.zzd, zzfblVar.zzw.toString(), com.google.android.gms.ads.internal.util.zzbu.zzl(zzfblVar.zzt), (zzbug) zzefgVar.zzc);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzc(zzefg zzefgVar, boolean z10, Context context, zzdcg zzdcgVar) throws zzdlf {
        try {
            ((zzfcy) zzefgVar.zzb).zzu(z10);
            if (this.zzc.zzc < ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzaB)).intValue()) {
                ((zzfcy) zzefgVar.zzb).zzv();
            } else {
                ((zzfcy) zzefgVar.zzb).zzw(context);
            }
        } catch (zzfci e10) {
            zzcfi.zzi("Cannot show interstitial.");
            throw new zzdlf(e10.getCause());
        }
    }
}
