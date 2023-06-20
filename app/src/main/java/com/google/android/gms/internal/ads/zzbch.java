package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbch extends zzaqw implements zzbcj {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbch(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbcj
    public final void zzb(int i10) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i10);
        zzbl(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbcj
    public final void zzc(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zze(zza, zzeVar);
        zzbl(3, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbcj
    public final void zzd(zzbcg zzbcgVar) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zzg(zza, zzbcgVar);
        zzbl(1, zza);
    }
}
