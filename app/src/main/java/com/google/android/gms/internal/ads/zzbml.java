package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public abstract class zzbml extends zzaqx implements zzbmm {
    public zzbml() {
        super("com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
    }

    public static zzbmm zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
        return queryLocalInterface instanceof zzbmm ? (zzbmm) queryLocalInterface : new zzbmk(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzaqx
    protected final boolean zzbI(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            com.google.android.gms.ads.internal.client.zzbs zzac = com.google.android.gms.ads.internal.client.zzbr.zzac(parcel.readStrongBinder());
            IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            zzaqy.zzc(parcel);
            zze(zzac, asInterface);
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
