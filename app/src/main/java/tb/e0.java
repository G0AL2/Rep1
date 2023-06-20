package tb;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: RestrictedComponentContainer.java */
/* loaded from: classes3.dex */
final class e0 extends tb.a {

    /* renamed from: a  reason: collision with root package name */
    private final Set<Class<?>> f37262a;

    /* renamed from: b  reason: collision with root package name */
    private final Set<Class<?>> f37263b;

    /* renamed from: c  reason: collision with root package name */
    private final Set<Class<?>> f37264c;

    /* renamed from: d  reason: collision with root package name */
    private final Set<Class<?>> f37265d;

    /* renamed from: e  reason: collision with root package name */
    private final Set<Class<?>> f37266e;

    /* renamed from: f  reason: collision with root package name */
    private final Set<Class<?>> f37267f;

    /* renamed from: g  reason: collision with root package name */
    private final e f37268g;

    /* compiled from: RestrictedComponentContainer.java */
    /* loaded from: classes3.dex */
    private static class a implements pc.c {

        /* renamed from: a  reason: collision with root package name */
        private final Set<Class<?>> f37269a;

        /* renamed from: b  reason: collision with root package name */
        private final pc.c f37270b;

        public a(Set<Class<?>> set, pc.c cVar) {
            this.f37269a = set;
            this.f37270b = cVar;
        }

        @Override // pc.c
        public void b(pc.a<?> aVar) {
            if (this.f37269a.contains(aVar.b())) {
                this.f37270b.b(aVar);
                return;
            }
            throw new s(String.format("Attempting to publish an undeclared event %s.", aVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e0(d<?> dVar, e eVar) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (q qVar : dVar.e()) {
            if (qVar.e()) {
                if (qVar.g()) {
                    hashSet4.add(qVar.c());
                } else {
                    hashSet.add(qVar.c());
                }
            } else if (qVar.d()) {
                hashSet3.add(qVar.c());
            } else if (qVar.g()) {
                hashSet5.add(qVar.c());
            } else {
                hashSet2.add(qVar.c());
            }
        }
        if (!dVar.h().isEmpty()) {
            hashSet.add(pc.c.class);
        }
        this.f37262a = Collections.unmodifiableSet(hashSet);
        this.f37263b = Collections.unmodifiableSet(hashSet2);
        this.f37264c = Collections.unmodifiableSet(hashSet3);
        this.f37265d = Collections.unmodifiableSet(hashSet4);
        this.f37266e = Collections.unmodifiableSet(hashSet5);
        this.f37267f = dVar.h();
        this.f37268g = eVar;
    }

    @Override // tb.a, tb.e
    public <T> T a(Class<T> cls) {
        if (this.f37262a.contains(cls)) {
            T t10 = (T) this.f37268g.a(cls);
            return !cls.equals(pc.c.class) ? t10 : (T) new a(this.f37267f, (pc.c) t10);
        }
        throw new s(String.format("Attempting to request an undeclared dependency %s.", cls));
    }

    @Override // tb.e
    public <T> sc.b<Set<T>> b(Class<T> cls) {
        if (this.f37266e.contains(cls)) {
            return this.f37268g.b(cls);
        }
        throw new s(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", cls));
    }

    @Override // tb.a, tb.e
    public <T> Set<T> c(Class<T> cls) {
        if (this.f37265d.contains(cls)) {
            return this.f37268g.c(cls);
        }
        throw new s(String.format("Attempting to request an undeclared dependency Set<%s>.", cls));
    }

    @Override // tb.e
    public <T> sc.b<T> d(Class<T> cls) {
        if (this.f37263b.contains(cls)) {
            return this.f37268g.d(cls);
        }
        throw new s(String.format("Attempting to request an undeclared dependency Provider<%s>.", cls));
    }

    @Override // tb.e
    public <T> sc.a<T> e(Class<T> cls) {
        if (this.f37264c.contains(cls)) {
            return this.f37268g.e(cls);
        }
        throw new s(String.format("Attempting to request an undeclared dependency Deferred<%s>.", cls));
    }
}
