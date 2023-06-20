package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public abstract class zzbci extends zzaqx implements zzbcj {
    public zzbci() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
    }

    public static zzbcj zze(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
        return queryLocalInterface instanceof zzbcj ? (zzbcj) queryLocalInterface : new zzbch(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzaqx
    protected final boolean zzbI(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        zzbcg zzbceVar;
        if (i10 == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                zzbceVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
                zzbceVar = queryLocalInterface instanceof zzbcg ? (zzbcg) queryLocalInterface : new zzbce(readStrongBinder);
            }
            zzaqy.zzc(parcel);
            zzd(zzbceVar);
        } else if (i10 == 2) {
            parcel.readInt();
            zzaqy.zzc(parcel);
        } else if (i10 != 3) {
            return false;
        } else {
            zzaqy.zzc(parcel);
            zzc((com.google.android.gms.ads.internal.client.zze) zzaqy.zza(parcel, com.google.android.gms.ads.internal.client.zze.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
