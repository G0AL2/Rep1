package y1;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import com.airbnb.lottie.d0;
import com.airbnb.lottie.i0;
import d2.s;
import java.util.ArrayList;
import java.util.List;
import z1.a;

/* compiled from: BaseStrokeContent.java */
/* loaded from: classes.dex */
public abstract class a implements a.b, k, e {

    /* renamed from: e  reason: collision with root package name */
    private final d0 f38987e;

    /* renamed from: f  reason: collision with root package name */
    protected final e2.b f38988f;

    /* renamed from: h  reason: collision with root package name */
    private final float[] f38990h;

    /* renamed from: i  reason: collision with root package name */
    final Paint f38991i;

    /* renamed from: j  reason: collision with root package name */
    private final z1.a<?, Float> f38992j;

    /* renamed from: k  reason: collision with root package name */
    private final z1.a<?, Integer> f38993k;

    /* renamed from: l  reason: collision with root package name */
    private final List<z1.a<?, Float>> f38994l;

    /* renamed from: m  reason: collision with root package name */
    private final z1.a<?, Float> f38995m;

    /* renamed from: n  reason: collision with root package name */
    private z1.a<ColorFilter, ColorFilter> f38996n;

    /* renamed from: o  reason: collision with root package name */
    private z1.a<Float, Float> f38997o;

    /* renamed from: p  reason: collision with root package name */
    float f38998p;

    /* renamed from: q  reason: collision with root package name */
    private z1.c f38999q;

    /* renamed from: a  reason: collision with root package name */
    private final PathMeasure f38983a = new PathMeasure();

    /* renamed from: b  reason: collision with root package name */
    private final Path f38984b = new Path();

    /* renamed from: c  reason: collision with root package name */
    private final Path f38985c = new Path();

    /* renamed from: d  reason: collision with root package name */
    private final RectF f38986d = new RectF();

    /* renamed from: g  reason: collision with root package name */
    private final List<b> f38989g = new ArrayList();

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: BaseStrokeContent.java */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final List<m> f39000a;

        /* renamed from: b  reason: collision with root package name */
        private final u f39001b;

        private b(u uVar) {
            this.f39000a = new ArrayList();
            this.f39001b = uVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(d0 d0Var, e2.b bVar, Paint.Cap cap, Paint.Join join, float f10, c2.d dVar, c2.b bVar2, List<c2.b> list, c2.b bVar3) {
        x1.a aVar = new x1.a(1);
        this.f38991i = aVar;
        this.f38998p = 0.0f;
        this.f38987e = d0Var;
        this.f38988f = bVar;
        aVar.setStyle(Paint.Style.STROKE);
        aVar.setStrokeCap(cap);
        aVar.setStrokeJoin(join);
        aVar.setStrokeMiter(f10);
        this.f38993k = dVar.a();
        this.f38992j = bVar2.a();
        if (bVar3 == null) {
            this.f38995m = null;
        } else {
            this.f38995m = bVar3.a();
        }
        this.f38994l = new ArrayList(list.size());
        this.f38990h = new float[list.size()];
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.f38994l.add(list.get(i10).a());
        }
        bVar.i(this.f38993k);
        bVar.i(this.f38992j);
        for (int i11 = 0; i11 < this.f38994l.size(); i11++) {
            bVar.i(this.f38994l.get(i11));
        }
        z1.a<?, Float> aVar2 = this.f38995m;
        if (aVar2 != null) {
            bVar.i(aVar2);
        }
        this.f38993k.a(this);
        this.f38992j.a(this);
        for (int i12 = 0; i12 < list.size(); i12++) {
            this.f38994l.get(i12).a(this);
        }
        z1.a<?, Float> aVar3 = this.f38995m;
        if (aVar3 != null) {
            aVar3.a(this);
        }
        if (bVar.v() != null) {
            z1.a<Float, Float> a10 = bVar.v().a().a();
            this.f38997o = a10;
            a10.a(this);
            bVar.i(this.f38997o);
        }
        if (bVar.x() != null) {
            this.f38999q = new z1.c(this, bVar, bVar.x());
        }
    }

    private void g(Matrix matrix) {
        com.airbnb.lottie.c.a("StrokeContent#applyDashPattern");
        if (this.f38994l.isEmpty()) {
            com.airbnb.lottie.c.b("StrokeContent#applyDashPattern");
            return;
        }
        float g10 = i2.h.g(matrix);
        for (int i10 = 0; i10 < this.f38994l.size(); i10++) {
            this.f38990h[i10] = this.f38994l.get(i10).h().floatValue();
            if (i10 % 2 == 0) {
                float[] fArr = this.f38990h;
                if (fArr[i10] < 1.0f) {
                    fArr[i10] = 1.0f;
                }
            } else {
                float[] fArr2 = this.f38990h;
                if (fArr2[i10] < 0.1f) {
                    fArr2[i10] = 0.1f;
                }
            }
            float[] fArr3 = this.f38990h;
            fArr3[i10] = fArr3[i10] * g10;
        }
        z1.a<?, Float> aVar = this.f38995m;
        this.f38991i.setPathEffect(new DashPathEffect(this.f38990h, aVar == null ? 0.0f : g10 * aVar.h().floatValue()));
        com.airbnb.lottie.c.b("StrokeContent#applyDashPattern");
    }

