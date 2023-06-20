package gf;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import ee.u;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import mf.c0;
import mf.e0;
import mf.f0;
import ye.t;

/* compiled from: Http2Stream.kt */
/* loaded from: classes3.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    private long f31004a;

    /* renamed from: b  reason: collision with root package name */
    private long f31005b;

    /* renamed from: c  reason: collision with root package name */
    private long f31006c;

    /* renamed from: d  reason: collision with root package name */
    private long f31007d;

    /* renamed from: e  reason: collision with root package name */
    private final ArrayDeque<t> f31008e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f31009f;

    /* renamed from: g  reason: collision with root package name */
    private final c f31010g;

    /* renamed from: h  reason: collision with root package name */
    private final b f31011h;

    /* renamed from: i  reason: collision with root package name */
    private final d f31012i;

    /* renamed from: j  reason: collision with root package name */
    private final d f31013j;

    /* renamed from: k  reason: collision with root package name */
    private gf.b f31014k;

    /* renamed from: l  reason: collision with root package name */
    private IOException f31015l;

    /* renamed from: m  reason: collision with root package name */
    private final int f31016m;

    /* renamed from: n  reason: collision with root package name */
    private final f f31017n;

    /* compiled from: Http2Stream.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qe.g gVar) {
            this();
        }
    }

    /* compiled from: Http2Stream.kt */
    /* loaded from: classes3.dex */
    public final class b implements c0 {

        /* renamed from: a  reason: collision with root package name */
        private final mf.f f31018a = new mf.f();

        /* renamed from: b  reason: collision with root package name */
        private t f31019b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f31020c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f31021d;

        public b(boolean z10) {
            this.f31021d = z10;
        }

        private final void a(boolean z10) throws IOException {
            long min;
            boolean z11;
            synchronized (i.this) {
                i.this.s().r();
                while (i.this.r() >= i.this.q() && !this.f31021d && !this.f31020c && i.this.h() == null) {
                    i.this.D();
                }
                i.this.s().y();
                i.this.c();
                min = Math.min(i.this.q() - i.this.r(), this.f31018a.C0());
                i iVar = i.this;
                iVar.B(iVar.r() + min);
                z11 = z10 && min == this.f31018a.C0() && i.this.h() == null;
                u uVar = u.f29813a;
            }
            i.this.s().r();
            try {
                i.this.g().q1(i.this.j(), z11, this.f31018a, min);
            } finally {
                i.this.s().y();
            }
        }

        public final boolean b() {
            return this.f31020c;
        }

        @Override // mf.c0, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            i iVar = i.this;
            if (ze.c.f40525g && Thread.holdsLock(iVar)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Thread ");
                Thread currentThread = Thread.currentThread();
                qe.k.e(currentThread, "Thread.currentThread()");
                sb2.append(currentThread.getName());
                sb2.append(" MUST NOT hold lock on ");
                sb2.append(iVar);
                throw new AssertionError(sb2.toString());
            }
            synchronized (i.this) {
                if (this.f31020c) {
                    return;
                }
                boolean z10 = i.this.h() == null;
                u uVar = u.f29813a;
                if (!i.this.o().f31021d) {
                    boolean z11 = this.f31018a.C0() > 0;
                    if (this.f31019b != null) {
                        while (this.f31018a.C0() > 0) {
                            a(false);
                        }
                        f g10 = i.this.g();
                        int j10 = i.this.j();
                        t tVar = this.f31019b;
                        qe.k.c(tVar);
                        g10.r1(j10, z10, ze.c.L(tVar));
                    } else if (z11) {
                        while (this.f31018a.C0() > 0) {
                            a(true);
                        }
                    } else if (z10) {
                        i.this.g().q1(i.this.j(), true, null, 0L);
                    }
                }
                synchronized (i.this) {
                    this.f31020c = true;
                    u uVar2 = u.f29813a;
                }
                i.this.g().flush();
                i.this.b();
            }
        }

        public final boolean d() {
            return this.f31021d;
        }

        @Override // mf.c0, java.io.Flushable
        public void flush() throws IOException {
            i iVar = i.this;
            if (ze.c.f40525g && Thread.holdsLock(iVar)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Thread ");
                Thread currentThread = Thread.currentThread();
                qe.k.e(currentThread, "Thread.currentThread()");
                sb2.append(currentThread.getName());
                sb2.append(" MUST NOT hold lock on ");
                sb2.append(iVar);
                throw new AssertionError(sb2.toString());
            }
            synchronized (i.this) {
                i.this.c();
                u uVar = u.f29813a;
            }
            while (this.f31018a.C0() > 0) {
                a(false);
                i.this.g().flush();
            }
        }

        @Override // mf.c0
        public f0 k() {
            return i.this.s();
        }

        @Override // mf.c0
        public void n0(mf.f fVar, long j10) throws IOException {
            qe.k.f(fVar, "source");
            i iVar = i.this;
            if (ze.c.f40525g && Thread.holdsLock(iVar)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Thread ");
                Thread currentThread = Thread.currentThread();
                qe.k.e(currentThread, "Thread.currentThread()");
                sb2.append(currentThread.getName());
                sb2.append(" MUST NOT hold lock on ");
                sb2.append(iVar);
                throw new AssertionError(sb2.toString());
            }
            this.f31018a.n0(fVar, j10);
            while (this.f31018a.C0() >= 16384) {
                a(false);
            }
        }
    }

    /* compiled from: Http2Stream.kt */
    /* loaded from: classes3.dex */
    public final class c implements e0 {

        /* renamed from: a  reason: collision with root package name */
        private final mf.f f31023a = new mf.f();

        /* renamed from: b  reason: collision with root package name */
        private final mf.f f31024b = new mf.f();

        /* renamed from: c  reason: collision with root package name */
        private boolean f31025c;

        /* renamed from: d  reason: collision with root package name */
        private final long f31026d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f31027e;

        public c(long j10, boolean z10) {
            this.f31026d = j10;
            this.f31027e = z10;
        }

        private final void l(long j10) {
            i iVar = i.this;
            if (ze.c.f40525g && Thread.holdsLock(iVar)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Thread ");
                Thread currentThread = Thread.currentThread();
                qe.k.e(currentThread, "Thread.currentThread()");
                sb2.append(currentThread.getName());
                sb2.append(" MUST NOT hold lock on ");
                sb2.append(iVar);
                throw new AssertionError(sb2.toString());
            }
            i.this.g().p1(j10);
        }

        public final boolean a() {
            return this.f31025c;
        }

        public final boolean b() {
            return this.f31027e;
        }

        @Override // mf.e0, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            long C0;
            synchronized (i.this) {
                this.f31025c = true;
                C0 = this.f31024b.C0();
                this.f31024b.b();
                i iVar = i.this;
                if (iVar != null) {
                    iVar.notifyAll();
                    u uVar = u.f29813a;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
                }
            }
            if (C0 > 0) {
                l(C0);
            }
            i.this.b();
        }

        public final void d(mf.h hVar, long j10) throws IOException {
            boolean z10;
            boolean z11;
            boolean z12;
            long j11;
            qe.k.f(hVar, "source");
            i iVar = i.this;
            if (ze.c.f40525g && Thread.holdsLock(iVar)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Thread ");
                Thread currentThread = Thread.currentThread();
                qe.k.e(currentThread, "Thread.currentThread()");
                sb2.append(currentThread.getName());
                sb2.append(" MUST NOT hold lock on ");
                sb2.append(iVar);
                throw new AssertionError(sb2.toString());
            }
            while (j10 > 0) {
                synchronized (i.this) {
                    z10 = this.f31027e;
                    z11 = true;
                    z12 = this.f31024b.C0() + j10 > this.f31026d;
                    u uVar = u.f29813a;
                }
                if (z12) {
                    hVar.O0(j10);
                    i.this.f(gf.b.FLOW_CONTROL_ERROR);
                    return;
                } else if (z10) {
                    hVar.O0(j10);
                    return;
                } else {
                    long e02 = hVar.e0(this.f31023a, j10);
                    if (e02 != -1) {
                        j10 -= e02;
                        synchronized (i.this) {
                            if (this.f31025c) {
                                j11 = this.f31023a.C0();
                                this.f31023a.b();
                            } else {
                                if (this.f31024b.C0() != 0) {
                                    z11 = false;
                                }
                                this.f31024b.t(this.f31023a);
                                if (z11) {
                                    i iVar2 = i.this;
                                    if (iVar2 == null) {
                                        throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
                                    }
                                    iVar2.notifyAll();
                                }
                                j11 = 0;
                            }
                        }
                        if (j11 > 0) {
                            l(j11);
                        }
                    } else {
                        throw new EOFException();
                    }
                }
            }
        }

        public final void e(boolean z10) {
            this.f31027e = z10;
        }

        @Override // mf.e0
        public long e0(mf.f fVar, long j10) throws IOException {
            IOException iOException;
            long j11;
            boolean z10;
            qe.k.f(fVar, "sink");
            if (!(j10 >= 0)) {
                throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
            }
            do {
                iOException = null;
                synchronized (i.this) {
                    i.this.m().r();
                    if (i.this.h() != null && (iOException = i.this.i()) == null) {
                        gf.b h10 = i.this.h();
                        qe.k.c(h10);
                        iOException = new n(h10);
                    }
                    if (!this.f31025c) {
                        if (this.f31024b.C0() > 0) {
                            mf.f fVar2 = this.f31024b;
                            j11 = fVar2.e0(fVar, Math.min(j10, fVar2.C0()));
                            i iVar = i.this;
                            iVar.A(iVar.l() + j11);
                            long l10 = i.this.l() - i.this.k();
                            if (iOException == null && l10 >= i.this.g().C0().c() / 2) {
                                i.this.g().v1(i.this.j(), l10);
                                i iVar2 = i.this;
                                iVar2.z(iVar2.l());
                            }
                        } else if (this.f31027e || iOException != null) {
                            j11 = -1;
                        } else {
                            i.this.D();
                            j11 = -1;
                            z10 = true;
                            i.this.m().y();
                            u uVar = u.f29813a;
                        }
                        z10 = false;
                        i.this.m().y();
                        u uVar2 = u.f29813a;
                    } else {
                        throw new IOException("stream closed");
                    }
                }
            } while (z10);
            if (j11 != -1) {
                l(j11);
                return j11;
            } else if (iOException == null) {
                return -1L;
            } else {
                qe.k.c(iOException);
                throw iOException;
            }
        }

        public final void h(t tVar) {
        }

        @Override // mf.e0
        public f0 k() {
            return i.this.m();
        }
    }

    /* compiled from: Http2Stream.kt */
    /* loaded from: classes3.dex */
    public final class d extends mf.d {
        public d() {
        }

        @Override // mf.d
        protected IOException t(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        @Override // mf.d
        protected void x() {
            i.this.f(gf.b.CANCEL);
            i.this.g().j1();
        }

        public final void y() throws IOException {
            if (s()) {
                throw t(null);
            }
        }
    }

    static {
        new a(null);
    }

    public i(int i10, f fVar, boolean z10, boolean z11, t tVar) {
        qe.k.f(fVar, "connection");
        this.f31016m = i10;
        this.f31017n = fVar;
        this.f31007d = fVar.E0().c();
        ArrayDeque<t> arrayDeque = new ArrayDeque<>();
        this.f31008e = arrayDeque;
        this.f31010g = new c(fVar.C0().c(), z11);
        this.f31011h = new b(z10);
        this.f31012i = new d();
        this.f31013j = new d();
        if (tVar != null) {
            if (!t()) {
                arrayDeque.add(tVar);
                return;
            }
            throw new IllegalStateException("locally-initiated streams shouldn't have headers yet".toString());
        } else if (!t()) {
            throw new IllegalStateException("remotely-initiated streams should have headers".toString());
        }
    }

    private final boolean e(gf.b bVar, IOException iOException) {
        if (ze.c.f40525g && Thread.holdsLock(this)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Thread ");
            Thread currentThread = Thread.currentThread();
            qe.k.e(currentThread, "Thread.currentThread()");
            sb2.append(currentThread.getName());
            sb2.append(" MUST NOT hold lock on ");
            sb2.append(this);
            throw new AssertionError(sb2.toString());
        }
        synchronized (this) {
            if (this.f31014k != null) {
                return false;
            }
            if (this.f31010g.b() && this.f31011h.d()) {
                return false;
            }
            this.f31014k = bVar;
            this.f31015l = iOException;
            notifyAll();
            u uVar = u.f29813a;
            this.f31017n.i1(this.f31016m);
            return true;
        }
    }

    public final void A(long j10) {
        this.f31004a = j10;
    }

    public final void B(long j10) {
        this.f31006c = j10;
    }

    public final synchronized t C() throws IOException {
        t removeFirst;
        this.f31012i.r();
        while (this.f31008e.isEmpty() && this.f31014k == null) {
            D();
        }
        this.f31012i.y();
        if (!this.f31008e.isEmpty()) {
            removeFirst = this.f31008e.removeFirst();
            qe.k.e(removeFirst, "headersQueue.removeFirst()");
        } else {
            IOException iOException = this.f31015l;
            if (iOException != null) {
                throw iOException;
            }
            gf.b bVar = this.f31014k;
            qe.k.c(bVar);
            throw new n(bVar);
        }
        return removeFirst;
    }

    public final void D() throws InterruptedIOException {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    public final f0 E() {
        return this.f31013j;
    }

    public final void a(long j10) {
        this.f31007d += j10;
        if (j10 > 0) {
            notifyAll();
        }
    }

    public final void b() throws IOException {
        boolean z10;
        boolean u10;
        if (ze.c.f40525g && Thread.holdsLock(this)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Thread ");
            Thread currentThread = Thread.currentThread();
            qe.k.e(currentThread, "Thread.currentThread()");
            sb2.append(currentThread.getName());
            sb2.append(" MUST NOT hold lock on ");
            sb2.append(this);
            throw new AssertionError(sb2.toString());
        }
        synchronized (this) {
            z10 = !this.f31010g.b() && this.f31010g.a() && (this.f31011h.d() || this.f31011h.b());
            u10 = u();
            u uVar = u.f29813a;
        }
        if (z10) {
            d(gf.b.CANCEL, null);
        } else if (u10) {
        } else {
            this.f31017n.i1(this.f31016m);
        }
    }

    public final void c() throws IOException {
        if (!this.f31011h.b()) {
            if (!this.f31011h.d()) {
                if (this.f31014k != null) {
                    IOException iOException = this.f31015l;
                    if (iOException != null) {
                        throw iOException;
                    }
                    gf.b bVar = this.f31014k;
                    qe.k.c(bVar);
                    throw new n(bVar);
                }
                return;
            }
            throw new IOException("stream finished");
        }
        throw new IOException("stream closed");
    }

    public final void d(gf.b bVar, IOException iOException) throws IOException {
        qe.k.f(bVar, "rstStatusCode");
        if (e(bVar, iOException)) {
            this.f31017n.t1(this.f31016m, bVar);
        }
    }

    public final void f(gf.b bVar) {
        qe.k.f(bVar, IronSourceConstants.EVENTS_ERROR_CODE);
        if (e(bVar, null)) {
            this.f31017n.u1(this.f31016m, bVar);
        }
    }

    public final f g() {
        return this.f31017n;
    }

    public final synchronized gf.b h() {
        return this.f31014k;
    }

    public final IOException i() {
        return this.f31015l;
    }

    public final int j() {
        return this.f31016m;
    }

    public final long k() {
        return this.f31005b;
    }

    public final long l() {
        return this.f31004a;
    }

    public final d m() {
        return this.f31012i;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0011 A[Catch: all -> 0x0023, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:11:0x0011, B:15:0x0017, B:16:0x0022), top: B:20:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0017 A[Catch: all -> 0x0023, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:11:0x0011, B:15:0x0017, B:16:0x0022), top: B:20:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final mf.c0 n() {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f31009f     // Catch: java.lang.Throwable -> L23
            if (r0 != 0) goto Le
            boolean r0 = r2.t()     // Catch: java.lang.Throwable -> L23
            if (r0 == 0) goto Lc
            goto Le
        Lc:
            r0 = 0
            goto Lf
        Le:
            r0 = 1
        Lf:
            if (r0 == 0) goto L17
            ee.u r0 = ee.u.f29813a     // Catch: java.lang.Throwable -> L23
            monitor-exit(r2)
            gf.i$b r0 = r2.f31011h
            return r0
        L17:
            java.lang.String r0 = "reply before requesting the sink"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L23
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L23
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L23
            throw r1     // Catch: java.lang.Throwable -> L23
        L23:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: gf.i.n():mf.c0");
    }

    public final b o() {
        return this.f31011h;
    }

    public final c p() {
        return this.f31010g;
    }

    public final long q() {
        return this.f31007d;
    }

    public final long r() {
        return this.f31006c;
    }

    public final d s() {
        return this.f31013j;
    }

    public final boolean t() {
        return this.f31017n.m0() == ((this.f31016m & 1) == 1);
    }

    public final synchronized boolean u() {
        if (this.f31014k != null) {
            return false;
        }
        if ((this.f31010g.b() || this.f31010g.a()) && (this.f31011h.d() || this.f31011h.b())) {
            if (this.f31009f) {
                return false;
            }
        }
        return true;
    }

    public final f0 v() {
        return this.f31012i;
    }

    public final void w(mf.h hVar, int i10) throws IOException {
        qe.k.f(hVar, "source");
        if (ze.c.f40525g && Thread.holdsLock(this)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Thread ");
            Thread currentThread = Thread.currentThread();
            qe.k.e(currentThread, "Thread.currentThread()");
            sb2.append(currentThread.getName());
            sb2.append(" MUST NOT hold lock on ");
            sb2.append(this);
            throw new AssertionError(sb2.toString());
        }
        this.f31010g.d(hVar, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0054 A[Catch: all -> 0x006d, TryCatch #0 {, blocks: (B:10:0x003d, B:14:0x0045, B:17:0x0054, B:18:0x0059, B:15:0x004b), top: B:26:0x003d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void x(ye.t r3, boolean r4) {
        /*
            r2 = this;
            java.lang.String r0 = "headers"
            qe.k.f(r3, r0)
            boolean r0 = ze.c.f40525g
            if (r0 == 0) goto L3c
            boolean r0 = java.lang.Thread.holdsLock(r2)
            if (r0 != 0) goto L10
            goto L3c
        L10:
            java.lang.AssertionError r3 = new java.lang.AssertionError
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "Thread "
            r4.append(r0)
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.String r1 = "Thread.currentThread()"
            qe.k.e(r0, r1)
            java.lang.String r0 = r0.getName()
            r4.append(r0)
            java.lang.String r0 = " MUST NOT hold lock on "
            r4.append(r0)
            r4.append(r2)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L3c:
            monitor-enter(r2)
            boolean r0 = r2.f31009f     // Catch: java.lang.Throwable -> L6d
            r1 = 1
            if (r0 == 0) goto L4b
            if (r4 != 0) goto L45
            goto L4b
        L45:
            gf.i$c r0 = r2.f31010g     // Catch: java.lang.Throwable -> L6d
            r0.h(r3)     // Catch: java.lang.Throwable -> L6d
            goto L52
        L4b:
            r2.f31009f = r1     // Catch: java.lang.Throwable -> L6d
            java.util.ArrayDeque<ye.t> r0 = r2.f31008e     // Catch: java.lang.Throwable -> L6d
            r0.add(r3)     // Catch: java.lang.Throwable -> L6d
        L52:
            if (r4 == 0) goto L59
            gf.i$c r3 = r2.f31010g     // Catch: java.lang.Throwable -> L6d
            r3.e(r1)     // Catch: java.lang.Throwable -> L6d
        L59:
            boolean r3 = r2.u()     // Catch: java.lang.Throwable -> L6d
            r2.notifyAll()     // Catch: java.lang.Throwable -> L6d
            ee.u r4 = ee.u.f29813a     // Catch: java.lang.Throwable -> L6d
            monitor-exit(r2)
            if (r3 != 0) goto L6c
            gf.f r3 = r2.f31017n
            int r4 = r2.f31016m
            r3.i1(r4)
        L6c:
            return
        L6d:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: gf.i.x(ye.t, boolean):void");
    }

    public final synchronized void y(gf.b bVar) {
        qe.k.f(bVar, IronSourceConstants.EVENTS_ERROR_CODE);
        if (this.f31014k == null) {
            this.f31014k = bVar;
            notifyAll();
        }
    }

    public final void z(long j10) {
        this.f31005b = j10;
    }
}
