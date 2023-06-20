package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzcyy implements zzfuy {
    final /* synthetic */ zzcza zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcyy(zzcza zzczaVar) {
        this.zza = zzczaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfuy
    public final void zza(Throwable th) {
        zzdgx zzdgxVar;
        zzdgxVar = this.zza.zzf;
        zzdgxVar.zzk(false);
    }

    @Override // com.google.android.gms.internal.ads.zzfuy
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzdgx zzdgxVar;
        zzbzv zzbzvVar = (zzbzv) obj;
        zzdgxVar = this.zza.zzf;
        zzdgxVar.zzk(true);
    }
}
