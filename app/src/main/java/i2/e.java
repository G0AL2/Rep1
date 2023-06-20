package i2;

import android.view.Choreographer;

/* compiled from: LottieValueAnimator.java */
/* loaded from: classes.dex */
public class e extends a implements Choreographer.FrameCallback {

    /* renamed from: j  reason: collision with root package name */
    private com.airbnb.lottie.h f31522j;

    /* renamed from: c  reason: collision with root package name */
    private float f31515c = 1.0f;

    /* renamed from: d  reason: collision with root package name */
    private boolean f31516d = false;

    /* renamed from: e  reason: collision with root package name */
    private long f31517e = 0;

    /* renamed from: f  reason: collision with root package name */
    private float f31518f = 0.0f;

    /* renamed from: g  reason: collision with root package name */
    private int f31519g = 0;

    /* renamed from: h  reason: collision with root package name */
    private float f31520h = -2.1474836E9f;

    /* renamed from: i  reason: collision with root package name */
    private float f31521i = 2.1474836E9f;

    /* renamed from: k  reason: collision with root package name */
    protected boolean f31523k = false;

    private void E() {
        if (this.f31522j == null) {
            return;
        }
        float f10 = this.f31518f;
        if (f10 < this.f31520h || f10 > this.f31521i) {
            throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(this.f31520h), Float.valueOf(this.f31521i), Float.valueOf(this.f31518f)));
        }
    }

    private float m() {
        com.airbnb.lottie.h hVar = this.f31522j;
        if (hVar == null) {
            return Float.MAX_VALUE;
        }
        return (1.0E9f / hVar.i()) / Math.abs(this.f31515c);
    }

    private boolean q() {
        return p() < 0.0f;
    }

    public void A(float f10) {
        B(this.f31520h, f10);
    }

    public void B(float f10, float f11) {
        if (f10 <= f11) {
            com.airbnb.lottie.h hVar = this.f31522j;
            float p10 = hVar == null ? -3.4028235E38f : hVar.p();
            com.airbnb.lottie.h hVar2 = this.f31522j;
            float f12 = hVar2 == null ? Float.MAX_VALUE : hVar2.f();
            float b10 = g.b(f10, p10, f12);
            float b11 = g.b(f11, p10, f12);
            if (b10 == this.f31520h && b11 == this.f31521i) {
                return;
            }
            this.f31520h = b10;
            this.f31521i = b11;
            z((int) g.b(this.f31518f, b10, b11));
            return;
        }
        throw new IllegalArgumentException(String.format("minFrame (%s) must be <= maxFrame (%s)", Float.valueOf(f10), Float.valueOf(f11)));
    }

    public void C(int i10) {
        B(i10, (int) this.f31521i);
    }

    public void D(float f10) {
        this.f31515c = f10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // i2.a
    public void b() {
        super.b();
        c(q());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void cancel() {
        b();
        u();
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j10) {
        t();
        if (this.f31522j == null || !isRunning()) {
            return;
        }
        com.airbnb.lottie.c.a("LottieValueAnimator#doFrame");
        long j11 = this.f31517e;
        float m10 = ((float) (j11 != 0 ? j10 - j11 : 0L)) / m();
        float f10 = this.f31518f;
        if (q()) {
            m10 = -m10;
        }
        float f11 = f10 + m10;
        this.f31518f = f11;
        boolean z10 = !g.d(f11, o(), n());
        this.f31518f = g.b(this.f31518f, o(), n());
        this.f31517e = j10;
        f();
        if (z10) {
            if (getRepeatCount() != -1 && this.f31519g >= getRepeatCount()) {
                this.f31518f = this.f31515c < 0.0f ? o() : n();
                u();
                c(q());
            } else {
                d();
                this.f31519g++;
                if (getRepeatMode() == 2) {
                    this.f31516d = !this.f31516d;
                    x();
                } else {
                    this.f31518f = q() ? n() : o();
                }
                this.f31517e = j10;
            }
        }
        E();
        com.airbnb.lottie.c.b("LottieValueAnimator#doFrame");
    }

    public void g() {
        this.f31522j = null;
        this.f31520h = -2.1474836E9f;
        this.f31521i = 2.1474836E9f;
    }

    @Override // android.animation.ValueAnimator
    public float getAnimatedFraction() {
        float o10;
        float n10;
        float o11;
        if (this.f31522j == null) {
            return 0.0f;
        }
        if (q()) {
            o10 = n() - this.f31518f;
            n10 = n();
            o11 = o();
        } else {
            o10 = this.f31518f - o();
            n10 = n();
            o11 = o();
        }
        return o10 / (n10 - o11);
    }

    @Override // android.animation.ValueAnimator
    public Object getAnimatedValue() {
        return Float.valueOf(j());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public long getDuration() {
        com.airbnb.lottie.h hVar = this.f31522j;
        if (hVar == null) {
            return 0L;
        }
        return hVar.d();
    }

    public void i() {
        u();
        c(q());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public boolean isRunning() {
        return this.f31523k;
    }

    public float j() {
        com.airbnb.lottie.h hVar = this.f31522j;
        if (hVar == null) {
            return 0.0f;
        }
        return (this.f31518f - hVar.p()) / (this.f31522j.f() - this.f31522j.p());
    }

    public float k() {
        return this.f31518f;
    }

    public float n() {
        com.airbnb.lottie.h hVar = this.f31522j;
        if (hVar == null) {
            return 0.0f;
        }
        float f10 = this.f31521i;
        return f10 == 2.1474836E9f ? hVar.f() : f10;
    }

    public float o() {
        com.airbnb.lottie.h hVar = this.f31522j;
        if (hVar == null) {
            return 0.0f;
        }
        float f10 = this.f31520h;
        return f10 == -2.1474836E9f ? hVar.p() : f10;
    }

    public float p() {
        return this.f31515c;
    }

    public void r() {
        u();
    }

    public void s() {
        this.f31523k = true;
        e(q());
        z((int) (q() ? n() : o()));
        this.f31517e = 0L;
        this.f31519g = 0;
        t();
    }

    @Override // android.animation.ValueAnimator
    public void setRepeatMode(int i10) {
        super.setRepeatMode(i10);
        if (i10 == 2 || !this.f31516d) {
            return;
        }
        this.f31516d = false;
        x();
    }

    protected void t() {
        if (isRunning()) {
            v(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    protected void u() {
        v(true);
    }

    protected void v(boolean z10) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z10) {
            this.f31523k = false;
        }
    }

    public void w() {
        this.f31523k = true;
        t();
        this.f31517e = 0L;
        if (q() && k() == o()) {
            this.f31518f = n();
        } else if (q() || k() != n()) {
        } else {
            this.f31518f = o();
        }
    }

    public void x() {
        D(-p());
    }

    public void y(com.airbnb.lottie.h hVar) {
        boolean z10 = this.f31522j == null;
        this.f31522j = hVar;
        if (z10) {
            B(Math.max(this.f31520h, hVar.p()), Math.min(this.f31521i, hVar.f()));
        } else {
            B((int) hVar.p(), (int) hVar.f());
        }
        float f10 = this.f31518f;
        this.f31518f = 0.0f;
        z((int) f10);
        f();
    }

    public void z(float f10) {
        if (this.f31518f == f10) {
            return;
        }
        this.f31518f = g.b(f10, o(), n());
        this.f31517e = 0L;
        f();
    }
}
