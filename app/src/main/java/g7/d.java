package g7;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.HorizontalScrollView;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
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
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: ReactHorizontalScrollView.java */
/* loaded from: classes.dex */
public class d extends HorizontalScrollView implements u, d.a, z, f.d, f.c {
    private static boolean I = false;
    private static Field L;
    private boolean A;
    private int B;
    private int C;
    private final com.facebook.react.uimanager.d D;
    private final f.C0394f E;
    private final ValueAnimator F;
    private s G;
    private final Rect H;

    /* renamed from: a  reason: collision with root package name */
    private int f30604a;

    /* renamed from: b  reason: collision with root package name */
    private final g7.b f30605b;

    /* renamed from: c  reason: collision with root package name */
    private final OverScroller f30606c;

    /* renamed from: d  reason: collision with root package name */
    private final h f30607d;

    /* renamed from: e  reason: collision with root package name */
    private final Rect f30608e;

    /* renamed from: f  reason: collision with root package name */
    private final Rect f30609f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f30610g;

    /* renamed from: h  reason: collision with root package name */
    private Rect f30611h;

    /* renamed from: i  reason: collision with root package name */
    private String f30612i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f30613j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f30614k;

    /* renamed from: l  reason: collision with root package name */
    private Runnable f30615l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f30616m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f30617n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f30618o;

    /* renamed from: p  reason: collision with root package name */
    private g7.a f30619p;

    /* renamed from: q  reason: collision with root package name */
    private String f30620q;

    /* renamed from: r  reason: collision with root package name */
    private Drawable f30621r;

    /* renamed from: s  reason: collision with root package name */
    private int f30622s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f30623t;

    /* renamed from: u  reason: collision with root package name */
    private int f30624u;

    /* renamed from: v  reason: collision with root package name */
    private List<Integer> f30625v;

    /* renamed from: w  reason: collision with root package name */
    private boolean f30626w;

    /* renamed from: x  reason: collision with root package name */
    private boolean f30627x;

    /* renamed from: y  reason: collision with root package name */
    private int f30628y;

    /* renamed from: z  reason: collision with root package name */
    private com.facebook.react.views.view.f f30629z;
    private static String J = d.class.getSimpleName();
    private static int K = RecyclerView.UNDEFINED_DURATION;
    private static boolean M = false;

    /* compiled from: ReactHorizontalScrollView.java */
    /* loaded from: classes.dex */
    class a extends androidx.core.view.a {
        a() {
        }

        @Override // androidx.core.view.a
        public void f(View view, AccessibilityEvent accessibilityEvent) {
            super.f(view, accessibilityEvent);
            accessibilityEvent.setScrollable(d.this.f30617n);
        }

        @Override // androidx.core.view.a
        public void g(View view, i0.c cVar) {
            super.g(view, cVar);
            cVar.v0(d.this.f30617n);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ReactHorizontalScrollView.java */
    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private boolean f30631a = false;

        /* renamed from: b  reason: collision with root package name */
        private boolean f30632b = true;

        /* renamed from: c  reason: collision with root package name */
        private int f30633c = 0;

        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (d.this.f30610g) {
                d.this.f30610g = false;
                this.f30633c = 0;
                this.f30632b = true;
            } else {
                f.q(d.this);
                int i10 = this.f30633c + 1;
                this.f30633c = i10;
                this.f30632b = i10 < 3;
                if (!d.this.f30614k || this.f30631a) {
                    if (d.this.f30618o) {
                        f.h(d.this);
                    }
                    d.this.m();
                } else {
                    this.f30631a = true;
                    d.this.p(0);
                    androidx.core.view.z.j0(d.this, this, 20L);
                }
            }
            if (!this.f30632b) {
                d.this.f30615l = null;
            } else {
                androidx.core.view.z.j0(d.this, this, 20L);
            }
        }
    }

    public d(Context context, g7.a aVar) {
        super(context);
        this.f30604a = K;
        this.f30605b = new g7.b();
        this.f30607d = new h();
        this.f30608e = new Rect();
        this.f30609f = new Rect();
        this.f30612i = "hidden";
        this.f30614k = false;
        this.f30617n = true;
        this.f30619p = null;
        this.f30622s = 0;
        this.f30623t = false;
        this.f30624u = 0;
        this.f30626w = true;
        this.f30627x = true;
        this.f30628y = 0;
        this.A = false;
        this.B = -1;
        this.C = -1;
        this.D = new com.facebook.react.uimanager.d();
        this.F = ObjectAnimator.ofInt(this, "scrollX", 0, 0);
        this.G = s.AUTO;
        this.H = new Rect();
        this.f30629z = new com.facebook.react.views.view.f(this);
        this.f30619p = aVar;
        androidx.core.view.z.q0(this, new a());
        this.f30606c = getOverScrollerFromParent();
        this.E = new f.C0394f(s6.a.d().g(context) ? 1 : 0);
    }

