package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.z;
import androidx.customview.view.AbsSavedState;
import ha.k;
import ha.l;
import i0.c;
import i0.f;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import m0.c;
import xa.g;

/* loaded from: classes2.dex */
public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.c<V> {
    private static final int K = k.f31256e;
    int A;
    WeakReference<V> B;
    WeakReference<View> C;
    private final ArrayList<e> D;
    private VelocityTracker E;
    int F;
    private int G;
    boolean H;
    private Map<View, Integer> I;
    private final c.AbstractC0449c J;

    /* renamed from: a  reason: collision with root package name */
    private int f22105a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f22106b;

    /* renamed from: c  reason: collision with root package name */
    private float f22107c;

    /* renamed from: d  reason: collision with root package name */
    private int f22108d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f22109e;

    /* renamed from: f  reason: collision with root package name */
    private int f22110f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f22111g;

    /* renamed from: h  reason: collision with root package name */
    private g f22112h;

    /* renamed from: i  reason: collision with root package name */
    private xa.k f22113i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f22114j;

    /* renamed from: k  reason: collision with root package name */
    private BottomSheetBehavior<V>.f f22115k;

    /* renamed from: l  reason: collision with root package name */
    private ValueAnimator f22116l;

    /* renamed from: m  reason: collision with root package name */
    int f22117m;

    /* renamed from: n  reason: collision with root package name */
    int f22118n;

    /* renamed from: o  reason: collision with root package name */
    int f22119o;

    /* renamed from: p  reason: collision with root package name */
    float f22120p;

    /* renamed from: q  reason: collision with root package name */
    int f22121q;

    /* renamed from: r  reason: collision with root package name */
    float f22122r;

    /* renamed from: s  reason: collision with root package name */
    boolean f22123s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f22124t;

    /* renamed from: u  reason: collision with root package name */
    int f22125u;

    /* renamed from: v  reason: collision with root package name */
    m0.c f22126v;

    /* renamed from: w  reason: collision with root package name */
    private boolean f22127w;

    /* renamed from: x  reason: collision with root package name */
    private int f22128x;

    /* renamed from: y  reason: collision with root package name */
    private boolean f22129y;

    /* renamed from: z  reason: collision with root package name */
    int f22130z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f22136a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f22137b;

        a(View view, int i10) {
            this.f22136a = view;
            this.f22137b = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            BottomSheetBehavior.this.f0(this.f22136a, this.f22137b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class b implements ValueAnimator.AnimatorUpdateListener {
        b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (BottomSheetBehavior.this.f22112h != null) {
                BottomSheetBehavior.this.f22112h.V(floatValue);
            }
        }
    }

    /* loaded from: classes2.dex */
    class c extends c.AbstractC0449c {
        c() {
        }

        @Override // m0.c.AbstractC0449c
        public int a(View view, int i10, int i11) {
            return view.getLeft();
        }

        @Override // m0.c.AbstractC0449c
        public int b(View view, int i10, int i11) {
            int R = BottomSheetBehavior.this.R();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return c0.a.b(i10, R, bottomSheetBehavior.f22123s ? bottomSheetBehavior.A : bottomSheetBehavior.f22121q);
        }

        @Override // m0.c.AbstractC0449c
        public int e(View view) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            if (bottomSheetBehavior.f22123s) {
                return bottomSheetBehavior.A;
            }
            return bottomSheetBehavior.f22121q;
        }

        @Override // m0.c.AbstractC0449c
        public void j(int i10) {
            if (i10 == 1) {
                BottomSheetBehavior.this.e0(1);
            }
        }

        @Override // m0.c.AbstractC0449c
        public void k(View view, int i10, int i11, int i12, int i13) {
            BottomSheetBehavior.this.P(i11);
        }

        @Override // m0.c.AbstractC0449c
        public void l(View view, float f10, float f11) {
            int i10;
            int i11 = 4;
            if (f11 < 0.0f) {
                if (BottomSheetBehavior.this.f22106b) {
                    i10 = BottomSheetBehavior.this.f22118n;
                } else {
                    int top = view.getTop();
                    BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                    int i12 = bottomSheetBehavior.f22119o;
                    if (top > i12) {
                        i10 = i12;
                        i11 = 6;
                    } else {
                        i10 = bottomSheetBehavior.f22117m;
                    }
                }
                i11 = 3;
            } else {
                BottomSheetBehavior bottomSheetBehavior2 = BottomSheetBehavior.this;
                if (bottomSheetBehavior2.f22123s && bottomSheetBehavior2.h0(view, f11) && (view.getTop() > BottomSheetBehavior.this.f22121q || Math.abs(f10) < Math.abs(f11))) {
                    i10 = BottomSheetBehavior.this.A;
                    i11 = 5;
                } else if (f11 != 0.0f && Math.abs(f10) <= Math.abs(f11)) {
                    if (BottomSheetBehavior.this.f22106b) {
                        i10 = BottomSheetBehavior.this.f22121q;
                    } else {
                        int top2 = view.getTop();
                        if (Math.abs(top2 - BottomSheetBehavior.this.f22119o) < Math.abs(top2 - BottomSheetBehavior.this.f22121q)) {
                            i10 = BottomSheetBehavior.this.f22119o;
                            i11 = 6;
                        } else {
                            i10 = BottomSheetBehavior.this.f22121q;
                        }
                    }
                } else {
                    int top3 = view.getTop();
                    if (BottomSheetBehavior.this.f22106b) {
                        if (Math.abs(top3 - BottomSheetBehavior.this.f22118n) < Math.abs(top3 - BottomSheetBehavior.this.f22121q)) {
                            i10 = BottomSheetBehavior.this.f22118n;
                            i11 = 3;
                        } else {
                            i10 = BottomSheetBehavior.this.f22121q;
                        }
                    } else {
                        BottomSheetBehavior bottomSheetBehavior3 = BottomSheetBehavior.this;
                        int i13 = bottomSheetBehavior3.f22119o;
                        if (top3 < i13) {
                            if (top3 < Math.abs(top3 - bottomSheetBehavior3.f22121q)) {
                                i10 = BottomSheetBehavior.this.f22117m;
                                i11 = 3;
                            } else {
                                i10 = BottomSheetBehavior.this.f22119o;
                            }
                        } else if (Math.abs(top3 - i13) < Math.abs(top3 - BottomSheetBehavior.this.f22121q)) {
                            i10 = BottomSheetBehavior.this.f22119o;
                        } else {
                            i10 = BottomSheetBehavior.this.f22121q;
                        }
                        i11 = 6;
                    }
                }
            }
            BottomSheetBehavior.this.i0(view, i11, i10, true);
        }

        @Override // m0.c.AbstractC0449c
        public boolean m(View view, int i10) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i11 = bottomSheetBehavior.f22125u;
            if (i11 == 1 || bottomSheetBehavior.H) {
                return false;
            }
            if (i11 == 3 && bottomSheetBehavior.F == i10) {
                WeakReference<View> weakReference = bottomSheetBehavior.C;
                View view2 = weakReference != null ? weakReference.get() : null;
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            WeakReference<V> weakReference2 = BottomSheetBehavior.this.B;
            return weakReference2 != null && weakReference2.get() == view;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class d implements i0.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f22141a;

        d(int i10) {
            this.f22141a = i10;
        }

        @Override // i0.f
        public boolean a(View view, f.a aVar) {
            BottomSheetBehavior.this.d0(this.f22141a);
            return true;
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class e {
        public abstract void a(View view, float f10);

        public abstract void b(View view, int i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public class f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final View f22143a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f22144b;

        /* renamed from: c  reason: collision with root package name */
        int f22145c;

        f(View view, int i10) {
            this.f22143a = view;
            this.f22145c = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            m0.c cVar = BottomSheetBehavior.this.f22126v;
            if (cVar != null && cVar.m(true)) {
                z.i0(this.f22143a, this);
            } else {
                BottomSheetBehavior.this.e0(this.f22145c);
            }
            this.f22144b = false;
        }
    }

    public BottomSheetBehavior() {
        this.f22105a = 0;
        this.f22106b = true;
        this.f22115k = null;
        this.f22120p = 0.5f;
        this.f22122r = -1.0f;
        this.f22125u = 4;
        this.D = new ArrayList<>();
        this.J = new c();
    }

    private void J(V v10, c.a aVar, int i10) {
        z.m0(v10, aVar, null, new d(i10));
    }

    private void K() {
        int i10;
        if (this.f22109e) {
            i10 = Math.max(this.f22110f, this.A - ((this.f22130z * 9) / 16));
        } else {
            i10 = this.f22108d;
        }
        if (this.f22106b) {
            this.f22121q = Math.max(this.A - i10, this.f22118n);
        } else {
            this.f22121q = this.A - i10;
        }
    }

    private void L() {
        this.f22119o = (int) (this.A * (1.0f - this.f22120p));
    }

    private void M(Context context, AttributeSet attributeSet, boolean z10) {
        N(context, attributeSet, z10, null);
    }

    private void N(Context context, AttributeSet attributeSet, boolean z10, ColorStateList colorStateList) {
        if (this.f22111g) {
            this.f22113i = xa.k.e(context, attributeSet, ha.b.f31132c, K).m();
            g gVar = new g(this.f22113i);
            this.f22112h = gVar;
            gVar.L(context);
            if (z10 && colorStateList != null) {
                this.f22112h.U(colorStateList);
                return;
            }
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(16842801, typedValue, true);
            this.f22112h.setTint(typedValue.data);
        }
    }

    private void O() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f22116l = ofFloat;
        ofFloat.setDuration(500L);
        this.f22116l.addUpdateListener(new b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int R() {
        return this.f22106b ? this.f22118n : this.f22117m;
    }

    private float S() {
        VelocityTracker velocityTracker = this.E;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(1000, this.f22107c);
        return this.E.getYVelocity(this.F);
    }

    private void T() {
        this.F = -1;
        VelocityTracker velocityTracker = this.E;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.E = null;
        }
    }

    private void U(SavedState savedState) {
        int i10 = this.f22105a;
        if (i10 == 0) {
            return;
        }
        if (i10 == -1 || (i10 & 1) == 1) {
            this.f22108d = savedState.f22132d;
        }
        if (i10 == -1 || (i10 & 2) == 2) {
            this.f22106b = savedState.f22133e;
        }
        if (i10 == -1 || (i10 & 4) == 4) {
            this.f22123s = savedState.f22134f;
        }
        if (i10 == -1 || (i10 & 8) == 8) {
            this.f22124t = savedState.f22135g;
        }
    }

    private void g0(int i10) {
        V v10 = this.B.get();
        if (v10 == null) {
            return;
        }
        ViewParent parent = v10.getParent();
        if (parent != null && parent.isLayoutRequested() && z.T(v10)) {
            v10.post(new a(v10, i10));
        } else {
            f0(v10, i10);
        }
    }

    private void j0() {
        V v10;
        WeakReference<V> weakReference = this.B;
        if (weakReference == null || (v10 = weakReference.get()) == null) {
            return;
        }
        z.k0(v10, 524288);
        z.k0(v10, 262144);
        z.k0(v10, 1048576);
        if (this.f22123s && this.f22125u != 5) {
            J(v10, c.a.f31498m, 5);
        }
        int i10 = this.f22125u;
        if (i10 == 3) {
            J(v10, c.a.f31497l, this.f22106b ? 4 : 6);
        } else if (i10 == 4) {
            J(v10, c.a.f31496k, this.f22106b ? 3 : 6);
        } else if (i10 != 6) {
        } else {
            J(v10, c.a.f31497l, 4);
            J(v10, c.a.f31496k, 3);
        }
    }

    private void k0(int i10) {
        ValueAnimator valueAnimator;
        if (i10 == 2) {
            return;
        }
        boolean z10 = i10 == 3;
        if (this.f22114j != z10) {
            this.f22114j = z10;
            if (this.f22112h == null || (valueAnimator = this.f22116l) == null) {
                return;
            }
            if (valueAnimator.isRunning()) {
                this.f22116l.reverse();
                return;
            }
            float f10 = z10 ? 0.0f : 1.0f;
            this.f22116l.setFloatValues(1.0f - f10, f10);
            this.f22116l.start();
        }
    }

    private void l0(boolean z10) {
        WeakReference<V> weakReference = this.B;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = weakReference.get().getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (Build.VERSION.SDK_INT >= 16 && z10) {
                if (this.I != null) {
                    return;
                }
                this.I = new HashMap(childCount);
            }
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = coordinatorLayout.getChildAt(i10);
                if (childAt != this.B.get()) {
                    if (!z10) {
                        Map<View, Integer> map = this.I;
                        if (map != null && map.containsKey(childAt)) {
                            z.A0(childAt, this.I.get(childAt).intValue());
                        }
                    } else {
                        if (Build.VERSION.SDK_INT >= 16) {
                            this.I.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        }
                        z.A0(childAt, 4);
                    }
                }
            }
            if (z10) {
                return;
            }
            this.I = null;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean A(CoordinatorLayout coordinatorLayout, V v10, View view, View view2, int i10, int i11) {
        this.f22128x = 0;
        this.f22129y = false;
        return (i10 & 2) != 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void C(CoordinatorLayout coordinatorLayout, V v10, View view, int i10) {
        int i11;
        int i12 = 3;
        if (v10.getTop() == R()) {
            e0(3);
            return;
        }
        WeakReference<View> weakReference = this.C;
        if (weakReference != null && view == weakReference.get() && this.f22129y) {
            if (this.f22128x > 0) {
                i11 = R();
            } else if (this.f22123s && h0(v10, S())) {
                i11 = this.A;
                i12 = 5;
            } else if (this.f22128x == 0) {
                int top = v10.getTop();
                if (this.f22106b) {
                    if (Math.abs(top - this.f22118n) < Math.abs(top - this.f22121q)) {
                        i11 = this.f22118n;
                    } else {
                        i11 = this.f22121q;
                        i12 = 4;
                    }
                } else {
                    int i13 = this.f22119o;
                    if (top < i13) {
                        if (top < Math.abs(top - this.f22121q)) {
                            i11 = this.f22117m;
                        } else {
                            i11 = this.f22119o;
                        }
                    } else if (Math.abs(top - i13) < Math.abs(top - this.f22121q)) {
                        i11 = this.f22119o;
                    } else {
                        i11 = this.f22121q;
                        i12 = 4;
                    }
                    i12 = 6;
                }
            } else {
                if (this.f22106b) {
                    i11 = this.f22121q;
                } else {
                    int top2 = v10.getTop();
                    if (Math.abs(top2 - this.f22119o) < Math.abs(top2 - this.f22121q)) {
                        i11 = this.f22119o;
                        i12 = 6;
                    } else {
                        i11 = this.f22121q;
                    }
                }
                i12 = 4;
            }
            i0(v10, i12, i11, false);
            this.f22129y = false;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean D(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
        if (v10.isShown()) {
            int actionMasked = motionEvent.getActionMasked();
            if (this.f22125u == 1 && actionMasked == 0) {
                return true;
            }
            m0.c cVar = this.f22126v;
            if (cVar != null) {
                cVar.E(motionEvent);
            }
            if (actionMasked == 0) {
                T();
            }
            if (this.E == null) {
                this.E = VelocityTracker.obtain();
            }
            this.E.addMovement(motionEvent);
            if (actionMasked == 2 && !this.f22127w && Math.abs(this.G - motionEvent.getY()) > this.f22126v.y()) {
                this.f22126v.b(v10, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
            return !this.f22127w;
        }
        return false;
    }

    void P(int i10) {
        float f10;
        float R;
        V v10 = this.B.get();
        if (v10 == null || this.D.isEmpty()) {
            return;
        }
        int i11 = this.f22121q;
        if (i10 > i11) {
            f10 = i11 - i10;
            R = this.A - i11;
        } else {
            f10 = i11 - i10;
            R = i11 - R();
        }
        float f11 = f10 / R;
        for (int i12 = 0; i12 < this.D.size(); i12++) {
            this.D.get(i12).a(v10, f11);
        }
    }

    View Q(View view) {
        if (z.V(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View Q = Q(viewGroup.getChildAt(i10));
                if (Q != null) {
                    return Q;
                }
            }
            return null;
        }
        return null;
    }

    public void V(int i10) {
        if (i10 >= 0) {
            this.f22117m = i10;
            return;
        }
        throw new IllegalArgumentException("offset must be greater than or equal to 0");
    }

    public void W(boolean z10) {
        if (this.f22106b == z10) {
            return;
        }
        this.f22106b = z10;
        if (this.B != null) {
            K();
        }
        e0((this.f22106b && this.f22125u == 6) ? 3 : this.f22125u);
        j0();
    }

    public void X(float f10) {
        if (f10 > 0.0f && f10 < 1.0f) {
            this.f22120p = f10;
            return;
        }
        throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
    }

    public void Y(boolean z10) {
        if (this.f22123s != z10) {
            this.f22123s = z10;
            if (!z10 && this.f22125u == 5) {
                d0(4);
            }
            j0();
        }
    }

    public void Z(int i10) {
        a0(i10, false);
    }

    public final void a0(int i10, boolean z10) {
        V v10;
        boolean z11 = true;
        if (i10 == -1) {
            if (!this.f22109e) {
                this.f22109e = true;
            }
            z11 = false;
        } else {
            if (this.f22109e || this.f22108d != i10) {
                this.f22109e = false;
                this.f22108d = Math.max(0, i10);
            }
            z11 = false;
        }
        if (!z11 || this.B == null) {
            return;
        }
        K();
        if (this.f22125u != 4 || (v10 = this.B.get()) == null) {
            return;
        }
        if (z10) {
            g0(this.f22125u);
        } else {
            v10.requestLayout();
        }
    }

    public void b0(int i10) {
        this.f22105a = i10;
    }

    public void c0(boolean z10) {
        this.f22124t = z10;
    }

    public void d0(int i10) {
        if (i10 == this.f22125u) {
            return;
        }
        if (this.B == null) {
            if (i10 == 4 || i10 == 3 || i10 == 6 || (this.f22123s && i10 == 5)) {
                this.f22125u = i10;
                return;
            }
            return;
        }
        g0(i10);
    }

    void e0(int i10) {
        V v10;
        if (this.f22125u == i10) {
            return;
        }
        this.f22125u = i10;
        WeakReference<V> weakReference = this.B;
        if (weakReference == null || (v10 = weakReference.get()) == null) {
            return;
        }
        if (i10 == 6 || i10 == 3) {
            l0(true);
        } else if (i10 == 5 || i10 == 4) {
            l0(false);
        }
        k0(i10);
        for (int i11 = 0; i11 < this.D.size(); i11++) {
            this.D.get(i11).b(v10, i10);
        }
        j0();
    }

    void f0(View view, int i10) {
        int i11;
        int i12;
        if (i10 == 4) {
            i11 = this.f22121q;
        } else if (i10 == 6) {
            int i13 = this.f22119o;
            if (!this.f22106b || i13 > (i12 = this.f22118n)) {
                i11 = i13;
            } else {
                i11 = i12;
                i10 = 3;
            }
        } else if (i10 == 3) {
            i11 = R();
        } else if (this.f22123s && i10 == 5) {
            i11 = this.A;
        } else {
            throw new IllegalArgumentException("Illegal state argument: " + i10);
        }
        i0(view, i10, i11, false);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void g(CoordinatorLayout.f fVar) {
        super.g(fVar);
        this.B = null;
        this.f22126v = null;
    }

    boolean h0(View view, float f10) {
        if (this.f22124t) {
            return true;
        }
        return view.getTop() >= this.f22121q && Math.abs((((float) view.getTop()) + (f10 * 0.1f)) - ((float) this.f22121q)) / ((float) this.f22108d) > 0.5f;
    }

    void i0(View view, int i10, int i11, boolean z10) {
        boolean O;
        if (z10) {
            O = this.f22126v.M(view.getLeft(), i11);
        } else {
            O = this.f22126v.O(view, view.getLeft(), i11);
        }
        if (O) {
            e0(2);
            k0(i10);
            if (this.f22115k == null) {
                this.f22115k = new f(view, i10);
            }
            if (!((f) this.f22115k).f22144b) {
                BottomSheetBehavior<V>.f fVar = this.f22115k;
                fVar.f22145c = i10;
                z.i0(view, fVar);
                ((f) this.f22115k).f22144b = true;
                return;
            }
            this.f22115k.f22145c = i10;
            return;
        }
        e0(i10);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void j() {
        super.j();
        this.B = null;
        this.f22126v = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean k(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
        m0.c cVar;
        if (!v10.isShown()) {
            this.f22127w = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            T();
        }
        if (this.E == null) {
            this.E = VelocityTracker.obtain();
        }
        this.E.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x10 = (int) motionEvent.getX();
            this.G = (int) motionEvent.getY();
            if (this.f22125u != 2) {
                WeakReference<View> weakReference = this.C;
                View view = weakReference != null ? weakReference.get() : null;
                if (view != null && coordinatorLayout.B(view, x10, this.G)) {
                    this.F = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.H = true;
                }
            }
            this.f22127w = this.F == -1 && !coordinatorLayout.B(v10, x10, this.G);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.H = false;
            this.F = -1;
            if (this.f22127w) {
                this.f22127w = false;
                return false;
            }
        }
        if (this.f22127w || (cVar = this.f22126v) == null || !cVar.N(motionEvent)) {
            WeakReference<View> weakReference2 = this.C;
            View view2 = weakReference2 != null ? weakReference2.get() : null;
            return (actionMasked != 2 || view2 == null || this.f22127w || this.f22125u == 1 || coordinatorLayout.B(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.f22126v == null || Math.abs(((float) this.G) - motionEvent.getY()) <= ((float) this.f22126v.y())) ? false : true;
        }
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(CoordinatorLayout coordinatorLayout, V v10, int i10) {
        g gVar;
        if (z.z(coordinatorLayout) && !z.z(v10)) {
            v10.setFitsSystemWindows(true);
        }
        if (this.B == null) {
            this.f22110f = coordinatorLayout.getResources().getDimensionPixelSize(ha.d.f31162b);
            this.B = new WeakReference<>(v10);
            if (this.f22111g && (gVar = this.f22112h) != null) {
                z.u0(v10, gVar);
            }
            g gVar2 = this.f22112h;
            if (gVar2 != null) {
                float f10 = this.f22122r;
                if (f10 == -1.0f) {
                    f10 = z.w(v10);
                }
                gVar2.T(f10);
                boolean z10 = this.f22125u == 3;
                this.f22114j = z10;
                this.f22112h.V(z10 ? 0.0f : 1.0f);
            }
            j0();
            if (z.A(v10) == 0) {
                z.A0(v10, 1);
            }
        }
        if (this.f22126v == null) {
            this.f22126v = m0.c.o(coordinatorLayout, this.J);
        }
        int top = v10.getTop();
        coordinatorLayout.I(v10, i10);
        this.f22130z = coordinatorLayout.getWidth();
        int height = coordinatorLayout.getHeight();
        this.A = height;
        this.f22118n = Math.max(0, height - v10.getHeight());
        L();
        K();
        int i11 = this.f22125u;
        if (i11 == 3) {
            z.b0(v10, R());
        } else if (i11 == 6) {
            z.b0(v10, this.f22119o);
        } else if (this.f22123s && i11 == 5) {
            z.b0(v10, this.A);
        } else if (i11 == 4) {
            z.b0(v10, this.f22121q);
        } else if (i11 == 1 || i11 == 2) {
            z.b0(v10, top - v10.getTop());
        }
        this.C = new WeakReference<>(Q(v10));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean o(CoordinatorLayout coordinatorLayout, V v10, View view, float f10, float f11) {
        WeakReference<View> weakReference = this.C;
        if (weakReference == null || view != weakReference.get()) {
            return false;
        }
        return this.f22125u != 3 || super.o(coordinatorLayout, v10, view, f10, f11);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void q(CoordinatorLayout coordinatorLayout, V v10, View view, int i10, int i11, int[] iArr, int i12) {
        if (i12 == 1) {
            return;
        }
        WeakReference<View> weakReference = this.C;
        if (view != (weakReference != null ? weakReference.get() : null)) {
            return;
        }
        int top = v10.getTop();
        int i13 = top - i11;
        if (i11 > 0) {
            if (i13 < R()) {
                iArr[1] = top - R();
                z.b0(v10, -iArr[1]);
                e0(3);
            } else {
                iArr[1] = i11;
                z.b0(v10, -i11);
                e0(1);
            }
        } else if (i11 < 0 && !view.canScrollVertically(-1)) {
            int i14 = this.f22121q;
            if (i13 > i14 && !this.f22123s) {
                iArr[1] = top - i14;
                z.b0(v10, -iArr[1]);
                e0(4);
            } else {
                iArr[1] = i11;
                z.b0(v10, -i11);
                e0(1);
            }
        }
        P(v10.getTop());
        this.f22128x = i11;
        this.f22129y = true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void t(CoordinatorLayout coordinatorLayout, V v10, View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void x(CoordinatorLayout coordinatorLayout, V v10, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.x(coordinatorLayout, v10, savedState.c());
        U(savedState);
        int i10 = savedState.f22131c;
        if (i10 != 1 && i10 != 2) {
            this.f22125u = i10;
        } else {
            this.f22125u = 4;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public Parcelable y(CoordinatorLayout coordinatorLayout, V v10) {
        return new SavedState(super.y(coordinatorLayout, v10), (BottomSheetBehavior<?>) this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes2.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        final int f22131c;

        /* renamed from: d  reason: collision with root package name */
        int f22132d;

        /* renamed from: e  reason: collision with root package name */
        boolean f22133e;

        /* renamed from: f  reason: collision with root package name */
        boolean f22134f;

        /* renamed from: g  reason: collision with root package name */
        boolean f22135g;

        /* loaded from: classes2.dex */
        static class a implements Parcelable.ClassLoaderCreator<SavedState> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f22131c = parcel.readInt();
            this.f22132d = parcel.readInt();
            this.f22133e = parcel.readInt() == 1;
            this.f22134f = parcel.readInt() == 1;
            this.f22135g = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f22131c);
            parcel.writeInt(this.f22132d);
            parcel.writeInt(this.f22133e ? 1 : 0);
            parcel.writeInt(this.f22134f ? 1 : 0);
            parcel.writeInt(this.f22135g ? 1 : 0);
        }

        public SavedState(Parcelable parcelable, BottomSheetBehavior<?> bottomSheetBehavior) {
            super(parcelable);
            this.f22131c = bottomSheetBehavior.f22125u;
            this.f22132d = ((BottomSheetBehavior) bottomSheetBehavior).f22108d;
            this.f22133e = ((BottomSheetBehavior) bottomSheetBehavior).f22106b;
            this.f22134f = bottomSheetBehavior.f22123s;
            this.f22135g = ((BottomSheetBehavior) bottomSheetBehavior).f22124t;
        }
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i10;
        this.f22105a = 0;
        this.f22106b = true;
        this.f22115k = null;
        this.f22120p = 0.5f;
        this.f22122r = -1.0f;
        this.f22125u = 4;
        this.D = new ArrayList<>();
        this.J = new c();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.f31357s);
        this.f22111g = obtainStyledAttributes.hasValue(l.C);
        int i11 = l.f31367u;
        boolean hasValue = obtainStyledAttributes.hasValue(i11);
        if (hasValue) {
            N(context, attributeSet, hasValue, ua.c.a(context, obtainStyledAttributes, i11));
        } else {
            M(context, attributeSet, hasValue);
        }
        O();
        if (Build.VERSION.SDK_INT >= 21) {
            this.f22122r = obtainStyledAttributes.getDimension(l.f31362t, -1.0f);
        }
        int i12 = l.f31392z;
        TypedValue peekValue = obtainStyledAttributes.peekValue(i12);
        if (peekValue != null && (i10 = peekValue.data) == -1) {
            Z(i10);
        } else {
            Z(obtainStyledAttributes.getDimensionPixelSize(i12, -1));
        }
        Y(obtainStyledAttributes.getBoolean(l.f31387y, false));
        W(obtainStyledAttributes.getBoolean(l.f31377w, true));
        c0(obtainStyledAttributes.getBoolean(l.B, false));
        b0(obtainStyledAttributes.getInt(l.A, 0));
        X(obtainStyledAttributes.getFloat(l.f31382x, 0.5f));
        V(obtainStyledAttributes.getInt(l.f31372v, 0));
        obtainStyledAttributes.recycle();
        this.f22107c = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
