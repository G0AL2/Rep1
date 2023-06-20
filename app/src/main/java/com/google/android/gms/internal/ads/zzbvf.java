package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbvf extends zzaqw implements zzbvh {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbvf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbvh
    public final void zze(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString("Adapter returned null.");
        zzbl(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvh
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zze(zza, zzeVar);
        zzbl(3, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvh
    public final void zzg(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zzg(zza, iObjectWrapper);
        zzbl(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvh
    public final void zzh(zzbuj zzbujVar) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zzg(zza, zzbujVar);
        zzbl(4, zza);
    }
}
