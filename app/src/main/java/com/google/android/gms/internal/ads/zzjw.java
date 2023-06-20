package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzjw {
    public static final zzjw zza;
    public static final zzjw zzb;
    public static final zzjw zzc;
    public static final zzjw zzd;
    public static final zzjw zze;
    public final long zzf;
    public final long zzg;

    static {
        zzjw zzjwVar = new zzjw(0L, 0L);
        zza = zzjwVar;
        zzb = new zzjw(Long.MAX_VALUE, Long.MAX_VALUE);
        zzc = new zzjw(Long.MAX_VALUE, 0L);
        zzd = new zzjw(0L, Long.MAX_VALUE);
        zze = zzjwVar;
    }

    public zzjw(long j10, long j11) {
        zzcw.zzd(j10 >= 0);
        zzcw.zzd(j11 >= 0);
        this.zzf = j10;
        this.zzg = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzjw.class == obj.getClass()) {
            zzjw zzjwVar = (zzjw) obj;
            if (this.zzf == zzjwVar.zzf && this.zzg == zzjwVar.zzg) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.zzf) * 31) + ((int) this.zzg);
    }
}
