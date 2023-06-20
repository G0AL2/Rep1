package g7;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.OverScroller;
import android.widget.ScrollView;
import com.facebook.react.uimanager.d;
import com.facebook.react.uimanager.events.i;
import com.facebook.react.uimanager.l;
import com.facebook.react.uimanager.s;
import com.facebook.react.uimanager.u;
import com.facebook.react.uimanager.v;
import com.facebook.react.uimanager.z;
import com.google.android.gms.common.api.Api;
import g7.f;
import java.lang.reflect.Field;
import java.util.List;

/* compiled from: ReactScrollView.java */
/* loaded from: classes.dex */
public class e extends ScrollView implements u, ViewGroup.OnHierarchyChangeListener, View.OnLayoutChangeListener, d.a, z, f.d, f.c {
    private static Field G = null;
    private static boolean H = false;
    private int A;
    private int B;
    private final com.facebook.react.uimanager.d C;
    private final f.C0394f D;
    private final ValueAnimator E;
    private s F;

    /* renamed from: a  reason: collision with root package name */
    private final b f30635a;

    /* renamed from: b  reason: collision with root package name */
    private final OverScroller f30636b;

    /* renamed from: c  reason: collision with root package name */
    private final h f30637c;

    /* renamed from: d  reason: collision with root package name */
    private final Rect f30638d;

    /* renamed from: e  reason: collision with root package name */
    private final Rect f30639e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f30640f;

    /* renamed from: g  reason: collision with root package name */
    private Rect f30641g;

    /* renamed from: h  reason: collision with root package name */
    private String f30642h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f30643i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f30644j;

    /* renamed from: k  reason: collision with root package name */
    private Runnable f30645k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f30646l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f30647m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f30648n;

    /* renamed from: o  reason: collision with root package name */
    private g7.a f30649o;

    /* renamed from: p  reason: collision with root package name */
    private String f30650p;

    /* renamed from: q  reason: collision with root package name */
    private Drawable f30651q;

    /* renamed from: r  reason: collision with root package name */
    private int f30652r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f30653s;

    /* renamed from: t  reason: collision with root package name */
    private int f30654t;

    /* renamed from: u  reason: collision with root package name */
    private List<Integer> f30655u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f30656v;

    /* renamed from: w  reason: collision with root package name */
    private boolean f30657w;

    /* renamed from: x  reason: collision with root package name */
    private int f30658x;

    /* renamed from: y  reason: collision with root package name */
    private View f30659y;

    /* renamed from: z  reason: collision with root package name */
    private com.facebook.react.views.view.f f30660z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ReactScrollView.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private boolean f30661a = false;

        /* renamed from: b  reason: collision with root package name */
        private boolean f30662b = true;

