package com.google.android.gms.internal.ads;

import android.media.metrics.LogSessionId;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzmu {
    public static final zzmu zza;
    private final zzmt zzb;

    static {
        zza = zzeg.zza < 31 ? new zzmu() : new zzmu(zzmt.zza);
    }

    public zzmu() {
        this.zzb = null;
        zzcw.zzf(zzeg.zza < 31);
    }

    private zzmu(zzmt zzmtVar) {
        this.zzb = zzmtVar;
    }

    public final LogSessionId zza() {
        zzmt zzmtVar = this.zzb;
        Objects.requireNonNull(zzmtVar);
        return zzmtVar.zzb;
    }

    public zzmu(LogSessionId logSessionId) {
        this.zzb = new zzmt(logSessionId);
    }
}
