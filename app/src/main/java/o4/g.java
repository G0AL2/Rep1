package o4;

import android.graphics.Rect;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import y3.n;
import y3.o;

/* compiled from: ImagePerfMonitor.java */
/* loaded from: classes.dex */
public class g implements h {

    /* renamed from: a  reason: collision with root package name */
    private final m4.d f34962a;

    /* renamed from: b  reason: collision with root package name */
    private final f4.b f34963b;

    /* renamed from: c  reason: collision with root package name */
    private final i f34964c = new i();

    /* renamed from: d  reason: collision with root package name */
    private final n<Boolean> f34965d;

    /* renamed from: e  reason: collision with root package name */
    private c f34966e;

    /* renamed from: f  reason: collision with root package name */
    private b f34967f;

    /* renamed from: g  reason: collision with root package name */
    private p4.c f34968g;

    /* renamed from: h  reason: collision with root package name */
    private p4.a f34969h;

    /* renamed from: i  reason: collision with root package name */
    private y5.c f34970i;

    /* renamed from: j  reason: collision with root package name */
    private List<f> f34971j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f34972k;

    public g(f4.b bVar, m4.d dVar, n<Boolean> nVar) {
        this.f34963b = bVar;
        this.f34962a = dVar;
        this.f34965d = nVar;
    }

    private void h() {
        if (this.f34969h == null) {
            this.f34969h = new p4.a(this.f34963b, this.f34964c, this, this.f34965d, o.f39267a);
        }
        if (this.f34968g == null) {
            this.f34968g = new p4.c(this.f34963b, this.f34964c);
        }
        if (this.f34967f == null) {
            this.f34967f = new p4.b(this.f34964c, this);
        }
        c cVar = this.f34966e;
        if (cVar == null) {
            this.f34966e = new c(this.f34962a.v(), this.f34967f);
        } else {
            cVar.l(this.f34962a.v());
        }
        if (this.f34970i == null) {
            this.f34970i = new y5.c(this.f34968g, this.f34966e);
        }
    }

    @Override // o4.h
    public void a(i iVar, int i10) {
        List<f> list;
        iVar.o(i10);
        if (!this.f34972k || (list = this.f34971j) == null || list.isEmpty()) {
            return;
        }
        if (i10 == 3) {
            d();
        }
        e B = iVar.B();
        for (f fVar : this.f34971j) {
            fVar.b(B, i10);
        }
    }

    @Override // o4.h
    public void b(i iVar, int i10) {
        List<f> list;
        if (!this.f34972k || (list = this.f34971j) == null || list.isEmpty()) {
            return;
        }
        e B = iVar.B();
        for (f fVar : this.f34971j) {
            fVar.a(B, i10);
        }
    }

    public void c(f fVar) {
        if (fVar == null) {
            return;
        }
        if (this.f34971j == null) {
            this.f34971j = new CopyOnWriteArrayList();
        }
        this.f34971j.add(fVar);
    }

    public void d() {
        x4.b d10 = this.f34962a.d();
        if (d10 == null || d10.e() == null) {
            return;
        }
        Rect bounds = d10.e().getBounds();
        this.f34964c.v(bounds.width());
        this.f34964c.u(bounds.height());
    }

    public void e() {
        List<f> list = this.f34971j;
        if (list != null) {
            list.clear();
        }
    }

    public void f() {
        e();
        g(false);
        this.f34964c.b();
    }

    public void g(boolean z10) {
        this.f34972k = z10;
        if (z10) {
            h();
            b bVar = this.f34967f;
            if (bVar != null) {
                this.f34962a.g0(bVar);
            }
            p4.a aVar = this.f34969h;
            if (aVar != null) {
                this.f34962a.k(aVar);
            }
            y5.c cVar = this.f34970i;
            if (cVar != null) {
                this.f34962a.h0(cVar);
                return;
            }
            return;
        }
        b bVar2 = this.f34967f;
        if (bVar2 != null) {
            this.f34962a.w0(bVar2);
        }
        p4.a aVar2 = this.f34969h;
        if (aVar2 != null) {
            this.f34962a.Q(aVar2);
        }
        y5.c cVar2 = this.f34970i;
        if (cVar2 != null) {
            this.f34962a.x0(cVar2);
        }
    }

    public void i(r4.b<m4.e, b6.b, c4.a<w5.c>, w5.h> bVar) {
        this.f34964c.i(bVar.n(), bVar.o(), bVar.m());
    }
}
