package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzaqx;
import com.google.android.gms.internal.ads.zzaqy;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public abstract class zzdj extends zzaqx implements zzdk {
    public zzdj() {
        super("com.google.android.gms.ads.internal.client.IVideoController");
    }

    public static zzdk zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
        return queryLocalInterface instanceof zzdk ? (zzdk) queryLocalInterface : new zzdi(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzaqx
    protected final boolean zzbI(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        zzdn zzdlVar;
        switch (i10) {
            case 1:
                zzl();
                parcel2.writeNoException();
                return true;
            case 2:
                zzk();
                parcel2.writeNoException();
                return true;
            case 3:
                boolean zzh = zzaqy.zzh(parcel);
                zzaqy.zzc(parcel);
                zzj(zzh);
                parcel2.writeNoException();
                return true;
            case 4:
                boolean zzq = zzq();
                parcel2.writeNoException();
                zzaqy.zzd(parcel2, zzq);
                return true;
            case 5:
                int zzh2 = zzh();
                parcel2.writeNoException();
                parcel2.writeInt(zzh2);
                return true;
            case 6:
                float zzg = zzg();
                parcel2.writeNoException();
                parcel2.writeFloat(zzg);
                return true;
            case 7:
                float zzf = zzf();
                parcel2.writeNoException();
                parcel2.writeFloat(zzf);
                return true;
            case 8:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    zzdlVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
                    zzdlVar = queryLocalInterface instanceof zzdn ? (zzdn) queryLocalInterface : new zzdl(readStrongBinder);
                }
                zzaqy.zzc(parcel);
                zzm(zzdlVar);
                parcel2.writeNoException();
                return true;
            case 9:
                float zze = zze();
                parcel2.writeNoException();
                parcel2.writeFloat(zze);
                return true;
            case 10:
                boolean zzp = zzp();
                parcel2.writeNoException();
                zzaqy.zzd(parcel2, zzp);
                return true;
            case 11:
                zzdn zzi = zzi();
                parcel2.writeNoException();
                zzaqy.zzg(parcel2, zzi);
                return true;
            case 12:
                boolean zzo = zzo();
                parcel2.writeNoException();
                zzaqy.zzd(parcel2, zzo);
                return true;
            case 13:
                zzn();
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
