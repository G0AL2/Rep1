package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzarx {
    public static final zzarx zza = new zzarx(1.0f, 1.0f);
    public final float zzb;
    public final float zzc = 1.0f;
    private final int zzd;

    public zzarx(float f10, float f11) {
        this.zzb = f10;
        this.zzd = Math.round(f10 * 1000.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && zzarx.class == obj.getClass() && this.zzb == ((zzarx) obj).zzb;
    }

    public final int hashCode() {
        return ((Float.floatToRawIntBits(this.zzb) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + Float.floatToRawIntBits(1.0f);
    }

    public final long zza(long j10) {
        return j10 * this.zzd;
    }
}
