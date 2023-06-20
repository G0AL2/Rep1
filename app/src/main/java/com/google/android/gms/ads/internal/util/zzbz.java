package com.google.android.gms.ads.internal.util;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbz {
    private long zza;
    private long zzb = Long.MIN_VALUE;
    private final Object zzc = new Object();

    public zzbz(long j10) {
        this.zza = j10;
    }

    public final void zza(long j10) {
        synchronized (this.zzc) {
            this.zza = j10;
        }
    }

    public final boolean zzb() {
        synchronized (this.zzc) {
            long elapsedRealtime = com.google.android.gms.ads.internal.zzt.zzA().elapsedRealtime();
            if (this.zzb + this.zza > elapsedRealtime) {
                return false;
            }
            this.zzb = elapsedRealtime;
            return true;
        }
    }
}
