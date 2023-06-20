package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfki {
    private final BlockingQueue zza;
    private final ThreadPoolExecutor zzb;
    private final ArrayDeque zzc = new ArrayDeque();
    private zzfkh zzd = null;

    public zzfki() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.zza = linkedBlockingQueue;
        this.zzb = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    private final void zzc() {
        zzfkh zzfkhVar = (zzfkh) this.zzc.poll();
        this.zzd = zzfkhVar;
        if (zzfkhVar != null) {
            zzfkhVar.executeOnExecutor(this.zzb, new Object[0]);
        }
    }

    public final void zza(zzfkh zzfkhVar) {
        this.zzd = null;
        zzc();
    }

    public final void zzb(zzfkh zzfkhVar) {
        zzfkhVar.zzb(this);
        this.zzc.add(zzfkhVar);
        if (this.zzd == null) {
            zzc();
        }
    }
}
