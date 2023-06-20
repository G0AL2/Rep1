package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbxm extends zzaqw implements zzbxo {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbxm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.offline.IOfflineUtilsCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzbxo
    public final zzbxl zze(IObjectWrapper iObjectWrapper, zzbua zzbuaVar, int i10) throws RemoteException {
        zzbxl zzbxjVar;
        Parcel zza = zza();
        zzaqy.zzg(zza, iObjectWrapper);
        zzaqy.zzg(zza, zzbuaVar);
        zza.writeInt(221908000);
        Parcel zzbk = zzbk(1, zza);
        IBinder readStrongBinder = zzbk.readStrongBinder();
        if (readStrongBinder == null) {
            zzbxjVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
            zzbxjVar = queryLocalInterface instanceof zzbxl ? (zzbxl) queryLocalInterface : new zzbxj(readStrongBinder);
        }
        zzbk.recycle();
        return zzbxjVar;
    }
}
