package ge;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import qe.k;

/* compiled from: SetBuilder.kt */
/* loaded from: classes3.dex */
public final class h<E> extends fe.e<E> implements Set<E> {

    /* renamed from: a  reason: collision with root package name */
    private final d<E, ?> f30865a;

    public h(d<E, ?> dVar) {
        k.f(dVar, "backing");
        this.f30865a = dVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(E e10) {
        return this.f30865a.h(e10) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends E> collection) {
        k.f(collection, "elements");
        this.f30865a.k();
        return super.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f30865a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f30865a.containsKey(obj);
    }

    @Override // fe.e
    public int e() {
        return this.f30865a.size();
    }

    public final Set<E> f() {
        this.f30865a.j();
        return this;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f30865a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return this.f30865a.B();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        return this.f30865a.I(obj) >= 0;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection<? extends Object> collection) {
        k.f(collection, "elements");
        this.f30865a.k();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection<? extends Object> collection) {
        k.f(collection, "elements");
        this.f30865a.k();
        return super.retainAll(collection);
    }

    public h() {
        this(new d());
    }
}
