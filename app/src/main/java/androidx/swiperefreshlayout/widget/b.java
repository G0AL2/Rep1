package androidx.swiperefreshlayout.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import h0.g;

/* compiled from: CircularProgressDrawable.java */
/* loaded from: classes.dex */
public class b extends Drawable implements Animatable {

    /* renamed from: g  reason: collision with root package name */
    private static final Interpolator f4125g = new LinearInterpolator();

    /* renamed from: h  reason: collision with root package name */
    private static final Interpolator f4126h = new r0.b();

    /* renamed from: i  reason: collision with root package name */
    private static final int[] f4127i = {-16777216};

    /* renamed from: a  reason: collision with root package name */
    private final c f4128a;

    /* renamed from: b  reason: collision with root package name */
    private float f4129b;

    /* renamed from: c  reason: collision with root package name */
    private Resources f4130c;

    /* renamed from: d  reason: collision with root package name */
    private Animator f4131d;

    /* renamed from: e  reason: collision with root package name */
    float f4132e;

    /* renamed from: f  reason: collision with root package name */
    boolean f4133f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CircularProgressDrawable.java */
    /* loaded from: classes.dex */
    public class a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f4134a;

        a(c cVar) {
            this.f4134a = cVar;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            b.this.n(floatValue, this.f4134a);
            b.this.b(floatValue, this.f4134a, false);
            b.this.invalidateSelf();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CircularProgressDrawable.java */
    /* renamed from: androidx.swiperefreshlayout.widget.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0077b implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f4136a;

        C0077b(c cVar) {
            this.f4136a = cVar;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            b.this.b(1.0f, this.f4136a, true);
            this.f4136a.A();
            this.f4136a.l();
            b bVar = b.this;
            if (bVar.f4133f) {
                bVar.f4133f = false;
                animator.cancel();
                animator.setDuration(1332L);
                animator.start();
                this.f4136a.x(false);
                return;
            }
            bVar.f4132e += 1.0f;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            b.this.f4132e = 0.0f;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: CircularProgressDrawable.java */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        final RectF f4138a = new RectF();

        /* renamed from: b  reason: collision with root package name */
        final Paint f4139b;

        /* renamed from: c  reason: collision with root package name */
        final Paint f4140c;

        /* renamed from: d  reason: collision with root package name */
        final Paint f4141d;

        /* renamed from: e  reason: collision with root package name */
        float f4142e;

        /* renamed from: f  reason: collision with root package name */
        float f4143f;

        /* renamed from: g  reason: collision with root package name */
        float f4144g;

        /* renamed from: h  reason: collision with root package name */
        float f4145h;

        /* renamed from: i  reason: collision with root package name */
        int[] f4146i;

        /* renamed from: j  reason: collision with root package name */
        int f4147j;

        /* renamed from: k  reason: collision with root package name */
        float f4148k;

        /* renamed from: l  reason: collision with root package name */
        float f4149l;

        /* renamed from: m  reason: collision with root package name */
        float f4150m;

        /* renamed from: n  reason: collision with root package name */
        boolean f4151n;

        /* renamed from: o  reason: collision with root package name */
        Path f4152o;

        /* renamed from: p  reason: collision with root package name */
        float f4153p;

        /* renamed from: q  reason: collision with root package name */
        float f4154q;

        /* renamed from: r  reason: collision with root package name */
        int f4155r;

        /* renamed from: s  reason: collision with root package name */
        int f4156s;

        /* renamed from: t  reason: collision with root package name */
        int f4157t;

        /* renamed from: u  reason: collision with root package name */
        int f4158u;

        c() {
            Paint paint = new Paint();
            this.f4139b = paint;
            Paint paint2 = new Paint();
            this.f4140c = paint2;
            Paint paint3 = new Paint();
            this.f4141d = paint3;
            this.f4142e = 0.0f;
            this.f4143f = 0.0f;
            this.f4144g = 0.0f;
            this.f4145h = 5.0f;
            this.f4153p = 1.0f;
            this.f4157t = 255;
            paint.setStrokeCap(Paint.Cap.SQUARE);
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setAntiAlias(true);
            paint3.setColor(0);
        }

        void A() {
            this.f4148k = this.f4142e;
            this.f4149l = this.f4143f;
            this.f4150m = this.f4144g;
        }

        void a(Canvas canvas, Rect rect) {
            RectF rectF = this.f4138a;
            float f10 = this.f4154q;
            float f11 = (this.f4145h / 2.0f) + f10;
            if (f10 <= 0.0f) {
                f11 = (Math.min(rect.width(), rect.height()) / 2.0f) - Math.max((this.f4155r * this.f4153p) / 2.0f, this.f4145h / 2.0f);
            }
            rectF.set(rect.centerX() - f11, rect.centerY() - f11, rect.centerX() + f11, rect.centerY() + f11);
            float f12 = this.f4142e;
            float f13 = this.f4144g;
            float f14 = (f12 + f13) * 360.0f;
            float f15 = ((this.f4143f + f13) * 360.0f) - f14;
            this.f4139b.setColor(this.f4158u);
            this.f4139b.setAlpha(this.f4157t);
            float f16 = this.f4145h / 2.0f;
            rectF.inset(f16, f16);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.f4141d);
            float f17 = -f16;
            rectF.inset(f17, f17);
            canvas.drawArc(rectF, f14, f15, false, this.f4139b);
            b(canvas, f14, f15, rectF);
        }

