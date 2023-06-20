package df;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import fe.q;
import gf.f;
import gf.m;
import gf.n;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.ConnectException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.security.Principal;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import lf.d;
import qe.l;
import ve.p;
import ye.a0;
import ye.b0;
import ye.d0;
import ye.f0;
import ye.r;
import ye.s;
import ye.u;
import ye.z;

/* compiled from: RealConnection.kt */
/* loaded from: classes3.dex */
public final class f extends f.d implements ye.j {

    /* renamed from: b  reason: collision with root package name */
    private Socket f29426b;

    /* renamed from: c  reason: collision with root package name */
    private Socket f29427c;

    /* renamed from: d  reason: collision with root package name */
    private s f29428d;

    /* renamed from: e  reason: collision with root package name */
    private a0 f29429e;

    /* renamed from: f  reason: collision with root package name */
    private gf.f f29430f;

    /* renamed from: g  reason: collision with root package name */
    private mf.h f29431g;

    /* renamed from: h  reason: collision with root package name */
    private mf.g f29432h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f29433i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f29434j;

    /* renamed from: k  reason: collision with root package name */
    private int f29435k;

    /* renamed from: l  reason: collision with root package name */
    private int f29436l;

    /* renamed from: m  reason: collision with root package name */
    private int f29437m;

    /* renamed from: n  reason: collision with root package name */
    private int f29438n;

    /* renamed from: o  reason: collision with root package name */
    private final List<Reference<e>> f29439o;

    /* renamed from: p  reason: collision with root package name */
    private long f29440p;

    /* renamed from: q  reason: collision with root package name */
    private final f0 f29441q;

    /* compiled from: RealConnection.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qe.g gVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RealConnection.kt */
    /* loaded from: classes3.dex */
    public static final class b extends l implements pe.a<List<? extends Certificate>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ye.g f29442a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ s f29443b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ye.a f29444c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(ye.g gVar, s sVar, ye.a aVar) {
            super(0);
            this.f29442a = gVar;
            this.f29443b = sVar;
            this.f29444c = aVar;
        }

