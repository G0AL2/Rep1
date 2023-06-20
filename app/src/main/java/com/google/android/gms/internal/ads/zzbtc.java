package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzbtc implements zzcgc {
    final /* synthetic */ zzcga zza;
    final /* synthetic */ zzbsg zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbtc(zzbte zzbteVar, zzcga zzcgaVar, zzbsg zzbsgVar) {
        this.zza = zzcgaVar;
        this.zzb = zzbsgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcgc
    public final void zza() {
        this.zza.zze(new zzbsp("Unable to obtain a JavascriptEngine."));
        this.zzb.zzb();
    }
}
