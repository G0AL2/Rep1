package jb;

import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* compiled from: Iterators.java */
/* loaded from: classes3.dex */
public final class w {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Iterators.java */
    /* loaded from: classes3.dex */
    class a<T> extends jb.b<T> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Iterator f33070c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ib.m f33071d;

        a(Iterator it, ib.m mVar) {
            this.f33070c = it;
            this.f33071d = mVar;
        }

        @Override // jb.b
        protected T b() {
            while (this.f33070c.hasNext()) {
                T t10 = (T) this.f33070c.next();
                if (this.f33071d.apply(t10)) {
                    return t10;
                }
            }
            return c();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Iterators.java */
    /* loaded from: classes3.dex */
    class b<T> extends u0<T> {

        /* renamed from: a  reason: collision with root package name */
        boolean f33072a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Object f33073b;

        b(Object obj) {
            this.f33073b = obj;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return !this.f33072a;
        }

        @Override // java.util.Iterator
        public T next() {
            if (!this.f33072a) {
                this.f33072a = true;
                return (T) this.f33073b;
            }
            throw new NoSuchElementException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Iterators.java */
    /* loaded from: classes3.dex */
    public enum c implements Iterator<Object> {
        INSTANCE;

        @Override // java.util.Iterator
        public boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public Object next() {
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            h.c(false);
        }
    }

    public static <T> boolean a(Collection<T> collection, Iterator<? extends T> it) {
        ib.l.j(collection);
        ib.l.j(it);
        boolean z10 = false;
        while (it.hasNext()) {
            z10 |= collection.add(it.next());
        }
        return z10;
    }

    public static <T> boolean b(Iterator<T> it, ib.m<? super T> mVar) {
        return m(it, mVar) != -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> ListIterator<T> c(Iterator<T> it) {
        return (ListIterator) it;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void d(Iterator<?> it) {
        ib.l.j(it);
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    public static boolean e(Iterator<?> it, Object obj) {
        if (obj == null) {
            while (it.hasNext()) {
                if (it.next() == null) {
                    return true;
                }
            }
            return false;
        }
        while (it.hasNext()) {
            if (obj.equals(it.next())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0006  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean f(java.util.Iterator<?> r3, java.util.Iterator<?> r4) {
        /*
        L0:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L1d
            boolean r0 = r4.hasNext()
            r1 = 0
            if (r0 != 0) goto Le
            return r1
        Le:
            java.lang.Object r0 = r3.next()
            java.lang.Object r2 = r4.next()
            boolean r0 = ib.i.a(r0, r2)
            if (r0 != 0) goto L0
            return r1
        L1d:
            boolean r3 = r4.hasNext()
            r3 = r3 ^ 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: jb.w.f(java.util.Iterator, java.util.Iterator):boolean");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> Iterator<T> g() {
        return c.INSTANCE;
    }

    public static <T> u0<T> h(Iterator<T> it, ib.m<? super T> mVar) {
        ib.l.j(it);
        ib.l.j(mVar);
        return new a(it, mVar);
    }

    public static <T> T i(Iterator<T> it, ib.m<? super T> mVar) {
        ib.l.j(it);
        ib.l.j(mVar);
        while (it.hasNext()) {
            T next = it.next();
            if (mVar.apply(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    public static <T> T j(Iterator<T> it) {
        T next;
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    public static <T> T k(Iterator<? extends T> it, T t10) {
        return it.hasNext() ? (T) j(it) : t10;
    }

    public static <T> T l(Iterator<? extends T> it, T t10) {
        return it.hasNext() ? it.next() : t10;
    }

    public static <T> int m(Iterator<T> it, ib.m<? super T> mVar) {
        ib.l.k(mVar, "predicate");
        int i10 = 0;
        while (it.hasNext()) {
            if (mVar.apply(it.next())) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> T n(Iterator<T> it) {
        if (it.hasNext()) {
            T next = it.next();
            it.remove();
            return next;
        }
        return null;
    }

    public static boolean o(Iterator<?> it, Collection<?> collection) {
        ib.l.j(collection);
        boolean z10 = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    public static <T> boolean p(Iterator<T> it, ib.m<? super T> mVar) {
        ib.l.j(mVar);
        boolean z10 = false;
        while (it.hasNext()) {
            if (mVar.apply(it.next())) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    public static <T> u0<T> q(T t10) {
        return new b(t10);
    }
}
