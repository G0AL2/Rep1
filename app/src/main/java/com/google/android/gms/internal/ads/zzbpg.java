package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public abstract class zzbpg extends zzaqx implements zzbph {
    public zzbpg() {
        super("com.google.android.gms.ads.internal.h5.client.IH5AdsEventListener");
    }

    public static zzbph zzc(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.h5.client.IH5AdsEventListener");
        return queryLocalInterface instanceof zzbph ? (zzbph) queryLocalInterface : new zzbpf(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzaqx
    protected final boolean zzbI(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            String readString = parcel.readString();
            zzaqy.zzc(parcel);
            zzb(readString);
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
