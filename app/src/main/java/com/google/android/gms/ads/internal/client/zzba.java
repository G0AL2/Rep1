package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzaqw;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzba extends zzaqw implements zzbc {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzba(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdClickListener");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbc
    public final void zzb() throws RemoteException {
        zzbl(1, zza());
    }
}
