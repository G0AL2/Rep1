package ge;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import qe.k;

/* compiled from: MapBuilder.kt */
/* loaded from: classes3.dex */
public final class e<K, V> extends a<Map.Entry<K, V>, K, V> {

    /* renamed from: a  reason: collision with root package name */
    private final d<K, V> f30862a;

    public e(d<K, V> dVar) {
        k.f(dVar, "backing");
        this.f30862a = dVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
        k.f(collection, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f30862a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection<? extends Object> collection) {
        k.f(collection, "elements");
        return this.f30862a.m(collection);
    }

    @Override // fe.e
    public int e() {
        return this.f30862a.size();
    }

    @Override // ge.a
    public boolean g(Map.Entry<? extends K, ? extends V> entry) {
        k.f(entry, "element");
        return this.f30862a.n(entry);
    }

    @Override // ge.a
    public boolean h(Map.Entry entry) {
        k.f(entry, "element");
        return this.f30862a.G(entry);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* renamed from: i */
    public boolean add(Map.Entry<K, V> entry) {
        k.f(entry, "element");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f30862a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<Map.Entry<K, V>> iterator() {
        return this.f30862a.r();
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection<? extends Object> collection) {
        k.f(collection, "elements");
        this.f30862a.k();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection<? extends Object> collection) {
        k.f(collection, "elements");
        this.f30862a.k();
        return super.retainAll(collection);
    }
}
