package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public abstract class zzbiq extends zzaqx implements zzbir {
    public zzbiq() {
        super("com.google.android.gms.ads.internal.customrenderedad.client.ICustomRenderedAd");
    }

    @Override // com.google.android.gms.internal.ads.zzaqx
    protected final boolean zzbI(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            String zzb = zzb();
            parcel2.writeNoException();
            parcel2.writeString(zzb);
        } else if (i10 == 2) {
            String zzc = zzc();
            parcel2.writeNoException();
            parcel2.writeString(zzc);
        } else if (i10 == 3) {
            IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            zzaqy.zzc(parcel);
            zzd(asInterface);
            parcel2.writeNoException();
        } else if (i10 == 4) {
            zze();
            parcel2.writeNoException();
        } else if (i10 != 5) {
            return false;
        } else {
            zzf();
            parcel2.writeNoException();
        }
        return true;
    }
}
