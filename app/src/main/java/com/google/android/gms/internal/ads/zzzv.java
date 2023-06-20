package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzzv {
    public static final zzzv zza = new zzzv(0, 0);
    public final long zzb;
    public final long zzc;

    public zzzv(long j10, long j11) {
        this.zzb = j10;
        this.zzc = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzzv.class == obj.getClass()) {
            zzzv zzzvVar = (zzzv) obj;
            if (this.zzb == zzzvVar.zzb && this.zzc == zzzvVar.zzc) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.zzb) * 31) + ((int) this.zzc);
    }

    public final String toString() {
        long j10 = this.zzb;
        long j11 = this.zzc;
        return "[timeUs=" + j10 + ", position=" + j11 + "]";
    }
}
