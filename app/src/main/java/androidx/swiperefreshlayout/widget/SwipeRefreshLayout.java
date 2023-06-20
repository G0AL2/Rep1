package androidx.swiperefreshlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import android.widget.AbsListView;
import android.widget.ListView;
import androidx.core.view.m;
import androidx.core.view.n;
import androidx.core.view.o;
import androidx.core.view.p;
import androidx.core.view.q;
import androidx.core.view.r;
import androidx.core.view.z;

/* loaded from: classes.dex */
public class SwipeRefreshLayout extends ViewGroup implements p, o, m, q {
    private static final String Q = SwipeRefreshLayout.class.getSimpleName();
    private static final int[] R = {16842766};
    int A;
    int B;
    androidx.swiperefreshlayout.widget.b C;
    private Animation D;
    private Animation E;
    private Animation F;
    private Animation G;
    private Animation H;
    boolean I;
    private int J;
    boolean K;
    private i L;
    private boolean M;
    private Animation.AnimationListener N;
    private final Animation O;
    private final Animation P;

    /* renamed from: a  reason: collision with root package name */
    private View f4082a;

    /* renamed from: b  reason: collision with root package name */
    j f4083b;

    /* renamed from: c  reason: collision with root package name */
    boolean f4084c;

    /* renamed from: d  reason: collision with root package name */
    private int f4085d;

    /* renamed from: e  reason: collision with root package name */
    private float f4086e;

    /* renamed from: f  reason: collision with root package name */
    private float f4087f;

    /* renamed from: g  reason: collision with root package name */
    private final r f4088g;

    /* renamed from: h  reason: collision with root package name */
    private final n f4089h;

    /* renamed from: i  reason: collision with root package name */
    private final int[] f4090i;

    /* renamed from: j  reason: collision with root package name */
    private final int[] f4091j;

    /* renamed from: k  reason: collision with root package name */
    private final int[] f4092k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f4093l;

    /* renamed from: m  reason: collision with root package name */
    private int f4094m;

    /* renamed from: n  reason: collision with root package name */
    int f4095n;

    /* renamed from: o  reason: collision with root package name */
    private float f4096o;

    /* renamed from: p  reason: collision with root package name */
    private float f4097p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f4098q;

    /* renamed from: r  reason: collision with root package name */
    private int f4099r;

    /* renamed from: s  reason: collision with root package name */
    boolean f4100s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f4101t;

    /* renamed from: u  reason: collision with root package name */
    private final DecelerateInterpolator f4102u;

    /* renamed from: v  reason: collision with root package name */
    androidx.swiperefreshlayout.widget.a f4103v;

    /* renamed from: w  reason: collision with root package name */
    private int f4104w;

    /* renamed from: x  reason: collision with root package name */
    protected int f4105x;

    /* renamed from: y  reason: collision with root package name */
    float f4106y;

    /* renamed from: z  reason: collision with root package name */
    protected int f4107z;

