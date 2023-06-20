package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzau {
    public static final zzau zza = new zzau(new zzas());
    public static final zzl zzb = new zzl() { // from class: com.google.android.gms.internal.ads.zzar
    };
    public final long zzc;
    public final long zzd;
    public final long zze;
    public final float zzf;
    public final float zzg;

    private zzau(zzas zzasVar) {
        this.zzc = -9223372036854775807L;
        this.zzd = -9223372036854775807L;
        this.zze = -9223372036854775807L;
        this.zzf = -3.4028235E38f;
        this.zzg = -3.4028235E38f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzau) {
            long j10 = ((zzau) obj).zzc;
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10 = (int) (-9223372034707292159L);
        return (((((((i10 * 31) + i10) * 31) + i10) * 31) + Float.floatToIntBits(-3.4028235E38f)) * 31) + Float.floatToIntBits(-3.4028235E38f);
    }
}
