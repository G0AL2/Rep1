package e2;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import com.airbnb.lottie.d0;
import d2.h;
import d2.n;
import e2.e;
import g2.j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import z1.a;
import z1.p;

/* compiled from: BaseLayer.java */
/* loaded from: classes.dex */
public abstract class b implements y1.e, a.b, b2.f {
    private Paint A;
    float B;
    BlurMaskFilter C;

    /* renamed from: a */
    private final Path f29484a = new Path();

    /* renamed from: b */
    private final Matrix f29485b = new Matrix();

    /* renamed from: c */
    private final Matrix f29486c = new Matrix();

    /* renamed from: d */
    private final Paint f29487d = new x1.a(1);

    /* renamed from: e */
    private final Paint f29488e = new x1.a(1, PorterDuff.Mode.DST_IN);

    /* renamed from: f */
    private final Paint f29489f = new x1.a(1, PorterDuff.Mode.DST_OUT);

    /* renamed from: g */
    private final Paint f29490g;

    /* renamed from: h */
    private final Paint f29491h;

    /* renamed from: i */
    private final RectF f29492i;

    /* renamed from: j */
    private final RectF f29493j;

    /* renamed from: k */
    private final RectF f29494k;

    /* renamed from: l */
    private final RectF f29495l;

    /* renamed from: m */
    private final RectF f29496m;

    /* renamed from: n */
    private final String f29497n;

    /* renamed from: o */
    final Matrix f29498o;

    /* renamed from: p */
    final d0 f29499p;

    /* renamed from: q */
    final e f29500q;

    /* renamed from: r */
    private z1.h f29501r;

    /* renamed from: s */
    private z1.d f29502s;

    /* renamed from: t */
    private b f29503t;

    /* renamed from: u */
    private b f29504u;

    /* renamed from: v */
    private List<b> f29505v;

    /* renamed from: w */
    private final List<z1.a<?, ?>> f29506w;

    /* renamed from: x */
    final p f29507x;

    /* renamed from: y */
    private boolean f29508y;

    /* renamed from: z */
    private boolean f29509z;

    /* compiled from: BaseLayer.java */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f29510a;

        /* renamed from: b */
        static final /* synthetic */ int[] f29511b;

