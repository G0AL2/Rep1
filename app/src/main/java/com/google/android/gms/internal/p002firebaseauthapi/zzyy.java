package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzyy  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzyy {
    static final zzyy zza = new zzyy(true);
    private static volatile boolean zzb = false;
    private static volatile zzyy zzc;
    private final Map zzd;

    zzyy() {
        this.zzd = new HashMap();
    }

    public static zzyy zza() {
        zzyy zzyyVar = zzc;
        if (zzyyVar == null) {
            synchronized (zzyy.class) {
                zzyyVar = zzc;
                if (zzyyVar == null) {
                    zzyyVar = zza;
                    zzc = zzyyVar;
                }
            }
        }
        return zzyyVar;
    }

    public final zzzj zzb(zzaaq zzaaqVar, int i10) {
        return (zzzj) this.zzd.get(new zzyx(zzaaqVar, i10));
    }

    zzyy(boolean z10) {
        this.zzd = Collections.emptyMap();
    }
}
