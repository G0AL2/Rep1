package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzgqt implements zzgrh, zzgqo {
    private static final Object zza = new Object();
    private volatile zzgrh zzb;
    private volatile Object zzc = zza;

    private zzgqt(zzgrh zzgrhVar) {
        this.zzb = zzgrhVar;
    }

    public static zzgqo zza(zzgrh zzgrhVar) {
        if (zzgrhVar instanceof zzgqo) {
            return (zzgqo) zzgrhVar;
        }
        Objects.requireNonNull(zzgrhVar);
        return new zzgqt(zzgrhVar);
    }

    public static zzgrh zzc(zzgrh zzgrhVar) {
        Objects.requireNonNull(zzgrhVar);
        return zzgrhVar instanceof zzgqt ? zzgrhVar : new zzgqt(zzgrhVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgrh
    public final Object zzb() {
        Object obj = this.zzc;
        Object obj2 = zza;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.zzc;
                if (obj == obj2) {
                    obj = this.zzb.zzb();
                    Object obj3 = this.zzc;
                    if (obj3 != obj2 && obj3 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.zzc = obj;
                    this.zzb = null;
                }
            }
        }
        return obj;
    }
}
