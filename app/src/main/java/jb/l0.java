package jb;

import com.inmobi.media.fq;
import java.util.AbstractMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RegularImmutableMap.java */
/* loaded from: classes3.dex */
public final class l0<K, V> extends t<K, V> {

    /* renamed from: g  reason: collision with root package name */
    static final t<Object, Object> f33018g = new l0(null, new Object[0], 0);

    /* renamed from: d  reason: collision with root package name */
    private final transient Object f33019d;

    /* renamed from: e  reason: collision with root package name */
    final transient Object[] f33020e;

    /* renamed from: f  reason: collision with root package name */
    private final transient int f33021f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RegularImmutableMap.java */
    /* loaded from: classes3.dex */
    public static class a<K, V> extends u<Map.Entry<K, V>> {

        /* renamed from: c  reason: collision with root package name */
        private final transient t<K, V> f33022c;

        /* renamed from: d  reason: collision with root package name */
        private final transient Object[] f33023d;

        /* renamed from: e  reason: collision with root package name */
        private final transient int f33024e;

        /* renamed from: f  reason: collision with root package name */
        private final transient int f33025f;

        /* compiled from: RegularImmutableMap.java */
        /* renamed from: jb.l0$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        class C0418a extends s<Map.Entry<K, V>> {
            C0418a() {
            }

            @Override // java.util.List
            /* renamed from: A */
            public Map.Entry<K, V> get(int i10) {
                ib.l.h(i10, a.this.f33025f);
                int i11 = i10 * 2;
                Object obj = a.this.f33023d[a.this.f33024e + i11];
                Objects.requireNonNull(obj);
                Object obj2 = a.this.f33023d[i11 + (a.this.f33024e ^ 1)];
                Objects.requireNonNull(obj2);
                return new AbstractMap.SimpleImmutableEntry(obj, obj2);
            }

            @Override // jb.q
            public boolean j() {
                return true;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return a.this.f33025f;
            }
        }

        a(t<K, V> tVar, Object[] objArr, int i10, int i11) {
            this.f33022c = tVar;
            this.f33023d = objArr;
            this.f33024e = i10;
            this.f33025f = i11;
        }

