package com.google.android.gms.internal.consent_sdk;

import java.util.Objects;

/* compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
/* loaded from: classes2.dex */
public final class zzci<T> implements zzch<T> {
    private static final zzci<Object> zza = new zzci<>(null);
    private final T zzb;

    private zzci(T t10) {
        this.zzb = t10;
    }

    public static <T> zzch<T> zza(T t10) {
        Objects.requireNonNull(t10, "instance cannot be null");
        return new zzci(t10);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzcl
    public final T zzb() {
        return this.zzb;
    }
}
