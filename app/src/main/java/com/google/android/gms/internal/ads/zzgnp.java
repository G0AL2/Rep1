package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzgnp extends AbstractList implements RandomAccess, zzgli {
    private final zzgli zza;

    public zzgnp(zzgli zzgliVar) {
        this.zza = zzgliVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i10) {
        return ((zzglh) this.zza).get(i10);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new zzgno(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i10) {
        return new zzgnn(this, i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.size();
    }

    @Override // com.google.android.gms.internal.ads.zzgli
    public final zzgli zze() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgli
    public final Object zzf(int i10) {
        return this.zza.zzf(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzgli
    public final List zzh() {
        return this.zza.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzgli
    public final void zzi(zzgji zzgjiVar) {
        throw new UnsupportedOperationException();
    }
}
