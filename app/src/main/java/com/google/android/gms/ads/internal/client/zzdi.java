package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzaqw;
import com.google.android.gms.internal.ads.zzaqy;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzdi extends zzaqw implements zzdk {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdi(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoController");
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final float zze() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final float zzf() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final float zzg() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final int zzh() throws RemoteException {
        Parcel zzbk = zzbk(5, zza());
        int readInt = zzbk.readInt();
        zzbk.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final zzdn zzi() throws RemoteException {
        zzdn zzdlVar;
        Parcel zzbk = zzbk(11, zza());
        IBinder readStrongBinder = zzbk.readStrongBinder();
        if (readStrongBinder == null) {
            zzdlVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
            zzdlVar = queryLocalInterface instanceof zzdn ? (zzdn) queryLocalInterface : new zzdl(readStrongBinder);
        }
        zzbk.recycle();
        return zzdlVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final void zzj(boolean z10) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zzd(zza, z10);
        zzbl(3, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final void zzk() throws RemoteException {
        zzbl(2, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final void zzl() throws RemoteException {
        zzbl(1, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final void zzm(zzdn zzdnVar) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zzg(zza, zzdnVar);
        zzbl(8, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final void zzn() throws RemoteException {
        zzbl(13, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final boolean zzo() throws RemoteException {
        Parcel zzbk = zzbk(12, zza());
        boolean zzh = zzaqy.zzh(zzbk);
        zzbk.recycle();
        return zzh;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final boolean zzp() throws RemoteException {
        Parcel zzbk = zzbk(10, zza());
        boolean zzh = zzaqy.zzh(zzbk);
        zzbk.recycle();
        return zzh;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final boolean zzq() throws RemoteException {
        Parcel zzbk = zzbk(4, zza());
        boolean zzh = zzaqy.zzh(zzbk);
        zzbk.recycle();
        return zzh;
    }
}
