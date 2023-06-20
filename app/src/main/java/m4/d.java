package m4;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import p5.s;
import u4.p;
import u4.q;
import w5.h;
import y3.j;
import y3.k;
import y3.n;

/* compiled from: PipelineDraweeController.java */
/* loaded from: classes.dex */
public class d extends r4.a<c4.a<w5.c>, h> {
    private static final Class<?> M = d.class;
    private final s<t3.d, w5.c> A;
    private t3.d B;
    private n<com.facebook.datasource.c<c4.a<w5.c>>> C;
    private boolean D;
    private y3.f<v5.a> E;
    private o4.g F;
    private Set<y5.e> G;
    private o4.b H;
    private n4.b I;
    private b6.b J;
    private b6.b[] K;
    private b6.b L;

    /* renamed from: y  reason: collision with root package name */
    private final v5.a f34215y;

    /* renamed from: z  reason: collision with root package name */
    private final y3.f<v5.a> f34216z;

    public d(Resources resources, q4.a aVar, v5.a aVar2, Executor executor, s<t3.d, w5.c> sVar, y3.f<v5.a> fVar) {
        super(aVar, executor, null, null);
        this.f34215y = new a(resources, aVar2);
        this.f34216z = fVar;
        this.A = sVar;
    }

    private void o0(n<com.facebook.datasource.c<c4.a<w5.c>>> nVar) {
        this.C = nVar;
        s0(null);
    }

    private Drawable r0(y3.f<v5.a> fVar, w5.c cVar) {
        Drawable a10;
        if (fVar == null) {
            return null;
        }
        Iterator<v5.a> it = fVar.iterator();
        while (it.hasNext()) {
            v5.a next = it.next();
            if (next.b(cVar) && (a10 = next.a(cVar)) != null) {
                return a10;
            }
        }
        return null;
    }

    private void s0(w5.c cVar) {
        if (this.D) {
            if (r() == null) {
                s4.a aVar = new s4.a();
                t4.a aVar2 = new t4.a(aVar);
                this.I = new n4.b();
                j(aVar2);
                Y(aVar);
            }
            if (this.H == null) {
                g0(this.I);
            }
            if (r() instanceof s4.a) {
                A0(cVar, (s4.a) r());
            }
        }
    }

    protected void A0(w5.c cVar, s4.a aVar) {
        p a10;
        aVar.i(v());
        x4.b d10 = d();
        q.b bVar = null;
        if (d10 != null && (a10 = q.a(d10.e())) != null) {
            bVar = a10.z();
        }
        aVar.m(bVar);
        int b10 = this.I.b();
        aVar.l(o4.d.b(b10), n4.a.a(b10));
        if (cVar != null) {
            aVar.j(cVar.getWidth(), cVar.getHeight());
            aVar.k(cVar.b());
            return;
        }
        aVar.h();
    }

    @Override // r4.a
    protected void N(Drawable drawable) {
        if (drawable instanceof l4.a) {
            ((l4.a) drawable).a();
        }
    }

    @Override // r4.a, x4.a
    public void e(x4.b bVar) {
        super.e(bVar);
        s0(null);
    }

    public synchronized void g0(o4.b bVar) {
        o4.b bVar2 = this.H;
        if (bVar2 instanceof o4.a) {
            ((o4.a) bVar2).b(bVar);
        } else if (bVar2 != null) {
            this.H = new o4.a(bVar2, bVar);
        } else {
            this.H = bVar;
        }
    }

    public synchronized void h0(y5.e eVar) {
        if (this.G == null) {
            this.G = new HashSet();
        }
        this.G.add(eVar);
    }

