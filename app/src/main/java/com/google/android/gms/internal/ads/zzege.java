package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzege implements zzefd {
    private final zzcws zza;
    private final Context zzb;
    private final zzdtp zzc;
    private final zzfcd zzd;
    private final Executor zze;
    private final zzfok zzf;

    public zzege(zzcws zzcwsVar, Context context, Executor executor, zzdtp zzdtpVar, zzfcd zzfcdVar, zzfok zzfokVar) {
        this.zzb = context;
        this.zza = zzcwsVar;
        this.zze = executor;
        this.zzc = zzdtpVar;
        this.zzd = zzfcdVar;
        this.zzf = zzfokVar;
    }

    @Override // com.google.android.gms.internal.ads.zzefd
    public final zzfvl zza(final zzfbx zzfbxVar, final zzfbl zzfblVar) {
        return zzfvc.zzn(zzfvc.zzi(null), new zzfuj() { // from class: com.google.android.gms.internal.ads.zzefy
            @Override // com.google.android.gms.internal.ads.zzfuj
            public final zzfvl zza(Object obj) {
                return zzege.this.zzc(zzfbxVar, zzfblVar, obj);
            }
        }, this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzefd
    public final boolean zzb(zzfbx zzfbxVar, zzfbl zzfblVar) {
        zzfbq zzfbqVar = zzfblVar.zzt;
        return (zzfbqVar == null || zzfbqVar.zza == null) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzfvl zzc(zzfbx zzfbxVar, zzfbl zzfblVar, Object obj) throws Exception {
        View zzdtsVar;
        com.google.android.gms.ads.internal.client.zzq zza = zzfch.zza(this.zzb, zzfblVar.zzv);
        final zzcli zza2 = this.zzc.zza(zza, zzfblVar, zzfbxVar.zzb.zzb);
        zza2.zzab(zzfblVar.zzX);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzgB)).booleanValue() && zzfblVar.zzai) {
            zzdtsVar = zzcxj.zza(this.zzb, (View) zza2, zzfblVar);
        } else {
            zzdtsVar = new zzdts(this.zzb, (View) zza2, (com.google.android.gms.ads.internal.util.zzas) this.zzf.apply(zzfblVar));
        }
        final zzcvw zza3 = this.zza.zza(new zzcym(zzfbxVar, zzfblVar, null), new zzcwc(zzdtsVar, zza2, new zzcxv() { // from class: com.google.android.gms.internal.ads.zzefz
            @Override // com.google.android.gms.internal.ads.zzcxv
            public final com.google.android.gms.ads.internal.client.zzdk zza() {
                return zzcli.this.zzs();
            }
        }, zzfch.zzc(zza)));
        zza3.zzj().zzi(zza2, false, null);
        zzdcl zzc = zza3.zzc();
        zzdcn zzdcnVar = new zzdcn() { // from class: com.google.android.gms.internal.ads.zzega
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
        zza3.zzj();
        zzfbq zzfbqVar = zzfblVar.zzt;
        zzfvl zzj = zzdto.zzj(zza2, zzfbqVar.zzb, zzfbqVar.zza);
        if (zzfblVar.zzN) {
            zzj.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.zzegb
                @Override // java.lang.Runnable
                public final void run() {
                    zzcli.this.zzag();
                }
            }, this.zze);
        }
        zzj.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.zzegc
            @Override // java.lang.Runnable
            public final void run() {
                zzege.this.zzd(zza2);
            }
        }, this.zze);
        return zzfvc.zzm(zzj, new zzfok() { // from class: com.google.android.gms.internal.ads.zzegd
            @Override // com.google.android.gms.internal.ads.zzfok
            public final Object apply(Object obj2) {
                return zzcvw.this.zza();
            }
        }, zzfvmVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzd(zzcli zzcliVar) {
        zzcliVar.zzaa();
        zzcme zzs = zzcliVar.zzs();
        com.google.android.gms.ads.internal.client.zzff zzffVar = this.zzd.zza;
        if (zzffVar == null || zzs == null) {
            return;
        }
        zzs.zzs(zzffVar);
    }
}
