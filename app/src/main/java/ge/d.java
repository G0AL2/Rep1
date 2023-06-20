package ge;

import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import fe.c0;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import qe.k;

/* compiled from: MapBuilder.kt */
/* loaded from: classes3.dex */
public final class d<K, V> implements Map<K, V>, Serializable, re.a {

    /* renamed from: m  reason: collision with root package name */
    private static final a f30844m = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private K[] f30845a;

    /* renamed from: b  reason: collision with root package name */
    private V[] f30846b;

    /* renamed from: c  reason: collision with root package name */
    private int[] f30847c;

    /* renamed from: d  reason: collision with root package name */
    private int[] f30848d;

    /* renamed from: e  reason: collision with root package name */
    private int f30849e;

    /* renamed from: f  reason: collision with root package name */
    private int f30850f;

    /* renamed from: g  reason: collision with root package name */
    private int f30851g;

    /* renamed from: h  reason: collision with root package name */
    private int f30852h;

    /* renamed from: i  reason: collision with root package name */
    private ge.f<K> f30853i;

    /* renamed from: j  reason: collision with root package name */
    private g<V> f30854j;

    /* renamed from: k  reason: collision with root package name */
    private ge.e<K, V> f30855k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f30856l;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: MapBuilder.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qe.g gVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int c(int i10) {
            int b10;
            b10 = se.f.b(i10, 1);
            return Integer.highestOneBit(b10 * 3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int d(int i10) {
            return Integer.numberOfLeadingZeros(i10) + 1;
        }
    }

    /* compiled from: MapBuilder.kt */
    /* loaded from: classes3.dex */
    public static final class b<K, V> extends C0395d<K, V> implements Iterator<Map.Entry<K, V>>, re.a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(d<K, V> dVar) {
            super(dVar);
            k.f(dVar, "map");
        }

        @Override // java.util.Iterator
        /* renamed from: i */
        public c<K, V> next() {
            if (c() < ((d) e()).f30850f) {
                int c10 = c();
                g(c10 + 1);
                h(c10);
                c<K, V> cVar = new c<>(e(), d());
                f();
                return cVar;
            }
            throw new NoSuchElementException();
        }

        public final void j(StringBuilder sb2) {
            k.f(sb2, "sb");
            if (c() < ((d) e()).f30850f) {
                int c10 = c();
                g(c10 + 1);
                h(c10);
                Object obj = ((d) e()).f30845a[d()];
                if (k.a(obj, e())) {
                    sb2.append("(this Map)");
                } else {
                    sb2.append(obj);
                }
                sb2.append('=');
                Object[] objArr = ((d) e()).f30846b;
                k.c(objArr);
                Object obj2 = objArr[d()];
                if (k.a(obj2, e())) {
                    sb2.append("(this Map)");
                } else {
                    sb2.append(obj2);
                }
                f();
                return;
            }
            throw new NoSuchElementException();
        }

        public final int k() {
            if (c() < ((d) e()).f30850f) {
                int c10 = c();
                g(c10 + 1);
                h(c10);
                Object obj = ((d) e()).f30845a[d()];
                int hashCode = obj != null ? obj.hashCode() : 0;
                Object[] objArr = ((d) e()).f30846b;
                k.c(objArr);
                Object obj2 = objArr[d()];
                int hashCode2 = hashCode ^ (obj2 != null ? obj2.hashCode() : 0);
                f();
                return hashCode2;
            }
            throw new NoSuchElementException();
        }
    }

    /* compiled from: MapBuilder.kt */
    /* loaded from: classes3.dex */
    public static final class c<K, V> implements Map.Entry<K, V>, re.a {

        /* renamed from: a  reason: collision with root package name */
        private final d<K, V> f30857a;

        /* renamed from: b  reason: collision with root package name */
        private final int f30858b;

