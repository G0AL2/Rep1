package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzgkx extends AbstractList {
    private final List zza;
    private final zzgkw zzb;

    public zzgkx(List list, zzgkw zzgkwVar) {
        this.zza = list;
        this.zzb = zzgkwVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        zzbek zzb = zzbek.zzb(((Integer) this.zza.get(i10)).intValue());
        return zzb == null ? zzbek.AD_FORMAT_TYPE_UNSPECIFIED : zzb;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.size();
    }
}
