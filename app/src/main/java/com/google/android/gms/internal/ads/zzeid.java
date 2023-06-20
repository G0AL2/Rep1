package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzeid implements zzefl {
    private final Context zza;
    private final zzdlu zzb;
    private zzbup zzc;
    private final zzcfo zzd;

    public zzeid(Context context, zzdlu zzdluVar, zzcfo zzcfoVar) {
        this.zza = context;
        this.zzb = zzdluVar;
        this.zzd = zzcfoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzefl
    public final /* bridge */ /* synthetic */ Object zza(zzfbx zzfbxVar, zzfbl zzfblVar, zzefg zzefgVar) throws zzfci, zzeit {
        if (zzfbxVar.zza.zza.zzg.contains(Integer.toString(6))) {
            zzdnh zzs = zzdnh.zzs(this.zzc);
            if (zzfbxVar.zza.zza.zzg.contains(Integer.toString(zzs.zzc()))) {
                zzdnj zze = this.zzb.zze(new zzcym(zzfbxVar, zzfblVar, zzefgVar.zza), new zzdnt(zzs), new zzdph(null, null, this.zzc, null));
                ((zzegz) zzefgVar.zzc).zzc(zze.zzh());
                return zze.zza();
            }
            throw new zzeit(1, "No corresponding native ad listener");
        }
        throw new zzeit(2, "Unified must be used for RTB.");
    }

    @Override // com.google.android.gms.internal.ads.zzefl
    public final void zzb(zzfbx zzfbxVar, zzfbl zzfblVar, zzefg zzefgVar) throws zzfci {
        try {
            ((zzbvt) zzefgVar.zzb).zzp(zzfblVar.zzaa);
            if (this.zzd.zzc < ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzbt)).intValue()) {
                ((zzbvt) zzefgVar.zzb).zzl(zzfblVar.zzV, zzfblVar.zzw.toString(), zzfbxVar.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzeic(this, zzefgVar, null), (zzbug) zzefgVar.zzc);
            } else {
                ((zzbvt) zzefgVar.zzb).zzm(zzfblVar.zzV, zzfblVar.zzw.toString(), zzfbxVar.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzeic(this, zzefgVar, null), (zzbug) zzefgVar.zzc, zzfbxVar.zza.zza.zzi);
            }
        } catch (RemoteException e10) {
            throw new zzfci(e10);
        }
    }
}
