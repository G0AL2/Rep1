package com.facebook.ads.redexgen.X;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: com.facebook.ads.redexgen.X.2d  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC06202d<K, V> {
    public static String[] A03 = {"cnftN0nKJ399Diaxmn3tb8gwwrPO2aP4", "GD6Q0W3wC2KuP8ibvS2RtWU8XnqZN0Aj", "FY51T4e3CIDMofRfjaJn97HmoXO", "oFsWTCKeXQMPzJkbzzVFh0WI6lr", "sX7ClejzrEImqIfblQB7OY3eSnYyqYGK", "70PxY4sPYcKp4dj9du2NwnU3Lx25y2ig", "AJxY89BB1aRneGLKwVE9Pufkgncldx4M", "HDwbCIFP6XJ1qJgKvPjZQVX8jvQoDt8b"};
    /* JADX WARN: Incorrect inner types in field signature: Lcom/facebook/ads/redexgen/X/2d<TK;TV;>.EntrySet; */
    public C2Z A00;
    /* JADX WARN: Incorrect inner types in field signature: Lcom/facebook/ads/redexgen/X/2d<TK;TV;>.KeySet; */
    public C06172a A01;
    /* JADX WARN: Incorrect inner types in field signature: Lcom/facebook/ads/redexgen/X/2d<TK;TV;>.ValuesCollection; */
    public C06192c A02;

    public abstract int A04();

    public abstract int A05(Object obj);

    public abstract int A06(Object obj);

    public abstract Object A07(int i10, int i11);

    public abstract V A08(int i10, V v10);

    public abstract Map<K, V> A0A();

    public abstract void A0D();

    public abstract void A0E(int i10);

    public abstract void A0F(K k10, V v10);

    public static <K, V> boolean A00(Map<K, V> map, Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!map.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    public static <K, V> boolean A01(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            map.remove(it.next());
        }
        return size != map.size();
    }

    public static <K, V> boolean A02(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<K> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    public static <T> boolean A03(Set<T> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set<?> s10 = (Set) obj;
            try {
                if (set.size() == s10.size()) {
                    if (set.containsAll(s10)) {
                        return true;
                    }
                }
                return false;
            } catch (ClassCastException unused) {
                return false;
            } catch (NullPointerException unused2) {
                return false;
            }
        }
        return false;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2d != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V> */
    public final Collection<V> A09() {
        if (this.A02 == null) {
            this.A02 = new Collection<V>() { // from class: com.facebook.ads.redexgen.X.2c
                public static String[] A01 = {"WaXEENy4Qqf0iZa9rE7K5Tc", "CdcJslr1GuWzD3hgs8KQ2mZhu", "VqX8APEjT5Wjv2WgYqLWWETF9QEoqL89", "1lDdPMX0zjCtSNVsVcyG9UOAfTksMFfY", "Q30AX00aPMLh2Hp2SxjAPSj4hvT3yuLk", "DGZ9hWDjpXQG3w", "JKstht1TU3rAhNk0s2YNIFhF9tCkCvUD", "xnB3F8eRzgUElZJXVWbAPi1tu19rGp71"};

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2c != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$ValuesCollection */
                @Override // java.util.Collection
                public final boolean add(V v10) {
                    throw new UnsupportedOperationException();
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2c != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$ValuesCollection */
                @Override // java.util.Collection
                public final boolean addAll(Collection<? extends V> collection) {
                    throw new UnsupportedOperationException();
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2c != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$ValuesCollection */
                @Override // java.util.Collection
                public final void clear() {
                    AbstractC06202d.this.A0D();
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2c != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$ValuesCollection */
                @Override // java.util.Collection
                public final boolean contains(Object obj) {
                    return AbstractC06202d.this.A06(obj) >= 0;
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2c != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$ValuesCollection */
                @Override // java.util.Collection
                public final boolean containsAll(Collection<?> collection) {
                    Iterator<?> it = collection.iterator();
                    while (it.hasNext()) {
                        if (!contains(it.next())) {
                            return false;
                        }
                    }
                    return true;
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2c != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$ValuesCollection */
                @Override // java.util.Collection
                public final boolean isEmpty() {
                    return AbstractC06202d.this.A04() == 0;
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2c != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$ValuesCollection */
                @Override // java.util.Collection, java.lang.Iterable
                public final Iterator<V> iterator() {
                    return new C2Y(AbstractC06202d.this, 1);
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2c != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$ValuesCollection */
                @Override // java.util.Collection
                public final boolean remove(Object obj) {
                    int A06 = AbstractC06202d.this.A06(obj);
                    if (A06 >= 0) {
                        AbstractC06202d.this.A0E(A06);
                        return true;
                    } else if (A01[6].charAt(4) != 'M') {
                        String[] strArr = A01;
                        strArr[1] = "JaPNh4sPI8rJ5EjhCFrDgKQsA";
                        strArr[5] = "wvLzjGRSTCxgOw";
                        return false;
                    } else {
                        throw new RuntimeException();
                    }
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2c != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$ValuesCollection */
                @Override // java.util.Collection
                public final boolean removeAll(Collection<?> collection) {
                    int A04 = AbstractC06202d.this.A04();
                    boolean z10 = false;
                    int i10 = 0;
                    while (i10 < A04) {
                        if (collection.contains(AbstractC06202d.this.A07(i10, 1))) {
                            AbstractC06202d.this.A0E(i10);
                            i10--;
                            A04--;
                            z10 = true;
                        }
                        i10++;
                    }
                    return z10;
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2c != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$ValuesCollection */
                @Override // java.util.Collection
                public final boolean retainAll(Collection<?> collection) {
                    int A04 = AbstractC06202d.this.A04();
                    boolean z10 = false;
                    int i10 = 0;
                    while (i10 < A04) {
                        if (!collection.contains(AbstractC06202d.this.A07(i10, 1))) {
                            AbstractC06202d.this.A0E(i10);
                            i10--;
                            A04--;
                            z10 = true;
                        }
                        i10++;
                    }
                    return z10;
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2c != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$ValuesCollection */
                @Override // java.util.Collection
                public final int size() {
                    return AbstractC06202d.this.A04();
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2c != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$ValuesCollection */
                @Override // java.util.Collection
                public final Object[] toArray() {
                    return AbstractC06202d.this.A0G(1);
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2c != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$ValuesCollection */
                @Override // java.util.Collection
                public final <T> T[] toArray(T[] tArr) {
                    T[] array = (T[]) AbstractC06202d.this.A0H(tArr, 1);
                    return array;
                }
            };
        }
        return this.A02;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2d != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V> */
    public final Set<Map.Entry<K, V>> A0B() {
        if (this.A00 == null) {
            this.A00 = new Set<Map.Entry<K, V>>() { // from class: com.facebook.ads.redexgen.X.2Z
                /* JADX INFO: Access modifiers changed from: private */
                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2Z != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$EntrySet */
                @Override // java.util.Set, java.util.Collection
                /* renamed from: A00 */
                public final boolean add(Map.Entry<K, V> entry) {
                    throw new UnsupportedOperationException();
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2Z != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$EntrySet */
                @Override // java.util.Set, java.util.Collection
                public final boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
                    int A04 = AbstractC06202d.this.A04();
                    for (Map.Entry<K, V> entry : collection) {
                        AbstractC06202d.this.A0F(entry.getKey(), entry.getValue());
                    }
                    return A04 != AbstractC06202d.this.A04();
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2Z != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$EntrySet */
                @Override // java.util.Set, java.util.Collection
                public final void clear() {
                    AbstractC06202d.this.A0D();
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2Z != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$EntrySet */
                @Override // java.util.Set, java.util.Collection
                public final boolean contains(Object obj) {
                    if (obj instanceof Map.Entry) {
                        Map.Entry entry = (Map.Entry) obj;
                        int A05 = AbstractC06202d.this.A05(entry.getKey());
                        if (A05 < 0) {
                            return false;
                        }
                        return C2W.A04(AbstractC06202d.this.A07(A05, 1), entry.getValue());
                    }
                    return false;
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2Z != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$EntrySet */
                @Override // java.util.Set, java.util.Collection
                public final boolean containsAll(Collection<?> collection) {
                    Iterator<?> it = collection.iterator();
                    while (it.hasNext()) {
                        if (!contains(it.next())) {
                            return false;
                        }
                    }
                    return true;
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2Z != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$EntrySet */
                @Override // java.util.Set, java.util.Collection
                public final boolean equals(Object obj) {
                    return AbstractC06202d.A03(this, obj);
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2Z != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$EntrySet */
                @Override // java.util.Set, java.util.Collection
                public final int hashCode() {
                    int i10 = 0;
                    for (int A04 = AbstractC06202d.this.A04() - 1; A04 >= 0; A04--) {
                        int i11 = 0;
                        Object A07 = AbstractC06202d.this.A07(A04, 0);
                        Object A072 = AbstractC06202d.this.A07(A04, 1);
                        int hashCode = A07 == null ? 0 : A07.hashCode();
                        if (A072 != null) {
                            i11 = A072.hashCode();
                        }
                        i10 += i11 ^ hashCode;
                    }
                    return i10;
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2Z != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$EntrySet */
                @Override // java.util.Set, java.util.Collection
                public final boolean isEmpty() {
                    return AbstractC06202d.this.A04() == 0;
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2Z != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$EntrySet */
                @Override // java.util.Set, java.util.Collection, java.lang.Iterable
                public final Iterator<Map.Entry<K, V>> iterator() {
                    return new C06182b(AbstractC06202d.this);
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2Z != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$EntrySet */
                @Override // java.util.Set, java.util.Collection
                public final boolean remove(Object obj) {
                    throw new UnsupportedOperationException();
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2Z != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$EntrySet */
                @Override // java.util.Set, java.util.Collection
                public final boolean removeAll(Collection<?> collection) {
                    throw new UnsupportedOperationException();
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2Z != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$EntrySet */
                @Override // java.util.Set, java.util.Collection
                public final boolean retainAll(Collection<?> collection) {
                    throw new UnsupportedOperationException();
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2Z != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$EntrySet */
                @Override // java.util.Set, java.util.Collection
                public final int size() {
                    return AbstractC06202d.this.A04();
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2Z != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$EntrySet */
                @Override // java.util.Set, java.util.Collection
                public final Object[] toArray() {
                    throw new UnsupportedOperationException();
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2Z != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$EntrySet */
                @Override // java.util.Set, java.util.Collection
                public final <T> T[] toArray(T[] tArr) {
                    throw new UnsupportedOperationException();
                }
            };
        }
        C2Z c2z = this.A00;
        if (A03[1].charAt(12) != 'P') {
            throw new RuntimeException();
        }
        String[] strArr = A03;
        strArr[4] = "9ju5liavVqCXLI9PRLJCuH215nhDnaAN";
        strArr[6] = "X1eenRL1zYDBvWo2ZsNSENOyPnB3gIiL";
        return c2z;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2d != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V> */
    public final Set<K> A0C() {
        if (this.A01 == null) {
            this.A01 = new Set<K>() { // from class: com.facebook.ads.redexgen.X.2a
                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2a != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$KeySet */
                @Override // java.util.Set, java.util.Collection
                public final boolean add(K k10) {
                    throw new UnsupportedOperationException();
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2a != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$KeySet */
                @Override // java.util.Set, java.util.Collection
                public final boolean addAll(Collection<? extends K> collection) {
                    throw new UnsupportedOperationException();
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2a != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$KeySet */
                @Override // java.util.Set, java.util.Collection
                public final void clear() {
                    AbstractC06202d.this.A0D();
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2a != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$KeySet */
                @Override // java.util.Set, java.util.Collection
                public final boolean contains(Object obj) {
                    return AbstractC06202d.this.A05(obj) >= 0;
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2a != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$KeySet */
                @Override // java.util.Set, java.util.Collection
                public final boolean containsAll(Collection<?> collection) {
                    return AbstractC06202d.A00(AbstractC06202d.this.A0A(), collection);
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2a != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$KeySet */
                @Override // java.util.Set, java.util.Collection
                public final boolean equals(Object obj) {
                    return AbstractC06202d.A03(this, obj);
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2a != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$KeySet */
                @Override // java.util.Set, java.util.Collection
                public final int hashCode() {
                    int i10 = 0;
                    for (int A04 = AbstractC06202d.this.A04() - 1; A04 >= 0; A04--) {
                        int i11 = 0;
                        Object obj = AbstractC06202d.this.A07(A04, 0);
                        if (obj != null) {
                            i11 = obj.hashCode();
                        }
                        i10 += i11;
                    }
                    return i10;
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2a != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$KeySet */
                @Override // java.util.Set, java.util.Collection
                public final boolean isEmpty() {
                    return AbstractC06202d.this.A04() == 0;
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2a != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$KeySet */
                @Override // java.util.Set, java.util.Collection, java.lang.Iterable
                public final Iterator<K> iterator() {
                    return new C2Y(AbstractC06202d.this, 0);
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2a != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$KeySet */
                @Override // java.util.Set, java.util.Collection
                public final boolean remove(Object obj) {
                    int A05 = AbstractC06202d.this.A05(obj);
                    if (A05 >= 0) {
                        AbstractC06202d.this.A0E(A05);
                        return true;
                    }
                    return false;
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2a != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$KeySet */
                @Override // java.util.Set, java.util.Collection
                public final boolean removeAll(Collection<?> collection) {
                    return AbstractC06202d.A01(AbstractC06202d.this.A0A(), collection);
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2a != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$KeySet */
                @Override // java.util.Set, java.util.Collection
                public final boolean retainAll(Collection<?> collection) {
                    return AbstractC06202d.A02(AbstractC06202d.this.A0A(), collection);
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2a != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$KeySet */
                @Override // java.util.Set, java.util.Collection
                public final int size() {
                    return AbstractC06202d.this.A04();
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2a != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$KeySet */
                @Override // java.util.Set, java.util.Collection
                public final Object[] toArray() {
                    return AbstractC06202d.this.A0G(0);
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2a != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$KeySet */
                @Override // java.util.Set, java.util.Collection
                public final <T> T[] toArray(T[] tArr) {
                    T[] array = (T[]) AbstractC06202d.this.A0H(tArr, 0);
                    return array;
                }
            };
        }
        return this.A01;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2d != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V> */
    public final Object[] A0G(int i10) {
        int i11 = A04();
        Object[] objArr = new Object[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            objArr[i12] = A07(i12, i10);
        }
        return objArr;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2d != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V> */
    /* JADX WARN: Multi-variable type inference failed */
    public final <T> T[] A0H(T[] newArray, int i10) {
        int A04 = A04();
        if (newArray.length < A04) {
            newArray = (T[]) ((Object[]) Array.newInstance(newArray.getClass().getComponentType(), A04));
        }
        for (int i11 = 0; i11 < A04; i11++) {
            newArray[i11] = A07(i11, i10);
        }
        if (newArray.length > A04) {
            newArray[A04] = null;
        }
        return newArray;
    }
}
