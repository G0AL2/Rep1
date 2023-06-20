package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public abstract class zzbmr extends zzaqx implements zzbms {
    public zzbmr() {
        super("com.google.android.gms.ads.internal.formats.client.IShouldDelayBannerRenderingListener");
    }

    public static zzbms zzc(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IShouldDelayBannerRenderingListener");
        return queryLocalInterface instanceof zzbms ? (zzbms) queryLocalInterface : new zzbmq(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzaqx
    protected final boolean zzbI(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 2) {
            IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            zzaqy.zzc(parcel);
            boolean zzb = zzb(asInterface);
            parcel2.writeNoException();
            zzaqy.zzd(parcel2, zzb);
            return true;
        }
        return false;
    }
}
