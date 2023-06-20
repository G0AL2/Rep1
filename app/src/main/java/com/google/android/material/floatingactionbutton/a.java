package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.FloatEvaluator;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.core.view.z;
import java.util.ArrayList;
import java.util.Iterator;
import xa.n;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FloatingActionButtonImpl.java */
/* loaded from: classes2.dex */
public class a {
    static final TimeInterpolator E = ia.a.f31871c;
    static final int[] F = {16842919, 16842910};
    static final int[] G = {16843623, 16842908, 16842910};
    static final int[] H = {16842908, 16842910};
    static final int[] I = {16843623, 16842910};
    static final int[] J = {16842910};
    static final int[] K = new int[0];
    private ViewTreeObserver.OnPreDrawListener D;

    /* renamed from: a  reason: collision with root package name */
    xa.k f22397a;

    /* renamed from: b  reason: collision with root package name */
    xa.g f22398b;

    /* renamed from: c  reason: collision with root package name */
    Drawable f22399c;

    /* renamed from: d  reason: collision with root package name */
    Drawable f22400d;

    /* renamed from: e  reason: collision with root package name */
    boolean f22401e;

    /* renamed from: g  reason: collision with root package name */
    float f22403g;

    /* renamed from: h  reason: collision with root package name */
    float f22404h;

    /* renamed from: i  reason: collision with root package name */
    float f22405i;

    /* renamed from: j  reason: collision with root package name */
    int f22406j;

    /* renamed from: k  reason: collision with root package name */
    private final com.google.android.material.internal.e f22407k;

    /* renamed from: l  reason: collision with root package name */
    private ia.h f22408l;

    /* renamed from: m  reason: collision with root package name */
    private ia.h f22409m;

    /* renamed from: n  reason: collision with root package name */
    private Animator f22410n;

    /* renamed from: o  reason: collision with root package name */
    private ia.h f22411o;

    /* renamed from: p  reason: collision with root package name */
    private ia.h f22412p;

    /* renamed from: q  reason: collision with root package name */
    private float f22413q;

    /* renamed from: s  reason: collision with root package name */
    private int f22415s;

    /* renamed from: u  reason: collision with root package name */
    private ArrayList<Animator.AnimatorListener> f22417u;

    /* renamed from: v  reason: collision with root package name */
    private ArrayList<Animator.AnimatorListener> f22418v;

    /* renamed from: w  reason: collision with root package name */
    private ArrayList<i> f22419w;

    /* renamed from: x  reason: collision with root package name */
    final FloatingActionButton f22420x;

    /* renamed from: y  reason: collision with root package name */
    final wa.b f22421y;

    /* renamed from: f  reason: collision with root package name */
    boolean f22402f = true;

    /* renamed from: r  reason: collision with root package name */
    private float f22414r = 1.0f;

    /* renamed from: t  reason: collision with root package name */
    private int f22416t = 0;

    /* renamed from: z  reason: collision with root package name */
    private final Rect f22422z = new Rect();
    private final RectF A = new RectF();
    private final RectF B = new RectF();
    private final Matrix C = new Matrix();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FloatingActionButtonImpl.java */
    /* renamed from: com.google.android.material.floatingactionbutton.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0298a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        private boolean f22423a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f22424b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ j f22425c;

        C0298a(boolean z10, j jVar) {
            this.f22424b = z10;
            this.f22425c = jVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f22423a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            a.this.f22416t = 0;
            a.this.f22410n = null;
            if (this.f22423a) {
                return;
            }
            FloatingActionButton floatingActionButton = a.this.f22420x;
            boolean z10 = this.f22424b;
            floatingActionButton.b(z10 ? 8 : 4, z10);
            j jVar = this.f22425c;
            if (jVar != null) {
                jVar.b();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            a.this.f22420x.b(0, this.f22424b);
            a.this.f22416t = 1;
            a.this.f22410n = animator;
            this.f22423a = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FloatingActionButtonImpl.java */
    /* loaded from: classes2.dex */
    public class b extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f22427a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ j f22428b;

