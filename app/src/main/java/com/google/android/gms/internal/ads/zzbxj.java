package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbxj extends zzaqw implements zzbxl {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbxj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.offline.IOfflineUtils");
    }

    @Override // com.google.android.gms.internal.ads.zzbxl
    public final void zze(Intent intent) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zze(zza, intent);
        zzbl(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbxl
    public final void zzf() throws RemoteException {
        zzbl(3, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbxl
    public final void zzg(IObjectWrapper iObjectWrapper, String str, String str2) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zzg(zza, iObjectWrapper);
        zza.writeString(str);
        zza.writeString(str2);
        zzbl(2, zza);
    }
}
