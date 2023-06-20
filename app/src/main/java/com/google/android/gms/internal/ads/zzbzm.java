package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public abstract class zzbzm extends zzaqx implements zzbzn {
    public zzbzm() {
        super("com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    @Override // com.google.android.gms.internal.ads.zzaqx
    protected final boolean zzbI(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        zzbzr zzbzrVar = null;
        if (i10 == 1) {
            zzbzh zzbzhVar = (zzbzh) zzaqy.zza(parcel, zzbzh.CREATOR);
            zzaqy.zzc(parcel);
            parcel2.writeNoException();
            zzaqy.zzf(parcel2, null);
        } else if (i10 == 2) {
            zzbzh zzbzhVar2 = (zzbzh) zzaqy.zza(parcel, zzbzh.CREATOR);
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdResponseListener");
                if (queryLocalInterface instanceof zzbzo) {
                    zzbzo zzbzoVar = (zzbzo) queryLocalInterface;
                }
            }
            zzaqy.zzc(parcel);
            parcel2.writeNoException();
        } else if (i10 == 4) {
            zzbzv zzbzvVar = (zzbzv) zzaqy.zza(parcel, zzbzv.CREATOR);
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                zzbzrVar = queryLocalInterface2 instanceof zzbzr ? (zzbzr) queryLocalInterface2 : new zzbzp(readStrongBinder2);
            }
            zzaqy.zzc(parcel);
            zzg(zzbzvVar, zzbzrVar);
            parcel2.writeNoException();
        } else if (i10 == 5) {
            zzbzv zzbzvVar2 = (zzbzv) zzaqy.zza(parcel, zzbzv.CREATOR);
            IBinder readStrongBinder3 = parcel.readStrongBinder();
            if (readStrongBinder3 != null) {
                IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                zzbzrVar = queryLocalInterface3 instanceof zzbzr ? (zzbzr) queryLocalInterface3 : new zzbzp(readStrongBinder3);
            }
            zzaqy.zzc(parcel);
            zzf(zzbzvVar2, zzbzrVar);
            parcel2.writeNoException();
        } else if (i10 == 6) {
            zzbzv zzbzvVar3 = (zzbzv) zzaqy.zza(parcel, zzbzv.CREATOR);
            IBinder readStrongBinder4 = parcel.readStrongBinder();
            if (readStrongBinder4 != null) {
                IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                zzbzrVar = queryLocalInterface4 instanceof zzbzr ? (zzbzr) queryLocalInterface4 : new zzbzp(readStrongBinder4);
            }
            zzaqy.zzc(parcel);
            zze(zzbzvVar3, zzbzrVar);
            parcel2.writeNoException();
        } else if (i10 != 7) {
            return false;
        } else {
            String readString = parcel.readString();
            IBinder readStrongBinder5 = parcel.readStrongBinder();
            if (readStrongBinder5 != null) {
                IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                zzbzrVar = queryLocalInterface5 instanceof zzbzr ? (zzbzr) queryLocalInterface5 : new zzbzp(readStrongBinder5);
            }
            zzaqy.zzc(parcel);
            zzh(readString, zzbzrVar);
            parcel2.writeNoException();
        }
        return true;
    }
}