    /* loaded from: classes.dex */
    class a implements Animation.AnimationListener {
        a() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            j jVar;
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            if (swipeRefreshLayout.f4084c) {
                swipeRefreshLayout.C.setAlpha(255);
                SwipeRefreshLayout.this.C.start();
                SwipeRefreshLayout swipeRefreshLayout2 = SwipeRefreshLayout.this;
                if (swipeRefreshLayout2.I && (jVar = swipeRefreshLayout2.f4083b) != null) {
                    jVar.a();
                }
                SwipeRefreshLayout swipeRefreshLayout3 = SwipeRefreshLayout.this;
                swipeRefreshLayout3.f4095n = swipeRefreshLayout3.f4103v.getTop();
                return;
            }
            swipeRefreshLayout.r();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b extends Animation {
        b() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f10, Transformation transformation) {
            SwipeRefreshLayout.this.setAnimationProgress(f10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c extends Animation {
        c() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f10, Transformation transformation) {
            SwipeRefreshLayout.this.setAnimationProgress(1.0f - f10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d extends Animation {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f4112a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f4113b;

        d(int i10, int i11) {
            this.f4112a = i10;
            this.f4113b = i11;
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f10, Transformation transformation) {
            androidx.swiperefreshlayout.widget.b bVar = SwipeRefreshLayout.this.C;
            int i10 = this.f4112a;
            bVar.setAlpha((int) (i10 + ((this.f4113b - i10) * f10)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class e implements Animation.AnimationListener {
        e() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            if (swipeRefreshLayout.f4100s) {
                return;
            }
            swipeRefreshLayout.y(null);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* loaded from: classes.dex */
    class f extends Animation {
        f() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f10, Transformation transformation) {
            int i10;
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            if (!swipeRefreshLayout.K) {
                i10 = swipeRefreshLayout.A - Math.abs(swipeRefreshLayout.f4107z);
            } else {
                i10 = swipeRefreshLayout.A;
            }
            SwipeRefreshLayout swipeRefreshLayout2 = SwipeRefreshLayout.this;
            int i11 = swipeRefreshLayout2.f4105x;
            SwipeRefreshLayout.this.setTargetOffsetTopAndBottom((i11 + ((int) ((i10 - i11) * f10))) - swipeRefreshLayout2.f4103v.getTop());
            SwipeRefreshLayout.this.C.e(1.0f - f10);
        }
    }

    /* loaded from: classes.dex */
    class g extends Animation {
        g() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f10, Transformation transformation) {
            SwipeRefreshLayout.this.p(f10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class h extends Animation {
        h() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f10, Transformation transformation) {
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            float f11 = swipeRefreshLayout.f4106y;
            swipeRefreshLayout.setAnimationProgress(f11 + ((-f11) * f10));
            SwipeRefreshLayout.this.p(f10);
        }
    }

    /* loaded from: classes.dex */
    public interface i {
        boolean a(SwipeRefreshLayout swipeRefreshLayout, View view);
    }

    /* loaded from: classes.dex */
    public interface j {
        void a();
    }

    public SwipeRefreshLayout(Context context) {
        this(context, null);
    }

    private void A(Animation.AnimationListener animationListener) {
        this.f4103v.setVisibility(0);
        this.C.setAlpha(255);
        b bVar = new b();
        this.D = bVar;
        bVar.setDuration(this.f4094m);
        if (animationListener != null) {
            this.f4103v.b(animationListener);
        }
        this.f4103v.clearAnimation();
        this.f4103v.startAnimation(this.D);
    }

    private void a(int i10, Animation.AnimationListener animationListener) {
        this.f4105x = i10;
        this.O.reset();
        this.O.setDuration(200L);
        this.O.setInterpolator(this.f4102u);
        if (animationListener != null) {
            this.f4103v.b(animationListener);
        }
        this.f4103v.clearAnimation();
        this.f4103v.startAnimation(this.O);
    }

    private void b(int i10, Animation.AnimationListener animationListener) {
        if (this.f4100s) {
            z(i10, animationListener);
            return;
        }
        this.f4105x = i10;
        this.P.reset();
        this.P.setDuration(200L);
        this.P.setInterpolator(this.f4102u);
        if (animationListener != null) {
            this.f4103v.b(animationListener);
        }
        this.f4103v.clearAnimation();
        this.f4103v.startAnimation(this.P);
    }

    private void d() {
        this.f4103v = new androidx.swiperefreshlayout.widget.a(getContext());
        androidx.swiperefreshlayout.widget.b bVar = new androidx.swiperefreshlayout.widget.b(getContext());
        this.C = bVar;
        bVar.l(1);
        this.f4103v.setImageDrawable(this.C);
        this.f4103v.setVisibility(8);
        addView(this.f4103v);
    }

    private void f() {
        if (this.f4082a == null) {
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                View childAt = getChildAt(i10);
                if (!childAt.equals(this.f4103v)) {
                    this.f4082a = childAt;
                    return;
                }
            }
        }
    }

    private void g(float f10) {
        if (f10 > this.f4086e) {
            t(true, true);
            return;
        }
        this.f4084c = false;
        this.C.j(0.0f, 0.0f);
        b(this.f4095n, this.f4100s ? null : new e());
        this.C.d(false);
    }

    private boolean h(Animation animation) {
        return (animation == null || !animation.hasStarted() || animation.hasEnded()) ? false : true;
    }

    private void l(float f10) {
        this.C.d(true);
        float min = Math.min(1.0f, Math.abs(f10 / this.f4086e));
        float max = (((float) Math.max(min - 0.4d, 0.0d)) * 5.0f) / 3.0f;
        float abs = Math.abs(f10) - this.f4086e;
        int i10 = this.B;
        if (i10 <= 0) {
            if (this.K) {
                i10 = this.A - this.f4107z;
            } else {
                i10 = this.A;
            }
        }
        float f11 = i10;
        double max2 = Math.max(0.0f, Math.min(abs, f11 * 2.0f) / f11) / 4.0f;
        float pow = ((float) (max2 - Math.pow(max2, 2.0d))) * 2.0f;
        int i11 = this.f4107z + ((int) ((f11 * min) + (f11 * pow * 2.0f)));
        if (this.f4103v.getVisibility() != 0) {
            this.f4103v.setVisibility(0);
        }
        if (!this.f4100s) {
            this.f4103v.setScaleX(1.0f);
            this.f4103v.setScaleY(1.0f);
        }
        if (this.f4100s) {
            setAnimationProgress(Math.min(1.0f, f10 / this.f4086e));
        }
        if (f10 < this.f4086e) {
            if (this.C.getAlpha() > 76 && !h(this.F)) {
                x();
            }
        } else if (this.C.getAlpha() < 255 && !h(this.G)) {
            w();
        }
        this.C.j(0.0f, Math.min(0.8f, max * 0.8f));
        this.C.e(Math.min(1.0f, max));
        this.C.g((((max * 0.4f) - 0.25f) + (pow * 2.0f)) * 0.5f);
        setTargetOffsetTopAndBottom(i11 - this.f4095n);
    }

    private void q(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f4099r) {
            this.f4099r = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
        }
    }

    private void setColorViewAlpha(int i10) {
        this.f4103v.getBackground().setAlpha(i10);
        this.C.setAlpha(i10);
    }

    private void t(boolean z10, boolean z11) {
        if (this.f4084c != z10) {
            this.I = z11;
            f();
            this.f4084c = z10;
            if (z10) {
                a(this.f4095n, this.N);
            } else {
                y(this.N);
            }
        }
    }

    private Animation u(int i10, int i11) {
        d dVar = new d(i10, i11);
        dVar.setDuration(300L);
        this.f4103v.b(null);
        this.f4103v.clearAnimation();
        this.f4103v.startAnimation(dVar);
        return dVar;
    }

    private void v(float f10) {
        float f11 = this.f4097p;
        int i10 = this.f4085d;
        if (f10 - f11 <= i10 || this.f4098q) {
            return;
        }
        this.f4096o = f11 + i10;
        this.f4098q = true;
        this.C.setAlpha(76);
    }

    private void w() {
        this.G = u(this.C.getAlpha(), 255);
    }

    private void x() {
        this.F = u(this.C.getAlpha(), 76);
    }

    private void z(int i10, Animation.AnimationListener animationListener) {
        this.f4105x = i10;
        this.f4106y = this.f4103v.getScaleX();
        h hVar = new h();
        this.H = hVar;
        hVar.setDuration(150L);
        if (animationListener != null) {
            this.f4103v.b(animationListener);
        }
        this.f4103v.clearAnimation();
        this.f4103v.startAnimation(this.H);
    }

    public boolean c() {
        i iVar = this.L;
        if (iVar != null) {
            return iVar.a(this, this.f4082a);
        }
        View view = this.f4082a;
        if (view instanceof ListView) {
            return androidx.core.widget.h.a((ListView) view, -1);
        }
        return view.canScrollVertically(-1);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f10, float f11, boolean z10) {
        return this.f4089h.a(f10, f11, z10);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f10, float f11) {
        return this.f4089h.b(f10, f11);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return this.f4089h.c(i10, i11, iArr, iArr2);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return this.f4089h.f(i10, i11, i12, i13, iArr);
    }

    public void e(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        if (i14 == 0) {
            this.f4089h.e(i10, i11, i12, i13, iArr, i14, iArr2);
        }
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i10, int i11) {
        int i12 = this.f4104w;
        return i12 < 0 ? i11 : i11 == i10 + (-1) ? i12 : i11 >= i12 ? i11 + 1 : i11;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f4088g.a();
    }

    public int getProgressCircleDiameter() {
        return this.J;
    }

    public int getProgressViewEndOffset() {
        return this.A;
    }

    public int getProgressViewStartOffset() {
        return this.f4107z;
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return this.f4089h.k();
    }

    @Override // androidx.core.view.o
    public void i(View view, View view2, int i10, int i11) {
        if (i11 == 0) {
            onNestedScrollAccepted(view, view2, i10);
        }
    }

    @Override // android.view.View, androidx.core.view.m
    public boolean isNestedScrollingEnabled() {
        return this.f4089h.m();
    }

    @Override // androidx.core.view.o
    public void j(View view, int i10) {
        if (i10 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // androidx.core.view.o
    public void k(View view, int i10, int i11, int[] iArr, int i12) {
        if (i12 == 0) {
            onNestedPreScroll(view, i10, i11, iArr);
        }
    }

    @Override // androidx.core.view.p
    public void m(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        if (i14 != 0) {
            return;
        }
        int i15 = iArr[1];
        e(i10, i11, i12, i13, this.f4091j, i14, iArr);
        int i16 = i13 - (iArr[1] - i15);
        int i17 = i16 == 0 ? i13 + this.f4091j[1] : i16;
        if (i17 >= 0 || c()) {
            return;
        }
        float abs = this.f4087f + Math.abs(i17);
        this.f4087f = abs;
        l(abs);
        iArr[1] = iArr[1] + i16;
    }

    @Override // androidx.core.view.o
    public void n(View view, int i10, int i11, int i12, int i13, int i14) {
        m(view, i10, i11, i12, i13, i14, this.f4092k);
    }

    @Override // androidx.core.view.o
    public boolean o(View view, View view2, int i10, int i11) {
        if (i11 == 0) {
            return onStartNestedScroll(view, view2, i10);
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        r();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        f();
        int actionMasked = motionEvent.getActionMasked();
        if (this.f4101t && actionMasked == 0) {
            this.f4101t = false;
        }
        if (!isEnabled() || this.f4101t || c() || this.f4084c || this.f4093l) {
            return false;
        }
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int i10 = this.f4099r;
                    if (i10 == -1) {
                        Log.e(Q, "Got ACTION_MOVE event but don't have an active pointer id.");
                        return false;
                    }
                    int findPointerIndex = motionEvent.findPointerIndex(i10);
                    if (findPointerIndex < 0) {
                        return false;
                    }
                    v(motionEvent.getY(findPointerIndex));
                } else if (actionMasked != 3) {
                    if (actionMasked == 6) {
                        q(motionEvent);
                    }
                }
            }
            this.f4098q = false;
            this.f4099r = -1;
        } else {
            setTargetOffsetTopAndBottom(this.f4107z - this.f4103v.getTop());
            int pointerId = motionEvent.getPointerId(0);
            this.f4099r = pointerId;
            this.f4098q = false;
            int findPointerIndex2 = motionEvent.findPointerIndex(pointerId);
            if (findPointerIndex2 < 0) {
                return false;
            }
            this.f4097p = motionEvent.getY(findPointerIndex2);
        }
        return this.f4098q;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() == 0) {
            return;
        }
        if (this.f4082a == null) {
            f();
        }
        View view = this.f4082a;
        if (view == null) {
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
        int measuredWidth2 = this.f4103v.getMeasuredWidth();
        int measuredHeight2 = this.f4103v.getMeasuredHeight();
        int i14 = measuredWidth / 2;
        int i15 = measuredWidth2 / 2;
        int i16 = this.f4095n;
        this.f4103v.layout(i14 - i15, i16, i14 + i15, measuredHeight2 + i16);
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f4082a == null) {
            f();
        }
        View view = this.f4082a;
        if (view == null) {
            return;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
        this.f4103v.measure(View.MeasureSpec.makeMeasureSpec(this.J, 1073741824), View.MeasureSpec.makeMeasureSpec(this.J, 1073741824));
        this.f4104w = -1;
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            if (getChildAt(i12) == this.f4103v) {
                this.f4104w = i12;
                return;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.q
    public boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        return dispatchNestedFling(f10, f11, z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.q
    public boolean onNestedPreFling(View view, float f10, float f11) {
        return dispatchNestedPreFling(f10, f11);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.q
    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        if (i11 > 0) {
            float f10 = this.f4087f;
            if (f10 > 0.0f) {
                float f11 = i11;
                if (f11 > f10) {
                    iArr[1] = (int) f10;
                    this.f4087f = 0.0f;
                } else {
                    this.f4087f = f10 - f11;
                    iArr[1] = i11;
                }
                l(this.f4087f);
            }
        }
        if (this.K && i11 > 0 && this.f4087f == 0.0f && Math.abs(i11 - iArr[1]) > 0) {
            this.f4103v.setVisibility(8);
        }
        int[] iArr2 = this.f4090i;
        if (dispatchNestedPreScroll(i10 - iArr[0], i11 - iArr[1], iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.q
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        m(view, i10, i11, i12, i13, 0, this.f4092k);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.q
    public void onNestedScrollAccepted(View view, View view2, int i10) {
        this.f4088g.b(view, view2, i10);
        startNestedScroll(i10 & 2);
        this.f4087f = 0.0f;
        this.f4093l = true;
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setRefreshing(savedState.f4108a);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        return new SavedState(super.onSaveInstanceState(), this.f4084c);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.q
    public boolean onStartNestedScroll(View view, View view2, int i10) {
        return (!isEnabled() || this.f4101t || this.f4084c || (i10 & 2) == 0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.q
    public void onStopNestedScroll(View view) {
        this.f4088g.d(view);
        this.f4093l = false;
        float f10 = this.f4087f;
        if (f10 > 0.0f) {
            g(f10);
            this.f4087f = 0.0f;
        }
        stopNestedScroll();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (this.f4101t && actionMasked == 0) {
            this.f4101t = false;
        }
        if (!isEnabled() || this.f4101t || c() || this.f4084c || this.f4093l) {
            return false;
        }
        if (actionMasked == 0) {
            this.f4099r = motionEvent.getPointerId(0);
            this.f4098q = false;
        } else if (actionMasked == 1) {
            int findPointerIndex = motionEvent.findPointerIndex(this.f4099r);
            if (findPointerIndex < 0) {
                Log.e(Q, "Got ACTION_UP event but don't have an active pointer id.");
                return false;
            }
            if (this.f4098q) {
                this.f4098q = false;
                g((motionEvent.getY(findPointerIndex) - this.f4096o) * 0.5f);
            }
            this.f4099r = -1;
            return false;
        } else if (actionMasked == 2) {
            int findPointerIndex2 = motionEvent.findPointerIndex(this.f4099r);
            if (findPointerIndex2 < 0) {
                Log.e(Q, "Got ACTION_MOVE event but have an invalid active pointer id.");
                return false;
            }
            float y10 = motionEvent.getY(findPointerIndex2);
            v(y10);
            if (this.f4098q) {
                float f10 = (y10 - this.f4096o) * 0.5f;
                if (f10 <= 0.0f) {
                    return false;
                }
                getParent().requestDisallowInterceptTouchEvent(true);
                l(f10);
            }
        } else if (actionMasked == 3) {
            return false;
        } else {
            if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                if (actionIndex < 0) {
                    Log.e(Q, "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                    return false;
                }
                this.f4099r = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                q(motionEvent);
            }
        }
        return true;
    }

    void p(float f10) {
        int i10 = this.f4105x;
        setTargetOffsetTopAndBottom((i10 + ((int) ((this.f4107z - i10) * f10))) - this.f4103v.getTop());
    }

    void r() {
        this.f4103v.clearAnimation();
        this.C.stop();
        this.f4103v.setVisibility(8);
        setColorViewAlpha(255);
        if (this.f4100s) {
            setAnimationProgress(0.0f);
        } else {
            setTargetOffsetTopAndBottom(this.f4107z - this.f4095n);
        }
        this.f4095n = this.f4103v.getTop();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        View view;
        ViewParent parent;
        if ((Build.VERSION.SDK_INT < 21 && (this.f4082a instanceof AbsListView)) || ((view = this.f4082a) != null && !z.V(view))) {
            if (this.M || (parent = getParent()) == null) {
                return;
            }
            parent.requestDisallowInterceptTouchEvent(z10);
            return;
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    public void s(boolean z10, int i10, int i11) {
        this.f4100s = z10;
        this.f4107z = i10;
        this.A = i11;
        this.K = true;
        r();
        this.f4084c = false;
    }

    void setAnimationProgress(float f10) {
        this.f4103v.setScaleX(f10);
        this.f4103v.setScaleY(f10);
    }

    @Deprecated
    public void setColorScheme(int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeColors(int... iArr) {
        f();
        this.C.f(iArr);
    }

    public void setColorSchemeResources(int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i10 = 0; i10 < iArr.length; i10++) {
            iArr2[i10] = androidx.core.content.b.d(context, iArr[i10]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setDistanceToTriggerSync(int i10) {
        this.f4086e = i10;
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        if (z10) {
            return;
        }
        r();
    }

    @Deprecated
    public void setLegacyRequestDisallowInterceptTouchEventEnabled(boolean z10) {
        this.M = z10;
    }

    @Override // android.view.View, androidx.core.view.m
    public void setNestedScrollingEnabled(boolean z10) {
        this.f4089h.n(z10);
    }

    public void setOnChildScrollUpCallback(i iVar) {
        this.L = iVar;
    }

    public void setOnRefreshListener(j jVar) {
        this.f4083b = jVar;
    }

    @Deprecated
    public void setProgressBackgroundColor(int i10) {
        setProgressBackgroundColorSchemeResource(i10);
    }

    public void setProgressBackgroundColorSchemeColor(int i10) {
        this.f4103v.setBackgroundColor(i10);
    }

    public void setProgressBackgroundColorSchemeResource(int i10) {
        setProgressBackgroundColorSchemeColor(androidx.core.content.b.d(getContext(), i10));
    }

    public void setRefreshing(boolean z10) {
        int i10;
        if (z10 && this.f4084c != z10) {
            this.f4084c = z10;
            if (!this.K) {
                i10 = this.A + this.f4107z;
            } else {
                i10 = this.A;
            }
            setTargetOffsetTopAndBottom(i10 - this.f4095n);
            this.I = false;
            A(this.N);
            return;
        }
        t(z10, false);
    }

    public void setSize(int i10) {
        if (i10 == 0 || i10 == 1) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            if (i10 == 0) {
                this.J = (int) (displayMetrics.density * 56.0f);
            } else {
                this.J = (int) (displayMetrics.density * 40.0f);
            }
            this.f4103v.setImageDrawable(null);
            this.C.l(i10);
            this.f4103v.setImageDrawable(this.C);
        }
    }

    public void setSlingshotDistance(int i10) {
        this.B = i10;
    }

    void setTargetOffsetTopAndBottom(int i10) {
        this.f4103v.bringToFront();
        z.b0(this.f4103v, i10);
        this.f4095n = this.f4103v.getTop();
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i10) {
        return this.f4089h.p(i10);
    }

    @Override // android.view.View, androidx.core.view.m
    public void stopNestedScroll() {
        this.f4089h.r();
    }

    void y(Animation.AnimationListener animationListener) {
        c cVar = new c();
        this.E = cVar;
        cVar.setDuration(150L);
        this.f4103v.b(animationListener);
        this.f4103v.clearAnimation();
        this.f4103v.startAnimation(this.E);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        final boolean f4108a;

        /* loaded from: classes.dex */
        class a implements Parcelable.Creator<SavedState> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        SavedState(Parcelable parcelable, boolean z10) {
            super(parcelable);
            this.f4108a = z10;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeByte(this.f4108a ? (byte) 1 : (byte) 0);
        }

        SavedState(Parcel parcel) {
            super(parcel);
            this.f4108a = parcel.readByte() != 0;
        }
    }

    public SwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4084c = false;
        this.f4086e = -1.0f;
        this.f4090i = new int[2];
        this.f4091j = new int[2];
        this.f4092k = new int[2];
        this.f4099r = -1;
        this.f4104w = -1;
        this.N = new a();
        this.O = new f();
        this.P = new g();
        this.f4085d = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f4094m = getResources().getInteger(17694721);
        setWillNotDraw(false);
        this.f4102u = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.J = (int) (displayMetrics.density * 40.0f);
        d();
        setChildrenDrawingOrderEnabled(true);
        int i10 = (int) (displayMetrics.density * 64.0f);
        this.A = i10;
        this.f4086e = i10;
        this.f4088g = new r(this);
        this.f4089h = new n(this);
        setNestedScrollingEnabled(true);
        int i11 = -this.J;
        this.f4095n = i11;
        this.f4107z = i11;
        p(1.0f);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R);
        setEnabled(obtainStyledAttributes.getBoolean(0, true));
        obtainStyledAttributes.recycle();
    }
}
