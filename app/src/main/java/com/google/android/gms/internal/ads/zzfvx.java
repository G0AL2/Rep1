package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfvx extends zzfus {
    private zzfvl zza;
    private ScheduledFuture zzb;

    private zzfvx(zzfvl zzfvlVar) {
        Objects.requireNonNull(zzfvlVar);
        this.zza = zzfvlVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzfvl zzg(zzfvl zzfvlVar, long j10, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        zzfvx zzfvxVar = new zzfvx(zzfvlVar);
        zzfvv zzfvvVar = new zzfvv(zzfvxVar);
        zzfvxVar.zzb = scheduledExecutorService.schedule(zzfvvVar, j10, timeUnit);
        zzfvlVar.zzc(zzfvvVar, zzfuq.INSTANCE);
        return zzfvxVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ ScheduledFuture zzx(zzfvx zzfvxVar, ScheduledFuture scheduledFuture) {
        zzfvxVar.zzb = null;
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzftt
    public final String zza() {
        zzfvl zzfvlVar = this.zza;
        ScheduledFuture scheduledFuture = this.zzb;
        if (zzfvlVar != null) {
            String str = "inputFuture=[" + zzfvlVar + "]";
            if (scheduledFuture != null) {
                long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
                if (delay > 0) {
                    return str + ", remaining delay=[" + delay + " ms]";
                }
                return str;
            }
            return str;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzftt
    protected final void zzb() {
        zzs(this.zza);
        ScheduledFuture scheduledFuture = this.zzb;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.zza = null;
        this.zzb = null;
    }
}
