package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzcna extends zzaqw implements zzcnc {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcna(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.measurement.IMeasurementManager");
    }

    @Override // com.google.android.gms.internal.ads.zzcnc
    public final void zze(IObjectWrapper iObjectWrapper, zzcmz zzcmzVar) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zzg(zza, iObjectWrapper);
        zzaqy.zzg(zza, zzcmzVar);
        zzbl(2, zza);
    }
}