        static {
            int[] iArr = new int[h.a.values().length];
            f29511b = iArr;
            try {
                iArr[h.a.MASK_MODE_NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f29511b[h.a.MASK_MODE_SUBTRACT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f29511b[h.a.MASK_MODE_INTERSECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f29511b[h.a.MASK_MODE_ADD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[e.a.values().length];
            f29510a = iArr2;
            try {
                iArr2[e.a.SHAPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f29510a[e.a.PRE_COMP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f29510a[e.a.SOLID.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f29510a[e.a.IMAGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f29510a[e.a.NULL.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f29510a[e.a.TEXT.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f29510a[e.a.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    public b(d0 d0Var, e eVar) {
        x1.a aVar = new x1.a(1);
        this.f29490g = aVar;
        this.f29491h = new x1.a(PorterDuff.Mode.CLEAR);
        this.f29492i = new RectF();
        this.f29493j = new RectF();
        this.f29494k = new RectF();
        this.f29495l = new RectF();
        this.f29496m = new RectF();
        this.f29498o = new Matrix();
        this.f29506w = new ArrayList();
        this.f29508y = true;
        this.B = 0.0f;
        this.f29499p = d0Var;
        this.f29500q = eVar;
        this.f29497n = eVar.i() + "#draw";
        if (eVar.h() == e.b.INVERT) {
            aVar.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        } else {
            aVar.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        }
        p b10 = eVar.w().b();
        this.f29507x = b10;
        b10.b(this);
        if (eVar.g() != null && !eVar.g().isEmpty()) {
            z1.h hVar = new z1.h(eVar.g());
            this.f29501r = hVar;
            for (z1.a<n, Path> aVar2 : hVar.a()) {
                aVar2.a(this);
            }
            for (z1.a<Integer, Integer> aVar3 : this.f29501r.c()) {
                i(aVar3);
                aVar3.a(this);
            }
        }
        N();
    }

    private void B(RectF rectF, Matrix matrix) {
        this.f29494k.set(0.0f, 0.0f, 0.0f, 0.0f);
        if (z()) {
            int size = this.f29501r.b().size();
            for (int i10 = 0; i10 < size; i10++) {
                d2.h hVar = this.f29501r.b().get(i10);
                Path h10 = this.f29501r.a().get(i10).h();
                if (h10 != null) {
                    this.f29484a.set(h10);
                    this.f29484a.transform(matrix);
                    int i11 = a.f29511b[hVar.a().ordinal()];
                    if (i11 == 1 || i11 == 2) {
                        return;
                    }
                    if ((i11 == 3 || i11 == 4) && hVar.d()) {
                        return;
                    }
                    this.f29484a.computeBounds(this.f29496m, false);
                    if (i10 == 0) {
                        this.f29494k.set(this.f29496m);
                    } else {
                        RectF rectF2 = this.f29494k;
                        rectF2.set(Math.min(rectF2.left, this.f29496m.left), Math.min(this.f29494k.top, this.f29496m.top), Math.max(this.f29494k.right, this.f29496m.right), Math.max(this.f29494k.bottom, this.f29496m.bottom));
                    }
                }
            }
            if (rectF.intersect(this.f29494k)) {
                return;
            }
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    private void C(RectF rectF, Matrix matrix) {
        if (A() && this.f29500q.h() != e.b.INVERT) {
            this.f29495l.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.f29503t.f(this.f29495l, matrix, true);
            if (rectF.intersect(this.f29495l)) {
                return;
            }
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    private void D() {
        this.f29499p.invalidateSelf();
    }

    public /* synthetic */ void E() {
        M(this.f29502s.p() == 1.0f);
    }

    private void F(float f10) {
        this.f29499p.G().n().a(this.f29500q.i(), f10);
    }

    private void M(boolean z10) {
        if (z10 != this.f29508y) {
            this.f29508y = z10;
            D();
        }
    }

    private void N() {
        if (!this.f29500q.e().isEmpty()) {
            z1.d dVar = new z1.d(this.f29500q.e());
            this.f29502s = dVar;
            dVar.l();
            this.f29502s.a(new a.b() { // from class: e2.a
                @Override // z1.a.b
                public final void a() {
                    b.g(b.this);
                }
            });
            M(this.f29502s.h().floatValue() == 1.0f);
            i(this.f29502s);
            return;
        }
        M(true);
    }

    public static /* synthetic */ void g(b bVar) {
        bVar.E();
    }

    private void j(Canvas canvas, Matrix matrix, z1.a<n, Path> aVar, z1.a<Integer, Integer> aVar2) {
        this.f29484a.set(aVar.h());
        this.f29484a.transform(matrix);
        this.f29487d.setAlpha((int) (aVar2.h().intValue() * 2.55f));
        canvas.drawPath(this.f29484a, this.f29487d);
    }

    private void k(Canvas canvas, Matrix matrix, z1.a<n, Path> aVar, z1.a<Integer, Integer> aVar2) {
        i2.h.m(canvas, this.f29492i, this.f29488e);
        this.f29484a.set(aVar.h());
        this.f29484a.transform(matrix);
        this.f29487d.setAlpha((int) (aVar2.h().intValue() * 2.55f));
        canvas.drawPath(this.f29484a, this.f29487d);
        canvas.restore();
    }

    private void l(Canvas canvas, Matrix matrix, z1.a<n, Path> aVar, z1.a<Integer, Integer> aVar2) {
        i2.h.m(canvas, this.f29492i, this.f29487d);
        canvas.drawRect(this.f29492i, this.f29487d);
        this.f29484a.set(aVar.h());
        this.f29484a.transform(matrix);
        this.f29487d.setAlpha((int) (aVar2.h().intValue() * 2.55f));
        canvas.drawPath(this.f29484a, this.f29489f);
        canvas.restore();
    }

    private void m(Canvas canvas, Matrix matrix, z1.a<n, Path> aVar, z1.a<Integer, Integer> aVar2) {
        i2.h.m(canvas, this.f29492i, this.f29488e);
        canvas.drawRect(this.f29492i, this.f29487d);
        this.f29489f.setAlpha((int) (aVar2.h().intValue() * 2.55f));
        this.f29484a.set(aVar.h());
        this.f29484a.transform(matrix);
        canvas.drawPath(this.f29484a, this.f29489f);
        canvas.restore();
    }

    private void n(Canvas canvas, Matrix matrix, z1.a<n, Path> aVar, z1.a<Integer, Integer> aVar2) {
        i2.h.m(canvas, this.f29492i, this.f29489f);
        canvas.drawRect(this.f29492i, this.f29487d);
        this.f29489f.setAlpha((int) (aVar2.h().intValue() * 2.55f));
        this.f29484a.set(aVar.h());
        this.f29484a.transform(matrix);
        canvas.drawPath(this.f29484a, this.f29489f);
        canvas.restore();
    }

    private void o(Canvas canvas, Matrix matrix) {
        com.airbnb.lottie.c.a("Layer#saveLayer");
        i2.h.n(canvas, this.f29492i, this.f29488e, 19);
        if (Build.VERSION.SDK_INT < 28) {
            s(canvas);
        }
        com.airbnb.lottie.c.b("Layer#saveLayer");
        for (int i10 = 0; i10 < this.f29501r.b().size(); i10++) {
            d2.h hVar = this.f29501r.b().get(i10);
            z1.a<n, Path> aVar = this.f29501r.a().get(i10);
            z1.a<Integer, Integer> aVar2 = this.f29501r.c().get(i10);
            int i11 = a.f29511b[hVar.a().ordinal()];
            if (i11 != 1) {
                if (i11 == 2) {
                    if (i10 == 0) {
                        this.f29487d.setColor(-16777216);
                        this.f29487d.setAlpha(255);
                        canvas.drawRect(this.f29492i, this.f29487d);
                    }
                    if (hVar.d()) {
                        n(canvas, matrix, aVar, aVar2);
                    } else {
                        p(canvas, matrix, aVar);
                    }
                } else if (i11 != 3) {
                    if (i11 == 4) {
                        if (hVar.d()) {
                            l(canvas, matrix, aVar, aVar2);
                        } else {
                            j(canvas, matrix, aVar, aVar2);
                        }
                    }
                } else if (hVar.d()) {
                    m(canvas, matrix, aVar, aVar2);
                } else {
                    k(canvas, matrix, aVar, aVar2);
                }
            } else if (q()) {
                this.f29487d.setAlpha(255);
                canvas.drawRect(this.f29492i, this.f29487d);
            }
        }
        com.airbnb.lottie.c.a("Layer#restoreLayer");
        canvas.restore();
        com.airbnb.lottie.c.b("Layer#restoreLayer");
    }

    private void p(Canvas canvas, Matrix matrix, z1.a<n, Path> aVar) {
        this.f29484a.set(aVar.h());
        this.f29484a.transform(matrix);
        canvas.drawPath(this.f29484a, this.f29489f);
    }

    private boolean q() {
        if (this.f29501r.a().isEmpty()) {
            return false;
        }
        for (int i10 = 0; i10 < this.f29501r.b().size(); i10++) {
            if (this.f29501r.b().get(i10).a() != h.a.MASK_MODE_NONE) {
                return false;
            }
        }
        return true;
    }

    private void r() {
        if (this.f29505v != null) {
            return;
        }
        if (this.f29504u == null) {
            this.f29505v = Collections.emptyList();
            return;
        }
        this.f29505v = new ArrayList();
        for (b bVar = this.f29504u; bVar != null; bVar = bVar.f29504u) {
            this.f29505v.add(bVar);
        }
    }

    private void s(Canvas canvas) {
        com.airbnb.lottie.c.a("Layer#clearLayer");
        RectF rectF = this.f29492i;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.f29491h);
        com.airbnb.lottie.c.b("Layer#clearLayer");
    }

    public static b u(c cVar, e eVar, d0 d0Var, com.airbnb.lottie.h hVar) {
        switch (a.f29510a[eVar.f().ordinal()]) {
            case 1:
                return new g(d0Var, eVar, cVar);
            case 2:
                return new c(d0Var, eVar, hVar.o(eVar.m()), hVar);
            case 3:
                return new h(d0Var, eVar);
            case 4:
                return new d(d0Var, eVar);
            case 5:
                return new f(d0Var, eVar);
            case 6:
                return new i(d0Var, eVar);
            default:
                i2.d.c("Unknown layer type " + eVar.f());
                return null;
        }
    }

    boolean A() {
        return this.f29503t != null;
    }

    public void G(z1.a<?, ?> aVar) {
        this.f29506w.remove(aVar);
    }

    void H(b2.e eVar, int i10, List<b2.e> list, b2.e eVar2) {
    }

    public void I(b bVar) {
        this.f29503t = bVar;
    }

    public void J(boolean z10) {
        if (z10 && this.A == null) {
            this.A = new x1.a();
        }
        this.f29509z = z10;
    }

    public void K(b bVar) {
        this.f29504u = bVar;
    }

    public void L(float f10) {
        this.f29507x.j(f10);
        if (this.f29501r != null) {
            for (int i10 = 0; i10 < this.f29501r.a().size(); i10++) {
                this.f29501r.a().get(i10).m(f10);
            }
        }
        z1.d dVar = this.f29502s;
        if (dVar != null) {
            dVar.m(f10);
        }
        b bVar = this.f29503t;
        if (bVar != null) {
            bVar.L(f10);
        }
        for (int i11 = 0; i11 < this.f29506w.size(); i11++) {
            this.f29506w.get(i11).m(f10);
        }
    }

    @Override // z1.a.b
    public void a() {
        D();
    }

    @Override // y1.c
    public void b(List<y1.c> list, List<y1.c> list2) {
    }

    @Override // b2.f
    public void d(b2.e eVar, int i10, List<b2.e> list, b2.e eVar2) {
        b bVar = this.f29503t;
        if (bVar != null) {
            b2.e a10 = eVar2.a(bVar.getName());
            if (eVar.c(this.f29503t.getName(), i10)) {
                list.add(a10.i(this.f29503t));
            }
            if (eVar.h(getName(), i10)) {
                this.f29503t.H(eVar, eVar.e(this.f29503t.getName(), i10) + i10, list, a10);
            }
        }
        if (eVar.g(getName(), i10)) {
            if (!"__container".equals(getName())) {
                eVar2 = eVar2.a(getName());
                if (eVar.c(getName(), i10)) {
                    list.add(eVar2.i(this));
                }
            }
            if (eVar.h(getName(), i10)) {
                H(eVar, i10 + eVar.e(getName(), i10), list, eVar2);
            }
        }
    }

    @Override // b2.f
    public <T> void e(T t10, j2.c<T> cVar) {
        this.f29507x.c(t10, cVar);
    }

    @Override // y1.e
    public void f(RectF rectF, Matrix matrix, boolean z10) {
        this.f29492i.set(0.0f, 0.0f, 0.0f, 0.0f);
        r();
        this.f29498o.set(matrix);
        if (z10) {
            List<b> list = this.f29505v;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f29498o.preConcat(this.f29505v.get(size).f29507x.f());
                }
            } else {
                b bVar = this.f29504u;
                if (bVar != null) {
                    this.f29498o.preConcat(bVar.f29507x.f());
                }
            }
        }
        this.f29498o.preConcat(this.f29507x.f());
    }

    @Override // y1.c
    public String getName() {
        return this.f29500q.i();
    }

    @Override // y1.e
    public void h(Canvas canvas, Matrix matrix, int i10) {
        Paint paint;
        com.airbnb.lottie.c.a(this.f29497n);
        if (this.f29508y && !this.f29500q.x()) {
            r();
            com.airbnb.lottie.c.a("Layer#parentMatrix");
            this.f29485b.reset();
            this.f29485b.set(matrix);
            for (int size = this.f29505v.size() - 1; size >= 0; size--) {
                this.f29485b.preConcat(this.f29505v.get(size).f29507x.f());
            }
            com.airbnb.lottie.c.b("Layer#parentMatrix");
            int intValue = (int) ((((i10 / 255.0f) * (this.f29507x.h() == null ? 100 : this.f29507x.h().h().intValue())) / 100.0f) * 255.0f);
            if (!A() && !z()) {
                this.f29485b.preConcat(this.f29507x.f());
                com.airbnb.lottie.c.a("Layer#drawLayer");
                t(canvas, this.f29485b, intValue);
                com.airbnb.lottie.c.b("Layer#drawLayer");
                F(com.airbnb.lottie.c.b(this.f29497n));
                return;
            }
            com.airbnb.lottie.c.a("Layer#computeBounds");
            f(this.f29492i, this.f29485b, false);
            C(this.f29492i, matrix);
            this.f29485b.preConcat(this.f29507x.f());
            B(this.f29492i, this.f29485b);
            this.f29493j.set(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight());
            canvas.getMatrix(this.f29486c);
            if (!this.f29486c.isIdentity()) {
                Matrix matrix2 = this.f29486c;
                matrix2.invert(matrix2);
                this.f29486c.mapRect(this.f29493j);
            }
            if (!this.f29492i.intersect(this.f29493j)) {
                this.f29492i.set(0.0f, 0.0f, 0.0f, 0.0f);
            }
            com.airbnb.lottie.c.b("Layer#computeBounds");
            if (this.f29492i.width() >= 1.0f && this.f29492i.height() >= 1.0f) {
                com.airbnb.lottie.c.a("Layer#saveLayer");
                this.f29487d.setAlpha(255);
                i2.h.m(canvas, this.f29492i, this.f29487d);
                com.airbnb.lottie.c.b("Layer#saveLayer");
                s(canvas);
                com.airbnb.lottie.c.a("Layer#drawLayer");
                t(canvas, this.f29485b, intValue);
                com.airbnb.lottie.c.b("Layer#drawLayer");
                if (z()) {
                    o(canvas, this.f29485b);
                }
                if (A()) {
                    com.airbnb.lottie.c.a("Layer#drawMatte");
                    com.airbnb.lottie.c.a("Layer#saveLayer");
                    i2.h.n(canvas, this.f29492i, this.f29490g, 19);
                    com.airbnb.lottie.c.b("Layer#saveLayer");
                    s(canvas);
                    this.f29503t.h(canvas, matrix, intValue);
                    com.airbnb.lottie.c.a("Layer#restoreLayer");
                    canvas.restore();
                    com.airbnb.lottie.c.b("Layer#restoreLayer");
                    com.airbnb.lottie.c.b("Layer#drawMatte");
                }
                com.airbnb.lottie.c.a("Layer#restoreLayer");
                canvas.restore();
                com.airbnb.lottie.c.b("Layer#restoreLayer");
            }
            if (this.f29509z && (paint = this.A) != null) {
                paint.setStyle(Paint.Style.STROKE);
                this.A.setColor(-251901);
                this.A.setStrokeWidth(4.0f);
                canvas.drawRect(this.f29492i, this.A);
                this.A.setStyle(Paint.Style.FILL);
                this.A.setColor(1357638635);
                canvas.drawRect(this.f29492i, this.A);
            }
            F(com.airbnb.lottie.c.b(this.f29497n));
            return;
        }
        com.airbnb.lottie.c.b(this.f29497n);
    }

    public void i(z1.a<?, ?> aVar) {
        if (aVar == null) {
            return;
        }
        this.f29506w.add(aVar);
    }

    abstract void t(Canvas canvas, Matrix matrix, int i10);

    public d2.a v() {
        return this.f29500q.a();
    }

    public BlurMaskFilter w(float f10) {
        if (this.B == f10) {
            return this.C;
        }
        BlurMaskFilter blurMaskFilter = new BlurMaskFilter(f10 / 2.0f, BlurMaskFilter.Blur.NORMAL);
        this.C = blurMaskFilter;
        this.B = f10;
        return blurMaskFilter;
    }

    public j x() {
        return this.f29500q.c();
    }

    public e y() {
        return this.f29500q;
    }

    boolean z() {
        z1.h hVar = this.f29501r;
        return (hVar == null || hVar.a().isEmpty()) ? false : true;
    }
}
