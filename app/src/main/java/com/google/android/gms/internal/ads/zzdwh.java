package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
@Deprecated
/* loaded from: classes2.dex */
public final class zzdwh {
    private final zzdwm zza;
    private final Executor zzb;
    private final Map zzc;

    public zzdwh(zzdwm zzdwmVar, Executor executor) {
        this.zza = zzdwmVar;
        this.zzc = zzdwmVar.zza();
        this.zzb = executor;
    }

    public final zzdwg zza() {
        zzdwg zzdwgVar = new zzdwg(this);
        zzdwg.zza(zzdwgVar);
        return zzdwgVar;
    }
}
