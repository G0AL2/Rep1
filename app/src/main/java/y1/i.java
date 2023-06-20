package y1;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import com.airbnb.lottie.d0;
import com.airbnb.lottie.i0;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: GradientStrokeContent.java */
/* loaded from: classes.dex */
public class i extends a {
    private final z1.a<PointF, PointF> A;
    private z1.q B;

    /* renamed from: r  reason: collision with root package name */
    private final String f39056r;

    /* renamed from: s  reason: collision with root package name */
    private final boolean f39057s;

    /* renamed from: t  reason: collision with root package name */
    private final androidx.collection.d<LinearGradient> f39058t;

    /* renamed from: u  reason: collision with root package name */
    private final androidx.collection.d<RadialGradient> f39059u;

    /* renamed from: v  reason: collision with root package name */
    private final RectF f39060v;

    /* renamed from: w  reason: collision with root package name */
    private final d2.g f39061w;

    /* renamed from: x  reason: collision with root package name */
    private final int f39062x;

    /* renamed from: y  reason: collision with root package name */
    private final z1.a<d2.d, d2.d> f39063y;

    /* renamed from: z  reason: collision with root package name */
    private final z1.a<PointF, PointF> f39064z;

    public i(d0 d0Var, e2.b bVar, d2.f fVar) {
        super(d0Var, bVar, fVar.b().f(), fVar.g().f(), fVar.i(), fVar.k(), fVar.m(), fVar.h(), fVar.c());
        this.f39058t = new androidx.collection.d<>();
        this.f39059u = new androidx.collection.d<>();
        this.f39060v = new RectF();
        this.f39056r = fVar.j();
        this.f39061w = fVar.f();
        this.f39057s = fVar.n();
        this.f39062x = (int) (d0Var.G().d() / 32.0f);
        z1.a<d2.d, d2.d> a10 = fVar.e().a();
        this.f39063y = a10;
        a10.a(this);
        bVar.i(a10);
        z1.a<PointF, PointF> a11 = fVar.l().a();
        this.f39064z = a11;
        a11.a(this);
        bVar.i(a11);
        z1.a<PointF, PointF> a12 = fVar.d().a();
        this.A = a12;
        a12.a(this);
        bVar.i(a12);
    }

    private int[] j(int[] iArr) {
        z1.q qVar = this.B;
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

    private int k() {
        int round = Math.round(this.f39064z.f() * this.f39062x);
        int round2 = Math.round(this.A.f() * this.f39062x);
        int round3 = Math.round(this.f39063y.f() * this.f39062x);
        int i10 = round != 0 ? IronSourceError.ERROR_NON_EXISTENT_INSTANCE * round : 17;
        if (round2 != 0) {
            i10 = i10 * 31 * round2;
        }
        return round3 != 0 ? i10 * 31 * round3 : i10;
    }

    private LinearGradient l() {
        long k10 = k();
        LinearGradient f10 = this.f39058t.f(k10);
        if (f10 != null) {
            return f10;
        }
        PointF h10 = this.f39064z.h();
        PointF h11 = this.A.h();
        d2.d h12 = this.f39063y.h();
        LinearGradient linearGradient = new LinearGradient(h10.x, h10.y, h11.x, h11.y, j(h12.a()), h12.b(), Shader.TileMode.CLAMP);
        this.f39058t.k(k10, linearGradient);
        return linearGradient;
    }

    private RadialGradient m() {
        float f10;
        float f11;
        long k10 = k();
        RadialGradient f12 = this.f39059u.f(k10);
        if (f12 != null) {
            return f12;
        }
        PointF h10 = this.f39064z.h();
        PointF h11 = this.A.h();
        d2.d h12 = this.f39063y.h();
        int[] j10 = j(h12.a());
        float[] b10 = h12.b();
        RadialGradient radialGradient = new RadialGradient(h10.x, h10.y, (float) Math.hypot(h11.x - f10, h11.y - f11), j10, b10, Shader.TileMode.CLAMP);
        this.f39059u.k(k10, radialGradient);
        return radialGradient;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // y1.a, b2.f
    public <T> void e(T t10, j2.c<T> cVar) {
        super.e(t10, cVar);
        if (t10 == i0.L) {
            z1.q qVar = this.B;
            if (qVar != null) {
                this.f38988f.G(qVar);
            }
            if (cVar == null) {
                this.B = null;
                return;
            }
            z1.q qVar2 = new z1.q(cVar);
            this.B = qVar2;
            qVar2.a(this);
            this.f38988f.i(this.B);
        }
    }

    @Override // y1.c
    public String getName() {
        return this.f39056r;
    }

    @Override // y1.a, y1.e
    public void h(Canvas canvas, Matrix matrix, int i10) {
        Shader m10;
        if (this.f39057s) {
            return;
        }
        f(this.f39060v, matrix, false);
        if (this.f39061w == d2.g.LINEAR) {
            m10 = l();
        } else {
            m10 = m();
        }
        m10.setLocalMatrix(matrix);
        this.f38991i.setShader(m10);
        super.h(canvas, matrix, i10);
    }
}
