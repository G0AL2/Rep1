package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzaqw;
import com.google.android.gms.internal.ads.zzaqy;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzcw extends zzaqw implements zzcy {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener");
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zze(zze zzeVar) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zze(zza, zzeVar);
        zzbl(1, zza);
    }
}
