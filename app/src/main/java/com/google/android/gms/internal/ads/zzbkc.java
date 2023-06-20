package com.google.android.gms.internal.ads;

import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbkc {
    public static final zzbjb zza = zzbjb.zzd("gads:always_collect_trustless_token_at_native_side", false);
    public static final zzbjb zzb = zzbjb.zzd("gms:expose_token_for_gma:enabled", true);
    public static final zzbjb zzc = zzbjb.zzb("gads:timeout_for_trustless_token:millis", Constants.MIN_PROGRESS_TIME);
    public static final zzbjb zzd = zzbjb.zzb("gads:cached_token:ttl_millis", 10800000);
}
