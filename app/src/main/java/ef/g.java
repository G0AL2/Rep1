package ef;

import java.io.IOException;
import java.util.List;
import ye.b0;
import ye.d0;
import ye.v;

/* compiled from: RealInterceptorChain.kt */
/* loaded from: classes3.dex */
public final class g implements v.a {

    /* renamed from: a  reason: collision with root package name */
    private int f29822a;

    /* renamed from: b  reason: collision with root package name */
    private final df.e f29823b;

    /* renamed from: c  reason: collision with root package name */
    private final List<v> f29824c;

    /* renamed from: d  reason: collision with root package name */
    private final int f29825d;

    /* renamed from: e  reason: collision with root package name */
    private final df.c f29826e;

    /* renamed from: f  reason: collision with root package name */
    private final b0 f29827f;

    /* renamed from: g  reason: collision with root package name */
    private final int f29828g;

    /* renamed from: h  reason: collision with root package name */
    private final int f29829h;

    /* renamed from: i  reason: collision with root package name */
    private final int f29830i;

    /* JADX WARN: Multi-variable type inference failed */
    public g(df.e eVar, List<? extends v> list, int i10, df.c cVar, b0 b0Var, int i11, int i12, int i13) {
        qe.k.f(eVar, "call");
        qe.k.f(list, "interceptors");
        qe.k.f(b0Var, "request");
        this.f29823b = eVar;
        this.f29824c = list;
        this.f29825d = i10;
        this.f29826e = cVar;
        this.f29827f = b0Var;
        this.f29828g = i11;
        this.f29829h = i12;
        this.f29830i = i13;
    }

    public static /* synthetic */ g c(g gVar, int i10, df.c cVar, b0 b0Var, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = gVar.f29825d;
        }
        if ((i14 & 2) != 0) {
            cVar = gVar.f29826e;
        }
        df.c cVar2 = cVar;
        if ((i14 & 4) != 0) {
            b0Var = gVar.f29827f;
        }
        b0 b0Var2 = b0Var;
        if ((i14 & 8) != 0) {
            i11 = gVar.f29828g;
        }
        int i15 = i11;
        if ((i14 & 16) != 0) {
            i12 = gVar.f29829h;
        }
        int i16 = i12;
        if ((i14 & 32) != 0) {
            i13 = gVar.f29830i;
        }
        return gVar.b(i10, cVar2, b0Var2, i15, i16, i13);
    }

    @Override // ye.v.a
    public d0 a(b0 b0Var) throws IOException {
        qe.k.f(b0Var, "request");
        if (this.f29825d < this.f29824c.size()) {
            this.f29822a++;
            df.c cVar = this.f29826e;
            if (cVar != null) {
                if (cVar.j().g(b0Var.l())) {
                    if (!(this.f29822a == 1)) {
                        throw new IllegalStateException(("network interceptor " + this.f29824c.get(this.f29825d - 1) + " must call proceed() exactly once").toString());
                    }
                } else {
                    throw new IllegalStateException(("network interceptor " + this.f29824c.get(this.f29825d - 1) + " must retain the same host and port").toString());
                }
            }
            g c10 = c(this, this.f29825d + 1, null, b0Var, 0, 0, 0, 58, null);
            v vVar = this.f29824c.get(this.f29825d);
            d0 intercept = vVar.intercept(c10);
            if (intercept != null) {
                if (this.f29826e != null) {
                    if (!(this.f29825d + 1 >= this.f29824c.size() || c10.f29822a == 1)) {
                        throw new IllegalStateException(("network interceptor " + vVar + " must call proceed() exactly once").toString());
                    }
                }
                if (intercept.a() != null) {
                    return intercept;
                }
                throw new IllegalStateException(("interceptor " + vVar + " returned a response with no body").toString());
            }
            throw new NullPointerException("interceptor " + vVar + " returned null");
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final g b(int i10, df.c cVar, b0 b0Var, int i11, int i12, int i13) {
        qe.k.f(b0Var, "request");
        return new g(this.f29823b, this.f29824c, i10, cVar, b0Var, i11, i12, i13);
    }

    @Override // ye.v.a
    public ye.e call() {
        return this.f29823b;
    }

    public final df.e d() {
        return this.f29823b;
    }

    public final int e() {
        return this.f29828g;
    }

    public final df.c f() {
        return this.f29826e;
    }

    public final int g() {
        return this.f29829h;
    }

    public final b0 h() {
        return this.f29827f;
    }

    public final int i() {
        return this.f29830i;
    }

    public int j() {
        return this.f29829h;
    }

    @Override // ye.v.a
    public b0 l() {
        return this.f29827f;
    }
}
