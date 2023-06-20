package com.google.android.gms.internal.consent_sdk;

import java.util.Objects;

/* compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
/* loaded from: classes2.dex */
public final class zzck {
    public static <T> T zza(T t10) {
        Objects.requireNonNull(t10, "Cannot return null from a non-@Nullable @Provides method");
        return t10;
    }

    public static <T> void zzb(T t10, Class<T> cls) {
        if (t10 == null) {
            throw new IllegalStateException(String.valueOf(cls.getCanonicalName()).concat(" must be set"));
        }
    }
}
