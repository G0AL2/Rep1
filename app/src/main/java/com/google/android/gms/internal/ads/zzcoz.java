package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzcoz implements zzcux {
    private final zzcop zza;
    private zzezg zzb;
    private zzeyh zzc;
    private zzdhf zzd;
    private zzdbf zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzcoz(zzcop zzcopVar, zzcoy zzcoyVar) {
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

    @Override // com.google.android.gms.internal.ads.zzcux
    public final /* synthetic */ zzcux zzc(zzdhf zzdhfVar) {
        this.zzd = zzdhfVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcux
    public final /* synthetic */ zzcux zzd(zzdbf zzdbfVar) {
        this.zze = zzdbfVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdbb
    public final /* bridge */ /* synthetic */ Object zzh() {
        zzgrc.zzc(this.zzd, zzdhf.class);
        zzgrc.zzc(this.zze, zzdbf.class);
        return new zzcpb(this.zza, new zzczc(), new zzfdg(), new zzdan(), new zzdwu(), this.zzd, this.zze, null, this.zzb, this.zzc, null);
    }
}
