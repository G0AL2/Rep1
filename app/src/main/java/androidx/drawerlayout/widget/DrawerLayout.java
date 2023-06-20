package androidx.drawerlayout.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.z;
import androidx.customview.view.AbsSavedState;
import i0.c;
import java.util.ArrayList;
import java.util.List;
import m0.c;

/* loaded from: classes.dex */
public class DrawerLayout extends ViewGroup {
    private static final int[] K = {16843828};
    static final int[] L = {16842931};
    static final boolean M;
    private static final boolean N;
    private CharSequence A;
    private Object B;
    private boolean C;
    private Drawable D;
    private Drawable E;
    private Drawable F;
    private Drawable G;
    private final ArrayList<View> H;
    private Rect I;
    private Matrix J;

    /* renamed from: a  reason: collision with root package name */
    private final c f2828a;

    /* renamed from: b  reason: collision with root package name */
    private float f2829b;

    /* renamed from: c  reason: collision with root package name */
    private int f2830c;

    /* renamed from: d  reason: collision with root package name */
    private int f2831d;

    /* renamed from: e  reason: collision with root package name */
    private float f2832e;

    /* renamed from: f  reason: collision with root package name */
    private Paint f2833f;

    /* renamed from: g  reason: collision with root package name */
    private final m0.c f2834g;

    /* renamed from: h  reason: collision with root package name */
    private final m0.c f2835h;

    /* renamed from: i  reason: collision with root package name */
    private final f f2836i;

    /* renamed from: j  reason: collision with root package name */
    private final f f2837j;

    /* renamed from: k  reason: collision with root package name */
    private int f2838k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f2839l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f2840m;

    /* renamed from: n  reason: collision with root package name */
    private int f2841n;

    /* renamed from: o  reason: collision with root package name */
    private int f2842o;

    /* renamed from: p  reason: collision with root package name */
    private int f2843p;

    /* renamed from: q  reason: collision with root package name */
    private int f2844q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f2845r;

    /* renamed from: s  reason: collision with root package name */
    private d f2846s;

    /* renamed from: t  reason: collision with root package name */
    private List<d> f2847t;

    /* renamed from: u  reason: collision with root package name */
    private float f2848u;

    /* renamed from: v  reason: collision with root package name */
    private float f2849v;

    /* renamed from: w  reason: collision with root package name */
    private Drawable f2850w;

    /* renamed from: x  reason: collision with root package name */
    private Drawable f2851x;

    /* renamed from: y  reason: collision with root package name */
    private Drawable f2852y;

    /* renamed from: z  reason: collision with root package name */
    private CharSequence f2853z;

    /* loaded from: classes.dex */
    class a implements View.OnApplyWindowInsetsListener {
        a(DrawerLayout drawerLayout) {
        }

