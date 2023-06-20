package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzkj {
    private final zzy zza;
    private final SparseArray zzb;

    public zzkj(zzy zzyVar, SparseArray sparseArray) {
        this.zza = zzyVar;
        SparseArray sparseArray2 = new SparseArray(zzyVar.zzb());
        for (int i10 = 0; i10 < zzyVar.zzb(); i10++) {
            int zza = zzyVar.zza(i10);
            zzki zzkiVar = (zzki) sparseArray.get(zza);
            Objects.requireNonNull(zzkiVar);
            sparseArray2.append(zza, zzkiVar);
        }
        this.zzb = sparseArray2;
    }

    public final int zza(int i10) {
        return this.zza.zza(i10);
    }

    public final int zzb() {
        return this.zza.zzb();
    }

    public final zzki zzc(int i10) {
        zzki zzkiVar = (zzki) this.zzb.get(i10);
        Objects.requireNonNull(zzkiVar);
        return zzkiVar;
    }

    public final boolean zzd(int i10) {
        return this.zza.zzc(i10);
    }
}
