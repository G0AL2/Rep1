package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzdrp implements zzbom {
    private final zzbmf zza;
    private final zzdse zzb;
    private final zzgqo zzc;

    public zzdrp(zzdns zzdnsVar, zzdnh zzdnhVar, zzdse zzdseVar, zzgqo zzgqoVar) {
        this.zza = zzdnsVar.zzc(zzdnhVar.zzy());
        this.zzb = zzdseVar;
        this.zzc = zzgqoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbom
    public final void zza(Object obj, Map map) {
        String str = (String) map.get("asset");
        try {
            this.zza.zze((zzblv) this.zzc.zzb(), str);
        } catch (RemoteException e10) {
            zzcfi.zzk("Failed to call onCustomClick for asset " + str + ".", e10);
        }
    }

    public final void zzb() {
        if (this.zza == null) {
            return;
        }
        this.zzb.zzi("/nativeAdCustomClick", this);
    }
}
