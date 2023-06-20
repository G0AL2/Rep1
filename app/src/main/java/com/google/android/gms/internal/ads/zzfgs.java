package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfgs implements zzfgp {
    private final zzfgp zza;
    private final Queue zzb = new LinkedBlockingQueue();
    private final int zzc = ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzhm)).intValue();
    private final AtomicBoolean zzd = new AtomicBoolean(false);

    public zzfgs(zzfgp zzfgpVar, ScheduledExecutorService scheduledExecutorService) {
        this.zza = zzfgpVar;
        long intValue = ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzhl)).intValue();
        scheduledExecutorService.scheduleAtFixedRate(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfgr
            @Override // java.lang.Runnable
            public final void run() {
                zzfgs.zzc(zzfgs.this);
            }
        }, intValue, intValue, TimeUnit.MILLISECONDS);
    }

    public static /* synthetic */ void zzc(zzfgs zzfgsVar) {
        while (!zzfgsVar.zzb.isEmpty()) {
            zzfgsVar.zza.zzb((zzfgo) zzfgsVar.zzb.remove());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfgp
    public final String zza(zzfgo zzfgoVar) {
        return this.zza.zza(zzfgoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfgp
    public final void zzb(zzfgo zzfgoVar) {
        if (this.zzb.size() >= this.zzc) {
            if (this.zzd.getAndSet(true)) {
                return;
            }
            Queue queue = this.zzb;
            zzfgo zzb = zzfgo.zzb("dropped_event");
            Map zzj = zzfgoVar.zzj();
            if (zzj.containsKey("action")) {
                zzb.zza("dropped_action", (String) zzj.get("action"));
            }
            queue.offer(zzb);
            return;
        }
        this.zzb.offer(zzfgoVar);
    }
}
