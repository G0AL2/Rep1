package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public abstract class zzbcf extends zzaqx implements zzbcg {
    public zzbcf() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
    }

    @Override // com.google.android.gms.internal.ads.zzaqx
    protected final boolean zzbI(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        zzbck zzbckVar = null;
        zzbcn zzbcnVar = null;
        switch (i10) {
            case 2:
                com.google.android.gms.ads.internal.client.zzbs zze = zze();
                parcel2.writeNoException();
                zzaqy.zzg(parcel2, zze);
                return true;
            case 3:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdPresentationCallback");
                    zzbckVar = queryLocalInterface instanceof zzbck ? (zzbck) queryLocalInterface : new zzbck(readStrongBinder);
                }
                zzaqy.zzc(parcel);
                zzj(zzbckVar);
                parcel2.writeNoException();
                return true;
            case 4:
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
                    zzbcnVar = queryLocalInterface2 instanceof zzbcn ? (zzbcn) queryLocalInterface2 : new zzbcl(readStrongBinder2);
                }
                zzaqy.zzc(parcel);
                zzi(asInterface, zzbcnVar);
                parcel2.writeNoException();
                return true;
            case 5:
                com.google.android.gms.ads.internal.client.zzdh zzf = zzf();
                parcel2.writeNoException();
                zzaqy.zzg(parcel2, zzf);
                return true;
            case 6:
                boolean zzh = zzaqy.zzh(parcel);
                zzaqy.zzc(parcel);
                zzg(zzh);
                parcel2.writeNoException();
                return true;
            case 7:
                com.google.android.gms.ads.internal.client.zzde zzb = com.google.android.gms.ads.internal.client.zzdd.zzb(parcel.readStrongBinder());
                zzaqy.zzc(parcel);
                zzh(zzb);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
