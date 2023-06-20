package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
@Deprecated
/* loaded from: classes2.dex */
public final class zzdwm extends zzdwo {
    private final zzfgx zzf;

    public zzdwm(Executor executor, zzcfn zzcfnVar, zzfgx zzfgxVar, zzfgz zzfgzVar) {
        super(executor, zzcfnVar, zzfgzVar);
        this.zzf = zzfgxVar;
        zzfgxVar.zza(this.zzb);
    }

    public final Map zza() {
        return new HashMap(this.zzb);
    }
}
