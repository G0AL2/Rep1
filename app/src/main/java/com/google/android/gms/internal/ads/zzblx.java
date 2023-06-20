package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzblx extends zzaqw implements zzblz {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzblx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzblz
    public final void zze(zzblq zzblqVar) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zzg(zza, zzblqVar);
        zzbl(1, zza);
    }
}