        /* renamed from: c  reason: collision with root package name */
        private int f30663c = 0;

        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (e.this.f30640f) {
                e.this.f30640f = false;
                this.f30663c = 0;
                this.f30662b = true;
            } else {
                f.q(e.this);
                int i10 = this.f30663c + 1;
                this.f30663c = i10;
                this.f30662b = i10 < 3;
                if (!e.this.f30644j || this.f30661a) {
                    if (e.this.f30648n) {
                        f.h(e.this);
                    }
                    e.this.l();
                } else {
                    this.f30661a = true;
                    e.this.o(0);
                    androidx.core.view.z.j0(e.this, this, 20L);
                }
            }
            if (!this.f30662b) {
                e.this.f30645k = null;
            } else {
                androidx.core.view.z.j0(e.this, this, 20L);
            }
        }
    }

    public e(Context context, g7.a aVar) {
        super(context);
        this.f30635a = new b();
        this.f30637c = new h();
        this.f30638d = new Rect();
        this.f30639e = new Rect();
        this.f30642h = "hidden";
        this.f30644j = false;
        this.f30647m = true;
        this.f30649o = null;
        this.f30652r = 0;
        this.f30653s = false;
        this.f30654t = 0;
        this.f30656v = true;
        this.f30657w = true;
        this.f30658x = 0;
        this.A = -1;
        this.B = -1;
        this.C = new com.facebook.react.uimanager.d();
        this.D = new f.C0394f(0);
        this.E = ObjectAnimator.ofInt(this, "scrollY", 0, 0);
        this.F = s.AUTO;
        this.f30649o = aVar;
        this.f30660z = new com.facebook.react.views.view.f(this);
        this.f30636b = getOverScrollerFromParent();
        setOnHierarchyChangeListener(this);
        setScrollBarStyle(33554432);
    }

    private void A(int i10) {
        double snapInterval = getSnapInterval();
        double k10 = f.k(this, getScrollY(), getReactScrollViewScrollState().b().y, i10);
        double d10 = k10 / snapInterval;
        int floor = (int) Math.floor(d10);
        int ceil = (int) Math.ceil(d10);
        int round = (int) Math.round(d10);
        int round2 = (int) Math.round(t(i10) / snapInterval);
        if (i10 > 0 && ceil == floor) {
            ceil++;
        } else if (i10 < 0 && floor == ceil) {
            floor--;
        }
        if (i10 > 0 && round < ceil && round2 > floor) {
            round = ceil;
        } else if (i10 < 0 && round > floor && round2 < ceil) {
            round = floor;
        }
        double d11 = round * snapInterval;
        if (d11 != k10) {
            this.f30640f = true;
            u(getScrollX(), (int) d11);
        }
    }

    private void B(int i10) {
        getReactScrollViewScrollState().m(i10);
        f.i(this);
    }

    private View getContentView() {
        return getChildAt(0);
    }

    private int getMaxScrollY() {
        return Math.max(0, this.f30659y.getHeight() - ((getHeight() - getPaddingBottom()) - getPaddingTop()));
    }

    private OverScroller getOverScrollerFromParent() {
        if (!H) {
            H = true;
            try {
                Field declaredField = ScrollView.class.getDeclaredField("mScroller");
                G = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                z3.a.G("ReactNative", "Failed to get mScroller field for ScrollView! This app will exhibit the bounce-back scrolling bug :(");
            }
        }
        Field field = G;
        OverScroller overScroller = null;
        if (field != null) {
            try {
                Object obj = field.get(this);
                if (obj instanceof OverScroller) {
                    overScroller = (OverScroller) obj;
                } else {
                    z3.a.G("ReactNative", "Failed to cast mScroller field in ScrollView (probably due to OEM changes to AOSP)! This app will exhibit the bounce-back scrolling bug :(");
                }
            } catch (IllegalAccessException e10) {
                throw new RuntimeException("Failed to get mScroller from ScrollView!", e10);
            }
        }
        return overScroller;
    }

    private int getSnapInterval() {
        int i10 = this.f30654t;
        return i10 != 0 ? i10 : getHeight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        if (s()) {
            f6.a.c(this.f30649o);
            f6.a.c(this.f30650p);
            this.f30649o.b(this.f30650p);
        }
    }

    private void m() {
        if (s()) {
            f6.a.c(this.f30649o);
            f6.a.c(this.f30650p);
            this.f30649o.a(this.f30650p);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o(int i10) {
        int min;
        int i11;
        int floor;
        int i12;
        int top;
        int top2;
        int height;
        int i13;
        OverScroller overScroller;
        if (getChildCount() <= 0) {
            return;
        }
        if (this.f30654t == 0 && this.f30655u == null && this.f30658x == 0) {
            A(i10);
            return;
        }
        int i14 = 1;
        boolean z10 = getFlingAnimator() != this.E;
        int maxScrollY = getMaxScrollY();
        int t10 = t(i10);
        if (this.f30653s) {
            t10 = getScrollY();
        }
        int height2 = (getHeight() - getPaddingBottom()) - getPaddingTop();
        List<Integer> list = this.f30655u;
        if (list != null) {
            i12 = list.get(0).intValue();
            List<Integer> list2 = this.f30655u;
            i11 = list2.get(list2.size() - 1).intValue();
            min = maxScrollY;
            floor = 0;
            for (int i15 = 0; i15 < this.f30655u.size(); i15++) {
                int intValue = this.f30655u.get(i15).intValue();
                if (intValue <= t10 && t10 - intValue < t10 - floor) {
                    floor = intValue;
                }
                if (intValue >= t10 && intValue - t10 < min - t10) {
                    min = intValue;
                }
            }
        } else {
            int i16 = this.f30658x;
            if (i16 != 0) {
                int i17 = this.f30654t;
                if (i17 > 0) {
                    double d10 = t10 / i17;
                    double floor2 = Math.floor(d10);
                    int i18 = this.f30654t;
                    int max = Math.max(q(i16, (int) (floor2 * i18), i18, height2), 0);
                    int i19 = this.f30658x;
                    double ceil = Math.ceil(d10);
                    int i20 = this.f30654t;
                    min = Math.min(q(i19, (int) (ceil * i20), i20, height2), maxScrollY);
                    i11 = maxScrollY;
                    floor = max;
                } else {
                    ViewGroup viewGroup = (ViewGroup) getContentView();
                    int i21 = maxScrollY;
                    int i22 = i21;
                    int i23 = 0;
                    int i24 = 0;
                    int i25 = 0;
                    while (i23 < viewGroup.getChildCount()) {
                        View childAt = viewGroup.getChildAt(i23);
                        int i26 = this.f30658x;
                        if (i26 != i14) {
                            if (i26 == 2) {
                                top2 = childAt.getTop();
                                height = (height2 - childAt.getHeight()) / 2;
                            } else if (i26 == 3) {
                                top2 = childAt.getTop();
                                height = height2 - childAt.getHeight();
                            } else {
                                throw new IllegalStateException("Invalid SnapToAlignment value: " + this.f30658x);
                            }
                            top = top2 - height;
                        } else {
                            top = childAt.getTop();
                        }
                        if (top <= t10 && t10 - top < t10 - i24) {
                            i24 = top;
                        }
                        if (top >= t10 && top - t10 < i22 - t10) {
                            i22 = top;
                        }
                        i21 = Math.min(i21, top);
                        i25 = Math.max(i25, top);
                        i23++;
                        i14 = 1;
                    }
                    floor = Math.max(i24, i21);
                    min = Math.min(i22, i25);
                    i11 = maxScrollY;
                }
            } else {
                double snapInterval = getSnapInterval();
                double d11 = t10 / snapInterval;
                min = Math.min((int) (Math.ceil(d11) * snapInterval), maxScrollY);
                i11 = maxScrollY;
                floor = (int) (Math.floor(d11) * snapInterval);
            }
            i12 = 0;
        }
        int i27 = t10 - floor;
        int i28 = min - t10;
        int i29 = Math.abs(i27) < Math.abs(i28) ? floor : min;
        if (!this.f30657w && t10 >= i11) {
            if (getScrollY() < i11) {
                i13 = i10;
                t10 = i11;
            }
            i13 = i10;
        } else if (!this.f30656v && t10 <= i12) {
            if (getScrollY() > i12) {
                i13 = i10;
                t10 = i12;
            }
            i13 = i10;
        } else if (i10 > 0) {
            i13 = !z10 ? i10 + ((int) (i28 * 10.0d)) : i10;
            t10 = min;
        } else if (i10 < 0) {
            i13 = !z10 ? i10 - ((int) (i27 * 10.0d)) : i10;
            t10 = floor;
        } else {
            i13 = i10;
            t10 = i29;
        }
        int min2 = Math.min(Math.max(0, t10), maxScrollY);
        if (!z10 && (overScroller = this.f30636b) != null) {
            this.f30640f = true;
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            if (i13 == 0) {
                i13 = min2 - getScrollY();
            }
            overScroller.fling(scrollX, scrollY, 0, i13, 0, 0, min2, min2, 0, (min2 == 0 || min2 == maxScrollY) ? height2 / 2 : 0);
            postInvalidateOnAnimation();
            return;
        }
        u(getScrollX(), min2);
    }

    private int q(int i10, int i11, int i12, int i13) {
        int i14;
        if (i10 != 1) {
            if (i10 == 2) {
                i14 = (i13 - i12) / 2;
            } else if (i10 != 3) {
                throw new IllegalStateException("Invalid SnapToAlignment value: " + this.f30658x);
            } else {
                i14 = i13 - i12;
            }
            return i11 - i14;
        }
        return i11;
    }

    private void r(int i10, int i11) {
        if (this.f30645k != null) {
            return;
        }
        if (this.f30648n) {
            m();
            f.g(this, i10, i11);
        }
        this.f30640f = false;
        a aVar = new a();
        this.f30645k = aVar;
        androidx.core.view.z.j0(this, aVar, 20L);
    }

    private boolean s() {
        String str;
        return (this.f30649o == null || (str = this.f30650p) == null || str.isEmpty()) ? false : true;
    }

    private int t(int i10) {
        if (getFlingAnimator() == this.E) {
            return f.n(this, 0, i10, 0, getMaxScrollY()).y;
        }
        return p(i10) + f.k(this, getScrollY(), getReactScrollViewScrollState().b().y, i10);
    }

    private void v(View view) {
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        int computeScrollDeltaToGetChildRectOnScreen = computeScrollDeltaToGetChildRectOnScreen(rect);
        if (computeScrollDeltaToGetChildRectOnScreen != 0) {
            scrollBy(0, computeScrollDeltaToGetChildRectOnScreen);
        }
    }

    private void z(int i10, int i11) {
        View childAt = getChildAt(0);
        if (childAt != null && childAt.getWidth() != 0 && childAt.getHeight() != 0) {
            this.A = -1;
            this.B = -1;
            return;
        }
        this.A = i10;
        this.B = i11;
    }

    @Override // g7.f.c
    public void a(int i10, int i11) {
        this.E.cancel();
        this.E.setDuration(f.j(getContext())).setIntValues(i10, i11);
        this.E.start();
    }

    @Override // android.widget.ScrollView, android.view.View
    public void draw(Canvas canvas) {
        if (this.f30652r != 0) {
            View childAt = getChildAt(0);
            if (this.f30651q != null && childAt != null && childAt.getBottom() < getHeight()) {
                this.f30651q.setBounds(0, childAt.getBottom(), getWidth(), getHeight());
                this.f30651q.draw(canvas);
            }
        }
        getDrawingRect(this.f30638d);
        String str = this.f30642h;
        str.hashCode();
        if (!str.equals("visible")) {
            canvas.clipRect(this.f30638d);
        }
        super.draw(canvas);
    }

    @Override // com.facebook.react.uimanager.u
    public void e() {
        if (this.f30646l) {
            f6.a.c(this.f30641g);
            v.a(this, this.f30641g);
            View childAt = getChildAt(0);
            if (childAt instanceof u) {
                ((u) childAt).e();
            }
        }
    }

    @Override // android.widget.ScrollView
    public boolean executeKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (this.f30647m || !(keyCode == 19 || keyCode == 20)) {
            return super.executeKeyEvent(keyEvent);
        }
        return false;
    }

    @Override // com.facebook.react.uimanager.z
    public void f(int i10, int i11, int i12, int i13) {
        this.f30639e.set(i10, i11, i12, i13);
    }

    @Override // android.widget.ScrollView
    public void fling(int i10) {
        float signum = Math.signum(this.f30635a.b());
        if (signum == 0.0f) {
            signum = Math.signum(i10);
        }
        int abs = (int) (Math.abs(i10) * signum);
        if (this.f30644j) {
            o(abs);
        } else if (this.f30636b != null) {
            this.f30636b.fling(getScrollX(), getScrollY(), 0, abs, 0, 0, 0, Api.BaseClientBuilder.API_PRIORITY_OTHER, 0, ((getHeight() - getPaddingBottom()) - getPaddingTop()) / 2);
            androidx.core.view.z.h0(this);
        } else {
            super.fling(abs);
        }
        r(0, abs);
    }

    @Override // com.facebook.react.uimanager.u
    public void g(Rect rect) {
        rect.set((Rect) f6.a.c(this.f30641g));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean getChildVisibleRect(View view, Rect rect, Point point) {
        return super.getChildVisibleRect(view, rect, point);
    }

    @Override // com.facebook.react.uimanager.d.a
    public com.facebook.react.uimanager.d getFabricViewStateManager() {
        return this.C;
    }

    @Override // g7.f.c
    public ValueAnimator getFlingAnimator() {
        return this.E;
    }

    @Override // com.facebook.react.uimanager.y
    public String getOverflow() {
        return this.f30642h;
    }

    @Override // com.facebook.react.uimanager.z
    public Rect getOverflowInset() {
        return this.f30639e;
    }

    public s getPointerEvents() {
        return this.F;
    }

    @Override // g7.f.d
    public f.C0394f getReactScrollViewScrollState() {
        return this.D;
    }

    @Override // com.facebook.react.uimanager.u
    public boolean getRemoveClippedSubviews() {
        return this.f30646l;
    }

    public void n() {
        awakenScrollBars();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f30646l) {
            e();
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public void onChildViewAdded(View view, View view2) {
        this.f30659y = view2;
        view2.addOnLayoutChangeListener(this);
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public void onChildViewRemoved(View view, View view2) {
        this.f30659y.removeOnLayoutChangeListener(this);
        this.f30659y = null;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        String str = (String) getTag(com.facebook.react.g.f15406k);
        if (str != null) {
            accessibilityNodeInfo.setViewIdResourceName(str);
        }
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f30647m) {
            if (s.b(this.F)) {
                try {
                    if (super.onInterceptTouchEvent(motionEvent)) {
                        i.a(this, motionEvent);
                        f.b(this);
                        this.f30643i = true;
                        m();
                        getFlingAnimator().cancel();
                        return true;
                    }
                } catch (IllegalArgumentException e10) {
                    z3.a.H("ReactNative", "Error intercepting touch event.", e10);
                }
                return false;
            }
            return true;
        }
        return false;
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14 = this.A;
        if (i14 == -1) {
            i14 = getScrollX();
        }
        int i15 = this.B;
        if (i15 == -1) {
            i15 = getScrollY();
        }
        scrollTo(i14, i15);
        f.a(this);
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        if (this.f30659y == null) {
            return;
        }
        int scrollY = getScrollY();
        int maxScrollY = getMaxScrollY();
        if (scrollY > maxScrollY) {
            scrollTo(getScrollX(), maxScrollY);
        }
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        l.a(i10, i11);
        setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
    }

    @Override // android.widget.ScrollView, android.view.View
    protected void onOverScrolled(int i10, int i11, boolean z10, boolean z11) {
        int maxScrollY;
        OverScroller overScroller = this.f30636b;
        if (overScroller != null && this.f30659y != null && !overScroller.isFinished() && this.f30636b.getCurrY() != this.f30636b.getFinalY() && i11 >= (maxScrollY = getMaxScrollY())) {
            this.f30636b.abortAnimation();
            i11 = maxScrollY;
        }
        super.onOverScrolled(i10, i11, z10, z11);
    }

    @Override // android.view.View
    protected void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        this.f30640f = true;
        if (this.f30635a.c(i10, i11)) {
            if (this.f30646l) {
                e();
            }
            f.s(this, this.f30635a.a(), this.f30635a.b());
        }
    }

    @Override // android.widget.ScrollView, android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (this.f30646l) {
            e();
        }
    }

    @Override // android.widget.ScrollView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f30647m && s.a(this.F)) {
            this.f30637c.a(motionEvent);
            if ((motionEvent.getAction() & 255) == 1 && this.f30643i) {
                f.q(this);
                float b10 = this.f30637c.b();
                float c10 = this.f30637c.c();
                f.c(this, b10, c10);
                this.f30643i = false;
                r(Math.round(b10), Math.round(c10));
            }
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public int p(int i10) {
        return f.n(this, 0, i10, 0, getMaxScrollY()).y;
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (view2 != null) {
            v(view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.widget.ScrollView, android.view.View
    public void scrollTo(int i10, int i11) {
        super.scrollTo(i10, i11);
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        f.r(this, scrollX, scrollY);
        z(scrollX, scrollY);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        this.f30660z.b(i10);
    }

    public void setBorderRadius(float f10) {
        this.f30660z.d(f10);
    }

    public void setBorderStyle(String str) {
        this.f30660z.f(str);
    }

    public void setDecelerationRate(float f10) {
        getReactScrollViewScrollState().h(f10);
        OverScroller overScroller = this.f30636b;
        if (overScroller != null) {
            overScroller.setFriction(1.0f - f10);
        }
    }

    public void setDisableIntervalMomentum(boolean z10) {
        this.f30653s = z10;
    }

    public void setEndFillColor(int i10) {
        if (i10 != this.f30652r) {
            this.f30652r = i10;
            this.f30651q = new ColorDrawable(this.f30652r);
        }
    }

    public void setOverflow(String str) {
        this.f30642h = str;
        invalidate();
    }

    public void setPagingEnabled(boolean z10) {
        this.f30644j = z10;
    }

    public void setPointerEvents(s sVar) {
        this.F = sVar;
    }

    public void setRemoveClippedSubviews(boolean z10) {
        if (z10 && this.f30641g == null) {
            this.f30641g = new Rect();
        }
        this.f30646l = z10;
        e();
    }

    public void setScrollAwayTopPaddingEnabledUnstable(int i10) {
        int childCount = getChildCount();
        f6.a.b(childCount == 1, "React Native ScrollView always has exactly 1 child; a content View");
        if (childCount > 0) {
            for (int i11 = 0; i11 < childCount; i11++) {
                getChildAt(i11).setTranslationY(i10);
            }
            setPadding(0, 0, 0, i10);
        }
        B(i10);
        setRemoveClippedSubviews(this.f30646l);
    }

    public void setScrollEnabled(boolean z10) {
        this.f30647m = z10;
    }

    public void setScrollPerfTag(String str) {
        this.f30650p = str;
    }

    public void setSendMomentumEvents(boolean z10) {
        this.f30648n = z10;
    }

    public void setSnapInterval(int i10) {
        this.f30654t = i10;
    }

    public void setSnapOffsets(List<Integer> list) {
        this.f30655u = list;
    }

    public void setSnapToAlignment(int i10) {
        this.f30658x = i10;
    }

    public void setSnapToEnd(boolean z10) {
        this.f30657w = z10;
    }

    public void setSnapToStart(boolean z10) {
        this.f30656v = z10;
    }

    public void u(int i10, int i11) {
        f.p(this, i10, i11);
        z(i10, i11);
    }

    public void w(int i10, float f10, float f11) {
        this.f30660z.c(i10, f10, f11);
    }

    public void x(float f10, int i10) {
        this.f30660z.e(f10, i10);
    }

    public void y(int i10, float f10) {
        this.f30660z.g(i10, f10);
    }
}
