package fe;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Collections.kt */
/* loaded from: classes3.dex */
public final class f<T> implements Collection<T>, re.a {

    /* renamed from: a  reason: collision with root package name */
    private final T[] f30325a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f30326b;

    public f(T[] tArr, boolean z10) {
        qe.k.f(tArr, "values");
        this.f30325a = tArr;
        this.f30326b = z10;
    }

    @Override // java.util.Collection
    public boolean add(T t10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        return l.n(this.f30325a, obj);
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection<? extends Object> collection) {
        qe.k.f(collection, "elements");
        if (collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public int e() {
        return this.f30325a.length;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.f30325a.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<T> iterator() {
        return qe.b.a(this.f30325a);
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return e();
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return o.b(this.f30325a, this.f30326b);
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        qe.k.f(tArr, "array");
        return (T[]) qe.f.b(this, tArr);
    }
}
