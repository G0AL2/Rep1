package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzeiy implements zzefl {
    private final Context zza;
    private final Executor zzb;
    private final zzdsy zzc;

    public zzeiy(Context context, Executor executor, zzdsy zzdsyVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzdsyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzefl
    public final /* bridge */ /* synthetic */ Object zza(zzfbx zzfbxVar, zzfbl zzfblVar, final zzefg zzefgVar) throws zzfci, zzeit {
        zzdsu zze = this.zzc.zze(new zzcym(zzfbxVar, zzfblVar, zzefgVar.zza), new zzdsv(new zzdlg() { // from class: com.google.android.gms.internal.ads.zzeix
            @Override // com.google.android.gms.internal.ads.zzdlg
            public final void zza(boolean z10, Context context, zzdcg zzdcgVar) {
                zzefg zzefgVar2 = zzefg.this;
                try {
                    ((zzfcy) zzefgVar2.zzb).zzu(z10);
                    ((zzfcy) zzefgVar2.zzb).zzx(context);
                } catch (zzfci e10) {
                    throw new zzdlf(e10.getCause());
                }
            }
        }));
        zze.zzd().zzj(new zzctj((zzfcy) zzefgVar.zzb), this.zzb);
        ((zzegz) zzefgVar.zzc).zzc(zze.zzm());
        return zze.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzefl
    public final void zzb(zzfbx zzfbxVar, zzfbl zzfblVar, zzefg zzefgVar) throws zzfci {
        try {
            zzfcd zzfcdVar = zzfbxVar.zza.zza;
            if (zzfcdVar.zzo.zza == 3) {
                ((zzfcy) zzefgVar.zzb).zzq(this.zza, zzfcdVar.zzd, zzfblVar.zzw.toString(), (zzbug) zzefgVar.zzc);
            } else {
                ((zzfcy) zzefgVar.zzb).zzp(this.zza, zzfcdVar.zzd, zzfblVar.zzw.toString(), (zzbug) zzefgVar.zzc);
            }
        } catch (Exception e10) {
            zzcfi.zzk("Fail to load ad from adapter ".concat(String.valueOf(zzefgVar.zza)), e10);
        }
    }
}
