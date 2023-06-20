package com.google.android.gms.internal.auth;

import java.io.Serializable;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: classes2.dex */
public abstract class zzde<T> implements Serializable {
    public static <T> zzde<T> zzc() {
        return zzdc.zza;
    }

    public static <T> zzde<T> zzd(T t10) {
        return new zzdf(t10);
    }

    public abstract T zza();

    public abstract boolean zzb();
}
