package y1;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import com.airbnb.lottie.d0;
import com.airbnb.lottie.i0;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.ArrayList;
import java.util.List;
import z1.a;

/* compiled from: GradientFillContent.java */
/* loaded from: classes.dex */
public class h implements e, a.b, k {

    /* renamed from: a  reason: collision with root package name */
    private final String f39035a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f39036b;

    /* renamed from: c  reason: collision with root package name */
    private final e2.b f39037c;

    /* renamed from: d  reason: collision with root package name */
    private final androidx.collection.d<LinearGradient> f39038d = new androidx.collection.d<>();

    /* renamed from: e  reason: collision with root package name */
    private final androidx.collection.d<RadialGradient> f39039e = new androidx.collection.d<>();

    /* renamed from: f  reason: collision with root package name */
    private final Path f39040f;

    /* renamed from: g  reason: collision with root package name */
    private final Paint f39041g;

    /* renamed from: h  reason: collision with root package name */
    private final RectF f39042h;

    /* renamed from: i  reason: collision with root package name */
    private final List<m> f39043i;

    /* renamed from: j  reason: collision with root package name */
    private final d2.g f39044j;

    /* renamed from: k  reason: collision with root package name */
    private final z1.a<d2.d, d2.d> f39045k;

    /* renamed from: l  reason: collision with root package name */
    private final z1.a<Integer, Integer> f39046l;

    /* renamed from: m  reason: collision with root package name */
    private final z1.a<PointF, PointF> f39047m;

    /* renamed from: n  reason: collision with root package name */
    private final z1.a<PointF, PointF> f39048n;

    /* renamed from: o  reason: collision with root package name */
    private z1.a<ColorFilter, ColorFilter> f39049o;

    /* renamed from: p  reason: collision with root package name */
    private z1.q f39050p;

    /* renamed from: q  reason: collision with root package name */
    private final d0 f39051q;

    /* renamed from: r  reason: collision with root package name */
    private final int f39052r;

    /* renamed from: s  reason: collision with root package name */
    private z1.a<Float, Float> f39053s;

    /* renamed from: t  reason: collision with root package name */
    float f39054t;

    /* renamed from: u  reason: collision with root package name */
    private z1.c f39055u;

    public h(d0 d0Var, e2.b bVar, d2.e eVar) {
        Path path = new Path();
        this.f39040f = path;
        this.f39041g = new x1.a(1);
        this.f39042h = new RectF();
        this.f39043i = new ArrayList();
        this.f39054t = 0.0f;
        this.f39037c = bVar;
        this.f39035a = eVar.f();
        this.f39036b = eVar.i();
        this.f39051q = d0Var;
        this.f39044j = eVar.e();
        path.setFillType(eVar.c());
        this.f39052r = (int) (d0Var.G().d() / 32.0f);
        z1.a<d2.d, d2.d> a10 = eVar.d().a();
        this.f39045k = a10;
        a10.a(this);
        bVar.i(a10);
        z1.a<Integer, Integer> a11 = eVar.g().a();
        this.f39046l = a11;
        a11.a(this);
        bVar.i(a11);
        z1.a<PointF, PointF> a12 = eVar.h().a();
        this.f39047m = a12;
        a12.a(this);
        bVar.i(a12);
        z1.a<PointF, PointF> a13 = eVar.b().a();
        this.f39048n = a13;
        a13.a(this);
        bVar.i(a13);
        if (bVar.v() != null) {
            z1.a<Float, Float> a14 = bVar.v().a().a();
            this.f39053s = a14;
            a14.a(this);
            bVar.i(this.f39053s);
        }
        if (bVar.x() != null) {
            this.f39055u = new z1.c(this, bVar, bVar.x());
        }
    }

    private int[] g(int[] iArr) {
        z1.q qVar = this.f39050p;
        if (qVar != null) {
            Integer[] numArr = (Integer[]) qVar.h();
            int i10 = 0;
            if (iArr.length == numArr.length) {
                while (i10 < iArr.length) {
                    iArr[i10] = numArr[i10].intValue();
                    i10++;
                }
            } else {
                iArr = new int[numArr.length];
                while (i10 < numArr.length) {
                    iArr[i10] = numArr[i10].intValue();
                    i10++;
                }
            }
        }
        return iArr;
    }

    private int i() {
        int round = Math.round(this.f39047m.f() * this.f39052r);
        int round2 = Math.round(this.f39048n.f() * this.f39052r);
        int round3 = Math.round(this.f39045k.f() * this.f39052r);
        int i10 = round != 0 ? IronSourceError.ERROR_NON_EXISTENT_INSTANCE * round : 17;
        if (round2 != 0) {
            i10 = i10 * 31 * round2;
        }
        return round3 != 0 ? i10 * 31 * round3 : i10;
    }

    private LinearGradient j() {
        long i10 = i();
        LinearGradient f10 = this.f39038d.f(i10);
        if (f10 != null) {
            return f10;
        }
        PointF h10 = this.f39047m.h();
        PointF h11 = this.f39048n.h();
        d2.d h12 = this.f39045k.h();
        LinearGradient linearGradient = new LinearGradient(h10.x, h10.y, h11.x, h11.y, g(h12.a()), h12.b(), Shader.TileMode.CLAMP);
        this.f39038d.k(i10, linearGradient);
        return linearGradient;
    }

