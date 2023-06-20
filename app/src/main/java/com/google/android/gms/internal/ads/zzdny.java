package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzdny implements zzgqu {
    private final zzdnt zza;
    private final zzgrh zzb;
    private final zzgrh zzc;

    public zzdny(zzdnt zzdntVar, zzgrh zzgrhVar, zzgrh zzgrhVar2) {
        this.zza = zzdntVar;
        this.zzb = zzgrhVar;
        this.zzc = zzgrhVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgrh
    /* renamed from: zza */
    public final zzccv zzb() {
        return new zzccv(((zzcnl) this.zzb).zza(), ((zzdbk) this.zzc).zza().zzf);
    }
}
