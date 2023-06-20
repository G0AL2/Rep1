package p5;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: BufferedDiskCache.java */
/* loaded from: classes.dex */
public class e {

    /* renamed from: h  reason: collision with root package name */
    private static final Class<?> f35523h = e.class;

    /* renamed from: a  reason: collision with root package name */
    private final u3.i f35524a;

    /* renamed from: b  reason: collision with root package name */
    private final b4.h f35525b;

    /* renamed from: c  reason: collision with root package name */
    private final b4.k f35526c;

    /* renamed from: d  reason: collision with root package name */
    private final Executor f35527d;

    /* renamed from: e  reason: collision with root package name */
    private final Executor f35528e;

    /* renamed from: f  reason: collision with root package name */
    private final x f35529f = x.d();

    /* renamed from: g  reason: collision with root package name */
    private final o f35530g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BufferedDiskCache.java */
    /* loaded from: classes.dex */
    public class a implements Callable<w5.e> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Object f35531a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AtomicBoolean f35532b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ t3.d f35533c;

        a(Object obj, AtomicBoolean atomicBoolean, t3.d dVar) {
            this.f35531a = obj;
            this.f35532b = atomicBoolean;
            this.f35533c = dVar;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public w5.e call() throws Exception {
            Object e10 = x5.a.e(this.f35531a, null);
            try {
                if (!this.f35532b.get()) {
                    w5.e c10 = e.this.f35529f.c(this.f35533c);
                    if (c10 != null) {
                        z3.a.w(e.f35523h, "Found image for %s in staging area", this.f35533c.a());
                        e.this.f35530g.l(this.f35533c);
                    } else {
                        z3.a.w(e.f35523h, "Did not find image for %s in staging area", this.f35533c.a());
                        e.this.f35530g.g(this.f35533c);
                        try {
                            b4.g q10 = e.this.q(this.f35533c);
                            if (q10 == null) {
                                return null;
                            }
                            c4.a L = c4.a.L(q10);
                            try {
                                c10 = new w5.e(L);
                            } finally {
                                c4.a.w(L);
                            }
                        } catch (Exception unused) {
                            return null;
                        }
                    }
                    if (Thread.interrupted()) {
                        z3.a.v(e.f35523h, "Host thread was interrupted, decreasing reference count");
                        c10.close();
                        throw new InterruptedException();
                    }
                    return c10;
                }
                throw new CancellationException();
            } catch (Throwable th) {
                try {
                    x5.a.c(this.f35531a, th);
                    throw th;
                } finally {
                    x5.a.f(e10);
                }
            }
        }
    }

    /* compiled from: BufferedDiskCache.java */
    /* loaded from: classes.dex */
    class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Object f35535a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ t3.d f35536b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ w5.e f35537c;

