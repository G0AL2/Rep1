package com.google.android.gms.internal.measurement;

import java.io.Serializable;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.2 */
/* loaded from: classes2.dex */
public final class zzij {
    public static zzif zza(zzif zzifVar) {
        if ((zzifVar instanceof zzih) || (zzifVar instanceof zzig)) {
            return zzifVar;
        }
        if (zzifVar instanceof Serializable) {
            return new zzig(zzifVar);
        }
        return new zzih(zzifVar);
    }

    public static zzif zzb(Object obj) {
        return new zzii(obj);
    }
}