    private void A(View view) {
        int s10 = s(view);
        if (s10 != 0) {
            scrollBy(s10, 0);
        }
    }

    private void E(int i10, int i11) {
        if (I) {
            z3.a.r(J, "setPendingContentOffsets[%d] x %d y %d", Integer.valueOf(getId()), Integer.valueOf(i10), Integer.valueOf(i11));
        }
        View contentView = getContentView();
        if (contentView != null && contentView.getWidth() != 0 && contentView.getHeight() != 0) {
            this.B = -1;
            this.C = -1;
            return;
        }
        this.B = i10;
        this.C = i11;
    }

    private void F(int i10) {
        if (I) {
            z3.a.q(J, "smoothScrollAndSnap[%d] velocity %d", Integer.valueOf(getId()), Integer.valueOf(i10));
        }
        double snapInterval = getSnapInterval();
        double k10 = f.k(this, getScrollX(), getReactScrollViewScrollState().b().x, i10);
        double d10 = k10 / snapInterval;
        int floor = (int) Math.floor(d10);
        int ceil = (int) Math.ceil(d10);
        int round = (int) Math.round(d10);
        int round2 = (int) Math.round(y(i10) / snapInterval);
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
            this.f30610g = true;
            z((int) d11, getScrollY());
        }
    }

    private void G(int i10) {
        if (I) {
            z3.a.q(J, "smoothScrollToNextPage[%d] direction %d", Integer.valueOf(getId()), Integer.valueOf(i10));
        }
        int width = getWidth();
        int scrollX = getScrollX();
        int i11 = scrollX / width;
        if (scrollX % width != 0) {
            i11++;
        }
        int i12 = i10 == 17 ? i11 - 1 : i11 + 1;
        if (i12 < 0) {
            i12 = 0;
        }
        z(i12 * width, getScrollY());
        t(0, 0);
    }

    private View getContentView() {
        return getChildAt(0);
    }

    private OverScroller getOverScrollerFromParent() {
        if (!M) {
            M = true;
            try {
                Field declaredField = HorizontalScrollView.class.getDeclaredField("mScroller");
                L = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                z3.a.G(J, "Failed to get mScroller field for HorizontalScrollView! This app will exhibit the bounce-back scrolling bug :(");
            }
        }
        Field field = L;
        OverScroller overScroller = null;
        if (field != null) {
            try {
                Object obj = field.get(this);
                if (obj instanceof OverScroller) {
                    overScroller = (OverScroller) obj;
                } else {
                    z3.a.G(J, "Failed to cast mScroller field in HorizontalScrollView (probably due to OEM changes to AOSP)! This app will exhibit the bounce-back scrolling bug :(");
                }
            } catch (IllegalAccessException e10) {
                throw new RuntimeException("Failed to get mScroller from HorizontalScrollView!", e10);
            }
        }
        return overScroller;
    }

    private int getSnapInterval() {
        int i10 = this.f30624u;
        return i10 != 0 ? i10 : getWidth();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        if (w()) {
            f6.a.c(this.f30619p);
            f6.a.c(this.f30620q);
            this.f30619p.b(this.f30620q);
        }
    }

    private void n() {
        if (w()) {
            f6.a.c(this.f30619p);
            f6.a.c(this.f30620q);
            this.f30619p.a(this.f30620q);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p(int i10) {
        int i11;
        int floor;
        int min;
        int i12;
        int i13;
        OverScroller overScroller;
        if (I) {
            z3.a.q(J, "smoothScrollAndSnap[%d] velocityX %d", Integer.valueOf(getId()), Integer.valueOf(i10));
        }
        if (getChildCount() <= 0) {
            return;
        }
        if (this.f30624u == 0 && this.f30625v == null && this.f30628y == 0) {
            F(i10);
            return;
        }
        boolean z10 = getFlingAnimator() != this.F;
        int max = Math.max(0, computeHorizontalScrollRange() - getWidth());
        int y10 = y(i10);
        if (this.f30623t) {
            y10 = getScrollX();
        }
        int width = (getWidth() - androidx.core.view.z.H(this)) - androidx.core.view.z.G(this);
        int f10 = getReactScrollViewScrollState().f();
        if (f10 == 1) {
            y10 = max - y10;
            i11 = -i10;
        } else {
            i11 = i10;
        }
        List<Integer> list = this.f30625v;
        if (list != null && !list.isEmpty()) {
            i13 = this.f30625v.get(0).intValue();
            List<Integer> list2 = this.f30625v;
            i12 = list2.get(list2.size() - 1).intValue();
            min = max;
            floor = 0;
            for (int i14 = 0; i14 < this.f30625v.size(); i14++) {
                int intValue = this.f30625v.get(i14).intValue();
                if (intValue <= y10 && y10 - intValue < y10 - floor) {
                    floor = intValue;
                }
                if (intValue >= y10 && intValue - y10 < min - y10) {
                    min = intValue;
                }
            }
        } else {
            int i15 = this.f30628y;
            if (i15 != 0) {
                int i16 = this.f30624u;
                if (i16 > 0) {
                    double d10 = y10 / i16;
                    double floor2 = Math.floor(d10);
                    int i17 = this.f30624u;
                    floor = Math.max(r(i15, (int) (floor2 * i17), i17, width), 0);
                    int i18 = this.f30628y;
                    double ceil = Math.ceil(d10);
                    int i19 = this.f30624u;
                    min = Math.min(r(i18, (int) (ceil * i19), i19, width), max);
                } else {
                    ViewGroup viewGroup = (ViewGroup) getContentView();
                    int i20 = max;
                    int i21 = i20;
                    int i22 = 0;
                    int i23 = 0;
                    for (int i24 = 0; i24 < viewGroup.getChildCount(); i24++) {
                        View childAt = viewGroup.getChildAt(i24);
                        int r10 = r(this.f30628y, childAt.getLeft(), childAt.getWidth(), width);
                        if (r10 <= y10 && y10 - r10 < y10 - i22) {
                            i22 = r10;
                        }
                        if (r10 >= y10 && r10 - y10 < i21 - y10) {
                            i21 = r10;
                        }
                        i20 = Math.min(i20, r10);
                        i23 = Math.max(i23, r10);
                    }
                    int max2 = Math.max(i22, i20);
                    min = Math.min(i21, i23);
                    i12 = max;
                    floor = max2;
                    i13 = 0;
                }
            } else {
                double snapInterval = getSnapInterval();
                double d11 = y10 / snapInterval;
                floor = (int) (Math.floor(d11) * snapInterval);
                min = Math.min((int) (Math.ceil(d11) * snapInterval), max);
            }
            i12 = max;
            i13 = 0;
        }
        int i25 = y10 - floor;
        int i26 = min - y10;
        int i27 = Math.abs(i25) < Math.abs(i26) ? floor : min;
        int scrollX = getScrollX();
        if (f10 == 1) {
            scrollX = max - scrollX;
        }
        if (this.f30627x || y10 < i12) {
            if (this.f30626w || y10 > i13) {
                if (i11 > 0) {
                    if (!z10) {
                        i11 += (int) (i26 * 10.0d);
                    }
                    y10 = min;
                } else if (i11 < 0) {
                    if (!z10) {
                        i11 -= (int) (i25 * 10.0d);
                    }
                    y10 = floor;
                } else {
                    y10 = i27;
                }
            } else if (scrollX > i13) {
                y10 = i13;
            }
        } else if (scrollX < i12) {
            y10 = i12;
        }
        int min2 = Math.min(Math.max(0, y10), max);
        if (f10 == 1) {
            min2 = max - min2;
            i11 = -i11;
        }
        int i28 = min2;
        if (!z10 && (overScroller = this.f30606c) != null) {
            this.f30610g = true;
            overScroller.fling(getScrollX(), getScrollY(), i11 != 0 ? i11 : i28 - getScrollX(), 0, i28, i28, 0, 0, (i28 == 0 || i28 == max) ? width / 2 : 0, 0);
            postInvalidateOnAnimation();
            return;
        }
        z(i28, getScrollY());
    }

    private int r(int i10, int i11, int i12, int i13) {
        int i14;
        if (i10 != 1) {
            if (i10 == 2) {
                i14 = (i13 - i12) / 2;
            } else if (i10 != 3) {
                throw new IllegalStateException("Invalid SnapToAlignment value: " + this.f30628y);
            } else {
                i14 = i13 - i12;
            }
            return i11 - i14;
        }
        return i11;
    }

    private int s(View view) {
        view.getDrawingRect(this.H);
        offsetDescendantRectToMyCoords(view, this.H);
        return computeScrollDeltaToGetChildRectOnScreen(this.H);
    }

    private void t(int i10, int i11) {
        if (I) {
            z3.a.r(J, "handlePostTouchScrolling[%d] velocityX %d velocityY %d", Integer.valueOf(getId()), Integer.valueOf(i10), Integer.valueOf(i11));
        }
        if (this.f30615l != null) {
            return;
        }
        if (this.f30618o) {
            f.g(this, i10, i11);
        }
        this.f30610g = false;
        b bVar = new b();
        this.f30615l = bVar;
        androidx.core.view.z.j0(this, bVar, 20L);
    }

    private boolean u(View view) {
        int s10 = s(view);
        view.getDrawingRect(this.H);
        return s10 != 0 && Math.abs(s10) < this.H.width() / 2;
    }

    private boolean v(View view) {
        int s10 = s(view);
        view.getDrawingRect(this.H);
        return s10 != 0 && Math.abs(s10) < this.H.width();
    }

    private boolean w() {
        String str;
        return (this.f30619p == null || (str = this.f30620q) == null || str.isEmpty()) ? false : true;
    }

    private boolean x(View view) {
        return s(view) == 0;
    }

    private int y(int i10) {
        int max = Math.max(0, computeHorizontalScrollRange() - getWidth());
        if (getFlingAnimator() == this.F) {
            return f.n(this, i10, 0, max, 0).x;
        }
        return q(i10) + f.k(this, getScrollX(), getReactScrollViewScrollState().b().x, i10);
    }

    public void B(int i10, float f10, float f11) {
        this.f30629z.c(i10, f10, f11);
    }

    public void C(float f10, int i10) {
        this.f30629z.e(f10, i10);
    }

    public void D(int i10, float f10) {
        this.f30629z.g(i10, f10);
    }

    @Override // g7.f.c
    public void a(int i10, int i11) {
        this.F.cancel();
        this.F.setDuration(f.j(getContext())).setIntValues(i10, i11);
        this.F.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i10, int i11) {
        if (this.f30614k && !this.A) {
            ArrayList arrayList2 = new ArrayList();
            super.addFocusables(arrayList2, i10, i11);
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                View view = (View) it.next();
                if (x(view) || v(view) || view.isFocused()) {
                    arrayList.add(view);
                }
            }
            return;
        }
        super.addFocusables(arrayList, i10, i11);
    }

    @Override // android.widget.HorizontalScrollView
    public boolean arrowScroll(int i10) {
        if (this.f30614k) {
            boolean z10 = true;
            this.A = true;
            if (getChildCount() > 0) {
                View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus(), i10);
                View contentView = getContentView();
                if (contentView != null && findNextFocus != null && findNextFocus.getParent() == contentView) {
                    if (!x(findNextFocus) && !u(findNextFocus)) {
                        G(i10);
                    }
                    findNextFocus.requestFocus();
                } else {
                    G(i10);
                }
            } else {
                z10 = false;
            }
            this.A = false;
            return z10;
        }
        return super.arrowScroll(i10);
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public void draw(Canvas canvas) {
        if (this.f30622s != 0) {
            View contentView = getContentView();
            if (this.f30621r != null && contentView != null && contentView.getRight() < getWidth()) {
                this.f30621r.setBounds(contentView.getRight(), 0, getWidth(), getHeight());
                this.f30621r.draw(canvas);
            }
        }
        super.draw(canvas);
    }

    @Override // com.facebook.react.uimanager.u
    public void e() {
        if (this.f30616m) {
            f6.a.c(this.f30611h);
            v.a(this, this.f30611h);
            View contentView = getContentView();
            if (contentView instanceof u) {
                ((u) contentView).e();
            }
        }
    }

    @Override // android.widget.HorizontalScrollView
    public boolean executeKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (this.f30617n || !(keyCode == 21 || keyCode == 22)) {
            return super.executeKeyEvent(keyEvent);
        }
        return false;
    }

    @Override // com.facebook.react.uimanager.z
    public void f(int i10, int i11, int i12, int i13) {
        this.f30609f.set(i10, i11, i12, i13);
    }

    @Override // android.widget.HorizontalScrollView
    public void fling(int i10) {
        if (I) {
            z3.a.q(J, "fling[%d] velocityX %d", Integer.valueOf(getId()), Integer.valueOf(i10));
        }
        int abs = (int) (Math.abs(i10) * Math.signum(this.f30605b.a()));
        if (this.f30614k) {
            p(abs);
        } else if (this.f30606c != null) {
            this.f30606c.fling(getScrollX(), getScrollY(), abs, 0, 0, Api.BaseClientBuilder.API_PRIORITY_OTHER, 0, 0, ((getWidth() - androidx.core.view.z.H(this)) - androidx.core.view.z.G(this)) / 2, 0);
            androidx.core.view.z.h0(this);
        } else {
            super.fling(abs);
        }
        t(abs, 0);
    }

    @Override // com.facebook.react.uimanager.u
    public void g(Rect rect) {
        rect.set((Rect) f6.a.c(this.f30611h));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean getChildVisibleRect(View view, Rect rect, Point point) {
        return super.getChildVisibleRect(view, rect, point);
    }

    @Override // com.facebook.react.uimanager.d.a
    public com.facebook.react.uimanager.d getFabricViewStateManager() {
        return this.D;
    }

    @Override // g7.f.c
    public ValueAnimator getFlingAnimator() {
        return this.F;
    }

    @Override // com.facebook.react.uimanager.y
    public String getOverflow() {
        return this.f30612i;
    }

    @Override // com.facebook.react.uimanager.z
    public Rect getOverflowInset() {
        return this.f30609f;
    }

    public s getPointerEvents() {
        return this.G;
    }

    @Override // g7.f.d
    public f.C0394f getReactScrollViewScrollState() {
        return this.E;
    }

    @Override // com.facebook.react.uimanager.u
    public boolean getRemoveClippedSubviews() {
        return this.f30616m;
    }

    public void o() {
        awakenScrollBars();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f30616m) {
            e();
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (I) {
            z3.a.p(J, "onDraw[%d]", Integer.valueOf(getId()));
        }
        getDrawingRect(this.f30608e);
        String str = this.f30612i;
        str.hashCode();
        if (!str.equals("visible")) {
            canvas.clipRect(this.f30608e);
        }
        super.onDraw(canvas);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f30617n) {
            if (s.b(this.G)) {
                try {
                    if (super.onInterceptTouchEvent(motionEvent)) {
                        i.a(this, motionEvent);
                        f.b(this);
                        this.f30613j = true;
                        n();
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

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        OverScroller overScroller;
        if (I) {
            z3.a.t(J, "onLayout[%d] l %d t %d r %d b %d", Integer.valueOf(getId()), Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13));
        }
        int i14 = this.f30604a;
        if (i14 != K && (overScroller = this.f30606c) != null && i14 != overScroller.getFinalX() && !this.f30606c.isFinished()) {
            if (I) {
                z3.a.q(J, "onLayout[%d] scroll hack enabled: reset to previous scrollX position of %d", Integer.valueOf(getId()), Integer.valueOf(this.f30604a));
            }
            OverScroller overScroller2 = this.f30606c;
            overScroller2.startScroll(this.f30604a, overScroller2.getFinalY(), 0, 0);
            this.f30606c.forceFinished(true);
            this.f30604a = K;
        }
        int i15 = this.B;
        if (i15 == -1) {
            i15 = getScrollX();
        }
        int i16 = this.C;
        if (i16 == -1) {
            i16 = getScrollY();
        }
        scrollTo(i15, i16);
        f.a(this);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        OverScroller overScroller;
        l.a(i10, i11);
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        if (I) {
            z3.a.r(J, "onMeasure[%d] measured width: %d measured height: %d", Integer.valueOf(getId()), Integer.valueOf(size), Integer.valueOf(size2));
        }
        boolean z10 = getMeasuredHeight() != size2;
        setMeasuredDimension(size, size2);
        if (!z10 || (overScroller = this.f30606c) == null) {
            return;
        }
        this.f30604a = overScroller.getCurrX();
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    protected void onOverScrolled(int i10, int i11, boolean z10, boolean z11) {
        int computeHorizontalScrollRange;
        if (I) {
            z3.a.t(J, "onOverScrolled[%d] scrollX %d scrollY %d clampedX %b clampedY %b", Integer.valueOf(getId()), Integer.valueOf(i10), Integer.valueOf(i11), Boolean.valueOf(z10), Boolean.valueOf(z11));
        }
        OverScroller overScroller = this.f30606c;
        if (overScroller != null && !overScroller.isFinished() && this.f30606c.getCurrX() != this.f30606c.getFinalX() && i10 >= (computeHorizontalScrollRange = computeHorizontalScrollRange() - getWidth())) {
            this.f30606c.abortAnimation();
            i10 = computeHorizontalScrollRange;
        }
        super.onOverScrolled(i10, i11, z10, z11);
    }

    @Override // android.view.View
    protected void onScrollChanged(int i10, int i11, int i12, int i13) {
        if (I) {
            z3.a.t(J, "onScrollChanged[%d] x %d y %d oldx %d oldy %d", Integer.valueOf(getId()), Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13));
        }
        super.onScrollChanged(i10, i11, i12, i13);
        this.f30610g = true;
        if (this.f30605b.c(i10, i11)) {
            if (this.f30616m) {
                e();
            }
            f.s(this, this.f30605b.a(), this.f30605b.b());
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (this.f30616m) {
            e();
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f30617n && s.a(this.G)) {
            this.f30607d.a(motionEvent);
            if ((motionEvent.getAction() & 255) == 1 && this.f30613j) {
                f.q(this);
                float b10 = this.f30607d.b();
                float c10 = this.f30607d.c();
                f.c(this, b10, c10);
                this.f30613j = false;
                t(Math.round(b10), Math.round(c10));
            }
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // android.widget.HorizontalScrollView
    public boolean pageScroll(int i10) {
        boolean pageScroll = super.pageScroll(i10);
        if (this.f30614k && pageScroll) {
            t(0, 0);
        }
        return pageScroll;
    }

    public int q(int i10) {
        return f.n(this, i10, 0, Math.max(0, computeHorizontalScrollRange() - getWidth()), 0).x;
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (view2 != null && !this.f30614k) {
            A(view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public void scrollTo(int i10, int i11) {
        if (I) {
            z3.a.r(J, "scrollTo[%d] x %d y %d", Integer.valueOf(getId()), Integer.valueOf(i10), Integer.valueOf(i11));
        }
        super.scrollTo(i10, i11);
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        f.r(this, scrollX, scrollY);
        E(scrollX, scrollY);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        this.f30629z.b(i10);
    }

    public void setBorderRadius(float f10) {
        this.f30629z.d(f10);
    }

    public void setBorderStyle(String str) {
        this.f30629z.f(str);
    }

    public void setDecelerationRate(float f10) {
        getReactScrollViewScrollState().h(f10);
        OverScroller overScroller = this.f30606c;
        if (overScroller != null) {
            overScroller.setFriction(1.0f - f10);
        }
    }

    public void setDisableIntervalMomentum(boolean z10) {
        this.f30623t = z10;
    }

    public void setEndFillColor(int i10) {
        if (i10 != this.f30622s) {
            this.f30622s = i10;
            this.f30621r = new ColorDrawable(this.f30622s);
        }
    }

    public void setOverflow(String str) {
        this.f30612i = str;
        invalidate();
    }

    public void setPagingEnabled(boolean z10) {
        this.f30614k = z10;
    }

    public void setPointerEvents(s sVar) {
        this.G = sVar;
    }

    public void setRemoveClippedSubviews(boolean z10) {
        if (z10 && this.f30611h == null) {
            this.f30611h = new Rect();
        }
        this.f30616m = z10;
        e();
    }

    public void setScrollEnabled(boolean z10) {
        this.f30617n = z10;
    }

    public void setScrollPerfTag(String str) {
        this.f30620q = str;
    }

    public void setSendMomentumEvents(boolean z10) {
        this.f30618o = z10;
    }

    public void setSnapInterval(int i10) {
        this.f30624u = i10;
    }

    public void setSnapOffsets(List<Integer> list) {
        this.f30625v = list;
    }

    public void setSnapToAlignment(int i10) {
        this.f30628y = i10;
    }

    public void setSnapToEnd(boolean z10) {
        this.f30627x = z10;
    }

    public void setSnapToStart(boolean z10) {
        this.f30626w = z10;
    }

    public void z(int i10, int i11) {
        f.p(this, i10, i11);
        E(i10, i11);
    }
}
