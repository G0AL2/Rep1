package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.cardview.widget.g;

/* compiled from: CardViewBaseImpl.java */
/* loaded from: classes.dex */
class c implements e {

    /* renamed from: a  reason: collision with root package name */
    final RectF f1822a = new RectF();

    /* compiled from: CardViewBaseImpl.java */
    /* loaded from: classes.dex */
    class a implements g.a {
        a() {
        }

        @Override // androidx.cardview.widget.g.a
        public void a(Canvas canvas, RectF rectF, float f10, Paint paint) {
            float f11 = 2.0f * f10;
            float width = (rectF.width() - f11) - 1.0f;
            float height = (rectF.height() - f11) - 1.0f;
            if (f10 >= 1.0f) {
                float f12 = f10 + 0.5f;
                float f13 = -f12;
                c.this.f1822a.set(f13, f13, f12, f12);
                int save = canvas.save();
                canvas.translate(rectF.left + f12, rectF.top + f12);
                canvas.drawArc(c.this.f1822a, 180.0f, 90.0f, true, paint);
                canvas.translate(width, 0.0f);
                canvas.rotate(90.0f);
                canvas.drawArc(c.this.f1822a, 180.0f, 90.0f, true, paint);
                canvas.translate(height, 0.0f);
                canvas.rotate(90.0f);
                canvas.drawArc(c.this.f1822a, 180.0f, 90.0f, true, paint);
                canvas.translate(width, 0.0f);
                canvas.rotate(90.0f);
                canvas.drawArc(c.this.f1822a, 180.0f, 90.0f, true, paint);
                canvas.restoreToCount(save);
                float f14 = rectF.top;
                canvas.drawRect((rectF.left + f12) - 1.0f, f14, (rectF.right - f12) + 1.0f, f14 + f12, paint);
                float f15 = rectF.bottom;
                canvas.drawRect((rectF.left + f12) - 1.0f, f15 - f12, (rectF.right - f12) + 1.0f, f15, paint);
            }
            canvas.drawRect(rectF.left, rectF.top + f10, rectF.right, rectF.bottom - f10, paint);
        }
    }

    private g o(Context context, ColorStateList colorStateList, float f10, float f11, float f12) {
        return new g(context.getResources(), colorStateList, f10, f11, f12);
    }

    private g p(d dVar) {
        return (g) dVar.d();
    }

    @Override // androidx.cardview.widget.e
    public void a(d dVar, float f10) {
        p(dVar).p(f10);
        q(dVar);
    }

    @Override // androidx.cardview.widget.e
    public float b(d dVar) {
        return p(dVar).g();
    }

    @Override // androidx.cardview.widget.e
    public void c(d dVar, float f10) {
        p(dVar).r(f10);
    }

    @Override // androidx.cardview.widget.e
    public float d(d dVar) {
        return p(dVar).i();
    }

    @Override // androidx.cardview.widget.e
    public ColorStateList e(d dVar) {
        return p(dVar).f();
    }

    @Override // androidx.cardview.widget.e
    public float f(d dVar) {
        return p(dVar).j();
    }

    @Override // androidx.cardview.widget.e
    public void g(d dVar) {
        p(dVar).m(dVar.f());
        q(dVar);
    }

    @Override // androidx.cardview.widget.e
    public void h(d dVar, Context context, ColorStateList colorStateList, float f10, float f11, float f12) {
        g o10 = o(context, colorStateList, f10, f11, f12);
        o10.m(dVar.f());
        dVar.b(o10);
        q(dVar);
    }

    @Override // androidx.cardview.widget.e
    public float i(d dVar) {
        return p(dVar).l();
    }

    @Override // androidx.cardview.widget.e
    public void j(d dVar) {
    }

    @Override // androidx.cardview.widget.e
    public void k() {
        g.f1836r = new a();
    }

    @Override // androidx.cardview.widget.e
    public float l(d dVar) {
        return p(dVar).k();
    }

    @Override // androidx.cardview.widget.e
    public void m(d dVar, ColorStateList colorStateList) {
        p(dVar).o(colorStateList);
    }

    @Override // androidx.cardview.widget.e
    public void n(d dVar, float f10) {
        p(dVar).q(f10);
        q(dVar);
    }

    public void q(d dVar) {
        Rect rect = new Rect();
        p(dVar).h(rect);
        dVar.e((int) Math.ceil(l(dVar)), (int) Math.ceil(f(dVar)));
        dVar.a(rect.left, rect.top, rect.right, rect.bottom);
    }
}
