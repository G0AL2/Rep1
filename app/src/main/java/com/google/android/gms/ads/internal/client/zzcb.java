package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzaqx;
import com.google.android.gms.internal.ads.zzaqy;
import com.google.android.gms.internal.ads.zzblf;
import com.google.android.gms.internal.ads.zzbll;
import com.google.android.gms.internal.ads.zzbpg;
import com.google.android.gms.internal.ads.zzbph;
import com.google.android.gms.internal.ads.zzbpk;
import com.google.android.gms.internal.ads.zzbtz;
import com.google.android.gms.internal.ads.zzbua;
import com.google.android.gms.internal.ads.zzbxl;
import com.google.android.gms.internal.ads.zzbxv;
import com.google.android.gms.internal.ads.zzcao;
import com.google.android.gms.internal.ads.zzcbe;
import com.google.android.gms.internal.ads.zzcdz;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public abstract class zzcb extends zzaqx implements zzcc {
    public zzcb() {
        super("com.google.android.gms.ads.internal.client.IClientApi");
    }

    @Override // com.google.android.gms.internal.ads.zzaqx
    protected final boolean zzbI(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        switch (i10) {
            case 1:
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzq zzqVar = (zzq) zzaqy.zza(parcel, zzq.CREATOR);
                String readString = parcel.readString();
                zzbua zzf = zzbtz.zzf(parcel.readStrongBinder());
                int readInt = parcel.readInt();
                zzaqy.zzc(parcel);
                zzbs zzd = zzd(asInterface, zzqVar, readString, zzf, readInt);
                parcel2.writeNoException();
                zzaqy.zzg(parcel2, zzd);
                return true;
            case 2:
                IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzq zzqVar2 = (zzq) zzaqy.zza(parcel, zzq.CREATOR);
                String readString2 = parcel.readString();
                zzbua zzf2 = zzbtz.zzf(parcel.readStrongBinder());
                int readInt2 = parcel.readInt();
                zzaqy.zzc(parcel);
                zzbs zze = zze(asInterface2, zzqVar2, readString2, zzf2, readInt2);
                parcel2.writeNoException();
                zzaqy.zzg(parcel2, zze);
                return true;
            case 3:
                IObjectWrapper asInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                String readString3 = parcel.readString();
                zzbua zzf3 = zzbtz.zzf(parcel.readStrongBinder());
                int readInt3 = parcel.readInt();
                zzaqy.zzc(parcel);
                zzbo zzb = zzb(asInterface3, readString3, zzf3, readInt3);
                parcel2.writeNoException();
                zzaqy.zzg(parcel2, zzb);
                return true;
            case 4:
                IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzaqy.zzc(parcel);
                parcel2.writeNoException();
                zzaqy.zzg(parcel2, null);
                return true;
            case 5:
                IObjectWrapper asInterface4 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper asInterface5 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzaqy.zzc(parcel);
                zzblf zzh = zzh(asInterface4, asInterface5);
                parcel2.writeNoException();
                zzaqy.zzg(parcel2, zzh);
                return true;
            case 6:
                IObjectWrapper asInterface6 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbua zzf4 = zzbtz.zzf(parcel.readStrongBinder());
                int readInt4 = parcel.readInt();
                zzaqy.zzc(parcel);
                zzcao zzm = zzm(asInterface6, zzf4, readInt4);
                parcel2.writeNoException();
                zzaqy.zzg(parcel2, zzm);
                return true;
            case 7:
                IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzaqy.zzc(parcel);
                parcel2.writeNoException();
                zzaqy.zzg(parcel2, null);
                return true;
            case 8:
                IObjectWrapper asInterface7 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzaqy.zzc(parcel);
                zzbxv zzl = zzl(asInterface7);
                parcel2.writeNoException();
                zzaqy.zzg(parcel2, zzl);
                return true;
            case 9:
                IObjectWrapper asInterface8 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                int readInt5 = parcel.readInt();
                zzaqy.zzc(parcel);
                zzcm zzg = zzg(asInterface8, readInt5);
                parcel2.writeNoException();
                zzaqy.zzg(parcel2, zzg);
                return true;
            case 10:
                String readString4 = parcel.readString();
                int readInt6 = parcel.readInt();
                zzaqy.zzc(parcel);
                zzbs zzf5 = zzf(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), (zzq) zzaqy.zza(parcel, zzq.CREATOR), readString4, readInt6);
                parcel2.writeNoException();
                zzaqy.zzg(parcel2, zzf5);
                return true;
            case 11:
                IObjectWrapper asInterface9 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper asInterface10 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper asInterface11 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzaqy.zzc(parcel);
                zzbll zzi = zzi(asInterface9, asInterface10, asInterface11);
                parcel2.writeNoException();
                zzaqy.zzg(parcel2, zzi);
                return true;
            case 12:
                IObjectWrapper asInterface12 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                String readString5 = parcel.readString();
                zzbua zzf6 = zzbtz.zzf(parcel.readStrongBinder());
                int readInt7 = parcel.readInt();
                zzaqy.zzc(parcel);
                zzcbe zzn = zzn(asInterface12, readString5, zzf6, readInt7);
                parcel2.writeNoException();
                zzaqy.zzg(parcel2, zzn);
                return true;
            case 13:
                IObjectWrapper asInterface13 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzq zzqVar3 = (zzq) zzaqy.zza(parcel, zzq.CREATOR);
                String readString6 = parcel.readString();
                zzbua zzf7 = zzbtz.zzf(parcel.readStrongBinder());
                int readInt8 = parcel.readInt();
                zzaqy.zzc(parcel);
                zzbs zzc = zzc(asInterface13, zzqVar3, readString6, zzf7, readInt8);
                parcel2.writeNoException();
                zzaqy.zzg(parcel2, zzc);
                return true;
            case 14:
                IObjectWrapper asInterface14 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbua zzf8 = zzbtz.zzf(parcel.readStrongBinder());
                int readInt9 = parcel.readInt();
                zzaqy.zzc(parcel);
                zzcdz zzo = zzo(asInterface14, zzf8, readInt9);
                parcel2.writeNoException();
                zzaqy.zzg(parcel2, zzo);
                return true;
            case 15:
                IObjectWrapper asInterface15 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbua zzf9 = zzbtz.zzf(parcel.readStrongBinder());
                int readInt10 = parcel.readInt();
                zzaqy.zzc(parcel);
                zzbxl zzk = zzk(asInterface15, zzf9, readInt10);
                parcel2.writeNoException();
                zzaqy.zzg(parcel2, zzk);
                return true;
            case 16:
                IObjectWrapper asInterface16 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbua zzf10 = zzbtz.zzf(parcel.readStrongBinder());
                int readInt11 = parcel.readInt();
                zzbph zzc2 = zzbpg.zzc(parcel.readStrongBinder());
                zzaqy.zzc(parcel);
                zzbpk zzj = zzj(asInterface16, zzf10, readInt11, zzc2);
                parcel2.writeNoException();
                zzaqy.zzg(parcel2, zzj);
                return true;
            default:
                return false;
        }
    }
}
