package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzekp implements zzefd {
    private final zzbiu zza;
    private final zzfvm zzb;
    private final zzfgf zzc;
    private final zzeky zzd;

    public zzekp(zzfgf zzfgfVar, zzfvm zzfvmVar, zzbiu zzbiuVar, zzeky zzekyVar, byte[] bArr) {
        this.zzc = zzfgfVar;
        this.zzb = zzfvmVar;
        this.zza = zzbiuVar;
        this.zzd = zzekyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzefd
    public final zzfvl zza(zzfbx zzfbxVar, zzfbl zzfblVar) {
        zzcga zzcgaVar = new zzcga();
        zzeku zzekuVar = new zzeku();
        zzekuVar.zzd(new zzeko(this, zzcgaVar, zzfbxVar, zzfblVar, zzekuVar));
        zzfbq zzfbqVar = zzfblVar.zzt;
        final zzbip zzbipVar = new zzbip(zzekuVar, zzfbqVar.zzb, zzfbqVar.zza);
        zzfgf zzfgfVar = this.zzc;
        return zzffp.zzd(new zzffj() { // from class: com.google.android.gms.internal.ads.zzekn
            @Override // com.google.android.gms.internal.ads.zzffj
            public final void zza() {
                zzekp.this.zzc(zzbipVar);
            }
        }, this.zzb, zzffz.CUSTOM_RENDER_SYN, zzfgfVar).zzb(zzffz.CUSTOM_RENDER_ACK).zzd(zzcgaVar).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzefd
    public final boolean zzb(zzfbx zzfbxVar, zzfbl zzfblVar) {
        zzfbq zzfbqVar;
        return (this.zza == null || (zzfbqVar = zzfblVar.zzt) == null || zzfbqVar.zza == null) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzc(zzbip zzbipVar) throws Exception {
        this.zza.zze(zzbipVar);
    }
}
