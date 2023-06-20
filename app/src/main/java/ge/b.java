package ge;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import qe.k;

/* compiled from: ListBuilder.kt */
/* loaded from: classes3.dex */
public final class b<E> extends fe.d<E> implements List<E>, RandomAccess {

    /* renamed from: a  reason: collision with root package name */
    private E[] f30835a;

    /* renamed from: b  reason: collision with root package name */
    private int f30836b;

    /* renamed from: c  reason: collision with root package name */
    private int f30837c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f30838d;

    /* renamed from: e  reason: collision with root package name */
    private final b<E> f30839e;

    /* renamed from: f  reason: collision with root package name */
    private final b<E> f30840f;

    /* compiled from: ListBuilder.kt */
    /* loaded from: classes3.dex */
    private static final class a<E> implements ListIterator<E>, re.a {

        /* renamed from: a  reason: collision with root package name */
        private final b<E> f30841a;

        /* renamed from: b  reason: collision with root package name */
        private int f30842b;

        /* renamed from: c  reason: collision with root package name */
        private int f30843c;

        public a(b<E> bVar, int i10) {
            k.f(bVar, "list");
            this.f30841a = bVar;
            this.f30842b = i10;
            this.f30843c = -1;
        }

        @Override // java.util.ListIterator
        public void add(E e10) {
            b<E> bVar = this.f30841a;
            int i10 = this.f30842b;
            this.f30842b = i10 + 1;
            bVar.add(i10, e10);
            this.f30843c = -1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f30842b < ((b) this.f30841a).f30837c;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f30842b > 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public E next() {
            if (this.f30842b < ((b) this.f30841a).f30837c) {
                int i10 = this.f30842b;
                this.f30842b = i10 + 1;
                this.f30843c = i10;
                return (E) ((b) this.f30841a).f30835a[((b) this.f30841a).f30836b + this.f30843c];
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f30842b;
        }

        @Override // java.util.ListIterator
        public E previous() {
            int i10 = this.f30842b;
            if (i10 > 0) {
                int i11 = i10 - 1;
                this.f30842b = i11;
                this.f30843c = i11;
                return (E) ((b) this.f30841a).f30835a[((b) this.f30841a).f30836b + this.f30843c];
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f30842b - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            int i10 = this.f30843c;
            if (i10 != -1) {
                this.f30841a.remove(i10);
                this.f30842b = this.f30843c;
                this.f30843c = -1;
                return;
            }
            throw new IllegalStateException("Call next() or previous() before removing element from the iterator.".toString());
        }

        @Override // java.util.ListIterator
        public void set(E e10) {
            int i10 = this.f30843c;
            if (i10 != -1) {
                this.f30841a.set(i10, e10);
                return;
            }
            throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.".toString());
        }
    }

    private b(E[] eArr, int i10, int i11, boolean z10, b<E> bVar, b<E> bVar2) {
        this.f30835a = eArr;
        this.f30836b = i10;
        this.f30837c = i11;
        this.f30838d = z10;
        this.f30839e = bVar;
        this.f30840f = bVar2;
    }

    private final void j(int i10, Collection<? extends E> collection, int i11) {
        b<E> bVar = this.f30839e;
        if (bVar != null) {
            bVar.j(i10, collection, i11);
            this.f30835a = this.f30839e.f30835a;
            this.f30837c += i11;
            return;
        }
        q(i10, i11);
        Iterator<? extends E> it = collection.iterator();
        for (int i12 = 0; i12 < i11; i12++) {
            this.f30835a[i10 + i12] = it.next();
        }
    }

    private final void k(int i10, E e10) {
        b<E> bVar = this.f30839e;
        if (bVar != null) {
            bVar.k(i10, e10);
            this.f30835a = this.f30839e.f30835a;
            this.f30837c++;
            return;
        }
        q(i10, 1);
        this.f30835a[i10] = e10;
    }

    private final void m() {
        if (r()) {
            throw new UnsupportedOperationException();
        }
    }

    private final boolean n(List<?> list) {
        boolean h10;
        h10 = c.h(this.f30835a, this.f30836b, this.f30837c, list);
        return h10;
    }

    private final void o(int i10) {
        if (this.f30839e != null) {
            throw new IllegalStateException();
        }
        if (i10 >= 0) {
            E[] eArr = this.f30835a;
            if (i10 > eArr.length) {
                this.f30835a = (E[]) c.e(this.f30835a, fe.g.f30327a.a(eArr.length, i10));
                return;
            }
            return;
        }
        throw new OutOfMemoryError();
    }

    private final void p(int i10) {
        o(this.f30837c + i10);
    }

    private final void q(int i10, int i11) {
        p(i11);
        E[] eArr = this.f30835a;
        fe.h.d(eArr, eArr, i10 + i11, i10, this.f30836b + this.f30837c);
        this.f30837c += i11;
    }

    private final boolean r() {
        b<E> bVar;
        return this.f30838d || ((bVar = this.f30840f) != null && bVar.f30838d);
    }

    private final E s(int i10) {
        b<E> bVar = this.f30839e;
        if (bVar != null) {
            this.f30837c--;
            return bVar.s(i10);
        }
        E[] eArr = this.f30835a;
        E e10 = eArr[i10];
        fe.h.d(eArr, eArr, i10, i10 + 1, this.f30836b + this.f30837c);
        c.f(this.f30835a, (this.f30836b + this.f30837c) - 1);
        this.f30837c--;
        return e10;
    }

    private final void t(int i10, int i11) {
        b<E> bVar = this.f30839e;
        if (bVar != null) {
            bVar.t(i10, i11);
        } else {
            E[] eArr = this.f30835a;
            fe.h.d(eArr, eArr, i10, i10 + i11, this.f30837c);
            E[] eArr2 = this.f30835a;
            int i12 = this.f30837c;
            c.g(eArr2, i12 - i11, i12);
        }
        this.f30837c -= i11;
    }

    private final int u(int i10, int i11, Collection<? extends E> collection, boolean z10) {
        b<E> bVar = this.f30839e;
        if (bVar != null) {
            int u10 = bVar.u(i10, i11, collection, z10);
            this.f30837c -= u10;
            return u10;
        }
        int i12 = 0;
        int i13 = 0;
        while (i12 < i11) {
            int i14 = i10 + i12;
            if (collection.contains(this.f30835a[i14]) == z10) {
                E[] eArr = this.f30835a;
                i12++;
                eArr[i13 + i10] = eArr[i14];
                i13++;
            } else {
                i12++;
            }
        }
        int i15 = i11 - i13;
        E[] eArr2 = this.f30835a;
        fe.h.d(eArr2, eArr2, i10 + i13, i11 + i10, this.f30837c);
        E[] eArr3 = this.f30835a;
        int i16 = this.f30837c;
        c.g(eArr3, i16 - i15, i16);
        this.f30837c -= i15;
        return i15;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e10) {
        m();
        k(this.f30836b + this.f30837c, e10);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends E> collection) {
        k.f(collection, "elements");
        m();
        int size = collection.size();
        j(this.f30836b + this.f30837c, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        m();
        t(this.f30836b, this.f30837c);
    }

    @Override // fe.d
    public int e() {
        return this.f30837c;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof List) && n((List) obj));
    }

    @Override // fe.d
    public E f(int i10) {
        m();
        fe.b.f30317a.a(i10, this.f30837c);
        return s(this.f30836b + i10);
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i10) {
        fe.b.f30317a.a(i10, this.f30837c);
        return this.f30835a[this.f30836b + i10];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i10;
        i10 = c.i(this.f30835a, this.f30836b, this.f30837c);
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        for (int i10 = 0; i10 < this.f30837c; i10++) {
            if (k.a(this.f30835a[this.f30836b + i10], obj)) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return this.f30837c == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<E> iterator() {
        return new a(this, 0);
    }

    public final List<E> l() {
        if (this.f30839e == null) {
            m();
            this.f30838d = true;
            return this;
        }
        throw new IllegalStateException();
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        for (int i10 = this.f30837c - 1; i10 >= 0; i10--) {
            if (k.a(this.f30835a[this.f30836b + i10], obj)) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<E> listIterator() {
        return new a(this, 0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        m();
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            remove(indexOf);
        }
        return indexOf >= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection<? extends Object> collection) {
        k.f(collection, "elements");
        m();
        return u(this.f30836b, this.f30837c, collection, false) > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection<? extends Object> collection) {
        k.f(collection, "elements");
        m();
        return u(this.f30836b, this.f30837c, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int i10, E e10) {
        m();
        fe.b.f30317a.a(i10, this.f30837c);
        E[] eArr = this.f30835a;
        int i11 = this.f30836b;
        E e11 = eArr[i11 + i10];
        eArr[i11 + i10] = e10;
        return e11;
    }

    @Override // java.util.AbstractList, java.util.List
    public List<E> subList(int i10, int i11) {
        fe.b.f30317a.c(i10, i11, this.f30837c);
        E[] eArr = this.f30835a;
        int i12 = this.f30836b + i10;
        int i13 = i11 - i10;
        boolean z10 = this.f30838d;
        b<E> bVar = this.f30840f;
        return new b(eArr, i12, i13, z10, this, bVar == null ? this : bVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public <T> T[] toArray(T[] tArr) {
        k.f(tArr, "destination");
        int length = tArr.length;
        int i10 = this.f30837c;
        if (length < i10) {
            E[] eArr = this.f30835a;
            int i11 = this.f30836b;
            T[] tArr2 = (T[]) Arrays.copyOfRange(eArr, i11, i10 + i11, tArr.getClass());
            k.e(tArr2, "copyOfRange(array, offse…h, destination.javaClass)");
            return tArr2;
        }
        E[] eArr2 = this.f30835a;
        k.d(eArr2, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.builders.ListBuilder.toArray>");
        int i12 = this.f30836b;
        fe.h.d(eArr2, tArr, 0, i12, this.f30837c + i12);
        int length2 = tArr.length;
        int i13 = this.f30837c;
        if (length2 > i13) {
            tArr[i13] = null;
        }
        return tArr;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        String j10;
        j10 = c.j(this.f30835a, this.f30836b, this.f30837c);
        return j10;
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<E> listIterator(int i10) {
        fe.b.f30317a.b(i10, this.f30837c);
        return new a(this, i10);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i10, E e10) {
        m();
        fe.b.f30317a.b(i10, this.f30837c);
        k(this.f30836b + i10, e10);
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i10, Collection<? extends E> collection) {
        k.f(collection, "elements");
        m();
        fe.b.f30317a.b(i10, this.f30837c);
        int size = collection.size();
        j(this.f30836b + i10, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        E[] eArr = this.f30835a;
        int i10 = this.f30836b;
        Object[] h10 = fe.h.h(eArr, i10, this.f30837c + i10);
        k.d(h10, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        return h10;
    }

    public b() {
        this(10);
    }

    public b(int i10) {
        this(c.d(i10), 0, 0, false, null, null);
    }
}
