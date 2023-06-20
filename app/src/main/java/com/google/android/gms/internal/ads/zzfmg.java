package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfmg extends zzaqw {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfmg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.IGassService");
    }

    public final zzfme zze(zzfmc zzfmcVar) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zze(zza, zzfmcVar);
        Parcel zzbk = zzbk(1, zza);
        zzfme zzfmeVar = (zzfme) zzaqy.zza(zzbk, zzfme.CREATOR);
        zzbk.recycle();
        return zzfmeVar;
    }

    public final zzfmn zzf(zzfml zzfmlVar) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zze(zza, zzfmlVar);
        Parcel zzbk = zzbk(3, zza);
        zzfmn zzfmnVar = (zzfmn) zzaqy.zza(zzbk, zzfmn.CREATOR);
        zzbk.recycle();
        return zzfmnVar;
    }

    public final void zzg(zzflz zzflzVar) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zze(zza, zzflzVar);
        zzbl(2, zza);
    }
}
