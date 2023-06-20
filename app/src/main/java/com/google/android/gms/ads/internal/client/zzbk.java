package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzaqx;
import com.google.android.gms.internal.ads.zzaqy;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public abstract class zzbk extends zzaqx implements zzbl {
    public zzbk() {
        super("com.google.android.gms.ads.internal.client.IAdLoader");
    }

    @Override // com.google.android.gms.internal.ads.zzaqx
    protected final boolean zzbI(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            zzaqy.zzc(parcel);
            zzg((zzl) zzaqy.zza(parcel, zzl.CREATOR));
            parcel2.writeNoException();
        } else if (i10 == 2) {
            String zze = zze();
            parcel2.writeNoException();
            parcel2.writeString(zze);
        } else if (i10 == 3) {
            boolean zzi = zzi();
            parcel2.writeNoException();
            zzaqy.zzd(parcel2, zzi);
        } else if (i10 == 4) {
            String zzf = zzf();
            parcel2.writeNoException();
            parcel2.writeString(zzf);
        } else if (i10 != 5) {
            return false;
        } else {
            int readInt = parcel.readInt();
            zzaqy.zzc(parcel);
            zzh((zzl) zzaqy.zza(parcel, zzl.CREATOR), readInt);
            parcel2.writeNoException();
        }
        return true;
    }
}
