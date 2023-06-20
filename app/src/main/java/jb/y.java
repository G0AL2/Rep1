package jb;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.AbstractSequentialList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: Lists.java */
/* loaded from: classes3.dex */
public final class y {

    /* compiled from: Lists.java */
    /* loaded from: classes3.dex */
    private static class a<F, T> extends AbstractList<T> implements RandomAccess, Serializable {

        /* renamed from: a  reason: collision with root package name */
        final List<F> f33076a;

        /* renamed from: b  reason: collision with root package name */
        final ib.f<? super F, ? extends T> f33077b;

        /* compiled from: Lists.java */
        /* renamed from: jb.y$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        class C0420a extends t0<F, T> {
            C0420a(ListIterator listIterator) {
                super(listIterator);
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // jb.s0
            public T a(F f10) {
                return a.this.f33077b.apply(f10);
            }
        }

        a(List<F> list, ib.f<? super F, ? extends T> fVar) {
            this.f33076a = (List) ib.l.j(list);
            this.f33077b = (ib.f) ib.l.j(fVar);
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public void clear() {
            this.f33076a.clear();
        }

        @Override // java.util.AbstractList, java.util.List
        public T get(int i10) {
            return this.f33077b.apply((F) this.f33076a.get(i10));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return this.f33076a.isEmpty();
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public Iterator<T> iterator() {
            return listIterator();
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator<T> listIterator(int i10) {
            return new C0420a(this.f33076a.listIterator(i10));
        }

        @Override // java.util.AbstractList, java.util.List
        public T remove(int i10) {
            return this.f33077b.apply((F) this.f33076a.remove(i10));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f33076a.size();
        }
    }

    /* compiled from: Lists.java */
    /* loaded from: classes3.dex */
    private static class b<F, T> extends AbstractSequentialList<T> implements Serializable {

        /* renamed from: a  reason: collision with root package name */
        final List<F> f33079a;

        /* renamed from: b  reason: collision with root package name */
        final ib.f<? super F, ? extends T> f33080b;

        /* compiled from: Lists.java */
        /* loaded from: classes3.dex */
        class a extends t0<F, T> {
            a(ListIterator listIterator) {
                super(listIterator);
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // jb.s0
            public T a(F f10) {
                return b.this.f33080b.apply(f10);
            }
        }

        b(List<F> list, ib.f<? super F, ? extends T> fVar) {
            this.f33079a = (List) ib.l.j(list);
            this.f33080b = (ib.f) ib.l.j(fVar);
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public void clear() {
            this.f33079a.clear();
        }

        @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
        public ListIterator<T> listIterator(int i10) {
            return new a(this.f33079a.listIterator(i10));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f33079a.size();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> List<T> a(Iterable<T> iterable) {
        return (List) iterable;
    }

    static int b(int i10) {
        h.b(i10, "arraySize");
        return mb.d.k(i10 + 5 + (i10 / 10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean c(List<?> list, Object obj) {
        if (obj == ib.l.j(list)) {
            return true;
        }
        if (obj instanceof List) {
            List list2 = (List) obj;
            int size = list.size();
            if (size != list2.size()) {
                return false;
            }
            if ((list instanceof RandomAccess) && (list2 instanceof RandomAccess)) {
                for (int i10 = 0; i10 < size; i10++) {
                    if (!ib.i.a(list.get(i10), list2.get(i10))) {
                        return false;
                    }
                }
                return true;
            }
            return w.f(list.iterator(), list2.iterator());
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int d(List<?> list, Object obj) {
        if (list instanceof RandomAccess) {
            return e(list, obj);
        }
        ListIterator<?> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            if (ib.i.a(obj, listIterator.next())) {
                return listIterator.previousIndex();
            }
        }
        return -1;
    }

    private static int e(List<?> list, Object obj) {
        int size = list.size();
        int i10 = 0;
        if (obj == null) {
            while (i10 < size) {
                if (list.get(i10) == null) {
                    return i10;
                }
                i10++;
            }
            return -1;
        }
        while (i10 < size) {
            if (obj.equals(list.get(i10))) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int f(List<?> list, Object obj) {
        if (list instanceof RandomAccess) {
            return g(list, obj);
        }
        ListIterator<?> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            if (ib.i.a(obj, listIterator.previous())) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    private static int g(List<?> list, Object obj) {
        if (obj == null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                if (list.get(size) == null) {
                    return size;
                }
            }
            return -1;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            if (obj.equals(list.get(size2))) {
                return size2;
            }
        }
        return -1;
    }

    public static <E> ArrayList<E> h() {
        return new ArrayList<>();
    }

    public static <E> ArrayList<E> i(Iterator<? extends E> it) {
        ArrayList<E> h10 = h();
        w.a(h10, it);
        return h10;
    }

    @SafeVarargs
    public static <E> ArrayList<E> j(E... eArr) {
        ib.l.j(eArr);
        ArrayList<E> arrayList = new ArrayList<>(b(eArr.length));
        Collections.addAll(arrayList, eArr);
        return arrayList;
    }

    public static <F, T> List<T> k(List<F> list, ib.f<? super F, ? extends T> fVar) {
        if (list instanceof RandomAccess) {
            return new a(list, fVar);
        }
        return new b(list, fVar);
    }
}
