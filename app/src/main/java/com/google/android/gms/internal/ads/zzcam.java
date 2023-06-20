package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzcam extends zzaqw {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcam(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
    }

    public final void zze(zzcal zzcalVar, String str, String str2) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zzg(zza, zzcalVar);
        zza.writeString(str);
        zza.writeString(str2);
        zzbl(2, zza);
    }
}
