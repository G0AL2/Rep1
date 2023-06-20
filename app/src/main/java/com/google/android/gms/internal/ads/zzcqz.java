package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzcqz implements com.google.android.gms.ads.nonagon.signalgeneration.zzg {
    private final zzcop zza;
    private zzdbf zzb;
    private com.google.android.gms.ads.nonagon.signalgeneration.zzae zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzcqz(zzcop zzcopVar, zzcqy zzcqyVar) {
        this.zza = zzcopVar;
    }

    @Override // com.google.android.gms.ads.nonagon.signalgeneration.zzg
    public final /* synthetic */ com.google.android.gms.ads.nonagon.signalgeneration.zzg zza(zzdbf zzdbfVar) {
        this.zzb = zzdbfVar;
        return this;
    }

    @Override // com.google.android.gms.ads.nonagon.signalgeneration.zzg
    public final /* synthetic */ com.google.android.gms.ads.nonagon.signalgeneration.zzg zzb(com.google.android.gms.ads.nonagon.signalgeneration.zzae zzaeVar) {
        this.zzc = zzaeVar;
        return this;
    }

    @Override // com.google.android.gms.ads.nonagon.signalgeneration.zzg
    public final com.google.android.gms.ads.nonagon.signalgeneration.zzh zzc() {
        zzgrc.zzc(this.zzb, zzdbf.class);
        zzgrc.zzc(this.zzc, com.google.android.gms.ads.nonagon.signalgeneration.zzae.class);
        return new zzcrb(this.zza, this.zzc, new zzczc(), new zzdwu(), this.zzb, null, null, null);
    }
}
