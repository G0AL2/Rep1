package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzejo implements zzefd {
    private final Context zza;
    private final zzdtp zzb;
    private final zzdsy zzc;
    private final zzfcd zzd;
    private final Executor zze;
    private final zzcfo zzf;
    private final zzbop zzg;
    private final boolean zzh = ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzhu)).booleanValue();

    public zzejo(Context context, zzcfo zzcfoVar, zzfcd zzfcdVar, Executor executor, zzdsy zzdsyVar, zzdtp zzdtpVar, zzbop zzbopVar) {
        this.zza = context;
        this.zzd = zzfcdVar;
        this.zzc = zzdsyVar;
        this.zze = executor;
        this.zzf = zzcfoVar;
        this.zzb = zzdtpVar;
        this.zzg = zzbopVar;
    }

    @Override // com.google.android.gms.internal.ads.zzefd
    public final zzfvl zza(final zzfbx zzfbxVar, final zzfbl zzfblVar) {
        final zzdtt zzdttVar = new zzdtt();
        zzfvl zzn = zzfvc.zzn(zzfvc.zzi(null), new zzfuj() { // from class: com.google.android.gms.internal.ads.zzejh
            @Override // com.google.android.gms.internal.ads.zzfuj
            public final zzfvl zza(Object obj) {
                return zzejo.this.zzc(zzfblVar, zzfbxVar, zzdttVar, obj);
            }
        }, this.zze);
        zzn.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeji
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
        final zzcli zza = this.zzb.zza(this.zzd.zze, zzfblVar, zzfbxVar.zzb.zzb);
        zza.zzab(zzfblVar.zzX);
        zzdttVar.zza(this.zza, (View) zza);
        zzcga zzcgaVar = new zzcga();
        final zzdsu zze = this.zzc.zze(new zzcym(zzfbxVar, zzfblVar, null), new zzdsv(new zzejn(this.zza, this.zzb, this.zzd, this.zzf, zzfblVar, zzcgaVar, zza, this.zzg, this.zzh), zza));
        zzcgaVar.zzd(zze);
        zzbpc.zzb(zza, zze.zzg());
        zze.zzc().zzj(new zzdcn() { // from class: com.google.android.gms.internal.ads.zzejj
            @Override // com.google.android.gms.internal.ads.zzdcn
            public final void zzl() {
                zzcli zzcliVar = zzcli.this;
                if (zzcliVar.zzP() != null) {
                    zzcliVar.zzP().zzp();
                }
            }
        }, zzcfv.zzf);
        zze.zzl().zzi(zza, true, this.zzh ? this.zzg : null);
        zze.zzl();
        zzfbq zzfbqVar = zzfblVar.zzt;
        return zzfvc.zzm(zzdto.zzj(zza, zzfbqVar.zzb, zzfbqVar.zza), new zzfok() { // from class: com.google.android.gms.internal.ads.zzejk
            @Override // com.google.android.gms.internal.ads.zzfok
            public final Object apply(Object obj2) {
                zzcli zzcliVar = zza;
                zzfbl zzfblVar2 = zzfblVar;
                zzdsu zzdsuVar = zze;
                if (zzfblVar2.zzN) {
                    zzcliVar.zzag();
                }
                zzcliVar.zzaa();
                zzcliVar.onPause();
                return zzdsuVar.zzk();
            }
        }, this.zze);
    }
}
