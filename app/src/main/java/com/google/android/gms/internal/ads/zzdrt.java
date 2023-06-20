package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzdrt implements zzfuy {
    final /* synthetic */ String zza;
    final /* synthetic */ zzbom zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdrt(zzdse zzdseVar, String str, zzbom zzbomVar) {
        this.zza = str;
        this.zzb = zzbomVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfuy
    public final void zza(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.zzfuy
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        ((zzcli) obj).zzaf(this.zza, this.zzb);
    }
}
