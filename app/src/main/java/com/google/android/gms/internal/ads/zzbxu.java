package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public abstract class zzbxu extends zzaqx implements zzbxv {
    public zzbxu() {
        super("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    public static zzbxv zzF(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
        return queryLocalInterface instanceof zzbxv ? (zzbxv) queryLocalInterface : new zzbxt(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzaqx
    protected final boolean zzbI(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        switch (i10) {
            case 1:
                zzaqy.zzc(parcel);
                zzk((Bundle) zzaqy.zza(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 2:
                parcel2.writeNoException();
                return true;
            case 3:
                zzr();
                parcel2.writeNoException();
                return true;
            case 4:
                zzp();
                parcel2.writeNoException();
                return true;
            case 5:
                zzn();
                parcel2.writeNoException();
                return true;
            case 6:
                Bundle bundle = (Bundle) zzaqy.zza(parcel, Bundle.CREATOR);
                zzaqy.zzc(parcel);
                zzq(bundle);
                parcel2.writeNoException();
                zzaqy.zzf(parcel2, bundle);
                return true;
            case 7:
                zzs();
                parcel2.writeNoException();
                return true;
            case 8:
                zzl();
                parcel2.writeNoException();
                return true;
            case 9:
                zzv();
                parcel2.writeNoException();
                return true;
            case 10:
                zzh();
                parcel2.writeNoException();
                return true;
            case 11:
                boolean zzE = zzE();
                parcel2.writeNoException();
                zzaqy.zzd(parcel2, zzE);
                return true;
            case 12:
                parcel.readInt();
                parcel.readInt();
                Intent intent = (Intent) zzaqy.zza(parcel, Intent.CREATOR);
                zzaqy.zzc(parcel);
                parcel2.writeNoException();
                return true;
            case 13:
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzaqy.zzc(parcel);
                zzj(asInterface);
                parcel2.writeNoException();
                return true;
            case 14:
                zzt();
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
