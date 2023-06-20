package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.Preconditions;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbon implements zzbom {
    private final zzdzb zza;

    public zzbon(zzdzb zzdzbVar) {
        Preconditions.checkNotNull(zzdzbVar, "The Inspector Manager must not be null");
        this.zza = zzdzbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbom
    public final void zza(Object obj, Map map) {
        if (map == null || !map.containsKey("extras")) {
            return;
        }
        long j10 = Long.MAX_VALUE;
        if (map.containsKey("expires")) {
            try {
                j10 = Long.parseLong((String) map.get("expires"));
            } catch (NumberFormatException unused) {
            }
        }
        this.zza.zzh((String) map.get("extras"), j10);
    }
}
