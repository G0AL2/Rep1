package jb;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.Objects;
import java.util.SortedMap;
import jb.q;

/* compiled from: ImmutableMap.java */
/* loaded from: classes3.dex */
public abstract class t<K, V> implements Map<K, V>, Serializable {

    /* renamed from: a  reason: collision with root package name */
    private transient u<Map.Entry<K, V>> f33062a;

    /* renamed from: b  reason: collision with root package name */
    private transient u<K> f33063b;

    /* renamed from: c  reason: collision with root package name */
    private transient q<V> f33064c;

    /* compiled from: ImmutableMap.java */
    /* loaded from: classes3.dex */
    public static class a<K, V> {

        /* renamed from: a  reason: collision with root package name */
        Comparator<? super V> f33065a;

        /* renamed from: b  reason: collision with root package name */
        Object[] f33066b;

        /* renamed from: c  reason: collision with root package name */
        int f33067c;

        /* renamed from: d  reason: collision with root package name */
        boolean f33068d;

        public a() {
            this(4);
        }

        private void c(int i10) {
            int i11 = i10 * 2;
            Object[] objArr = this.f33066b;
            if (i11 > objArr.length) {
                this.f33066b = Arrays.copyOf(objArr, q.b.c(objArr.length, i11));
                this.f33068d = false;
            }
        }

        public t<K, V> a() {
            return b();
        }

        public t<K, V> b() {
            g();
            this.f33068d = true;
            return l0.n(this.f33067c, this.f33066b);
        }

        public a<K, V> d(K k10, V v10) {
            c(this.f33067c + 1);
            h.a(k10, v10);
            Object[] objArr = this.f33066b;
            int i10 = this.f33067c;
            objArr[i10 * 2] = k10;
            objArr[(i10 * 2) + 1] = v10;
            this.f33067c = i10 + 1;
            return this;
        }

        public a<K, V> e(Map.Entry<? extends K, ? extends V> entry) {
            return d(entry.getKey(), entry.getValue());
        }

        public a<K, V> f(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
            if (iterable instanceof Collection) {
                c(this.f33067c + ((Collection) iterable).size());
            }
            for (Map.Entry<? extends K, ? extends V> entry : iterable) {
                e(entry);
            }
            return this;
        }

        void g() {
            int i10;
            if (this.f33065a != null) {
                if (this.f33068d) {
                    this.f33066b = Arrays.copyOf(this.f33066b, this.f33067c * 2);
                }
                Map.Entry[] entryArr = new Map.Entry[this.f33067c];
                int i11 = 0;
                while (true) {
                    i10 = this.f33067c;
                    if (i11 >= i10) {
                        break;
                    }
                    int i12 = i11 * 2;
                    Object obj = this.f33066b[i12];
                    Objects.requireNonNull(obj);
                    Object obj2 = this.f33066b[i12 + 1];
                    Objects.requireNonNull(obj2);
                    entryArr[i11] = new AbstractMap.SimpleImmutableEntry(obj, obj2);
                    i11++;
                }
                Arrays.sort(entryArr, 0, i10, i0.a(this.f33065a).c(a0.j()));
                for (int i13 = 0; i13 < this.f33067c; i13++) {
                    int i14 = i13 * 2;
                    this.f33066b[i14] = entryArr[i13].getKey();
                    this.f33066b[i14 + 1] = entryArr[i13].getValue();
                }
            }
        }

        a(int i10) {
            this.f33066b = new Object[i10 * 2];
            this.f33067c = 0;
            this.f33068d = false;
        }
    }

    public static <K, V> a<K, V> a() {
        return new a<>();
    }

    public static <K, V> t<K, V> c(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        a aVar = new a(iterable instanceof Collection ? ((Collection) iterable).size() : 4);
        aVar.f(iterable);
        return aVar.a();
    }

    public static <K, V> t<K, V> d(Map<? extends K, ? extends V> map) {
        if ((map instanceof t) && !(map instanceof SortedMap)) {
            t<K, V> tVar = (t) map;
            if (!tVar.i()) {
                return tVar;
            }
        }
        return c(map.entrySet());
    }

    public static <K, V> t<K, V> k() {
        return (t<K, V>) l0.f33018g;
    }

    public static <K, V> t<K, V> l(K k10, V v10) {
        h.a(k10, v10);
        return l0.n(1, new Object[]{k10, v10});
    }

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    abstract u<Map.Entry<K, V>> e();

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return a0.c(this, obj);
    }

    abstract u<K> f();

    abstract q<V> g();

    @Override // java.util.Map
    public abstract V get(Object obj);

    @Override // java.util.Map
    public final V getOrDefault(Object obj, V v10) {
        V v11 = get(obj);
        return v11 != null ? v11 : v10;
    }

    @Override // java.util.Map
    /* renamed from: h */
    public u<Map.Entry<K, V>> entrySet() {
        u<Map.Entry<K, V>> uVar = this.f33062a;
        if (uVar == null) {
            u<Map.Entry<K, V>> e10 = e();
            this.f33062a = e10;
            return e10;
        }
        return uVar;
    }

    @Override // java.util.Map
    public int hashCode() {
        return q0.d(entrySet());
    }

    abstract boolean i();

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    /* renamed from: j */
    public u<K> keySet() {
        u<K> uVar = this.f33063b;
        if (uVar == null) {
            u<K> f10 = f();
            this.f33063b = f10;
            return f10;
        }
        return uVar;
    }

    @Override // java.util.Map
    /* renamed from: m */
    public q<V> values() {
        q<V> qVar = this.f33064c;
        if (qVar == null) {
            q<V> g10 = g();
            this.f33064c = g10;
            return g10;
        }
        return qVar;
    }

    @Override // java.util.Map
    @Deprecated
    public final V put(K k10, V v10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        return a0.i(this);
    }
}
