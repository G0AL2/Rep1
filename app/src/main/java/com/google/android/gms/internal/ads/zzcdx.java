package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzcdx extends zzaqw implements zzcdz {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcdx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    @Override // com.google.android.gms.internal.ads.zzcdz
    public final void zze(IObjectWrapper iObjectWrapper, zzced zzcedVar, zzcdw zzcdwVar) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zzg(zza, iObjectWrapper);
        zzaqy.zze(zza, zzcedVar);
        zzaqy.zzg(zza, zzcdwVar);
        zzbl(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcdz
    public final void zzf(zzbyt zzbytVar) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zze(zza, zzbytVar);
        zzbl(7, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcdz
    public final void zzg(List list, IObjectWrapper iObjectWrapper, zzbyk zzbykVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeTypedList(list);
        zzaqy.zzg(zza, iObjectWrapper);
        zzaqy.zzg(zza, zzbykVar);
        zzbl(10, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcdz
    public final void zzh(List list, IObjectWrapper iObjectWrapper, zzbyk zzbykVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeTypedList(list);
        zzaqy.zzg(zza, iObjectWrapper);
        zzaqy.zzg(zza, zzbykVar);
        zzbl(9, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcdz
    public final void zzi(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zzg(zza, iObjectWrapper);
        zzbl(8, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcdz
    public final void zzj(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zzg(zza, iObjectWrapper);
        zzbl(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcdz
    public final void zzk(List list, IObjectWrapper iObjectWrapper, zzbyk zzbykVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeTypedList(list);
        zzaqy.zzg(zza, iObjectWrapper);
        zzaqy.zzg(zza, zzbykVar);
        zzbl(6, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcdz
    public final void zzl(List list, IObjectWrapper iObjectWrapper, zzbyk zzbykVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeTypedList(list);
        zzaqy.zzg(zza, iObjectWrapper);
        zzaqy.zzg(zza, zzbykVar);
        zzbl(5, zza);
    }
}
