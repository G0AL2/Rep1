package df;

import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import ee.u;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import ye.b0;
import ye.d0;
import ye.p;
import ye.r;
import ye.z;

/* compiled from: RealCall.kt */
/* loaded from: classes3.dex */
public final class e implements ye.e {

    /* renamed from: a  reason: collision with root package name */
    private final h f29403a;

    /* renamed from: b  reason: collision with root package name */
    private final r f29404b;

    /* renamed from: c  reason: collision with root package name */
    private final c f29405c;

    /* renamed from: d  reason: collision with root package name */
    private final AtomicBoolean f29406d;

    /* renamed from: e  reason: collision with root package name */
    private Object f29407e;

    /* renamed from: f  reason: collision with root package name */
    private d f29408f;

    /* renamed from: g  reason: collision with root package name */
    private f f29409g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f29410h;

    /* renamed from: i  reason: collision with root package name */
    private df.c f29411i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f29412j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f29413k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f29414l;

    /* renamed from: m  reason: collision with root package name */
    private volatile boolean f29415m;

    /* renamed from: n  reason: collision with root package name */
    private volatile df.c f29416n;

    /* renamed from: o  reason: collision with root package name */
    private volatile f f29417o;

    /* renamed from: p  reason: collision with root package name */
    private final z f29418p;

    /* renamed from: q  reason: collision with root package name */
    private final b0 f29419q;

    /* renamed from: r  reason: collision with root package name */
    private final boolean f29420r;

    /* compiled from: RealCall.kt */
    /* loaded from: classes3.dex */
    public final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private volatile AtomicInteger f29421a;

        /* renamed from: b  reason: collision with root package name */
        private final ye.f f29422b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ e f29423c;

        public a(e eVar, ye.f fVar) {
            qe.k.f(fVar, "responseCallback");
            this.f29423c = eVar;
            this.f29422b = fVar;
            this.f29421a = new AtomicInteger(0);
        }

        public final void a(ExecutorService executorService) {
            qe.k.f(executorService, "executorService");
            p p10 = this.f29423c.k().p();
            if (ze.c.f40525g && Thread.holdsLock(p10)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Thread ");
                Thread currentThread = Thread.currentThread();
                qe.k.e(currentThread, "Thread.currentThread()");
                sb2.append(currentThread.getName());
                sb2.append(" MUST NOT hold lock on ");
                sb2.append(p10);
                throw new AssertionError(sb2.toString());
            }
            try {
                try {
                    executorService.execute(this);
                } catch (RejectedExecutionException e10) {
                    InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                    interruptedIOException.initCause(e10);
                    this.f29423c.u(interruptedIOException);
                    this.f29422b.onFailure(this.f29423c, interruptedIOException);
                    this.f29423c.k().p().g(this);
                }
            } catch (Throwable th) {
                this.f29423c.k().p().g(this);
                throw th;
            }
        }

        public final e b() {
            return this.f29423c;
        }

        public final AtomicInteger c() {
            return this.f29421a;
        }

        public final String d() {
            return this.f29423c.q().l().h();
        }

        public final void e(a aVar) {
            qe.k.f(aVar, InneractiveMediationNameConsts.OTHER);
            this.f29421a = aVar.f29421a;
        }

