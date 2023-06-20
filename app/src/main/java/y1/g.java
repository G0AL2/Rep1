package y1;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.d0;
import com.airbnb.lottie.i0;
import java.util.ArrayList;
import java.util.List;
import z1.a;

/* compiled from: FillContent.java */
/* loaded from: classes.dex */
public class g implements e, a.b, k {

    /* renamed from: a  reason: collision with root package name */
    private final Path f39022a;

    /* renamed from: b  reason: collision with root package name */
    private final Paint f39023b;

    /* renamed from: c  reason: collision with root package name */
    private final e2.b f39024c;

    /* renamed from: d  reason: collision with root package name */
    private final String f39025d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f39026e;

    /* renamed from: f  reason: collision with root package name */
    private final List<m> f39027f;

    /* renamed from: g  reason: collision with root package name */
    private final z1.a<Integer, Integer> f39028g;

    /* renamed from: h  reason: collision with root package name */
    private final z1.a<Integer, Integer> f39029h;

    /* renamed from: i  reason: collision with root package name */
    private z1.a<ColorFilter, ColorFilter> f39030i;

    /* renamed from: j  reason: collision with root package name */
    private final d0 f39031j;

    /* renamed from: k  reason: collision with root package name */
    private z1.a<Float, Float> f39032k;

    /* renamed from: l  reason: collision with root package name */
    float f39033l;

    /* renamed from: m  reason: collision with root package name */
    private z1.c f39034m;

    public g(d0 d0Var, e2.b bVar, d2.o oVar) {
        Path path = new Path();
        this.f39022a = path;
        this.f39023b = new x1.a(1);
        this.f39027f = new ArrayList();
        this.f39024c = bVar;
        this.f39025d = oVar.d();
        this.f39026e = oVar.f();
        this.f39031j = d0Var;
        if (bVar.v() != null) {
            z1.a<Float, Float> a10 = bVar.v().a().a();
            this.f39032k = a10;
            a10.a(this);
            bVar.i(this.f39032k);
        }
        if (bVar.x() != null) {
            this.f39034m = new z1.c(this, bVar, bVar.x());
        }
        if (oVar.b() != null && oVar.e() != null) {
            path.setFillType(oVar.c());
            z1.a<Integer, Integer> a11 = oVar.b().a();
            this.f39028g = a11;
            a11.a(this);
            bVar.i(a11);
            z1.a<Integer, Integer> a12 = oVar.e().a();
            this.f39029h = a12;
            a12.a(this);
            bVar.i(a12);
            return;
        }
        this.f39028g = null;
        this.f39029h = null;
    }

    @Override // z1.a.b
    public void a() {
        this.f39031j.invalidateSelf();
    }

    @Override // y1.c
    public void b(List<c> list, List<c> list2) {
        for (int i10 = 0; i10 < list2.size(); i10++) {
            c cVar = list2.get(i10);
            if (cVar instanceof m) {
                this.f39027f.add((m) cVar);
            }
        }
    }

    @Override // b2.f
    public void d(b2.e eVar, int i10, List<b2.e> list, b2.e eVar2) {
        i2.g.k(eVar, i10, list, eVar2, this);
    }

    @Override // b2.f
    public <T> void e(T t10, j2.c<T> cVar) {
        z1.c cVar2;
        z1.c cVar3;
        z1.c cVar4;
        z1.c cVar5;
        z1.c cVar6;
        if (t10 == i0.f5803a) {
            this.f39028g.n(cVar);
        } else if (t10 == i0.f5806d) {
            this.f39029h.n(cVar);
        } else if (t10 == i0.K) {
            z1.a<ColorFilter, ColorFilter> aVar = this.f39030i;
            if (aVar != null) {
                this.f39024c.G(aVar);
            }
            if (cVar == null) {
                this.f39030i = null;
                return;
            }
            z1.q qVar = new z1.q(cVar);
            this.f39030i = qVar;
            qVar.a(this);
            this.f39024c.i(this.f39030i);
        } else if (t10 == i0.f5812j) {
            z1.a<Float, Float> aVar2 = this.f39032k;
            if (aVar2 != null) {
                aVar2.n(cVar);
                return;
            }
            z1.q qVar2 = new z1.q(cVar);
            this.f39032k = qVar2;
            qVar2.a(this);
            this.f39024c.i(this.f39032k);
        } else if (t10 == i0.f5807e && (cVar6 = this.f39034m) != null) {
            cVar6.c(cVar);
        } else if (t10 == i0.G && (cVar5 = this.f39034m) != null) {
            cVar5.f(cVar);
        } else if (t10 == i0.H && (cVar4 = this.f39034m) != null) {
            cVar4.d(cVar);
        } else if (t10 == i0.I && (cVar3 = this.f39034m) != null) {
            cVar3.e(cVar);
        } else if (t10 != i0.J || (cVar2 = this.f39034m) == null) {
        } else {
            cVar2.g(cVar);
        }
    }

    @Override // y1.e
    public void f(RectF rectF, Matrix matrix, boolean z10) {
        this.f39022a.reset();
        for (int i10 = 0; i10 < this.f39027f.size(); i10++) {
            this.f39022a.addPath(this.f39027f.get(i10).getPath(), matrix);
        }
        this.f39022a.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    @Override // y1.c
    public String getName() {
        return this.f39025d;
    }

    @Override // y1.e
    public void h(Canvas canvas, Matrix matrix, int i10) {
        if (this.f39026e) {
            return;
        }
        com.airbnb.lottie.c.a("FillContent#draw");
        this.f39023b.setColor((i2.g.c((int) ((((i10 / 255.0f) * this.f39029h.h().intValue()) / 100.0f) * 255.0f), 0, 255) << 24) | (((z1.b) this.f39028g).p() & 16777215));
        z1.a<ColorFilter, ColorFilter> aVar = this.f39030i;
        if (aVar != null) {
            this.f39023b.setColorFilter(aVar.h());
        }
        z1.a<Float, Float> aVar2 = this.f39032k;
        if (aVar2 != null) {
            float floatValue = aVar2.h().floatValue();
            if (floatValue == 0.0f) {
                this.f39023b.setMaskFilter(null);
            } else if (floatValue != this.f39033l) {
                this.f39023b.setMaskFilter(this.f39024c.w(floatValue));
            }
            this.f39033l = floatValue;
        }
        z1.c cVar = this.f39034m;
        if (cVar != null) {
            cVar.b(this.f39023b);
        }
        this.f39022a.reset();
        for (int i11 = 0; i11 < this.f39027f.size(); i11++) {
            this.f39022a.addPath(this.f39027f.get(i11).getPath(), matrix);
        }
        canvas.drawPath(this.f39022a, this.f39023b);
        com.airbnb.lottie.c.b("FillContent#draw");
    }
}
