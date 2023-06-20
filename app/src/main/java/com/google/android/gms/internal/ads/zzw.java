package com.google.android.gms.internal.ads;

import android.util.SparseBooleanArray;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzw {
    private final SparseBooleanArray zza = new SparseBooleanArray();
    private boolean zzb;

    public final zzw zza(int i10) {
        zzcw.zzf(!this.zzb);
        this.zza.append(i10, true);
        return this;
    }

    public final zzy zzb() {
        zzcw.zzf(!this.zzb);
        this.zzb = true;
        return new zzy(this.zza, null);
    }
}
