package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public class zzaxu {
    protected final zzaxp zza;
    protected final int[] zzb;
    private final zzart[] zzc;
    private int zzd;

    public zzaxu(zzaxp zzaxpVar, int... iArr) {
        Objects.requireNonNull(zzaxpVar);
        this.zza = zzaxpVar;
        this.zzc = new zzart[1];
        for (int i10 = 0; i10 <= 0; i10++) {
            this.zzc[i10] = zzaxpVar.zzb(iArr[i10]);
        }
        Arrays.sort(this.zzc, new zzaxt(null));
        this.zzb = new int[1];
        for (int i11 = 0; i11 <= 0; i11++) {
            this.zzb[i11] = zzaxpVar.zza(this.zzc[i11]);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzaxu zzaxuVar = (zzaxu) obj;
            if (this.zza == zzaxuVar.zza && Arrays.equals(this.zzb, zzaxuVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.zzd;
        if (i10 == 0) {
            int identityHashCode = (System.identityHashCode(this.zza) * 31) + Arrays.hashCode(this.zzb);
            this.zzd = identityHashCode;
            return identityHashCode;
        }
        return i10;
    }

    public final int zza(int i10) {
        return this.zzb[0];
    }

    public final int zzb() {
        int length = this.zzb.length;
        return 1;
    }

    public final zzart zzc(int i10) {
        return this.zzc[i10];
    }

    public final zzaxp zzd() {
        return this.zza;
    }
}
