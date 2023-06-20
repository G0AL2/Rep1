package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbt {
    public static final zzbt zza = new zzbt(1.0f, 1.0f);
    public static final zzl zzb = new zzl() { // from class: com.google.android.gms.internal.ads.zzbs
    };
    public final float zzc;
    public final float zzd;
    private final int zze;

    public zzbt(float f10, float f11) {
        zzcw.zzd(f10 > 0.0f);
        zzcw.zzd(f11 > 0.0f);
        this.zzc = f10;
        this.zzd = f11;
        this.zze = Math.round(f10 * 1000.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzbt.class == obj.getClass()) {
            zzbt zzbtVar = (zzbt) obj;
            if (this.zzc == zzbtVar.zzc && this.zzd == zzbtVar.zzd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.floatToRawIntBits(this.zzc) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + Float.floatToRawIntBits(this.zzd);
    }

    public final String toString() {
        return zzeg.zzH("PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.zzc), Float.valueOf(this.zzd));
    }

    public final long zza(long j10) {
        return j10 * this.zze;
    }
}
