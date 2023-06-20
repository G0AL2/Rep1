package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public abstract class zzbyj extends zzaqx implements zzbyk {
    public zzbyj() {
        super("com.google.android.gms.ads.internal.query.IUpdateUrlsCallback");
    }

    public static zzbyk zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.query.IUpdateUrlsCallback");
        return queryLocalInterface instanceof zzbyk ? (zzbyk) queryLocalInterface : new zzbyi(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzaqx
    protected final boolean zzbI(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            ArrayList createTypedArrayList = parcel.createTypedArrayList(Uri.CREATOR);
            zzaqy.zzc(parcel);
            zzf(createTypedArrayList);
        } else if (i10 != 2) {
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