        void b(Canvas canvas, float f10, float f11, RectF rectF) {
            if (this.f4151n) {
                Path path = this.f4152o;
                if (path == null) {
                    Path path2 = new Path();
                    this.f4152o = path2;
                    path2.setFillType(Path.FillType.EVEN_ODD);
                } else {
                    path.reset();
                }
                this.f4152o.moveTo(0.0f, 0.0f);
                this.f4152o.lineTo(this.f4155r * this.f4153p, 0.0f);
                Path path3 = this.f4152o;
                float f12 = this.f4153p;
                path3.lineTo((this.f4155r * f12) / 2.0f, this.f4156s * f12);
                this.f4152o.offset(((Math.min(rectF.width(), rectF.height()) / 2.0f) + rectF.centerX()) - ((this.f4155r * this.f4153p) / 2.0f), rectF.centerY() + (this.f4145h / 2.0f));
                this.f4152o.close();
                this.f4140c.setColor(this.f4158u);
                this.f4140c.setAlpha(this.f4157t);
                canvas.save();
                canvas.rotate(f10 + f11, rectF.centerX(), rectF.centerY());
                canvas.drawPath(this.f4152o, this.f4140c);
                canvas.restore();
            }
        }

        int c() {
            return this.f4157t;
        }

        float d() {
            return this.f4143f;
        }

        int e() {
            return this.f4146i[f()];
        }

        int f() {
            return (this.f4147j + 1) % this.f4146i.length;
        }

        float g() {
            return this.f4142e;
        }

        int h() {
            return this.f4146i[this.f4147j];
        }

        float i() {
            return this.f4149l;
        }

        float j() {
            return this.f4150m;
        }

        float k() {
            return this.f4148k;
        }

        void l() {
            t(f());
        }

        void m() {
            this.f4148k = 0.0f;
            this.f4149l = 0.0f;
            this.f4150m = 0.0f;
            y(0.0f);
            v(0.0f);
            w(0.0f);
        }

        void n(int i10) {
            this.f4157t = i10;
        }

        void o(float f10, float f11) {
            this.f4155r = (int) f10;
            this.f4156s = (int) f11;
        }

        void p(float f10) {
            if (f10 != this.f4153p) {
                this.f4153p = f10;
            }
        }

        void q(float f10) {
            this.f4154q = f10;
        }

        void r(int i10) {
            this.f4158u = i10;
        }

        void s(ColorFilter colorFilter) {
            this.f4139b.setColorFilter(colorFilter);
        }

        void t(int i10) {
            this.f4147j = i10;
            this.f4158u = this.f4146i[i10];
        }

        void u(int[] iArr) {
            this.f4146i = iArr;
            t(0);
        }

        void v(float f10) {
            this.f4143f = f10;
        }

        void w(float f10) {
            this.f4144g = f10;
        }

        void x(boolean z10) {
            if (this.f4151n != z10) {
                this.f4151n = z10;
            }
        }

        void y(float f10) {
            this.f4142e = f10;
        }

