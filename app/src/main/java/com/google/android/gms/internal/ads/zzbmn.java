package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbmn extends zzaqw implements zzbmp {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbmn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbmp
    public final void zze(zzbmy zzbmyVar) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zzg(zza, zzbmyVar);
        zzbl(1, zza);
    }
}