        public c(d<K, V> dVar, int i10) {
            k.f(dVar, "map");
            this.f30857a = dVar;
            this.f30858b = i10;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                if (k.a(entry.getKey(), getKey()) && k.a(entry.getValue(), getValue())) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return (K) ((d) this.f30857a).f30845a[this.f30858b];
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            Object[] objArr = ((d) this.f30857a).f30846b;
            k.c(objArr);
            return (V) objArr[this.f30858b];
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K key = getKey();
            int hashCode = key != null ? key.hashCode() : 0;
            V value = getValue();
            return hashCode ^ (value != null ? value.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v10) {
            this.f30857a.k();
            Object[] i10 = this.f30857a.i();
            int i11 = this.f30858b;
            V v11 = (V) i10[i11];
            i10[i11] = v10;
            return v11;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(getKey());
            sb2.append('=');
            sb2.append(getValue());
            return sb2.toString();
        }
    }

    /* compiled from: MapBuilder.kt */
    /* renamed from: ge.d$d  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static class C0395d<K, V> {

        /* renamed from: a  reason: collision with root package name */
        private final d<K, V> f30859a;

        /* renamed from: b  reason: collision with root package name */
        private int f30860b;

        /* renamed from: c  reason: collision with root package name */
        private int f30861c;

        public C0395d(d<K, V> dVar) {
            k.f(dVar, "map");
            this.f30859a = dVar;
            this.f30861c = -1;
            f();
        }

        public final int c() {
            return this.f30860b;
        }

        public final int d() {
            return this.f30861c;
        }

        public final d<K, V> e() {
            return this.f30859a;
        }

        public final void f() {
            while (this.f30860b < ((d) this.f30859a).f30850f) {
                int[] iArr = ((d) this.f30859a).f30847c;
                int i10 = this.f30860b;
                if (iArr[i10] >= 0) {
                    return;
                }
                this.f30860b = i10 + 1;
            }
        }

        public final void g(int i10) {
            this.f30860b = i10;
        }

        public final void h(int i10) {
            this.f30861c = i10;
        }

        public final boolean hasNext() {
            return this.f30860b < ((d) this.f30859a).f30850f;
        }

        public final void remove() {
            if (this.f30861c != -1) {
                this.f30859a.k();
                this.f30859a.J(this.f30861c);
                this.f30861c = -1;
                return;
            }
            throw new IllegalStateException("Call next() before removing element from the iterator.".toString());
        }
    }

    /* compiled from: MapBuilder.kt */
    /* loaded from: classes3.dex */
    public static final class e<K, V> extends C0395d<K, V> implements Iterator<K>, re.a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(d<K, V> dVar) {
            super(dVar);
            k.f(dVar, "map");
        }

