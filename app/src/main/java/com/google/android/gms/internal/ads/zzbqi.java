package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbqi extends zzaqw implements zzbqk {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbqi(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbqk
    public final void zze(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzbl(3, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbqk
    public final void zzf() throws RemoteException {
        zzbl(2, zza());
    }
}
