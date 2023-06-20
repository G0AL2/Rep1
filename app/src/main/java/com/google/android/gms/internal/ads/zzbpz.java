package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbpz extends zzaqw {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbpz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
    }

    public final void zze(zzbpt zzbptVar, zzbpy zzbpyVar) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zze(zza, zzbptVar);
        zzaqy.zzg(zza, zzbpyVar);
        zzbm(2, zza);
    }
}