    private void i(Canvas canvas, b bVar, Matrix matrix) {
        com.airbnb.lottie.c.a("StrokeContent#applyTrimPath");
        if (bVar.f39001b == null) {
            com.airbnb.lottie.c.b("StrokeContent#applyTrimPath");
            return;
        }
        this.f38984b.reset();
        for (int size = bVar.f39000a.size() - 1; size >= 0; size--) {
            this.f38984b.addPath(((m) bVar.f39000a.get(size)).getPath(), matrix);
        }
        float floatValue = bVar.f39001b.i().h().floatValue() / 100.0f;
        float floatValue2 = bVar.f39001b.e().h().floatValue() / 100.0f;
        float floatValue3 = bVar.f39001b.g().h().floatValue() / 360.0f;
        if (floatValue < 0.01f && floatValue2 > 0.99f) {
            canvas.drawPath(this.f38984b, this.f38991i);
            com.airbnb.lottie.c.b("StrokeContent#applyTrimPath");
            return;
        }
        this.f38983a.setPath(this.f38984b, false);
        float length = this.f38983a.getLength();
        while (this.f38983a.nextContour()) {
            length += this.f38983a.getLength();
        }
        float f10 = floatValue3 * length;
        float f11 = (floatValue * length) + f10;
        float min = Math.min((floatValue2 * length) + f10, (f11 + length) - 1.0f);
        float f12 = 0.0f;
        for (int size2 = bVar.f39000a.size() - 1; size2 >= 0; size2--) {
            this.f38985c.set(((m) bVar.f39000a.get(size2)).getPath());
            this.f38985c.transform(matrix);
            this.f38983a.setPath(this.f38985c, false);
            float length2 = this.f38983a.getLength();
            if (min > length) {
                float f13 = min - length;
                if (f13 < f12 + length2 && f12 < f13) {
                    i2.h.a(this.f38985c, f11 > length ? (f11 - length) / length2 : 0.0f, Math.min(f13 / length2, 1.0f), 0.0f);
                    canvas.drawPath(this.f38985c, this.f38991i);
                    f12 += length2;
                }
            }
            float f14 = f12 + length2;
            if (f14 >= f11 && f12 <= min) {
                if (f14 <= min && f11 < f12) {
                    canvas.drawPath(this.f38985c, this.f38991i);
                } else {
                    i2.h.a(this.f38985c, f11 < f12 ? 0.0f : (f11 - f12) / length2, min > f14 ? 1.0f : (min - f12) / length2, 0.0f);
                    canvas.drawPath(this.f38985c, this.f38991i);
                }
            }
            f12 += length2;
        }
        com.airbnb.lottie.c.b("StrokeContent#applyTrimPath");
    }

    @Override // z1.a.b
    public void a() {
        this.f38987e.invalidateSelf();
    }

