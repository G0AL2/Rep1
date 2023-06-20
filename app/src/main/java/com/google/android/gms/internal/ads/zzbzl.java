package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbzl extends zzaqw implements zzbzn {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbzl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    @Override // com.google.android.gms.internal.ads.zzbzn
    public final void zze(zzbzv zzbzvVar, zzbzr zzbzrVar) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zze(zza, zzbzvVar);
        zzaqy.zzg(zza, zzbzrVar);
        zzbl(6, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbzn
    public final void zzf(zzbzv zzbzvVar, zzbzr zzbzrVar) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zze(zza, zzbzvVar);
        zzaqy.zzg(zza, zzbzrVar);
        zzbl(5, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbzn
    public final void zzg(zzbzv zzbzvVar, zzbzr zzbzrVar) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zze(zza, zzbzvVar);
        zzaqy.zzg(zza, zzbzrVar);
        zzbl(4, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbzn
    public final void zzh(String str, zzbzr zzbzrVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzaqy.zzg(zza, zzbzrVar);
        zzbl(7, zza);
    }
}
