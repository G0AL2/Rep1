package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public abstract class zzbui extends zzaqx implements zzbuj {
    public zzbui() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
    }

    public static zzbuj zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
        return queryLocalInterface instanceof zzbuj ? (zzbuj) queryLocalInterface : new zzbuh(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzaqx
    protected final boolean zzbI(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            IObjectWrapper zze = zze();
            parcel2.writeNoException();
            zzaqy.zzg(parcel2, zze);
        } else if (i10 != 2) {
            return false;
        } else {
            boolean zzf = zzf();
            parcel2.writeNoException();
            zzaqy.zzd(parcel2, zzf);
        }
        return true;
    }
}
