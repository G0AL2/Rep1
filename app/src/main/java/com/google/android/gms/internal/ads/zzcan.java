package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public abstract class zzcan extends zzaqx implements zzcao {
    public zzcan() {
        super("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
    }

    @Override // com.google.android.gms.internal.ads.zzaqx
    protected final boolean zzbI(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            zzaqy.zzc(parcel);
            zzg((zzcas) zzaqy.zza(parcel, zzcas.CREATOR));
            parcel2.writeNoException();
        } else if (i10 != 2) {
            zzcar zzcarVar = null;
            zzcam zzcamVar = null;
            if (i10 == 3) {
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
                    zzcarVar = queryLocalInterface instanceof zzcar ? (zzcar) queryLocalInterface : new zzcap(readStrongBinder);
                }
                zzaqy.zzc(parcel);
                zzo(zzcarVar);
                parcel2.writeNoException();
            } else if (i10 != 34) {
                switch (i10) {
                    case 5:
                        boolean zzs = zzs();
                        parcel2.writeNoException();
                        zzaqy.zzd(parcel2, zzs);
                        break;
                    case 6:
                        zzh();
                        parcel2.writeNoException();
                        break;
                    case 7:
                        zzj();
                        parcel2.writeNoException();
                        break;
                    case 8:
                        zze();
                        parcel2.writeNoException();
                        break;
                    case 9:
                        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                        zzaqy.zzc(parcel);
                        zzi(asInterface);
                        parcel2.writeNoException();
                        break;
                    case 10:
                        IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                        zzaqy.zzc(parcel);
                        zzk(asInterface2);
                        parcel2.writeNoException();
                        break;
                    case 11:
                        IObjectWrapper asInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                        zzaqy.zzc(parcel);
                        zzf(asInterface3);
                        parcel2.writeNoException();
                        break;
                    case 12:
                        String zzd = zzd();
                        parcel2.writeNoException();
                        parcel2.writeString(zzd);
                        break;
                    case 13:
                        String readString = parcel.readString();
                        zzaqy.zzc(parcel);
                        zzp(readString);
                        parcel2.writeNoException();
                        break;
                    case 14:
                        com.google.android.gms.ads.internal.client.zzbw zzb = com.google.android.gms.ads.internal.client.zzbv.zzb(parcel.readStrongBinder());
                        zzaqy.zzc(parcel);
                        zzl(zzb);
                        parcel2.writeNoException();
                        break;
                    case 15:
                        Bundle zzb2 = zzb();
                        parcel2.writeNoException();
                        zzaqy.zzf(parcel2, zzb2);
                        break;
                    case 16:
                        IBinder readStrongBinder2 = parcel.readStrongBinder();
                        if (readStrongBinder2 != null) {
                            IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
                            zzcamVar = queryLocalInterface2 instanceof zzcam ? (zzcam) queryLocalInterface2 : new zzcam(readStrongBinder2);
                        }
                        zzaqy.zzc(parcel);
                        zzu(zzcamVar);
                        parcel2.writeNoException();
                        break;
                    case 17:
                        parcel.readString();
                        zzaqy.zzc(parcel);
                        parcel2.writeNoException();
                        break;
                    case 18:
                        IObjectWrapper asInterface4 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                        zzaqy.zzc(parcel);
                        zzr(asInterface4);
                        parcel2.writeNoException();
                        break;
                    case 19:
                        String readString2 = parcel.readString();
                        zzaqy.zzc(parcel);
                        zzm(readString2);
                        parcel2.writeNoException();
                        break;
                    case 20:
                        boolean zzt = zzt();
                        parcel2.writeNoException();
                        zzaqy.zzd(parcel2, zzt);
                        break;
                    case 21:
                        com.google.android.gms.ads.internal.client.zzdh zzc = zzc();
                        parcel2.writeNoException();
                        zzaqy.zzg(parcel2, zzc);
                        break;
                    default:
                        return false;
                }
            } else {
                boolean zzh = zzaqy.zzh(parcel);
                zzaqy.zzc(parcel);
                zzn(zzh);
                parcel2.writeNoException();
            }
        } else {
            zzq();
            parcel2.writeNoException();
        }
        return true;
    }
}
