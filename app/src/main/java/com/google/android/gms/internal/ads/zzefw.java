package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzefw implements zzefd {
    private final zzcuy zza;
    private final Context zzb;
    private final zzdtp zzc;
    private final Executor zzd;

    public zzefw(zzcuy zzcuyVar, Context context, Executor executor, zzdtp zzdtpVar) {
        this.zzb = context;
        this.zza = zzcuyVar;
        this.zzd = executor;
        this.zzc = zzdtpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzefd
    public final zzfvl zza(final zzfbx zzfbxVar, final zzfbl zzfblVar) {
        return zzfvc.zzn(zzfvc.zzi(null), new zzfuj() { // from class: com.google.android.gms.internal.ads.zzeft
            @Override // com.google.android.gms.internal.ads.zzfuj
            public final zzfvl zza(Object obj) {
                return zzefw.this.zzc(zzfbxVar, zzfblVar, obj);
            }
        }, this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzefd
    public final boolean zzb(zzfbx zzfbxVar, zzfbl zzfblVar) {
        zzfbq zzfbqVar = zzfblVar.zzt;
        return (zzfbqVar == null || zzfbqVar.zza == null) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzfvl zzc(zzfbx zzfbxVar, zzfbl zzfblVar, Object obj) throws Exception {
        com.google.android.gms.ads.internal.client.zzq zza = zzfch.zza(this.zzb, zzfblVar.zzv);
        final zzcli zza2 = this.zzc.zza(zza, zzfblVar, zzfbxVar.zzb.zzb);
        final zzcuq zza3 = this.zza.zza(new zzcym(zzfbxVar, zzfblVar, null), new zzcur((View) zza2, zza2, zzfch.zzc(zza), zzfblVar.zzab, zzfblVar.zzaf, zzfblVar.zzP));
        zza3.zzg().zzi(zza2, false, null);
        zzdcl zzc = zza3.zzc();
        zzdcn zzdcnVar = new zzdcn() { // from class: com.google.android.gms.internal.ads.zzefu
            @Override // com.google.android.gms.internal.ads.zzdcn
            public final void zzl() {
                zzcli zzcliVar = zzcli.this;
                if (zzcliVar.zzP() != null) {
                    zzcliVar.zzP().zzp();
                }
            }
        };
        zzfvm zzfvmVar = zzcfv.zzf;
        zzc.zzj(zzdcnVar, zzfvmVar);
        zza3.zzg();
        zzfbq zzfbqVar = zzfblVar.zzt;
        return zzfvc.zzm(zzdto.zzj(zza2, zzfbqVar.zzb, zzfbqVar.zza), new zzfok() { // from class: com.google.android.gms.internal.ads.zzefv
            @Override // com.google.android.gms.internal.ads.zzfok
            public final Object apply(Object obj2) {
                return zzcuq.this.zza();
            }
        }, zzfvmVar);
    }
}
