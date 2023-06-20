package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbvi extends zzaqw implements zzbvk {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbvi(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbvk
    public final void zze(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString("Adapter returned null.");
        zzbl(3, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvk
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zze(zza, zzeVar);
        zzbl(4, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvk
    public final void zzg() throws RemoteException {
        zzbl(2, zza());
    }
}
