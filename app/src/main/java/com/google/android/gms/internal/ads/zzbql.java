package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbql extends zzaqw implements zzbqn {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbql(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.initialization.IInitializationCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbqn
    public final void zzb(List list) throws RemoteException {
        Parcel zza = zza();
        zza.writeTypedList(list);
        zzbl(1, zza);
    }
}
