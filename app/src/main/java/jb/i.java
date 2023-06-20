package jb;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: Collections2.java */
/* loaded from: classes3.dex */
public final class i {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Collections2.java */
    /* loaded from: classes3.dex */
    public static class a<E> extends AbstractCollection<E> {

        /* renamed from: a  reason: collision with root package name */
        final Collection<E> f32989a;

        /* renamed from: b  reason: collision with root package name */
        final ib.m<? super E> f32990b;

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(Collection<E> collection, ib.m<? super E> mVar) {
            this.f32989a = collection;
            this.f32990b = mVar;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean add(E e10) {
            ib.l.d(this.f32990b.apply(e10));
            return this.f32989a.add(e10);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean addAll(Collection<? extends E> collection) {
            for (E e10 : collection) {
                ib.l.d(this.f32990b.apply(e10));
            }
            return this.f32989a.addAll(collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            v.f(this.f32989a, this.f32990b);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            if (i.c(this.f32989a, obj)) {
                return this.f32990b.apply(obj);
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            return i.a(this, collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return !v.a(this.f32989a, this.f32990b);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<E> iterator() {
            return w.h(this.f32989a.iterator(), this.f32990b);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            return contains(obj) && this.f32989a.remove(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            Iterator<E> it = this.f32989a.iterator();
            boolean z10 = false;
            while (it.hasNext()) {
                E next = it.next();
                if (this.f32990b.apply(next) && collection.contains(next)) {
                    it.remove();
                    z10 = true;
                }
            }
            return z10;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            Iterator<E> it = this.f32989a.iterator();
            boolean z10 = false;
            while (it.hasNext()) {
                E next = it.next();
                if (this.f32990b.apply(next) && !collection.contains(next)) {
                    it.remove();
                    z10 = true;
                }
            }
            return z10;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            int i10 = 0;
            for (E e10 : this.f32989a) {
                if (this.f32990b.apply(e10)) {
                    i10++;
                }
            }
            return i10;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public Object[] toArray() {
            return y.i(iterator()).toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) y.i(iterator()).toArray(tArr);
        }
    }

    static boolean a(Collection<?> collection, Collection<?> collection2) {
        Iterator<?> it = collection2.iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static StringBuilder b(int i10) {
        h.b(i10, "size");
        return new StringBuilder((int) Math.min(i10 * 8, 1073741824L));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean c(Collection<?> collection, Object obj) {
        ib.l.j(collection);
        try {
            return collection.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }
}
