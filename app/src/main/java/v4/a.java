package v4;

import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import u4.f;
import u4.g;
import u4.h;
import u4.p;
import u4.q;
import y3.k;

/* compiled from: GenericDraweeHierarchy.java */
/* loaded from: classes.dex */
public class a implements x4.c {

    /* renamed from: a  reason: collision with root package name */
    private final Drawable f37772a;

    /* renamed from: b  reason: collision with root package name */
    private final Resources f37773b;

    /* renamed from: c  reason: collision with root package name */
    private d f37774c;

    /* renamed from: d  reason: collision with root package name */
    private final c f37775d;

    /* renamed from: e  reason: collision with root package name */
    private final f f37776e;

    /* renamed from: f  reason: collision with root package name */
    private final g f37777f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(b bVar) {
        ColorDrawable colorDrawable = new ColorDrawable(0);
        this.f37772a = colorDrawable;
        if (c6.b.d()) {
            c6.b.a("GenericDraweeHierarchy()");
        }
        this.f37773b = bVar.o();
        this.f37774c = bVar.r();
        g gVar = new g(colorDrawable);
        this.f37777f = gVar;
        int i10 = 1;
        int size = bVar.i() != null ? bVar.i().size() : 1;
        int i11 = (size == 0 ? 1 : size) + (bVar.l() != null ? 1 : 0);
        Drawable[] drawableArr = new Drawable[i11 + 6];
        drawableArr[0] = i(bVar.e(), null);
        drawableArr[1] = i(bVar.j(), bVar.k());
        drawableArr[2] = h(gVar, bVar.d(), bVar.c(), bVar.b());
        drawableArr[3] = i(bVar.m(), bVar.n());
        drawableArr[4] = i(bVar.p(), bVar.q());
        drawableArr[5] = i(bVar.g(), bVar.h());
        if (i11 > 0) {
            if (bVar.i() != null) {
                i10 = 0;
                for (Drawable drawable : bVar.i()) {
                    drawableArr[i10 + 6] = i(drawable, null);
                    i10++;
                }
            }
            if (bVar.l() != null) {
                drawableArr[i10 + 6] = i(bVar.l(), null);
            }
        }
        f fVar = new f(drawableArr, false, 2);
        this.f37776e = fVar;
        fVar.v(bVar.f());
        c cVar = new c(e.e(fVar, this.f37774c));
        this.f37775d = cVar;
        cVar.mutate();
        t();
        if (c6.b.d()) {
            c6.b.b();
        }
    }

    private void A(float f10) {
        Drawable b10 = this.f37776e.b(3);
        if (b10 == null) {
            return;
        }
        if (f10 >= 0.999f) {
            if (b10 instanceof Animatable) {
                ((Animatable) b10).stop();
            }
            l(3);
        } else {
            if (b10 instanceof Animatable) {
                ((Animatable) b10).start();
            }
            j(3);
        }
        b10.setLevel(Math.round(f10 * 10000.0f));
    }

    private Drawable h(Drawable drawable, q.b bVar, PointF pointF, ColorFilter colorFilter) {
        drawable.setColorFilter(colorFilter);
        return e.g(drawable, bVar, pointF);
    }

    private Drawable i(Drawable drawable, q.b bVar) {
        return e.f(e.d(drawable, this.f37774c, this.f37773b), bVar);
    }

    private void j(int i10) {
        if (i10 >= 0) {
            this.f37776e.l(i10);
        }
    }

    private void k() {
        l(1);
        l(2);
        l(3);
        l(4);
        l(5);
    }

    private void l(int i10) {
        if (i10 >= 0) {
            this.f37776e.m(i10);
        }
    }

    private u4.c o(int i10) {
        u4.c d10 = this.f37776e.d(i10);
        if (d10.r() instanceof h) {
            d10 = (h) d10.r();
        }
        return d10.r() instanceof p ? (p) d10.r() : d10;
    }

    private p q(int i10) {
        u4.c o10 = o(i10);
        if (o10 instanceof p) {
            return (p) o10;
        }
        return e.k(o10, q.b.f37547a);
    }

    private boolean r(int i10) {
        return o(i10) instanceof p;
    }

    private void s() {
        this.f37777f.h(this.f37772a);
    }

    private void t() {
        f fVar = this.f37776e;
        if (fVar != null) {
            fVar.h();
            this.f37776e.k();
            k();
            j(1);
            this.f37776e.n();
            this.f37776e.j();
        }
    }

    private void w(int i10, Drawable drawable) {
        if (drawable == null) {
            this.f37776e.g(i10, null);
            return;
        }
        o(i10).h(e.d(drawable, this.f37774c, this.f37773b));
    }

    public void B(Drawable drawable) {
        w(3, drawable);
    }

    public void C(d dVar) {
        this.f37774c = dVar;
        e.j(this.f37775d, dVar);
        for (int i10 = 0; i10 < this.f37776e.f(); i10++) {
            e.i(o(i10), this.f37774c, this.f37773b);
        }
    }

    @Override // x4.b
    public Rect a() {
        return this.f37775d.getBounds();
    }

    @Override // x4.c
    public void b(Throwable th) {
        this.f37776e.h();
        k();
        if (this.f37776e.b(4) != null) {
            j(4);
        } else {
            j(1);
        }
        this.f37776e.j();
    }

    @Override // x4.c
    public void c(Throwable th) {
        this.f37776e.h();
        k();
        if (this.f37776e.b(5) != null) {
            j(5);
        } else {
            j(1);
        }
        this.f37776e.j();
    }

    @Override // x4.c
    public void d(float f10, boolean z10) {
        if (this.f37776e.b(3) == null) {
            return;
        }
        this.f37776e.h();
        A(f10);
        if (z10) {
            this.f37776e.n();
        }
        this.f37776e.j();
    }

    @Override // x4.b
    public Drawable e() {
        return this.f37775d;
    }

    @Override // x4.c
    public void f(Drawable drawable, float f10, boolean z10) {
        Drawable d10 = e.d(drawable, this.f37774c, this.f37773b);
        d10.mutate();
        this.f37777f.h(d10);
        this.f37776e.h();
        k();
        j(2);
        A(f10);
        if (z10) {
            this.f37776e.n();
        }
        this.f37776e.j();
    }

    @Override // x4.c
    public void g(Drawable drawable) {
        this.f37775d.w(drawable);
    }

    public PointF m() {
        if (r(2)) {
            return q(2).y();
        }
        return null;
    }

    public q.b n() {
        if (r(2)) {
            return q(2).z();
        }
        return null;
    }

    public d p() {
        return this.f37774c;
    }

    @Override // x4.c
    public void reset() {
        s();
        t();
    }

    public void u(q.b bVar) {
        k.g(bVar);
        q(2).B(bVar);
    }

    public void v(Drawable drawable) {
        w(0, drawable);
    }

    public void x(int i10) {
        this.f37776e.v(i10);
    }

    public void y(f.a aVar) {
        this.f37776e.u(aVar);
    }

    public void z(Drawable drawable, q.b bVar) {
        w(1, drawable);
        q(1).B(bVar);
    }
}
