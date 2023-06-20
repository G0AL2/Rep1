package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public abstract class zzbkx extends zzaqx implements zzbky {
    public zzbkx() {
        super("com.google.android.gms.ads.internal.formats.client.IMediaContent");
    }

    @Override // com.google.android.gms.internal.ads.zzaqx
    protected final boolean zzbI(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        zzbmj zzbmjVar;
        switch (i10) {
            case 2:
                float zze = zze();
                parcel2.writeNoException();
                parcel2.writeFloat(zze);
                return true;
            case 3:
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzaqy.zzc(parcel);
                zzj(asInterface);
                parcel2.writeNoException();
                return true;
            case 4:
                IObjectWrapper zzi = zzi();
                parcel2.writeNoException();
                zzaqy.zzg(parcel2, zzi);
                return true;
            case 5:
                float zzg = zzg();
                parcel2.writeNoException();
                parcel2.writeFloat(zzg);
                return true;
            case 6:
                float zzf = zzf();
                parcel2.writeNoException();
                parcel2.writeFloat(zzf);
                return true;
            case 7:
                com.google.android.gms.ads.internal.client.zzdk zzh = zzh();
                parcel2.writeNoException();
                zzaqy.zzg(parcel2, zzh);
                return true;
            case 8:
                boolean zzk = zzk();
                parcel2.writeNoException();
                zzaqy.zzd(parcel2, zzk);
                return true;
            case 9:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    zzbmjVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnMediaContentChangedListener");
                    zzbmjVar = queryLocalInterface instanceof zzbmj ? (zzbmj) queryLocalInterface : new zzbmj(readStrongBinder);
                }
                zzaqy.zzc(parcel);
                zzl(zzbmjVar);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
