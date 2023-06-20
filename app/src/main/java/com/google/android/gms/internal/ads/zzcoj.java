package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzcoj implements zzdlt {
    private final zzcop zza;
    private zzezg zzb;
    private zzeyh zzc;
    private zzdhf zzd;
    private zzdbf zze;
    private zzdlp zzf;
    private zzcvs zzg;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzcoj(zzcop zzcopVar, zzcoi zzcoiVar) {
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

    @Override // com.google.android.gms.internal.ads.zzdlt
    public final /* synthetic */ zzdlt zzc(zzcvs zzcvsVar) {
        this.zzg = zzcvsVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdlt
    public final /* synthetic */ zzdlt zzd(zzdlp zzdlpVar) {
        this.zzf = zzdlpVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdlt
    public final /* synthetic */ zzdlt zze(zzdhf zzdhfVar) {
        this.zzd = zzdhfVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdlt
    public final /* synthetic */ zzdlt zzf(zzdbf zzdbfVar) {
        this.zze = zzdbfVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdbb
    /* renamed from: zzg */
    public final zzdlu zzh() {
        zzgrc.zzc(this.zzd, zzdhf.class);
        zzgrc.zzc(this.zze, zzdbf.class);
        zzgrc.zzc(this.zzf, zzdlp.class);
        zzgrc.zzc(this.zzg, zzcvs.class);
        return new zzcol(this.zza, this.zzg, this.zzf, new zzczc(), new zzfdg(), new zzdan(), new zzdwu(), this.zzd, this.zze, null, this.zzb, this.zzc, null);
    }
}
