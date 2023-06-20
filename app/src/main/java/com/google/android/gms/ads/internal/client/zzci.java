package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzaqx;
import com.google.android.gms.internal.ads.zzaqy;
import com.google.android.gms.internal.ads.zzbua;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public abstract class zzci extends zzaqx implements zzcj {
    public zzci() {
        super("com.google.android.gms.ads.internal.client.ILiteSdkInfo");
    }

    public static zzcj asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.ILiteSdkInfo");
        return queryLocalInterface instanceof zzcj ? (zzcj) queryLocalInterface : new zzch(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzaqx
    protected final boolean zzbI(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            zzeh liteSdkVersion = getLiteSdkVersion();
            parcel2.writeNoException();
            zzaqy.zzf(parcel2, liteSdkVersion);
        } else if (i10 != 2) {
            return false;
        } else {
            zzbua adapterCreator = getAdapterCreator();
            parcel2.writeNoException();
            zzaqy.zzg(parcel2, adapterCreator);
        }
        return true;
    }
}
