package jb;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import jb.i;

/* compiled from: Sets.java */
/* loaded from: classes3.dex */
public final class q0 {

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* compiled from: Sets.java */
    /* loaded from: classes3.dex */
    class a<E> extends e<E> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Set f33049a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Set f33050b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Sets.java */
        /* renamed from: jb.q0$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public class C0419a extends jb.b<E> {

            /* renamed from: c  reason: collision with root package name */
            final Iterator<E> f33051c;

            C0419a() {
                this.f33051c = a.this.f33049a.iterator();
            }

            @Override // jb.b
            protected E b() {
                while (this.f33051c.hasNext()) {
                    E next = this.f33051c.next();
                    if (a.this.f33050b.contains(next)) {
                        return next;
                    }
                }
                return c();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Set set, Set set2) {
            super(null);
            this.f33049a = set;
            this.f33050b = set2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.f33049a.contains(obj) && this.f33050b.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
            return this.f33049a.containsAll(collection) && this.f33050b.containsAll(collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: e */
        public u0<E> iterator() {
            return new C0419a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return Collections.disjoint(this.f33050b, this.f33049a);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            int i10 = 0;
            for (E e10 : this.f33049a) {
                if (this.f33050b.contains(e10)) {
                    i10++;
                }
            }
            return i10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Sets.java */
    /* loaded from: classes3.dex */
    public static class b<E> extends i.a<E> implements Set<E> {
        b(Set<E> set, ib.m<? super E> mVar) {
            super(set, mVar);
        }

        @Override // java.util.Collection, java.util.Set
        public boolean equals(Object obj) {
            return q0.a(this, obj);
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
            return q0.d(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Sets.java */
    /* loaded from: classes3.dex */
    public static class c<E> extends b<E> implements SortedSet<E> {
        c(SortedSet<E> sortedSet, ib.m<? super E> mVar) {
            super(sortedSet, mVar);
        }

        @Override // java.util.SortedSet
        public Comparator<? super E> comparator() {
            return ((SortedSet) this.f32989a).comparator();
        }

        @Override // java.util.SortedSet
        public E first() {
            return (E) w.i(this.f32989a.iterator(), this.f32990b);
        }

        @Override // java.util.SortedSet
        public SortedSet<E> headSet(E e10) {
            return new c(((SortedSet) this.f32989a).headSet(e10), this.f32990b);
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [E, java.lang.Object] */
        @Override // java.util.SortedSet
        public E last() {
            SortedSet sortedSet = (SortedSet) this.f32989a;
            while (true) {
                ?? r12 = (Object) sortedSet.last();
                if (this.f32990b.apply(r12)) {
                    return r12;
                }
                sortedSet = sortedSet.headSet(r12);
            }
        }

        @Override // java.util.SortedSet
        public SortedSet<E> subSet(E e10, E e11) {
            return new c(((SortedSet) this.f32989a).subSet(e10, e11), this.f32990b);
        }

        @Override // java.util.SortedSet
        public SortedSet<E> tailSet(E e10) {
            return new c(((SortedSet) this.f32989a).tailSet(e10), this.f32990b);
        }
    }

    /* compiled from: Sets.java */
    /* loaded from: classes3.dex */
    static abstract class d<E> extends AbstractSet<E> {
        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            return q0.i(this, collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            return super.retainAll((Collection) ib.l.j(collection));
        }
    }

    /* compiled from: Sets.java */
    /* loaded from: classes3.dex */
    public static abstract class e<E> extends AbstractSet<E> {
        /* synthetic */ e(p0 p0Var) {
            this();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean add(E e10) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean addAll(Collection<? extends E> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        private e() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(Set<?> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static <E> Set<E> b(Set<E> set, ib.m<? super E> mVar) {
        if (set instanceof SortedSet) {
            return c((SortedSet) set, mVar);
        }
        if (set instanceof b) {
            b bVar = (b) set;
            return new b((Set) bVar.f32989a, ib.n.b(bVar.f32990b, mVar));
        }
        return new b((Set) ib.l.j(set), (ib.m) ib.l.j(mVar));
    }

    public static <E> SortedSet<E> c(SortedSet<E> sortedSet, ib.m<? super E> mVar) {
        if (sortedSet instanceof b) {
            b bVar = (b) sortedSet;
            return new c((SortedSet) bVar.f32989a, ib.n.b(bVar.f32990b, mVar));
        }
        return new c((SortedSet) ib.l.j(sortedSet), (ib.m) ib.l.j(mVar));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int d(Set<?> set) {
        Iterator<?> it = set.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i10 = ~(~(i10 + (next != null ? next.hashCode() : 0)));
        }
        return i10;
    }

    public static <E> e<E> e(Set<E> set, Set<?> set2) {
        ib.l.k(set, "set1");
        ib.l.k(set2, "set2");
        return new a(set, set2);
    }

    public static <E> HashSet<E> f() {
        return new HashSet<>();
    }

    public static <E> HashSet<E> g(int i10) {
        return new HashSet<>(a0.a(i10));
    }

    public static <E> Set<E> h() {
        return Collections.newSetFromMap(a0.e());
    }

    static boolean i(Set<?> set, Collection<?> collection) {
        ib.l.j(collection);
        if (collection instanceof e0) {
            collection = ((e0) collection).q0();
        }
        if ((collection instanceof Set) && collection.size() > set.size()) {
            return w.o(set.iterator(), collection);
        }
        return j(set, collection.iterator());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean j(Set<?> set, Iterator<?> it) {
        boolean z10 = false;
        while (it.hasNext()) {
            z10 |= set.remove(it.next());
        }
        return z10;
    }
}