    private RadialGradient k() {
        long i10 = i();
        RadialGradient f10 = this.f39039e.f(i10);
        if (f10 != null) {
            return f10;
        }
        PointF h10 = this.f39047m.h();
        PointF h11 = this.f39048n.h();
        d2.d h12 = this.f39045k.h();
        int[] g10 = g(h12.a());
        float[] b10 = h12.b();
        float f11 = h10.x;
        float f12 = h10.y;
        float hypot = (float) Math.hypot(h11.x - f11, h11.y - f12);
        RadialGradient radialGradient = new RadialGradient(f11, f12, hypot <= 0.0f ? 0.001f : hypot, g10, b10, Shader.TileMode.CLAMP);
        this.f39039e.k(i10, radialGradient);
        return radialGradient;
    }

    @Override // z1.a.b
    public void a() {
        this.f39051q.invalidateSelf();
    }

    @Override // y1.c
    public void b(List<c> list, List<c> list2) {
        for (int i10 = 0; i10 < list2.size(); i10++) {
            c cVar = list2.get(i10);
            if (cVar instanceof m) {
                this.f39043i.add((m) cVar);
            }
        }
    }

    @Override // b2.f
    public void d(b2.e eVar, int i10, List<b2.e> list, b2.e eVar2) {
        i2.g.k(eVar, i10, list, eVar2, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // b2.f
    public <T> void e(T t10, j2.c<T> cVar) {
        z1.c cVar2;
        z1.c cVar3;
        z1.c cVar4;
        z1.c cVar5;
        z1.c cVar6;
        if (t10 == i0.f5806d) {
            this.f39046l.n(cVar);
        } else if (t10 == i0.K) {
            z1.a<ColorFilter, ColorFilter> aVar = this.f39049o;
            if (aVar != null) {
                this.f39037c.G(aVar);
            }
            if (cVar == null) {
                this.f39049o = null;
                return;
            }
            z1.q qVar = new z1.q(cVar);
            this.f39049o = qVar;
            qVar.a(this);
            this.f39037c.i(this.f39049o);
        } else if (t10 == i0.L) {
            z1.q qVar2 = this.f39050p;
            if (qVar2 != null) {
                this.f39037c.G(qVar2);
            }
            if (cVar == null) {
                this.f39050p = null;
                return;
            }
            this.f39038d.b();
            this.f39039e.b();
            z1.q qVar3 = new z1.q(cVar);
            this.f39050p = qVar3;
            qVar3.a(this);
            this.f39037c.i(this.f39050p);
        } else if (t10 == i0.f5812j) {
            z1.a<Float, Float> aVar2 = this.f39053s;
            if (aVar2 != null) {
                aVar2.n(cVar);
                return;
            }
            z1.q qVar4 = new z1.q(cVar);
            this.f39053s = qVar4;
            qVar4.a(this);
            this.f39037c.i(this.f39053s);
        } else if (t10 == i0.f5807e && (cVar6 = this.f39055u) != null) {
            cVar6.c(cVar);
        } else if (t10 == i0.G && (cVar5 = this.f39055u) != null) {
            cVar5.f(cVar);
        } else if (t10 == i0.H && (cVar4 = this.f39055u) != null) {
            cVar4.d(cVar);
        } else if (t10 == i0.I && (cVar3 = this.f39055u) != null) {
            cVar3.e(cVar);
        } else if (t10 != i0.J || (cVar2 = this.f39055u) == null) {
        } else {
            cVar2.g(cVar);
        }
    }

    @Override // y1.e
    public void f(RectF rectF, Matrix matrix, boolean z10) {
        this.f39040f.reset();
        for (int i10 = 0; i10 < this.f39043i.size(); i10++) {
            this.f39040f.addPath(this.f39043i.get(i10).getPath(), matrix);
        }
        this.f39040f.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    @Override // y1.c
    public String getName() {
        return this.f39035a;
    }

    @Override // y1.e
    public void h(Canvas canvas, Matrix matrix, int i10) {
        Shader k10;
        if (this.f39036b) {
            return;
        }
        com.airbnb.lottie.c.a("GradientFillContent#draw");
        this.f39040f.reset();
        for (int i11 = 0; i11 < this.f39043i.size(); i11++) {
            this.f39040f.addPath(this.f39043i.get(i11).getPath(), matrix);
        }
        this.f39040f.computeBounds(this.f39042h, false);
        if (this.f39044j == d2.g.LINEAR) {
            k10 = j();
        } else {
            k10 = k();
        }
        k10.setLocalMatrix(matrix);
        this.f39041g.setShader(k10);
        z1.a<ColorFilter, ColorFilter> aVar = this.f39049o;
        if (aVar != null) {
            this.f39041g.setColorFilter(aVar.h());
        }
        z1.a<Float, Float> aVar2 = this.f39053s;
        if (aVar2 != null) {
            float floatValue = aVar2.h().floatValue();
            if (floatValue == 0.0f) {
                this.f39041g.setMaskFilter(null);
            } else if (floatValue != this.f39054t) {
                this.f39041g.setMaskFilter(new BlurMaskFilter(floatValue, BlurMaskFilter.Blur.NORMAL));
            }
            this.f39054t = floatValue;
        }
        z1.c cVar = this.f39055u;
        if (cVar != null) {
            cVar.b(this.f39041g);
        }
        this.f39041g.setAlpha(i2.g.c((int) ((((i10 / 255.0f) * this.f39046l.h().intValue()) / 100.0f) * 255.0f), 0, 255));
        canvas.drawPath(this.f39040f, this.f39041g);
        com.airbnb.lottie.c.b("GradientFillContent#draw");
    }
}
