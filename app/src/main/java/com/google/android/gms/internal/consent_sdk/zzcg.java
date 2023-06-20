package com.google.android.gms.internal.consent_sdk;

import java.util.Objects;

/* compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
/* loaded from: classes2.dex */
public final class zzcg<T> implements zzcl<T> {
    private static final Object zza = new Object();
    private volatile zzcl<T> zzb;
    private volatile Object zzc = zza;

    private zzcg(zzcl<T> zzclVar) {
        this.zzb = zzclVar;
    }

    public static <P extends zzcl<T>, T> zzcl<T> zza(P p10) {
        Objects.requireNonNull(p10);
        return p10 instanceof zzcg ? p10 : new zzcg(p10);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzcl
    public final T zzb() {
        T t10 = (T) this.zzc;
        Object obj = zza;
        if (t10 == obj) {
            synchronized (this) {
                t10 = this.zzc;
                if (t10 == obj) {
                    t10 = this.zzb.zzb();
                    Object obj2 = this.zzc;
                    if (obj2 != obj && !(obj2 instanceof zzcj) && obj2 != t10) {
                        String valueOf = String.valueOf(obj2);
                        String valueOf2 = String.valueOf(t10);
                        StringBuilder sb2 = new StringBuilder(valueOf.length() + 118 + valueOf2.length());
                        sb2.append("Scoped provider was invoked recursively returning different results: ");
                        sb2.append(valueOf);
                        sb2.append(" & ");
                        sb2.append(valueOf2);
                        sb2.append(". This is likely due to a circular dependency.");
                        throw new IllegalStateException(sb2.toString());
                    }
                    this.zzc = t10;
                    this.zzb = null;
                }
            }
        }
        return t10;
    }
}
