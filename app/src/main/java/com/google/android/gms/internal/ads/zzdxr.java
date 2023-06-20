package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzdxr extends com.google.android.gms.ads.internal.client.zzbe {
    final /* synthetic */ zzdxl zza;
    final /* synthetic */ zzdxs zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdxr(zzdxs zzdxsVar, zzdxl zzdxlVar) {
        this.zzb = zzdxsVar;
        this.zza = zzdxlVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbf
    public final void zzc() throws RemoteException {
        long j10;
        zzdxl zzdxlVar = this.zza;
        j10 = this.zzb.zza;
        zzdxlVar.zzb(j10);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbf
    public final void zzd() throws RemoteException {
        long j10;
        zzdxl zzdxlVar = this.zza;
        j10 = this.zzb.zza;
        zzdxlVar.zzc(j10);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbf
    public final void zze(int i10) throws RemoteException {
        long j10;
        zzdxl zzdxlVar = this.zza;
        j10 = this.zzb.zza;
        zzdxlVar.zzd(j10, i10);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbf
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        long j10;
        zzdxl zzdxlVar = this.zza;
        j10 = this.zzb.zza;
        zzdxlVar.zzd(j10, zzeVar.zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbf
    public final void zzg() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbf
    public final void zzh() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbf
    public final void zzi() throws RemoteException {
        long j10;
        zzdxl zzdxlVar = this.zza;
        j10 = this.zzb.zza;
        zzdxlVar.zze(j10);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbf
    public final void zzj() throws RemoteException {
        long j10;
        zzdxl zzdxlVar = this.zza;
        j10 = this.zzb.zza;
        zzdxlVar.zzg(j10);
    }
}
