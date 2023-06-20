package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public abstract class zzbpx extends zzaqx implements zzbpy {
    public zzbpx() {
        super("com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzaqx
    protected final boolean zzbI(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            zzaqy.zzc(parcel);
            zzb((ParcelFileDescriptor) zzaqy.zza(parcel, ParcelFileDescriptor.CREATOR));
            return true;
        }
        return false;
    }
}
