package com.facebook.imagepipeline.producers;

import android.util.Pair;
import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: MultiplexProducer.java */
/* loaded from: classes.dex */
public abstract class i0<K, T extends Closeable> implements o0<T> {

    /* renamed from: a  reason: collision with root package name */
    final Map<K, i0<K, T>.b> f14978a;

    /* renamed from: b  reason: collision with root package name */
    private final o0<T> f14979b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f14980c;

    /* renamed from: d  reason: collision with root package name */
    private final String f14981d;

    /* renamed from: e  reason: collision with root package name */
    private final String f14982e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MultiplexProducer.java */
    /* loaded from: classes.dex */
    public class b {

        /* renamed from: a  reason: collision with root package name */
        private final K f14983a;

        /* renamed from: b  reason: collision with root package name */
        private final CopyOnWriteArraySet<Pair<l<T>, p0>> f14984b = y3.m.a();

        /* renamed from: c  reason: collision with root package name */
        private T f14985c;

        /* renamed from: d  reason: collision with root package name */
        private float f14986d;

        /* renamed from: e  reason: collision with root package name */
        private int f14987e;

        /* renamed from: f  reason: collision with root package name */
        private d f14988f;

        /* renamed from: g  reason: collision with root package name */
        private i0<K, T>.b.C0199b f14989g;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: MultiplexProducer.java */
        /* loaded from: classes.dex */
        public class a extends e {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Pair f14991a;

            a(Pair pair) {
                this.f14991a = pair;
            }

            @Override // com.facebook.imagepipeline.producers.e, com.facebook.imagepipeline.producers.q0
            public void a() {
                d.r(b.this.r());
            }

            @Override // com.facebook.imagepipeline.producers.q0
            public void b() {
                boolean remove;
                List list;
                d dVar;
                List list2;
                List list3;
                synchronized (b.this) {
                    remove = b.this.f14984b.remove(this.f14991a);
                    list = null;
                    if (!remove) {
                        dVar = null;
                        list2 = null;
                    } else if (b.this.f14984b.isEmpty()) {
                        dVar = b.this.f14988f;
                        list2 = null;
                    } else {
                        List s10 = b.this.s();
                        list2 = b.this.t();
                        list3 = b.this.r();
                        dVar = null;
                        list = s10;
                    }
                    list3 = list2;
                }
                d.s(list);
                d.t(list2);
                d.r(list3);
                if (dVar != null) {
                    if (i0.this.f14980c && !dVar.m()) {
                        d.t(dVar.y(q5.d.LOW));
                    } else {
                        dVar.u();
                    }
                }
                if (remove) {
                    ((l) this.f14991a.first).a();
                }
            }

            @Override // com.facebook.imagepipeline.producers.e, com.facebook.imagepipeline.producers.q0
            public void c() {
                d.t(b.this.t());
            }

            @Override // com.facebook.imagepipeline.producers.e, com.facebook.imagepipeline.producers.q0
            public void d() {
                d.s(b.this.s());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: MultiplexProducer.java */
        /* renamed from: com.facebook.imagepipeline.producers.i0$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0199b extends com.facebook.imagepipeline.producers.b<T> {
            private C0199b() {
            }

            @Override // com.facebook.imagepipeline.producers.b
            protected void g() {
                try {
                    if (c6.b.d()) {
                        c6.b.a("MultiplexProducer#onCancellation");
                    }
                    b.this.m(this);
                } finally {
                    if (c6.b.d()) {
                        c6.b.b();
                    }
                }
            }

            @Override // com.facebook.imagepipeline.producers.b
            protected void h(Throwable th) {
                try {
                    if (c6.b.d()) {
                        c6.b.a("MultiplexProducer#onFailure");
                    }
                    b.this.n(this, th);
                } finally {
                    if (c6.b.d()) {
                        c6.b.b();
                    }
                }
            }

            @Override // com.facebook.imagepipeline.producers.b
            protected void j(float f10) {
                try {
                    if (c6.b.d()) {
                        c6.b.a("MultiplexProducer#onProgressUpdate");
                    }
                    b.this.p(this, f10);
                } finally {
                    if (c6.b.d()) {
                        c6.b.b();
                    }
                }
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.facebook.imagepipeline.producers.b
            /* renamed from: p */
            public void i(T t10, int i10) {
                try {
                    if (c6.b.d()) {
                        c6.b.a("MultiplexProducer#onNewResult");
                    }
                    b.this.o(this, t10, i10);
                } finally {
                    if (c6.b.d()) {
                        c6.b.b();
                    }
                }
            }
        }

