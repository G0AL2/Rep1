package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public abstract class zzbzq extends zzaqx implements zzbzr {
    public zzbzq() {
        super("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    @Override // com.google.android.gms.internal.ads.zzaqx
    protected final boolean zzbI(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            zzaqy.zzc(parcel);
            zzf((ParcelFileDescriptor) zzaqy.zza(parcel, ParcelFileDescriptor.CREATOR));
        } else if (i10 != 2) {
            return false;
        } else {
            zzaqy.zzc(parcel);
            zze((com.google.android.gms.ads.internal.util.zzaz) zzaqy.zza(parcel, com.google.android.gms.ads.internal.util.zzaz.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
