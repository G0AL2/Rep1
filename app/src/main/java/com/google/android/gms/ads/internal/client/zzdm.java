package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzaqx;
import com.google.android.gms.internal.ads.zzaqy;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public abstract class zzdm extends zzaqx implements zzdn {
    public zzdm() {
        super("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
    }

    @Override // com.google.android.gms.internal.ads.zzaqx
    protected final boolean zzbI(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            zzi();
        } else if (i10 == 2) {
            zzh();
        } else if (i10 == 3) {
            zzg();
        } else if (i10 == 4) {
            zze();
        } else if (i10 != 5) {
            return false;
        } else {
            boolean zzh = zzaqy.zzh(parcel);
            zzaqy.zzc(parcel);
            zzf(zzh);
        }
        parcel2.writeNoException();
        return true;
    }
}
