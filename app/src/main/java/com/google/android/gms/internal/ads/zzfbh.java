package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzfbh extends zzfko {
    final /* synthetic */ com.google.android.gms.ads.internal.client.zzbw zza;
    final /* synthetic */ zzfbi zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfbh(zzfbi zzfbiVar, com.google.android.gms.ads.internal.client.zzbw zzbwVar) {
        this.zzb = zzfbiVar;
        this.zza = zzbwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfko
    public final void zzv() {
        zzdst zzdstVar;
        zzdstVar = this.zzb.zzd;
        if (zzdstVar != null) {
            try {
                this.zza.zze();
            } catch (RemoteException e10) {
                zzcfi.zzl("#007 Could not call remote method.", e10);
            }
        }
    }
}
