package gf;

import ef.k;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import mf.c0;
import mf.e0;
import ye.a0;
import ye.b0;
import ye.d0;
import ye.t;
import ye.z;

/* compiled from: Http2ExchangeCodec.kt */
/* loaded from: classes3.dex */
public final class g implements ef.d {

    /* renamed from: a  reason: collision with root package name */
    private volatile i f30986a;

    /* renamed from: b  reason: collision with root package name */
    private final a0 f30987b;

    /* renamed from: c  reason: collision with root package name */
    private volatile boolean f30988c;

    /* renamed from: d  reason: collision with root package name */
    private final df.f f30989d;

    /* renamed from: e  reason: collision with root package name */
    private final ef.g f30990e;

    /* renamed from: f  reason: collision with root package name */
    private final f f30991f;

    /* renamed from: i  reason: collision with root package name */
    public static final a f30985i = new a(null);

    /* renamed from: g  reason: collision with root package name */
    private static final List<String> f30983g = ze.c.t("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");

    /* renamed from: h  reason: collision with root package name */
    private static final List<String> f30984h = ze.c.t("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* compiled from: Http2ExchangeCodec.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public final List<c> a(b0 b0Var) {
            qe.k.f(b0Var, "request");
            t f10 = b0Var.f();
            ArrayList arrayList = new ArrayList(f10.size() + 4);
            arrayList.add(new c(c.f30877f, b0Var.h()));
            arrayList.add(new c(c.f30878g, ef.i.f29834a.c(b0Var.l())));
            String d10 = b0Var.d("Host");
            if (d10 != null) {
                arrayList.add(new c(c.f30880i, d10));
            }
            arrayList.add(new c(c.f30879h, b0Var.l().q()));
            int size = f10.size();
            for (int i10 = 0; i10 < size; i10++) {
                String c10 = f10.c(i10);
                Locale locale = Locale.US;
                qe.k.e(locale, "Locale.US");
                Objects.requireNonNull(c10, "null cannot be cast to non-null type java.lang.String");
                String lowerCase = c10.toLowerCase(locale);
                qe.k.e(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                if (!g.f30983g.contains(lowerCase) || (qe.k.a(lowerCase, "te") && qe.k.a(f10.h(i10), "trailers"))) {
                    arrayList.add(new c(lowerCase, f10.h(i10)));
                }
            }
            return arrayList;
        }

        public final d0.a b(t tVar, a0 a0Var) {
            qe.k.f(tVar, "headerBlock");
            qe.k.f(a0Var, "protocol");
            t.a aVar = new t.a();
            int size = tVar.size();
            ef.k kVar = null;
            for (int i10 = 0; i10 < size; i10++) {
                String c10 = tVar.c(i10);
                String h10 = tVar.h(i10);
                if (!qe.k.a(c10, ":status")) {
                    if (!g.f30984h.contains(c10)) {
                        aVar.c(c10, h10);
                    }
                } else {
                    k.a aVar2 = ef.k.f29836d;
                    kVar = aVar2.a("HTTP/1.1 " + h10);
                }
            }
            if (kVar != null) {
                return new d0.a().p(a0Var).g(kVar.f29838b).m(kVar.f29839c).k(aVar.d());
            }
            throw new ProtocolException("Expected ':status' header not present");
        }

        public /* synthetic */ a(qe.g gVar) {
            this();
        }
    }

    public g(z zVar, df.f fVar, ef.g gVar, f fVar2) {
        qe.k.f(zVar, "client");
        qe.k.f(fVar, "connection");
        qe.k.f(gVar, "chain");
        qe.k.f(fVar2, "http2Connection");
        this.f30989d = fVar;
        this.f30990e = gVar;
        this.f30991f = fVar2;
        List<a0> C = zVar.C();
        a0 a0Var = a0.H2_PRIOR_KNOWLEDGE;
        this.f30987b = C.contains(a0Var) ? a0Var : a0.HTTP_2;
    }

    @Override // ef.d
    public void a() {
        i iVar = this.f30986a;
        qe.k.c(iVar);
        iVar.n().close();
    }

    @Override // ef.d
    public df.f b() {
        return this.f30989d;
    }

    @Override // ef.d
    public e0 c(d0 d0Var) {
        qe.k.f(d0Var, "response");
        i iVar = this.f30986a;
        qe.k.c(iVar);
        return iVar.p();
    }

    @Override // ef.d
    public void cancel() {
        this.f30988c = true;
        i iVar = this.f30986a;
        if (iVar != null) {
            iVar.f(b.CANCEL);
        }
    }

    @Override // ef.d
    public d0.a d(boolean z10) {
        i iVar = this.f30986a;
        qe.k.c(iVar);
        d0.a b10 = f30985i.b(iVar.C(), this.f30987b);
        if (z10 && b10.h() == 100) {
            return null;
        }
        return b10;
    }

    @Override // ef.d
    public void e(b0 b0Var) {
        qe.k.f(b0Var, "request");
        if (this.f30986a != null) {
            return;
        }
        this.f30986a = this.f30991f.X0(f30985i.a(b0Var), b0Var.a() != null);
        if (!this.f30988c) {
            i iVar = this.f30986a;
            qe.k.c(iVar);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            iVar.v().g(this.f30990e.g(), timeUnit);
            i iVar2 = this.f30986a;
            qe.k.c(iVar2);
            iVar2.E().g(this.f30990e.i(), timeUnit);
            return;
        }
        i iVar3 = this.f30986a;
        qe.k.c(iVar3);
        iVar3.f(b.CANCEL);
        throw new IOException("Canceled");
    }

    @Override // ef.d
    public long f(d0 d0Var) {
        qe.k.f(d0Var, "response");
        if (ef.e.b(d0Var)) {
            return ze.c.s(d0Var);
        }
        return 0L;
    }

    @Override // ef.d
    public c0 g(b0 b0Var, long j10) {
        qe.k.f(b0Var, "request");
        i iVar = this.f30986a;
        qe.k.c(iVar);
        return iVar.n();
    }

    @Override // ef.d
    public void h() {
        this.f30991f.flush();
    }
}
