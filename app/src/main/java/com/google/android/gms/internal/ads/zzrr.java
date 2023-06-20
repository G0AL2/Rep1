package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzrr {
    private static final AtomicLong zzd = new AtomicLong();
    public final zzev zza;
    public final Uri zzb;
    public final Map zzc;

    public zzrr(long j10, zzev zzevVar, Uri uri, Map map, long j11, long j12, long j13) {
        this.zza = zzevVar;
        this.zzb = uri;
        this.zzc = map;
    }

    public static long zza() {
        return zzd.getAndIncrement();
    }
}
