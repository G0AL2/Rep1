package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbse implements zzcge {
    final /* synthetic */ zzbsg zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbse(zzbsg zzbsgVar) {
        this.zza = zzbsgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcge
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        zzbsl zzbslVar;
        zzbsn zzbsnVar = (zzbsn) obj;
        com.google.android.gms.ads.internal.util.zze.zza("Releasing engine reference.");
        zzbslVar = this.zza.zzb;
        zzbslVar.zzd();
    }
}
