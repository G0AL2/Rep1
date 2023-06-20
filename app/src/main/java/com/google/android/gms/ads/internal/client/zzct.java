package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzaqx;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public abstract class zzct extends zzaqx implements zzcu {
    public zzct() {
        super("com.google.android.gms.ads.internal.client.IMuteThisAdReason");
    }

    public static zzcu zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMuteThisAdReason");
        return queryLocalInterface instanceof zzcu ? (zzcu) queryLocalInterface : new zzcs(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzaqx
    protected final boolean zzbI(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            String zze = zze();
            parcel2.writeNoException();
            parcel2.writeString(zze);
        } else if (i10 != 2) {
            return false;
        } else {
            String zzf = zzf();
            parcel2.writeNoException();
            parcel2.writeString(zzf);
        }
        return true;
    }
}
