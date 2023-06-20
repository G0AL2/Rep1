package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbmk extends zzaqw implements zzbmm {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbmk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbmm
    public final void zze(com.google.android.gms.ads.internal.client.zzbs zzbsVar, IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zzg(zza, zzbsVar);
        zzaqy.zzg(zza, iObjectWrapper);
        zzbl(1, zza);
    }
}
