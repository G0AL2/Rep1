package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbpl extends zzaqw implements zzbpn {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbpl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.h5.client.IH5AdsManagerCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzbpn
    public final zzbpk zze(IObjectWrapper iObjectWrapper, zzbua zzbuaVar, int i10, zzbph zzbphVar) throws RemoteException {
        zzbpk zzbpiVar;
        Parcel zza = zza();
        zzaqy.zzg(zza, iObjectWrapper);
        zzaqy.zzg(zza, zzbuaVar);
        zza.writeInt(221908000);
        zzaqy.zzg(zza, zzbphVar);
        Parcel zzbk = zzbk(1, zza);
        IBinder readStrongBinder = zzbk.readStrongBinder();
        if (readStrongBinder == null) {
            zzbpiVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.h5.client.IH5AdsManager");
            zzbpiVar = queryLocalInterface instanceof zzbpk ? (zzbpk) queryLocalInterface : new zzbpi(readStrongBinder);
        }
        zzbk.recycle();
        return zzbpiVar;
    }
}
