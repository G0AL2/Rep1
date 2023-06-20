package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzeju implements zzefl {
    private final Context zza;
    private final Executor zzb;
    private final zzdsy zzc;

    public zzeju(Context context, Executor executor, zzdsy zzdsyVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzdsyVar;
    }

    public static /* bridge */ /* synthetic */ Executor zzc(zzeju zzejuVar) {
        return zzejuVar.zzb;
    }

    public static final void zze(zzfbx zzfbxVar, zzfbl zzfblVar, zzefg zzefgVar) {
        try {
            ((zzfcy) zzefgVar.zzb).zzk(zzfbxVar.zza.zza.zzd, zzfblVar.zzw.toString());
        } catch (Exception e10) {
            zzcfi.zzk("Fail to load ad from adapter ".concat(String.valueOf(zzefgVar.zza)), e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzefl
    public final /* bridge */ /* synthetic */ Object zza(zzfbx zzfbxVar, zzfbl zzfblVar, final zzefg zzefgVar) throws zzfci, zzeit {
        zzdsu zze = this.zzc.zze(new zzcym(zzfbxVar, zzfblVar, zzefgVar.zza), new zzdsv(new zzdlg() { // from class: com.google.android.gms.internal.ads.zzejq
            @Override // com.google.android.gms.internal.ads.zzdlg
            public final void zza(boolean z10, Context context, zzdcg zzdcgVar) {
                zzefg zzefgVar2 = zzefg.this;
                try {
                    ((zzfcy) zzefgVar2.zzb).zzu(z10);
                    ((zzfcy) zzefgVar2.zzb).zzy();
                } catch (zzfci e10) {
                    zzcfi.zzk("Cannot show rewarded video.", e10);
                    throw new zzdlf(e10.getCause());
                }
            }
        }));
        zze.zzd().zzj(new zzctj((zzfcy) zzefgVar.zzb), this.zzb);
        zzdda zze2 = zze.zze();
        zzdbr zzb = zze.zzb();
        ((zzeha) zzefgVar.zzc).zzc(new zzejt(this, zze.zza(), zzb, zze2, zze.zzg()));
        return zze.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzefl
    public final void zzb(zzfbx zzfbxVar, zzfbl zzfblVar, zzefg zzefgVar) throws zzfci {
        if (!((zzfcy) zzefgVar.zzb).zzA()) {
            ((zzeha) zzefgVar.zzc).zzd(new zzejs(this, zzfbxVar, zzfblVar, zzefgVar));
            ((zzfcy) zzefgVar.zzb).zzh(this.zza, zzfbxVar.zza.zza.zzd, null, (zzcaw) zzefgVar.zzc, zzfblVar.zzw.toString());
            return;
        }
        zze(zzfbxVar, zzfblVar, zzefgVar);
    }
}
