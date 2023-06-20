package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzaqw;
import com.google.android.gms.internal.ads.zzaqy;
import com.google.android.gms.internal.ads.zzbtz;
import com.google.android.gms.internal.ads.zzbua;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzch extends zzaqw implements zzcj {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzch(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.ILiteSdkInfo");
    }

    @Override // com.google.android.gms.ads.internal.client.zzcj
    public final zzbua getAdapterCreator() throws RemoteException {
        Parcel zzbk = zzbk(2, zza());
        zzbua zzf = zzbtz.zzf(zzbk.readStrongBinder());
        zzbk.recycle();
        return zzf;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcj
    public final zzeh getLiteSdkVersion() throws RemoteException {
        Parcel zzbk = zzbk(1, zza());
        zzeh zzehVar = (zzeh) zzaqy.zza(zzbk, zzeh.CREATOR);
        zzbk.recycle();
        return zzehVar;
    }
}
