package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzefs implements zzdlg {
    private final zzcfo zza;
    private final zzfvl zzb;
    private final zzfbl zzc;
    private final zzcli zzd;
    private final zzfcd zze;
    private final zzbop zzf;
    private final boolean zzg;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzefs(zzcfo zzcfoVar, zzfvl zzfvlVar, zzfbl zzfblVar, zzcli zzcliVar, zzfcd zzfcdVar, boolean z10, zzbop zzbopVar) {
        this.zza = zzcfoVar;
        this.zzb = zzfvlVar;
        this.zzc = zzfblVar;
        this.zzd = zzcliVar;
        this.zze = zzfcdVar;
        this.zzg = z10;
        this.zzf = zzbopVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdlg
    public final void zza(boolean z10, Context context, zzdcg zzdcgVar) {
        int i10;
        zzcvg zzcvgVar = (zzcvg) zzfvc.zzq(this.zzb);
        this.zzd.zzap(true);
        boolean zze = this.zzg ? this.zzf.zze(true) : true;
        boolean z11 = this.zzg;
        com.google.android.gms.ads.internal.zzj zzjVar = new com.google.android.gms.ads.internal.zzj(zze, true, z11 ? this.zzf.zzd() : false, z11 ? this.zzf.zza() : 0.0f, -1, z10, this.zzc.zzP, false);
        if (zzdcgVar != null) {
            zzdcgVar.zzf();
        }
        com.google.android.gms.ads.internal.zzt.zzj();
        zzdkv zzg = zzcvgVar.zzg();
        zzcli zzcliVar = this.zzd;
        int i11 = this.zzc.zzR;
        if (i11 == -1) {
            com.google.android.gms.ads.internal.client.zzw zzwVar = this.zze.zzj;
            if (zzwVar != null) {
                int i12 = zzwVar.zza;
                if (i12 == 1) {
                    i10 = 7;
                } else if (i12 == 2) {
                    i10 = 6;
                }
                zzcfo zzcfoVar = this.zza;
                zzfbl zzfblVar = this.zzc;
                String str = zzfblVar.zzC;
                zzfbq zzfbqVar = zzfblVar.zzt;
                com.google.android.gms.ads.internal.overlay.zzm.zza(context, new AdOverlayInfoParcel((com.google.android.gms.ads.internal.client.zza) null, zzg, (com.google.android.gms.ads.internal.overlay.zzw) null, zzcliVar, i10, zzcfoVar, str, zzjVar, zzfbqVar.zzb, zzfbqVar.zza, this.zze.zzf, zzdcgVar), true);
            }
            zzcfi.zze("Error setting app open orientation; no targeting orientation available.");
            i11 = this.zzc.zzR;
        }
        i10 = i11;
        zzcfo zzcfoVar2 = this.zza;
        zzfbl zzfblVar2 = this.zzc;
        String str2 = zzfblVar2.zzC;
        zzfbq zzfbqVar2 = zzfblVar2.zzt;
        com.google.android.gms.ads.internal.overlay.zzm.zza(context, new AdOverlayInfoParcel((com.google.android.gms.ads.internal.client.zza) null, zzg, (com.google.android.gms.ads.internal.overlay.zzw) null, zzcliVar, i10, zzcfoVar2, str2, zzjVar, zzfbqVar2.zzb, zzfbqVar2.zza, this.zze.zzf, zzdcgVar), true);
    }
}