        public b(K k10) {
            this.f14983a = k10;
        }

        private void g(Pair<l<T>, p0> pair, p0 p0Var) {
            p0Var.c(new a(pair));
        }

        private void i(Closeable closeable) {
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (IOException e10) {
                    throw new RuntimeException(e10);
                }
            }
        }

        private synchronized boolean j() {
            Iterator<Pair<l<T>, p0>> it = this.f14984b.iterator();
            while (it.hasNext()) {
                if (((p0) it.next().second).i()) {
                    return true;
                }
            }
            return false;
        }

        private synchronized boolean k() {
            Iterator<Pair<l<T>, p0>> it = this.f14984b.iterator();
            while (it.hasNext()) {
                if (!((p0) it.next().second).m()) {
                    return false;
                }
            }
            return true;
        }

        private synchronized q5.d l() {
            q5.d dVar;
            dVar = q5.d.LOW;
            Iterator<Pair<l<T>, p0>> it = this.f14984b.iterator();
            while (it.hasNext()) {
                dVar = q5.d.a(dVar, ((p0) it.next().second).j());
            }
            return dVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void q(g4.e eVar) {
            synchronized (this) {
                boolean z10 = true;
                y3.k.b(Boolean.valueOf(this.f14988f == null));
                if (this.f14989g != null) {
                    z10 = false;
                }
                y3.k.b(Boolean.valueOf(z10));
                if (this.f14984b.isEmpty()) {
                    i0.this.k(this.f14983a, this);
                    return;
                }
                p0 p0Var = (p0) this.f14984b.iterator().next().second;
                d dVar = new d(p0Var.k(), p0Var.getId(), p0Var.h(), p0Var.a(), p0Var.o(), k(), j(), l(), p0Var.d());
                this.f14988f = dVar;
                dVar.l(p0Var.getExtras());
                if (eVar.g()) {
                    this.f14988f.b("started_as_prefetch", Boolean.valueOf(eVar.f()));
                }
                i0<K, T>.b.C0199b c0199b = new C0199b();
                this.f14989g = c0199b;
                i0.this.f14979b.b(c0199b, this.f14988f);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public synchronized List<q0> r() {
            d dVar = this.f14988f;
            if (dVar == null) {
                return null;
            }
            return dVar.w(j());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public synchronized List<q0> s() {
            d dVar = this.f14988f;
            if (dVar == null) {
                return null;
            }
            return dVar.x(k());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public synchronized List<q0> t() {
            d dVar = this.f14988f;
            if (dVar == null) {
                return null;
            }
            return dVar.y(l());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public boolean h(l<T> lVar, p0 p0Var) {
            Pair<l<T>, p0> create = Pair.create(lVar, p0Var);
            synchronized (this) {
                if (i0.this.i(this.f14983a) != this) {
                    return false;
                }
                this.f14984b.add(create);
                List<q0> s10 = s();
                List<q0> t10 = t();
                List<q0> r10 = r();
                Closeable closeable = this.f14985c;
                float f10 = this.f14986d;
                int i10 = this.f14987e;
                d.s(s10);
                d.t(t10);
                d.r(r10);
                synchronized (create) {
                    synchronized (this) {
                        if (closeable != this.f14985c) {
                            closeable = null;
                        } else if (closeable != null) {
                            closeable = i0.this.g(closeable);
                        }
                    }
                    if (closeable != null) {
                        if (f10 > 0.0f) {
                            lVar.d(f10);
                        }
                        lVar.c(closeable, i10);
                        i(closeable);
                    }
                }
                g(create, p0Var);
                return true;
            }
        }

        public void m(i0<K, T>.b.C0199b c0199b) {
            synchronized (this) {
                if (this.f14989g != c0199b) {
                    return;
                }
                this.f14989g = null;
                this.f14988f = null;
                i(this.f14985c);
                this.f14985c = null;
                q(g4.e.UNSET);
            }
        }

        public void n(i0<K, T>.b.C0199b c0199b, Throwable th) {
            synchronized (this) {
                if (this.f14989g != c0199b) {
                    return;
                }
                Iterator<Pair<l<T>, p0>> it = this.f14984b.iterator();
                this.f14984b.clear();
                i0.this.k(this.f14983a, this);
                i(this.f14985c);
                this.f14985c = null;
                while (it.hasNext()) {
                    Pair<l<T>, p0> next = it.next();
                    synchronized (next) {
                        ((p0) next.second).h().k((p0) next.second, i0.this.f14981d, th, null);
                        ((l) next.first).b(th);
                    }
                }
            }
        }

        public void o(i0<K, T>.b.C0199b c0199b, T t10, int i10) {
            synchronized (this) {
                if (this.f14989g != c0199b) {
                    return;
                }
                i(this.f14985c);
                this.f14985c = null;
                Iterator<Pair<l<T>, p0>> it = this.f14984b.iterator();
                int size = this.f14984b.size();
                if (com.facebook.imagepipeline.producers.b.f(i10)) {
                    this.f14985c = (T) i0.this.g(t10);
                    this.f14987e = i10;
                } else {
                    this.f14984b.clear();
                    i0.this.k(this.f14983a, this);
                }
                while (it.hasNext()) {
                    Pair<l<T>, p0> next = it.next();
                    synchronized (next) {
                        if (com.facebook.imagepipeline.producers.b.e(i10)) {
                            ((p0) next.second).h().j((p0) next.second, i0.this.f14981d, null);
                            d dVar = this.f14988f;
                            if (dVar != null) {
                                ((p0) next.second).l(dVar.getExtras());
                            }
                            ((p0) next.second).b(i0.this.f14982e, Integer.valueOf(size));
                        }
                        ((l) next.first).c(t10, i10);
                    }
                }
            }
        }

        public void p(i0<K, T>.b.C0199b c0199b, float f10) {
            synchronized (this) {
                if (this.f14989g != c0199b) {
                    return;
                }
                this.f14986d = f10;
                Iterator<Pair<l<T>, p0>> it = this.f14984b.iterator();
                while (it.hasNext()) {
                    Pair<l<T>, p0> next = it.next();
                    synchronized (next) {
                        ((l) next.first).d(f10);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public i0(o0<T> o0Var, String str, String str2) {
        this(o0Var, str, str2, false);
    }

    private synchronized i0<K, T>.b h(K k10) {
        i0<K, T>.b bVar;
        bVar = new b(k10);
        this.f14978a.put(k10, bVar);
        return bVar;
    }

    @Override // com.facebook.imagepipeline.producers.o0
    public void b(l<T> lVar, p0 p0Var) {
        boolean z10;
        i0<K, T>.b i10;
        try {
            if (c6.b.d()) {
                c6.b.a("MultiplexProducer#produceResults");
            }
            p0Var.h().d(p0Var, this.f14981d);
            K j10 = j(p0Var);
            do {
                z10 = false;
                synchronized (this) {
                    i10 = i(j10);
                    if (i10 == null) {
                        i10 = h(j10);
                        z10 = true;
                    }
                }
            } while (!i10.h(lVar, p0Var));
            if (z10) {
                i10.q(g4.e.h(p0Var.m()));
            }
        } finally {
            if (c6.b.d()) {
                c6.b.b();
            }
        }
    }

    protected abstract T g(T t10);

    protected synchronized i0<K, T>.b i(K k10) {
        return this.f14978a.get(k10);
    }

    protected abstract K j(p0 p0Var);

    protected synchronized void k(K k10, i0<K, T>.b bVar) {
        if (this.f14978a.get(k10) == bVar) {
            this.f14978a.remove(k10);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public i0(o0<T> o0Var, String str, String str2, boolean z10) {
        this.f14979b = o0Var;
        this.f14978a = new HashMap();
        this.f14980c = z10;
        this.f14981d = str;
        this.f14982e = str2;
    }
}
