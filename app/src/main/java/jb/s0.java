package jb;

import java.util.Iterator;

/* compiled from: TransformedIterator.java */
/* loaded from: classes3.dex */
abstract class s0<F, T> implements Iterator<T> {

    /* renamed from: a  reason: collision with root package name */
    final Iterator<? extends F> f33061a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public s0(Iterator<? extends F> it) {
        this.f33061a = (Iterator) ib.l.j(it);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract T a(F f10);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f33061a.hasNext();
    }

    @Override // java.util.Iterator
    public final T next() {
        return a(this.f33061a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f33061a.remove();
    }
}
