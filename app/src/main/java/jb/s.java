package jb;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import jb.q;

/* compiled from: ImmutableList.java */
/* loaded from: classes3.dex */
public abstract class s<E> extends q<E> implements List<E>, RandomAccess {

    /* renamed from: b  reason: collision with root package name */
    private static final v0<Object> f33056b = new b(k0.f33014e, 0);

    /* compiled from: ImmutableList.java */
    /* loaded from: classes3.dex */
    public static final class a<E> extends q.a<E> {
        public a() {
            this(4);
        }

        @Override // jb.q.b
        /* renamed from: f */
        public a<E> a(E e10) {
            super.d(e10);
            return this;
        }

        public a<E> g(Iterable<? extends E> iterable) {
            super.b(iterable);
            return this;
        }

        public s<E> h() {
            this.f33048c = true;
            return s.m(this.f33046a, this.f33047b);
        }

        a(int i10) {
            super(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ImmutableList.java */
    /* loaded from: classes3.dex */
    public static class b<E> extends jb.a<E> {

        /* renamed from: c  reason: collision with root package name */
        private final s<E> f33057c;

        b(s<E> sVar, int i10) {
            super(sVar.size(), i10);
            this.f33057c = sVar;
        }

        @Override // jb.a
        protected E a(int i10) {
            return this.f33057c.get(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ImmutableList.java */
    /* loaded from: classes3.dex */
    public class c extends s<E> {

        /* renamed from: c  reason: collision with root package name */
        final transient int f33058c;

        /* renamed from: d  reason: collision with root package name */
        final transient int f33059d;

        c(int i10, int i11) {
            this.f33058c = i10;
            this.f33059d = i11;
        }

        @Override // jb.q
        Object[] g() {
            return s.this.g();
        }

        @Override // java.util.List
        public E get(int i10) {
            ib.l.h(i10, this.f33059d);
            return s.this.get(i10 + this.f33058c);
        }

        @Override // jb.q
        int h() {
            return s.this.i() + this.f33058c + this.f33059d;
        }

        @Override // jb.q
        int i() {
            return s.this.i() + this.f33058c;
        }

        @Override // jb.s, jb.q, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        @Override // jb.q
        boolean j() {
            return true;
        }

        @Override // jb.s, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return super.listIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f33059d;
        }

        @Override // jb.s, java.util.List
        /* renamed from: y */
        public s<E> subList(int i10, int i11) {
            ib.l.n(i10, i11, this.f33059d);
            s sVar = s.this;
            int i12 = this.f33058c;
            return sVar.subList(i10 + i12, i11 + i12);
        }

        @Override // jb.s, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator(int i10) {
            return super.listIterator(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <E> s<E> l(Object[] objArr) {
        return m(objArr, objArr.length);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <E> s<E> m(Object[] objArr, int i10) {
        if (i10 == 0) {
            return t();
        }
        return new k0(objArr, i10);
    }

    public static <E> a<E> n() {
        return new a<>();
    }

    private static <E> s<E> o(Object... objArr) {
        return l(h0.b(objArr));
    }

    public static <E> s<E> p(Collection<? extends E> collection) {
        if (collection instanceof q) {
            s<E> e10 = ((q) collection).e();
            return e10.j() ? l(e10.toArray()) : e10;
        }
        return o(collection.toArray());
    }

    public static <E> s<E> q(E[] eArr) {
        if (eArr.length == 0) {
            return t();
        }
        return o((Object[]) eArr.clone());
    }

    public static <E> s<E> t() {
        return (s<E>) k0.f33014e;
    }

    public static <E> s<E> u(E e10) {
        return o(e10);
    }

    public static <E> s<E> v(E e10, E e11) {
        return o(e10, e11);
    }

    public static <E> s<E> w(E e10, E e11, E e12, E e13, E e14) {
        return o(e10, e11, e12, e13, e14);
    }

    @SafeVarargs
    public static <E> s<E> x(E e10, E e11, E e12, E e13, E e14, E e15, E e16, E e17, E e18, E e19, E e20, E e21, E... eArr) {
        ib.l.e(eArr.length <= 2147483635, "the total number of elements must fit in an int");
        Object[] objArr = new Object[eArr.length + 12];
        objArr[0] = e10;
        objArr[1] = e11;
        objArr[2] = e12;
        objArr[3] = e13;
        objArr[4] = e14;
        objArr[5] = e15;
        objArr[6] = e16;
        objArr[7] = e17;
        objArr[8] = e18;
        objArr[9] = e19;
        objArr[10] = e20;
        objArr[11] = e21;
        System.arraycopy(eArr, 0, objArr, 12, eArr.length);
        return o(objArr);
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i10, E e10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i10, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // jb.q, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // jb.q
    @Deprecated
    public final s<E> e() {
        return this;
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        return y.c(this, obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // jb.q
    public int f(Object[] objArr, int i10) {
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            objArr[i10 + i11] = get(i11);
        }
        return i10 + size;
    }

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        int size = size();
        int i10 = 1;
        for (int i11 = 0; i11 < size; i11++) {
            i10 = ~(~((i10 * 31) + get(i11).hashCode()));
        }
        return i10;
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return y.d(this, obj);
    }

    @Override // jb.q, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: k */
    public u0<E> iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return y.f(this, obj);
    }

    @Override // java.util.List
    /* renamed from: r */
    public v0<E> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    @Deprecated
    public final E remove(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    /* renamed from: s */
    public v0<E> listIterator(int i10) {
        ib.l.l(i10, size());
        if (isEmpty()) {
            return (v0<E>) f33056b;
        }
        return new b(this, i10);
    }

    @Override // java.util.List
    @Deprecated
    public final E set(int i10, E e10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    /* renamed from: y */
    public s<E> subList(int i10, int i11) {
        ib.l.n(i10, i11, size());
        int i12 = i11 - i10;
        if (i12 == size()) {
            return this;
        }
        if (i12 == 0) {
            return t();
        }
        return z(i10, i11);
    }

    s<E> z(int i10, int i11) {
        return new c(i10, i11 - i10);
    }
}
