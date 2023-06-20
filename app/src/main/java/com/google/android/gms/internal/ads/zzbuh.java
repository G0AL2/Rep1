package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbuh extends zzaqw implements zzbuj {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbuh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbuj
    public final IObjectWrapper zze() throws RemoteException {
        Parcel zzbk = zzbk(1, zza());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzbk.readStrongBinder());
        zzbk.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzbuj
    public final boolean zzf() throws RemoteException {
        Parcel zzbk = zzbk(2, zza());
        boolean zzh = zzaqy.zzh(zzbk);
        zzbk.recycle();
        return zzh;
    }
}
