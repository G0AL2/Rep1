package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaay  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzaay {
    private static final zzaay zza = new zzaay();
    private final ConcurrentMap zzc = new ConcurrentHashMap();
    private final zzabd zzb = new zzaai();

    private zzaay() {
    }

    public static zzaay zza() {
        return zza;
    }

    public final zzabc zzb(Class cls) {
        zzzr.zzf(cls, "messageType");
        zzabc zzabcVar = (zzabc) this.zzc.get(cls);
        if (zzabcVar == null) {
            zzabcVar = this.zzb.zza(cls);
            zzzr.zzf(cls, "messageType");
            zzzr.zzf(zzabcVar, "schema");
            zzabc zzabcVar2 = (zzabc) this.zzc.putIfAbsent(cls, zzabcVar);
            if (zzabcVar2 != null) {
                return zzabcVar2;
            }
        }
        return zzabcVar;
    }
}
