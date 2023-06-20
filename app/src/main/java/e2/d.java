package e2;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.airbnb.lottie.d0;
import com.airbnb.lottie.e0;
import com.airbnb.lottie.i0;
import z1.q;

/* compiled from: ImageLayer.java */
/* loaded from: classes.dex */
public class d extends b {
    private final Paint D;
    private final Rect E;
    private final Rect F;
    private final e0 G;
    private z1.a<ColorFilter, ColorFilter> H;
    private z1.a<Bitmap, Bitmap> I;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(d0 d0Var, e eVar) {
        super(d0Var, eVar);
        this.D = new x1.a(3);
        this.E = new Rect();
        this.F = new Rect();
        this.G = d0Var.M(eVar.m());
    }

    private Bitmap O() {
        Bitmap h10;
        z1.a<Bitmap, Bitmap> aVar = this.I;
        if (aVar == null || (h10 = aVar.h()) == null) {
            Bitmap E = this.f29499p.E(this.f29500q.m());
            if (E != null) {
                return E;
            }
            e0 e0Var = this.G;
            if (e0Var != null) {
                return e0Var.a();
            }
            return null;
        }
        return h10;
    }

    @Override // e2.b, b2.f
    public <T> void e(T t10, j2.c<T> cVar) {
        super.e(t10, cVar);
        if (t10 == i0.K) {
            if (cVar == null) {
                this.H = null;
            } else {
                this.H = new q(cVar);
            }
        } else if (t10 == i0.N) {
            if (cVar == null) {
                this.I = null;
            } else {
                this.I = new q(cVar);
            }
        }
    }

    @Override // e2.b, y1.e
    public void f(RectF rectF, Matrix matrix, boolean z10) {
        super.f(rectF, matrix, z10);
        if (this.G != null) {
            float e10 = i2.h.e();
            rectF.set(0.0f, 0.0f, this.G.e() * e10, this.G.c() * e10);
            this.f29498o.mapRect(rectF);
        }
    }

    @Override // e2.b
    public void t(Canvas canvas, Matrix matrix, int i10) {
        Bitmap O = O();
        if (O == null || O.isRecycled() || this.G == null) {
            return;
        }
        float e10 = i2.h.e();
        this.D.setAlpha(i10);
        z1.a<ColorFilter, ColorFilter> aVar = this.H;
        if (aVar != null) {
            this.D.setColorFilter(aVar.h());
        }
        canvas.save();
        canvas.concat(matrix);
        this.E.set(0, 0, O.getWidth(), O.getHeight());
        if (this.f29499p.N()) {
            this.F.set(0, 0, (int) (this.G.e() * e10), (int) (this.G.c() * e10));
        } else {
            this.F.set(0, 0, (int) (O.getWidth() * e10), (int) (O.getHeight() * e10));
        }
        canvas.drawBitmap(O, this.E, this.F, this.D);
        canvas.restore();
    }
}
