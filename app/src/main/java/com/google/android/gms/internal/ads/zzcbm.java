package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzcbm extends zzaqw {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcbm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener");
    }

    public final void zze(zzcbb zzcbbVar, String str, String str2) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zzg(zza, zzcbbVar);
        zza.writeString(str);
        zza.writeString(str2);
        zzbl(2, zza);
    }
}
