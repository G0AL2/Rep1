package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.metrics.LogSessionId;
import android.util.Log;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzib {
    public static zzmu zza(Context context, zzim zzimVar, boolean z10) {
        zzmq zzb = zzmq.zzb(context);
        if (zzb == null) {
            Log.w("ExoPlayerImpl", "MediaMetricsService unavailable.");
            return new zzmu(LogSessionId.LOG_SESSION_ID_NONE);
        }
        if (z10) {
            zzimVar.zzR(zzb);
        }
        return new zzmu(zzb.zza());
    }
}
