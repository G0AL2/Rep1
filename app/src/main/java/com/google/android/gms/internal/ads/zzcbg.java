package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public abstract class zzcbg extends zzaqx implements zzcbh {
    public zzcbg() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzaqx
    protected final boolean zzbI(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        zzcbb zzcazVar;
        switch (i10) {
            case 1:
                zzj();
                break;
            case 2:
                zzg();
                break;
            case 3:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    zzcazVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
                    zzcazVar = queryLocalInterface instanceof zzcbb ? (zzcbb) queryLocalInterface : new zzcaz(readStrongBinder);
                }
                zzaqy.zzc(parcel);
                zzk(zzcazVar);
                break;
            case 4:
                int readInt = parcel.readInt();
                zzaqy.zzc(parcel);
                zzh(readInt);
                break;
            case 5:
                zzaqy.zzc(parcel);
                zzi((com.google.android.gms.ads.internal.client.zze) zzaqy.zza(parcel, com.google.android.gms.ads.internal.client.zze.CREATOR));
                break;
            case 6:
                zzf();
                break;
            case 7:
                zze();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
