package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbvl extends zzaqw implements zzbvn {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbvl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbvn
    public final void zze(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString("Adapter returned null.");
        zzbl(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvn
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zze(zza, zzeVar);
        zzbl(3, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvn
    public final void zzg(zzbup zzbupVar) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zzg(zza, zzbupVar);
        zzbl(1, zza);
    }
}
