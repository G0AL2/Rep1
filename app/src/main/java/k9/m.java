package k9;

import da.l0;
import j8.p1;
import java.io.IOException;
import k9.g;

/* compiled from: InitializationChunk.java */
/* loaded from: classes2.dex */
public final class m extends f {

    /* renamed from: j  reason: collision with root package name */
    private final g f33432j;

    /* renamed from: k  reason: collision with root package name */
    private g.b f33433k;

    /* renamed from: l  reason: collision with root package name */
    private long f33434l;

    /* renamed from: m  reason: collision with root package name */
    private volatile boolean f33435m;

    public m(da.l lVar, da.p pVar, p1 p1Var, int i10, Object obj, g gVar) {
        super(lVar, pVar, 2, p1Var, i10, obj, -9223372036854775807L, -9223372036854775807L);
        this.f33432j = gVar;
    }

    @Override // da.e0.e
    public void b() {
        this.f33435m = true;
    }

    public void f(g.b bVar) {
        this.f33433k = bVar;
    }

    @Override // da.e0.e
    public void load() throws IOException {
        if (this.f33434l == 0) {
            this.f33432j.b(this.f33433k, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            da.p e10 = this.f33386b.e(this.f33434l);
            l0 l0Var = this.f33393i;
            p8.f fVar = new p8.f(l0Var, e10.f29232f, l0Var.g(e10));
            while (!this.f33435m && this.f33432j.a(fVar)) {
            }
            this.f33434l = fVar.getPosition() - this.f33386b.f29232f;
        } finally {
            da.o.a(this.f33393i);
        }
    }
}
