package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzcbi extends zzaqw {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcbi(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCreator");
    }

    public final IBinder zze(IObjectWrapper iObjectWrapper, String str, zzbua zzbuaVar, int i10) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zzg(zza, iObjectWrapper);
        zza.writeString(str);
        zzaqy.zzg(zza, zzbuaVar);
        zza.writeInt(221908000);
        Parcel zzbk = zzbk(1, zza);
        IBinder readStrongBinder = zzbk.readStrongBinder();
        zzbk.recycle();
        return readStrongBinder;
    }
}
