package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzegw implements zzfuy {
    final /* synthetic */ zzegx zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzegw(zzegx zzegxVar) {
        this.zza = zzegxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfuy
    public final void zza(Throwable th) {
        zzcws zzcwsVar;
        zzdbv zzdbvVar;
        zzcwsVar = this.zza.zza;
        com.google.android.gms.ads.internal.client.zze zza = zzcwsVar.zzd().zza(th);
        zzdbvVar = this.zza.zzd;
        zzdbvVar.zza(zza);
        zzfcx.zzb(zza.zza, th, "DelayedBannerAd.onFailure");
    }

    @Override // com.google.android.gms.internal.ads.zzfuy
    public final /* synthetic */ void zzb(Object obj) {
        ((zzcvv) obj).zzW();
    }
}