        @Override // android.view.View.OnApplyWindowInsetsListener
        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            ((DrawerLayout) view).Q(windowInsets, windowInsets.getSystemWindowInsetTop() > 0);
            return windowInsets.consumeSystemWindowInsets();
        }
    }

    /* loaded from: classes.dex */
    class b extends androidx.core.view.a {

        /* renamed from: d  reason: collision with root package name */
        private final Rect f2859d = new Rect();

        b() {
        }

        private void n(i0.c cVar, ViewGroup viewGroup) {
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (DrawerLayout.A(childAt)) {
                    cVar.c(childAt);
                }
            }
        }

        private void o(i0.c cVar, i0.c cVar2) {
            Rect rect = this.f2859d;
            cVar2.m(rect);
            cVar.W(rect);
            cVar2.n(rect);
            cVar.X(rect);
            cVar.D0(cVar2.M());
            cVar.o0(cVar2.u());
            cVar.a0(cVar2.p());
            cVar.e0(cVar2.r());
            cVar.g0(cVar2.E());
            cVar.b0(cVar2.D());
            cVar.i0(cVar2.F());
            cVar.j0(cVar2.G());
            cVar.U(cVar2.A());
            cVar.w0(cVar2.K());
            cVar.n0(cVar2.H());
            cVar.a(cVar2.k());
        }

        @Override // androidx.core.view.a
        public boolean a(View view, AccessibilityEvent accessibilityEvent) {
            if (accessibilityEvent.getEventType() == 32) {
                List<CharSequence> text = accessibilityEvent.getText();
                View p10 = DrawerLayout.this.p();
                if (p10 != null) {
                    CharSequence s10 = DrawerLayout.this.s(DrawerLayout.this.t(p10));
                    if (s10 != null) {
                        text.add(s10);
                        return true;
                    }
                    return true;
                }
                return true;
            }
            return super.a(view, accessibilityEvent);
        }

        @Override // androidx.core.view.a
        public void f(View view, AccessibilityEvent accessibilityEvent) {
            super.f(view, accessibilityEvent);
            accessibilityEvent.setClassName(DrawerLayout.class.getName());
        }

        @Override // androidx.core.view.a
        public void g(View view, i0.c cVar) {
            if (DrawerLayout.M) {
                super.g(view, cVar);
            } else {
                i0.c P = i0.c.P(cVar);
                super.g(view, P);
                cVar.y0(view);
                ViewParent I = z.I(view);
                if (I instanceof View) {
                    cVar.q0((View) I);
                }
                o(cVar, P);
                P.R();
                n(cVar, (ViewGroup) view);
            }
            cVar.a0(DrawerLayout.class.getName());
            cVar.i0(false);
            cVar.j0(false);
            cVar.S(c.a.f31490e);
            cVar.S(c.a.f31491f);
        }

        @Override // androidx.core.view.a
        public boolean i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (DrawerLayout.M || DrawerLayout.A(view)) {
                return super.i(viewGroup, view, accessibilityEvent);
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    static final class c extends androidx.core.view.a {
        c() {
        }

        @Override // androidx.core.view.a
        public void g(View view, i0.c cVar) {
            super.g(view, cVar);
            if (DrawerLayout.A(view)) {
                return;
            }
            cVar.q0(null);
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        void a(View view);

        void b(View view);

        void c(int i10);

        void d(View view, float f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class f extends c.AbstractC0449c {

        /* renamed from: a  reason: collision with root package name */
        private final int f2865a;

        /* renamed from: b  reason: collision with root package name */
        private m0.c f2866b;

        /* renamed from: c  reason: collision with root package name */
        private final Runnable f2867c = new a();

        /* loaded from: classes.dex */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                f.this.o();
            }
        }

        f(int i10) {
            this.f2865a = i10;
        }

        private void n() {
            View n10 = DrawerLayout.this.n(this.f2865a == 3 ? 5 : 3);
            if (n10 != null) {
                DrawerLayout.this.f(n10);
            }
        }

        @Override // m0.c.AbstractC0449c
        public int a(View view, int i10, int i11) {
            if (DrawerLayout.this.c(view, 3)) {
                return Math.max(-view.getWidth(), Math.min(i10, 0));
            }
            int width = DrawerLayout.this.getWidth();
            return Math.max(width - view.getWidth(), Math.min(i10, width));
        }

        @Override // m0.c.AbstractC0449c
        public int b(View view, int i10, int i11) {
            return view.getTop();
        }

        @Override // m0.c.AbstractC0449c
        public int d(View view) {
            if (DrawerLayout.this.D(view)) {
                return view.getWidth();
            }
            return 0;
        }

        @Override // m0.c.AbstractC0449c
        public void f(int i10, int i11) {
            View n10;
            if ((i10 & 1) == 1) {
                n10 = DrawerLayout.this.n(3);
            } else {
                n10 = DrawerLayout.this.n(5);
            }
            if (n10 == null || DrawerLayout.this.r(n10) != 0) {
                return;
            }
            this.f2866b.b(n10, i11);
        }

        @Override // m0.c.AbstractC0449c
        public boolean g(int i10) {
            return false;
        }

        @Override // m0.c.AbstractC0449c
        public void h(int i10, int i11) {
            DrawerLayout.this.postDelayed(this.f2867c, 160L);
        }

        @Override // m0.c.AbstractC0449c
        public void i(View view, int i10) {
            ((e) view.getLayoutParams()).f2863c = false;
            n();
        }

        @Override // m0.c.AbstractC0449c
        public void j(int i10) {
            DrawerLayout.this.U(this.f2865a, i10, this.f2866b.v());
        }

        @Override // m0.c.AbstractC0449c
        public void k(View view, int i10, int i11, int i12, int i13) {
            int width = view.getWidth();
            float width2 = (DrawerLayout.this.c(view, 3) ? i10 + width : DrawerLayout.this.getWidth() - i10) / width;
            DrawerLayout.this.S(view, width2);
            view.setVisibility(width2 == 0.0f ? 4 : 0);
            DrawerLayout.this.invalidate();
        }

        @Override // m0.c.AbstractC0449c
        public void l(View view, float f10, float f11) {
            int i10;
            float u10 = DrawerLayout.this.u(view);
            int width = view.getWidth();
            if (DrawerLayout.this.c(view, 3)) {
                int i11 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
                i10 = (i11 > 0 || (i11 == 0 && u10 > 0.5f)) ? 0 : -width;
            } else {
                int width2 = DrawerLayout.this.getWidth();
                if (f10 < 0.0f || (f10 == 0.0f && u10 > 0.5f)) {
                    width2 -= width;
                }
                i10 = width2;
            }
            this.f2866b.M(i10, view.getTop());
            DrawerLayout.this.invalidate();
        }

        @Override // m0.c.AbstractC0449c
        public boolean m(View view, int i10) {
            return DrawerLayout.this.D(view) && DrawerLayout.this.c(view, this.f2865a) && DrawerLayout.this.r(view) == 0;
        }

        void o() {
            View n10;
            int width;
            int w10 = this.f2866b.w();
            boolean z10 = this.f2865a == 3;
            if (z10) {
                n10 = DrawerLayout.this.n(3);
                width = (n10 != null ? -n10.getWidth() : 0) + w10;
            } else {
                n10 = DrawerLayout.this.n(5);
                width = DrawerLayout.this.getWidth() - w10;
            }
            if (n10 != null) {
                if (((!z10 || n10.getLeft() >= width) && (z10 || n10.getLeft() <= width)) || DrawerLayout.this.r(n10) != 0) {
                    return;
                }
                this.f2866b.O(n10, width, n10.getTop());
                ((e) n10.getLayoutParams()).f2863c = true;
                DrawerLayout.this.invalidate();
                n();
                DrawerLayout.this.b();
            }
        }

        public void p() {
            DrawerLayout.this.removeCallbacks(this.f2867c);
        }

        public void q(m0.c cVar) {
            this.f2866b = cVar;
        }
    }

    static {
        int i10 = Build.VERSION.SDK_INT;
        M = i10 >= 19;
        N = i10 >= 21;
    }

    public DrawerLayout(Context context) {
        this(context, null);
    }

    static boolean A(View view) {
        return (z.A(view) == 4 || z.A(view) == 2) ? false : true;
    }

    private boolean F(float f10, float f11, View view) {
        if (this.I == null) {
            this.I = new Rect();
        }
        view.getHitRect(this.I);
        return this.I.contains((int) f10, (int) f11);
    }

    private boolean G(Drawable drawable, int i10) {
        if (drawable == null || !androidx.core.graphics.drawable.a.h(drawable)) {
            return false;
        }
        androidx.core.graphics.drawable.a.m(drawable, i10);
        return true;
    }

    private Drawable N() {
        int C = z.C(this);
        if (C == 0) {
            Drawable drawable = this.D;
            if (drawable != null) {
                G(drawable, C);
                return this.D;
            }
        } else {
            Drawable drawable2 = this.E;
            if (drawable2 != null) {
                G(drawable2, C);
                return this.E;
            }
        }
        return this.F;
    }

    private Drawable O() {
        int C = z.C(this);
        if (C == 0) {
            Drawable drawable = this.E;
            if (drawable != null) {
                G(drawable, C);
                return this.E;
            }
        } else {
            Drawable drawable2 = this.D;
            if (drawable2 != null) {
                G(drawable2, C);
                return this.D;
            }
        }
        return this.G;
    }

    private void P() {
        if (N) {
            return;
        }
        this.f2851x = N();
        this.f2852y = O();
    }

    private void T(View view, boolean z10) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if ((!z10 && !D(childAt)) || (z10 && childAt == view)) {
                z.A0(childAt, 1);
            } else {
                z.A0(childAt, 4);
            }
        }
    }

    private boolean m(MotionEvent motionEvent, View view) {
        if (!view.getMatrix().isIdentity()) {
            MotionEvent v10 = v(motionEvent, view);
            boolean dispatchGenericMotionEvent = view.dispatchGenericMotionEvent(v10);
            v10.recycle();
            return dispatchGenericMotionEvent;
        }
        float scrollX = getScrollX() - view.getLeft();
        float scrollY = getScrollY() - view.getTop();
        motionEvent.offsetLocation(scrollX, scrollY);
        boolean dispatchGenericMotionEvent2 = view.dispatchGenericMotionEvent(motionEvent);
        motionEvent.offsetLocation(-scrollX, -scrollY);
        return dispatchGenericMotionEvent2;
    }

    private MotionEvent v(MotionEvent motionEvent, View view) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation(getScrollX() - view.getLeft(), getScrollY() - view.getTop());
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            if (this.J == null) {
                this.J = new Matrix();
            }
            matrix.invert(this.J);
            obtain.transform(this.J);
        }
        return obtain;
    }

    static String w(int i10) {
        return (i10 & 3) == 3 ? "LEFT" : (i10 & 5) == 5 ? "RIGHT" : Integer.toHexString(i10);
    }

    private static boolean x(View view) {
        Drawable background = view.getBackground();
        return background != null && background.getOpacity() == -1;
    }

    private boolean y() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            if (((e) getChildAt(i10).getLayoutParams()).f2863c) {
                return true;
            }
        }
        return false;
    }

    private boolean z() {
        return p() != null;
    }

    boolean B(View view) {
        return ((e) view.getLayoutParams()).f2861a == 0;
    }

    public boolean C(View view) {
        if (D(view)) {
            return (((e) view.getLayoutParams()).f2864d & 1) == 1;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    boolean D(View view) {
        int b10 = androidx.core.view.e.b(((e) view.getLayoutParams()).f2861a, z.C(view));
        return ((b10 & 3) == 0 && (b10 & 5) == 0) ? false : true;
    }

    public boolean E(View view) {
        if (D(view)) {
            return ((e) view.getLayoutParams()).f2862b > 0.0f;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    void H(View view, float f10) {
        float u10 = u(view);
        float width = view.getWidth();
        int i10 = ((int) (width * f10)) - ((int) (u10 * width));
        if (!c(view, 3)) {
            i10 = -i10;
        }
        view.offsetLeftAndRight(i10);
        S(view, f10);
    }

    public void I(int i10) {
        J(i10, true);
    }

    public void J(int i10, boolean z10) {
        View n10 = n(i10);
        if (n10 != null) {
            L(n10, z10);
            return;
        }
        throw new IllegalArgumentException("No drawer view found with gravity " + w(i10));
    }

    public void K(View view) {
        L(view, true);
    }

    public void L(View view, boolean z10) {
        if (D(view)) {
            e eVar = (e) view.getLayoutParams();
            if (this.f2840m) {
                eVar.f2862b = 1.0f;
                eVar.f2864d = 1;
                T(view, true);
            } else if (z10) {
                eVar.f2864d |= 2;
                if (c(view, 3)) {
                    this.f2834g.O(view, 0, view.getTop());
                } else {
                    this.f2835h.O(view, getWidth() - view.getWidth(), view.getTop());
                }
            } else {
                H(view, 1.0f);
                U(eVar.f2861a, 0, view);
                view.setVisibility(0);
            }
            invalidate();
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
    }

    public void M(d dVar) {
        List<d> list;
        if (dVar == null || (list = this.f2847t) == null) {
            return;
        }
        list.remove(dVar);
    }

    public void Q(Object obj, boolean z10) {
        this.B = obj;
        this.C = z10;
        setWillNotDraw(!z10 && getBackground() == null);
        requestLayout();
    }

    public void R(int i10, int i11) {
        View n10;
        int b10 = androidx.core.view.e.b(i11, z.C(this));
        if (i11 == 3) {
            this.f2841n = i10;
        } else if (i11 == 5) {
            this.f2842o = i10;
        } else if (i11 == 8388611) {
            this.f2843p = i10;
        } else if (i11 == 8388613) {
            this.f2844q = i10;
        }
        if (i10 != 0) {
            (b10 == 3 ? this.f2834g : this.f2835h).a();
        }
        if (i10 != 1) {
            if (i10 == 2 && (n10 = n(b10)) != null) {
                K(n10);
                return;
            }
            return;
        }
        View n11 = n(b10);
        if (n11 != null) {
            f(n11);
        }
    }

    void S(View view, float f10) {
        e eVar = (e) view.getLayoutParams();
        if (f10 == eVar.f2862b) {
            return;
        }
        eVar.f2862b = f10;
        l(view, f10);
    }

    void U(int i10, int i11, View view) {
        int z10 = this.f2834g.z();
        int z11 = this.f2835h.z();
        int i12 = 2;
        if (z10 == 1 || z11 == 1) {
            i12 = 1;
        } else if (z10 != 2 && z11 != 2) {
            i12 = 0;
        }
        if (view != null && i11 == 0) {
            float f10 = ((e) view.getLayoutParams()).f2862b;
            if (f10 == 0.0f) {
                j(view);
            } else if (f10 == 1.0f) {
                k(view);
            }
        }
        if (i12 != this.f2838k) {
            this.f2838k = i12;
            List<d> list = this.f2847t;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f2847t.get(size).c(i12);
                }
            }
        }
    }

    public void a(d dVar) {
        if (dVar == null) {
            return;
        }
        if (this.f2847t == null) {
            this.f2847t = new ArrayList();
        }
        this.f2847t.add(dVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i10, int i11) {
        if (getDescendantFocusability() == 393216) {
            return;
        }
        int childCount = getChildCount();
        boolean z10 = false;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (D(childAt)) {
                if (C(childAt)) {
                    childAt.addFocusables(arrayList, i10, i11);
                    z10 = true;
                }
            } else {
                this.H.add(childAt);
            }
        }
        if (!z10) {
            int size = this.H.size();
            for (int i13 = 0; i13 < size; i13++) {
                View view = this.H.get(i13);
                if (view.getVisibility() == 0) {
                    view.addFocusables(arrayList, i10, i11);
                }
            }
        }
        this.H.clear();
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        if (o() == null && !D(view)) {
            z.A0(view, 1);
        } else {
            z.A0(view, 4);
        }
        if (M) {
            return;
        }
        z.q0(view, this.f2828a);
    }

    void b() {
        if (this.f2845r) {
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            getChildAt(i10).dispatchTouchEvent(obtain);
        }
        obtain.recycle();
        this.f2845r = true;
    }

    boolean c(View view, int i10) {
        return (t(view) & i10) == i10;
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof e) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void computeScroll() {
        int childCount = getChildCount();
        float f10 = 0.0f;
        for (int i10 = 0; i10 < childCount; i10++) {
            f10 = Math.max(f10, ((e) getChildAt(i10).getLayoutParams()).f2862b);
        }
        this.f2832e = f10;
        boolean m10 = this.f2834g.m(true);
        boolean m11 = this.f2835h.m(true);
        if (m10 || m11) {
            z.h0(this);
        }
    }

    public void d(int i10) {
        e(i10, true);
    }

    @Override // android.view.View
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) != 0 && motionEvent.getAction() != 10 && this.f2832e > 0.0f) {
            int childCount = getChildCount();
            if (childCount != 0) {
                float x10 = motionEvent.getX();
                float y10 = motionEvent.getY();
                for (int i10 = childCount - 1; i10 >= 0; i10--) {
                    View childAt = getChildAt(i10);
                    if (F(x10, y10, childAt) && !B(childAt) && m(motionEvent, childAt)) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }
        return super.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j10) {
        int height = getHeight();
        boolean B = B(view);
        int width = getWidth();
        int save = canvas.save();
        int i10 = 0;
        if (B) {
            int childCount = getChildCount();
            int i11 = 0;
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = getChildAt(i12);
                if (childAt != view && childAt.getVisibility() == 0 && x(childAt) && D(childAt) && childAt.getHeight() >= height) {
                    if (c(childAt, 3)) {
                        int right = childAt.getRight();
                        if (right > i11) {
                            i11 = right;
                        }
                    } else {
                        int left = childAt.getLeft();
                        if (left < width) {
                            width = left;
                        }
                    }
                }
            }
            canvas.clipRect(i11, 0, width, getHeight());
            i10 = i11;
        }
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restoreToCount(save);
        float f10 = this.f2832e;
        if (f10 > 0.0f && B) {
            int i13 = this.f2831d;
            this.f2833f.setColor((i13 & 16777215) | (((int) ((((-16777216) & i13) >>> 24) * f10)) << 24));
            canvas.drawRect(i10, 0.0f, width, getHeight(), this.f2833f);
        } else if (this.f2851x != null && c(view, 3)) {
            int intrinsicWidth = this.f2851x.getIntrinsicWidth();
            int right2 = view.getRight();
            float max = Math.max(0.0f, Math.min(right2 / this.f2834g.w(), 1.0f));
            this.f2851x.setBounds(right2, view.getTop(), intrinsicWidth + right2, view.getBottom());
            this.f2851x.setAlpha((int) (max * 255.0f));
            this.f2851x.draw(canvas);
        } else if (this.f2852y != null && c(view, 5)) {
            int intrinsicWidth2 = this.f2852y.getIntrinsicWidth();
            int left2 = view.getLeft();
            float max2 = Math.max(0.0f, Math.min((getWidth() - left2) / this.f2835h.w(), 1.0f));
            this.f2852y.setBounds(left2 - intrinsicWidth2, view.getTop(), left2, view.getBottom());
            this.f2852y.setAlpha((int) (max2 * 255.0f));
            this.f2852y.draw(canvas);
        }
        return drawChild;
    }

    public void e(int i10, boolean z10) {
        View n10 = n(i10);
        if (n10 != null) {
            g(n10, z10);
            return;
        }
        throw new IllegalArgumentException("No drawer view found with gravity " + w(i10));
    }

    public void f(View view) {
        g(view, true);
    }

    public void g(View view, boolean z10) {
        if (D(view)) {
            e eVar = (e) view.getLayoutParams();
            if (this.f2840m) {
                eVar.f2862b = 0.0f;
                eVar.f2864d = 0;
            } else if (z10) {
                eVar.f2864d |= 4;
                if (c(view, 3)) {
                    this.f2834g.O(view, -view.getWidth(), view.getTop());
                } else {
                    this.f2835h.O(view, getWidth(), view.getTop());
                }
            } else {
                H(view, 0.0f);
                U(eVar.f2861a, 0, view);
                view.setVisibility(4);
            }
            invalidate();
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new e(-1, -1);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e ? new e((e) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new e((ViewGroup.MarginLayoutParams) layoutParams) : new e(layoutParams);
    }

    public float getDrawerElevation() {
        if (N) {
            return this.f2829b;
        }
        return 0.0f;
    }

    public Drawable getStatusBarBackgroundDrawable() {
        return this.f2850w;
    }

    public void h() {
        i(false);
    }

    void i(boolean z10) {
        boolean O;
        int childCount = getChildCount();
        boolean z11 = false;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            e eVar = (e) childAt.getLayoutParams();
            if (D(childAt) && (!z10 || eVar.f2863c)) {
                int width = childAt.getWidth();
                if (c(childAt, 3)) {
                    O = this.f2834g.O(childAt, -width, childAt.getTop());
                } else {
                    O = this.f2835h.O(childAt, getWidth(), childAt.getTop());
                }
                z11 |= O;
                eVar.f2863c = false;
            }
        }
        this.f2836i.p();
        this.f2837j.p();
        if (z11) {
            invalidate();
        }
    }

    void j(View view) {
        View rootView;
        e eVar = (e) view.getLayoutParams();
        if ((eVar.f2864d & 1) == 1) {
            eVar.f2864d = 0;
            List<d> list = this.f2847t;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f2847t.get(size).b(view);
                }
            }
            T(view, false);
            if (!hasWindowFocus() || (rootView = getRootView()) == null) {
                return;
            }
            rootView.sendAccessibilityEvent(32);
        }
    }

    void k(View view) {
        e eVar = (e) view.getLayoutParams();
        if ((eVar.f2864d & 1) == 0) {
            eVar.f2864d = 1;
            List<d> list = this.f2847t;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f2847t.get(size).a(view);
                }
            }
            T(view, true);
            if (hasWindowFocus()) {
                sendAccessibilityEvent(32);
            }
        }
    }

    void l(View view, float f10) {
        List<d> list = this.f2847t;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f2847t.get(size).d(view, f10);
            }
        }
    }

    View n(int i10) {
        int b10 = androidx.core.view.e.b(i10, z.C(this)) & 7;
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if ((t(childAt) & 7) == b10) {
                return childAt;
            }
        }
        return null;
    }

    View o() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if ((((e) childAt.getLayoutParams()).f2864d & 1) == 1) {
                return childAt;
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f2840m = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f2840m = true;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Object obj;
        super.onDraw(canvas);
        if (!this.C || this.f2850w == null) {
            return;
        }
        int systemWindowInsetTop = (Build.VERSION.SDK_INT < 21 || (obj = this.B) == null) ? 0 : ((WindowInsets) obj).getSystemWindowInsetTop();
        if (systemWindowInsetTop > 0) {
            this.f2850w.setBounds(0, 0, getWidth(), systemWindowInsetTop);
            this.f2850w.draw(canvas);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001b, code lost:
        if (r0 != 3) goto L7;
     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            int r0 = r7.getActionMasked()
            m0.c r1 = r6.f2834g
            boolean r1 = r1.N(r7)
            m0.c r2 = r6.f2835h
            boolean r2 = r2.N(r7)
            r1 = r1 | r2
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L38
            if (r0 == r2) goto L31
            r7 = 2
            r4 = 3
            if (r0 == r7) goto L1e
            if (r0 == r4) goto L31
            goto L36
        L1e:
            m0.c r7 = r6.f2834g
            boolean r7 = r7.d(r4)
            if (r7 == 0) goto L36
            androidx.drawerlayout.widget.DrawerLayout$f r7 = r6.f2836i
            r7.p()
            androidx.drawerlayout.widget.DrawerLayout$f r7 = r6.f2837j
            r7.p()
            goto L36
        L31:
            r6.i(r2)
            r6.f2845r = r3
        L36:
            r7 = 0
            goto L60
        L38:
            float r0 = r7.getX()
            float r7 = r7.getY()
            r6.f2848u = r0
            r6.f2849v = r7
            float r4 = r6.f2832e
            r5 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L5d
            m0.c r4 = r6.f2834g
            int r0 = (int) r0
            int r7 = (int) r7
            android.view.View r7 = r4.t(r0, r7)
            if (r7 == 0) goto L5d
            boolean r7 = r6.B(r7)
            if (r7 == 0) goto L5d
            r7 = 1
            goto L5e
        L5d:
            r7 = 0
        L5e:
            r6.f2845r = r3
        L60:
            if (r1 != 0) goto L70
            if (r7 != 0) goto L70
            boolean r7 = r6.y()
            if (r7 != 0) goto L70
            boolean r7 = r6.f2845r
            if (r7 == 0) goto L6f
            goto L70
        L6f:
            r2 = 0
        L70:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (i10 == 4 && z()) {
            keyEvent.startTracking();
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        if (i10 == 4) {
            View p10 = p();
            if (p10 != null && r(p10) == 0) {
                h();
            }
            return p10 != null;
        }
        return super.onKeyUp(i10, keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        float f10;
        int i15;
        this.f2839l = true;
        int i16 = i12 - i10;
        int childCount = getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt = getChildAt(i17);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (B(childAt)) {
                    int i18 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin;
                    childAt.layout(i18, ((ViewGroup.MarginLayoutParams) eVar).topMargin, childAt.getMeasuredWidth() + i18, ((ViewGroup.MarginLayoutParams) eVar).topMargin + childAt.getMeasuredHeight());
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (c(childAt, 3)) {
                        float f11 = measuredWidth;
                        i15 = (-measuredWidth) + ((int) (eVar.f2862b * f11));
                        f10 = (measuredWidth + i15) / f11;
                    } else {
                        float f12 = measuredWidth;
                        f10 = (i16 - i14) / f12;
                        i15 = i16 - ((int) (eVar.f2862b * f12));
                    }
                    boolean z11 = f10 != eVar.f2862b;
                    int i19 = eVar.f2861a & 112;
                    if (i19 == 16) {
                        int i20 = i13 - i11;
                        int i21 = (i20 - measuredHeight) / 2;
                        int i22 = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
                        if (i21 < i22) {
                            i21 = i22;
                        } else {
                            int i23 = i21 + measuredHeight;
                            int i24 = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
                            if (i23 > i20 - i24) {
                                i21 = (i20 - i24) - measuredHeight;
                            }
                        }
                        childAt.layout(i15, i21, measuredWidth + i15, measuredHeight + i21);
                    } else if (i19 != 80) {
                        int i25 = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
                        childAt.layout(i15, i25, measuredWidth + i15, measuredHeight + i25);
                    } else {
                        int i26 = i13 - i11;
                        childAt.layout(i15, (i26 - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i15, i26 - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
                    }
                    if (z11) {
                        S(childAt, f10);
                    }
                    int i27 = eVar.f2862b > 0.0f ? 0 : 4;
                    if (childAt.getVisibility() != i27) {
                        childAt.setVisibility(i27);
                    }
                }
            }
        }
        this.f2839l = false;
        this.f2840m = false;
    }

    @Override // android.view.View
    @SuppressLint({"WrongConstant"})
    protected void onMeasure(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        if (mode != 1073741824 || mode2 != 1073741824) {
            if (!isInEditMode()) {
                throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
            }
            if (mode != Integer.MIN_VALUE && mode == 0) {
                size = ms.bd.o.Pgl.c.COLLECT_MODE_FINANCE;
            }
            if (mode2 != Integer.MIN_VALUE && mode2 == 0) {
                size2 = ms.bd.o.Pgl.c.COLLECT_MODE_FINANCE;
            }
        }
        setMeasuredDimension(size, size2);
        int i12 = 0;
        boolean z10 = this.B != null && z.z(this);
        int C = z.C(this);
        int childCount = getChildCount();
        int i13 = 0;
        boolean z11 = false;
        boolean z12 = false;
        while (i13 < childCount) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (z10) {
                    int b10 = androidx.core.view.e.b(eVar.f2861a, C);
                    if (z.z(childAt)) {
                        if (Build.VERSION.SDK_INT >= 21) {
                            WindowInsets windowInsets = (WindowInsets) this.B;
                            if (b10 == 3) {
                                windowInsets = windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), i12, windowInsets.getSystemWindowInsetBottom());
                            } else if (b10 == 5) {
                                windowInsets = windowInsets.replaceSystemWindowInsets(i12, windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
                            }
                            childAt.dispatchApplyWindowInsets(windowInsets);
                        }
                    } else if (Build.VERSION.SDK_INT >= 21) {
                        WindowInsets windowInsets2 = (WindowInsets) this.B;
                        if (b10 == 3) {
                            windowInsets2 = windowInsets2.replaceSystemWindowInsets(windowInsets2.getSystemWindowInsetLeft(), windowInsets2.getSystemWindowInsetTop(), i12, windowInsets2.getSystemWindowInsetBottom());
                        } else if (b10 == 5) {
                            windowInsets2 = windowInsets2.replaceSystemWindowInsets(i12, windowInsets2.getSystemWindowInsetTop(), windowInsets2.getSystemWindowInsetRight(), windowInsets2.getSystemWindowInsetBottom());
                        }
                        ((ViewGroup.MarginLayoutParams) eVar).leftMargin = windowInsets2.getSystemWindowInsetLeft();
                        ((ViewGroup.MarginLayoutParams) eVar).topMargin = windowInsets2.getSystemWindowInsetTop();
                        ((ViewGroup.MarginLayoutParams) eVar).rightMargin = windowInsets2.getSystemWindowInsetRight();
                        ((ViewGroup.MarginLayoutParams) eVar).bottomMargin = windowInsets2.getSystemWindowInsetBottom();
                    }
                }
                if (B(childAt)) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec((size - ((ViewGroup.MarginLayoutParams) eVar).leftMargin) - ((ViewGroup.MarginLayoutParams) eVar).rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec((size2 - ((ViewGroup.MarginLayoutParams) eVar).topMargin) - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin, 1073741824));
                } else if (D(childAt)) {
                    if (N) {
                        float w10 = z.w(childAt);
                        float f10 = this.f2829b;
                        if (w10 != f10) {
                            z.y0(childAt, f10);
                        }
                    }
                    int t10 = t(childAt) & 7;
                    boolean z13 = t10 == 3;
                    if ((z13 && z11) || (!z13 && z12)) {
                        throw new IllegalStateException("Child drawer has absolute gravity " + w(t10) + " but this DrawerLayout already has a drawer view along that edge");
                    }
                    if (z13) {
                        z11 = true;
                    } else {
                        z12 = true;
                    }
                    childAt.measure(ViewGroup.getChildMeasureSpec(i10, this.f2830c + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin, ((ViewGroup.MarginLayoutParams) eVar).width), ViewGroup.getChildMeasureSpec(i11, ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin, ((ViewGroup.MarginLayoutParams) eVar).height));
                    i13++;
                    i12 = 0;
                } else {
                    throw new IllegalStateException("Child " + childAt + " at index " + i13 + " does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY");
                }
            }
            i13++;
            i12 = 0;
        }
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        View n10;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.c());
        int i10 = savedState.f2854c;
        if (i10 != 0 && (n10 = n(i10)) != null) {
            K(n10);
        }
        int i11 = savedState.f2855d;
        if (i11 != 3) {
            R(i11, 3);
        }
        int i12 = savedState.f2856e;
        if (i12 != 3) {
            R(i12, 5);
        }
        int i13 = savedState.f2857f;
        if (i13 != 3) {
            R(i13, 8388611);
        }
        int i14 = savedState.f2858g;
        if (i14 != 3) {
            R(i14, 8388613);
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i10) {
        P();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            e eVar = (e) getChildAt(i10).getLayoutParams();
            int i11 = eVar.f2864d;
            boolean z10 = i11 == 1;
            boolean z11 = i11 == 2;
            if (z10 || z11) {
                savedState.f2854c = eVar.f2861a;
                break;
            }
        }
        savedState.f2855d = this.f2841n;
        savedState.f2856e = this.f2842o;
        savedState.f2857f = this.f2843p;
        savedState.f2858g = this.f2844q;
        return savedState;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005b, code lost:
        if (r(r7) != 2) goto L19;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            m0.c r0 = r6.f2834g
            r0.E(r7)
            m0.c r0 = r6.f2835h
            r0.E(r7)
            int r0 = r7.getAction()
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L62
            if (r0 == r2) goto L20
            r7 = 3
            if (r0 == r7) goto L1a
            goto L70
        L1a:
            r6.i(r2)
            r6.f2845r = r1
            goto L70
        L20:
            float r0 = r7.getX()
            float r7 = r7.getY()
            m0.c r3 = r6.f2834g
            int r4 = (int) r0
            int r5 = (int) r7
            android.view.View r3 = r3.t(r4, r5)
            if (r3 == 0) goto L5d
            boolean r3 = r6.B(r3)
            if (r3 == 0) goto L5d
            float r3 = r6.f2848u
            float r0 = r0 - r3
            float r3 = r6.f2849v
            float r7 = r7 - r3
            m0.c r3 = r6.f2834g
            int r3 = r3.y()
            float r0 = r0 * r0
            float r7 = r7 * r7
            float r0 = r0 + r7
            int r3 = r3 * r3
            float r7 = (float) r3
            int r7 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r7 >= 0) goto L5d
            android.view.View r7 = r6.o()
            if (r7 == 0) goto L5d
            int r7 = r6.r(r7)
            r0 = 2
            if (r7 != r0) goto L5e
        L5d:
            r1 = 1
        L5e:
            r6.i(r1)
            goto L70
        L62:
            float r0 = r7.getX()
            float r7 = r7.getY()
            r6.f2848u = r0
            r6.f2849v = r7
            r6.f2845r = r1
        L70:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    View p() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (D(childAt) && E(childAt)) {
                return childAt;
            }
        }
        return null;
    }

    public int q(int i10) {
        int C = z.C(this);
        if (i10 == 3) {
            int i11 = this.f2841n;
            if (i11 != 3) {
                return i11;
            }
            int i12 = C == 0 ? this.f2843p : this.f2844q;
            if (i12 != 3) {
                return i12;
            }
            return 0;
        } else if (i10 == 5) {
            int i13 = this.f2842o;
            if (i13 != 3) {
                return i13;
            }
            int i14 = C == 0 ? this.f2844q : this.f2843p;
            if (i14 != 3) {
                return i14;
            }
            return 0;
        } else if (i10 == 8388611) {
            int i15 = this.f2843p;
            if (i15 != 3) {
                return i15;
            }
            int i16 = C == 0 ? this.f2841n : this.f2842o;
            if (i16 != 3) {
                return i16;
            }
            return 0;
        } else if (i10 != 8388613) {
            return 0;
        } else {
            int i17 = this.f2844q;
            if (i17 != 3) {
                return i17;
            }
            int i18 = C == 0 ? this.f2842o : this.f2841n;
            if (i18 != 3) {
                return i18;
            }
            return 0;
        }
    }

    public int r(View view) {
        if (D(view)) {
            return q(((e) view.getLayoutParams()).f2861a);
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        super.requestDisallowInterceptTouchEvent(z10);
        if (z10) {
            i(true);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.f2839l) {
            return;
        }
        super.requestLayout();
    }

    public CharSequence s(int i10) {
        int b10 = androidx.core.view.e.b(i10, z.C(this));
        if (b10 == 3) {
            return this.f2853z;
        }
        if (b10 == 5) {
            return this.A;
        }
        return null;
    }

    public void setDrawerElevation(float f10) {
        this.f2829b = f10;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (D(childAt)) {
                z.y0(childAt, this.f2829b);
            }
        }
    }

    @Deprecated
    public void setDrawerListener(d dVar) {
        d dVar2 = this.f2846s;
        if (dVar2 != null) {
            M(dVar2);
        }
        if (dVar != null) {
            a(dVar);
        }
        this.f2846s = dVar;
    }

    public void setDrawerLockMode(int i10) {
        R(i10, 3);
        R(i10, 5);
    }

    public void setScrimColor(int i10) {
        this.f2831d = i10;
        invalidate();
    }

    public void setStatusBarBackground(Drawable drawable) {
        this.f2850w = drawable;
        invalidate();
    }

    public void setStatusBarBackgroundColor(int i10) {
        this.f2850w = new ColorDrawable(i10);
        invalidate();
    }

    int t(View view) {
        return androidx.core.view.e.b(((e) view.getLayoutParams()).f2861a, z.C(this));
    }

    float u(View view) {
        return ((e) view.getLayoutParams()).f2862b;
    }

    public DrawerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    public DrawerLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f2828a = new c();
        this.f2831d = -1728053248;
        this.f2833f = new Paint();
        this.f2840m = true;
        this.f2841n = 3;
        this.f2842o = 3;
        this.f2843p = 3;
        this.f2844q = 3;
        this.D = null;
        this.E = null;
        this.F = null;
        this.G = null;
        setDescendantFocusability(262144);
        float f10 = getResources().getDisplayMetrics().density;
        this.f2830c = (int) ((64.0f * f10) + 0.5f);
        float f11 = 400.0f * f10;
        f fVar = new f(3);
        this.f2836i = fVar;
        f fVar2 = new f(5);
        this.f2837j = fVar2;
        m0.c n10 = m0.c.n(this, 1.0f, fVar);
        this.f2834g = n10;
        n10.K(1);
        n10.L(f11);
        fVar.q(n10);
        m0.c n11 = m0.c.n(this, 1.0f, fVar2);
        this.f2835h = n11;
        n11.K(2);
        n11.L(f11);
        fVar2.q(n11);
        setFocusableInTouchMode(true);
        z.A0(this, 1);
        z.q0(this, new b());
        setMotionEventSplittingEnabled(false);
        if (z.z(this)) {
            if (Build.VERSION.SDK_INT >= 21) {
                setOnApplyWindowInsetsListener(new a(this));
                setSystemUiVisibility(1280);
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(K);
                try {
                    this.f2850w = obtainStyledAttributes.getDrawable(0);
                } finally {
                    obtainStyledAttributes.recycle();
                }
            } else {
                this.f2850w = null;
            }
        }
        this.f2829b = f10 * 10.0f;
        this.H = new ArrayList<>();
    }

    public void setStatusBarBackground(int i10) {
        this.f2850w = i10 != 0 ? androidx.core.content.b.f(getContext(), i10) : null;
        invalidate();
    }

    /* loaded from: classes.dex */
    public static class e extends ViewGroup.MarginLayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public int f2861a;

        /* renamed from: b  reason: collision with root package name */
        float f2862b;

        /* renamed from: c  reason: collision with root package name */
        boolean f2863c;

        /* renamed from: d  reason: collision with root package name */
        int f2864d;

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f2861a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, DrawerLayout.L);
            this.f2861a = obtainStyledAttributes.getInt(0, 0);
            obtainStyledAttributes.recycle();
        }

        public e(int i10, int i11) {
            super(i10, i11);
            this.f2861a = 0;
        }

        public e(e eVar) {
            super((ViewGroup.MarginLayoutParams) eVar);
            this.f2861a = 0;
            this.f2861a = eVar.f2861a;
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f2861a = 0;
        }

        public e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f2861a = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        int f2854c;

        /* renamed from: d  reason: collision with root package name */
        int f2855d;

        /* renamed from: e  reason: collision with root package name */
        int f2856e;

        /* renamed from: f  reason: collision with root package name */
        int f2857f;

        /* renamed from: g  reason: collision with root package name */
        int f2858g;

        /* loaded from: classes.dex */
        static class a implements Parcelable.ClassLoaderCreator<SavedState> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
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
            this.f2854c = 0;
            this.f2854c = parcel.readInt();
            this.f2855d = parcel.readInt();
            this.f2856e = parcel.readInt();
            this.f2857f = parcel.readInt();
            this.f2858g = parcel.readInt();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f2854c);
            parcel.writeInt(this.f2855d);
            parcel.writeInt(this.f2856e);
            parcel.writeInt(this.f2857f);
            parcel.writeInt(this.f2858g);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
            this.f2854c = 0;
        }
    }
}