        @Override // java.lang.Runnable
        public void run() {
            Throwable th;
            boolean z10;
            IOException e10;
            p p10;
            Thread currentThread = Thread.currentThread();
            qe.k.e(currentThread, "currentThread");
            String name = currentThread.getName();
            currentThread.setName("OkHttp " + this.f29423c.v());
            try {
                this.f29423c.f29405c.r();
                try {
                    z10 = true;
                    try {
                        this.f29422b.onResponse(this.f29423c, this.f29423c.r());
                        p10 = this.f29423c.k().p();
                    } catch (IOException e11) {
                        e10 = e11;
                        if (z10) {
                            okhttp3.internal.platform.h.f35277c.g().k("Callback failure for " + this.f29423c.B(), 4, e10);
                        } else {
                            this.f29422b.onFailure(this.f29423c, e10);
                        }
                        p10 = this.f29423c.k().p();
                        p10.g(this);
                    } catch (Throwable th2) {
                        th = th2;
                        this.f29423c.cancel();
                        if (!z10) {
                            IOException iOException = new IOException("canceled due to " + th);
                            ee.b.a(iOException, th);
                            this.f29422b.onFailure(this.f29423c, iOException);
                        }
                        throw th;
                    }
                } catch (IOException e12) {
                    e10 = e12;
                    z10 = false;
                } catch (Throwable th3) {
                    th = th3;
                    z10 = false;
                }
                p10.g(this);
            } finally {
                currentThread.setName(name);
            }
        }
    }

    /* compiled from: RealCall.kt */
    /* loaded from: classes3.dex */
    public static final class b extends WeakReference<e> {

        /* renamed from: a  reason: collision with root package name */
        private final Object f29424a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(e eVar, Object obj) {
            super(eVar);
            qe.k.f(eVar, "referent");
            this.f29424a = obj;
        }

        public final Object a() {
            return this.f29424a;
        }
    }

    /* compiled from: RealCall.kt */
    /* loaded from: classes3.dex */
    public static final class c extends mf.d {
        c() {
        }

        @Override // mf.d
        protected void x() {
            e.this.cancel();
        }
    }

    public e(z zVar, b0 b0Var, boolean z10) {
        qe.k.f(zVar, "client");
        qe.k.f(b0Var, "originalRequest");
        this.f29418p = zVar;
        this.f29419q = b0Var;
        this.f29420r = z10;
        this.f29403a = zVar.m().a();
        this.f29404b = zVar.r().a(this);
        c cVar = new c();
        cVar.g(zVar.g(), TimeUnit.MILLISECONDS);
        u uVar = u.f29813a;
        this.f29405c = cVar;
        this.f29406d = new AtomicBoolean();
        this.f29414l = true;
    }

    private final <E extends IOException> E A(E e10) {
        if (!this.f29410h && this.f29405c.s()) {
            InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
            if (e10 != null) {
                interruptedIOException.initCause(e10);
            }
            return interruptedIOException;
        }
        return e10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String B() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(isCanceled() ? "canceled " : "");
        sb2.append(this.f29420r ? "web socket" : "call");
        sb2.append(" to ");
        sb2.append(v());
        return sb2.toString();
    }

    private final <E extends IOException> E d(E e10) {
        Socket w10;
        boolean z10 = ze.c.f40525g;
        if (z10 && Thread.holdsLock(this)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Thread ");
            Thread currentThread = Thread.currentThread();
            qe.k.e(currentThread, "Thread.currentThread()");
            sb2.append(currentThread.getName());
            sb2.append(" MUST NOT hold lock on ");
            sb2.append(this);
            throw new AssertionError(sb2.toString());
        }
        f fVar = this.f29409g;
        if (fVar != null) {
            if (z10 && Thread.holdsLock(fVar)) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Thread ");
                Thread currentThread2 = Thread.currentThread();
                qe.k.e(currentThread2, "Thread.currentThread()");
                sb3.append(currentThread2.getName());
                sb3.append(" MUST NOT hold lock on ");
                sb3.append(fVar);
                throw new AssertionError(sb3.toString());
            }
            synchronized (fVar) {
                w10 = w();
            }
            if (this.f29409g == null) {
                if (w10 != null) {
                    ze.c.k(w10);
                }
                this.f29404b.l(this, fVar);
            } else {
                if (!(w10 == null)) {
                    throw new IllegalStateException("Check failed.".toString());
                }
            }
        }
        E e11 = (E) A(e10);
        if (e10 != null) {
            r rVar = this.f29404b;
            qe.k.c(e11);
            rVar.e(this, e11);
        } else {
            this.f29404b.d(this);
        }
        return e11;
    }

    private final void e() {
        this.f29407e = okhttp3.internal.platform.h.f35277c.g().i("response.body().close()");
        this.f29404b.f(this);
    }

    private final ye.a g(ye.u uVar) {
        SSLSocketFactory sSLSocketFactory;
        HostnameVerifier hostnameVerifier;
        ye.g gVar;
        if (uVar.i()) {
            SSLSocketFactory J = this.f29418p.J();
            hostnameVerifier = this.f29418p.v();
            sSLSocketFactory = J;
            gVar = this.f29418p.j();
        } else {
            sSLSocketFactory = null;
            hostnameVerifier = null;
            gVar = null;
        }
        return new ye.a(uVar.h(), uVar.m(), this.f29418p.q(), this.f29418p.I(), sSLSocketFactory, hostnameVerifier, gVar, this.f29418p.E(), this.f29418p.D(), this.f29418p.C(), this.f29418p.n(), this.f29418p.F());
    }

    public final void c(f fVar) {
        qe.k.f(fVar, "connection");
        if (ze.c.f40525g && !Thread.holdsLock(fVar)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Thread ");
            Thread currentThread = Thread.currentThread();
            qe.k.e(currentThread, "Thread.currentThread()");
            sb2.append(currentThread.getName());
            sb2.append(" MUST hold lock on ");
            sb2.append(fVar);
            throw new AssertionError(sb2.toString());
        }
        if (this.f29409g == null) {
            this.f29409g = fVar;
            fVar.n().add(new b(this, this.f29407e));
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    @Override // ye.e
    public void cancel() {
        if (this.f29415m) {
            return;
        }
        this.f29415m = true;
        df.c cVar = this.f29416n;
        if (cVar != null) {
            cVar.b();
        }
        f fVar = this.f29417o;
        if (fVar != null) {
            fVar.d();
        }
        this.f29404b.g(this);
    }

    /* renamed from: f */
    public e clone() {
        return new e(this.f29418p, this.f29419q, this.f29420r);
    }

    @Override // ye.e
    public d0 h() {
        if (this.f29406d.compareAndSet(false, true)) {
            this.f29405c.r();
            e();
            try {
                this.f29418p.p().c(this);
                return r();
            } finally {
                this.f29418p.p().h(this);
            }
        }
        throw new IllegalStateException("Already Executed".toString());
    }

    public final void i(b0 b0Var, boolean z10) {
        qe.k.f(b0Var, "request");
        if (this.f29411i == null) {
            synchronized (this) {
                if (!this.f29413k) {
                    if (!this.f29412j) {
                        u uVar = u.f29813a;
                    } else {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                } else {
                    throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()".toString());
                }
            }
            if (z10) {
                this.f29408f = new d(this.f29403a, g(b0Var.l()), this, this.f29404b);
                return;
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    @Override // ye.e
    public void i1(ye.f fVar) {
        qe.k.f(fVar, "responseCallback");
        if (this.f29406d.compareAndSet(false, true)) {
            e();
            this.f29418p.p().b(new a(this, fVar));
            return;
        }
        throw new IllegalStateException("Already Executed".toString());
    }

    @Override // ye.e
    public boolean isCanceled() {
        return this.f29415m;
    }

    public final void j(boolean z10) {
        df.c cVar;
        synchronized (this) {
            if (this.f29414l) {
                u uVar = u.f29813a;
            } else {
                throw new IllegalStateException("released".toString());
            }
        }
        if (z10 && (cVar = this.f29416n) != null) {
            cVar.d();
        }
        this.f29411i = null;
    }

    public final z k() {
        return this.f29418p;
    }

    @Override // ye.e
    public b0 l() {
        return this.f29419q;
    }

    public final f m() {
        return this.f29409g;
    }

    public final r n() {
        return this.f29404b;
    }

    public final boolean o() {
        return this.f29420r;
    }

    public final df.c p() {
        return this.f29411i;
    }

    public final b0 q() {
        return this.f29419q;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final ye.d0 r() throws java.io.IOException {
        /*
            r10 = this;
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            ye.z r0 = r10.f29418p
            java.util.List r0 = r0.w()
            fe.n.s(r2, r0)
            ef.j r0 = new ef.j
            ye.z r1 = r10.f29418p
            r0.<init>(r1)
            r2.add(r0)
            ef.a r0 = new ef.a
            ye.z r1 = r10.f29418p
            ye.n r1 = r1.o()
            r0.<init>(r1)
            r2.add(r0)
            bf.a r0 = new bf.a
            ye.z r1 = r10.f29418p
            ye.c r1 = r1.f()
            r0.<init>(r1)
            r2.add(r0)
            df.a r0 = df.a.f29371a
            r2.add(r0)
            boolean r0 = r10.f29420r
            if (r0 != 0) goto L46
            ye.z r0 = r10.f29418p
            java.util.List r0 = r0.y()
            fe.n.s(r2, r0)
        L46:
            ef.b r0 = new ef.b
            boolean r1 = r10.f29420r
            r0.<init>(r1)
            r2.add(r0)
            ef.g r9 = new ef.g
            r3 = 0
            r4 = 0
            ye.b0 r5 = r10.f29419q
            ye.z r0 = r10.f29418p
            int r6 = r0.k()
            ye.z r0 = r10.f29418p
            int r7 = r0.G()
            ye.z r0 = r10.f29418p
            int r8 = r0.L()
            r0 = r9
            r1 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = 0
            r1 = 0
            ye.b0 r2 = r10.f29419q     // Catch: java.lang.Throwable -> L8a java.io.IOException -> L8c
            ye.d0 r2 = r9.a(r2)     // Catch: java.lang.Throwable -> L8a java.io.IOException -> L8c
            boolean r3 = r10.isCanceled()     // Catch: java.lang.Throwable -> L8a java.io.IOException -> L8c
            if (r3 != 0) goto L7f
            r10.u(r1)
            return r2
        L7f:
            ze.c.j(r2)     // Catch: java.lang.Throwable -> L8a java.io.IOException -> L8c
            java.io.IOException r2 = new java.io.IOException     // Catch: java.lang.Throwable -> L8a java.io.IOException -> L8c
            java.lang.String r3 = "Canceled"
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L8a java.io.IOException -> L8c
            throw r2     // Catch: java.lang.Throwable -> L8a java.io.IOException -> L8c
        L8a:
            r2 = move-exception
            goto La0
        L8c:
            r0 = move-exception
            r2 = 1
            java.io.IOException r0 = r10.u(r0)     // Catch: java.lang.Throwable -> L9d
            if (r0 != 0) goto L9c
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> L9d
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.Throwable"
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L9d
            throw r0     // Catch: java.lang.Throwable -> L9d
        L9c:
            throw r0     // Catch: java.lang.Throwable -> L9d
        L9d:
            r0 = move-exception
            r2 = r0
            r0 = 1
        La0:
            if (r0 != 0) goto La5
            r10.u(r1)
        La5:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: df.e.r():ye.d0");
    }

    public final df.c s(ef.g gVar) {
        qe.k.f(gVar, "chain");
        synchronized (this) {
            if (this.f29414l) {
                if (!this.f29413k) {
                    if (!this.f29412j) {
                        u uVar = u.f29813a;
                    } else {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                } else {
                    throw new IllegalStateException("Check failed.".toString());
                }
            } else {
                throw new IllegalStateException("released".toString());
            }
        }
        d dVar = this.f29408f;
        qe.k.c(dVar);
        df.c cVar = new df.c(this, this.f29404b, dVar, dVar.a(this.f29418p, gVar));
        this.f29411i = cVar;
        this.f29416n = cVar;
        synchronized (this) {
            this.f29412j = true;
            this.f29413k = true;
        }
        if (this.f29415m) {
            throw new IOException("Canceled");
        }
        return cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0023 A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:8:0x0014, B:17:0x0023, B:19:0x0027, B:20:0x0029, B:22:0x002d, B:27:0x0036, B:29:0x003a, B:35:0x0043, B:14:0x001d), top: B:47:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0027 A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:8:0x0014, B:17:0x0023, B:19:0x0027, B:20:0x0029, B:22:0x002d, B:27:0x0036, B:29:0x003a, B:35:0x0043, B:14:0x001d), top: B:47:0x0014 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final <E extends java.io.IOException> E t(df.c r3, boolean r4, boolean r5, E r6) {
        /*
            r2 = this;
            java.lang.String r0 = "exchange"
            qe.k.f(r3, r0)
            df.c r0 = r2.f29416n
            boolean r3 = qe.k.a(r3, r0)
            r0 = 1
            r3 = r3 ^ r0
            if (r3 == 0) goto L10
            return r6
        L10:
            monitor-enter(r2)
            r3 = 0
            if (r4 == 0) goto L1b
            boolean r1 = r2.f29412j     // Catch: java.lang.Throwable -> L19
            if (r1 != 0) goto L21
            goto L1b
        L19:
            r3 = move-exception
            goto L5a
        L1b:
            if (r5 == 0) goto L42
            boolean r1 = r2.f29413k     // Catch: java.lang.Throwable -> L19
            if (r1 == 0) goto L42
        L21:
            if (r4 == 0) goto L25
            r2.f29412j = r3     // Catch: java.lang.Throwable -> L19
        L25:
            if (r5 == 0) goto L29
            r2.f29413k = r3     // Catch: java.lang.Throwable -> L19
        L29:
            boolean r4 = r2.f29412j     // Catch: java.lang.Throwable -> L19
            if (r4 != 0) goto L33
            boolean r5 = r2.f29413k     // Catch: java.lang.Throwable -> L19
            if (r5 != 0) goto L33
            r5 = 1
            goto L34
        L33:
            r5 = 0
        L34:
            if (r4 != 0) goto L3f
            boolean r4 = r2.f29413k     // Catch: java.lang.Throwable -> L19
            if (r4 != 0) goto L3f
            boolean r4 = r2.f29414l     // Catch: java.lang.Throwable -> L19
            if (r4 != 0) goto L3f
            goto L40
        L3f:
            r0 = 0
        L40:
            r3 = r5
            goto L43
        L42:
            r0 = 0
        L43:
            ee.u r4 = ee.u.f29813a     // Catch: java.lang.Throwable -> L19
            monitor-exit(r2)
            if (r3 == 0) goto L52
            r3 = 0
            r2.f29416n = r3
            df.f r3 = r2.f29409g
            if (r3 == 0) goto L52
            r3.s()
        L52:
            if (r0 == 0) goto L59
            java.io.IOException r3 = r2.d(r6)
            return r3
        L59:
            return r6
        L5a:
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: df.e.t(df.c, boolean, boolean, java.io.IOException):java.io.IOException");
    }

    public final IOException u(IOException iOException) {
        boolean z10;
        synchronized (this) {
            z10 = false;
            if (this.f29414l) {
                this.f29414l = false;
                if (!this.f29412j && !this.f29413k) {
                    z10 = true;
                }
            }
            u uVar = u.f29813a;
        }
        return z10 ? d(iOException) : iOException;
    }

    public final String v() {
        return this.f29419q.l().o();
    }

    public final Socket w() {
        f fVar = this.f29409g;
        qe.k.c(fVar);
        if (ze.c.f40525g && !Thread.holdsLock(fVar)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Thread ");
            Thread currentThread = Thread.currentThread();
            qe.k.e(currentThread, "Thread.currentThread()");
            sb2.append(currentThread.getName());
            sb2.append(" MUST hold lock on ");
            sb2.append(fVar);
            throw new AssertionError(sb2.toString());
        }
        List<Reference<e>> n10 = fVar.n();
        Iterator<Reference<e>> it = n10.iterator();
        int i10 = 0;
        while (true) {
            if (!it.hasNext()) {
                i10 = -1;
                break;
            } else if (qe.k.a(it.next().get(), this)) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 != -1) {
            n10.remove(i10);
            this.f29409g = null;
            if (n10.isEmpty()) {
                fVar.C(System.nanoTime());
                if (this.f29403a.c(fVar)) {
                    return fVar.E();
                }
            }
            return null;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final boolean x() {
        d dVar = this.f29408f;
        qe.k.c(dVar);
        return dVar.e();
    }

    public final void y(f fVar) {
        this.f29417o = fVar;
    }

    public final void z() {
        if (!this.f29410h) {
            this.f29410h = true;
            this.f29405c.s();
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }
}
