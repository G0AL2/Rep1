package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbld extends zzaqw implements zzblf {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbld(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    @Override // com.google.android.gms.internal.ads.zzblf
    public final IObjectWrapper zzb(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzbk = zzbk(2, zza);
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzbk.readStrongBinder());
        zzbk.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzblf
    public final void zzbA(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zzg(zza, iObjectWrapper);
        zzbl(3, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzblf
    public final void zzbw(String str, IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzaqy.zzg(zza, iObjectWrapper);
        zzbl(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzblf
    public final void zzbx(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zzg(zza, iObjectWrapper);
        zzbl(6, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzblf
    public final void zzby(zzbky zzbkyVar) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zzg(zza, zzbkyVar);
        zzbl(8, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzblf
    public final void zzbz(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zzg(zza, iObjectWrapper);
        zzbl(9, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzblf
    public final void zzc() throws RemoteException {
        zzbl(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzblf
    public final void zzd(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zzg(zza, iObjectWrapper);
        zzbl(7, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzblf
    public final void zze(IObjectWrapper iObjectWrapper, int i10) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zzg(zza, iObjectWrapper);
        zza.writeInt(i10);
        zzbl(5, zza);
    }
}
