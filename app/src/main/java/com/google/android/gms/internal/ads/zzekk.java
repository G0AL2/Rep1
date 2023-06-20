package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzekk implements zzefd {
    private final Context zza;
    private final zzcws zzb;
    private final zzbiu zzc;
    private final zzfvm zzd;
    private final zzfgf zze;

    public zzekk(Context context, zzcws zzcwsVar, zzfgf zzfgfVar, zzfvm zzfvmVar, zzbiu zzbiuVar) {
        this.zza = context;
        this.zzb = zzcwsVar;
        this.zze = zzfgfVar;
        this.zzd = zzfvmVar;
        this.zzc = zzbiuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzefd
    public final zzfvl zza(zzfbx zzfbxVar, zzfbl zzfblVar) {
        zzcvw zza = this.zzb.zza(new zzcym(zzfbxVar, zzfblVar, null), new zzeki(this, new View(this.zza), null, new zzcxv() { // from class: com.google.android.gms.internal.ads.zzekg
            @Override // com.google.android.gms.internal.ads.zzcxv
            public final com.google.android.gms.ads.internal.client.zzdk zza() {
                return null;
            }
        }, (zzfbm) zzfblVar.zzv.get(0)));
        zzekj zzk = zza.zzk();
        zzfbq zzfbqVar = zzfblVar.zzt;
        final zzbip zzbipVar = new zzbip(zzk, zzfbqVar.zzb, zzfbqVar.zza);
        zzfgf zzfgfVar = this.zze;
        return zzffp.zzd(new zzffj() { // from class: com.google.android.gms.internal.ads.zzekh
            @Override // com.google.android.gms.internal.ads.zzffj
            public final void zza() {
                zzekk.this.zzc(zzbipVar);
            }
        }, this.zzd, zzffz.CUSTOM_RENDER_SYN, zzfgfVar).zzb(zzffz.CUSTOM_RENDER_ACK).zzd(zzfvc.zzi(zza.zza())).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzefd
    public final boolean zzb(zzfbx zzfbxVar, zzfbl zzfblVar) {
        zzfbq zzfbqVar;
        return (this.zzc == null || (zzfbqVar = zzfblVar.zzt) == null || zzfbqVar.zza == null) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzc(zzbip zzbipVar) throws Exception {
        this.zzc.zze(zzbipVar);
    }
}
