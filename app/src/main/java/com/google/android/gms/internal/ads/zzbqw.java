package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbqw extends zzaqw implements zzbqy {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbqw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbqy
    public final void zze(int i10) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i10);
        zzbl(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbqy
    public final void zzf() throws RemoteException {
        zzbl(1, zza());
    }
}
