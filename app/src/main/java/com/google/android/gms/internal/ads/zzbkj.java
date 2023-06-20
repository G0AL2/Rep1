package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbkj extends zzaqw {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbkj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy");
    }

    public final void zze(zzbzf zzbzfVar) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zzg(zza, zzbzfVar);
        zzbl(1, zza);
    }
}
