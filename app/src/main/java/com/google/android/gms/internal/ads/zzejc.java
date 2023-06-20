package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzejc implements zzefl {
    private final Context zza;
    private final zzdsy zzb;

    public zzejc(Context context, zzdsy zzdsyVar) {
        this.zza = context;
        this.zzb = zzdsyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzefl
    public final /* bridge */ /* synthetic */ Object zza(zzfbx zzfbxVar, zzfbl zzfblVar, zzefg zzefgVar) throws zzfci, zzeit {
        zzehi zzehiVar = new zzehi(zzfblVar, (zzbvt) zzefgVar.zzb, true);
        zzdsu zze = this.zzb.zze(new zzcym(zzfbxVar, zzfblVar, zzefgVar.zza), new zzdsv(zzehiVar));
        zzehiVar.zzb(zze.zzc());
        ((zzegz) zzefgVar.zzc).zzc(zze.zzn());
        return zze.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzefl
    public final void zzb(zzfbx zzfbxVar, zzfbl zzfblVar, zzefg zzefgVar) throws zzfci {
        try {
            ((zzbvt) zzefgVar.zzb).zzp(zzfblVar.zzaa);
            if (zzfbxVar.zza.zza.zzo.zza == 3) {
                ((zzbvt) zzefgVar.zzb).zzn(zzfblVar.zzV, zzfblVar.zzw.toString(), zzfbxVar.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzejb(this, zzefgVar, null), (zzbug) zzefgVar.zzc);
            } else {
                ((zzbvt) zzefgVar.zzb).zzo(zzfblVar.zzV, zzfblVar.zzw.toString(), zzfbxVar.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzejb(this, zzefgVar, null), (zzbug) zzefgVar.zzc);
            }
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.zze.zzb("Remote exception loading a rewarded RTB ad", e10);
        }
    }
}