        void z(float f10) {
            this.f4145h = f10;
            this.f4139b.setStrokeWidth(f10);
        }
    }

    public b(Context context) {
        this.f4130c = ((Context) g.f(context)).getResources();
        c cVar = new c();
        this.f4128a = cVar;
        cVar.u(f4127i);
        k(2.5f);
        m();
    }

    private void a(float f10, c cVar) {
        n(f10, cVar);
        cVar.y(cVar.k() + (((cVar.i() - 0.01f) - cVar.k()) * f10));
        cVar.v(cVar.i());
        cVar.w(cVar.j() + ((((float) (Math.floor(cVar.j() / 0.8f) + 1.0d)) - cVar.j()) * f10));
    }

    private int c(float f10, int i10, int i11) {
        int i12 = (i10 >> 24) & 255;
        int i13 = (i10 >> 16) & 255;
        int i14 = (i10 >> 8) & 255;
        int i15 = i10 & 255;
        return ((i12 + ((int) ((((i11 >> 24) & 255) - i12) * f10))) << 24) | ((i13 + ((int) ((((i11 >> 16) & 255) - i13) * f10))) << 16) | ((i14 + ((int) ((((i11 >> 8) & 255) - i14) * f10))) << 8) | (i15 + ((int) (f10 * ((i11 & 255) - i15))));
    }

    private void h(float f10) {
        this.f4129b = f10;
    }

    private void i(float f10, float f11, float f12, float f13) {
        c cVar = this.f4128a;
        float f14 = this.f4130c.getDisplayMetrics().density;
        cVar.z(f11 * f14);
        cVar.q(f10 * f14);
        cVar.t(0);
        cVar.o(f12 * f14, f13 * f14);
    }

    private void m() {
        c cVar = this.f4128a;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new a(cVar));
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setInterpolator(f4125g);
        ofFloat.addListener(new C0077b(cVar));
        this.f4131d = ofFloat;
    }

    void b(float f10, c cVar, boolean z10) {
        float interpolation;
        float f11;
        if (this.f4133f) {
            a(f10, cVar);
        } else if (f10 != 1.0f || z10) {
            float j10 = cVar.j();
            if (f10 < 0.5f) {
                interpolation = cVar.k();
                f11 = (f4126h.getInterpolation(f10 / 0.5f) * 0.79f) + 0.01f + interpolation;
            } else {
                float k10 = cVar.k() + 0.79f;
                interpolation = k10 - (((1.0f - f4126h.getInterpolation((f10 - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                f11 = k10;
            }
            cVar.y(interpolation);
            cVar.v(f11);
            cVar.w(j10 + (0.20999998f * f10));
            h((f10 + this.f4132e) * 216.0f);
        }
    }

    public void d(boolean z10) {
        this.f4128a.x(z10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.f4129b, bounds.exactCenterX(), bounds.exactCenterY());
        this.f4128a.a(canvas, bounds);
        canvas.restore();
    }

    public void e(float f10) {
        this.f4128a.p(f10);
        invalidateSelf();
    }

    public void f(int... iArr) {
        this.f4128a.u(iArr);
        this.f4128a.t(0);
        invalidateSelf();
    }

    public void g(float f10) {
        this.f4128a.w(f10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f4128a.c();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f4131d.isRunning();
    }

    public void j(float f10, float f11) {
        this.f4128a.y(f10);
        this.f4128a.v(f11);
        invalidateSelf();
    }

    public void k(float f10) {
        this.f4128a.z(f10);
        invalidateSelf();
    }

    public void l(int i10) {
        if (i10 == 0) {
            i(11.0f, 3.0f, 12.0f, 6.0f);
        } else {
            i(7.5f, 2.5f, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    void n(float f10, c cVar) {
        if (f10 > 0.75f) {
            cVar.r(c((f10 - 0.75f) / 0.25f, cVar.h(), cVar.e()));
        } else {
            cVar.r(cVar.h());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f4128a.n(i10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f4128a.s(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.f4131d.cancel();
        this.f4128a.A();
        if (this.f4128a.d() != this.f4128a.g()) {
            this.f4133f = true;
            this.f4131d.setDuration(666L);
            this.f4131d.start();
            return;
        }
        this.f4128a.t(0);
        this.f4128a.m();
        this.f4131d.setDuration(1332L);
        this.f4131d.start();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f4131d.cancel();
        h(0.0f);
        this.f4128a.x(false);
        this.f4128a.t(0);
        this.f4128a.m();
        invalidateSelf();
    }
}
