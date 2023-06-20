package ac;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: ImmutableList.java */
/* loaded from: classes3.dex */
public final class b0<E> implements List<E>, RandomAccess {

    /* renamed from: a  reason: collision with root package name */
    private final List<E> f356a;

    private b0(List<E> list) {
        this.f356a = Collections.unmodifiableList(list);
    }

    public static <E> b0<E> a(List<E> list) {
        return new b0<>(list);
    }

    public static <E> b0<E> b(E... eArr) {
        return new b0<>(Arrays.asList(eArr));
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(E e10) {
        return this.f356a.add(e10);
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends E> collection) {
        return this.f356a.addAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        this.f356a.clear();
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object obj) {
        return this.f356a.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        return this.f356a.containsAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public boolean equals(Object obj) {
        return this.f356a.equals(obj);
    }

    @Override // java.util.List
    public E get(int i10) {
        return this.f356a.get(i10);
    }

    @Override // java.util.List, java.util.Collection
    public int hashCode() {
        return this.f356a.hashCode();
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        return this.f356a.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.f356a.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return this.f356a.iterator();
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        return this.f356a.lastIndexOf(obj);
    }

    @Override // java.util.List
    public ListIterator<E> listIterator() {
        return this.f356a.listIterator();
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        return this.f356a.remove(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        return this.f356a.removeAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        return this.f356a.retainAll(collection);
    }

    @Override // java.util.List
    public E set(int i10, E e10) {
        return this.f356a.set(i10, e10);
    }

    @Override // java.util.List, java.util.Collection
    public int size() {
        return this.f356a.size();
    }

    @Override // java.util.List
    public List<E> subList(int i10, int i11) {
        return this.f356a.subList(i10, i11);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return this.f356a.toArray();
    }

    @Override // java.util.List
    public void add(int i10, E e10) {
        this.f356a.add(i10, e10);
    }

    @Override // java.util.List
    public boolean addAll(int i10, Collection<? extends E> collection) {
        return this.f356a.addAll(i10, collection);
    }

    @Override // java.util.List
    public ListIterator<E> listIterator(int i10) {
        return this.f356a.listIterator(i10);
    }

    @Override // java.util.List
    public E remove(int i10) {
        return this.f356a.remove(i10);
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) this.f356a.toArray(tArr);
    }
}