    @Override // y1.c
    public void b(List<c> list, List<c> list2) {
        u uVar = null;
        for (int size = list.size() - 1; size >= 0; size--) {
            c cVar = list.get(size);
            if (cVar instanceof u) {
                u uVar2 = (u) cVar;
                if (uVar2.j() == s.a.INDIVIDUALLY) {
                    uVar = uVar2;
                }
            }
        }
        if (uVar != null) {
            uVar.d(this);
        }
        b bVar = null;
        for (int size2 = list2.size() - 1; size2 >= 0; size2--) {
            c cVar2 = list2.get(size2);
            if (cVar2 instanceof u) {
                u uVar3 = (u) cVar2;
                if (uVar3.j() == s.a.INDIVIDUALLY) {
                    if (bVar != null) {
                        this.f38989g.add(bVar);
                    }
                    bVar = new b(uVar3);
                    uVar3.d(this);
                }
            }
            if (cVar2 instanceof m) {
                if (bVar == null) {
                    bVar = new b(uVar);
                }
                bVar.f39000a.add((m) cVar2);
            }
        }
        if (bVar != null) {
            this.f38989g.add(bVar);
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
        if (t10 == i0.f5806d) {
            this.f38993k.n(cVar);
        } else if (t10 == i0.f5821s) {
            this.f38992j.n(cVar);
        } else if (t10 == i0.K) {
            z1.a<ColorFilter, ColorFilter> aVar = this.f38996n;
            if (aVar != null) {
                this.f38988f.G(aVar);
            }
            if (cVar == null) {
                this.f38996n = null;
                return;
            }
            z1.q qVar = new z1.q(cVar);
            this.f38996n = qVar;
            qVar.a(this);
            this.f38988f.i(this.f38996n);
        } else if (t10 == i0.f5812j) {
            z1.a<Float, Float> aVar2 = this.f38997o;
            if (aVar2 != null) {
                aVar2.n(cVar);
                return;
            }
            z1.q qVar2 = new z1.q(cVar);
            this.f38997o = qVar2;
            qVar2.a(this);
            this.f38988f.i(this.f38997o);
        } else if (t10 == i0.f5807e && (cVar6 = this.f38999q) != null) {
            cVar6.c(cVar);
        } else if (t10 == i0.G && (cVar5 = this.f38999q) != null) {
            cVar5.f(cVar);
        } else if (t10 == i0.H && (cVar4 = this.f38999q) != null) {
            cVar4.d(cVar);
        } else if (t10 == i0.I && (cVar3 = this.f38999q) != null) {
            cVar3.e(cVar);
        } else if (t10 != i0.J || (cVar2 = this.f38999q) == null) {
        } else {
            cVar2.g(cVar);
        }
    }

    @Override // y1.e
    public void f(RectF rectF, Matrix matrix, boolean z10) {
        com.airbnb.lottie.c.a("StrokeContent#getBounds");
        this.f38984b.reset();
        for (int i10 = 0; i10 < this.f38989g.size(); i10++) {
            b bVar = this.f38989g.get(i10);
            for (int i11 = 0; i11 < bVar.f39000a.size(); i11++) {
                this.f38984b.addPath(((m) bVar.f39000a.get(i11)).getPath(), matrix);
            }
        }
        this.f38984b.computeBounds(this.f38986d, false);
        float p10 = ((z1.d) this.f38992j).p();
        RectF rectF2 = this.f38986d;
        float f10 = p10 / 2.0f;
        rectF2.set(rectF2.left - f10, rectF2.top - f10, rectF2.right + f10, rectF2.bottom + f10);
        rectF.set(this.f38986d);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
        com.airbnb.lottie.c.b("StrokeContent#getBounds");
    }

    @Override // y1.e
    public void h(Canvas canvas, Matrix matrix, int i10) {
        com.airbnb.lottie.c.a("StrokeContent#draw");
        if (i2.h.h(matrix)) {
            com.airbnb.lottie.c.b("StrokeContent#draw");
            return;
        }
        this.f38991i.setAlpha(i2.g.c((int) ((((i10 / 255.0f) * ((z1.f) this.f38993k).p()) / 100.0f) * 255.0f), 0, 255));
        this.f38991i.setStrokeWidth(((z1.d) this.f38992j).p() * i2.h.g(matrix));
        if (this.f38991i.getStrokeWidth() <= 0.0f) {
            com.airbnb.lottie.c.b("StrokeContent#draw");
            return;
        }
        g(matrix);
        z1.a<ColorFilter, ColorFilter> aVar = this.f38996n;
        if (aVar != null) {
            this.f38991i.setColorFilter(aVar.h());
        }
        z1.a<Float, Float> aVar2 = this.f38997o;
        if (aVar2 != null) {
            float floatValue = aVar2.h().floatValue();
            if (floatValue == 0.0f) {
                this.f38991i.setMaskFilter(null);
            } else if (floatValue != this.f38998p) {
                this.f38991i.setMaskFilter(this.f38988f.w(floatValue));
            }
            this.f38998p = floatValue;
        }
        z1.c cVar = this.f38999q;
        if (cVar != null) {
            cVar.b(this.f38991i);
        }
        for (int i11 = 0; i11 < this.f38989g.size(); i11++) {
            b bVar = this.f38989g.get(i11);
            if (bVar.f39001b != null) {
                i(canvas, bVar, matrix);
            } else {
                com.airbnb.lottie.c.a("StrokeContent#buildPath");
                this.f38984b.reset();
                for (int size = bVar.f39000a.size() - 1; size >= 0; size--) {
                    this.f38984b.addPath(((m) bVar.f39000a.get(size)).getPath(), matrix);
                }
                com.airbnb.lottie.c.b("StrokeContent#buildPath");
                com.airbnb.lottie.c.a("StrokeContent#drawPath");
                canvas.drawPath(this.f38984b, this.f38991i);
                com.airbnb.lottie.c.b("StrokeContent#drawPath");
            }
        }
        com.airbnb.lottie.c.b("StrokeContent#draw");
    }
}
