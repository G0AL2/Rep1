package qe;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: ArrayIterator.kt */
/* loaded from: classes3.dex */
final class a<T> implements Iterator<T>, re.a {

    /* renamed from: a  reason: collision with root package name */
    private final T[] f36089a;

    /* renamed from: b  reason: collision with root package name */
    private int f36090b;

    public a(T[] tArr) {
        k.f(tArr, "array");
        this.f36089a = tArr;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f36090b < this.f36089a.length;
    }

    @Override // java.util.Iterator
    public T next() {
        try {
            T[] tArr = this.f36089a;
            int i10 = this.f36090b;
            this.f36090b = i10 + 1;
            return tArr[i10];
        } catch (ArrayIndexOutOfBoundsException e10) {
            this.f36090b--;
            throw new NoSuchElementException(e10.getMessage());
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
