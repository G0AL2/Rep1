package jb;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CompactHashMap.java */
/* loaded from: classes3.dex */
public class j<K, V> extends AbstractMap<K, V> implements Serializable {

    /* renamed from: j  reason: collision with root package name */
    private static final Object f32991j = new Object();

    /* renamed from: a  reason: collision with root package name */
    private transient Object f32992a;

    /* renamed from: b  reason: collision with root package name */
    transient int[] f32993b;

    /* renamed from: c  reason: collision with root package name */
    transient Object[] f32994c;

    /* renamed from: d  reason: collision with root package name */
    transient Object[] f32995d;

    /* renamed from: e  reason: collision with root package name */
    private transient int f32996e;

    /* renamed from: f  reason: collision with root package name */
    private transient int f32997f;

    /* renamed from: g  reason: collision with root package name */
    private transient Set<K> f32998g;

    /* renamed from: h  reason: collision with root package name */
    private transient Set<Map.Entry<K, V>> f32999h;

    /* renamed from: i  reason: collision with root package name */
    private transient Collection<V> f33000i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CompactHashMap.java */
    /* loaded from: classes3.dex */
    public class a extends j<K, V>.e<K> {
        a() {
            super(j.this, null);
        }

        @Override // jb.j.e
        K c(int i10) {
            return (K) j.this.H(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CompactHashMap.java */
    /* loaded from: classes3.dex */
    public class b extends j<K, V>.e<Map.Entry<K, V>> {
        b() {
            super(j.this, null);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // jb.j.e
        /* renamed from: e */
        public Map.Entry<K, V> c(int i10) {
            return new g(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CompactHashMap.java */
    /* loaded from: classes3.dex */
    public class c extends j<K, V>.e<V> {
        c() {
            super(j.this, null);
        }

        @Override // jb.j.e
        V c(int i10) {
            return (V) j.this.X(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CompactHashMap.java */
    /* loaded from: classes3.dex */
    public class d extends AbstractSet<Map.Entry<K, V>> {
        d() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            j.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map<K, V> x10 = j.this.x();
            if (x10 != null) {
                return x10.entrySet().contains(obj);
            }
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                int E = j.this.E(entry.getKey());
                return E != -1 && ib.i.a(j.this.X(E), entry.getValue());
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return j.this.z();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map<K, V> x10 = j.this.x();
            if (x10 != null) {
                return x10.entrySet().remove(obj);
            }
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                if (j.this.K()) {
                    return false;
                }
                int C = j.this.C();
                int f10 = k.f(entry.getKey(), entry.getValue(), C, j.this.O(), j.this.M(), j.this.N(), j.this.P());
                if (f10 == -1) {
                    return false;
                }
                j.this.J(f10, C);
                j.f(j.this);
                j.this.D();
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return j.this.size();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CompactHashMap.java */
    /* loaded from: classes3.dex */
    public class f extends AbstractSet<K> {
        f() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            j.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return j.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return j.this.I();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map<K, V> x10 = j.this.x();
            if (x10 != null) {
                return x10.keySet().remove(obj);
            }
            return j.this.L(obj) != j.f32991j;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return j.this.size();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CompactHashMap.java */
    /* loaded from: classes3.dex */
    public final class g extends jb.e<K, V> {

        /* renamed from: a  reason: collision with root package name */
        private final K f33010a;

        /* renamed from: b  reason: collision with root package name */
        private int f33011b;

        g(int i10) {
            this.f33010a = (K) j.this.H(i10);
            this.f33011b = i10;
        }

        private void a() {
            int i10 = this.f33011b;
            if (i10 == -1 || i10 >= j.this.size() || !ib.i.a(this.f33010a, j.this.H(this.f33011b))) {
                this.f33011b = j.this.E(this.f33010a);
            }
        }

        @Override // jb.e, java.util.Map.Entry
        public K getKey() {
            return this.f33010a;
        }

        @Override // jb.e, java.util.Map.Entry
        public V getValue() {
            Map<K, V> x10 = j.this.x();
            if (x10 != null) {
                return (V) g0.a(x10.get(this.f33010a));
            }
            a();
            int i10 = this.f33011b;
            return i10 == -1 ? (V) g0.b() : (V) j.this.X(i10);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v10) {
            Map<K, V> x10 = j.this.x();
            if (x10 != null) {
                return (V) g0.a(x10.put(this.f33010a, v10));
            }
            a();
            int i10 = this.f33011b;
            if (i10 != -1) {
                V v11 = (V) j.this.X(i10);
                j.this.W(this.f33011b, v10);
                return v11;
            }
            j.this.put(this.f33010a, v10);
            return (V) g0.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CompactHashMap.java */
    /* loaded from: classes3.dex */
    public class h extends AbstractCollection<V> {
        h() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            j.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return j.this.Y();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return j.this.size();
        }
    }

    j(int i10) {
        F(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int C() {
        return (1 << (this.f32996e & 31)) - 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int E(Object obj) {
        if (K()) {
            return -1;
        }
        int c10 = p.c(obj);
        int C = C();
        int h10 = k.h(O(), c10 & C);
        if (h10 == 0) {
            return -1;
        }
        int b10 = k.b(c10, C);
        do {
            int i10 = h10 - 1;
            int y10 = y(i10);
            if (k.b(y10, C) == b10 && ib.i.a(obj, H(i10))) {
                return i10;
            }
            h10 = k.c(y10, C);
        } while (h10 != 0);
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public K H(int i10) {
        return (K) N()[i10];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object L(Object obj) {
        if (K()) {
            return f32991j;
        }
        int C = C();
        int f10 = k.f(obj, null, C, O(), M(), N(), null);
        if (f10 == -1) {
            return f32991j;
        }
        V X = X(f10);
        J(f10, C);
        this.f32997f--;
        D();
        return X;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int[] M() {
        int[] iArr = this.f32993b;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object[] N() {
        Object[] objArr = this.f32994c;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object O() {
        Object obj = this.f32992a;
        Objects.requireNonNull(obj);
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object[] P() {
        Object[] objArr = this.f32995d;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    private void R(int i10) {
        int min;
        int length = M().length;
        if (i10 <= length || (min = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) == length) {
            return;
        }
        Q(min);
    }

    private int S(int i10, int i11, int i12, int i13) {
        Object a10 = k.a(i11);
        int i14 = i11 - 1;
        if (i13 != 0) {
            k.i(a10, i12 & i14, i13 + 1);
        }
        Object O = O();
        int[] M = M();
        for (int i15 = 0; i15 <= i10; i15++) {
            int h10 = k.h(O, i15);
            while (h10 != 0) {
                int i16 = h10 - 1;
                int i17 = M[i16];
                int b10 = k.b(i17, i10) | i15;
                int i18 = b10 & i14;
                int h11 = k.h(a10, i18);
                k.i(a10, i18, h10);
                M[i16] = k.d(b10, h11, i14);
                h10 = k.c(i17, i10);
            }
        }
        this.f32992a = a10;
        U(i14);
        return i14;
    }

    private void T(int i10, int i11) {
        M()[i10] = i11;
    }

    private void U(int i10) {
        this.f32996e = k.d(this.f32996e, 32 - Integer.numberOfLeadingZeros(i10), 31);
    }

    private void V(int i10, K k10) {
        N()[i10] = k10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W(int i10, V v10) {
        P()[i10] = v10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public V X(int i10) {
        return (V) P()[i10];
    }

    static /* synthetic */ int f(j jVar) {
        int i10 = jVar.f32997f;
        jVar.f32997f = i10 - 1;
        return i10;
    }

    public static <K, V> j<K, V> w(int i10) {
        return new j<>(i10);
    }

    private int y(int i10) {
        return M()[i10];
    }

    int A() {
        return isEmpty() ? -1 : 0;
    }

    int B(int i10) {
        int i11 = i10 + 1;
        if (i11 < this.f32997f) {
            return i11;
        }
        return -1;
    }

    void D() {
        this.f32996e += 32;
    }

    void F(int i10) {
        ib.l.e(i10 >= 0, "Expected size must be >= 0");
        this.f32996e = mb.d.f(i10, 1, 1073741823);
    }

    void G(int i10, K k10, V v10, int i11, int i12) {
        T(i10, k.d(i11, 0, i12));
        V(i10, k10);
        W(i10, v10);
    }

    Iterator<K> I() {
        Map<K, V> x10 = x();
        if (x10 != null) {
            return x10.keySet().iterator();
        }
        return new a();
    }

    void J(int i10, int i11) {
        Object O = O();
        int[] M = M();
        Object[] N = N();
        Object[] P = P();
        int size = size() - 1;
        if (i10 < size) {
            Object obj = N[size];
            N[i10] = obj;
            P[i10] = P[size];
            N[size] = null;
            P[size] = null;
            M[i10] = M[size];
            M[size] = 0;
            int c10 = p.c(obj) & i11;
            int h10 = k.h(O, c10);
            int i12 = size + 1;
            if (h10 == i12) {
                k.i(O, c10, i10 + 1);
                return;
            }
            while (true) {
                int i13 = h10 - 1;
                int i14 = M[i13];
                int c11 = k.c(i14, i11);
                if (c11 == i12) {
                    M[i13] = k.d(i14, i10 + 1, i11);
                    return;
                }
                h10 = c11;
            }
        } else {
            N[i10] = null;
            P[i10] = null;
            M[i10] = 0;
        }
    }

    boolean K() {
        return this.f32992a == null;
    }

    void Q(int i10) {
        this.f32993b = Arrays.copyOf(M(), i10);
        this.f32994c = Arrays.copyOf(N(), i10);
        this.f32995d = Arrays.copyOf(P(), i10);
    }

    Iterator<V> Y() {
        Map<K, V> x10 = x();
        if (x10 != null) {
            return x10.values().iterator();
        }
        return new c();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        if (K()) {
            return;
        }
        D();
        Map<K, V> x10 = x();
        if (x10 != null) {
            this.f32996e = mb.d.f(size(), 3, 1073741823);
            x10.clear();
            this.f32992a = null;
            this.f32997f = 0;
            return;
        }
        Arrays.fill(N(), 0, this.f32997f, (Object) null);
        Arrays.fill(P(), 0, this.f32997f, (Object) null);
        k.g(O());
        Arrays.fill(M(), 0, this.f32997f, 0);
        this.f32997f = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Map<K, V> x10 = x();
        if (x10 != null) {
            return x10.containsKey(obj);
        }
        return E(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(Object obj) {
        Map<K, V> x10 = x();
        if (x10 != null) {
            return x10.containsValue(obj);
        }
        for (int i10 = 0; i10 < this.f32997f; i10++) {
            if (ib.i.a(obj, X(i10))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f32999h;
        if (set == null) {
            Set<Map.Entry<K, V>> s10 = s();
            this.f32999h = s10;
            return s10;
        }
        return set;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Map<K, V> x10 = x();
        if (x10 != null) {
            return x10.get(obj);
        }
        int E = E(obj);
        if (E == -1) {
            return null;
        }
        o(E);
        return X(E);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.f32998g;
        if (set == null) {
            Set<K> u10 = u();
            this.f32998g = u10;
            return u10;
        }
        return set;
    }

    void o(int i10) {
    }

    int p(int i10, int i11) {
        return i10 - 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k10, V v10) {
        int S;
        int i10;
        if (K()) {
            q();
        }
        Map<K, V> x10 = x();
        if (x10 != null) {
            return x10.put(k10, v10);
        }
        int[] M = M();
        Object[] N = N();
        Object[] P = P();
        int i11 = this.f32997f;
        int i12 = i11 + 1;
        int c10 = p.c(k10);
        int C = C();
        int i13 = c10 & C;
        int h10 = k.h(O(), i13);
        if (h10 != 0) {
            int b10 = k.b(c10, C);
            int i14 = 0;
            while (true) {
                int i15 = h10 - 1;
                int i16 = M[i15];
                if (k.b(i16, C) == b10 && ib.i.a(k10, N[i15])) {
                    V v11 = (V) P[i15];
                    P[i15] = v10;
                    o(i15);
                    return v11;
                }
                int c11 = k.c(i16, C);
                i14++;
                if (c11 != 0) {
                    h10 = c11;
                } else if (i14 >= 9) {
                    return r().put(k10, v10);
                } else {
                    if (i12 > C) {
                        S = S(C, k.e(C), c10, i11);
                    } else {
                        M[i15] = k.d(i16, i12, C);
                    }
                }
            }
        } else if (i12 > C) {
            S = S(C, k.e(C), c10, i11);
            i10 = S;
        } else {
            k.i(O(), i13, i12);
            i10 = C;
        }
        R(i12);
        G(i11, k10, v10, c10, i10);
        this.f32997f = i12;
        D();
        return null;
    }

    int q() {
        ib.l.p(K(), "Arrays already allocated");
        int i10 = this.f32996e;
        int j10 = k.j(i10);
        this.f32992a = k.a(j10);
        U(j10 - 1);
        this.f32993b = new int[i10];
        this.f32994c = new Object[i10];
        this.f32995d = new Object[i10];
        return i10;
    }

    Map<K, V> r() {
        Map<K, V> t10 = t(C() + 1);
        int A = A();
        while (A >= 0) {
            t10.put(H(A), X(A));
            A = B(A);
        }
        this.f32992a = t10;
        this.f32993b = null;
        this.f32994c = null;
        this.f32995d = null;
        D();
        return t10;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        Map<K, V> x10 = x();
        if (x10 != null) {
            return x10.remove(obj);
        }
        V v10 = (V) L(obj);
        if (v10 == f32991j) {
            return null;
        }
        return v10;
    }

    Set<Map.Entry<K, V>> s() {
        return new d();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        Map<K, V> x10 = x();
        return x10 != null ? x10.size() : this.f32997f;
    }

    Map<K, V> t(int i10) {
        return new LinkedHashMap(i10, 1.0f);
    }

    Set<K> u() {
        return new f();
    }

    Collection<V> v() {
        return new h();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection<V> values() {
        Collection<V> collection = this.f33000i;
        if (collection == null) {
            Collection<V> v10 = v();
            this.f33000i = v10;
            return v10;
        }
        return collection;
    }

    Map<K, V> x() {
        Object obj = this.f32992a;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    Iterator<Map.Entry<K, V>> z() {
        Map<K, V> x10 = x();
        if (x10 != null) {
            return x10.entrySet().iterator();
        }
        return new b();
    }

    /* compiled from: CompactHashMap.java */
    /* loaded from: classes3.dex */
    private abstract class e<T> implements Iterator<T> {

        /* renamed from: a  reason: collision with root package name */
        int f33005a;

        /* renamed from: b  reason: collision with root package name */
        int f33006b;

        /* renamed from: c  reason: collision with root package name */
        int f33007c;

        private e() {
            this.f33005a = j.this.f32996e;
            this.f33006b = j.this.A();
            this.f33007c = -1;
        }

        private void b() {
            if (j.this.f32996e != this.f33005a) {
                throw new ConcurrentModificationException();
            }
        }

        abstract T c(int i10);

        void d() {
            this.f33005a += 32;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f33006b >= 0;
        }

        @Override // java.util.Iterator
        public T next() {
            b();
            if (hasNext()) {
                int i10 = this.f33006b;
                this.f33007c = i10;
                T c10 = c(i10);
                this.f33006b = j.this.B(this.f33006b);
                return c10;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            b();
            jb.h.c(this.f33007c >= 0);
            d();
            j jVar = j.this;
            jVar.remove(jVar.H(this.f33007c));
            this.f33006b = j.this.p(this.f33006b, this.f33007c);
            this.f33007c = -1;
        }

        /* synthetic */ e(j jVar, a aVar) {
            this();
        }
    }
}
