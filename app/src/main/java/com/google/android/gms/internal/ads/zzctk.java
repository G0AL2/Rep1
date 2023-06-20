package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzctk implements zzdbw {
    private final zzfbo zza;
    private final zzfbx zzb;
    private final zzfie zzc;
    private final zzfii zzd;

    public zzctk(zzfbx zzfbxVar, zzfii zzfiiVar, zzfie zzfieVar) {
        this.zzb = zzfbxVar;
        this.zzd = zzfiiVar;
        this.zzc = zzfieVar;
        this.zza = zzfbxVar.zzb.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzdbw
    public final void zza(com.google.android.gms.ads.internal.client.zze zzeVar) {
        this.zzd.zzd(this.zzc.zza(this.zzb, null, this.zza.zza));
    }
}
