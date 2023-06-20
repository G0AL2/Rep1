package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public abstract class zzblr extends zzaqx implements zzbls {
    public zzblr() {
        super("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
    }

    @Override // com.google.android.gms.internal.ads.zzaqx
    protected final boolean zzbI(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        switch (i10) {
            case 2:
                IObjectWrapper zzg = zzg();
                parcel2.writeNoException();
                zzaqy.zzg(parcel2, zzg);
                return true;
            case 3:
                String zzk = zzk();
                parcel2.writeNoException();
                parcel2.writeString(zzk);
                return true;
            case 4:
                List zzm = zzm();
                parcel2.writeNoException();
                parcel2.writeList(zzm);
                return true;
            case 5:
                String zzi = zzi();
                parcel2.writeNoException();
                parcel2.writeString(zzi);
                return true;
            case 6:
                zzblb zze = zze();
                parcel2.writeNoException();
                zzaqy.zzg(parcel2, zze);
                return true;
            case 7:
                String zzj = zzj();
                parcel2.writeNoException();
                parcel2.writeString(zzj);
                return true;
            case 8:
                String zzh = zzh();
                parcel2.writeNoException();
                parcel2.writeString(zzh);
                return true;
            case 9:
                Bundle zzb = zzb();
                parcel2.writeNoException();
                zzaqy.zzf(parcel2, zzb);
                return true;
            case 10:
                zzn();
                parcel2.writeNoException();
                return true;
            case 11:
                com.google.android.gms.ads.internal.client.zzdk zzc = zzc();
                parcel2.writeNoException();
                zzaqy.zzg(parcel2, zzc);
                return true;
            case 12:
                zzaqy.zzc(parcel);
                zzo((Bundle) zzaqy.zza(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 13:
                zzaqy.zzc(parcel);
                boolean zzq = zzq((Bundle) zzaqy.zza(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                zzaqy.zzd(parcel2, zzq);
                return true;
            case 14:
                zzaqy.zzc(parcel);
                zzp((Bundle) zzaqy.zza(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 15:
                zzbkt zzd = zzd();
                parcel2.writeNoException();
                zzaqy.zzg(parcel2, zzd);
                return true;
            case 16:
                IObjectWrapper zzf = zzf();
                parcel2.writeNoException();
                zzaqy.zzg(parcel2, zzf);
                return true;
            case 17:
                String zzl = zzl();
                parcel2.writeNoException();
                parcel2.writeString(zzl);
                return true;
            default:
                return false;
        }
    }
}
