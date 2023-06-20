package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzejb extends zzbvp {
    private final zzefg zza;

    @Override // com.google.android.gms.internal.ads.zzbvq
    public final void zze(String str) throws RemoteException {
        ((zzegz) this.zza.zzc).zzi(0, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbvq
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        ((zzegz) this.zza.zzc).zzh(zzeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbvq
    public final void zzg() throws RemoteException {
        ((zzegz) this.zza.zzc).zzo();
    }
}
