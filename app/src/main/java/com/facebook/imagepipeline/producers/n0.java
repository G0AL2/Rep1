package com.facebook.imagepipeline.producers;

import android.graphics.Bitmap;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PostprocessorProducer.java */
/* loaded from: classes.dex */
public class n0 implements o0<c4.a<w5.c>> {

    /* renamed from: a  reason: collision with root package name */
    private final o0<c4.a<w5.c>> f15066a;

    /* renamed from: b  reason: collision with root package name */
    private final o5.f f15067b;

    /* renamed from: c  reason: collision with root package name */
    private final Executor f15068c;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: PostprocessorProducer.java */
    /* loaded from: classes.dex */
    public class b extends p<c4.a<w5.c>, c4.a<w5.c>> {

        /* renamed from: c  reason: collision with root package name */
        private final r0 f15069c;

        /* renamed from: d  reason: collision with root package name */
        private final p0 f15070d;

        /* renamed from: e  reason: collision with root package name */
        private final b6.d f15071e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f15072f;

        /* renamed from: g  reason: collision with root package name */
        private c4.a<w5.c> f15073g;

        /* renamed from: h  reason: collision with root package name */
        private int f15074h;

        /* renamed from: i  reason: collision with root package name */
        private boolean f15075i;

        /* renamed from: j  reason: collision with root package name */
        private boolean f15076j;

        /* compiled from: PostprocessorProducer.java */
        /* loaded from: classes.dex */
        class a extends e {
            a(n0 n0Var) {
            }

            @Override // com.facebook.imagepipeline.producers.q0
            public void b() {
                b.this.C();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: PostprocessorProducer.java */
        /* renamed from: com.facebook.imagepipeline.producers.n0$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class RunnableC0200b implements Runnable {
            RunnableC0200b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                c4.a aVar;
                int i10;
                synchronized (b.this) {
                    aVar = b.this.f15073g;
                    i10 = b.this.f15074h;
                    b.this.f15073g = null;
                    b.this.f15075i = false;
                }
                if (c4.a.C(aVar)) {
                    try {
                        b.this.z(aVar, i10);
                    } finally {
                        c4.a.w(aVar);
                    }
                }
                b.this.x();
            }
        }

        public b(l<c4.a<w5.c>> lVar, r0 r0Var, b6.d dVar, p0 p0Var) {
            super(lVar);
            this.f15073g = null;
            this.f15074h = 0;
            this.f15075i = false;
            this.f15076j = false;
            this.f15069c = r0Var;
            this.f15071e = dVar;
            this.f15070d = p0Var;
            p0Var.c(new a(n0.this));
        }

        private Map<String, String> A(r0 r0Var, p0 p0Var, b6.d dVar) {
            if (r0Var.f(p0Var, "PostprocessorProducer")) {
                return y3.g.of("Postprocessor", dVar.getName());
            }
            return null;
        }

        private synchronized boolean B() {
            return this.f15072f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void C() {
            if (y()) {
                p().a();
            }
        }

        private void D(Throwable th) {
            if (y()) {
                p().b(th);
            }
        }

        private void E(c4.a<w5.c> aVar, int i10) {
            boolean e10 = com.facebook.imagepipeline.producers.b.e(i10);
            if ((e10 || B()) && !(e10 && y())) {
                return;
            }
            p().c(aVar, i10);
        }

        private c4.a<w5.c> G(w5.c cVar) {
            w5.d dVar = (w5.d) cVar;
            c4.a<Bitmap> a10 = this.f15071e.a(dVar.l(), n0.this.f15067b);
            try {
                w5.d dVar2 = new w5.d(a10, cVar.a(), dVar.C(), dVar.A());
                dVar2.h(dVar.getExtras());
                return c4.a.L(dVar2);
            } finally {
                c4.a.w(a10);
            }
        }

        private synchronized boolean H() {
            if (this.f15072f || !this.f15075i || this.f15076j || !c4.a.C(this.f15073g)) {
                return false;
            }
            this.f15076j = true;
            return true;
        }

        private boolean I(w5.c cVar) {
            return cVar instanceof w5.d;
        }

        private void J() {
            n0.this.f15068c.execute(new RunnableC0200b());
        }

        private void K(c4.a<w5.c> aVar, int i10) {
            synchronized (this) {
                if (this.f15072f) {
                    return;
                }
                c4.a<w5.c> aVar2 = this.f15073g;
                this.f15073g = c4.a.q(aVar);
                this.f15074h = i10;
                this.f15075i = true;
                boolean H = H();
                c4.a.w(aVar2);
                if (H) {
                    J();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void x() {
            boolean H;
            synchronized (this) {
                this.f15076j = false;
                H = H();
            }
            if (H) {
                J();
            }
        }

        private boolean y() {
            synchronized (this) {
                if (this.f15072f) {
                    return false;
                }
                c4.a<w5.c> aVar = this.f15073g;
                this.f15073g = null;
                this.f15072f = true;
                c4.a.w(aVar);
                return true;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void z(c4.a<w5.c> aVar, int i10) {
            y3.k.b(Boolean.valueOf(c4.a.C(aVar)));
            if (!I(aVar.y())) {
                E(aVar, i10);
                return;
            }
            this.f15069c.d(this.f15070d, "PostprocessorProducer");
            try {
                try {
                    c4.a<w5.c> G = G(aVar.y());
                    r0 r0Var = this.f15069c;
                    p0 p0Var = this.f15070d;
                    r0Var.j(p0Var, "PostprocessorProducer", A(r0Var, p0Var, this.f15071e));
                    E(G, i10);
                    c4.a.w(G);
                } catch (Exception e10) {
                    r0 r0Var2 = this.f15069c;
                    p0 p0Var2 = this.f15070d;
                    r0Var2.k(p0Var2, "PostprocessorProducer", e10, A(r0Var2, p0Var2, this.f15071e));
                    D(e10);
                    c4.a.w(null);
                }
            } catch (Throwable th) {
                c4.a.w(null);
                throw th;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.b
        /* renamed from: F */
        public void i(c4.a<w5.c> aVar, int i10) {
            if (!c4.a.C(aVar)) {
                if (com.facebook.imagepipeline.producers.b.e(i10)) {
                    E(null, i10);
                    return;
                }
                return;
            }
            K(aVar, i10);
        }

        @Override // com.facebook.imagepipeline.producers.p, com.facebook.imagepipeline.producers.b
        protected void g() {
            C();
        }

        @Override // com.facebook.imagepipeline.producers.p, com.facebook.imagepipeline.producers.b
        protected void h(Throwable th) {
            D(th);
        }
    }

