package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzcbf extends zzaqw implements zzcbh {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcbf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzcbh
    public final void zze() throws RemoteException {
        zzbl(7, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzcbh
    public final void zzf() throws RemoteException {
        zzbl(6, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzcbh
    public final void zzg() throws RemoteException {
        zzbl(2, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzcbh
    public final void zzh(int i10) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i10);
        zzbl(4, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcbh
    public final void zzi(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zze(zza, zzeVar);
        zzbl(5, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcbh
    public final void zzj() throws RemoteException {
        zzbl(1, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzcbh
    public final void zzk(zzcbb zzcbbVar) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zzg(zza, zzcbbVar);
        zzbl(3, zza);
    }
}
