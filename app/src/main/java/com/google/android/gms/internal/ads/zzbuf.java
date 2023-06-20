package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public abstract class zzbuf extends zzaqx implements zzbug {
    public zzbuf() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    public static zzbug zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
        return queryLocalInterface instanceof zzbug ? (zzbug) queryLocalInterface : new zzbue(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzaqx
    protected final boolean zzbI(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        switch (i10) {
            case 1:
                zze();
                break;
            case 2:
                zzf();
                break;
            case 3:
                int readInt = parcel.readInt();
                zzaqy.zzc(parcel);
                zzg(readInt);
                break;
            case 4:
                zzn();
                break;
            case 5:
                zzp();
                break;
            case 6:
                zzo();
                break;
            case 7:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata");
                    if (queryLocalInterface instanceof zzbuk) {
                        zzbuk zzbukVar = (zzbuk) queryLocalInterface;
                    }
                }
                zzaqy.zzc(parcel);
                break;
            case 8:
                zzm();
                break;
            case 9:
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                zzaqy.zzc(parcel);
                zzq(readString, readString2);
                break;
            case 10:
                zzblu.zzb(parcel.readStrongBinder());
                parcel.readString();
                zzaqy.zzc(parcel);
                break;
            case 11:
                zzv();
                break;
            case 12:
                parcel.readString();
                zzaqy.zzc(parcel);
                break;
            case 13:
                zzy();
                break;
            case 14:
                zzaqy.zzc(parcel);
                zzs((zzcax) zzaqy.zza(parcel, zzcax.CREATOR));
                break;
            case 15:
                zzw();
                break;
            case 16:
                zzcbb zzb = zzcba.zzb(parcel.readStrongBinder());
                zzaqy.zzc(parcel);
                zzt(zzb);
                break;
            case 17:
                int readInt2 = parcel.readInt();
                zzaqy.zzc(parcel);
                zzj(readInt2);
                break;
            case 18:
                zzu();
                break;
            case 19:
                Bundle bundle = (Bundle) zzaqy.zza(parcel, Bundle.CREATOR);
                zzaqy.zzc(parcel);
                break;
            case 20:
                zzx();
                break;
            case 21:
                String readString3 = parcel.readString();
                zzaqy.zzc(parcel);
                zzl(readString3);
                break;
            case 22:
                int readInt3 = parcel.readInt();
                String readString4 = parcel.readString();
                zzaqy.zzc(parcel);
                zzi(readInt3, readString4);
                break;
            case 23:
                zzaqy.zzc(parcel);
                zzh((com.google.android.gms.ads.internal.client.zze) zzaqy.zza(parcel, com.google.android.gms.ads.internal.client.zze.CREATOR));
                break;
            case 24:
                zzaqy.zzc(parcel);
                zzk((com.google.android.gms.ads.internal.client.zze) zzaqy.zza(parcel, com.google.android.gms.ads.internal.client.zze.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
