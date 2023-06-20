package u4;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import u4.q;

/* compiled from: ScaleTypeDrawable.java */
/* loaded from: classes.dex */
public class p extends g {

    /* renamed from: d  reason: collision with root package name */
    q.b f37540d;

    /* renamed from: e  reason: collision with root package name */
    Object f37541e;

    /* renamed from: f  reason: collision with root package name */
    PointF f37542f;

    /* renamed from: g  reason: collision with root package name */
    int f37543g;

    /* renamed from: h  reason: collision with root package name */
    int f37544h;

    /* renamed from: i  reason: collision with root package name */
    Matrix f37545i;

    /* renamed from: j  reason: collision with root package name */
    private Matrix f37546j;

    public p(Drawable drawable, q.b bVar) {
        super((Drawable) y3.k.g(drawable));
        this.f37542f = null;
        this.f37543g = 0;
        this.f37544h = 0;
        this.f37546j = new Matrix();
        this.f37540d = bVar;
    }

    private void x() {
        boolean z10;
        q.b bVar = this.f37540d;
        boolean z11 = true;
        if (bVar instanceof q.n) {
            Object state = ((q.n) bVar).getState();
            z10 = state == null || !state.equals(this.f37541e);
            this.f37541e = state;
        } else {
            z10 = false;
        }
        if (this.f37543g == getCurrent().getIntrinsicWidth() && this.f37544h == getCurrent().getIntrinsicHeight()) {
            z11 = false;
        }
        if (z11 || z10) {
            w();
        }
    }

    public void A(PointF pointF) {
        if (y3.j.a(this.f37542f, pointF)) {
            return;
        }
        if (pointF == null) {
            this.f37542f = null;
        } else {
            if (this.f37542f == null) {
                this.f37542f = new PointF();
            }
            this.f37542f.set(pointF);
        }
        w();
        invalidateSelf();
    }

    public void B(q.b bVar) {
        if (y3.j.a(this.f37540d, bVar)) {
            return;
        }
        this.f37540d = bVar;
        this.f37541e = null;
        w();
        invalidateSelf();
    }

    @Override // u4.g, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        x();
        if (this.f37545i != null) {
            int save = canvas.save();
            canvas.clipRect(getBounds());
            canvas.concat(this.f37545i);
            super.draw(canvas);
            canvas.restoreToCount(save);
            return;
        }
        super.draw(canvas);
    }

    @Override // u4.g, u4.s
    public void e(Matrix matrix) {
        t(matrix);
        x();
        Matrix matrix2 = this.f37545i;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
    }

    @Override // u4.g, android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        w();
    }

    @Override // u4.g
    public Drawable u(Drawable drawable) {
        Drawable u10 = super.u(drawable);
        w();
        return u10;
    }

    void w() {
        Drawable current = getCurrent();
        Rect bounds = getBounds();
        int width = bounds.width();
        int height = bounds.height();
        int intrinsicWidth = current.getIntrinsicWidth();
        this.f37543g = intrinsicWidth;
        int intrinsicHeight = current.getIntrinsicHeight();
        this.f37544h = intrinsicHeight;
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            current.setBounds(bounds);
            this.f37545i = null;
        } else if (intrinsicWidth == width && intrinsicHeight == height) {
            current.setBounds(bounds);
            this.f37545i = null;
        } else if (this.f37540d == q.b.f37547a) {
            current.setBounds(bounds);
            this.f37545i = null;
        } else {
            current.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            q.b bVar = this.f37540d;
            Matrix matrix = this.f37546j;
            PointF pointF = this.f37542f;
            bVar.a(matrix, bounds, intrinsicWidth, intrinsicHeight, pointF != null ? pointF.x : 0.5f, pointF != null ? pointF.y : 0.5f);
            this.f37545i = this.f37546j;
        }
    }

    public PointF y() {
        return this.f37542f;
    }

    public q.b z() {
        return this.f37540d;
    }
}
