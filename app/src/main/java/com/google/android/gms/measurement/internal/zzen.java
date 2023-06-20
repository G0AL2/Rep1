package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.2 */
/* loaded from: classes2.dex */
public abstract class zzen extends com.google.android.gms.internal.measurement.zzbn implements zzeo {
    public zzen() {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // com.google.android.gms.internal.measurement.zzbn
    protected final boolean zza(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        switch (i10) {
            case 1:
                com.google.android.gms.internal.measurement.zzbo.zzc(parcel);
                zzk((zzav) com.google.android.gms.internal.measurement.zzbo.zza(parcel, zzav.CREATOR), (zzp) com.google.android.gms.internal.measurement.zzbo.zza(parcel, zzp.CREATOR));
                parcel2.writeNoException();
                return true;
            case 2:
                com.google.android.gms.internal.measurement.zzbo.zzc(parcel);
                zzt((zzll) com.google.android.gms.internal.measurement.zzbo.zza(parcel, zzll.CREATOR), (zzp) com.google.android.gms.internal.measurement.zzbo.zza(parcel, zzp.CREATOR));
                parcel2.writeNoException();
                return true;
            case 3:
            case 8:
            default:
                return false;
            case 4:
                com.google.android.gms.internal.measurement.zzbo.zzc(parcel);
                zzj((zzp) com.google.android.gms.internal.measurement.zzbo.zza(parcel, zzp.CREATOR));
                parcel2.writeNoException();
                return true;
            case 5:
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                com.google.android.gms.internal.measurement.zzbo.zzc(parcel);
                zzl((zzav) com.google.android.gms.internal.measurement.zzbo.zza(parcel, zzav.CREATOR), readString, readString2);
                parcel2.writeNoException();
                return true;
            case 6:
                com.google.android.gms.internal.measurement.zzbo.zzc(parcel);
                zzs((zzp) com.google.android.gms.internal.measurement.zzbo.zza(parcel, zzp.CREATOR));
                parcel2.writeNoException();
                return true;
            case 7:
                boolean zzg = com.google.android.gms.internal.measurement.zzbo.zzg(parcel);
                com.google.android.gms.internal.measurement.zzbo.zzc(parcel);
                List zze = zze((zzp) com.google.android.gms.internal.measurement.zzbo.zza(parcel, zzp.CREATOR), zzg);
                parcel2.writeNoException();
                parcel2.writeTypedList(zze);
                return true;
            case 9:
                String readString3 = parcel.readString();
                com.google.android.gms.internal.measurement.zzbo.zzc(parcel);
                byte[] zzu = zzu((zzav) com.google.android.gms.internal.measurement.zzbo.zza(parcel, zzav.CREATOR), readString3);
                parcel2.writeNoException();
                parcel2.writeByteArray(zzu);
                return true;
            case 10:
                long readLong = parcel.readLong();
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                com.google.android.gms.internal.measurement.zzbo.zzc(parcel);
                zzq(readLong, readString4, readString5, readString6);
                parcel2.writeNoException();
                return true;
            case 11:
                com.google.android.gms.internal.measurement.zzbo.zzc(parcel);
                String zzd = zzd((zzp) com.google.android.gms.internal.measurement.zzbo.zza(parcel, zzp.CREATOR));
                parcel2.writeNoException();
                parcel2.writeString(zzd);
                return true;
            case 12:
                com.google.android.gms.internal.measurement.zzbo.zzc(parcel);
                zzn((zzab) com.google.android.gms.internal.measurement.zzbo.zza(parcel, zzab.CREATOR), (zzp) com.google.android.gms.internal.measurement.zzbo.zza(parcel, zzp.CREATOR));
                parcel2.writeNoException();
                return true;
            case 13:
                com.google.android.gms.internal.measurement.zzbo.zzc(parcel);
                zzo((zzab) com.google.android.gms.internal.measurement.zzbo.zza(parcel, zzab.CREATOR));
                parcel2.writeNoException();
                return true;
            case 14:
                com.google.android.gms.internal.measurement.zzbo.zzc(parcel);
                List zzh = zzh(parcel.readString(), parcel.readString(), com.google.android.gms.internal.measurement.zzbo.zzg(parcel), (zzp) com.google.android.gms.internal.measurement.zzbo.zza(parcel, zzp.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(zzh);
                return true;
            case 15:
                String readString7 = parcel.readString();
                String readString8 = parcel.readString();
                String readString9 = parcel.readString();
                boolean zzg2 = com.google.android.gms.internal.measurement.zzbo.zzg(parcel);
                com.google.android.gms.internal.measurement.zzbo.zzc(parcel);
                List zzi = zzi(readString7, readString8, readString9, zzg2);
                parcel2.writeNoException();
                parcel2.writeTypedList(zzi);
                return true;
            case 16:
                com.google.android.gms.internal.measurement.zzbo.zzc(parcel);
                List zzf = zzf(parcel.readString(), parcel.readString(), (zzp) com.google.android.gms.internal.measurement.zzbo.zza(parcel, zzp.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(zzf);
                return true;
            case 17:
                String readString10 = parcel.readString();
                String readString11 = parcel.readString();
                String readString12 = parcel.readString();
                com.google.android.gms.internal.measurement.zzbo.zzc(parcel);
                List zzg3 = zzg(readString10, readString11, readString12);
                parcel2.writeNoException();
                parcel2.writeTypedList(zzg3);
                return true;
            case 18:
                com.google.android.gms.internal.measurement.zzbo.zzc(parcel);
                zzm((zzp) com.google.android.gms.internal.measurement.zzbo.zza(parcel, zzp.CREATOR));
                parcel2.writeNoException();
                return true;
            case 19:
                com.google.android.gms.internal.measurement.zzbo.zzc(parcel);
                zzr((Bundle) com.google.android.gms.internal.measurement.zzbo.zza(parcel, Bundle.CREATOR), (zzp) com.google.android.gms.internal.measurement.zzbo.zza(parcel, zzp.CREATOR));
                parcel2.writeNoException();
                return true;
            case 20:
                com.google.android.gms.internal.measurement.zzbo.zzc(parcel);
                zzp((zzp) com.google.android.gms.internal.measurement.zzbo.zza(parcel, zzp.CREATOR));
                parcel2.writeNoException();
                return true;
        }
    }
}
