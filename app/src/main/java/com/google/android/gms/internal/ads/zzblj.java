package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzblj extends zzaqw implements zzbll {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzblj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
    }

    @Override // com.google.android.gms.internal.ads.zzbll
    public final void zzb(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zzg(zza, iObjectWrapper);
        zzbl(3, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbll
    public final void zzc(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zzg(zza, iObjectWrapper);
        zzbl(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbll
    public final void zzd() throws RemoteException {
        zzbl(2, zza());
    }
}
