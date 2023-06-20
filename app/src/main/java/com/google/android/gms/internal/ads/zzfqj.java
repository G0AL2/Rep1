package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public class zzfqj extends AbstractCollection {
    final Collection zza;
    final zzfov zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfqj(Collection collection, zzfov zzfovVar) {
        this.zza = collection;
        this.zzb = zzfovVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        zzfou.zze(this.zzb.zza(obj));
        return this.zza.add(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        for (Object obj : collection) {
            zzfou.zze(this.zzb.zza(obj));
        }
        return this.zza.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        zzfrp.zza(this.zza, this.zzb);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (zzfqk.zza(this.zza, obj)) {
            return this.zzb.zza(obj);
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection collection) {
        for (Object obj : collection) {
            if (!contains(obj)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        Collection<Object> collection = this.zza;
        zzfov zzfovVar = this.zzb;
        zzfou.zzc(zzfovVar, "predicate");
        int i10 = 0;
        for (Object obj : collection) {
            if (zzfovVar.zza(obj)) {
                return i10 == -1;
            }
            i10++;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        Iterator it = this.zza.iterator();
        zzfov zzfovVar = this.zzb;
        Objects.requireNonNull(it);
        Objects.requireNonNull(zzfovVar);
        return new zzfrq(it, zzfovVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        return contains(obj) && this.zza.remove(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        Iterator it = this.zza.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.zzb.zza(next) && collection.contains(next)) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        Iterator it = this.zza.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.zzb.zza(next) && !collection.contains(next)) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        int i10 = 0;
        for (Object obj : this.zza) {
            if (this.zzb.zza(obj)) {
                i10++;
            }
        }
        return i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        Iterator it = iterator();
        ArrayList arrayList = new ArrayList();
        zzfrt.zzc(arrayList, it);
        return arrayList.toArray();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        Iterator it = iterator();
        ArrayList arrayList = new ArrayList();
        zzfrt.zzc(arrayList, it);
        return arrayList.toArray(objArr);
    }
}
