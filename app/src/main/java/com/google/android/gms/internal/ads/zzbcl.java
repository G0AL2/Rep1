package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbcl extends zzaqw implements zzbcn {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbcl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbcn
    public final void zzb() throws RemoteException {
        zzbl(5, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbcn
    public final void zzc() throws RemoteException {
        zzbl(2, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbcn
    public final void zzd(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zze(zza, zzeVar);
        zzbl(3, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbcn
    public final void zze() throws RemoteException {
        zzbl(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbcn
    public final void zzf() throws RemoteException {
        zzbl(1, zza());
    }
}
