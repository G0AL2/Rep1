package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzdxu extends zzcbk {
    final /* synthetic */ zzdxw zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdxu(zzdxw zzdxwVar) {
        this.zza = zzdxwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcbl
    public final void zze(int i10) throws RemoteException {
        zzdxl zzdxlVar;
        long j10;
        zzdxw zzdxwVar = this.zza;
        zzdxlVar = zzdxwVar.zzc;
        j10 = zzdxwVar.zza;
        zzdxlVar.zzm(j10, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzcbl
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        zzdxl zzdxlVar;
        long j10;
        zzdxw zzdxwVar = this.zza;
        zzdxlVar = zzdxwVar.zzc;
        j10 = zzdxwVar.zza;
        zzdxlVar.zzm(j10, zzeVar.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcbl
    public final void zzg() throws RemoteException {
        zzdxl zzdxlVar;
        long j10;
        zzdxw zzdxwVar = this.zza;
        zzdxlVar = zzdxwVar.zzc;
        j10 = zzdxwVar.zza;
        zzdxlVar.zzp(j10);
    }
}
