package com.airbnb.lottie;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: LottieDrawable.java */
/* loaded from: classes.dex */
public class d0 extends Drawable implements Drawable.Callback, Animatable {
    private Canvas A;
    private Rect B;
    private RectF C;
    private Paint D;
    private Rect E;
    private Rect F;
    private RectF G;
    private RectF H;
    private Matrix I;
    private Matrix J;
    private boolean K;

    /* renamed from: a  reason: collision with root package name */
    private h f5745a;

    /* renamed from: b  reason: collision with root package name */
    private final i2.e f5746b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f5747c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f5748d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f5749e;

    /* renamed from: f  reason: collision with root package name */
    private c f5750f;

    /* renamed from: g  reason: collision with root package name */
    private final ArrayList<b> f5751g;

    /* renamed from: h  reason: collision with root package name */
    private final ValueAnimator.AnimatorUpdateListener f5752h;

    /* renamed from: i  reason: collision with root package name */
    private a2.b f5753i;

    /* renamed from: j  reason: collision with root package name */
    private String f5754j;

    /* renamed from: k  reason: collision with root package name */
    private com.airbnb.lottie.b f5755k;

    /* renamed from: l  reason: collision with root package name */
    private a2.a f5756l;

    /* renamed from: m  reason: collision with root package name */
    com.airbnb.lottie.a f5757m;

    /* renamed from: n  reason: collision with root package name */
    r0 f5758n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f5759o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f5760p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f5761q;

    /* renamed from: r  reason: collision with root package name */
    private e2.c f5762r;

    /* renamed from: s  reason: collision with root package name */
    private int f5763s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f5764t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f5765u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f5766v;

    /* renamed from: w  reason: collision with root package name */
    private p0 f5767w;

    /* renamed from: x  reason: collision with root package name */
    private boolean f5768x;

    /* renamed from: y  reason: collision with root package name */
    private final Matrix f5769y;

    /* renamed from: z  reason: collision with root package name */
    private Bitmap f5770z;

