package tb;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: Component.java */
/* loaded from: classes3.dex */
public final class d<T> {

    /* renamed from: a  reason: collision with root package name */
    private final Set<Class<? super T>> f37250a;

    /* renamed from: b  reason: collision with root package name */
    private final Set<q> f37251b;

    /* renamed from: c  reason: collision with root package name */
    private final int f37252c;

    /* renamed from: d  reason: collision with root package name */
    private final int f37253d;

    /* renamed from: e  reason: collision with root package name */
    private final h<T> f37254e;

    /* renamed from: f  reason: collision with root package name */
    private final Set<Class<?>> f37255f;

    /* compiled from: Component.java */
    /* loaded from: classes3.dex */
    public static class b<T> {

        /* renamed from: a  reason: collision with root package name */
        private final Set<Class<? super T>> f37256a;

        /* renamed from: b  reason: collision with root package name */
        private final Set<q> f37257b;

        /* renamed from: c  reason: collision with root package name */
        private int f37258c;

        /* renamed from: d  reason: collision with root package name */
        private int f37259d;

        /* renamed from: e  reason: collision with root package name */
        private h<T> f37260e;

        /* renamed from: f  reason: collision with root package name */
        private Set<Class<?>> f37261f;

        /* JADX INFO: Access modifiers changed from: private */
        public b<T> g() {
            this.f37259d = 1;
            return this;
        }

        private b<T> h(int i10) {
            d0.d(this.f37258c == 0, "Instantiation type has already been set.");
            this.f37258c = i10;
            return this;
        }

        private void i(Class<?> cls) {
            d0.a(!this.f37256a.contains(cls), "Components are not allowed to depend on interfaces they themselves provide.");
        }

        public b<T> b(q qVar) {
            d0.c(qVar, "Null dependency");
            i(qVar.c());
            this.f37257b.add(qVar);
            return this;
        }

        public b<T> c() {
            return h(1);
        }

        public d<T> d() {
            d0.d(this.f37260e != null, "Missing required property: factory.");
            return new d<>(new HashSet(this.f37256a), new HashSet(this.f37257b), this.f37258c, this.f37259d, this.f37260e, this.f37261f);
        }

        public b<T> e() {
            return h(2);
        }

        public b<T> f(h<T> hVar) {
            this.f37260e = (h) d0.c(hVar, "Null factory");
            return this;
        }

        @SafeVarargs
        private b(Class<T> cls, Class<? super T>... clsArr) {
            HashSet hashSet = new HashSet();
            this.f37256a = hashSet;
            this.f37257b = new HashSet();
            this.f37258c = 0;
            this.f37259d = 0;
            this.f37261f = new HashSet();
            d0.c(cls, "Null interface");
            hashSet.add(cls);
            for (Class<? super T> cls2 : clsArr) {
                d0.c(cls2, "Null interface");
            }
            Collections.addAll(this.f37256a, clsArr);
        }
    }

    public static <T> b<T> c(Class<T> cls) {
        return new b<>(cls, new Class[0]);
    }

    @SafeVarargs
    public static <T> b<T> d(Class<T> cls, Class<? super T>... clsArr) {
        return new b<>(cls, clsArr);
    }

    public static <T> d<T> i(final T t10, Class<T> cls) {
        return j(cls).f(new h() { // from class: tb.b
            @Override // tb.h
            public final Object a(e eVar) {
                Object n10;
                n10 = d.n(t10, eVar);
                return n10;
            }
        }).d();
    }

    public static <T> b<T> j(Class<T> cls) {
        return c(cls).g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object n(Object obj, e eVar) {
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object o(Object obj, e eVar) {
        return obj;
    }

    @SafeVarargs
    public static <T> d<T> p(final T t10, Class<T> cls, Class<? super T>... clsArr) {
        return d(cls, clsArr).f(new h() { // from class: tb.c
            @Override // tb.h
            public final Object a(e eVar) {
                Object o10;
                o10 = d.o(t10, eVar);
                return o10;
            }
        }).d();
    }

    public Set<q> e() {
        return this.f37251b;
    }

    public h<T> f() {
        return this.f37254e;
    }

    public Set<Class<? super T>> g() {
        return this.f37250a;
    }

    public Set<Class<?>> h() {
        return this.f37255f;
    }

    public boolean k() {
        return this.f37252c == 1;
    }

    public boolean l() {
        return this.f37252c == 2;
    }

    public boolean m() {
        return this.f37253d == 0;
    }

    public String toString() {
        return "Component<" + Arrays.toString(this.f37250a.toArray()) + ">{" + this.f37252c + ", type=" + this.f37253d + ", deps=" + Arrays.toString(this.f37251b.toArray()) + "}";
    }

    private d(Set<Class<? super T>> set, Set<q> set2, int i10, int i11, h<T> hVar, Set<Class<?>> set3) {
        this.f37250a = Collections.unmodifiableSet(set);
        this.f37251b = Collections.unmodifiableSet(set2);
        this.f37252c = i10;
        this.f37253d = i11;
        this.f37254e = hVar;
        this.f37255f = Collections.unmodifiableSet(set3);
    }
}
