package com.applovin.impl.sdk.utils;

import java.lang.Comparable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.RandomAccess;
import java.util.Set;

/* loaded from: classes.dex */
public class l<T extends Comparable<? super T>> implements RandomAccess, Set<T> {

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList<T> f8917a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    private final HashSet<T> f8918b = new HashSet<>();

    public T a() {
        return this.f8917a.get(size() - 1);
    }

    public T a(int i10) {
        return this.f8917a.get(i10);
    }

    public void a(int i10, T t10) {
        this.f8918b.remove(this.f8917a.get(i10));
        this.f8917a.set(i10, t10);
        this.f8918b.add(t10);
    }

    public boolean a(T t10) {
        if (contains(t10)) {
            return false;
        }
        if (isEmpty() || t10.compareTo(a()) > 0) {
            this.f8917a.add(t10);
        } else {
            this.f8917a.add(c(t10), t10);
        }
        return this.f8918b.add(t10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Set, java.util.Collection
    public /* synthetic */ boolean add(Object obj) {
        return a((l<T>) ((Comparable) obj));
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection<? extends T> collection) {
        boolean z10;
        while (true) {
            for (T t10 : collection) {
                z10 = a((l<T>) t10) || z10;
            }
            return z10;
        }
    }

    public int b(T t10) {
        if (t10 == null || !contains(t10)) {
            return -1;
        }
        return c(t10);
    }

    public T b(int i10) {
        T remove = this.f8917a.remove(i10);
        this.f8918b.remove(remove);
        return remove;
    }

    public int c(T t10) {
        int binarySearch = Collections.binarySearch(this.f8917a, t10);
        if (binarySearch < 0) {
            return ~binarySearch;
        }
        T a10 = a(binarySearch);
        while (binarySearch >= 0 && a10 == a(binarySearch)) {
            binarySearch--;
        }
        return binarySearch + 1;
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        this.f8917a.clear();
        this.f8918b.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(Object obj) {
        return this.f8918b.contains(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        return this.f8918b.containsAll(collection);
    }

    public int d(T t10) {
        int binarySearch = Collections.binarySearch(this.f8917a, t10);
        if (binarySearch < 0) {
            return ~binarySearch;
        }
        T a10 = a(binarySearch);
        while (binarySearch < size() && a10 == a(binarySearch)) {
            binarySearch++;
        }
        return binarySearch;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return this.f8917a.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator<T> iterator() {
        return this.f8917a.iterator();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object obj) {
        int b10 = b((l<T>) ((Comparable) obj));
        if (b10 == -1) {
            return false;
        }
        this.f8917a.remove(b10);
        return this.f8918b.remove(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (true) {
            while (it.hasNext()) {
                boolean z10 = z10 || remove(it.next());
            }
            return false;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        boolean z10 = false;
        for (int size = size() - 1; size >= 0; size--) {
            T t10 = this.f8917a.get(size);
            if (!collection.contains(t10)) {
                this.f8917a.remove(size);
                this.f8918b.remove(t10);
                z10 = true;
            }
        }
        return z10;
    }

    @Override // java.util.Set, java.util.Collection
    public int size() {
        return this.f8917a.size();
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        return this.f8917a.toArray();
    }

    @Override // java.util.Set, java.util.Collection
    public <T1> T1[] toArray(T1[] t1Arr) {
        return (T1[]) this.f8917a.toArray(t1Arr);
    }
}
