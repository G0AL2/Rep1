package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzaoe extends zzamm {
    public Long zza;
    public Long zzb;
    public Long zzc;

    public zzaoe() {
    }

    @Override // com.google.android.gms.internal.ads.zzamm
    protected final HashMap zzb() {
        HashMap hashMap = new HashMap();
        hashMap.put(0, this.zza);
        hashMap.put(1, this.zzb);
        hashMap.put(2, this.zzc);
        return hashMap;
    }

    public zzaoe(String str) {
        HashMap zza = zzamm.zza(str);
        if (zza != null) {
            this.zza = (Long) zza.get(0);
            this.zzb = (Long) zza.get(1);
            this.zzc = (Long) zza.get(2);
        }
    }
}