    protected void i0() {
        synchronized (this) {
            this.H = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // r4.a
    /* renamed from: j0 */
    public Drawable l(c4.a<w5.c> aVar) {
        try {
            if (c6.b.d()) {
                c6.b.a("PipelineDraweeController#createDrawable");
            }
            k.i(c4.a.C(aVar));
            w5.c y10 = aVar.y();
            s0(y10);
            Drawable r02 = r0(this.E, y10);
            if (r02 != null) {
                return r02;
            }
            Drawable r03 = r0(this.f34216z, y10);
            if (r03 != null) {
                if (c6.b.d()) {
                    c6.b.b();
                }
                return r03;
            }
            Drawable a10 = this.f34215y.a(y10);
            if (a10 != null) {
                if (c6.b.d()) {
                    c6.b.b();
                }
                return a10;
            }
            throw new UnsupportedOperationException("Unrecognized image class: " + y10);
        } finally {
            if (c6.b.d()) {
                c6.b.b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // r4.a
    /* renamed from: k0 */
    public c4.a<w5.c> n() {
        t3.d dVar;
        if (c6.b.d()) {
            c6.b.a("PipelineDraweeController#getCachedImage");
        }
        try {
            s<t3.d, w5.c> sVar = this.A;
            if (sVar != null && (dVar = this.B) != null) {
                c4.a<w5.c> aVar = sVar.get(dVar);
                if (aVar != null && !aVar.y().a().a()) {
                    aVar.close();
                    return null;
                }
                if (c6.b.d()) {
                    c6.b.b();
                }
                return aVar;
            }
            if (c6.b.d()) {
                c6.b.b();
            }
            return null;
        } finally {
            if (c6.b.d()) {
                c6.b.b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // r4.a
    /* renamed from: l0 */
    public int x(c4.a<w5.c> aVar) {
        if (aVar != null) {
            return aVar.z();
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // r4.a
    /* renamed from: m0 */
    public h y(c4.a<w5.c> aVar) {
        k.i(c4.a.C(aVar));
        return aVar.y();
    }

    public synchronized y5.e n0() {
        o4.c cVar = this.H != null ? new o4.c(v(), this.H) : null;
        Set<y5.e> set = this.G;
        if (set != null) {
            y5.c cVar2 = new y5.c(set);
            if (cVar != null) {
                cVar2.l(cVar);
            }
            return cVar2;
        }
        return cVar;
    }

    public void p0(n<com.facebook.datasource.c<c4.a<w5.c>>> nVar, String str, t3.d dVar, Object obj, y3.f<v5.a> fVar, o4.b bVar) {
        if (c6.b.d()) {
            c6.b.a("PipelineDraweeController#initialize");
        }
        super.C(str, obj);
        o0(nVar);
        this.B = dVar;
        y0(fVar);
        i0();
        s0(null);
        g0(bVar);
        if (c6.b.d()) {
            c6.b.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public synchronized void q0(o4.f fVar, r4.b<e, b6.b, c4.a<w5.c>, h> bVar, n<Boolean> nVar) {
        o4.g gVar = this.F;
        if (gVar != null) {
            gVar.f();
        }
        if (fVar != null) {
            if (this.F == null) {
                this.F = new o4.g(AwakeTimeSinceBootClock.get(), this, nVar);
            }
            this.F.c(fVar);
            this.F.g(true);
            this.F.i(bVar);
        }
        this.J = bVar.n();
        this.K = bVar.m();
        this.L = bVar.o();
    }

    @Override // r4.a
    protected com.facebook.datasource.c<c4.a<w5.c>> s() {
        if (c6.b.d()) {
            c6.b.a("PipelineDraweeController#getDataSource");
        }
        if (z3.a.u(2)) {
            z3.a.w(M, "controller %x: getDataSource", Integer.valueOf(System.identityHashCode(this)));
        }
        com.facebook.datasource.c<c4.a<w5.c>> cVar = this.C.get();
        if (c6.b.d()) {
            c6.b.b();
        }
        return cVar;
    }

    @Override // r4.a
    /* renamed from: t0 */
    public Map<String, Object> I(h hVar) {
        if (hVar == null) {
            return null;
        }
        return hVar.getExtras();
    }

    @Override // r4.a
    public String toString() {
        return j.c(this).b("super", super.toString()).b("dataSourceSupplier", this.C).toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // r4.a
    /* renamed from: u0 */
    public void K(String str, c4.a<w5.c> aVar) {
        super.K(str, aVar);
        synchronized (this) {
            o4.b bVar = this.H;
            if (bVar != null) {
                bVar.a(str, 6, true, "PipelineDraweeController");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // r4.a
    /* renamed from: v0 */
    public void P(c4.a<w5.c> aVar) {
        c4.a.w(aVar);
    }

    public synchronized void w0(o4.b bVar) {
        o4.b bVar2 = this.H;
        if (bVar2 instanceof o4.a) {
            ((o4.a) bVar2).c(bVar);
            return;
        }
        if (bVar2 == bVar) {
            this.H = null;
        }
    }

    public synchronized void x0(y5.e eVar) {
        Set<y5.e> set = this.G;
        if (set == null) {
            return;
        }
        set.remove(eVar);
    }

    public void y0(y3.f<v5.a> fVar) {
        this.E = fVar;
    }

    @Override // r4.a
    protected Uri z() {
        return h5.f.a(this.J, this.L, this.K, b6.b.f4837w);
    }

    public void z0(boolean z10) {
        this.D = z10;
    }
}
