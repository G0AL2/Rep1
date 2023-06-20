package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzcqh implements zzdkx {
    private final zzcop zza;
    private zzezg zzb;
    private zzeyh zzc;
    private zzdhf zzd;
    private zzdbf zze;
    private zzekr zzf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzcqh(zzcop zzcopVar, zzcqg zzcqgVar) {
        this.zza = zzcopVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdbb
    public final /* synthetic */ zzdbb zza(zzeyh zzeyhVar) {
        this.zzc = zzeyhVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdbb
    public final /* synthetic */ zzdbb zzb(zzezg zzezgVar) {
        this.zzb = zzezgVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdkx
    public final /* synthetic */ zzdkx zzc(zzekr zzekrVar) {
        this.zzf = zzekrVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdkx
    public final /* synthetic */ zzdkx zzd(zzdhf zzdhfVar) {
        this.zzd = zzdhfVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdkx
    public final /* synthetic */ zzdkx zze(zzdbf zzdbfVar) {
        this.zze = zzdbfVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdbb
    /* renamed from: zzf */
    public final zzdky zzh() {
        zzgrc.zzc(this.zzd, zzdhf.class);
        zzgrc.zzc(this.zze, zzdbf.class);
        zzgrc.zzc(this.zzf, zzekr.class);
        return new zzcqj(this.zza, new zzczc(), new zzfdg(), new zzdan(), new zzdwu(), this.zzd, this.zze, this.zzf, null, this.zzb, this.zzc, null);
    }
}
