package com.google.android.gms.internal.common;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* loaded from: classes2.dex */
public abstract class zzac<E> extends AbstractCollection<E> implements Serializable {
    private static final Object[] zza = new Object[0];

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean add(E e10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(zza);
    }

    int zza(Object[] objArr, int i10) {
        throw null;
    }

    int zzb() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int zzc() {
        throw null;
    }

    public zzag<E> zzd() {
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: zze */
    public abstract zzaj<E> iterator();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract boolean zzf();

    /* JADX INFO: Access modifiers changed from: package-private */
    public Object[] zzg() {
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        Objects.requireNonNull(tArr);
        int size = size();
        int length = tArr.length;
        if (length < size) {
            Object[] zzg = zzg();
            if (zzg == null) {
                tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), size));
            } else {
                return (T[]) Arrays.copyOfRange(zzg, zzc(), zzb(), tArr.getClass());
            }
        } else if (length > size) {
            tArr[size] = null;
        }
        zza(tArr, 0);
        return tArr;
    }
}
