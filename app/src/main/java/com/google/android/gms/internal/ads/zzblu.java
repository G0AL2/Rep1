package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public abstract class zzblu extends zzaqx implements zzblv {
    public zzblu() {
        super("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    public static zzblv zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
        return queryLocalInterface instanceof zzblv ? (zzblv) queryLocalInterface : new zzblt(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzaqx
    protected final boolean zzbI(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        switch (i10) {
            case 1:
                String readString = parcel.readString();
                zzaqy.zzc(parcel);
                String zzi = zzi(readString);
                parcel2.writeNoException();
                parcel2.writeString(zzi);
                return true;
            case 2:
                String readString2 = parcel.readString();
                zzaqy.zzc(parcel);
                zzblb zzf = zzf(readString2);
                parcel2.writeNoException();
                zzaqy.zzg(parcel2, zzf);
                return true;
            case 3:
                List<String> zzj = zzj();
                parcel2.writeNoException();
                parcel2.writeStringList(zzj);
                return true;
            case 4:
                String zzh = zzh();
                parcel2.writeNoException();
                parcel2.writeString(zzh);
                return true;
            case 5:
                String readString3 = parcel.readString();
                zzaqy.zzc(parcel);
                zzm(readString3);
                parcel2.writeNoException();
                return true;
            case 6:
                zzn();
                parcel2.writeNoException();
                return true;
            case 7:
                com.google.android.gms.ads.internal.client.zzdk zze = zze();
                parcel2.writeNoException();
                zzaqy.zzg(parcel2, zze);
                return true;
            case 8:
                zzk();
                parcel2.writeNoException();
                return true;
            case 9:
                IObjectWrapper zzg = zzg();
                parcel2.writeNoException();
                zzaqy.zzg(parcel2, zzg);
                return true;
            case 10:
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzaqy.zzc(parcel);
                boolean zzq = zzq(asInterface);
                parcel2.writeNoException();
                zzaqy.zzd(parcel2, zzq);
                return true;
            case 11:
                parcel2.writeNoException();
                zzaqy.zzg(parcel2, null);
                return true;
            case 12:
                boolean zzp = zzp();
                parcel2.writeNoException();
                zzaqy.zzd(parcel2, zzp);
                return true;
            case 13:
                boolean zzr = zzr();
                parcel2.writeNoException();
                zzaqy.zzd(parcel2, zzr);
                return true;
            case 14:
                IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzaqy.zzc(parcel);
                zzo(asInterface2);
                parcel2.writeNoException();
                return true;
            case 15:
                zzl();
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
