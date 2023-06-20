package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzcau extends zzaqw implements zzcaw {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcau(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    }

    @Override // com.google.android.gms.internal.ads.zzcaw
    public final void zze(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zzg(zza, iObjectWrapper);
        zzbl(8, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcaw
    public final void zzf(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zzg(zza, iObjectWrapper);
        zzbl(6, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcaw
    public final void zzg(IObjectWrapper iObjectWrapper, int i10) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zzg(zza, iObjectWrapper);
        zza.writeInt(i10);
        zzbl(9, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcaw
    public final void zzh(IObjectWrapper iObjectWrapper) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcaw
    public final void zzi(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zzg(zza, iObjectWrapper);
        zzbl(3, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcaw
    public final void zzj(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zzg(zza, iObjectWrapper);
        zzbl(4, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcaw
    public final void zzk(IObjectWrapper iObjectWrapper, int i10) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcaw
    public final void zzl(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zzg(zza, iObjectWrapper);
        zzbl(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcaw
    public final void zzm(IObjectWrapper iObjectWrapper, zzcax zzcaxVar) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zzg(zza, iObjectWrapper);
        zzaqy.zze(zza, zzcaxVar);
        zzbl(7, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcaw
    public final void zzn(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zzg(zza, iObjectWrapper);
        zzbl(11, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcaw
    public final void zzo(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zzg(zza, iObjectWrapper);
        zzbl(5, zza);
    }
}
