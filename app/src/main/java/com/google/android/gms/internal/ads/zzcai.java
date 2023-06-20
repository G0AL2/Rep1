package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzcai extends zzcak {
    private final String zza;
    private final int zzb;

    public zzcai(String str, int i10) {
        this.zza = str;
        this.zzb = i10;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof zzcai)) {
            zzcai zzcaiVar = (zzcai) obj;
            if (Objects.equal(this.zza, zzcaiVar.zza) && Objects.equal(Integer.valueOf(this.zzb), Integer.valueOf(zzcaiVar.zzb))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcal
    public final int zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzcal
    public final String zzc() {
        return this.zza;
    }
}
