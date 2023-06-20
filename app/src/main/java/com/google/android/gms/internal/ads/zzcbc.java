package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzcbc extends zzaqw implements zzcbe {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcbc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    @Override // com.google.android.gms.internal.ads.zzcbe
    public final Bundle zzb() throws RemoteException {
        Parcel zzbk = zzbk(9, zza());
        Bundle bundle = (Bundle) zzaqy.zza(zzbk, Bundle.CREATOR);
        zzbk.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzcbe
    public final com.google.android.gms.ads.internal.client.zzdh zzc() throws RemoteException {
        Parcel zzbk = zzbk(12, zza());
        com.google.android.gms.ads.internal.client.zzdh zzb = com.google.android.gms.ads.internal.client.zzdg.zzb(zzbk.readStrongBinder());
        zzbk.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzcbe
    public final zzcbb zzd() throws RemoteException {
        zzcbb zzcazVar;
        Parcel zzbk = zzbk(11, zza());
        IBinder readStrongBinder = zzbk.readStrongBinder();
        if (readStrongBinder == null) {
            zzcazVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
            zzcazVar = queryLocalInterface instanceof zzcbb ? (zzcbb) queryLocalInterface : new zzcaz(readStrongBinder);
        }
        zzbk.recycle();
        return zzcazVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcbe
    public final String zze() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcbe
    public final void zzf(com.google.android.gms.ads.internal.client.zzl zzlVar, zzcbl zzcblVar) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zze(zza, zzlVar);
        zzaqy.zzg(zza, zzcblVar);
        zzbl(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcbe
    public final void zzg(com.google.android.gms.ads.internal.client.zzl zzlVar, zzcbl zzcblVar) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zze(zza, zzlVar);
        zzaqy.zzg(zza, zzcblVar);
        zzbl(14, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcbe
    public final void zzh(boolean z10) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zzd(zza, z10);
        zzbl(15, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcbe
    public final void zzi(com.google.android.gms.ads.internal.client.zzdb zzdbVar) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zzg(zza, zzdbVar);
        zzbl(8, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcbe
    public final void zzj(com.google.android.gms.ads.internal.client.zzde zzdeVar) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zzg(zza, zzdeVar);
        zzbl(13, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcbe
    public final void zzk(zzcbh zzcbhVar) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zzg(zza, zzcbhVar);
        zzbl(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcbe
    public final void zzl(zzcbs zzcbsVar) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zze(zza, zzcbsVar);
        zzbl(7, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcbe
    public final void zzm(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zzg(zza, iObjectWrapper);
        zzbl(5, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcbe
    public final void zzn(IObjectWrapper iObjectWrapper, boolean z10) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcbe
    public final boolean zzo() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcbe
    public final void zzp(zzcbm zzcbmVar) throws RemoteException {
        throw null;
    }
}
