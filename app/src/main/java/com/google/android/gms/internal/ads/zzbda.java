package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbda extends zzaqw {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbda(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.cache.ICacheService");
    }

    public final long zze(zzbcy zzbcyVar) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zze(zza, zzbcyVar);
        Parcel zzbk = zzbk(3, zza);
        long readLong = zzbk.readLong();
        zzbk.recycle();
        return readLong;
    }

    public final zzbcv zzf(zzbcy zzbcyVar) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zze(zza, zzbcyVar);
        Parcel zzbk = zzbk(1, zza);
        zzbcv zzbcvVar = (zzbcv) zzaqy.zza(zzbk, zzbcv.CREATOR);
        zzbk.recycle();
        return zzbcvVar;
    }

    public final zzbcv zzg(zzbcy zzbcyVar) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zze(zza, zzbcyVar);
        Parcel zzbk = zzbk(2, zza);
        zzbcv zzbcvVar = (zzbcv) zzaqy.zza(zzbk, zzbcv.CREATOR);
        zzbk.recycle();
        return zzbcvVar;
    }
}
