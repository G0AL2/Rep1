package tb;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import tb.n;

/* compiled from: ComponentRuntime.java */
/* loaded from: classes3.dex */
public class n extends tb.a implements kc.a {

    /* renamed from: g */
    private static final sc.b<Set<Object>> f37282g = new sc.b() { // from class: tb.m
        @Override // sc.b
        public final Object get() {
            return Collections.emptySet();
        }
    };

    /* renamed from: a */
    private final Map<d<?>, sc.b<?>> f37283a;

    /* renamed from: b */
    private final Map<Class<?>, sc.b<?>> f37284b;

    /* renamed from: c */
    private final Map<Class<?>, x<?>> f37285c;

    /* renamed from: d */
    private final List<sc.b<i>> f37286d;

    /* renamed from: e */
    private final u f37287e;

    /* renamed from: f */
    private final AtomicReference<Boolean> f37288f;

    /* compiled from: ComponentRuntime.java */
    /* loaded from: classes3.dex */
    public static final class b {

        /* renamed from: a */
        private final Executor f37289a;

        /* renamed from: b */
        private final List<sc.b<i>> f37290b = new ArrayList();

        /* renamed from: c */
        private final List<d<?>> f37291c = new ArrayList();

        b(Executor executor) {
            this.f37289a = executor;
        }

        public static /* synthetic */ i a(i iVar) {
            return f(iVar);
        }

        public static /* synthetic */ i f(i iVar) {
            return iVar;
        }

        public b b(d<?> dVar) {
            this.f37291c.add(dVar);
            return this;
        }

        public b c(final i iVar) {
            this.f37290b.add(new sc.b() { // from class: tb.o
                @Override // sc.b
                public final Object get() {
                    return n.b.a(i.this);
                }
            });
            return this;
        }

        public b d(Collection<sc.b<i>> collection) {
            this.f37290b.addAll(collection);
            return this;
        }

        public n e() {
            return new n(this.f37289a, this.f37290b, this.f37291c);
        }
    }

    public static /* synthetic */ Object f(n nVar, d dVar) {
        return nVar.n(dVar);
    }

    public static /* synthetic */ void g(x xVar, sc.b bVar) {
        xVar.a(bVar);
    }

    public static /* synthetic */ void h(c0 c0Var, sc.b bVar) {
        c0Var.j(bVar);
    }

    public static b i(Executor executor) {
        return new b(executor);
    }

