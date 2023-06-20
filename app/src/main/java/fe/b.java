package fe;

import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* compiled from: AbstractList.kt */
/* loaded from: classes3.dex */
public abstract class b<E> extends fe.a<E> implements List<E> {

    /* renamed from: a  reason: collision with root package name */
    public static final a f30317a = new a(null);

    /* compiled from: AbstractList.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qe.g gVar) {
            this();
        }

        public final void a(int i10, int i11) {
            if (i10 < 0 || i10 >= i11) {
                throw new IndexOutOfBoundsException("index: " + i10 + ", size: " + i11);
            }
        }

        public final void b(int i10, int i11) {
            if (i10 < 0 || i10 > i11) {
                throw new IndexOutOfBoundsException("index: " + i10 + ", size: " + i11);
            }
        }

        public final void c(int i10, int i11, int i12) {
            if (i10 < 0 || i11 > i12) {
                throw new IndexOutOfBoundsException("fromIndex: " + i10 + ", toIndex: " + i11 + ", size: " + i12);
            } else if (i10 <= i11) {
            } else {
                throw new IllegalArgumentException("fromIndex: " + i10 + " > toIndex: " + i11);
            }
        }

        public final boolean d(Collection<?> collection, Collection<?> collection2) {
            qe.k.f(collection, l6.c.f33710i);
            qe.k.f(collection2, InneractiveMediationNameConsts.OTHER);
            if (collection.size() != collection2.size()) {
                return false;
            }
            Iterator<?> it = collection2.iterator();
            Iterator<?> it2 = collection.iterator();
            while (it2.hasNext()) {
                if (!qe.k.a(it2.next(), it.next())) {
                    return false;
                }
            }
            return true;
        }

        public final int e(Collection<?> collection) {
            qe.k.f(collection, l6.c.f33710i);
            Iterator<?> it = collection.iterator();
            int i10 = 1;
            while (it.hasNext()) {
                Object next = it.next();
                i10 = (i10 * 31) + (next != null ? next.hashCode() : 0);
            }
            return i10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AbstractList.kt */
    /* renamed from: fe.b$b  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public class C0384b implements Iterator<E>, re.a {

        /* renamed from: a  reason: collision with root package name */
        private int f30318a;

        public C0384b() {
        }

        protected final int c() {
            return this.f30318a;
        }

        protected final void d(int i10) {
            this.f30318a = i10;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f30318a < b.this.size();
        }

        @Override // java.util.Iterator
        public E next() {
            if (hasNext()) {
                b<E> bVar = b.this;
                int i10 = this.f30318a;
                this.f30318a = i10 + 1;
                return bVar.get(i10);
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* compiled from: AbstractList.kt */
    /* loaded from: classes3.dex */
    private class c extends b<E>.C0384b implements ListIterator<E> {
        public c(int i10) {
            super();
            b.f30317a.b(i10, b.this.size());
            d(i10);
        }

        @Override // java.util.ListIterator
        public void add(E e10) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return c() > 0;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return c();
        }

        @Override // java.util.ListIterator
        public E previous() {
            if (hasPrevious()) {
                b<E> bVar = b.this;
                d(c() - 1);
                return bVar.get(c());
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return c() - 1;
        }

        @Override // java.util.ListIterator
        public void set(E e10) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* compiled from: AbstractList.kt */
    /* loaded from: classes3.dex */
    private static final class d<E> extends b<E> implements RandomAccess {

        /* renamed from: b  reason: collision with root package name */
        private final b<E> f30321b;

        /* renamed from: c  reason: collision with root package name */
        private final int f30322c;

        /* renamed from: d  reason: collision with root package name */
        private int f30323d;

        /* JADX WARN: Multi-variable type inference failed */
        public d(b<? extends E> bVar, int i10, int i11) {
            qe.k.f(bVar, "list");
            this.f30321b = bVar;
            this.f30322c = i10;
            b.f30317a.c(i10, i11, bVar.size());
            this.f30323d = i11 - i10;
        }

        @Override // fe.a
        public int e() {
            return this.f30323d;
        }

        @Override // fe.b, java.util.List
        public E get(int i10) {
            b.f30317a.a(i10, this.f30323d);
            return this.f30321b.get(this.f30322c + i10);
        }
    }

    @Override // java.util.List
    public void add(int i10, E e10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i10, Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            return f30317a.d(this, (Collection) obj);
        }
        return false;
    }

    @Override // java.util.List
    public abstract E get(int i10);

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        return f30317a.e(this);
    }

    @Override // java.util.List
    public int indexOf(E e10) {
        int i10 = 0;
        for (E e11 : this) {
            if (qe.k.a(e11, e10)) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<E> iterator() {
        return new C0384b();
    }

    @Override // java.util.List
    public int lastIndexOf(E e10) {
        ListIterator<E> listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (qe.k.a(listIterator.previous(), e10)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    @Override // java.util.List
    public ListIterator<E> listIterator() {
        return new c(0);
    }

    @Override // java.util.List
    public E remove(int i10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public E set(int i10, E e10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public List<E> subList(int i10, int i11) {
        return new d(this, i10, i11);
    }

    @Override // java.util.List
    public ListIterator<E> listIterator(int i10) {
        return new c(i10);
    }
}
