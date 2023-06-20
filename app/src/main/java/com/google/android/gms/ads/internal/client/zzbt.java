package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzaqw;
import com.google.android.gms.internal.ads.zzaqy;
import com.google.android.gms.internal.ads.zzbua;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbt extends zzaqw {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbt(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManagerCreator");
    }

    public final IBinder zze(IObjectWrapper iObjectWrapper, zzq zzqVar, String str, zzbua zzbuaVar, int i10, int i11) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zzg(zza, iObjectWrapper);
        zzaqy.zze(zza, zzqVar);
        zza.writeString(str);
        zzaqy.zzg(zza, zzbuaVar);
        zza.writeInt(221908000);
        zza.writeInt(i11);
        Parcel zzbk = zzbk(2, zza);
        IBinder readStrongBinder = zzbk.readStrongBinder();
        zzbk.recycle();
        return readStrongBinder;
    }
}
