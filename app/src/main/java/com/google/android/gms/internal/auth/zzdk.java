package com.google.android.gms.internal.auth;

import java.io.Serializable;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: classes2.dex */
public final class zzdk {
    public static <T> zzdg<T> zza(zzdg<T> zzdgVar) {
        if ((zzdgVar instanceof zzdi) || (zzdgVar instanceof zzdh)) {
            return zzdgVar;
        }
        if (zzdgVar instanceof Serializable) {
            return new zzdh(zzdgVar);
        }
        return new zzdi(zzdgVar);
    }

    public static <T> zzdg<T> zzb(T t10) {
        return new zzdj(t10);
    }
}
