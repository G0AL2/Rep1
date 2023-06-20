package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfto extends zzftp {
    public static int zza(long j10) {
        int i10 = (int) j10;
        if (i10 == j10) {
            return i10;
        }
        throw new IllegalArgumentException(zzfpi.zzb("Out of range: %s", Long.valueOf(j10)));
    }

    public static int zzb(int i10, int i11, int i12) {
        return Math.min(Math.max(i10, i11), 1073741823);
    }
}
