package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzaqw;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbu extends zzaqw implements zzbw {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdMetadataListener");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbw
    public final void zze() throws RemoteException {
        zzbl(1, zza());
    }
}
