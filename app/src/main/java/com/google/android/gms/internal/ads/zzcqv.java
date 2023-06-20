package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzcqv implements zzdsx {
    private final zzcop zza;
    private zzezg zzb;
    private zzeyh zzc;
    private zzdhf zzd;
    private zzdbf zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzcqv(zzcop zzcopVar, zzcqu zzcquVar) {
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

    @Override // com.google.android.gms.internal.ads.zzdsx
    public final /* synthetic */ zzdsx zzc(zzdhf zzdhfVar) {
        this.zzd = zzdhfVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdsx
    public final /* synthetic */ zzdsx zzd(zzdbf zzdbfVar) {
        this.zze = zzdbfVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdbb
    /* renamed from: zze */
    public final zzdsy zzh() {
        zzgrc.zzc(this.zzd, zzdhf.class);
        zzgrc.zzc(this.zze, zzdbf.class);
        return new zzcqx(this.zza, new zzczc(), new zzfdg(), new zzdan(), new zzdwu(), this.zzd, this.zze, null, this.zzb, this.zzc, null);
    }
}
