package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzct {
    public static final zzct zza = new zzct(zzfrj.zzo());
    public static final zzl zzb = new zzl() { // from class: com.google.android.gms.internal.ads.zzcq
    };
    private final zzfrj zzc;

    public zzct(List list) {
        this.zzc = zzfrj.zzm(list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzct.class != obj.getClass()) {
            return false;
        }
        return this.zzc.equals(((zzct) obj).zzc);
    }

    public final int hashCode() {
        return this.zzc.hashCode();
    }

    public final zzfrj zza() {
        return this.zzc;
    }

    public final boolean zzb(int i10) {
        for (int i11 = 0; i11 < this.zzc.size(); i11++) {
            zzcs zzcsVar = (zzcs) this.zzc.get(i11);
            if (zzcsVar.zzc() && zzcsVar.zza() == i10) {
                return true;
            }
        }
        return false;
    }
}
