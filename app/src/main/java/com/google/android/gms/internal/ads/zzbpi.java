package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbpi extends zzaqw implements zzbpk {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbpi(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.h5.client.IH5AdsManager");
    }

    @Override // com.google.android.gms.internal.ads.zzbpk
    public final void zze() throws RemoteException {
        zzbl(2, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpk
    public final void zzf(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzbl(1, zza);
    }
}
