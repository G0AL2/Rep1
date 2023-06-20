package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public abstract class zzffx {
    private static final zzfvl zza = zzfvc.zzi(null);
    private final zzfvm zzb;
    private final ScheduledExecutorService zzc;
    private final zzffy zzd;

    public zzffx(zzfvm zzfvmVar, ScheduledExecutorService scheduledExecutorService, zzffy zzffyVar) {
        this.zzb = zzfvmVar;
        this.zzc = scheduledExecutorService;
        this.zzd = zzffyVar;
    }

    public final zzffn zza(Object obj, zzfvl... zzfvlVarArr) {
        return new zzffn(this, obj, Arrays.asList(zzfvlVarArr), null);
    }

    public final zzffw zzb(Object obj, zzfvl zzfvlVar) {
        return new zzffw(this, obj, zzfvlVar, Collections.singletonList(zzfvlVar), zzfvlVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract String zzf(Object obj);
}
