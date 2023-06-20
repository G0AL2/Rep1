package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzdko implements zzgqu {
    private final zzdkd zza;
    private final zzgrh zzb;
    private final zzgrh zzc;

    public zzdko(zzdkd zzdkdVar, zzgrh zzgrhVar, zzgrh zzgrhVar2) {
        this.zza = zzdkdVar;
        this.zzb = zzgrhVar;
        this.zzc = zzgrhVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgrh
    /* renamed from: zza */
    public final zzccv zzb() {
        return new zzccv(((zzcnl) this.zzb).zza(), ((zzdbk) this.zzc).zza().zzf);
    }
}
