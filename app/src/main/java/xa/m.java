package xa;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ShapePath.java */
/* loaded from: classes3.dex */
public class m {
    @Deprecated

    /* renamed from: a  reason: collision with root package name */
    public float f38858a;
    @Deprecated

    /* renamed from: b  reason: collision with root package name */
    public float f38859b;
    @Deprecated

    /* renamed from: c  reason: collision with root package name */
    public float f38860c;
    @Deprecated

    /* renamed from: d  reason: collision with root package name */
    public float f38861d;
    @Deprecated

    /* renamed from: e  reason: collision with root package name */
    public float f38862e;
    @Deprecated

    /* renamed from: f  reason: collision with root package name */
    public float f38863f;

    /* renamed from: g  reason: collision with root package name */
    private final List<f> f38864g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    private final List<g> f38865h = new ArrayList();

    /* compiled from: ShapePath.java */
    /* loaded from: classes3.dex */
    class a extends g {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f38866b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Matrix f38867c;

        a(m mVar, List list, Matrix matrix) {
            this.f38866b = list;
            this.f38867c = matrix;
        }

        @Override // xa.m.g
        public void a(Matrix matrix, wa.a aVar, int i10, Canvas canvas) {
            for (g gVar : this.f38866b) {
                gVar.a(this.f38867c, aVar, i10, canvas);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ShapePath.java */
    /* loaded from: classes3.dex */
    public static class b extends g {

        /* renamed from: b  reason: collision with root package name */
        private final d f38868b;

        public b(d dVar) {
            this.f38868b = dVar;
        }

        @Override // xa.m.g
        public void a(Matrix matrix, wa.a aVar, int i10, Canvas canvas) {
            aVar.a(canvas, matrix, new RectF(this.f38868b.k(), this.f38868b.o(), this.f38868b.l(), this.f38868b.j()), i10, this.f38868b.m(), this.f38868b.n());
        }
    }

    /* compiled from: ShapePath.java */
    /* loaded from: classes3.dex */
    static class c extends g {

        /* renamed from: b  reason: collision with root package name */
        private final e f38869b;

        /* renamed from: c  reason: collision with root package name */
        private final float f38870c;

        /* renamed from: d  reason: collision with root package name */
        private final float f38871d;

        public c(e eVar, float f10, float f11) {
            this.f38869b = eVar;
            this.f38870c = f10;
            this.f38871d = f11;
        }

        @Override // xa.m.g
        public void a(Matrix matrix, wa.a aVar, int i10, Canvas canvas) {
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(this.f38869b.f38880c - this.f38871d, this.f38869b.f38879b - this.f38870c), 0.0f);
            Matrix matrix2 = new Matrix(matrix);
            matrix2.preTranslate(this.f38870c, this.f38871d);
            matrix2.preRotate(c());
            aVar.b(canvas, matrix2, rectF, i10);
        }

        float c() {
            return (float) Math.toDegrees(Math.atan((this.f38869b.f38880c - this.f38871d) / (this.f38869b.f38879b - this.f38870c)));
        }
    }

    /* compiled from: ShapePath.java */
    /* loaded from: classes3.dex */
    public static class d extends f {

        /* renamed from: h  reason: collision with root package name */
        private static final RectF f38872h = new RectF();
        @Deprecated

        /* renamed from: b  reason: collision with root package name */
        public float f38873b;
        @Deprecated

        /* renamed from: c  reason: collision with root package name */
        public float f38874c;
        @Deprecated

        /* renamed from: d  reason: collision with root package name */
        public float f38875d;
        @Deprecated

        /* renamed from: e  reason: collision with root package name */
        public float f38876e;
        @Deprecated

        /* renamed from: f  reason: collision with root package name */
        public float f38877f;
        @Deprecated

        /* renamed from: g  reason: collision with root package name */
        public float f38878g;

        public d(float f10, float f11, float f12, float f13) {
            q(f10);
            u(f11);
            r(f12);
            p(f13);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float j() {
            return this.f38876e;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float k() {
            return this.f38873b;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float l() {
            return this.f38875d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float m() {
            return this.f38877f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float n() {
            return this.f38878g;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float o() {
            return this.f38874c;
        }

        private void p(float f10) {
            this.f38876e = f10;
        }

        private void q(float f10) {
            this.f38873b = f10;
        }

        private void r(float f10) {
            this.f38875d = f10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void s(float f10) {
            this.f38877f = f10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void t(float f10) {
            this.f38878g = f10;
        }

        private void u(float f10) {
            this.f38874c = f10;
        }

        @Override // xa.m.f
        public void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f38881a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            RectF rectF = f38872h;
            rectF.set(k(), o(), l(), j());
            path.arcTo(rectF, m(), n(), false);
            path.transform(matrix);
        }
    }

    /* compiled from: ShapePath.java */
    /* loaded from: classes3.dex */
    public static class e extends f {

        /* renamed from: b  reason: collision with root package name */
        private float f38879b;

        /* renamed from: c  reason: collision with root package name */
        private float f38880c;

        @Override // xa.m.f
        public void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f38881a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f38879b, this.f38880c);
            path.transform(matrix);
        }
    }

    /* compiled from: ShapePath.java */
    /* loaded from: classes3.dex */
    public static abstract class f {

        /* renamed from: a  reason: collision with root package name */
        protected final Matrix f38881a = new Matrix();

        public abstract void a(Matrix matrix, Path path);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ShapePath.java */
    /* loaded from: classes3.dex */
    public static abstract class g {

        /* renamed from: a  reason: collision with root package name */
        static final Matrix f38882a = new Matrix();

        g() {
        }

        public abstract void a(Matrix matrix, wa.a aVar, int i10, Canvas canvas);

        public final void b(wa.a aVar, int i10, Canvas canvas) {
            a(f38882a, aVar, i10, canvas);
        }
    }

    public m() {
        m(0.0f, 0.0f);
    }

    private void b(float f10) {
        if (f() == f10) {
            return;
        }
        float f11 = ((f10 - f()) + 360.0f) % 360.0f;
        if (f11 > 180.0f) {
            return;
        }
        d dVar = new d(h(), i(), h(), i());
        dVar.s(f());
        dVar.t(f11);
        this.f38865h.add(new b(dVar));
        o(f10);
    }

    private void c(g gVar, float f10, float f11) {
        b(f10);
        this.f38865h.add(gVar);
        o(f11);
    }

    private float f() {
        return this.f38862e;
    }

    private float g() {
        return this.f38863f;
    }

    private void o(float f10) {
        this.f38862e = f10;
    }

    private void p(float f10) {
        this.f38863f = f10;
    }

    private void q(float f10) {
        this.f38860c = f10;
    }

    private void r(float f10) {
        this.f38861d = f10;
    }

    private void s(float f10) {
        this.f38858a = f10;
    }

    private void t(float f10) {
        this.f38859b = f10;
    }

    public void a(float f10, float f11, float f12, float f13, float f14, float f15) {
        d dVar = new d(f10, f11, f12, f13);
        dVar.s(f14);
        dVar.t(f15);
        this.f38864g.add(dVar);
        b bVar = new b(dVar);
        float f16 = f14 + f15;
        boolean z10 = f15 < 0.0f;
        if (z10) {
            f14 = (f14 + 180.0f) % 360.0f;
        }
        c(bVar, f14, z10 ? (180.0f + f16) % 360.0f : f16);
        double d10 = f16;
        q(((f10 + f12) * 0.5f) + (((f12 - f10) / 2.0f) * ((float) Math.cos(Math.toRadians(d10)))));
        r(((f11 + f13) * 0.5f) + (((f13 - f11) / 2.0f) * ((float) Math.sin(Math.toRadians(d10)))));
    }

    public void d(Matrix matrix, Path path) {
        int size = this.f38864g.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f38864g.get(i10).a(matrix, path);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g e(Matrix matrix) {
        b(g());
        return new a(this, new ArrayList(this.f38865h), matrix);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float h() {
        return this.f38860c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float i() {
        return this.f38861d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float j() {
        return this.f38858a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float k() {
        return this.f38859b;
    }

    public void l(float f10, float f11) {
        e eVar = new e();
        eVar.f38879b = f10;
        eVar.f38880c = f11;
        this.f38864g.add(eVar);
        c cVar = new c(eVar, h(), i());
        c(cVar, cVar.c() + 270.0f, cVar.c() + 270.0f);
        q(f10);
        r(f11);
    }

    public void m(float f10, float f11) {
        n(f10, f11, 270.0f, 0.0f);
    }

    public void n(float f10, float f11, float f12, float f13) {
        s(f10);
        t(f11);
        q(f10);
        r(f11);
        o(f12);
        p((f12 + f13) % 360.0f);
        this.f38864g.clear();
        this.f38865h.clear();
    }
}
