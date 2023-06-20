package y1;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import com.airbnb.lottie.d0;
import com.airbnb.lottie.i0;

/* compiled from: StrokeContent.java */
/* loaded from: classes.dex */
public class t extends a {

    /* renamed from: r  reason: collision with root package name */
    private final e2.b f39117r;

    /* renamed from: s  reason: collision with root package name */
    private final String f39118s;

    /* renamed from: t  reason: collision with root package name */
    private final boolean f39119t;

    /* renamed from: u  reason: collision with root package name */
    private final z1.a<Integer, Integer> f39120u;

    /* renamed from: v  reason: collision with root package name */
    private z1.a<ColorFilter, ColorFilter> f39121v;

    public t(d0 d0Var, e2.b bVar, d2.r rVar) {
        super(d0Var, bVar, rVar.b().f(), rVar.e().f(), rVar.g(), rVar.i(), rVar.j(), rVar.f(), rVar.d());
        this.f39117r = bVar;
        this.f39118s = rVar.h();
        this.f39119t = rVar.k();
        z1.a<Integer, Integer> a10 = rVar.c().a();
        this.f39120u = a10;
        a10.a(this);
        bVar.i(a10);
    }

    @Override // y1.a, b2.f
    public <T> void e(T t10, j2.c<T> cVar) {
        super.e(t10, cVar);
        if (t10 == i0.f5804b) {
            this.f39120u.n(cVar);
        } else if (t10 == i0.K) {
            z1.a<ColorFilter, ColorFilter> aVar = this.f39121v;
            if (aVar != null) {
                this.f39117r.G(aVar);
            }
            if (cVar == null) {
                this.f39121v = null;
                return;
            }
            z1.q qVar = new z1.q(cVar);
            this.f39121v = qVar;
            qVar.a(this);
            this.f39117r.i(this.f39120u);
        }
    }

    @Override // y1.c
    public String getName() {
        return this.f39118s;
    }

    @Override // y1.a, y1.e
    public void h(Canvas canvas, Matrix matrix, int i10) {
        if (this.f39119t) {
            return;
        }
        this.f38991i.setColor(((z1.b) this.f39120u).p());
        z1.a<ColorFilter, ColorFilter> aVar = this.f39121v;
        if (aVar != null) {
            this.f38991i.setColorFilter(aVar.h());
        }
        super.h(canvas, matrix, i10);
    }
}
