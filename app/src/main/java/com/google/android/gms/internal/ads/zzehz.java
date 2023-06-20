package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzehz implements zzefl {
    private final Context zza;
    private final zzdlu zzb;
    private final Executor zzc;

    public zzehz(Context context, zzdlu zzdluVar, Executor executor) {
        this.zza = context;
        this.zzb = zzdluVar;
        this.zzc = executor;
    }

    private static final boolean zzc(zzfbx zzfbxVar, int i10) {
        return zzfbxVar.zza.zza.zzg.contains(Integer.toString(i10));
    }

    @Override // com.google.android.gms.internal.ads.zzefl
    public final /* bridge */ /* synthetic */ Object zza(zzfbx zzfbxVar, zzfbl zzfblVar, zzefg zzefgVar) throws zzfci, zzeit {
        zzdnh zzac;
        zzbul zzB = ((zzfcy) zzefgVar.zzb).zzB();
        zzbum zzC = ((zzfcy) zzefgVar.zzb).zzC();
        zzbup zzd = ((zzfcy) zzefgVar.zzb).zzd();
        if (zzd != null && zzc(zzfbxVar, 6)) {
            zzac = zzdnh.zzs(zzd);
        } else if (zzB != null && zzc(zzfbxVar, 6)) {
            zzac = zzdnh.zzad(zzB);
        } else if (zzB != null && zzc(zzfbxVar, 2)) {
            zzac = zzdnh.zzab(zzB);
        } else if (zzC != null && zzc(zzfbxVar, 6)) {
            zzac = zzdnh.zzae(zzC);
        } else if (zzC != null && zzc(zzfbxVar, 1)) {
            zzac = zzdnh.zzac(zzC);
        } else {
            throw new zzeit(1, "No native ad mappers");
        }
        if (zzfbxVar.zza.zza.zzg.contains(Integer.toString(zzac.zzc()))) {
            zzdnj zze = this.zzb.zze(new zzcym(zzfbxVar, zzfblVar, zzefgVar.zza), new zzdnt(zzac), new zzdph(zzC, zzB, zzd, null));
            ((zzegz) zzefgVar.zzc).zzc(zze.zzi());
            zze.zzd().zzj(new zzctj((zzfcy) zzefgVar.zzb), this.zzc);
            return zze.zza();
        }
        throw new zzeit(1, "No corresponding native ad listener");
    }

    @Override // com.google.android.gms.internal.ads.zzefl
    public final void zzb(zzfbx zzfbxVar, zzfbl zzfblVar, zzefg zzefgVar) throws zzfci {
        zzfcd zzfcdVar = zzfbxVar.zza.zza;
        ((zzfcy) zzefgVar.zzb).zzo(this.zza, zzfbxVar.zza.zza.zzd, zzfblVar.zzw.toString(), com.google.android.gms.ads.internal.util.zzbu.zzl(zzfblVar.zzt), (zzbug) zzefgVar.zzc, zzfcdVar.zzi, zzfcdVar.zzg);
    }
}
