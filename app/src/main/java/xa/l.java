package xa;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;

/* compiled from: ShapeAppearancePathProvider.java */
/* loaded from: classes3.dex */
public class l {

    /* renamed from: a  reason: collision with root package name */
    private final m[] f38846a = new m[4];

    /* renamed from: b  reason: collision with root package name */
    private final Matrix[] f38847b = new Matrix[4];

    /* renamed from: c  reason: collision with root package name */
    private final Matrix[] f38848c = new Matrix[4];

    /* renamed from: d  reason: collision with root package name */
    private final PointF f38849d = new PointF();

    /* renamed from: e  reason: collision with root package name */
    private final m f38850e = new m();

    /* renamed from: f  reason: collision with root package name */
    private final float[] f38851f = new float[2];

    /* renamed from: g  reason: collision with root package name */
    private final float[] f38852g = new float[2];

    /* compiled from: ShapeAppearancePathProvider.java */
    /* loaded from: classes3.dex */
    public interface a {
        void a(m mVar, Matrix matrix, int i10);

        void b(m mVar, Matrix matrix, int i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ShapeAppearancePathProvider.java */
    /* loaded from: classes3.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final k f38853a;

        /* renamed from: b  reason: collision with root package name */
        public final Path f38854b;

        /* renamed from: c  reason: collision with root package name */
        public final RectF f38855c;

        /* renamed from: d  reason: collision with root package name */
        public final a f38856d;

        /* renamed from: e  reason: collision with root package name */
        public final float f38857e;

        b(k kVar, float f10, RectF rectF, a aVar, Path path) {
            this.f38856d = aVar;
            this.f38853a = kVar;
            this.f38857e = f10;
            this.f38855c = rectF;
            this.f38854b = path;
        }
    }

    public l() {
        for (int i10 = 0; i10 < 4; i10++) {
            this.f38846a[i10] = new m();
            this.f38847b[i10] = new Matrix();
            this.f38848c[i10] = new Matrix();
        }
    }

    private float a(int i10) {
        return (i10 + 1) * 90;
    }

    private void b(b bVar, int i10) {
        this.f38851f[0] = this.f38846a[i10].j();
        this.f38851f[1] = this.f38846a[i10].k();
        this.f38847b[i10].mapPoints(this.f38851f);
        if (i10 == 0) {
            Path path = bVar.f38854b;
            float[] fArr = this.f38851f;
            path.moveTo(fArr[0], fArr[1]);
        } else {
            Path path2 = bVar.f38854b;
            float[] fArr2 = this.f38851f;
            path2.lineTo(fArr2[0], fArr2[1]);
        }
        this.f38846a[i10].d(this.f38847b[i10], bVar.f38854b);
        a aVar = bVar.f38856d;
        if (aVar != null) {
            aVar.a(this.f38846a[i10], this.f38847b[i10], i10);
        }
    }

    private void c(b bVar, int i10) {
        int i11 = (i10 + 1) % 4;
        this.f38851f[0] = this.f38846a[i10].h();
        this.f38851f[1] = this.f38846a[i10].i();
        this.f38847b[i10].mapPoints(this.f38851f);
        this.f38852g[0] = this.f38846a[i11].j();
        this.f38852g[1] = this.f38846a[i11].k();
        this.f38847b[i11].mapPoints(this.f38852g);
        float[] fArr = this.f38851f;
        float f10 = fArr[0];
        float[] fArr2 = this.f38852g;
        float max = Math.max(((float) Math.hypot(f10 - fArr2[0], fArr[1] - fArr2[1])) - 0.001f, 0.0f);
        float i12 = i(bVar.f38855c, i10);
        this.f38850e.m(0.0f, 0.0f);
        j(i10, bVar.f38853a).a(max, i12, bVar.f38857e, this.f38850e);
        this.f38850e.d(this.f38848c[i10], bVar.f38854b);
        a aVar = bVar.f38856d;
        if (aVar != null) {
            aVar.b(this.f38850e, this.f38848c[i10], i10);
        }
    }

    private void f(int i10, RectF rectF, PointF pointF) {
        if (i10 == 1) {
            pointF.set(rectF.right, rectF.bottom);
        } else if (i10 == 2) {
            pointF.set(rectF.left, rectF.bottom);
        } else if (i10 != 3) {
            pointF.set(rectF.right, rectF.top);
        } else {
            pointF.set(rectF.left, rectF.top);
        }
    }

    private c g(int i10, k kVar) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return kVar.t();
                }
                return kVar.r();
            }
            return kVar.j();
        }
        return kVar.l();
    }

    private d h(int i10, k kVar) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return kVar.s();
                }
                return kVar.q();
            }
            return kVar.i();
        }
        return kVar.k();
    }

    private float i(RectF rectF, int i10) {
        float[] fArr = this.f38851f;
        m[] mVarArr = this.f38846a;
        fArr[0] = mVarArr[i10].f38860c;
        fArr[1] = mVarArr[i10].f38861d;
        this.f38847b[i10].mapPoints(fArr);
        if (i10 != 1 && i10 != 3) {
            return Math.abs(rectF.centerY() - this.f38851f[1]);
        }
        return Math.abs(rectF.centerX() - this.f38851f[0]);
    }

    private f j(int i10, k kVar) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return kVar.o();
                }
                return kVar.p();
            }
            return kVar.n();
        }
        return kVar.h();
    }

    private void k(b bVar, int i10) {
        h(i10, bVar.f38853a).b(this.f38846a[i10], 90.0f, bVar.f38857e, bVar.f38855c, g(i10, bVar.f38853a));
        float a10 = a(i10);
        this.f38847b[i10].reset();
        f(i10, bVar.f38855c, this.f38849d);
        Matrix matrix = this.f38847b[i10];
        PointF pointF = this.f38849d;
        matrix.setTranslate(pointF.x, pointF.y);
        this.f38847b[i10].preRotate(a10);
    }

    private void l(int i10) {
        this.f38851f[0] = this.f38846a[i10].h();
        this.f38851f[1] = this.f38846a[i10].i();
        this.f38847b[i10].mapPoints(this.f38851f);
        float a10 = a(i10);
        this.f38848c[i10].reset();
        Matrix matrix = this.f38848c[i10];
        float[] fArr = this.f38851f;
        matrix.setTranslate(fArr[0], fArr[1]);
        this.f38848c[i10].preRotate(a10);
    }

    public void d(k kVar, float f10, RectF rectF, Path path) {
        e(kVar, f10, rectF, null, path);
    }

    public void e(k kVar, float f10, RectF rectF, a aVar, Path path) {
        path.rewind();
        b bVar = new b(kVar, f10, rectF, aVar, path);
        for (int i10 = 0; i10 < 4; i10++) {
            k(bVar, i10);
            l(i10);
        }
        for (int i11 = 0; i11 < 4; i11++) {
            b(bVar, i11);
            c(bVar, i11);
        }
        path.close();
    }
}
