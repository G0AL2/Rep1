package ff;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.ImagesContract;
import com.vehiclecloud.app.videofetch.rnads.api.RNAdsEvents;
import ef.i;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.concurrent.TimeUnit;
import mf.c0;
import mf.e0;
import mf.f0;
import mf.h;
import mf.m;
import qe.k;
import ve.p;
import ye.b0;
import ye.d0;
import ye.t;
import ye.u;
import ye.z;

/* compiled from: Http1ExchangeCodec.kt */
/* loaded from: classes3.dex */
public final class b implements ef.d {

    /* renamed from: a  reason: collision with root package name */
    private int f30334a;

    /* renamed from: b  reason: collision with root package name */
    private final ff.a f30335b;

    /* renamed from: c  reason: collision with root package name */
    private t f30336c;

    /* renamed from: d  reason: collision with root package name */
    private final z f30337d;

    /* renamed from: e  reason: collision with root package name */
    private final df.f f30338e;

    /* renamed from: f  reason: collision with root package name */
    private final h f30339f;

    /* renamed from: g  reason: collision with root package name */
    private final mf.g f30340g;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Http1ExchangeCodec.kt */
    /* loaded from: classes3.dex */
    public abstract class a implements e0 {

        /* renamed from: a  reason: collision with root package name */
        private final m f30341a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f30342b;

        public a() {
            this.f30341a = new m(b.this.f30339f.k());
        }

        protected final boolean a() {
            return this.f30342b;
        }

        public final void b() {
            if (b.this.f30334a == 6) {
                return;
            }
            if (b.this.f30334a == 5) {
                b.this.r(this.f30341a);
                b.this.f30334a = 6;
                return;
            }
            throw new IllegalStateException("state: " + b.this.f30334a);
        }

        protected final void d(boolean z10) {
            this.f30342b = z10;
        }

        @Override // mf.e0
        public long e0(mf.f fVar, long j10) {
            k.f(fVar, "sink");
            try {
                return b.this.f30339f.e0(fVar, j10);
            } catch (IOException e10) {
                b.this.b().z();
                b();
                throw e10;
            }
        }

