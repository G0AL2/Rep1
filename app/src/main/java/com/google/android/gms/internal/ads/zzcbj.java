package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzcbj extends zzaqw implements zzcbl {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcbj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzcbl
    public final void zze(int i10) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i10);
        zzbl(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcbl
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zze(zza, zzeVar);
        zzbl(3, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcbl
    public final void zzg() throws RemoteException {
        zzbl(1, zza());
    }
}
