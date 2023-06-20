package jb;

import com.google.android.gms.common.api.Api;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;

/* compiled from: ImmutableCollection.java */
/* loaded from: classes3.dex */
public abstract class q<E> extends AbstractCollection<E> implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    private static final Object[] f33045a = new Object[0];

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ImmutableCollection.java */
    /* loaded from: classes3.dex */
    public static abstract class a<E> extends b<E> {

        /* renamed from: a  reason: collision with root package name */
        Object[] f33046a;

        /* renamed from: b  reason: collision with root package name */
        int f33047b;

        /* renamed from: c  reason: collision with root package name */
        boolean f33048c;

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(int i10) {
            h.b(i10, "initialCapacity");
            this.f33046a = new Object[i10];
            this.f33047b = 0;
        }

        private void e(int i10) {
            Object[] objArr = this.f33046a;
            if (objArr.length < i10) {
                this.f33046a = Arrays.copyOf(objArr, b.c(objArr.length, i10));
                this.f33048c = false;
            } else if (this.f33048c) {
                this.f33046a = (Object[]) objArr.clone();
                this.f33048c = false;
            }
        }

        @Override // jb.q.b
        public b<E> b(Iterable<? extends E> iterable) {
            if (iterable instanceof Collection) {
                Collection collection = (Collection) iterable;
                e(this.f33047b + collection.size());
                if (collection instanceof q) {
                    this.f33047b = ((q) collection).f(this.f33046a, this.f33047b);
                    return this;
                }
            }
            super.b(iterable);
            return this;
        }

        public a<E> d(E e10) {
            ib.l.j(e10);
            e(this.f33047b + 1);
            Object[] objArr = this.f33046a;
            int i10 = this.f33047b;
            this.f33047b = i10 + 1;
            objArr[i10] = e10;
            return this;
        }
    }

    /* compiled from: ImmutableCollection.java */
    /* loaded from: classes3.dex */
    public static abstract class b<E> {
        b() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static int c(int i10, int i11) {
            if (i11 >= 0) {
                int i12 = i10 + (i10 >> 1) + 1;
                if (i12 < i11) {
                    i12 = Integer.highestOneBit(i11 - 1) << 1;
                }
                return i12 < 0 ? Api.BaseClientBuilder.API_PRIORITY_OTHER : i12;
            }
            throw new AssertionError("cannot store more than MAX_VALUE elements");
        }

        public abstract b<E> a(E e10);

        public b<E> b(Iterable<? extends E> iterable) {
            for (E e10 : iterable) {
                a(e10);
            }
            return this;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean add(E e10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public abstract boolean contains(Object obj);

    public s<E> e() {
        return isEmpty() ? s.t() : s.l(toArray());
    }

    int f(Object[] objArr, int i10) {
        u0<E> it = iterator();
        while (it.hasNext()) {
            objArr[i10] = it.next();
            i10++;
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Object[] g() {
        return null;
    }

    int h() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int i() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract boolean j();

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: k */
    public abstract u0<E> iterator();

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(f33045a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        ib.l.j(tArr);
        int size = size();
        if (tArr.length < size) {
            Object[] g10 = g();
            if (g10 != null) {
                return (T[]) j0.a(g10, i(), h(), tArr);
            }
            tArr = (T[]) h0.d(tArr, size);
        } else if (tArr.length > size) {
            tArr[size] = null;
        }
        f(tArr, 0);
        return tArr;
    }
}
