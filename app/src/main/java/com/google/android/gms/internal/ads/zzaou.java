package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzaou extends zzamm {
    public Long zza;
    public Boolean zzb;
    public Boolean zzc;

    public zzaou() {
    }

    @Override // com.google.android.gms.internal.ads.zzamm
    protected final HashMap zzb() {
        HashMap hashMap = new HashMap();
        hashMap.put(0, this.zza);
        hashMap.put(1, this.zzb);
        hashMap.put(2, this.zzc);
        return hashMap;
    }

    public zzaou(String str) {
        HashMap zza = zzamm.zza(str);
        if (zza != null) {
            this.zza = (Long) zza.get(0);
            this.zzb = (Boolean) zza.get(1);
            this.zzc = (Boolean) zza.get(2);
        }
    }
}