    /* compiled from: PostprocessorProducer.java */
    /* loaded from: classes.dex */
    class c extends p<c4.a<w5.c>, c4.a<w5.c>> implements b6.f {

        /* renamed from: c  reason: collision with root package name */
        private boolean f15080c;

        /* renamed from: d  reason: collision with root package name */
        private c4.a<w5.c> f15081d;

        /* compiled from: PostprocessorProducer.java */
        /* loaded from: classes.dex */
        class a extends e {
            a(n0 n0Var) {
            }

            @Override // com.facebook.imagepipeline.producers.q0
            public void b() {
                if (c.this.r()) {
                    c.this.p().a();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean r() {
            synchronized (this) {
                if (this.f15080c) {
                    return false;
                }
                c4.a<w5.c> aVar = this.f15081d;
                this.f15081d = null;
                this.f15080c = true;
                c4.a.w(aVar);
                return true;
            }
        }

        private void t(c4.a<w5.c> aVar) {
            synchronized (this) {
                if (this.f15080c) {
                    return;
                }
                c4.a<w5.c> aVar2 = this.f15081d;
                this.f15081d = c4.a.q(aVar);
                c4.a.w(aVar2);
            }
        }

        private void u() {
            synchronized (this) {
                if (this.f15080c) {
                    return;
                }
                c4.a<w5.c> q10 = c4.a.q(this.f15081d);
                try {
                    p().c(q10, 0);
                } finally {
                    c4.a.w(q10);
                }
            }
        }

        @Override // com.facebook.imagepipeline.producers.p, com.facebook.imagepipeline.producers.b
        protected void g() {
            if (r()) {
                p().a();
            }
        }

        @Override // com.facebook.imagepipeline.producers.p, com.facebook.imagepipeline.producers.b
        protected void h(Throwable th) {
            if (r()) {
                p().b(th);
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.b
        /* renamed from: s */
        public void i(c4.a<w5.c> aVar, int i10) {
            if (com.facebook.imagepipeline.producers.b.f(i10)) {
                return;
            }
            t(aVar);
            u();
        }

        private c(n0 n0Var, b bVar, b6.e eVar, p0 p0Var) {
            super(bVar);
            this.f15080c = false;
            this.f15081d = null;
            eVar.c(this);
            p0Var.c(new a(n0Var));
        }
    }

    /* compiled from: PostprocessorProducer.java */
    /* loaded from: classes.dex */
    class d extends p<c4.a<w5.c>, c4.a<w5.c>> {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.b
        /* renamed from: q */
        public void i(c4.a<w5.c> aVar, int i10) {
            if (com.facebook.imagepipeline.producers.b.f(i10)) {
                return;
            }
            p().c(aVar, i10);
        }

        private d(n0 n0Var, b bVar) {
            super(bVar);
        }
    }

    public n0(o0<c4.a<w5.c>> o0Var, o5.f fVar, Executor executor) {
        this.f15066a = (o0) y3.k.g(o0Var);
        this.f15067b = fVar;
        this.f15068c = (Executor) y3.k.g(executor);
    }

    @Override // com.facebook.imagepipeline.producers.o0
    public void b(l<c4.a<w5.c>> lVar, p0 p0Var) {
        l<c4.a<w5.c>> dVar;
        r0 h10 = p0Var.h();
        b6.d g10 = p0Var.k().g();
        b bVar = new b(lVar, h10, g10, p0Var);
        if (g10 instanceof b6.e) {
            dVar = new c(bVar, (b6.e) g10, p0Var);
        } else {
            dVar = new d(bVar);
        }
        this.f15066a.b(dVar, p0Var);
    }
}
