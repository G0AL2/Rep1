package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzfrw extends AbstractSequentialList implements Serializable {
    final List zza;
    final zzfok zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfrw(List list, zzfok zzfokVar) {
        this.zza = list;
        this.zzb = zzfokVar;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.zza.clear();
    }

    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i10) {
        return new zzfrv(this, this.zza.listIterator(i10));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.size();
    }
}
