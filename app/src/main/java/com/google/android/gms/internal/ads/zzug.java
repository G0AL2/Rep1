package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public class zzug implements zzvg {
    protected final zzck zza;
    protected final int zzb;
    protected final int[] zzc;
    private final zzad[] zzd;
    private int zze;

    public zzug(zzck zzckVar, int[] iArr, int i10) {
        int length = iArr.length;
        zzcw.zzf(length > 0);
        Objects.requireNonNull(zzckVar);
        this.zza = zzckVar;
        this.zzb = length;
        this.zzd = new zzad[length];
        for (int i11 = 0; i11 < iArr.length; i11++) {
            this.zzd[i11] = zzckVar.zzb(iArr[i11]);
        }
        Arrays.sort(this.zzd, new Comparator() { // from class: com.google.android.gms.internal.ads.zzuf
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((zzad) obj2).zzi - ((zzad) obj).zzi;
            }
        });
        this.zzc = new int[this.zzb];
        for (int i12 = 0; i12 < this.zzb; i12++) {
            this.zzc[i12] = zzckVar.zza(this.zzd[i12]);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzug zzugVar = (zzug) obj;
            if (this.zza == zzugVar.zza && Arrays.equals(this.zzc, zzugVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.zze;
        if (i10 == 0) {
            int identityHashCode = (System.identityHashCode(this.zza) * 31) + Arrays.hashCode(this.zzc);
            this.zze = identityHashCode;
            return identityHashCode;
        }
        return i10;
    }

    @Override // com.google.android.gms.internal.ads.zzvk
    public final int zza(int i10) {
        return this.zzc[0];
    }

    @Override // com.google.android.gms.internal.ads.zzvk
    public final int zzb(int i10) {
        for (int i11 = 0; i11 < this.zzb; i11++) {
            if (this.zzc[i11] == i10) {
                return i11;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzvk
    public final int zzc() {
        return this.zzc.length;
    }

    @Override // com.google.android.gms.internal.ads.zzvk
    public final zzad zzd(int i10) {
        return this.zzd[i10];
    }

    @Override // com.google.android.gms.internal.ads.zzvk
    public final zzck zze() {
        return this.zza;
    }
}
