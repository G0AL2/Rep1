package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzcap extends zzaqw implements zzcar {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcap(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
    }

    @Override // com.google.android.gms.internal.ads.zzcar
    public final void zze(zzcal zzcalVar) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zzg(zza, zzcalVar);
        zzbl(5, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcar
    public final void zzf() throws RemoteException {
        zzbl(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzcar
    public final void zzg(int i10) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i10);
        zzbl(7, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcar
    public final void zzh() throws RemoteException {
        zzbl(6, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzcar
    public final void zzi() throws RemoteException {
        zzbl(1, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzcar
    public final void zzj() throws RemoteException {
        zzbl(2, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzcar
    public final void zzk() throws RemoteException {
        zzbl(8, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzcar
    public final void zzl() throws RemoteException {
        zzbl(3, zza());
    }
}
