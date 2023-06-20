package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzcs {
    public static final zzl zza = new zzl() { // from class: com.google.android.gms.internal.ads.zzcr
    };
    public final int zzb;
    private final zzck zzc;
    private final int[] zzd;
    private final boolean[] zze;

    public zzcs(zzck zzckVar, boolean z10, int[] iArr, boolean[] zArr) {
        int i10 = zzckVar.zzb;
        this.zzb = 1;
        this.zzc = zzckVar;
        this.zzd = (int[]) iArr.clone();
        this.zze = (boolean[]) zArr.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzcs.class == obj.getClass()) {
            zzcs zzcsVar = (zzcs) obj;
            if (this.zzc.equals(zzcsVar.zzc) && Arrays.equals(this.zzd, zzcsVar.zzd) && Arrays.equals(this.zze, zzcsVar.zze)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.zzc.hashCode() * 961) + Arrays.hashCode(this.zzd)) * 31) + Arrays.hashCode(this.zze);
    }

    public final int zza() {
        return this.zzc.zzd;
    }

    public final zzad zzb(int i10) {
        return this.zzc.zzb(i10);
    }

    public final boolean zzc() {
        for (boolean z10 : this.zze) {
            if (z10) {
                return true;
            }
        }
        return false;
    }

    public final boolean zzd(int i10) {
        return this.zze[i10];
    }
}
