package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzcfb;
import com.google.android.gms.internal.ads.zzcfi;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzen extends zzbk {
    final /* synthetic */ zzeo zza;

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final String zze() throws RemoteException {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final String zzf() throws RemoteException {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final void zzg(zzl zzlVar) throws RemoteException {
        zzh(zzlVar, 1);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final void zzh(zzl zzlVar, int i10) throws RemoteException {
        zzcfi.zzg("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        zzcfb.zza.post(new zzel(this));
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final boolean zzi() throws RemoteException {
        return false;
    }
}
