package com.google.android.gms.internal.ads;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzgmi {
    private static final zzgmi zza = new zzgmi();
    private final ConcurrentMap zzc = new ConcurrentHashMap();
    private final zzgmu zzb = new zzgls();

    private zzgmi() {
    }

    public static zzgmi zza() {
        return zza;
    }

    public final zzgmt zzb(Class cls) {
        zzgla.zzf(cls, "messageType");
        zzgmt zzgmtVar = (zzgmt) this.zzc.get(cls);
        if (zzgmtVar == null) {
            zzgmtVar = this.zzb.zza(cls);
            zzgla.zzf(cls, "messageType");
            zzgla.zzf(zzgmtVar, "schema");
            zzgmt zzgmtVar2 = (zzgmt) this.zzc.putIfAbsent(cls, zzgmtVar);
            if (zzgmtVar2 != null) {
                return zzgmtVar2;
            }
        }
        return zzgmtVar;
    }
}