        @Override // java.util.Iterator
        public K next() {
            if (c() < ((d) e()).f30850f) {
                int c10 = c();
                g(c10 + 1);
                h(c10);
                K k10 = (K) ((d) e()).f30845a[d()];
                f();
                return k10;
            }
            throw new NoSuchElementException();
        }
    }

    /* compiled from: MapBuilder.kt */
    /* loaded from: classes3.dex */
    public static final class f<K, V> extends C0395d<K, V> implements Iterator<V>, re.a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(d<K, V> dVar) {
            super(dVar);
            k.f(dVar, "map");
        }

        @Override // java.util.Iterator
        public V next() {
            if (c() < ((d) e()).f30850f) {
                int c10 = c();
                g(c10 + 1);
                h(c10);
                Object[] objArr = ((d) e()).f30846b;
                k.c(objArr);
                V v10 = (V) objArr[d()];
                f();
                return v10;
            }
            throw new NoSuchElementException();
        }
    }

    private d(K[] kArr, V[] vArr, int[] iArr, int[] iArr2, int i10, int i11) {
        this.f30845a = kArr;
        this.f30846b = vArr;
        this.f30847c = iArr;
        this.f30848d = iArr2;
        this.f30849e = i10;
        this.f30850f = i11;
        this.f30851g = f30844m.d(w());
    }

    private final int A(K k10) {
        return ((k10 != null ? k10.hashCode() : 0) * (-1640531527)) >>> this.f30851g;
    }

    private final boolean C(Collection<? extends Map.Entry<? extends K, ? extends V>> collection) {
        boolean z10 = false;
        if (collection.isEmpty()) {
            return false;
        }
        q(collection.size());
        for (Map.Entry<? extends K, ? extends V> entry : collection) {
            if (D(entry)) {
                z10 = true;
            }
        }
        return z10;
    }

    private final boolean D(Map.Entry<? extends K, ? extends V> entry) {
        int h10 = h(entry.getKey());
        V[] i10 = i();
        if (h10 >= 0) {
            i10[h10] = entry.getValue();
            return true;
        }
        int i11 = (-h10) - 1;
        if (k.a(entry.getValue(), i10[i11])) {
            return false;
        }
        i10[i11] = entry.getValue();
        return true;
    }

    private final boolean E(int i10) {
        int A = A(this.f30845a[i10]);
        int i11 = this.f30849e;
        while (true) {
            int[] iArr = this.f30848d;
            if (iArr[A] == 0) {
                iArr[A] = i10 + 1;
                this.f30847c[i10] = A;
                return true;
            }
            i11--;
            if (i11 < 0) {
                return false;
            }
            A = A == 0 ? w() - 1 : A - 1;
        }
    }

    private final void F(int i10) {
        if (this.f30850f > size()) {
            l();
        }
        int i11 = 0;
        if (i10 != w()) {
            this.f30848d = new int[i10];
            this.f30851g = f30844m.d(i10);
        } else {
            fe.k.i(this.f30848d, 0, 0, w());
        }
        while (i11 < this.f30850f) {
            int i12 = i11 + 1;
            if (!E(i11)) {
                throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
            }
            i11 = i12;
        }
    }

    private final void H(int i10) {
        int d10;
        d10 = se.f.d(this.f30849e * 2, w() / 2);
        int i11 = d10;
        int i12 = 0;
        int i13 = i10;
        do {
            i10 = i10 == 0 ? w() - 1 : i10 - 1;
            i12++;
            if (i12 > this.f30849e) {
                this.f30848d[i13] = 0;
                return;
            }
            int[] iArr = this.f30848d;
            int i14 = iArr[i10];
            if (i14 == 0) {
                iArr[i13] = 0;
                return;
            }
            if (i14 < 0) {
                iArr[i13] = -1;
            } else {
                int i15 = i14 - 1;
                if (((A(this.f30845a[i15]) - i10) & (w() - 1)) >= i12) {
                    this.f30848d[i13] = i14;
                    this.f30847c[i15] = i13;
                }
                i11--;
            }
            i13 = i10;
            i12 = 0;
            i11--;
        } while (i11 >= 0);
        this.f30848d[i13] = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J(int i10) {
        ge.c.f(this.f30845a, i10);
        H(this.f30847c[i10]);
        this.f30847c[i10] = -1;
        this.f30852h = size() - 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final V[] i() {
        V[] vArr = this.f30846b;
        if (vArr != null) {
            return vArr;
        }
        V[] vArr2 = (V[]) ge.c.d(u());
        this.f30846b = vArr2;
        return vArr2;
    }

    private final void l() {
        int i10;
        V[] vArr = this.f30846b;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            i10 = this.f30850f;
            if (i11 >= i10) {
                break;
            }
            if (this.f30847c[i11] >= 0) {
                K[] kArr = this.f30845a;
                kArr[i12] = kArr[i11];
                if (vArr != null) {
                    vArr[i12] = vArr[i11];
                }
                i12++;
            }
            i11++;
        }
        ge.c.g(this.f30845a, i12, i10);
        if (vArr != null) {
            ge.c.g(vArr, i12, this.f30850f);
        }
        this.f30850f = i12;
    }

    private final boolean o(Map<?, ?> map) {
        return size() == map.size() && m(map.entrySet());
    }

    private final void p(int i10) {
        if (i10 >= 0) {
            if (i10 > u()) {
                int u10 = (u() * 3) / 2;
                if (i10 <= u10) {
                    i10 = u10;
                }
                this.f30845a = (K[]) ge.c.e(this.f30845a, i10);
                V[] vArr = this.f30846b;
                this.f30846b = vArr != null ? (V[]) ge.c.e(vArr, i10) : null;
                int[] copyOf = Arrays.copyOf(this.f30847c, i10);
                k.e(copyOf, "copyOf(this, newSize)");
                this.f30847c = copyOf;
                int c10 = f30844m.c(i10);
                if (c10 > w()) {
                    F(c10);
                    return;
                }
                return;
            } else if ((this.f30850f + i10) - size() > u()) {
                F(w());
                return;
            } else {
                return;
            }
        }
        throw new OutOfMemoryError();
    }

    private final void q(int i10) {
        p(this.f30850f + i10);
    }

    private final int s(K k10) {
        int A = A(k10);
        int i10 = this.f30849e;
        while (true) {
            int i11 = this.f30848d[A];
            if (i11 == 0) {
                return -1;
            }
            if (i11 > 0) {
                int i12 = i11 - 1;
                if (k.a(this.f30845a[i12], k10)) {
                    return i12;
                }
            }
            i10--;
            if (i10 < 0) {
                return -1;
            }
            A = A == 0 ? w() - 1 : A - 1;
        }
    }

    private final int t(V v10) {
        int i10 = this.f30850f;
        while (true) {
            i10--;
            if (i10 < 0) {
                return -1;
            }
            if (this.f30847c[i10] >= 0) {
                V[] vArr = this.f30846b;
                k.c(vArr);
                if (k.a(vArr[i10], v10)) {
                    return i10;
                }
            }
        }
    }

    private final int u() {
        return this.f30845a.length;
    }

    private final int w() {
        return this.f30848d.length;
    }

    public final e<K, V> B() {
        return new e<>(this);
    }

    public final boolean G(Map.Entry<? extends K, ? extends V> entry) {
        k.f(entry, "entry");
        k();
        int s10 = s(entry.getKey());
        if (s10 < 0) {
            return false;
        }
        V[] vArr = this.f30846b;
        k.c(vArr);
        if (k.a(vArr[s10], entry.getValue())) {
            J(s10);
            return true;
        }
        return false;
    }

    public final int I(K k10) {
        k();
        int s10 = s(k10);
        if (s10 < 0) {
            return -1;
        }
        J(s10);
        return s10;
    }

    public final boolean K(V v10) {
        k();
        int t10 = t(v10);
        if (t10 < 0) {
            return false;
        }
        J(t10);
        return true;
    }

    public final f<K, V> L() {
        return new f<>(this);
    }

    @Override // java.util.Map
    public void clear() {
        k();
        c0 it = new se.c(0, this.f30850f - 1).iterator();
        while (it.hasNext()) {
            int c10 = it.c();
            int[] iArr = this.f30847c;
            int i10 = iArr[c10];
            if (i10 >= 0) {
                this.f30848d[i10] = 0;
                iArr[c10] = -1;
            }
        }
        ge.c.g(this.f30845a, 0, this.f30850f);
        V[] vArr = this.f30846b;
        if (vArr != null) {
            ge.c.g(vArr, 0, this.f30850f);
        }
        this.f30852h = 0;
        this.f30850f = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return s(obj) >= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return t(obj) >= 0;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return v();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof Map) && o((Map) obj));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public V get(Object obj) {
        int s10 = s(obj);
        if (s10 < 0) {
            return null;
        }
        V[] vArr = this.f30846b;
        k.c(vArr);
        return vArr[s10];
    }

    public final int h(K k10) {
        int d10;
        k();
        while (true) {
            int A = A(k10);
            d10 = se.f.d(this.f30849e * 2, w() / 2);
            int i10 = 0;
            while (true) {
                int i11 = this.f30848d[A];
                if (i11 <= 0) {
                    if (this.f30850f >= u()) {
                        q(1);
                    } else {
                        int i12 = this.f30850f;
                        int i13 = i12 + 1;
                        this.f30850f = i13;
                        this.f30845a[i12] = k10;
                        this.f30847c[i12] = A;
                        this.f30848d[A] = i13;
                        this.f30852h = size() + 1;
                        if (i10 > this.f30849e) {
                            this.f30849e = i10;
                        }
                        return i12;
                    }
                } else if (k.a(this.f30845a[i11 - 1], k10)) {
                    return -i11;
                } else {
                    i10++;
                    if (i10 > d10) {
                        F(w() * 2);
                        break;
                    }
                    A = A == 0 ? w() - 1 : A - 1;
                }
            }
        }
    }

    @Override // java.util.Map
    public int hashCode() {
        b<K, V> r10 = r();
        int i10 = 0;
        while (r10.hasNext()) {
            i10 += r10.k();
        }
        return i10;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    public final Map<K, V> j() {
        k();
        this.f30856l = true;
        return this;
    }

    public final void k() {
        if (this.f30856l) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return x();
    }

    public final boolean m(Collection<?> collection) {
        k.f(collection, InneractiveMediationDefs.GENDER_MALE);
        for (Object obj : collection) {
            if (obj != null) {
                try {
                    if (!n((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    public final boolean n(Map.Entry<? extends K, ? extends V> entry) {
        k.f(entry, "entry");
        int s10 = s(entry.getKey());
        if (s10 < 0) {
            return false;
        }
        V[] vArr = this.f30846b;
        k.c(vArr);
        return k.a(vArr[s10], entry.getValue());
    }

    @Override // java.util.Map
    public V put(K k10, V v10) {
        k();
        int h10 = h(k10);
        V[] i10 = i();
        if (h10 < 0) {
            int i11 = (-h10) - 1;
            V v11 = i10[i11];
            i10[i11] = v10;
            return v11;
        }
        i10[h10] = v10;
        return null;
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        k.f(map, "from");
        k();
        C(map.entrySet());
    }

    public final b<K, V> r() {
        return new b<>(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public V remove(Object obj) {
        int I = I(obj);
        if (I < 0) {
            return null;
        }
        V[] vArr = this.f30846b;
        k.c(vArr);
        V v10 = vArr[I];
        ge.c.f(vArr, I);
        return v10;
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return y();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder((size() * 3) + 2);
        sb2.append("{");
        b<K, V> r10 = r();
        int i10 = 0;
        while (r10.hasNext()) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            r10.j(sb2);
            i10++;
        }
        sb2.append("}");
        String sb3 = sb2.toString();
        k.e(sb3, "sb.toString()");
        return sb3;
    }

    public Set<Map.Entry<K, V>> v() {
        ge.e<K, V> eVar = this.f30855k;
        if (eVar == null) {
            ge.e<K, V> eVar2 = new ge.e<>(this);
            this.f30855k = eVar2;
            return eVar2;
        }
        return eVar;
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<V> values() {
        return z();
    }

    public Set<K> x() {
        ge.f<K> fVar = this.f30853i;
        if (fVar == null) {
            ge.f<K> fVar2 = new ge.f<>(this);
            this.f30853i = fVar2;
            return fVar2;
        }
        return fVar;
    }

    public int y() {
        return this.f30852h;
    }

    public Collection<V> z() {
        g<V> gVar = this.f30854j;
        if (gVar == null) {
            g<V> gVar2 = new g<>(this);
            this.f30854j = gVar2;
            return gVar2;
        }
        return gVar;
    }

    public d() {
        this(8);
    }

    public d(int i10) {
        this(ge.c.d(i10), null, new int[i10], new int[f30844m.c(i10)], 2, 0);
    }
}
