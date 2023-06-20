package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.VisibleForTesting;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzefe implements zzefd {
    @VisibleForTesting
    public final zzefd zza;
    private final zzfok zzb;

    public zzefe(zzefd zzefdVar, zzfok zzfokVar) {
        this.zza = zzefdVar;
        this.zzb = zzfokVar;
    }

    @Override // com.google.android.gms.internal.ads.zzefd
    public final zzfvl zza(zzfbx zzfbxVar, zzfbl zzfblVar) {
        return zzfvc.zzm(this.zza.zza(zzfbxVar, zzfblVar), this.zzb, zzcfv.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzefd
    public final boolean zzb(zzfbx zzfbxVar, zzfbl zzfblVar) {
        return this.zza.zzb(zzfbxVar, zzfblVar);
    }
}
