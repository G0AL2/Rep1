package jb;

import java.util.NoSuchElementException;

/* compiled from: AbstractIndexedListIterator.java */
/* loaded from: classes3.dex */
abstract class a<E> extends v0<E> {

    /* renamed from: a  reason: collision with root package name */
    private final int f32925a;

    /* renamed from: b  reason: collision with root package name */
    private int f32926b;

    /* JADX INFO: Access modifiers changed from: protected */
    public a(int i10, int i11) {
        ib.l.l(i11, i10);
        this.f32925a = i10;
        this.f32926b = i11;
    }

    protected abstract E a(int i10);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f32926b < this.f32925a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f32926b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final E next() {
        if (hasNext()) {
            int i10 = this.f32926b;
            this.f32926b = i10 + 1;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f32926b;
    }

    @Override // java.util.ListIterator
    public final E previous() {
        if (hasPrevious()) {
            int i10 = this.f32926b - 1;
            this.f32926b = i10;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f32926b - 1;
    }
}