        b(boolean z10, j jVar) {
            this.f22427a = z10;
            this.f22428b = jVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            a.this.f22416t = 0;
            a.this.f22410n = null;
            j jVar = this.f22428b;
            if (jVar != null) {
                jVar.a();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            a.this.f22420x.b(0, this.f22427a);
            a.this.f22416t = 2;
            a.this.f22410n = animator;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FloatingActionButtonImpl.java */
    /* loaded from: classes2.dex */
    public class c extends ia.g {
        c() {
        }

        @Override // android.animation.TypeEvaluator
        /* renamed from: a */
        public Matrix evaluate(float f10, Matrix matrix, Matrix matrix2) {
            a.this.f22414r = f10;
            return super.a(f10, matrix, matrix2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FloatingActionButtonImpl.java */
    /* loaded from: classes2.dex */
    public class d implements TypeEvaluator<Float> {

        /* renamed from: a  reason: collision with root package name */
        FloatEvaluator f22431a = new FloatEvaluator();

        d(a aVar) {
        }

        @Override // android.animation.TypeEvaluator
        /* renamed from: a */
        public Float evaluate(float f10, Float f11, Float f12) {
            float floatValue = this.f22431a.evaluate(f10, (Number) f11, (Number) f12).floatValue();
            if (floatValue < 0.1f) {
                floatValue = 0.0f;
            }
            return Float.valueOf(floatValue);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FloatingActionButtonImpl.java */
    /* loaded from: classes2.dex */
    public class e implements ViewTreeObserver.OnPreDrawListener {
        e() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            a.this.F();
            return true;
        }
    }

    /* compiled from: FloatingActionButtonImpl.java */
    /* loaded from: classes2.dex */
    private class f extends l {
        f(a aVar) {
            super(aVar, null);
        }

        @Override // com.google.android.material.floatingactionbutton.a.l
        protected float a() {
            return 0.0f;
        }
    }

    /* compiled from: FloatingActionButtonImpl.java */
    /* loaded from: classes2.dex */
    private class g extends l {
        g() {
            super(a.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.a.l
        protected float a() {
            a aVar = a.this;
            return aVar.f22403g + aVar.f22404h;
        }
    }

    /* compiled from: FloatingActionButtonImpl.java */
    /* loaded from: classes2.dex */
    private class h extends l {
        h() {
            super(a.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.a.l
        protected float a() {
            a aVar = a.this;
            return aVar.f22403g + aVar.f22405i;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FloatingActionButtonImpl.java */
    /* loaded from: classes2.dex */
    public interface i {
        void a();

        void b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FloatingActionButtonImpl.java */
    /* loaded from: classes2.dex */
    public interface j {
        void a();

        void b();
    }

    /* compiled from: FloatingActionButtonImpl.java */
    /* loaded from: classes2.dex */
    private class k extends l {
        k() {
            super(a.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.a.l
        protected float a() {
            return a.this.f22403g;
        }
    }

    /* compiled from: FloatingActionButtonImpl.java */
    /* loaded from: classes2.dex */
    private abstract class l extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        private boolean f22436a;

        /* renamed from: b  reason: collision with root package name */
        private float f22437b;

        /* renamed from: c  reason: collision with root package name */
        private float f22438c;

        private l() {
        }

        protected abstract float a();

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            a.this.c0((int) this.f22438c);
            this.f22436a = false;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (!this.f22436a) {
                xa.g gVar = a.this.f22398b;
                this.f22437b = gVar == null ? 0.0f : gVar.v();
                this.f22438c = a();
                this.f22436a = true;
            }
            a aVar = a.this;
            float f10 = this.f22437b;
            aVar.c0((int) (f10 + ((this.f22438c - f10) * valueAnimator.getAnimatedFraction())));
        }

        /* synthetic */ l(a aVar, C0298a c0298a) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(FloatingActionButton floatingActionButton, wa.b bVar) {
        this.f22420x = floatingActionButton;
        this.f22421y = bVar;
        com.google.android.material.internal.e eVar = new com.google.android.material.internal.e();
        this.f22407k = eVar;
        eVar.a(F, i(new h()));
        eVar.a(G, i(new g()));
        eVar.a(H, i(new g()));
        eVar.a(I, i(new g()));
        eVar.a(J, i(new k()));
        eVar.a(K, i(new f(this)));
        this.f22413q = floatingActionButton.getRotation();
    }

    private boolean W() {
        return z.U(this.f22420x) && !this.f22420x.isInEditMode();
    }

    private void d0(ObjectAnimator objectAnimator) {
        if (Build.VERSION.SDK_INT != 26) {
            return;
        }
        objectAnimator.setEvaluator(new d(this));
    }

    private void g(float f10, Matrix matrix) {
        matrix.reset();
        Drawable drawable = this.f22420x.getDrawable();
        if (drawable == null || this.f22415s == 0) {
            return;
        }
        RectF rectF = this.A;
        RectF rectF2 = this.B;
        rectF.set(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        int i10 = this.f22415s;
        rectF2.set(0.0f, 0.0f, i10, i10);
        matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
        int i11 = this.f22415s;
        matrix.postScale(f10, f10, i11 / 2.0f, i11 / 2.0f);
    }

    private AnimatorSet h(ia.h hVar, float f10, float f11, float f12) {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f22420x, View.ALPHA, f10);
        hVar.e("opacity").a(ofFloat);
        arrayList.add(ofFloat);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f22420x, View.SCALE_X, f11);
        hVar.e("scale").a(ofFloat2);
        d0(ofFloat2);
        arrayList.add(ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f22420x, View.SCALE_Y, f11);
        hVar.e("scale").a(ofFloat3);
        d0(ofFloat3);
        arrayList.add(ofFloat3);
        g(f12, this.C);
        ObjectAnimator ofObject = ObjectAnimator.ofObject(this.f22420x, new ia.f(), new c(), new Matrix(this.C));
        hVar.e("iconScale").a(ofObject);
        arrayList.add(ofObject);
        AnimatorSet animatorSet = new AnimatorSet();
        ia.b.a(animatorSet, arrayList);
        return animatorSet;
    }

    private ValueAnimator i(l lVar) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(E);
        valueAnimator.setDuration(100L);
        valueAnimator.addListener(lVar);
        valueAnimator.addUpdateListener(lVar);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        return valueAnimator;
    }

    private ia.h k() {
        if (this.f22409m == null) {
            this.f22409m = ia.h.c(this.f22420x.getContext(), ha.a.f31126a);
        }
        return (ia.h) h0.g.f(this.f22409m);
    }

    private ia.h l() {
        if (this.f22408l == null) {
            this.f22408l = ia.h.c(this.f22420x.getContext(), ha.a.f31127b);
        }
        return (ia.h) h0.g.f(this.f22408l);
    }

    private ViewTreeObserver.OnPreDrawListener q() {
        if (this.D == null) {
            this.D = new e();
        }
        return this.D;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void A() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void B() {
        ViewTreeObserver viewTreeObserver = this.f22420x.getViewTreeObserver();
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = this.D;
        if (onPreDrawListener != null) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            this.D = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void C(int[] iArr) {
        this.f22407k.d(iArr);
    }

    void D(float f10, float f11, float f12) {
        b0();
        c0(f10);
    }

    void E(Rect rect) {
        h0.g.g(this.f22400d, "Didn't initialize content background");
        if (V()) {
            this.f22421y.b(new InsetDrawable(this.f22400d, rect.left, rect.top, rect.right, rect.bottom));
            return;
        }
        this.f22421y.b(this.f22400d);
    }

    void F() {
        float rotation = this.f22420x.getRotation();
        if (this.f22413q != rotation) {
            this.f22413q = rotation;
            Z();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void G() {
        ArrayList<i> arrayList = this.f22419w;
        if (arrayList != null) {
            Iterator<i> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void H() {
        ArrayList<i> arrayList = this.f22419w;
        if (arrayList != null) {
            Iterator<i> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        }
    }

    boolean I() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void J(ColorStateList colorStateList) {
        xa.g gVar = this.f22398b;
        if (gVar != null) {
            gVar.setTintList(colorStateList);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void K(PorterDuff.Mode mode) {
        xa.g gVar = this.f22398b;
        if (gVar != null) {
            gVar.setTintMode(mode);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void L(float f10) {
        if (this.f22403g != f10) {
            this.f22403g = f10;
            D(f10, this.f22404h, this.f22405i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void M(boolean z10) {
        this.f22401e = z10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void N(ia.h hVar) {
        this.f22412p = hVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void O(float f10) {
        if (this.f22404h != f10) {
            this.f22404h = f10;
            D(this.f22403g, f10, this.f22405i);
        }
    }

    final void P(float f10) {
        this.f22414r = f10;
        Matrix matrix = this.C;
        g(f10, matrix);
        this.f22420x.setImageMatrix(matrix);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void Q(float f10) {
        if (this.f22405i != f10) {
            this.f22405i = f10;
            D(this.f22403g, this.f22404h, f10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void R(ColorStateList colorStateList) {
        Drawable drawable = this.f22399c;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.o(drawable, va.b.d(colorStateList));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void S(boolean z10) {
        this.f22402f = z10;
        b0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void T(xa.k kVar) {
        this.f22397a = kVar;
        xa.g gVar = this.f22398b;
        if (gVar != null) {
            gVar.setShapeAppearanceModel(kVar);
        }
        Drawable drawable = this.f22399c;
        if (drawable instanceof n) {
            ((n) drawable).setShapeAppearanceModel(kVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void U(ia.h hVar) {
        this.f22411o = hVar;
    }

    boolean V() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean X() {
        return !this.f22401e || this.f22420x.getSizeDimension() >= this.f22406j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void Y(j jVar, boolean z10) {
        if (x()) {
            return;
        }
        Animator animator = this.f22410n;
        if (animator != null) {
            animator.cancel();
        }
        if (W()) {
            if (this.f22420x.getVisibility() != 0) {
                this.f22420x.setAlpha(0.0f);
                this.f22420x.setScaleY(0.0f);
                this.f22420x.setScaleX(0.0f);
                P(0.0f);
            }
            ia.h hVar = this.f22411o;
            if (hVar == null) {
                hVar = l();
            }
            AnimatorSet h10 = h(hVar, 1.0f, 1.0f, 1.0f);
            h10.addListener(new b(z10, jVar));
            ArrayList<Animator.AnimatorListener> arrayList = this.f22417u;
            if (arrayList != null) {
                Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                while (it.hasNext()) {
                    h10.addListener(it.next());
                }
            }
            h10.start();
            return;
        }
        this.f22420x.b(0, z10);
        this.f22420x.setAlpha(1.0f);
        this.f22420x.setScaleY(1.0f);
        this.f22420x.setScaleX(1.0f);
        P(1.0f);
        if (jVar != null) {
            jVar.a();
        }
    }

    void Z() {
        if (Build.VERSION.SDK_INT == 19) {
            if (this.f22413q % 90.0f != 0.0f) {
                if (this.f22420x.getLayerType() != 1) {
                    this.f22420x.setLayerType(1, null);
                }
            } else if (this.f22420x.getLayerType() != 0) {
                this.f22420x.setLayerType(0, null);
            }
        }
        xa.g gVar = this.f22398b;
        if (gVar != null) {
            gVar.Y((int) this.f22413q);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a0() {
        P(this.f22414r);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b0() {
        Rect rect = this.f22422z;
        r(rect);
        E(rect);
        this.f22421y.a(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c0(float f10) {
        xa.g gVar = this.f22398b;
        if (gVar != null) {
            gVar.T(f10);
        }
    }

    public void d(Animator.AnimatorListener animatorListener) {
        if (this.f22418v == null) {
            this.f22418v = new ArrayList<>();
        }
        this.f22418v.add(animatorListener);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(Animator.AnimatorListener animatorListener) {
        if (this.f22417u == null) {
            this.f22417u = new ArrayList<>();
        }
        this.f22417u.add(animatorListener);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f(i iVar) {
        if (this.f22419w == null) {
            this.f22419w = new ArrayList<>();
        }
        this.f22419w.add(iVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Drawable j() {
        return this.f22400d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float m() {
        return this.f22403g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean n() {
        return this.f22401e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ia.h o() {
        return this.f22412p;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float p() {
        return this.f22404h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void r(Rect rect) {
        int sizeDimension = this.f22401e ? (this.f22406j - this.f22420x.getSizeDimension()) / 2 : 0;
        float m10 = this.f22402f ? m() + this.f22405i : 0.0f;
        int max = Math.max(sizeDimension, (int) Math.ceil(m10));
        int max2 = Math.max(sizeDimension, (int) Math.ceil(m10 * 1.5f));
        rect.set(max, max2, max, max2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float s() {
        return this.f22405i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final xa.k t() {
        return this.f22397a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ia.h u() {
        return this.f22411o;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void v(j jVar, boolean z10) {
        if (w()) {
            return;
        }
        Animator animator = this.f22410n;
        if (animator != null) {
            animator.cancel();
        }
        if (W()) {
            ia.h hVar = this.f22412p;
            if (hVar == null) {
                hVar = k();
            }
            AnimatorSet h10 = h(hVar, 0.0f, 0.0f, 0.0f);
            h10.addListener(new C0298a(z10, jVar));
            ArrayList<Animator.AnimatorListener> arrayList = this.f22418v;
            if (arrayList != null) {
                Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                while (it.hasNext()) {
                    h10.addListener(it.next());
                }
            }
            h10.start();
            return;
        }
        this.f22420x.b(z10 ? 8 : 4, z10);
        if (jVar != null) {
            jVar.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean w() {
        return this.f22420x.getVisibility() == 0 ? this.f22416t == 1 : this.f22416t != 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean x() {
        return this.f22420x.getVisibility() != 0 ? this.f22416t == 2 : this.f22416t != 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void y() {
        this.f22407k.c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void z() {
        xa.g gVar = this.f22398b;
        if (gVar != null) {
            xa.h.f(this.f22420x, gVar);
        }
        if (I()) {
            this.f22420x.getViewTreeObserver().addOnPreDrawListener(q());
        }
    }
}
