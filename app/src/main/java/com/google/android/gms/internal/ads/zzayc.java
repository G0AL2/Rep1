package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzayc {
    private int zza;
    private final zzaxu[] zzb;

    public zzayc(zzaxu[] zzaxuVarArr, byte... bArr) {
        this.zzb = zzaxuVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzayc.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.zzb, ((zzayc) obj).zzb);
    }

    public final int hashCode() {
        int i10 = this.zza;
        if (i10 == 0) {
            int hashCode = Arrays.hashCode(this.zzb) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
            this.zza = hashCode;
            return hashCode;
        }
        return i10;
    }

    public final zzaxu zza(int i10) {
        return this.zzb[i10];
    }

    public final zzaxu[] zzb() {
        return (zzaxu[]) this.zzb.clone();
    }
}
