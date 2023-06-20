package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbty extends zzaqw implements zzbua {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbty(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzbua
    public final zzbud zzb(String str) throws RemoteException {
        zzbud zzbubVar;
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzbk = zzbk(1, zza);
        IBinder readStrongBinder = zzbk.readStrongBinder();
        if (readStrongBinder == null) {
            zzbubVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            zzbubVar = queryLocalInterface instanceof zzbud ? (zzbud) queryLocalInterface : new zzbub(readStrongBinder);
        }
        zzbk.recycle();
        return zzbubVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbua
    public final zzbvt zzc(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzbk = zzbk(3, zza);
        zzbvt zzb = zzbvs.zzb(zzbk.readStrongBinder());
        zzbk.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbua
    public final boolean zzd(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzbk = zzbk(4, zza);
        boolean zzh = zzaqy.zzh(zzbk);
        zzbk.recycle();
        return zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzbua
    public final boolean zze(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzbk = zzbk(2, zza);
        boolean zzh = zzaqy.zzh(zzbk);
        zzbk.recycle();
        return zzh;
    }
}
