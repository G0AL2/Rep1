package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzck {
    public static final zzl zza = new zzl() { // from class: com.google.android.gms.internal.ads.zzcj
    };
    public final int zzb = 1;
    public final String zzc;
    public final int zzd;
    private final zzad[] zze;
    private int zzf;

    public zzck(String str, zzad... zzadVarArr) {
        this.zzc = str;
        this.zze = zzadVarArr;
        int zzb = zzbo.zzb(zzadVarArr[0].zzm);
        this.zzd = zzb == -1 ? zzbo.zzb(zzadVarArr[0].zzl) : zzb;
        zzd(zzadVarArr[0].zzd);
        int i10 = zzadVarArr[0].zzf;
    }

    private static String zzd(String str) {
        return (str == null || str.equals("und")) ? "" : str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzck.class == obj.getClass()) {
            zzck zzckVar = (zzck) obj;
            if (this.zzc.equals(zzckVar.zzc) && Arrays.equals(this.zze, zzckVar.zze)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.zzf;
        if (i10 == 0) {
            int hashCode = ((this.zzc.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + Arrays.hashCode(this.zze);
            this.zzf = hashCode;
            return hashCode;
        }
        return i10;
    }

    public final int zza(zzad zzadVar) {
        for (int i10 = 0; i10 <= 0; i10++) {
            if (zzadVar == this.zze[i10]) {
                return i10;
            }
        }
        return -1;
    }

    public final zzad zzb(int i10) {
        return this.zze[i10];
    }

    public final zzck zzc(String str) {
        return new zzck(str, this.zze);
    }
}
