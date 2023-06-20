package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbis extends zzaqw implements zzbiu {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbis(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbiu
    public final void zze(zzbir zzbirVar) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zzg(zza, zzbirVar);
        zzbl(1, zza);
    }
}
