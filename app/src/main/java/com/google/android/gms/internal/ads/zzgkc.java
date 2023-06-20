package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzgkc {
    static final zzgkc zza = new zzgkc(true);
    private static volatile boolean zzb = false;
    private static volatile zzgkc zzc;
    private static volatile zzgkc zzd;
    private final Map zze;

    zzgkc() {
        this.zze = new HashMap();
    }

    public static zzgkc zza() {
        zzgkc zzgkcVar = zzc;
        if (zzgkcVar == null) {
            synchronized (zzgkc.class) {
                zzgkcVar = zzc;
                if (zzgkcVar == null) {
                    zzgkcVar = zza;
                    zzc = zzgkcVar;
                }
            }
        }
        return zzgkcVar;
    }

    public static zzgkc zzb() {
        zzgkc zzgkcVar = zzd;
        if (zzgkcVar != null) {
            return zzgkcVar;
        }
        synchronized (zzgkc.class) {
            zzgkc zzgkcVar2 = zzd;
            if (zzgkcVar2 != null) {
                return zzgkcVar2;
            }
            zzgkc zzb2 = zzgkk.zzb(zzgkc.class);
            zzd = zzb2;
            return zzb2;
        }
    }

    public final zzgko zzc(zzgma zzgmaVar, int i10) {
        return (zzgko) this.zze.get(new zzgkb(zzgmaVar, i10));
    }

    zzgkc(boolean z10) {
        this.zze = Collections.emptyMap();
    }
}
