package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzfsp extends zzfsr implements Serializable {
    static final zzfsp zza = new zzfsp();

    private zzfsp() {
    }

    @Override // com.google.android.gms.internal.ads.zzfsr, java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        Objects.requireNonNull(comparable);
        Objects.requireNonNull(comparable2);
        return comparable.compareTo(comparable2);
    }

    public final String toString() {
        return "Ordering.natural()";
    }

    @Override // com.google.android.gms.internal.ads.zzfsr
    public final zzfsr zza() {
        return zzfsz.zza;
    }
}
