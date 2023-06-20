package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzaqx;
import com.google.android.gms.internal.ads.zzaqy;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public abstract class zzdg extends zzaqx implements zzdh {
    public zzdg() {
        super("com.google.android.gms.ads.internal.client.IResponseInfo");
    }

    public static zzdh zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
        return queryLocalInterface instanceof zzdh ? (zzdh) queryLocalInterface : new zzdf(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzaqx
    protected final boolean zzbI(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            String zzg = zzg();
            parcel2.writeNoException();
            parcel2.writeString(zzg);
        } else if (i10 == 2) {
            String zzh = zzh();
            parcel2.writeNoException();
            parcel2.writeString(zzh);
        } else if (i10 == 3) {
            List zzi = zzi();
            parcel2.writeNoException();
            parcel2.writeTypedList(zzi);
        } else if (i10 == 4) {
            zzu zzf = zzf();
            parcel2.writeNoException();
            zzaqy.zzf(parcel2, zzf);
        } else if (i10 != 5) {
            return false;
        } else {
            Bundle zze = zze();
            parcel2.writeNoException();
            zzaqy.zzf(parcel2, zze);
        }
        return true;
    }
}
