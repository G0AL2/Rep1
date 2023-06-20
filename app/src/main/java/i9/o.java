package i9;

import i9.r;
import i9.u;
import j8.b3;
import java.io.IOException;

/* compiled from: MaskingMediaPeriod.java */
/* loaded from: classes2.dex */
public final class o implements r, r.a {

    /* renamed from: a  reason: collision with root package name */
    public final u.b f31747a;

    /* renamed from: b  reason: collision with root package name */
    private final long f31748b;

    /* renamed from: c  reason: collision with root package name */
    private final da.b f31749c;

    /* renamed from: d  reason: collision with root package name */
    private u f31750d;

    /* renamed from: e  reason: collision with root package name */
    private r f31751e;

    /* renamed from: f  reason: collision with root package name */
    private r.a f31752f;

    /* renamed from: g  reason: collision with root package name */
    private a f31753g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f31754h;

    /* renamed from: i  reason: collision with root package name */
    private long f31755i = -9223372036854775807L;

    /* compiled from: MaskingMediaPeriod.java */
    /* loaded from: classes2.dex */
    public interface a {
        void a(u.b bVar, IOException iOException);

        void b(u.b bVar);
    }

    public o(u.b bVar, da.b bVar2, long j10) {
        this.f31747a = bVar;
        this.f31749c = bVar2;
        this.f31748b = j10;
    }

    private long r(long j10) {
        long j11 = this.f31755i;
        return j11 != -9223372036854775807L ? j11 : j10;
    }

    public void a(u.b bVar) {
        long r10 = r(this.f31748b);
        r f10 = ((u) ea.a.e(this.f31750d)).f(bVar, this.f31749c, r10);
        this.f31751e = f10;
        if (this.f31752f != null) {
            f10.i(this, r10);
        }
    }

    @Override // i9.r, i9.p0
    public long b() {
        return ((r) ea.n0.j(this.f31751e)).b();
    }

    @Override // i9.r, i9.p0
    public boolean c() {
        r rVar = this.f31751e;
        return rVar != null && rVar.c();
    }

    @Override // i9.r, i9.p0
    public boolean d(long j10) {
        r rVar = this.f31751e;
        return rVar != null && rVar.d(j10);
    }

    @Override // i9.r
    public long e(long j10, b3 b3Var) {
        return ((r) ea.n0.j(this.f31751e)).e(j10, b3Var);
    }

    @Override // i9.r.a
    public void f(r rVar) {
        ((r.a) ea.n0.j(this.f31752f)).f(this);
        a aVar = this.f31753g;
        if (aVar != null) {
            aVar.b(this.f31747a);
        }
    }

    @Override // i9.r, i9.p0
    public long g() {
        return ((r) ea.n0.j(this.f31751e)).g();
    }

    @Override // i9.r, i9.p0
    public void h(long j10) {
        ((r) ea.n0.j(this.f31751e)).h(j10);
    }

    @Override // i9.r
    public void i(r.a aVar, long j10) {
        this.f31752f = aVar;
        r rVar = this.f31751e;
        if (rVar != null) {
            rVar.i(this, r(this.f31748b));
        }
    }

    public long j() {
        return this.f31755i;
    }

    @Override // i9.r
    public long k(long j10) {
        return ((r) ea.n0.j(this.f31751e)).k(j10);
    }

    @Override // i9.r
    public long l() {
        return ((r) ea.n0.j(this.f31751e)).l();
    }

    public long o() {
        return this.f31748b;
    }

    @Override // i9.r
    public long p(ba.q[] qVarArr, boolean[] zArr, o0[] o0VarArr, boolean[] zArr2, long j10) {
        long j11;
        long j12 = this.f31755i;
        if (j12 == -9223372036854775807L || j10 != this.f31748b) {
            j11 = j10;
        } else {
            this.f31755i = -9223372036854775807L;
            j11 = j12;
        }
        return ((r) ea.n0.j(this.f31751e)).p(qVarArr, zArr, o0VarArr, zArr2, j11);
    }

    @Override // i9.r
    public void q() throws IOException {
        try {
            r rVar = this.f31751e;
            if (rVar != null) {
                rVar.q();
            } else {
                u uVar = this.f31750d;
                if (uVar != null) {
                    uVar.p();
                }
            }
        } catch (IOException e10) {
            a aVar = this.f31753g;
            if (aVar != null) {
                if (this.f31754h) {
                    return;
                }
                this.f31754h = true;
                aVar.a(this.f31747a, e10);
                return;
            }
            throw e10;
        }
    }

    @Override // i9.p0.a
    /* renamed from: s */
    public void m(r rVar) {
        ((r.a) ea.n0.j(this.f31752f)).m(this);
    }

    @Override // i9.r
    public y0 t() {
        return ((r) ea.n0.j(this.f31751e)).t();
    }

    @Override // i9.r
    public void u(long j10, boolean z10) {
        ((r) ea.n0.j(this.f31751e)).u(j10, z10);
    }

    public void v(long j10) {
        this.f31755i = j10;
    }

    public void w() {
        if (this.f31751e != null) {
            ((u) ea.a.e(this.f31750d)).i(this.f31751e);
        }
    }

    public void x(u uVar) {
        ea.a.f(this.f31750d == null);
        this.f31750d = uVar;
    }
}
