package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzeic extends zzbvm {
    final /* synthetic */ zzeid zza;
    private final zzefg zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzeic(zzeid zzeidVar, zzefg zzefgVar, zzeib zzeibVar) {
        this.zza = zzeidVar;
        this.zzb = zzefgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbvn
    public final void zze(String str) throws RemoteException {
        ((zzegz) this.zzb.zzc).zzi(0, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbvn
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        ((zzegz) this.zzb.zzc).zzh(zzeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbvn
    public final void zzg(zzbup zzbupVar) throws RemoteException {
        zzeid.zzc(this.zza, zzbupVar);
        ((zzegz) this.zzb.zzc).zzo();
    }
}
