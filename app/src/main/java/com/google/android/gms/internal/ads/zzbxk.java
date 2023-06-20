package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public abstract class zzbxk extends zzaqx implements zzbxl {
    public zzbxk() {
        super("com.google.android.gms.ads.internal.offline.IOfflineUtils");
    }

    public static zzbxl zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
        return queryLocalInterface instanceof zzbxl ? (zzbxl) queryLocalInterface : new zzbxj(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzaqx
    protected final boolean zzbI(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            zzaqy.zzc(parcel);
            zze((Intent) zzaqy.zza(parcel, Intent.CREATOR));
        } else if (i10 == 2) {
            IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            zzaqy.zzc(parcel);
            zzg(asInterface, readString, readString2);
        } else if (i10 != 3) {
            return false;
        } else {
            zzf();
        }
        parcel2.writeNoException();
        return true;
    }
}
