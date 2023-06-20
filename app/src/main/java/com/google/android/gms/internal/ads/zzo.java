package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzo {
    public static final zzl zza = new zzl() { // from class: com.google.android.gms.internal.ads.zzn
    };
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final byte[] zze;
    private int zzf;

    public zzo(int i10, int i11, int i12, byte[] bArr) {
        this.zzb = i10;
        this.zzc = i11;
        this.zzd = i12;
        this.zze = bArr;
    }

    public static int zza(int i10) {
        if (i10 != 1) {
            if (i10 != 9) {
                return (i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7) ? 2 : -1;
            }
            return 6;
        }
        return 1;
    }

    public static int zzb(int i10) {
        if (i10 != 1) {
            if (i10 != 16) {
                if (i10 != 18) {
                    return (i10 == 6 || i10 == 7) ? 3 : -1;
                }
                return 7;
            }
            return 6;
        }
        return 3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzo.class == obj.getClass()) {
            zzo zzoVar = (zzo) obj;
            if (this.zzb == zzoVar.zzb && this.zzc == zzoVar.zzc && this.zzd == zzoVar.zzd && Arrays.equals(this.zze, zzoVar.zze)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.zzf;
        if (i10 == 0) {
            int hashCode = ((((((this.zzb + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.zzc) * 31) + this.zzd) * 31) + Arrays.hashCode(this.zze);
            this.zzf = hashCode;
            return hashCode;
        }
        return i10;
    }

    public final String toString() {
        int i10 = this.zzb;
        int i11 = this.zzc;
        int i12 = this.zzd;
        boolean z10 = this.zze != null;
        return "ColorInfo(" + i10 + ", " + i11 + ", " + i12 + ", " + z10 + ")";
    }
}