        @Override // pe.a
        /* renamed from: a */
        public final List<Certificate> invoke() {
            kf.c d10 = this.f29442a.d();
            qe.k.c(d10);
            return d10.a(this.f29443b.d(), this.f29444c.l().h());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RealConnection.kt */
    /* loaded from: classes3.dex */
    public static final class c extends l implements pe.a<List<? extends X509Certificate>> {
        c() {
            super(0);
        }

        @Override // pe.a
        /* renamed from: a */
        public final List<X509Certificate> invoke() {
            int p10;
            s sVar = f.this.f29428d;
            qe.k.c(sVar);
            List<Certificate> d10 = sVar.d();
            p10 = q.p(d10, 10);
            ArrayList arrayList = new ArrayList(p10);
            for (Certificate certificate : d10) {
                Objects.requireNonNull(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                arrayList.add((X509Certificate) certificate);
            }
            return arrayList;
        }
    }

    /* compiled from: RealConnection.kt */
    /* loaded from: classes3.dex */
    public static final class d extends d.AbstractC0446d {

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ df.c f29446d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ mf.h f29447e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ mf.g f29448f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(df.c cVar, mf.h hVar, mf.g gVar, boolean z10, mf.h hVar2, mf.g gVar2) {
            super(z10, hVar2, gVar2);
            this.f29446d = cVar;
            this.f29447e = hVar;
            this.f29448f = gVar;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f29446d.a(-1L, true, true, null);
        }
    }

    static {
        new a(null);
    }

    public f(h hVar, f0 f0Var) {
        qe.k.f(hVar, "connectionPool");
        qe.k.f(f0Var, "route");
        this.f29441q = f0Var;
        this.f29438n = 1;
        this.f29439o = new ArrayList();
        this.f29440p = Long.MAX_VALUE;
    }

    private final boolean B(List<f0> list) {
        boolean z10;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (f0 f0Var : list) {
                if (f0Var.b().type() == Proxy.Type.DIRECT && this.f29441q.b().type() == Proxy.Type.DIRECT && qe.k.a(this.f29441q.d(), f0Var.d())) {
                    z10 = true;
                    continue;
                } else {
                    z10 = false;
                    continue;
                }
                if (z10) {
                    return true;
                }
            }
        }
        return false;
    }

    private final void F(int i10) throws IOException {
        Socket socket = this.f29427c;
        qe.k.c(socket);
        mf.h hVar = this.f29431g;
        qe.k.c(hVar);
        mf.g gVar = this.f29432h;
        qe.k.c(gVar);
        socket.setSoTimeout(0);
        gf.f a10 = new f.b(true, cf.e.f5513h).m(socket, this.f29441q.a().l().h(), hVar, gVar).k(this).l(i10).a();
        this.f29430f = a10;
        this.f29438n = gf.f.D.a().d();
        gf.f.o1(a10, false, null, 3, null);
    }

    private final boolean G(u uVar) {
        s sVar;
        if (ze.c.f40525g && !Thread.holdsLock(this)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Thread ");
            Thread currentThread = Thread.currentThread();
            qe.k.e(currentThread, "Thread.currentThread()");
            sb2.append(currentThread.getName());
            sb2.append(" MUST hold lock on ");
            sb2.append(this);
            throw new AssertionError(sb2.toString());
        }
        u l10 = this.f29441q.a().l();
        if (uVar.m() != l10.m()) {
            return false;
        }
        if (qe.k.a(uVar.h(), l10.h())) {
            return true;
        }
        if (this.f29434j || (sVar = this.f29428d) == null) {
            return false;
        }
        qe.k.c(sVar);
        return e(uVar, sVar);
    }

    private final boolean e(u uVar, s sVar) {
        List<Certificate> d10 = sVar.d();
        if (!d10.isEmpty()) {
            kf.d dVar = kf.d.f33467a;
            String h10 = uVar.h();
            Certificate certificate = d10.get(0);
            Objects.requireNonNull(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            if (dVar.e(h10, (X509Certificate) certificate)) {
                return true;
            }
        }
        return false;
    }

    private final void h(int i10, int i11, ye.e eVar, r rVar) throws IOException {
        Socket socket;
        int i12;
        Proxy b10 = this.f29441q.b();
        ye.a a10 = this.f29441q.a();
        Proxy.Type type = b10.type();
        if (type == null || ((i12 = g.f29449a[type.ordinal()]) != 1 && i12 != 2)) {
            socket = new Socket(b10);
        } else {
            socket = a10.j().createSocket();
            qe.k.c(socket);
        }
        this.f29426b = socket;
        rVar.j(eVar, this.f29441q.d(), b10);
        socket.setSoTimeout(i11);
        try {
            okhttp3.internal.platform.h.f35277c.g().f(socket, this.f29441q.d(), i10);
            try {
                this.f29431g = mf.r.d(mf.r.l(socket));
                this.f29432h = mf.r.c(mf.r.h(socket));
            } catch (NullPointerException e10) {
                if (qe.k.a(e10.getMessage(), "throw with null exception")) {
                    throw new IOException(e10);
                }
            }
        } catch (ConnectException e11) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.f29441q.d());
            connectException.initCause(e11);
            throw connectException;
        }
    }

