package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.ExecutionException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzego implements zzefl {
    private final Context zza;
    private final zzcws zzb;
    private View zzc;
    private zzbuj zzd;

    public zzego(Context context, zzcws zzcwsVar) {
        this.zza = context;
        this.zzb = zzcwsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzefl
    public final /* bridge */ /* synthetic */ Object zza(zzfbx zzfbxVar, final zzfbl zzfblVar, final zzefg zzefgVar) throws zzfci, zzeit {
        final View view;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzgB)).booleanValue() && zzfblVar.zzai) {
            try {
                view = (View) ObjectWrapper.unwrap(this.zzd.zze());
                boolean zzf = this.zzd.zzf();
                if (view == null) {
                    throw new zzfci(new Exception("BannerRtbAdapterWrapper interscrollerView should not be null"));
                }
                if (zzf) {
                    try {
                        view = (View) zzfvc.zzn(zzfvc.zzi(null), new zzfuj() { // from class: com.google.android.gms.internal.ads.zzegk
                            @Override // com.google.android.gms.internal.ads.zzfuj
                            public final zzfvl zza(Object obj) {
                                return zzego.this.zzc(view, zzfblVar, obj);
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
            view = this.zzc;
        }
        zzcvw zza = this.zzb.zza(new zzcym(zzfbxVar, zzfblVar, zzefgVar.zza), new zzcwc(view, null, new zzcxv() { // from class: com.google.android.gms.internal.ads.zzegl
            @Override // com.google.android.gms.internal.ads.zzcxv
            public final com.google.android.gms.ads.internal.client.zzdk zza() {
                try {
                    return ((zzbvt) zzefg.this.zzb).zze();
                } catch (RemoteException e12) {
                    throw new zzfci(e12);
                }
            }
        }, (zzfbm) zzfblVar.zzv.get(0)));
        zza.zzg().zza(view);
        ((zzegz) zzefgVar.zzc).zzc(zza.zzh());
        return zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzefl
    public final void zzb(zzfbx zzfbxVar, zzfbl zzfblVar, zzefg zzefgVar) throws zzfci {
        try {
            ((zzbvt) zzefgVar.zzb).zzp(zzfblVar.zzaa);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzgB)).booleanValue() && zzfblVar.zzai) {
                ((zzbvt) zzefgVar.zzb).zzj(zzfblVar.zzV, zzfblVar.zzw.toString(), zzfbxVar.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzegn(this, zzefgVar, null), (zzbug) zzefgVar.zzc, zzfbxVar.zza.zza.zze);
            } else {
                ((zzbvt) zzefgVar.zzb).zzi(zzfblVar.zzV, zzfblVar.zzw.toString(), zzfbxVar.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzegn(this, zzefgVar, null), (zzbug) zzefgVar.zzc, zzfbxVar.zza.zza.zze);
            }
        } catch (RemoteException e10) {
            throw new zzfci(e10);
        }
    }

    public final /* synthetic */ zzfvl zzc(View view, zzfbl zzfblVar, Object obj) throws Exception {
        return zzfvc.zzi(zzcxj.zza(this.zza, view, zzfblVar));
    }
}