        @Override // jb.q, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Object value = entry.getValue();
                return value != null && value.equals(this.f33022c.get(key));
            }
            return false;
        }

        @Override // jb.q
        int f(Object[] objArr, int i10) {
            return e().f(objArr, i10);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // jb.q
        public boolean j() {
            return true;
        }

        @Override // jb.u, jb.q, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: k */
        public u0<Map.Entry<K, V>> iterator() {
            return e().iterator();
        }

        @Override // jb.u
        s<Map.Entry<K, V>> p() {
            return new C0418a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f33025f;
        }
    }

    /* compiled from: RegularImmutableMap.java */
    /* loaded from: classes3.dex */
    static final class b<K> extends u<K> {

        /* renamed from: c  reason: collision with root package name */
        private final transient t<K, ?> f33027c;

        /* renamed from: d  reason: collision with root package name */
        private final transient s<K> f33028d;

        b(t<K, ?> tVar, s<K> sVar) {
            this.f33027c = tVar;
            this.f33028d = sVar;
        }

        @Override // jb.q, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.f33027c.get(obj) != null;
        }

        @Override // jb.u, jb.q
        public s<K> e() {
            return this.f33028d;
        }

        @Override // jb.q
        int f(Object[] objArr, int i10) {
            return e().f(objArr, i10);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // jb.q
        public boolean j() {
            return true;
        }

        @Override // jb.u, jb.q, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: k */
        public u0<K> iterator() {
            return e().iterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f33027c.size();
        }
    }

    /* compiled from: RegularImmutableMap.java */
    /* loaded from: classes3.dex */
    static final class c extends s<Object> {

        /* renamed from: c  reason: collision with root package name */
        private final transient Object[] f33029c;

        /* renamed from: d  reason: collision with root package name */
        private final transient int f33030d;

        /* renamed from: e  reason: collision with root package name */
        private final transient int f33031e;

        c(Object[] objArr, int i10, int i11) {
            this.f33029c = objArr;
            this.f33030d = i10;
            this.f33031e = i11;
        }

        @Override // java.util.List
        public Object get(int i10) {
            ib.l.h(i10, this.f33031e);
            Object obj = this.f33029c[(i10 * 2) + this.f33030d];
            Objects.requireNonNull(obj);
            return obj;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // jb.q
        public boolean j() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f33031e;
        }
    }

    private l0(Object obj, Object[] objArr, int i10) {
        this.f33019d = obj;
        this.f33020e = objArr;
        this.f33021f = i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <K, V> l0<K, V> n(int i10, Object[] objArr) {
        if (i10 == 0) {
            return (l0) f33018g;
        }
        if (i10 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            Object obj2 = objArr[1];
            Objects.requireNonNull(obj2);
            h.a(obj, obj2);
            return new l0<>(null, objArr, 1);
        }
        ib.l.l(i10, objArr.length >> 1);
        return new l0<>(o(objArr, i10, u.l(i10), 0), objArr, i10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0045, code lost:
        r11[r5] = (byte) r1;
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x008b, code lost:
        r11[r5] = (short) r1;
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c8, code lost:
        r11[r6] = r1;
        r2 = r2 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static java.lang.Object o(java.lang.Object[] r9, int r10, int r11, int r12) {
        /*
            Method dump skipped, instructions count: 222
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: jb.l0.o(java.lang.Object[], int, int, int):java.lang.Object");
    }

    private static IllegalArgumentException p(Object obj, Object obj2, Object[] objArr, int i10) {
        String valueOf = String.valueOf(obj);
        String valueOf2 = String.valueOf(obj2);
        String valueOf3 = String.valueOf(objArr[i10]);
        String valueOf4 = String.valueOf(objArr[i10 ^ 1]);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 39 + valueOf2.length() + valueOf3.length() + valueOf4.length());
        sb2.append("Multiple entries with same key: ");
        sb2.append(valueOf);
        sb2.append("=");
        sb2.append(valueOf2);
        sb2.append(" and ");
        sb2.append(valueOf3);
        sb2.append("=");
        sb2.append(valueOf4);
        return new IllegalArgumentException(sb2.toString());
    }

    static Object q(Object obj, Object[] objArr, int i10, int i11, Object obj2) {
        if (obj2 == null) {
            return null;
        }
        if (i10 == 1) {
            Object obj3 = objArr[i11];
            Objects.requireNonNull(obj3);
            if (obj3.equals(obj2)) {
                Object obj4 = objArr[i11 ^ 1];
                Objects.requireNonNull(obj4);
                return obj4;
            }
            return null;
        } else if (obj == null) {
            return null;
        } else {
            if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                int length = bArr.length - 1;
                int b10 = p.b(obj2.hashCode());
                while (true) {
                    int i12 = b10 & length;
                    int i13 = bArr[i12] & fq.i.NETWORK_LOAD_LIMIT_DISABLED;
                    if (i13 == 255) {
                        return null;
                    }
                    if (obj2.equals(objArr[i13])) {
                        return objArr[i13 ^ 1];
                    }
                    b10 = i12 + 1;
                }
            } else if (obj instanceof short[]) {
                short[] sArr = (short[]) obj;
                int length2 = sArr.length - 1;
                int b11 = p.b(obj2.hashCode());
                while (true) {
                    int i14 = b11 & length2;
                    int i15 = sArr[i14] & 65535;
                    if (i15 == 65535) {
                        return null;
                    }
                    if (obj2.equals(objArr[i15])) {
                        return objArr[i15 ^ 1];
                    }
                    b11 = i14 + 1;
                }
            } else {
                int[] iArr = (int[]) obj;
                int length3 = iArr.length - 1;
                int b12 = p.b(obj2.hashCode());
                while (true) {
                    int i16 = b12 & length3;
                    int i17 = iArr[i16];
                    if (i17 == -1) {
                        return null;
                    }
                    if (obj2.equals(objArr[i17])) {
                        return objArr[i17 ^ 1];
                    }
                    b12 = i16 + 1;
                }
            }
        }
    }

    @Override // jb.t
    u<Map.Entry<K, V>> e() {
        return new a(this, this.f33020e, 0, this.f33021f);
    }

    @Override // jb.t
    u<K> f() {
        return new b(this, new c(this.f33020e, 0, this.f33021f));
    }

    @Override // jb.t
    q<V> g() {
        return new c(this.f33020e, 1, this.f33021f);
    }

    @Override // jb.t, java.util.Map
    public V get(Object obj) {
        V v10 = (V) q(this.f33019d, this.f33020e, this.f33021f, 0, obj);
        if (v10 == null) {
            return null;
        }
        return v10;
    }

    @Override // jb.t
    boolean i() {
        return false;
    }

    @Override // java.util.Map
    public int size() {
        return this.f33021f;
    }
}
