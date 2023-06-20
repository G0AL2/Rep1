package df;

import com.vehiclecloud.app.videofetch.rnads.api.RNAdsEvents;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.SocketException;
import lf.d;
import mf.c0;
import mf.e0;
import mf.l;
import ye.b0;
import ye.d0;
import ye.r;

/* compiled from: Exchange.kt */
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private boolean f29376a;

    /* renamed from: b  reason: collision with root package name */
    private final f f29377b;

    /* renamed from: c  reason: collision with root package name */
    private final e f29378c;

    /* renamed from: d  reason: collision with root package name */
    private final r f29379d;

    /* renamed from: e  reason: collision with root package name */
    private final d f29380e;

    /* renamed from: f  reason: collision with root package name */
    private final ef.d f29381f;

    /* compiled from: Exchange.kt */
    /* loaded from: classes3.dex */
    private final class a extends mf.k {

        /* renamed from: b  reason: collision with root package name */
        private boolean f29382b;

        /* renamed from: c  reason: collision with root package name */
        private long f29383c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f29384d;

        /* renamed from: e  reason: collision with root package name */
        private final long f29385e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ c f29386f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(c cVar, c0 c0Var, long j10) {
            super(c0Var);
            qe.k.f(c0Var, "delegate");
            this.f29386f = cVar;
            this.f29385e = j10;
        }

        private final <E extends IOException> E a(E e10) {
            if (this.f29382b) {
                return e10;
            }
            this.f29382b = true;
            return (E) this.f29386f.a(this.f29383c, false, true, e10);
        }

        @Override // mf.k, mf.c0, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f29384d) {
                return;
            }
            this.f29384d = true;
            long j10 = this.f29385e;
            if (j10 != -1 && this.f29383c != j10) {
                throw new ProtocolException("unexpected end of stream");
            }
            try {
                super.close();
                a(null);
            } catch (IOException e10) {
                throw a(e10);
            }
        }

        @Override // mf.k, mf.c0, java.io.Flushable
        public void flush() throws IOException {
            try {
                super.flush();
            } catch (IOException e10) {
                throw a(e10);
            }
        }

        @Override // mf.k, mf.c0
        public void n0(mf.f fVar, long j10) throws IOException {
            qe.k.f(fVar, "source");
            if (!this.f29384d) {
                long j11 = this.f29385e;
                if (j11 != -1 && this.f29383c + j10 > j11) {
                    throw new ProtocolException("expected " + this.f29385e + " bytes but received " + (this.f29383c + j10));
                }
                try {
                    super.n0(fVar, j10);
                    this.f29383c += j10;
                    return;
                } catch (IOException e10) {
                    throw a(e10);
                }
            }
            throw new IllegalStateException(RNAdsEvents.EVENT_CLOSED.toString());
        }
    }

    /* compiled from: Exchange.kt */
    /* loaded from: classes3.dex */
    public final class b extends l {

        /* renamed from: b  reason: collision with root package name */
        private long f29387b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f29388c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f29389d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f29390e;

        /* renamed from: f  reason: collision with root package name */
        private final long f29391f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ c f29392g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(c cVar, e0 e0Var, long j10) {
            super(e0Var);
            qe.k.f(e0Var, "delegate");
            this.f29392g = cVar;
            this.f29391f = j10;
            this.f29388c = true;
            if (j10 == 0) {
                b(null);
            }
        }

        public final <E extends IOException> E b(E e10) {
            if (this.f29389d) {
                return e10;
            }
            this.f29389d = true;
            if (e10 == null && this.f29388c) {
                this.f29388c = false;
                this.f29392g.i().w(this.f29392g.g());
            }
            return (E) this.f29392g.a(this.f29387b, true, false, e10);
        }

        @Override // mf.l, mf.e0, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f29390e) {
                return;
            }
            this.f29390e = true;
            try {
                super.close();
                b(null);
            } catch (IOException e10) {
                throw b(e10);
            }
        }

        @Override // mf.l, mf.e0
        public long e0(mf.f fVar, long j10) throws IOException {
            qe.k.f(fVar, "sink");
            if (!this.f29390e) {
                try {
                    long e02 = a().e0(fVar, j10);
                    if (this.f29388c) {
                        this.f29388c = false;
                        this.f29392g.i().w(this.f29392g.g());
                    }
                    if (e02 == -1) {
                        b(null);
                        return -1L;
                    }
                    long j11 = this.f29387b + e02;
                    long j12 = this.f29391f;
                    if (j12 != -1 && j11 > j12) {
                        throw new ProtocolException("expected " + this.f29391f + " bytes but received " + j11);
                    }
                    this.f29387b = j11;
                    if (j11 == j12) {
                        b(null);
                    }
                    return e02;
                } catch (IOException e10) {
                    throw b(e10);
                }
            }
            throw new IllegalStateException(RNAdsEvents.EVENT_CLOSED.toString());
        }
    }

    public c(e eVar, r rVar, d dVar, ef.d dVar2) {
        qe.k.f(eVar, "call");
        qe.k.f(rVar, "eventListener");
        qe.k.f(dVar, "finder");
        qe.k.f(dVar2, "codec");
        this.f29378c = eVar;
        this.f29379d = rVar;
        this.f29380e = dVar;
        this.f29381f = dVar2;
        this.f29377b = dVar2.b();
    }

    private final void t(IOException iOException) {
        this.f29380e.h(iOException);
        this.f29381f.b().H(this.f29378c, iOException);
    }

    public final <E extends IOException> E a(long j10, boolean z10, boolean z11, E e10) {
        if (e10 != null) {
            t(e10);
        }
        if (z11) {
            if (e10 != null) {
                this.f29379d.s(this.f29378c, e10);
            } else {
                this.f29379d.q(this.f29378c, j10);
            }
        }
        if (z10) {
            if (e10 != null) {
                this.f29379d.x(this.f29378c, e10);
            } else {
                this.f29379d.v(this.f29378c, j10);
            }
        }
        return (E) this.f29378c.t(this, z11, z10, e10);
    }

    public final void b() {
        this.f29381f.cancel();
    }

    public final c0 c(b0 b0Var, boolean z10) throws IOException {
        qe.k.f(b0Var, "request");
        this.f29376a = z10;
        ye.c0 a10 = b0Var.a();
        qe.k.c(a10);
        long contentLength = a10.contentLength();
        this.f29379d.r(this.f29378c);
        return new a(this, this.f29381f.g(b0Var, contentLength), contentLength);
    }

    public final void d() {
        this.f29381f.cancel();
        this.f29378c.t(this, true, true, null);
    }

    public final void e() throws IOException {
        try {
            this.f29381f.a();
        } catch (IOException e10) {
            this.f29379d.s(this.f29378c, e10);
            t(e10);
            throw e10;
        }
    }

    public final void f() throws IOException {
        try {
            this.f29381f.h();
        } catch (IOException e10) {
            this.f29379d.s(this.f29378c, e10);
            t(e10);
            throw e10;
        }
    }

    public final e g() {
        return this.f29378c;
    }

    public final f h() {
        return this.f29377b;
    }

    public final r i() {
        return this.f29379d;
    }

    public final d j() {
        return this.f29380e;
    }

    public final boolean k() {
        return !qe.k.a(this.f29380e.d().l().h(), this.f29377b.A().a().l().h());
    }

    public final boolean l() {
        return this.f29376a;
    }

    public final d.AbstractC0446d m() throws SocketException {
        this.f29378c.z();
        return this.f29381f.b().x(this);
    }

    public final void n() {
        this.f29381f.b().z();
    }

    public final void o() {
        this.f29378c.t(this, true, false, null);
    }

    public final ye.e0 p(d0 d0Var) throws IOException {
        qe.k.f(d0Var, "response");
        try {
            String z10 = d0.z(d0Var, "Content-Type", null, 2, null);
            long f10 = this.f29381f.f(d0Var);
            return new ef.h(z10, f10, mf.r.d(new b(this, this.f29381f.c(d0Var), f10)));
        } catch (IOException e10) {
            this.f29379d.x(this.f29378c, e10);
            t(e10);
            throw e10;
        }
    }

    public final d0.a q(boolean z10) throws IOException {
        try {
            d0.a d10 = this.f29381f.d(z10);
            if (d10 != null) {
                d10.l(this);
            }
            return d10;
        } catch (IOException e10) {
            this.f29379d.x(this.f29378c, e10);
            t(e10);
            throw e10;
        }
    }

    public final void r(d0 d0Var) {
        qe.k.f(d0Var, "response");
        this.f29379d.y(this.f29378c, d0Var);
    }

    public final void s() {
        this.f29379d.z(this.f29378c);
    }

    public final void u() {
        a(-1L, true, true, null);
    }

    public final void v(b0 b0Var) throws IOException {
        qe.k.f(b0Var, "request");
        try {
            this.f29379d.u(this.f29378c);
            this.f29381f.e(b0Var);
            this.f29379d.t(this.f29378c, b0Var);
        } catch (IOException e10) {
            this.f29379d.s(this.f29378c, e10);
            t(e10);
            throw e10;
        }
    }
}