        b(Object obj, t3.d dVar, w5.e eVar) {
            this.f35535a = obj;
            this.f35536b = dVar;
            this.f35537c = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            Object e10 = x5.a.e(this.f35535a, null);
            try {
                e.this.s(this.f35536b, this.f35537c);
            } finally {
            }
        }
    }

    /* compiled from: BufferedDiskCache.java */
    /* loaded from: classes.dex */
    class c implements Callable<Void> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Object f35539a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ t3.d f35540b;

        c(Object obj, t3.d dVar) {
            this.f35539a = obj;
            this.f35540b = dVar;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() throws Exception {
            Object e10 = x5.a.e(this.f35539a, null);
            try {
                e.this.f35529f.g(this.f35540b);
                e.this.f35524a.e(this.f35540b);
                return null;
            } finally {
            }
        }
    }

    /* compiled from: BufferedDiskCache.java */
    /* loaded from: classes.dex */
    class d implements Callable<Void> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Object f35542a;

        d(Object obj) {
            this.f35542a = obj;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() throws Exception {
            Object e10 = x5.a.e(this.f35542a, null);
            try {
                e.this.f35529f.a();
                e.this.f35524a.clearAll();
                return null;
            } finally {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BufferedDiskCache.java */
    /* renamed from: p5.e$e  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0475e implements t3.j {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ w5.e f35544a;

        C0475e(w5.e eVar) {
            this.f35544a = eVar;
        }

        @Override // t3.j
        public void a(OutputStream outputStream) throws IOException {
            InputStream C = this.f35544a.C();
            y3.k.g(C);
            e.this.f35526c.a(C, outputStream);
        }
    }

    public e(u3.i iVar, b4.h hVar, b4.k kVar, Executor executor, Executor executor2, o oVar) {
        this.f35524a = iVar;
        this.f35525b = hVar;
        this.f35526c = kVar;
        this.f35527d = executor;
        this.f35528e = executor2;
        this.f35530g = oVar;
    }

    private boolean i(t3.d dVar) {
        w5.e c10 = this.f35529f.c(dVar);
        if (c10 != null) {
            c10.close();
            z3.a.w(f35523h, "Found image for %s in staging area", dVar.a());
            this.f35530g.l(dVar);
            return true;
        }
        z3.a.w(f35523h, "Did not find image for %s in staging area", dVar.a());
        this.f35530g.g(dVar);
        try {
            return this.f35524a.b(dVar);
        } catch (Exception unused) {
            return false;
        }
    }

    private s1.f<w5.e> m(t3.d dVar, w5.e eVar) {
        z3.a.w(f35523h, "Found image for %s in staging area", dVar.a());
        this.f35530g.l(dVar);
        return s1.f.h(eVar);
    }

    private s1.f<w5.e> o(t3.d dVar, AtomicBoolean atomicBoolean) {
        try {
            return s1.f.b(new a(x5.a.d("BufferedDiskCache_getAsync"), atomicBoolean, dVar), this.f35527d);
        } catch (Exception e10) {
            z3.a.F(f35523h, e10, "Failed to schedule disk-cache read for %s", dVar.a());
            return s1.f.g(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public b4.g q(t3.d dVar) throws IOException {
        try {
            Class<?> cls = f35523h;
            z3.a.w(cls, "Disk cache read for %s", dVar.a());
            com.facebook.binaryresource.a d10 = this.f35524a.d(dVar);
            if (d10 == null) {
                z3.a.w(cls, "Disk cache miss for %s", dVar.a());
                this.f35530g.a(dVar);
                return null;
            }
            z3.a.w(cls, "Found entry in disk cache for %s", dVar.a());
            this.f35530g.n(dVar);
            InputStream a10 = d10.a();
            b4.g b10 = this.f35525b.b(a10, (int) d10.size());
            a10.close();
            z3.a.w(cls, "Successful read from disk cache for %s", dVar.a());
            return b10;
        } catch (IOException e10) {
            z3.a.F(f35523h, e10, "Exception reading from cache for %s", dVar.a());
            this.f35530g.m(dVar);
            throw e10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s(t3.d dVar, w5.e eVar) {
        Class<?> cls = f35523h;
        z3.a.w(cls, "About to write to disk-cache for key %s", dVar.a());
        try {
            this.f35524a.a(dVar, new C0475e(eVar));
            this.f35530g.j(dVar);
            z3.a.w(cls, "Successful disk-cache write for key %s", dVar.a());
        } catch (IOException e10) {
            z3.a.F(f35523h, e10, "Failed to write to disk-cache for key %s", dVar.a());
        }
    }

    public void h(t3.d dVar) {
        y3.k.g(dVar);
        this.f35524a.c(dVar);
    }

    public s1.f<Void> j() {
        this.f35529f.a();
        try {
            return s1.f.b(new d(x5.a.d("BufferedDiskCache_clearAll")), this.f35528e);
        } catch (Exception e10) {
            z3.a.F(f35523h, e10, "Failed to schedule disk-cache clear", new Object[0]);
            return s1.f.g(e10);
        }
    }

    public boolean k(t3.d dVar) {
        return this.f35529f.b(dVar) || this.f35524a.f(dVar);
    }

    public boolean l(t3.d dVar) {
        if (k(dVar)) {
            return true;
        }
        return i(dVar);
    }

    public s1.f<w5.e> n(t3.d dVar, AtomicBoolean atomicBoolean) {
        try {
            if (c6.b.d()) {
                c6.b.a("BufferedDiskCache#get");
            }
            w5.e c10 = this.f35529f.c(dVar);
            if (c10 != null) {
                return m(dVar, c10);
            }
            s1.f<w5.e> o10 = o(dVar, atomicBoolean);
            if (c6.b.d()) {
                c6.b.b();
            }
            return o10;
        } finally {
            if (c6.b.d()) {
                c6.b.b();
            }
        }
    }

    public void p(t3.d dVar, w5.e eVar) {
        try {
            if (c6.b.d()) {
                c6.b.a("BufferedDiskCache#put");
            }
            y3.k.g(dVar);
            y3.k.b(Boolean.valueOf(w5.e.r0(eVar)));
            this.f35529f.f(dVar, eVar);
            w5.e b10 = w5.e.b(eVar);
            try {
                this.f35528e.execute(new b(x5.a.d("BufferedDiskCache_putAsync"), dVar, b10));
            } catch (Exception e10) {
                z3.a.F(f35523h, e10, "Failed to schedule disk-cache write for %s", dVar.a());
                this.f35529f.h(dVar, eVar);
                w5.e.d(b10);
            }
        } finally {
            if (c6.b.d()) {
                c6.b.b();
            }
        }
    }

    public s1.f<Void> r(t3.d dVar) {
        y3.k.g(dVar);
        this.f35529f.g(dVar);
        try {
            return s1.f.b(new c(x5.a.d("BufferedDiskCache_remove"), dVar), this.f35528e);
        } catch (Exception e10) {
            z3.a.F(f35523h, e10, "Failed to schedule disk-cache remove for %s", dVar.a());
            return s1.f.g(e10);
        }
    }
}
