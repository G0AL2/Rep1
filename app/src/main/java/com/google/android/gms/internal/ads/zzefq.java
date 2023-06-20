package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzefq implements zzefd {
    private final zzcvj zza;
    private final Context zzb;
    private final zzdtp zzc;
    private final zzfcd zzd;
    private final Executor zze;
    private final zzcfo zzf;
    private final zzbop zzg;
    private final boolean zzh = ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzhu)).booleanValue();

    public zzefq(zzcvj zzcvjVar, Context context, Executor executor, zzdtp zzdtpVar, zzfcd zzfcdVar, zzcfo zzcfoVar, zzbop zzbopVar) {
        this.zzb = context;
        this.zza = zzcvjVar;
        this.zze = executor;
        this.zzc = zzdtpVar;
        this.zzd = zzfcdVar;
        this.zzf = zzcfoVar;
        this.zzg = zzbopVar;
    }

    @Override // com.google.android.gms.internal.ads.zzefd
    public final zzfvl zza(final zzfbx zzfbxVar, final zzfbl zzfblVar) {
        final zzdtt zzdttVar = new zzdtt();
        zzfvl zzn = zzfvc.zzn(zzfvc.zzi(null), new zzfuj() { // from class: com.google.android.gms.internal.ads.zzefo
            @Override // com.google.android.gms.internal.ads.zzfuj
            public final zzfvl zza(Object obj) {
                return zzefq.this.zzc(zzfblVar, zzfbxVar, zzdttVar, obj);
            }
        }, this.zze);
        zzn.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.zzefp
            @Override // java.lang.Runnable
            public final void run() {
                zzdtt.this.zzb();
            }
        }, this.zze);
        return zzn;
    }

    @Override // com.google.android.gms.internal.ads.zzefd
    public final boolean zzb(zzfbx zzfbxVar, zzfbl zzfblVar) {
        zzfbq zzfbqVar = zzfblVar.zzt;
        return (zzfbqVar == null || zzfbqVar.zza == null) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzfvl zzc(final zzfbl zzfblVar, zzfbx zzfbxVar, zzdtt zzdttVar, Object obj) throws Exception {
        final zzcli zza = this.zzc.zza(this.zzd.zze, zzfblVar, zzfbxVar.zzb.zzb);
        zza.zzab(zzfblVar.zzX);
        zzdttVar.zza(this.zzb, (View) zza);
        zzcga zzcgaVar = new zzcga();
        final zzcvg zza2 = this.zza.zza(new zzcym(zzfbxVar, zzfblVar, null), new zzdkd(new zzefs(this.zzf, zzcgaVar, zzfblVar, zza, this.zzd, this.zzh, this.zzg), zza), new zzcvh(zzfblVar.zzab));
        zza2.zzj().zzi(zza, false, this.zzh ? this.zzg : null);
        zzcgaVar.zzd(zza2);
        zza2.zzc().zzj(new zzdcn() { // from class: com.google.android.gms.internal.ads.zzefm
            @Override // com.google.android.gms.internal.ads.zzdcn
            public final void zzl() {
                zzcli zzcliVar = zzcli.this;
                if (zzcliVar.zzP() != null) {
                    zzcliVar.zzP().zzp();
                }
            }
        }, zzcfv.zzf);
        zza2.zzj();
        zzfbq zzfbqVar = zzfblVar.zzt;
        return zzfvc.zzm(zzdto.zzj(zza, zzfbqVar.zzb, zzfbqVar.zza), new zzfok() { // from class: com.google.android.gms.internal.ads.zzefn
            @Override // com.google.android.gms.internal.ads.zzfok
            public final Object apply(Object obj2) {
                zzcli zzcliVar = zza;
                zzfbl zzfblVar2 = zzfblVar;
                zzcvg zzcvgVar = zza2;
                if (zzfblVar2.zzN) {
                    zzcliVar.zzag();
                }
                zzcliVar.zzaa();
                zzcliVar.onPause();
                return zzcvgVar.zza();
            }
        }, this.zze);
    }
}
