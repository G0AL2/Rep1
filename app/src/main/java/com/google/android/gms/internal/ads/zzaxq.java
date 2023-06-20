package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzaxq {
    public static final zzaxq zza = new zzaxq(new zzaxp[0]);
    public final int zzb;
    private final zzaxp[] zzc;
    private int zzd;

    public zzaxq(zzaxp... zzaxpVarArr) {
        this.zzc = zzaxpVarArr;
        this.zzb = zzaxpVarArr.length;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaxq.class == obj.getClass()) {
            zzaxq zzaxqVar = (zzaxq) obj;
            if (this.zzb == zzaxqVar.zzb && Arrays.equals(this.zzc, zzaxqVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.zzd;
        if (i10 == 0) {
            int hashCode = Arrays.hashCode(this.zzc);
            this.zzd = hashCode;
            return hashCode;
        }
        return i10;
    }

    public final int zza(zzaxp zzaxpVar) {
        for (int i10 = 0; i10 < this.zzb; i10++) {
            if (this.zzc[i10] == zzaxpVar) {
                return i10;
            }
        }
        return -1;
    }

    public final zzaxp zzb(int i10) {
        return this.zzc[i10];
    }
}
