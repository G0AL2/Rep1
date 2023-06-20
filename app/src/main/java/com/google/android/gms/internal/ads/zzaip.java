package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.utils.IronSourceConstants;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzaip {
    private int zza = IronSourceConstants.IS_INSTANCE_NOT_FOUND;
    private int zzb;

    public final int zza() {
        return this.zzb;
    }

    public final int zzb() {
        return this.zza;
    }

    public final void zzc(zzajk zzajkVar) throws zzajk {
        int i10 = this.zzb + 1;
        this.zzb = i10;
        int i11 = this.zza;
        this.zza = i11 + i11;
        if (i10 > 1) {
            throw zzajkVar;
        }
    }
}
