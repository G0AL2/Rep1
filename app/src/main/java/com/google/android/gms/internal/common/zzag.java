package com.google.android.gms.internal.common;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* loaded from: classes2.dex */
public abstract class zzag<E> extends zzac<E> implements List<E>, RandomAccess {
    private static final zzak<Object> zza = new zzae(zzai.zza, 0);

    static <E> zzag<E> zzi(Object[] objArr, int i10) {
        if (i10 == 0) {
            return (zzag<E>) zzai.zza;
        }
        return new zzai(objArr, i10);
    }

    public static <E> zzag<E> zzj(Iterable<? extends E> iterable) {
        Objects.requireNonNull(iterable);
        if (iterable instanceof Collection) {
            return zzk((Collection) iterable);
        }
        Iterator<? extends E> it = iterable.iterator();
        if (!it.hasNext()) {
            return (zzag<E>) zzai.zza;
        }
        E next = it.next();
        if (!it.hasNext()) {
            return zzm(next);
        }
        zzad zzadVar = new zzad(4);
        zzadVar.zzb((zzad) next);
        zzadVar.zzc(it);
        zzadVar.zzc = true;
        return zzi(zzadVar.zza, zzadVar.zzb);
    }

    public static <E> zzag<E> zzk(Collection<? extends E> collection) {
        if (collection instanceof zzac) {
            zzag<E> zzd = ((zzac) collection).zzd();
            if (zzd.zzf()) {
                Object[] array = zzd.toArray();
                return zzi(array, array.length);
            }
            return zzd;
        }
        Object[] array2 = collection.toArray();
        int length = array2.length;
        zzah.zza(array2, length);
        return zzi(array2, length);
    }

    public static <E> zzag<E> zzl() {
        return (zzag<E>) zzai.zza;
    }

    public static <E> zzag<E> zzm(E e10) {
        Object[] objArr = {e10};
        zzah.zza(objArr, 1);
        return zzi(objArr, 1);
    }

    public static <E> zzag<E> zzn(E e10, E e11) {
        Object[] objArr = {e10, e11};
        zzah.zza(objArr, 2);
        return zzi(objArr, 2);
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i10, E e10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i10, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int i10 = 0; i10 < size; i10++) {
                        if (zzr.zza(get(i10), list.get(i10))) {
                        }
                    }
                    return true;
                }
                Iterator<E> it = iterator();
                Iterator<E> it2 = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (it2.hasNext()) {
                            if (!zzr.zza(it.next(), it2.next())) {
                                break;
                            }
                        } else {
                            break;
                        }
                    } else if (!it2.hasNext()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i10 = 1;
        for (int i11 = 0; i11 < size; i11++) {
            i10 = (i10 * 31) + get(i11).hashCode();
        }
        return i10;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (obj.equals(get(i10))) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.common.zzac, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    @Deprecated
    public final E remove(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final E set(int i10, E e10) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.common.zzac
    int zza(Object[] objArr, int i10) {
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            objArr[i11] = get(i11);
        }
        return size;
    }

    @Override // com.google.android.gms.internal.common.zzac
    @Deprecated
    public final zzag<E> zzd() {
        return this;
    }

    @Override // com.google.android.gms.internal.common.zzac
    public final zzaj<E> zze() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* renamed from: zzh */
    public zzag<E> subList(int i10, int i11) {
        zzs.zzc(i10, i11, size());
        int i12 = i11 - i10;
        if (i12 == size()) {
            return this;
        }
        if (i12 == 0) {
            return (zzag<E>) zzai.zza;
        }
        return new zzaf(this, i10, i12);
    }

    @Override // java.util.List
    /* renamed from: zzo */
    public final zzak<E> listIterator(int i10) {
        zzs.zzb(i10, size(), "index");
        return isEmpty() ? (zzak<E>) zza : new zzae(this, i10);
    }
}
