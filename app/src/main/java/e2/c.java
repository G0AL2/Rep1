package e2;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import com.airbnb.lottie.d0;
import com.airbnb.lottie.i0;
import e2.e;
import java.util.ArrayList;
import java.util.List;
import z1.q;

/* compiled from: CompositionLayer.java */
/* loaded from: classes.dex */
public class c extends b {
    private z1.a<Float, Float> D;
    private final List<b> E;
    private final RectF F;
    private final RectF G;
    private final Paint H;
    private boolean I;

    /* compiled from: CompositionLayer.java */
    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f29512a;

        static {
            int[] iArr = new int[e.b.values().length];
            f29512a = iArr;
            try {
                iArr[e.b.ADD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f29512a[e.b.INVERT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public c(d0 d0Var, e eVar, List<e> list, com.airbnb.lottie.h hVar) {
        super(d0Var, eVar);
        int i10;
        b bVar;
        this.E = new ArrayList();
        this.F = new RectF();
        this.G = new RectF();
        this.H = new Paint();
        this.I = true;
        c2.b u10 = eVar.u();
        if (u10 != null) {
            z1.a<Float, Float> a10 = u10.a();
            this.D = a10;
            i(a10);
            this.D.a(this);
        } else {
            this.D = null;
        }
        androidx.collection.d dVar = new androidx.collection.d(hVar.k().size());
        int size = list.size() - 1;
        b bVar2 = null;
        while (true) {
            if (size < 0) {
                break;
            }
            e eVar2 = list.get(size);
            b u11 = b.u(this, eVar2, d0Var, hVar);
            if (u11 != null) {
                dVar.k(u11.y().d(), u11);
                if (bVar2 != null) {
                    bVar2.I(u11);
                    bVar2 = null;
                } else {
                    this.E.add(0, u11);
                    int i11 = a.f29512a[eVar2.h().ordinal()];
                    if (i11 == 1 || i11 == 2) {
                        bVar2 = u11;
                    }
                }
            }
            size--;
        }
        for (i10 = 0; i10 < dVar.o(); i10++) {
            b bVar3 = (b) dVar.f(dVar.j(i10));
            if (bVar3 != null && (bVar = (b) dVar.f(bVar3.y().j())) != null) {
                bVar3.K(bVar);
            }
        }
    }

    @Override // e2.b
    protected void H(b2.e eVar, int i10, List<b2.e> list, b2.e eVar2) {
        for (int i11 = 0; i11 < this.E.size(); i11++) {
            this.E.get(i11).d(eVar, i10, list, eVar2);
        }
    }

    @Override // e2.b
    public void J(boolean z10) {
        super.J(z10);
        for (b bVar : this.E) {
            bVar.J(z10);
        }
    }

    @Override // e2.b
    public void L(float f10) {
        super.L(f10);
        if (this.D != null) {
            f10 = ((this.D.h().floatValue() * this.f29500q.b().i()) - this.f29500q.b().p()) / (this.f29499p.G().e() + 0.01f);
        }
        if (this.D == null) {
            f10 -= this.f29500q.r();
        }
        if (this.f29500q.v() != 0.0f && !"__container".equals(this.f29500q.i())) {
            f10 /= this.f29500q.v();
        }
        for (int size = this.E.size() - 1; size >= 0; size--) {
            this.E.get(size).L(f10);
        }
    }

    public void O(boolean z10) {
        this.I = z10;
    }

    @Override // e2.b, b2.f
    public <T> void e(T t10, j2.c<T> cVar) {
        super.e(t10, cVar);
        if (t10 == i0.E) {
            if (cVar == null) {
                z1.a<Float, Float> aVar = this.D;
                if (aVar != null) {
                    aVar.n(null);
                    return;
                }
                return;
            }
            q qVar = new q(cVar);
            this.D = qVar;
            qVar.a(this);
            i(this.D);
        }
    }

    @Override // e2.b, y1.e
    public void f(RectF rectF, Matrix matrix, boolean z10) {
        super.f(rectF, matrix, z10);
        for (int size = this.E.size() - 1; size >= 0; size--) {
            this.F.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.E.get(size).f(this.F, this.f29498o, true);
            rectF.union(this.F);
        }
    }

    @Override // e2.b
    void t(Canvas canvas, Matrix matrix, int i10) {
        com.airbnb.lottie.c.a("CompositionLayer#draw");
        this.G.set(0.0f, 0.0f, this.f29500q.l(), this.f29500q.k());
        matrix.mapRect(this.G);
        boolean z10 = this.f29499p.b0() && this.E.size() > 1 && i10 != 255;
        if (z10) {
            this.H.setAlpha(i10);
            i2.h.m(canvas, this.G, this.H);
        } else {
            canvas.save();
        }
        if (z10) {
            i10 = 255;
        }
        for (int size = this.E.size() - 1; size >= 0; size--) {
            if (((!this.I && "__container".equals(this.f29500q.i())) || this.G.isEmpty()) ? true : canvas.clipRect(this.G)) {
                this.E.get(size).h(canvas, matrix, i10);
            }
        }
        canvas.restore();
        com.airbnb.lottie.c.b("CompositionLayer#draw");
    }
}
