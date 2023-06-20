package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public class zzfqb extends AbstractCollection {
    final Object zza;
    Collection zzb;
    final zzfqb zzc;
    final Collection zzd;
    final /* synthetic */ zzfqe zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfqb(zzfqe zzfqeVar, Object obj, Collection collection, zzfqb zzfqbVar) {
        this.zze = zzfqeVar;
        this.zza = obj;
        this.zzb = collection;
        this.zzc = zzfqbVar;
        this.zzd = zzfqbVar == null ? null : zzfqbVar.zzb;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        zzb();
        boolean isEmpty = this.zzb.isEmpty();
        boolean add = this.zzb.add(obj);
        if (add) {
            zzfqe.zzd(this.zze);
            if (isEmpty) {
                zza();
                return true;
            }
            return add;
        }
        return add;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = this.zzb.addAll(collection);
        if (addAll) {
            zzfqe.zzf(this.zze, this.zzb.size() - size);
            if (size == 0) {
                zza();
                return true;
            }
            return addAll;
        }
        return addAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        int size = size();
        if (size == 0) {
            return;
        }
        this.zzb.clear();
        zzfqe.zzg(this.zze, size);
        zzc();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        zzb();
        return this.zzb.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection collection) {
        zzb();
        return this.zzb.containsAll(collection);
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        zzb();
        return this.zzb.equals(obj);
    }

    @Override // java.util.Collection
    public final int hashCode() {
        zzb();
        return this.zzb.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        zzb();
        return new zzfqa(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        zzb();
        boolean remove = this.zzb.remove(obj);
        if (remove) {
            zzfqe.zze(this.zze);
            zzc();
        }
        return remove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean removeAll = this.zzb.removeAll(collection);
        if (removeAll) {
            zzfqe.zzf(this.zze, this.zzb.size() - size);
            zzc();
        }
        return removeAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        Objects.requireNonNull(collection);
        int size = size();
        boolean retainAll = this.zzb.retainAll(collection);
        if (retainAll) {
            zzfqe.zzf(this.zze, this.zzb.size() - size);
            zzc();
        }
        return retainAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        zzb();
        return this.zzb.size();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        zzb();
        return this.zzb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza() {
        Map map;
        zzfqb zzfqbVar = this.zzc;
        if (zzfqbVar != null) {
            zzfqbVar.zza();
            return;
        }
        map = this.zze.zza;
        map.put(this.zza, this.zzb);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzb() {
        Map map;
        zzfqb zzfqbVar = this.zzc;
        if (zzfqbVar != null) {
            zzfqbVar.zzb();
            if (this.zzc.zzb != this.zzd) {
                throw new ConcurrentModificationException();
            }
        } else if (this.zzb.isEmpty()) {
            map = this.zze.zza;
            Collection collection = (Collection) map.get(this.zza);
            if (collection != null) {
                this.zzb = collection;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzc() {
        Map map;
        zzfqb zzfqbVar = this.zzc;
        if (zzfqbVar != null) {
            zzfqbVar.zzc();
        } else if (this.zzb.isEmpty()) {
            map = this.zze.zza;
            map.remove(this.zza);
        }
    }
}
