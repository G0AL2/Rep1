package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbma extends zzaqw implements zzbmc {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbma(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbmc
    public final void zze(zzbls zzblsVar) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zzg(zza, zzblsVar);
        zzbl(1, zza);
    }
}