        @Override // mf.e0
        public f0 k() {
            return this.f30341a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Http1ExchangeCodec.kt */
    /* renamed from: ff.b$b  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public final class C0386b implements c0 {

        /* renamed from: a  reason: collision with root package name */
        private final m f30344a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f30345b;

        public C0386b() {
            this.f30344a = new m(b.this.f30340g.k());
        }

        @Override // mf.c0, java.io.Closeable, java.lang.AutoCloseable
        public synchronized void close() {
            if (this.f30345b) {
                return;
            }
            this.f30345b = true;
            b.this.f30340g.M("0\r\n\r\n");
            b.this.r(this.f30344a);
            b.this.f30334a = 3;
        }

        @Override // mf.c0, java.io.Flushable
        public synchronized void flush() {
            if (this.f30345b) {
                return;
            }
            b.this.f30340g.flush();
        }

        @Override // mf.c0
        public f0 k() {
            return this.f30344a;
        }

        @Override // mf.c0
        public void n0(mf.f fVar, long j10) {
            k.f(fVar, "source");
            if (!(!this.f30345b)) {
                throw new IllegalStateException(RNAdsEvents.EVENT_CLOSED.toString());
            }
            if (j10 == 0) {
                return;
            }
            b.this.f30340g.M0(j10);
            b.this.f30340g.M("\r\n");
            b.this.f30340g.n0(fVar, j10);
            b.this.f30340g.M("\r\n");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Http1ExchangeCodec.kt */
    /* loaded from: classes3.dex */
    public final class c extends a {

        /* renamed from: d  reason: collision with root package name */
        private long f30347d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f30348e;

        /* renamed from: f  reason: collision with root package name */
        private final u f30349f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ b f30350g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(b bVar, u uVar) {
            super();
            k.f(uVar, ImagesContract.URL);
            this.f30350g = bVar;
            this.f30349f = uVar;
            this.f30347d = -1L;
            this.f30348e = true;
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x004d, code lost:
            if (r1 != false) goto L15;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final void e() {
            /*
                r7 = this;
                long r0 = r7.f30347d
                r2 = -1
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 == 0) goto L11
                ff.b r0 = r7.f30350g
                mf.h r0 = ff.b.m(r0)
                r0.a0()
            L11:
                ff.b r0 = r7.f30350g     // Catch: java.lang.NumberFormatException -> Lb1
                mf.h r0 = ff.b.m(r0)     // Catch: java.lang.NumberFormatException -> Lb1
                long r0 = r0.f1()     // Catch: java.lang.NumberFormatException -> Lb1
                r7.f30347d = r0     // Catch: java.lang.NumberFormatException -> Lb1
                ff.b r0 = r7.f30350g     // Catch: java.lang.NumberFormatException -> Lb1
                mf.h r0 = ff.b.m(r0)     // Catch: java.lang.NumberFormatException -> Lb1
                java.lang.String r0 = r0.a0()     // Catch: java.lang.NumberFormatException -> Lb1
                if (r0 == 0) goto La9
                java.lang.CharSequence r0 = ve.g.x0(r0)     // Catch: java.lang.NumberFormatException -> Lb1
                java.lang.String r0 = r0.toString()     // Catch: java.lang.NumberFormatException -> Lb1
                long r1 = r7.f30347d     // Catch: java.lang.NumberFormatException -> Lb1
                r3 = 0
                int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r5 < 0) goto L83
                int r1 = r0.length()     // Catch: java.lang.NumberFormatException -> Lb1
                r2 = 0
                if (r1 <= 0) goto L42
                r1 = 1
                goto L43
            L42:
                r1 = 0
            L43:
                if (r1 == 0) goto L4f
                java.lang.String r1 = ";"
                r5 = 2
                r6 = 0
                boolean r1 = ve.g.y(r0, r1, r2, r5, r6)     // Catch: java.lang.NumberFormatException -> Lb1
                if (r1 == 0) goto L83
            L4f:
                long r0 = r7.f30347d
                int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
                if (r5 != 0) goto L82
                r7.f30348e = r2
                ff.b r0 = r7.f30350g
                ff.a r1 = ff.b.k(r0)
                ye.t r1 = r1.a()
                ff.b.q(r0, r1)
                ff.b r0 = r7.f30350g
                ye.z r0 = ff.b.j(r0)
                qe.k.c(r0)
                ye.n r0 = r0.o()
                ye.u r1 = r7.f30349f
                ff.b r2 = r7.f30350g
                ye.t r2 = ff.b.o(r2)
                qe.k.c(r2)
                ef.e.f(r0, r1, r2)
                r7.b()
            L82:
                return
            L83:
                java.net.ProtocolException r1 = new java.net.ProtocolException     // Catch: java.lang.NumberFormatException -> Lb1
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.NumberFormatException -> Lb1
                r2.<init>()     // Catch: java.lang.NumberFormatException -> Lb1
                java.lang.String r3 = "expected chunk size and optional extensions"
                r2.append(r3)     // Catch: java.lang.NumberFormatException -> Lb1
                java.lang.String r3 = " but was \""
                r2.append(r3)     // Catch: java.lang.NumberFormatException -> Lb1
                long r3 = r7.f30347d     // Catch: java.lang.NumberFormatException -> Lb1
                r2.append(r3)     // Catch: java.lang.NumberFormatException -> Lb1
                r2.append(r0)     // Catch: java.lang.NumberFormatException -> Lb1
                r0 = 34
                r2.append(r0)     // Catch: java.lang.NumberFormatException -> Lb1
                java.lang.String r0 = r2.toString()     // Catch: java.lang.NumberFormatException -> Lb1
                r1.<init>(r0)     // Catch: java.lang.NumberFormatException -> Lb1
                throw r1     // Catch: java.lang.NumberFormatException -> Lb1
            La9:
                java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch: java.lang.NumberFormatException -> Lb1
                java.lang.String r1 = "null cannot be cast to non-null type kotlin.CharSequence"
                r0.<init>(r1)     // Catch: java.lang.NumberFormatException -> Lb1
                throw r0     // Catch: java.lang.NumberFormatException -> Lb1
            Lb1:
                r0 = move-exception
                java.net.ProtocolException r1 = new java.net.ProtocolException
                java.lang.String r0 = r0.getMessage()
                r1.<init>(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: ff.b.c.e():void");
        }

        @Override // mf.e0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (a()) {
                return;
            }
            if (this.f30348e && !ze.c.p(this, 100, TimeUnit.MILLISECONDS)) {
                this.f30350g.b().z();
                b();
            }
            d(true);
        }

        @Override // ff.b.a, mf.e0
        public long e0(mf.f fVar, long j10) {
            k.f(fVar, "sink");
            if (j10 >= 0) {
                if (true ^ a()) {
                    if (this.f30348e) {
                        long j11 = this.f30347d;
                        if (j11 == 0 || j11 == -1) {
                            e();
                            if (!this.f30348e) {
                                return -1L;
                            }
                        }
                        long e02 = super.e0(fVar, Math.min(j10, this.f30347d));
                        if (e02 != -1) {
                            this.f30347d -= e02;
                            return e02;
                        }
                        this.f30350g.b().z();
                        ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                        b();
                        throw protocolException;
                    }
                    return -1L;
                }
                throw new IllegalStateException(RNAdsEvents.EVENT_CLOSED.toString());
            }
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        }
    }

    /* compiled from: Http1ExchangeCodec.kt */
    /* loaded from: classes3.dex */
    public static final class d {
        private d() {
        }

        public /* synthetic */ d(qe.g gVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Http1ExchangeCodec.kt */
    /* loaded from: classes3.dex */
    public final class e extends a {

        /* renamed from: d  reason: collision with root package name */
        private long f30351d;

        public e(long j10) {
            super();
            this.f30351d = j10;
            if (j10 == 0) {
                b();
            }
        }

        @Override // mf.e0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (a()) {
                return;
            }
            if (this.f30351d != 0 && !ze.c.p(this, 100, TimeUnit.MILLISECONDS)) {
                b.this.b().z();
                b();
            }
            d(true);
        }

        @Override // ff.b.a, mf.e0
        public long e0(mf.f fVar, long j10) {
            k.f(fVar, "sink");
            if (j10 >= 0) {
                if (true ^ a()) {
                    long j11 = this.f30351d;
                    if (j11 == 0) {
                        return -1L;
                    }
                    long e02 = super.e0(fVar, Math.min(j11, j10));
                    if (e02 != -1) {
                        long j12 = this.f30351d - e02;
                        this.f30351d = j12;
                        if (j12 == 0) {
                            b();
                        }
                        return e02;
                    }
                    b.this.b().z();
                    ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                    b();
                    throw protocolException;
                }
                throw new IllegalStateException(RNAdsEvents.EVENT_CLOSED.toString());
            }
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Http1ExchangeCodec.kt */
    /* loaded from: classes3.dex */
    public final class f implements c0 {

        /* renamed from: a  reason: collision with root package name */
        private final m f30353a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f30354b;

        public f() {
            this.f30353a = new m(b.this.f30340g.k());
        }

        @Override // mf.c0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f30354b) {
                return;
            }
            this.f30354b = true;
            b.this.r(this.f30353a);
            b.this.f30334a = 3;
        }

        @Override // mf.c0, java.io.Flushable
        public void flush() {
            if (this.f30354b) {
                return;
            }
            b.this.f30340g.flush();
        }

        @Override // mf.c0
        public f0 k() {
            return this.f30353a;
        }

        @Override // mf.c0
        public void n0(mf.f fVar, long j10) {
            k.f(fVar, "source");
            if (!this.f30354b) {
                ze.c.i(fVar.C0(), 0L, j10);
                b.this.f30340g.n0(fVar, j10);
                return;
            }
            throw new IllegalStateException(RNAdsEvents.EVENT_CLOSED.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Http1ExchangeCodec.kt */
    /* loaded from: classes3.dex */
    public final class g extends a {

        /* renamed from: d  reason: collision with root package name */
        private boolean f30356d;

        public g(b bVar) {
            super();
        }

        @Override // mf.e0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (a()) {
                return;
            }
            if (!this.f30356d) {
                b();
            }
            d(true);
        }

        @Override // ff.b.a, mf.e0
        public long e0(mf.f fVar, long j10) {
            k.f(fVar, "sink");
            if (j10 >= 0) {
                if (!a()) {
                    if (this.f30356d) {
                        return -1L;
                    }
                    long e02 = super.e0(fVar, j10);
                    if (e02 == -1) {
                        this.f30356d = true;
                        b();
                        return -1L;
                    }
                    return e02;
                }
                throw new IllegalStateException(RNAdsEvents.EVENT_CLOSED.toString());
            }
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        }
    }

    static {
        new d(null);
    }

    public b(z zVar, df.f fVar, h hVar, mf.g gVar) {
        k.f(fVar, "connection");
        k.f(hVar, "source");
        k.f(gVar, "sink");
        this.f30337d = zVar;
        this.f30338e = fVar;
        this.f30339f = hVar;
        this.f30340g = gVar;
        this.f30335b = new ff.a(hVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r(m mVar) {
        f0 i10 = mVar.i();
        mVar.j(f0.f34457d);
        i10.a();
        i10.b();
    }

    private final boolean s(b0 b0Var) {
        boolean l10;
        l10 = p.l("chunked", b0Var.d("Transfer-Encoding"), true);
        return l10;
    }

    private final boolean t(d0 d0Var) {
        boolean l10;
        l10 = p.l("chunked", d0.z(d0Var, "Transfer-Encoding", null, 2, null), true);
        return l10;
    }

    private final c0 u() {
        if (this.f30334a == 1) {
            this.f30334a = 2;
            return new C0386b();
        }
        throw new IllegalStateException(("state: " + this.f30334a).toString());
    }

    private final e0 v(u uVar) {
        if (this.f30334a == 4) {
            this.f30334a = 5;
            return new c(this, uVar);
        }
        throw new IllegalStateException(("state: " + this.f30334a).toString());
    }

    private final e0 w(long j10) {
        if (this.f30334a == 4) {
            this.f30334a = 5;
            return new e(j10);
        }
        throw new IllegalStateException(("state: " + this.f30334a).toString());
    }

    private final c0 x() {
        if (this.f30334a == 1) {
            this.f30334a = 2;
            return new f();
        }
        throw new IllegalStateException(("state: " + this.f30334a).toString());
    }

    private final e0 y() {
        if (this.f30334a == 4) {
            this.f30334a = 5;
            b().z();
            return new g(this);
        }
        throw new IllegalStateException(("state: " + this.f30334a).toString());
    }

    public final void A(t tVar, String str) {
        k.f(tVar, "headers");
        k.f(str, "requestLine");
        if (this.f30334a == 0) {
            this.f30340g.M(str).M("\r\n");
            int size = tVar.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f30340g.M(tVar.c(i10)).M(": ").M(tVar.h(i10)).M("\r\n");
            }
            this.f30340g.M("\r\n");
            this.f30334a = 1;
            return;
        }
        throw new IllegalStateException(("state: " + this.f30334a).toString());
    }

    @Override // ef.d
    public void a() {
        this.f30340g.flush();
    }

    @Override // ef.d
    public df.f b() {
        return this.f30338e;
    }

    @Override // ef.d
    public e0 c(d0 d0Var) {
        k.f(d0Var, "response");
        if (ef.e.b(d0Var)) {
            if (t(d0Var)) {
                return v(d0Var.d0().l());
            }
            long s10 = ze.c.s(d0Var);
            if (s10 != -1) {
                return w(s10);
            }
            return y();
        }
        return w(0L);
    }

    @Override // ef.d
    public void cancel() {
        b().d();
    }

    @Override // ef.d
    public d0.a d(boolean z10) {
        int i10 = this.f30334a;
        boolean z11 = true;
        if (i10 != 1 && i10 != 3) {
            z11 = false;
        }
        if (z11) {
            try {
                ef.k a10 = ef.k.f29836d.a(this.f30335b.b());
                d0.a k10 = new d0.a().p(a10.f29837a).g(a10.f29838b).m(a10.f29839c).k(this.f30335b.a());
                if (z10 && a10.f29838b == 100) {
                    return null;
                }
                if (a10.f29838b == 100) {
                    this.f30334a = 3;
                    return k10;
                }
                this.f30334a = 4;
                return k10;
            } catch (EOFException e10) {
                String o10 = b().A().a().l().o();
                throw new IOException("unexpected end of stream on " + o10, e10);
            }
        }
        throw new IllegalStateException(("state: " + this.f30334a).toString());
    }

    @Override // ef.d
    public void e(b0 b0Var) {
        k.f(b0Var, "request");
        i iVar = i.f29834a;
        Proxy.Type type = b().A().b().type();
        k.e(type, "connection.route().proxy.type()");
        A(b0Var.f(), iVar.a(b0Var, type));
    }

    @Override // ef.d
    public long f(d0 d0Var) {
        k.f(d0Var, "response");
        if (ef.e.b(d0Var)) {
            if (t(d0Var)) {
                return -1L;
            }
            return ze.c.s(d0Var);
        }
        return 0L;
    }

    @Override // ef.d
    public c0 g(b0 b0Var, long j10) {
        k.f(b0Var, "request");
        if (b0Var.a() == null || !b0Var.a().isDuplex()) {
            if (s(b0Var)) {
                return u();
            }
            if (j10 != -1) {
                return x();
            }
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
        throw new ProtocolException("Duplex connections are not supported for HTTP/1");
    }

    @Override // ef.d
    public void h() {
        this.f30340g.flush();
    }

    public final void z(d0 d0Var) {
        k.f(d0Var, "response");
        long s10 = ze.c.s(d0Var);
        if (s10 == -1) {
            return;
        }
        e0 w10 = w(s10);
        ze.c.J(w10, Api.BaseClientBuilder.API_PRIORITY_OTHER, TimeUnit.MILLISECONDS);
        w10.close();
    }
}
