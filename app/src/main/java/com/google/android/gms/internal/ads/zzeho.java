package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzeho implements zzefl {
    private final Context zza;
    private final zzdky zzb;

    public zzeho(Context context, zzdky zzdkyVar) {
        this.zza = context;
        this.zzb = zzdkyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzefl
    public final /* bridge */ /* synthetic */ Object zza(zzfbx zzfbxVar, zzfbl zzfblVar, zzefg zzefgVar) throws zzfci, zzeit {
        zzehi zzehiVar = new zzehi(zzfblVar, (zzbvt) zzefgVar.zzb, false);
        zzdka zze = this.zzb.zze(new zzcym(zzfbxVar, zzfblVar, zzefgVar.zza), new zzdkd(zzehiVar, null));
        zzehiVar.zzb(zze.zzc());
        ((zzegz) zzefgVar.zzc).zzc(zze.zzh());
        return zze.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzefl
    public final void zzb(zzfbx zzfbxVar, zzfbl zzfblVar, zzefg zzefgVar) throws zzfci {
        try {
            ((zzbvt) zzefgVar.zzb).zzp(zzfblVar.zzaa);
            ((zzbvt) zzefgVar.zzb).zzk(zzfblVar.zzV, zzfblVar.zzw.toString(), zzfbxVar.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzehn(this, zzefgVar, null), (zzbug) zzefgVar.zzc);
        } catch (RemoteException e10) {
            throw new zzfci(e10);
        }
    }
}
