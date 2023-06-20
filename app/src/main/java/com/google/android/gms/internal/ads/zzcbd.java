package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public abstract class zzcbd extends zzaqx implements zzcbe {
    public zzcbd() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    public static zzcbe zzq(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
        return queryLocalInterface instanceof zzcbe ? (zzcbe) queryLocalInterface : new zzcbc(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzaqx
    protected final boolean zzbI(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        zzcbl zzcblVar = null;
        zzcbl zzcblVar2 = null;
        zzcbm zzcbmVar = null;
        zzcbh zzcbhVar = null;
        switch (i10) {
            case 1:
                com.google.android.gms.ads.internal.client.zzl zzlVar = (com.google.android.gms.ads.internal.client.zzl) zzaqy.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    zzcblVar = queryLocalInterface instanceof zzcbl ? (zzcbl) queryLocalInterface : new zzcbj(readStrongBinder);
                }
                zzaqy.zzc(parcel);
                zzf(zzlVar, zzcblVar);
                parcel2.writeNoException();
                return true;
            case 2:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
                    zzcbhVar = queryLocalInterface2 instanceof zzcbh ? (zzcbh) queryLocalInterface2 : new zzcbf(readStrongBinder2);
                }
                zzaqy.zzc(parcel);
                zzk(zzcbhVar);
                parcel2.writeNoException();
                return true;
            case 3:
                boolean zzo = zzo();
                parcel2.writeNoException();
                zzaqy.zzd(parcel2, zzo);
                return true;
            case 4:
                String zze = zze();
                parcel2.writeNoException();
                parcel2.writeString(zze);
                return true;
            case 5:
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzaqy.zzc(parcel);
                zzm(asInterface);
                parcel2.writeNoException();
                return true;
            case 6:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener");
                    zzcbmVar = queryLocalInterface3 instanceof zzcbm ? (zzcbm) queryLocalInterface3 : new zzcbm(readStrongBinder3);
                }
                zzaqy.zzc(parcel);
                zzp(zzcbmVar);
                parcel2.writeNoException();
                return true;
            case 7:
                zzaqy.zzc(parcel);
                zzl((zzcbs) zzaqy.zza(parcel, zzcbs.CREATOR));
                parcel2.writeNoException();
                return true;
            case 8:
                com.google.android.gms.ads.internal.client.zzdb zzb = com.google.android.gms.ads.internal.client.zzda.zzb(parcel.readStrongBinder());
                zzaqy.zzc(parcel);
                zzi(zzb);
                parcel2.writeNoException();
                return true;
            case 9:
                Bundle zzb2 = zzb();
                parcel2.writeNoException();
                zzaqy.zzf(parcel2, zzb2);
                return true;
            case 10:
                IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                boolean zzh = zzaqy.zzh(parcel);
                zzaqy.zzc(parcel);
                zzn(asInterface2, zzh);
                parcel2.writeNoException();
                return true;
            case 11:
                zzcbb zzd = zzd();
                parcel2.writeNoException();
                zzaqy.zzg(parcel2, zzd);
                return true;
            case 12:
                com.google.android.gms.ads.internal.client.zzdh zzc = zzc();
                parcel2.writeNoException();
                zzaqy.zzg(parcel2, zzc);
                return true;
            case 13:
                com.google.android.gms.ads.internal.client.zzde zzb3 = com.google.android.gms.ads.internal.client.zzdd.zzb(parcel.readStrongBinder());
                zzaqy.zzc(parcel);
                zzj(zzb3);
                parcel2.writeNoException();
                return true;
            case 14:
                com.google.android.gms.ads.internal.client.zzl zzlVar2 = (com.google.android.gms.ads.internal.client.zzl) zzaqy.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    zzcblVar2 = queryLocalInterface4 instanceof zzcbl ? (zzcbl) queryLocalInterface4 : new zzcbj(readStrongBinder4);
                }
                zzaqy.zzc(parcel);
                zzg(zzlVar2, zzcblVar2);
                parcel2.writeNoException();
                return true;
            case 15:
                boolean zzh2 = zzaqy.zzh(parcel);
                zzaqy.zzc(parcel);
                zzh(zzh2);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
