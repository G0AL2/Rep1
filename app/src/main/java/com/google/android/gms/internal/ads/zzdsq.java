package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzdsq implements zzbpb {
    private final zzdda zza;
    private final zzcax zzb;
    private final String zzc;
    private final String zzd;

    public zzdsq(zzdda zzddaVar, zzfbl zzfblVar) {
        this.zza = zzddaVar;
        this.zzb = zzfblVar.zzm;
        this.zzc = zzfblVar.zzk;
        this.zzd = zzfblVar.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzbpb
    public final void zza(zzcax zzcaxVar) {
        int i10;
        String str;
        zzcax zzcaxVar2 = this.zzb;
        if (zzcaxVar2 != null) {
            zzcaxVar = zzcaxVar2;
        }
        if (zzcaxVar != null) {
            str = zzcaxVar.zza;
            i10 = zzcaxVar.zzb;
        } else {
            i10 = 1;
            str = "";
        }
        this.zza.zzd(new zzcai(str, i10), this.zzc, this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzbpb
    public final void zzb() {
        this.zza.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzbpb
    public final void zzc() {
        this.zza.zzf();
    }
}
