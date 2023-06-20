package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzcrv implements zzgqu {
    private final zzgrh zza;
    private final zzgrh zzb;

    public zzcrv(zzgrh zzgrhVar, zzgrh zzgrhVar2) {
        this.zza = zzgrhVar;
        this.zzb = zzgrhVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgrh
    public final /* synthetic */ Object zzb() {
        zzbtp zzbtpVar = new zzbtp();
        String str = (String) this.zzb.zzb();
        return ((Boolean) zzbjq.zza.zze()).booleanValue() ? new zzbto(zzbtpVar, str) : new zzcfn(str);
    }
}
