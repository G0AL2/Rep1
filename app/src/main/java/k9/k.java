package k9;

import da.l0;
import j8.p1;
import java.io.IOException;
import k9.g;

/* compiled from: ContainerMediaChunk.java */
/* loaded from: classes2.dex */
public class k extends a {

    /* renamed from: o  reason: collision with root package name */
    private final int f33424o;

    /* renamed from: p  reason: collision with root package name */
    private final long f33425p;

    /* renamed from: q  reason: collision with root package name */
    private final g f33426q;

    /* renamed from: r  reason: collision with root package name */
    private long f33427r;

    /* renamed from: s  reason: collision with root package name */
    private volatile boolean f33428s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f33429t;

    public k(da.l lVar, da.p pVar, p1 p1Var, int i10, Object obj, long j10, long j11, long j12, long j13, long j14, int i11, long j15, g gVar) {
        super(lVar, pVar, p1Var, i10, obj, j10, j11, j12, j13, j14);
        this.f33424o = i11;
        this.f33425p = j15;
        this.f33426q = gVar;
    }

    @Override // da.e0.e
    public final void b() {
        this.f33428s = true;
    }

    @Override // k9.n
    public long f() {
        return this.f33436j + this.f33424o;
    }

    @Override // k9.n
    public boolean g() {
        return this.f33429t;
    }

    protected g.b k(c cVar) {
        return cVar;
    }

    @Override // da.e0.e
    public final void load() throws IOException {
        if (this.f33427r == 0) {
            c i10 = i();
            i10.b(this.f33425p);
            g gVar = this.f33426q;
            g.b k10 = k(i10);
            long j10 = this.f33357k;
            long j11 = j10 == -9223372036854775807L ? -9223372036854775807L : j10 - this.f33425p;
            long j12 = this.f33358l;
            gVar.b(k10, j11, j12 == -9223372036854775807L ? -9223372036854775807L : j12 - this.f33425p);
        }
        try {
            da.p e10 = this.f33386b.e(this.f33427r);
            l0 l0Var = this.f33393i;
            p8.f fVar = new p8.f(l0Var, e10.f29232f, l0Var.g(e10));
            while (!this.f33428s && this.f33426q.a(fVar)) {
            }
            this.f33427r = fVar.getPosition() - this.f33386b.f29232f;
            da.o.a(this.f33393i);
            this.f33429t = !this.f33428s;
        } catch (Throwable th) {
            da.o.a(this.f33393i);
            throw th;
        }
    }
}
