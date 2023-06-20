package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public abstract class zzbcm extends zzaqx implements zzbcn {
    public zzbcm() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzaqx
    protected final boolean zzbI(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            zzf();
        } else if (i10 == 2) {
            zzc();
        } else if (i10 == 3) {
            zzaqy.zzc(parcel);
            zzd((com.google.android.gms.ads.internal.client.zze) zzaqy.zza(parcel, com.google.android.gms.ads.internal.client.zze.CREATOR));
        } else if (i10 == 4) {
            zze();
        } else if (i10 != 5) {
            return false;
        } else {
            zzb();
        }
        parcel2.writeNoException();
        return true;
    }
}