    /* compiled from: LottieDrawable.java */
    /* loaded from: classes.dex */
    class a implements ValueAnimator.AnimatorUpdateListener {
        a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (d0.this.f5762r != null) {
                d0.this.f5762r.L(d0.this.f5746b.j());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: LottieDrawable.java */
    /* loaded from: classes.dex */
    public interface b {
        void a(h hVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: LottieDrawable.java */
    /* loaded from: classes.dex */
    public enum c {
        NONE,
        PLAY,
        RESUME
    }

    public d0() {
        i2.e eVar = new i2.e();
        this.f5746b = eVar;
        this.f5747c = true;
        this.f5748d = false;
        this.f5749e = false;
        this.f5750f = c.NONE;
        this.f5751g = new ArrayList<>();
        a aVar = new a();
        this.f5752h = aVar;
        this.f5760p = false;
        this.f5761q = true;
        this.f5763s = 255;
        this.f5767w = p0.AUTOMATIC;
        this.f5768x = false;
        this.f5769y = new Matrix();
        this.K = false;
        eVar.addUpdateListener(aVar);
    }

    private void C(int i10, int i11) {
        Bitmap bitmap = this.f5770z;
        if (bitmap != null && bitmap.getWidth() >= i10 && this.f5770z.getHeight() >= i11) {
            if (this.f5770z.getWidth() > i10 || this.f5770z.getHeight() > i11) {
                Bitmap createBitmap = Bitmap.createBitmap(this.f5770z, 0, 0, i10, i11);
                this.f5770z = createBitmap;
                this.A.setBitmap(createBitmap);
                this.K = true;
                return;
            }
            return;
        }
        Bitmap createBitmap2 = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
        this.f5770z = createBitmap2;
        this.A.setBitmap(createBitmap2);
        this.K = true;
    }

    private void D() {
        if (this.A != null) {
            return;
        }
        this.A = new Canvas();
        this.H = new RectF();
        this.I = new Matrix();
        this.J = new Matrix();
        this.B = new Rect();
        this.C = new RectF();
        this.D = new x1.a();
        this.E = new Rect();
        this.F = new Rect();
        this.G = new RectF();
    }

    private Context H() {
        Drawable.Callback callback = getCallback();
        if (callback != null && (callback instanceof View)) {
            return ((View) callback).getContext();
        }
        return null;
    }

    private a2.a I() {
        if (getCallback() == null) {
            return null;
        }
        if (this.f5756l == null) {
            this.f5756l = new a2.a(getCallback(), this.f5757m);
        }
        return this.f5756l;
    }

    private a2.b K() {
        if (getCallback() == null) {
            return null;
        }
        a2.b bVar = this.f5753i;
        if (bVar != null && !bVar.b(H())) {
            this.f5753i = null;
        }
        if (this.f5753i == null) {
            this.f5753i = new a2.b(getCallback(), this.f5754j, this.f5755k, this.f5745a.j());
        }
        return this.f5753i;
    }

    private boolean Y() {
        Drawable.Callback callback = getCallback();
        if (callback instanceof View) {
            ViewParent parent = ((View) callback).getParent();
            if (Build.VERSION.SDK_INT < 18 || !(parent instanceof ViewGroup)) {
                return false;
            }
            return !((ViewGroup) parent).getClipChildren();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c0(b2.e eVar, Object obj, j2.c cVar, h hVar) {
        q(eVar, obj, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d0(h hVar) {
        q0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e0(h hVar) {
        t0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f0(int i10, h hVar) {
        A0(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g0(int i10, h hVar) {
        F0(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h0(String str, h hVar) {
        G0(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i0(float f10, h hVar) {
        H0(f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j0(int i10, int i11, h hVar) {
        I0(i10, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k0(String str, h hVar) {
        J0(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l0(int i10, h hVar) {
        K0(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m0(String str, h hVar) {
        L0(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n0(float f10, h hVar) {
        M0(f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o0(float f10, h hVar) {
        P0(f10);
    }

    private boolean r() {
        return this.f5747c || this.f5748d;
    }

    private void r0(Canvas canvas, e2.c cVar) {
        if (this.f5745a == null || cVar == null) {
            return;
        }
        D();
        canvas.getMatrix(this.I);
        canvas.getClipBounds(this.B);
        w(this.B, this.C);
        this.I.mapRect(this.C);
        x(this.C, this.B);
        if (this.f5761q) {
            this.H.set(0.0f, 0.0f, getIntrinsicWidth(), getIntrinsicHeight());
        } else {
            cVar.f(this.H, null, false);
        }
        this.I.mapRect(this.H);
        Rect bounds = getBounds();
        float width = bounds.width() / getIntrinsicWidth();
        float height = bounds.height() / getIntrinsicHeight();
        v0(this.H, width, height);
        if (!Y()) {
            RectF rectF = this.H;
            Rect rect = this.B;
            rectF.intersect(rect.left, rect.top, rect.right, rect.bottom);
        }
        int ceil = (int) Math.ceil(this.H.width());
        int ceil2 = (int) Math.ceil(this.H.height());
        if (ceil == 0 || ceil2 == 0) {
            return;
        }
        C(ceil, ceil2);
        if (this.K) {
            this.f5769y.set(this.I);
            this.f5769y.preScale(width, height);
            Matrix matrix = this.f5769y;
            RectF rectF2 = this.H;
            matrix.postTranslate(-rectF2.left, -rectF2.top);
            this.f5770z.eraseColor(0);
            cVar.h(this.A, this.f5769y, this.f5763s);
            this.I.invert(this.J);
            this.J.mapRect(this.G, this.H);
            x(this.G, this.F);
        }
        this.E.set(0, 0, ceil, ceil2);
        canvas.drawBitmap(this.f5770z, this.E, this.F, this.D);
    }

    private void s() {
        h hVar = this.f5745a;
        if (hVar == null) {
            return;
        }
        e2.c cVar = new e2.c(this, g2.v.a(hVar), hVar.k(), hVar);
        this.f5762r = cVar;
        if (this.f5765u) {
            cVar.J(true);
        }
        this.f5762r.O(this.f5761q);
    }

    private void v() {
        h hVar = this.f5745a;
        if (hVar == null) {
            return;
        }
        this.f5768x = this.f5767w.a(Build.VERSION.SDK_INT, hVar.q(), hVar.m());
    }

    private void v0(RectF rectF, float f10, float f11) {
        rectF.set(rectF.left * f10, rectF.top * f11, rectF.right * f10, rectF.bottom * f11);
    }

    private void w(Rect rect, RectF rectF) {
        rectF.set(rect.left, rect.top, rect.right, rect.bottom);
    }

    private void x(RectF rectF, Rect rect) {
        rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
    }

    private void y(Canvas canvas) {
        e2.c cVar = this.f5762r;
        h hVar = this.f5745a;
        if (cVar == null || hVar == null) {
            return;
        }
        this.f5769y.reset();
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            float height = bounds.height() / hVar.b().height();
            this.f5769y.preScale(bounds.width() / hVar.b().width(), height);
        }
        cVar.h(canvas, this.f5769y, this.f5763s);
    }

    public boolean A() {
        return this.f5759o;
    }

    public void A0(final int i10) {
        if (this.f5745a == null) {
            this.f5751g.add(new b() { // from class: com.airbnb.lottie.z
                @Override // com.airbnb.lottie.d0.b
                public final void a(h hVar) {
                    d0.this.f0(i10, hVar);
                }
            });
        } else {
            this.f5746b.z(i10);
        }
    }

    public void B() {
        this.f5751g.clear();
        this.f5746b.i();
        if (isVisible()) {
            return;
        }
        this.f5750f = c.NONE;
    }

    public void B0(boolean z10) {
        this.f5748d = z10;
    }

    public void C0(com.airbnb.lottie.b bVar) {
        this.f5755k = bVar;
        a2.b bVar2 = this.f5753i;
        if (bVar2 != null) {
            bVar2.d(bVar);
        }
    }

    public void D0(String str) {
        this.f5754j = str;
    }

    public Bitmap E(String str) {
        a2.b K = K();
        if (K != null) {
            return K.a(str);
        }
        return null;
    }

    public void E0(boolean z10) {
        this.f5760p = z10;
    }

    public boolean F() {
        return this.f5761q;
    }

    public void F0(final int i10) {
        if (this.f5745a == null) {
            this.f5751g.add(new b() { // from class: com.airbnb.lottie.a0
                @Override // com.airbnb.lottie.d0.b
                public final void a(h hVar) {
                    d0.this.g0(i10, hVar);
                }
            });
        } else {
            this.f5746b.A(i10 + 0.99f);
        }
    }

    public h G() {
        return this.f5745a;
    }

    public void G0(final String str) {
        h hVar = this.f5745a;
        if (hVar == null) {
            this.f5751g.add(new b() { // from class: com.airbnb.lottie.s
                @Override // com.airbnb.lottie.d0.b
                public final void a(h hVar2) {
                    d0.this.h0(str, hVar2);
                }
            });
            return;
        }
        b2.h l10 = hVar.l(str);
        if (l10 != null) {
            F0((int) (l10.f4804b + l10.f4805c));
            return;
        }
        throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
    }

    public void H0(final float f10) {
        h hVar = this.f5745a;
        if (hVar == null) {
            this.f5751g.add(new b() { // from class: com.airbnb.lottie.v
                @Override // com.airbnb.lottie.d0.b
                public final void a(h hVar2) {
                    d0.this.i0(f10, hVar2);
                }
            });
        } else {
            this.f5746b.A(i2.g.i(hVar.p(), this.f5745a.f(), f10));
        }
    }

    public void I0(final int i10, final int i11) {
        if (this.f5745a == null) {
            this.f5751g.add(new b() { // from class: com.airbnb.lottie.b0
                @Override // com.airbnb.lottie.d0.b
                public final void a(h hVar) {
                    d0.this.j0(i10, i11, hVar);
                }
            });
        } else {
            this.f5746b.B(i10, i11 + 0.99f);
        }
    }

    public int J() {
        return (int) this.f5746b.k();
    }

    public void J0(final String str) {
        h hVar = this.f5745a;
        if (hVar == null) {
            this.f5751g.add(new b() { // from class: com.airbnb.lottie.t
                @Override // com.airbnb.lottie.d0.b
                public final void a(h hVar2) {
                    d0.this.k0(str, hVar2);
                }
            });
            return;
        }
        b2.h l10 = hVar.l(str);
        if (l10 != null) {
            int i10 = (int) l10.f4804b;
            I0(i10, ((int) l10.f4805c) + i10);
            return;
        }
        throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
    }

    public void K0(final int i10) {
        if (this.f5745a == null) {
            this.f5751g.add(new b() { // from class: com.airbnb.lottie.y
                @Override // com.airbnb.lottie.d0.b
                public final void a(h hVar) {
                    d0.this.l0(i10, hVar);
                }
            });
        } else {
            this.f5746b.C(i10);
        }
    }

    public String L() {
        return this.f5754j;
    }

    public void L0(final String str) {
        h hVar = this.f5745a;
        if (hVar == null) {
            this.f5751g.add(new b() { // from class: com.airbnb.lottie.r
                @Override // com.airbnb.lottie.d0.b
                public final void a(h hVar2) {
                    d0.this.m0(str, hVar2);
                }
            });
            return;
        }
        b2.h l10 = hVar.l(str);
        if (l10 != null) {
            K0((int) l10.f4804b);
            return;
        }
        throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
    }

    public e0 M(String str) {
        h hVar = this.f5745a;
        if (hVar == null) {
            return null;
        }
        return hVar.j().get(str);
    }

    public void M0(final float f10) {
        h hVar = this.f5745a;
        if (hVar == null) {
            this.f5751g.add(new b() { // from class: com.airbnb.lottie.w
                @Override // com.airbnb.lottie.d0.b
                public final void a(h hVar2) {
                    d0.this.n0(f10, hVar2);
                }
            });
        } else {
            K0((int) i2.g.i(hVar.p(), this.f5745a.f(), f10));
        }
    }

    public boolean N() {
        return this.f5760p;
    }

    public void N0(boolean z10) {
        if (this.f5765u == z10) {
            return;
        }
        this.f5765u = z10;
        e2.c cVar = this.f5762r;
        if (cVar != null) {
            cVar.J(z10);
        }
    }

    public float O() {
        return this.f5746b.n();
    }

    public void O0(boolean z10) {
        this.f5764t = z10;
        h hVar = this.f5745a;
        if (hVar != null) {
            hVar.v(z10);
        }
    }

    public float P() {
        return this.f5746b.o();
    }

    public void P0(final float f10) {
        if (this.f5745a == null) {
            this.f5751g.add(new b() { // from class: com.airbnb.lottie.x
                @Override // com.airbnb.lottie.d0.b
                public final void a(h hVar) {
                    d0.this.o0(f10, hVar);
                }
            });
            return;
        }
        com.airbnb.lottie.c.a("Drawable#setProgress");
        this.f5746b.z(this.f5745a.h(f10));
        com.airbnb.lottie.c.b("Drawable#setProgress");
    }

    public m0 Q() {
        h hVar = this.f5745a;
        if (hVar != null) {
            return hVar.n();
        }
        return null;
    }

    public void Q0(p0 p0Var) {
        this.f5767w = p0Var;
        v();
    }

    public float R() {
        return this.f5746b.j();
    }

    public void R0(int i10) {
        this.f5746b.setRepeatCount(i10);
    }

    public p0 S() {
        return this.f5768x ? p0.SOFTWARE : p0.HARDWARE;
    }

    public void S0(int i10) {
        this.f5746b.setRepeatMode(i10);
    }

    public int T() {
        return this.f5746b.getRepeatCount();
    }

    public void T0(boolean z10) {
        this.f5749e = z10;
    }

    @SuppressLint({"WrongConstant"})
    public int U() {
        return this.f5746b.getRepeatMode();
    }

    public void U0(float f10) {
        this.f5746b.D(f10);
    }

    public float V() {
        return this.f5746b.p();
    }

    public void V0(Boolean bool) {
        this.f5747c = bool.booleanValue();
    }

    public r0 W() {
        return this.f5758n;
    }

    public void W0(r0 r0Var) {
        this.f5758n = r0Var;
    }

    public Typeface X(String str, String str2) {
        a2.a I = I();
        if (I != null) {
            return I.b(str, str2);
        }
        return null;
    }

    public boolean X0() {
        return this.f5758n == null && this.f5745a.c().k() > 0;
    }

    public boolean Z() {
        i2.e eVar = this.f5746b;
        if (eVar == null) {
            return false;
        }
        return eVar.isRunning();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a0() {
        if (isVisible()) {
            return this.f5746b.isRunning();
        }
        c cVar = this.f5750f;
        return cVar == c.PLAY || cVar == c.RESUME;
    }

    public boolean b0() {
        return this.f5766v;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        com.airbnb.lottie.c.a("Drawable#draw");
        if (this.f5749e) {
            try {
                if (this.f5768x) {
                    r0(canvas, this.f5762r);
                } else {
                    y(canvas);
                }
            } catch (Throwable th) {
                i2.d.b("Lottie crashed in draw!", th);
            }
        } else if (this.f5768x) {
            r0(canvas, this.f5762r);
        } else {
            y(canvas);
        }
        this.K = false;
        com.airbnb.lottie.c.b("Drawable#draw");
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f5763s;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        h hVar = this.f5745a;
        if (hVar == null) {
            return -1;
        }
        return hVar.b().height();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        h hVar = this.f5745a;
        if (hVar == null) {
            return -1;
        }
        return hVar.b().width();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        if (this.K) {
            return;
        }
        this.K = true;
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return Z();
    }

    public void p(Animator.AnimatorListener animatorListener) {
        this.f5746b.addListener(animatorListener);
    }

    public void p0() {
        this.f5751g.clear();
        this.f5746b.r();
        if (isVisible()) {
            return;
        }
        this.f5750f = c.NONE;
    }

    public <T> void q(final b2.e eVar, final T t10, final j2.c<T> cVar) {
        e2.c cVar2 = this.f5762r;
        if (cVar2 == null) {
            this.f5751g.add(new b() { // from class: com.airbnb.lottie.c0
                @Override // com.airbnb.lottie.d0.b
                public final void a(h hVar) {
                    d0.this.c0(eVar, t10, cVar, hVar);
                }
            });
            return;
        }
        boolean z10 = true;
        if (eVar == b2.e.f4798c) {
            cVar2.e(t10, cVar);
        } else if (eVar.d() != null) {
            eVar.d().e(t10, cVar);
        } else {
            List<b2.e> s02 = s0(eVar);
            for (int i10 = 0; i10 < s02.size(); i10++) {
                s02.get(i10).d().e(t10, cVar);
            }
            z10 = true ^ s02.isEmpty();
        }
        if (z10) {
            invalidateSelf();
            if (t10 == i0.E) {
                P0(R());
            }
        }
    }

    public void q0() {
        if (this.f5762r == null) {
            this.f5751g.add(new b() { // from class: com.airbnb.lottie.u
                @Override // com.airbnb.lottie.d0.b
                public final void a(h hVar) {
                    d0.this.d0(hVar);
                }
            });
            return;
        }
        v();
        if (r() || T() == 0) {
            if (isVisible()) {
                this.f5746b.s();
                this.f5750f = c.NONE;
            } else {
                this.f5750f = c.PLAY;
            }
        }
        if (r()) {
            return;
        }
        A0((int) (V() < 0.0f ? P() : O()));
        this.f5746b.i();
        if (isVisible()) {
            return;
        }
        this.f5750f = c.NONE;
    }

    public List<b2.e> s0(b2.e eVar) {
        if (this.f5762r == null) {
            i2.d.c("Cannot resolve KeyPath. Composition is not set yet.");
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        this.f5762r.d(eVar, 0, arrayList, new b2.e(new String[0]));
        return arrayList;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.scheduleDrawable(this, runnable, j10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f5763s = i10;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        i2.d.c("Use addColorFilter instead.");
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        boolean z12 = !isVisible();
        boolean visible = super.setVisible(z10, z11);
        if (z10) {
            c cVar = this.f5750f;
            if (cVar == c.PLAY) {
                q0();
            } else if (cVar == c.RESUME) {
                t0();
            }
        } else if (this.f5746b.isRunning()) {
            p0();
            this.f5750f = c.RESUME;
        } else if (!z12) {
            this.f5750f = c.NONE;
        }
        return visible;
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Drawable.Callback callback = getCallback();
        if ((callback instanceof View) && ((View) callback).isInEditMode()) {
            return;
        }
        q0();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        B();
    }

    public void t() {
        this.f5751g.clear();
        this.f5746b.cancel();
        if (isVisible()) {
            return;
        }
        this.f5750f = c.NONE;
    }

    public void t0() {
        if (this.f5762r == null) {
            this.f5751g.add(new b() { // from class: com.airbnb.lottie.q
                @Override // com.airbnb.lottie.d0.b
                public final void a(h hVar) {
                    d0.this.e0(hVar);
                }
            });
            return;
        }
        v();
        if (r() || T() == 0) {
            if (isVisible()) {
                this.f5746b.w();
                this.f5750f = c.NONE;
            } else {
                this.f5750f = c.RESUME;
            }
        }
        if (r()) {
            return;
        }
        A0((int) (V() < 0.0f ? P() : O()));
        this.f5746b.i();
        if (isVisible()) {
            return;
        }
        this.f5750f = c.NONE;
    }

    public void u() {
        if (this.f5746b.isRunning()) {
            this.f5746b.cancel();
            if (!isVisible()) {
                this.f5750f = c.NONE;
            }
        }
        this.f5745a = null;
        this.f5762r = null;
        this.f5753i = null;
        this.f5746b.g();
        invalidateSelf();
    }

    public void u0() {
        this.f5746b.x();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.unscheduleDrawable(this, runnable);
    }

    public void w0(boolean z10) {
        this.f5766v = z10;
    }

    public void x0(boolean z10) {
        if (z10 != this.f5761q) {
            this.f5761q = z10;
            e2.c cVar = this.f5762r;
            if (cVar != null) {
                cVar.O(z10);
            }
            invalidateSelf();
        }
    }

    public boolean y0(h hVar) {
        if (this.f5745a == hVar) {
            return false;
        }
        this.K = true;
        u();
        this.f5745a = hVar;
        s();
        this.f5746b.y(hVar);
        P0(this.f5746b.getAnimatedFraction());
        Iterator it = new ArrayList(this.f5751g).iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar != null) {
                bVar.a(hVar);
            }
            it.remove();
        }
        this.f5751g.clear();
        hVar.v(this.f5764t);
        v();
        Drawable.Callback callback = getCallback();
        if (callback instanceof ImageView) {
            ImageView imageView = (ImageView) callback;
            imageView.setImageDrawable(null);
            imageView.setImageDrawable(this);
        }
        return true;
    }

    public void z(boolean z10) {
        if (this.f5759o == z10) {
            return;
        }
        if (Build.VERSION.SDK_INT < 19) {
            i2.d.c("Merge paths are not supported pre-Kit Kat.");
            return;
        }
        this.f5759o = z10;
        if (this.f5745a != null) {
            s();
        }
    }

    public void z0(com.airbnb.lottie.a aVar) {
        a2.a aVar2 = this.f5756l;
        if (aVar2 != null) {
            aVar2.c(aVar);
        }
    }
}
