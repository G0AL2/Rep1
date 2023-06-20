package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public abstract class zzbqj extends zzaqx implements zzbqk {
    public zzbqj() {
        super("com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
    }

    public static zzbqk zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
        return queryLocalInterface instanceof zzbqk ? (zzbqk) queryLocalInterface : new zzbqi(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzaqx
    protected final boolean zzbI(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 2) {
            zzf();
        } else if (i10 != 3) {
            return false;
        } else {
            String readString = parcel.readString();
            zzaqy.zzc(parcel);
            zze(readString);
        }
        parcel2.writeNoException();
        return true;
    }
}
