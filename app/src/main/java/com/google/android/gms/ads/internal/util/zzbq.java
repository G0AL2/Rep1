package com.google.android.gms.ads.internal.util;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzaqx;
import com.google.android.gms.internal.ads.zzaqy;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public abstract class zzbq extends zzaqx implements zzbr {
    public zzbq() {
        super("com.google.android.gms.ads.internal.util.IWorkManagerUtil");
    }

    @Override // com.google.android.gms.internal.ads.zzaqx
    protected final boolean zzbI(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            zzaqy.zzc(parcel);
            boolean zzf = zzf(asInterface, readString, readString2);
            parcel2.writeNoException();
            zzaqy.zzd(parcel2, zzf);
        } else if (i10 != 2) {
            return false;
        } else {
            IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            zzaqy.zzc(parcel);
            zze(asInterface2);
            parcel2.writeNoException();
        }
        return true;
    }
}
