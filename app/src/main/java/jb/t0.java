package jb;

import java.util.ListIterator;

/* compiled from: TransformedListIterator.java */
/* loaded from: classes3.dex */
abstract class t0<F, T> extends s0<F, T> implements ListIterator<T> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public t0(ListIterator<? extends F> listIterator) {
        super(listIterator);
    }

    private ListIterator<? extends F> b() {
        return w.c(this.f33061a);
    }

    @Override // java.util.ListIterator
    public void add(T t10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return b().hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return b().nextIndex();
    }

    @Override // java.util.ListIterator
    public final T previous() {
        return a(b().previous());
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return b().previousIndex();
    }

    @Override // java.util.ListIterator
    public void set(T t10) {
        throw new UnsupportedOperationException();
    }
}