    private void j(List<d<?>> list) {
        ArrayList<Runnable> arrayList = new ArrayList();
        synchronized (this) {
            Iterator<sc.b<i>> it = this.f37286d.iterator();
            while (it.hasNext()) {
                try {
                    i iVar = it.next().get();
                    if (iVar != null) {
                        list.addAll(iVar.getComponents());
                        it.remove();
                    }
                } catch (v e10) {
                    it.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e10);
                }
            }
            if (this.f37283a.isEmpty()) {
                p.a(list);
            } else {
                ArrayList arrayList2 = new ArrayList(this.f37283a.keySet());
                arrayList2.addAll(list);
                p.a(arrayList2);
            }
            for (final d<?> dVar : list) {
                this.f37283a.put(dVar, new w(new sc.b() { // from class: tb.l
                    @Override // sc.b
                    public final Object get() {
                        return n.f(n.this, dVar);
                    }
                }));
            }
            arrayList.addAll(s(list));
            arrayList.addAll(t());
            r();
        }
        for (Runnable runnable : arrayList) {
            runnable.run();
        }
        q();
    }

    private void k(Map<d<?>, sc.b<?>> map, boolean z10) {
        for (Map.Entry<d<?>, sc.b<?>> entry : map.entrySet()) {
            d<?> key = entry.getKey();
            sc.b<?> value = entry.getValue();
            if (key.k() || (key.l() && z10)) {
                value.get();
            }
        }
        this.f37287e.e();
    }

    private static <T> List<T> m(Iterable<T> iterable) {
        ArrayList arrayList = new ArrayList();
        for (T t10 : iterable) {
            arrayList.add(t10);
        }
        return arrayList;
    }

    public /* synthetic */ Object n(d dVar) {
        return dVar.f().a(new e0(dVar, this));
    }

    private void q() {
        Boolean bool = this.f37288f.get();
        if (bool != null) {
            k(this.f37283a, bool.booleanValue());
        }
    }

    private void r() {
        for (d<?> dVar : this.f37283a.keySet()) {
            for (q qVar : dVar.e()) {
                if (qVar.g() && !this.f37285c.containsKey(qVar.c())) {
                    this.f37285c.put(qVar.c(), x.b(Collections.emptySet()));
                } else if (this.f37284b.containsKey(qVar.c())) {
                    continue;
                } else if (!qVar.f()) {
                    if (!qVar.g()) {
                        this.f37284b.put(qVar.c(), c0.e());
                    }
                } else {
                    throw new y(String.format("Unsatisfied dependency for component %s: %s", dVar, qVar.c()));
                }
            }
        }
    }

    private List<Runnable> s(List<d<?>> list) {
        ArrayList arrayList = new ArrayList();
        for (d<?> dVar : list) {
            if (dVar.m()) {
                final sc.b<?> bVar = this.f37283a.get(dVar);
                for (Class<? super Object> cls : dVar.g()) {
                    if (!this.f37284b.containsKey(cls)) {
                        this.f37284b.put(cls, bVar);
                    } else {
                        final c0 c0Var = (c0) this.f37284b.get(cls);
                        arrayList.add(new Runnable() { // from class: tb.k
                            @Override // java.lang.Runnable
                            public final void run() {
                                n.h(c0.this, bVar);
                            }
                        });
                    }
                }
            }
        }
        return arrayList;
    }

    private List<Runnable> t() {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        for (Map.Entry<d<?>, sc.b<?>> entry : this.f37283a.entrySet()) {
            d<?> key = entry.getKey();
            if (!key.m()) {
                sc.b<?> value = entry.getValue();
                for (Class<? super Object> cls : key.g()) {
                    if (!hashMap.containsKey(cls)) {
                        hashMap.put(cls, new HashSet());
                    }
                    ((Set) hashMap.get(cls)).add(value);
                }
            }
        }
        for (Map.Entry entry2 : hashMap.entrySet()) {
            if (!this.f37285c.containsKey(entry2.getKey())) {
                this.f37285c.put((Class) entry2.getKey(), x.b((Collection) entry2.getValue()));
            } else {
                final x<?> xVar = this.f37285c.get(entry2.getKey());
                for (final sc.b bVar : (Set) entry2.getValue()) {
                    arrayList.add(new Runnable() { // from class: tb.j
                        @Override // java.lang.Runnable
                        public final void run() {
                            n.g(x.this, bVar);
                        }
                    });
                }
            }
        }
        return arrayList;
    }

    @Override // tb.e
    public synchronized <T> sc.b<Set<T>> b(Class<T> cls) {
        x<?> xVar = this.f37285c.get(cls);
        if (xVar != null) {
            return xVar;
        }
        return (sc.b<Set<T>>) f37282g;
    }

    @Override // tb.e
    public synchronized <T> sc.b<T> d(Class<T> cls) {
        d0.c(cls, "Null interface requested.");
        return (sc.b<T>) this.f37284b.get(cls);
    }

    @Override // tb.e
    public <T> sc.a<T> e(Class<T> cls) {
        sc.b<T> d10 = d(cls);
        if (d10 == null) {
            return c0.e();
        }
        if (d10 instanceof c0) {
            return (c0) d10;
        }
        return c0.i(d10);
    }

    public void l(boolean z10) {
        HashMap hashMap;
        if (this.f37288f.compareAndSet(null, Boolean.valueOf(z10))) {
            synchronized (this) {
                hashMap = new HashMap(this.f37283a);
            }
            k(hashMap, z10);
        }
    }

    private n(Executor executor, Iterable<sc.b<i>> iterable, Collection<d<?>> collection) {
        this.f37283a = new HashMap();
        this.f37284b = new HashMap();
        this.f37285c = new HashMap();
        this.f37288f = new AtomicReference<>();
        u uVar = new u(executor);
        this.f37287e = uVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(d.p(uVar, u.class, pc.d.class, pc.c.class));
        arrayList.add(d.p(this, kc.a.class, new Class[0]));
        for (d<?> dVar : collection) {
            if (dVar != null) {
                arrayList.add(dVar);
            }
        }
        this.f37286d = m(iterable);
        j(arrayList);
    }
}