    private final void i(df.b bVar) throws IOException {
        String e10;
        ye.a a10 = this.f29441q.a();
        SSLSocketFactory k10 = a10.k();
        SSLSocket sSLSocket = null;
        try {
            qe.k.c(k10);
            Socket createSocket = k10.createSocket(this.f29426b, a10.l().h(), a10.l().m(), true);
            if (createSocket != null) {
                SSLSocket sSLSocket2 = (SSLSocket) createSocket;
                try {
                    ye.l a11 = bVar.a(sSLSocket2);
                    if (a11.h()) {
                        okhttp3.internal.platform.h.f35277c.g().e(sSLSocket2, a10.l().h(), a10.f());
                    }
                    sSLSocket2.startHandshake();
                    SSLSession session = sSLSocket2.getSession();
                    s.a aVar = s.f39744e;
                    qe.k.e(session, "sslSocketSession");
                    s a12 = aVar.a(session);
                    HostnameVerifier e11 = a10.e();
                    qe.k.c(e11);
                    if (!e11.verify(a10.l().h(), session)) {
                        List<Certificate> d10 = a12.d();
                        if (!d10.isEmpty()) {
                            Certificate certificate = d10.get(0);
                            if (certificate == null) {
                                throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
                            }
                            X509Certificate x509Certificate = (X509Certificate) certificate;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("\n              |Hostname ");
                            sb2.append(a10.l().h());
                            sb2.append(" not verified:\n              |    certificate: ");
                            sb2.append(ye.g.f39657d.a(x509Certificate));
                            sb2.append("\n              |    DN: ");
                            Principal subjectDN = x509Certificate.getSubjectDN();
                            qe.k.e(subjectDN, "cert.subjectDN");
                            sb2.append(subjectDN.getName());
                            sb2.append("\n              |    subjectAltNames: ");
                            sb2.append(kf.d.f33467a.a(x509Certificate));
                            sb2.append("\n              ");
                            e10 = ve.i.e(sb2.toString(), null, 1, null);
                            throw new SSLPeerUnverifiedException(e10);
                        }
                        throw new SSLPeerUnverifiedException("Hostname " + a10.l().h() + " not verified (no certificates)");
                    }
                    ye.g a13 = a10.a();
                    qe.k.c(a13);
                    this.f29428d = new s(a12.e(), a12.a(), a12.c(), new b(a13, a12, a10));
                    a13.b(a10.l().h(), new c());
                    String h10 = a11.h() ? okhttp3.internal.platform.h.f35277c.g().h(sSLSocket2) : null;
                    this.f29427c = sSLSocket2;
                    this.f29431g = mf.r.d(mf.r.l(sSLSocket2));
                    this.f29432h = mf.r.c(mf.r.h(sSLSocket2));
                    this.f29429e = h10 != null ? a0.f39546i.a(h10) : a0.HTTP_1_1;
                    okhttp3.internal.platform.h.f35277c.g().b(sSLSocket2);
                    return;
                } catch (Throwable th) {
                    th = th;
                    sSLSocket = sSLSocket2;
                    if (sSLSocket != null) {
                        okhttp3.internal.platform.h.f35277c.g().b(sSLSocket);
                    }
                    if (sSLSocket != null) {
                        ze.c.k(sSLSocket);
                    }
                    throw th;
                }
            }
            throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.SSLSocket");
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private final void j(int i10, int i11, int i12, ye.e eVar, r rVar) throws IOException {
        b0 l10 = l();
        u l11 = l10.l();
        for (int i13 = 0; i13 < 21; i13++) {
            h(i10, i11, eVar, rVar);
            l10 = k(i11, i12, l10, l11);
            if (l10 == null) {
                return;
            }
            Socket socket = this.f29426b;
            if (socket != null) {
                ze.c.k(socket);
            }
            this.f29426b = null;
            this.f29432h = null;
            this.f29431g = null;
            rVar.h(eVar, this.f29441q.d(), this.f29441q.b(), null);
        }
    }

    private final b0 k(int i10, int i11, b0 b0Var, u uVar) throws IOException {
        boolean l10;
        String str = "CONNECT " + ze.c.P(uVar, true) + " HTTP/1.1";
        while (true) {
            mf.h hVar = this.f29431g;
            qe.k.c(hVar);
            mf.g gVar = this.f29432h;
            qe.k.c(gVar);
            ff.b bVar = new ff.b(null, this, hVar, gVar);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            hVar.k().g(i10, timeUnit);
            gVar.k().g(i11, timeUnit);
            bVar.A(b0Var.f(), str);
            bVar.a();
            d0.a d10 = bVar.d(false);
            qe.k.c(d10);
            d0 c10 = d10.r(b0Var).c();
            bVar.z(c10);
            int h10 = c10.h();
            if (h10 == 200) {
                if (hVar.j().w0() && gVar.j().w0()) {
                    return null;
                }
                throw new IOException("TLS tunnel buffered too many bytes!");
            } else if (h10 == 407) {
                b0 a10 = this.f29441q.a().h().a(this.f29441q, c10);
                if (a10 != null) {
                    l10 = p.l("close", d0.z(c10, "Connection", null, 2, null), true);
                    if (l10) {
                        return a10;
                    }
                    b0Var = a10;
                } else {
                    throw new IOException("Failed to authenticate with proxy");
                }
            } else {
                throw new IOException("Unexpected response code for CONNECT: " + c10.h());
            }
        }
    }

    private final b0 l() throws IOException {
        b0 b10 = new b0.a().n(this.f29441q.a().l()).g("CONNECT", null).e("Host", ze.c.P(this.f29441q.a().l(), true)).e("Proxy-Connection", "Keep-Alive").e("User-Agent", "okhttp/4.9.2").b();
        b0 a10 = this.f29441q.a().h().a(this.f29441q, new d0.a().r(b10).p(a0.HTTP_1_1).g(TTAdConstant.DOWNLOAD_APP_INFO_CODE).m("Preemptive Authenticate").b(ze.c.f40521c).s(-1L).q(-1L).j("Proxy-Authenticate", "OkHttp-Preemptive").c());
        return a10 != null ? a10 : b10;
    }

    private final void m(df.b bVar, int i10, ye.e eVar, r rVar) throws IOException {
        if (this.f29441q.a().k() == null) {
            List<a0> f10 = this.f29441q.a().f();
            a0 a0Var = a0.H2_PRIOR_KNOWLEDGE;
            if (f10.contains(a0Var)) {
                this.f29427c = this.f29426b;
                this.f29429e = a0Var;
                F(i10);
                return;
            }
            this.f29427c = this.f29426b;
            this.f29429e = a0.HTTP_1_1;
            return;
        }
        rVar.C(eVar);
        i(bVar);
        rVar.B(eVar, this.f29428d);
        if (this.f29429e == a0.HTTP_2) {
            F(i10);
        }
    }

    public f0 A() {
        return this.f29441q;
    }

    public final void C(long j10) {
        this.f29440p = j10;
    }

    public final void D(boolean z10) {
        this.f29433i = z10;
    }

    public Socket E() {
        Socket socket = this.f29427c;
        qe.k.c(socket);
        return socket;
    }

    public final synchronized void H(e eVar, IOException iOException) {
        qe.k.f(eVar, "call");
        if (iOException instanceof n) {
            if (((n) iOException).f31047a == gf.b.REFUSED_STREAM) {
                int i10 = this.f29437m + 1;
                this.f29437m = i10;
                if (i10 > 1) {
                    this.f29433i = true;
                    this.f29435k++;
                }
            } else if (((n) iOException).f31047a != gf.b.CANCEL || !eVar.isCanceled()) {
                this.f29433i = true;
                this.f29435k++;
            }
        } else if (!v() || (iOException instanceof gf.a)) {
            this.f29433i = true;
            if (this.f29436l == 0) {
                if (iOException != null) {
                    g(eVar.k(), this.f29441q, iOException);
                }
                this.f29435k++;
            }
        }
    }

    @Override // gf.f.d
    public synchronized void a(gf.f fVar, m mVar) {
        qe.k.f(fVar, "connection");
        qe.k.f(mVar, "settings");
        this.f29438n = mVar.d();
    }

    @Override // gf.f.d
    public void b(gf.i iVar) throws IOException {
        qe.k.f(iVar, "stream");
        iVar.d(gf.b.REFUSED_STREAM, null);
    }

    public final void d() {
        Socket socket = this.f29426b;
        if (socket != null) {
            ze.c.k(socket);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00a2 A[Catch: IOException -> 0x00fd, TRY_LEAVE, TryCatch #1 {IOException -> 0x00fd, blocks: (B:21:0x009a, B:23:0x00a2), top: B:68:0x009a }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x014c A[EDGE_INSN: B:72:0x014c->B:61:0x014c ?: BREAK  ] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(int r17, int r18, int r19, int r20, boolean r21, ye.e r22, ye.r r23) {
        /*
            Method dump skipped, instructions count: 358
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: df.f.f(int, int, int, int, boolean, ye.e, ye.r):void");
    }

    public final void g(z zVar, f0 f0Var, IOException iOException) {
        qe.k.f(zVar, "client");
        qe.k.f(f0Var, "failedRoute");
        qe.k.f(iOException, "failure");
        if (f0Var.b().type() != Proxy.Type.DIRECT) {
            ye.a a10 = f0Var.a();
            a10.i().connectFailed(a10.l().r(), f0Var.b().address(), iOException);
        }
        zVar.u().b(f0Var);
    }

    public final List<Reference<e>> n() {
        return this.f29439o;
    }

    public final long o() {
        return this.f29440p;
    }

    public final boolean p() {
        return this.f29433i;
    }

    public final int q() {
        return this.f29435k;
    }

    public s r() {
        return this.f29428d;
    }

    public final synchronized void s() {
        this.f29436l++;
    }

    public final boolean t(ye.a aVar, List<f0> list) {
        qe.k.f(aVar, "address");
        if (ze.c.f40525g && !Thread.holdsLock(this)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Thread ");
            Thread currentThread = Thread.currentThread();
            qe.k.e(currentThread, "Thread.currentThread()");
            sb2.append(currentThread.getName());
            sb2.append(" MUST hold lock on ");
            sb2.append(this);
            throw new AssertionError(sb2.toString());
        } else if (this.f29439o.size() >= this.f29438n || this.f29433i || !this.f29441q.a().d(aVar)) {
            return false;
        } else {
            if (qe.k.a(aVar.l().h(), A().a().l().h())) {
                return true;
            }
            if (this.f29430f != null && list != null && B(list) && aVar.e() == kf.d.f33467a && G(aVar.l())) {
                try {
                    ye.g a10 = aVar.a();
                    qe.k.c(a10);
                    String h10 = aVar.l().h();
                    s r10 = r();
                    qe.k.c(r10);
                    a10.a(h10, r10.d());
                    return true;
                } catch (SSLPeerUnverifiedException unused) {
                    return false;
                }
            }
            return false;
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Connection{");
        sb2.append(this.f29441q.a().l().h());
        sb2.append(':');
        sb2.append(this.f29441q.a().l().m());
        sb2.append(',');
        sb2.append(" proxy=");
        sb2.append(this.f29441q.b());
        sb2.append(" hostAddress=");
        sb2.append(this.f29441q.d());
        sb2.append(" cipherSuite=");
        s sVar = this.f29428d;
        sb2.append((sVar == null || (r1 = sVar.a()) == null) ? "none" : "none");
        sb2.append(" protocol=");
        sb2.append(this.f29429e);
        sb2.append('}');
        return sb2.toString();
    }

    public final boolean u(boolean z10) {
        long j10;
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
        long nanoTime = System.nanoTime();
        Socket socket = this.f29426b;
        qe.k.c(socket);
        Socket socket2 = this.f29427c;
        qe.k.c(socket2);
        mf.h hVar = this.f29431g;
        qe.k.c(hVar);
        if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
            return false;
        }
        gf.f fVar = this.f29430f;
        if (fVar != null) {
            return fVar.T0(nanoTime);
        }
        synchronized (this) {
            j10 = nanoTime - this.f29440p;
        }
        if (j10 < 10000000000L || !z10) {
            return true;
        }
        return ze.c.D(socket2, hVar);
    }

    public final boolean v() {
        return this.f29430f != null;
    }

    public final ef.d w(z zVar, ef.g gVar) throws SocketException {
        qe.k.f(zVar, "client");
        qe.k.f(gVar, "chain");
        Socket socket = this.f29427c;
        qe.k.c(socket);
        mf.h hVar = this.f29431g;
        qe.k.c(hVar);
        mf.g gVar2 = this.f29432h;
        qe.k.c(gVar2);
        gf.f fVar = this.f29430f;
        if (fVar != null) {
            return new gf.g(zVar, this, gVar, fVar);
        }
        socket.setSoTimeout(gVar.j());
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        hVar.k().g(gVar.g(), timeUnit);
        gVar2.k().g(gVar.i(), timeUnit);
        return new ff.b(zVar, this, hVar, gVar2);
    }

    public final d.AbstractC0446d x(df.c cVar) throws SocketException {
        qe.k.f(cVar, "exchange");
        Socket socket = this.f29427c;
        qe.k.c(socket);
        mf.h hVar = this.f29431g;
        qe.k.c(hVar);
        mf.g gVar = this.f29432h;
        qe.k.c(gVar);
        socket.setSoTimeout(0);
        z();
        return new d(cVar, hVar, gVar, true, hVar, gVar);
    }

    public final synchronized void y() {
        this.f29434j = true;
    }

    public final synchronized void z() {
        this.f29433i = true;
    }
}
