package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public abstract class zzfsr implements Comparator {
    public static zzfsr zzb(Comparator comparator) {
        if (comparator instanceof zzfsr) {
            return (zzfsr) comparator;
        }
        return new zzfqv(comparator);
    }

    public static zzfsr zzc() {
        return zzfsp.zza;
    }

    @Override // java.util.Comparator
    public abstract int compare(Object obj, Object obj2);

    public zzfsr zza() {
        return new zzfta(this);
    }
}
