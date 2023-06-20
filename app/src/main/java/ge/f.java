package ge;

import java.util.Collection;
import java.util.Iterator;
import qe.k;

/* compiled from: MapBuilder.kt */
/* loaded from: classes3.dex */
public final class f<E> extends fe.e<E> {

    /* renamed from: a  reason: collision with root package name */
    private final d<E, ?> f30863a;

    public f(d<E, ?> dVar) {
        k.f(dVar, "backing");
        this.f30863a = dVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(E e10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends E> collection) {
        k.f(collection, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f30863a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f30863a.containsKey(obj);
    }

    @Override // fe.e
    public int e() {
        return this.f30863a.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f30863a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return this.f30863a.B();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        return this.f30863a.I(obj) >= 0;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection<? extends Object> collection) {
        k.f(collection, "elements");
        this.f30863a.k();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection<? extends Object> collection) {
        k.f(collection, "elements");
        this.f30863a.k();
        return super.retainAll(collection);
    }
}
