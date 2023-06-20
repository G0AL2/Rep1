package com.google.android.gms.internal.ads;

import android.media.metrics.LogSessionId;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzqg {
    public static void zza(zzqb zzqbVar, zzmu zzmuVar) {
        LogSessionId zza = zzmuVar.zza();
        if (zza.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            return;
        }
        zzqbVar.zzb.setString("log-session-id", zza.getStringId());
    }
}
