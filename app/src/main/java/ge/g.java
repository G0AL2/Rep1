package ge;

import java.util.Collection;
import java.util.Iterator;
import qe.k;

/* compiled from: MapBuilder.kt */
/* loaded from: classes3.dex */
public final class g<V> extends fe.c<V> {

    /* renamed from: a  reason: collision with root package name */
    private final d<?, V> f30864a;

    public g(d<?, V> dVar) {
        k.f(dVar, "backing");
        this.f30864a = dVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean add(V v10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean addAll(Collection<? extends V> collection) {
        k.f(collection, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.f30864a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return this.f30864a.containsValue(obj);
    }

    @Override // fe.c
    public int e() {
        return this.f30864a.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return this.f30864a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator<V> iterator() {
        return this.f30864a.L();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        return this.f30864a.K(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        k.f(collection, "elements");
        this.f30864a.k();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        k.f(collection, "elements");
        this.f30864a.k();
        return super.retainAll(collection);
    }
}
