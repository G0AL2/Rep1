package com.facebook.react.views.view;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.config.ReactFeatureFlags;
import com.facebook.react.uimanager.a0;
import com.facebook.react.uimanager.h0;
import com.facebook.react.uimanager.i0;
import com.facebook.react.uimanager.j0;
import com.facebook.react.uimanager.l;
import com.facebook.react.uimanager.s;
import com.facebook.react.uimanager.u;
import com.facebook.react.uimanager.v;
import com.facebook.react.uimanager.z;
import com.facebook.react.uimanager.z0;
import com.facebook.react.views.view.e;

/* compiled from: ReactViewGroup.java */
@TargetApi(21)
/* loaded from: classes.dex */
public class g extends ViewGroup implements v6.d, u, a0, v6.c, h0, z {

    /* renamed from: r  reason: collision with root package name */
    private static final ViewGroup.LayoutParams f16429r = new ViewGroup.LayoutParams(0, 0);

    /* renamed from: s  reason: collision with root package name */
    private static final Rect f16430s = new Rect();

    /* renamed from: a  reason: collision with root package name */
    private final Rect f16431a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f16432b;

    /* renamed from: c  reason: collision with root package name */
    private View[] f16433c;

    /* renamed from: d  reason: collision with root package name */
    private int f16434d;

    /* renamed from: e  reason: collision with root package name */
    private Rect f16435e;

    /* renamed from: f  reason: collision with root package name */
    private Rect f16436f;

    /* renamed from: g  reason: collision with root package name */
    private String f16437g;

    /* renamed from: h  reason: collision with root package name */
    private s f16438h;

    /* renamed from: i  reason: collision with root package name */
    private b f16439i;

    /* renamed from: j  reason: collision with root package name */
    private e f16440j;

    /* renamed from: k  reason: collision with root package name */
    private v6.b f16441k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f16442l;

    /* renamed from: m  reason: collision with root package name */
    private z0 f16443m;

    /* renamed from: n  reason: collision with root package name */
    private Path f16444n;

    /* renamed from: o  reason: collision with root package name */
    private int f16445o;

    /* renamed from: p  reason: collision with root package name */
    private float f16446p;

    /* renamed from: q  reason: collision with root package name */
    private String f16447q;

    /* compiled from: ReactViewGroup.java */
    /* loaded from: classes.dex */
    class a implements Runnable {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ReactViewGroup.java */
    /* loaded from: classes.dex */
    public static final class b implements View.OnLayoutChangeListener {

        /* renamed from: a  reason: collision with root package name */
        private final g f16448a;

        /* synthetic */ b(g gVar, a aVar) {
            this(gVar);
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            if (this.f16448a.getRemoveClippedSubviews()) {
                this.f16448a.z(view);
            }
        }

        private b(g gVar) {
            this.f16448a = gVar;
        }
    }

    public g(Context context) {
        super(context);
        this.f16431a = new Rect();
        this.f16432b = false;
        this.f16433c = null;
        this.f16438h = s.AUTO;
        this.f16442l = false;
        this.f16443m = null;
        this.f16446p = 1.0f;
        this.f16447q = "visible";
        setClipChildren(false);
    }

    private z0 getDrawingOrderHelper() {
        if (this.f16443m == null) {
            this.f16443m = new z0(this);
        }
        return this.f16443m;
    }

    private e getOrCreateReactViewBackground() {
        if (this.f16440j == null) {
            this.f16440j = new e(getContext());
            Drawable background = getBackground();
            w(null);
            if (background == null) {
                w(this.f16440j);
            } else {
                w(new LayerDrawable(new Drawable[]{this.f16440j, background}));
            }
            boolean g10 = s6.a.d().g(getContext());
            this.f16445o = g10 ? 1 : 0;
            this.f16440j.A(g10 ? 1 : 0);
        }
        return this.f16440j;
    }

    private void i(View view, int i10) {
        View[] viewArr = (View[]) f6.a.c(this.f16433c);
        int i11 = this.f16434d;
        int length = viewArr.length;
        if (i10 == i11) {
            if (length == i11) {
                View[] viewArr2 = new View[length + 12];
                this.f16433c = viewArr2;
                System.arraycopy(viewArr, 0, viewArr2, 0, length);
                viewArr = this.f16433c;
            }
            int i12 = this.f16434d;
            this.f16434d = i12 + 1;
            viewArr[i12] = view;
        } else if (i10 < i11) {
            if (length == i11) {
                View[] viewArr3 = new View[length + 12];
                this.f16433c = viewArr3;
                System.arraycopy(viewArr, 0, viewArr3, 0, i10);
                System.arraycopy(viewArr, i10, this.f16433c, i10 + 1, i11 - i10);
                viewArr = this.f16433c;
            } else {
                System.arraycopy(viewArr, i10, viewArr, i10 + 1, i11 - i10);
            }
            viewArr[i10] = view;
            this.f16434d++;
        } else {
            throw new IndexOutOfBoundsException("index=" + i10 + " count=" + i11);
        }
    }

    private boolean l() {
        return getId() != -1 && x6.a.a(getId()) == 2;
    }

    private void m(Canvas canvas) {
        boolean z10;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        String str = this.f16437g;
        if (str != null) {
            str.hashCode();
            char c10 = 65535;
            switch (str.hashCode()) {
                case -1217487446:
                    if (str.equals("hidden")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -907680051:
                    if (str.equals("scroll")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 466743410:
                    if (str.equals("visible")) {
                        c10 = 2;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                case 1:
                    float width = getWidth();
                    float height = getHeight();
                    e eVar = this.f16440j;
                    if (eVar != null) {
                        RectF k10 = eVar.k();
                        float f16 = k10.top;
                        if (f16 > 0.0f || k10.left > 0.0f || k10.bottom > 0.0f || k10.right > 0.0f) {
                            f12 = k10.left + 0.0f;
                            f11 = f16 + 0.0f;
                            width -= k10.right;
                            height -= k10.bottom;
                        } else {
                            f11 = 0.0f;
                            f12 = 0.0f;
                        }
                        float m10 = this.f16440j.m();
                        float h10 = this.f16440j.h(m10, e.b.TOP_LEFT);
                        float h11 = this.f16440j.h(m10, e.b.TOP_RIGHT);
                        float h12 = this.f16440j.h(m10, e.b.BOTTOM_LEFT);
                        float h13 = this.f16440j.h(m10, e.b.BOTTOM_RIGHT);
                        boolean z11 = this.f16445o == 1;
                        float g10 = this.f16440j.g(e.b.TOP_START);
                        float g11 = this.f16440j.g(e.b.TOP_END);
                        float g12 = this.f16440j.g(e.b.BOTTOM_START);
                        float g13 = this.f16440j.g(e.b.BOTTOM_END);
                        if (s6.a.d().b(getContext())) {
                            f14 = com.facebook.yoga.g.a(g10) ? h10 : g10;
                            if (!com.facebook.yoga.g.a(g11)) {
                                h11 = g11;
                            }
                            if (!com.facebook.yoga.g.a(g12)) {
                                h12 = g12;
                            }
                            if (com.facebook.yoga.g.a(g13)) {
                                g13 = h13;
                            }
                            f13 = z11 ? h11 : f14;
                            if (!z11) {
                                f14 = h11;
                            }
                            f15 = z11 ? g13 : h12;
                            if (z11) {
                                g13 = h12;
                            }
                        } else {
                            float f17 = z11 ? g11 : g10;
                            if (!z11) {
                                g10 = g11;
                            }
                            float f18 = z11 ? g13 : g12;
                            if (!z11) {
                                g12 = g13;
                            }
                            if (com.facebook.yoga.g.a(f17)) {
                                f17 = h10;
                            }
                            if (!com.facebook.yoga.g.a(g10)) {
                                h11 = g10;
                            }
                            if (!com.facebook.yoga.g.a(f18)) {
                                h12 = f18;
                            }
                            if (com.facebook.yoga.g.a(g12)) {
                                f13 = f17;
                                f14 = h11;
                                f15 = h12;
                                g13 = h13;
                            } else {
                                g13 = g12;
                                f13 = f17;
                                f14 = h11;
                                f15 = h12;
                            }
                        }
                        if (f13 > 0.0f || f14 > 0.0f || g13 > 0.0f || f15 > 0.0f) {
                            if (this.f16444n == null) {
                                this.f16444n = new Path();
                            }
                            this.f16444n.rewind();
                            this.f16444n.addRoundRect(new RectF(f12, f11, width, height), new float[]{Math.max(f13 - k10.left, 0.0f), Math.max(f13 - k10.top, 0.0f), Math.max(f14 - k10.right, 0.0f), Math.max(f14 - k10.top, 0.0f), Math.max(g13 - k10.right, 0.0f), Math.max(g13 - k10.bottom, 0.0f), Math.max(f15 - k10.left, 0.0f), Math.max(f15 - k10.bottom, 0.0f)}, Path.Direction.CW);
                            canvas.clipPath(this.f16444n);
                            f10 = f12;
                            z10 = true;
                        } else {
                            f10 = f12;
                            z10 = false;
                        }
                    } else {
                        z10 = false;
                        f10 = 0.0f;
                        f11 = 0.0f;
                    }
                    if (z10) {
                        return;
                    }
                    canvas.clipRect(new RectF(f10, f11, width, height));
                    return;
                case 2:
                    Path path = this.f16444n;
                    if (path != null) {
                        path.rewind();
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    private int o(View view) {
        int i10 = this.f16434d;
        View[] viewArr = (View[]) f6.a.c(this.f16433c);
        for (int i11 = 0; i11 < i10; i11++) {
            if (viewArr[i11] == view) {
                return i11;
            }
        }
        return -1;
    }

    private void q(int i10) {
        View[] viewArr = (View[]) f6.a.c(this.f16433c);
        int i11 = this.f16434d;
        if (i10 == i11 - 1) {
            int i12 = i11 - 1;
            this.f16434d = i12;
            viewArr[i12] = null;
        } else if (i10 >= 0 && i10 < i11) {
            System.arraycopy(viewArr, i10 + 1, viewArr, i10, (i11 - i10) - 1);
            int i13 = this.f16434d - 1;
            this.f16434d = i13;
            viewArr[i13] = null;
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    private void w(Drawable drawable) {
        super.setBackground(drawable);
    }

    private void x(Rect rect) {
        f6.a.c(this.f16433c);
        int i10 = 0;
        for (int i11 = 0; i11 < this.f16434d; i11++) {
            y(rect, i11, i10);
            if (this.f16433c[i11].getParent() == null) {
                i10++;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0060, code lost:
        if (r7 != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void y(android.graphics.Rect r7, int r8, int r9) {
        /*
            r6 = this;
            com.facebook.react.bridge.UiThreadUtil.assertOnUiThread()
            android.view.View[] r0 = r6.f16433c
            java.lang.Object r0 = f6.a.c(r0)
            android.view.View[] r0 = (android.view.View[]) r0
            r0 = r0[r8]
            android.graphics.Rect r1 = com.facebook.react.views.view.g.f16430s
            int r2 = r0.getLeft()
            int r3 = r0.getTop()
            int r4 = r0.getRight()
            int r5 = r0.getBottom()
            r1.set(r2, r3, r4, r5)
            int r2 = r1.left
            int r3 = r1.top
            int r4 = r1.right
            int r1 = r1.bottom
            boolean r7 = r7.intersects(r2, r3, r4, r1)
            android.view.animation.Animation r1 = r0.getAnimation()
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L3e
            boolean r1 = r1.hasEnded()
            if (r1 != 0) goto L3e
            r1 = 1
            goto L3f
        L3e:
            r1 = 0
        L3f:
            if (r7 != 0) goto L4e
            android.view.ViewParent r4 = r0.getParent()
            if (r4 == 0) goto L4e
            if (r1 != 0) goto L4e
            int r8 = r8 - r9
            super.removeViewsInLayout(r8, r3)
            goto L62
        L4e:
            if (r7 == 0) goto L60
            android.view.ViewParent r1 = r0.getParent()
            if (r1 != 0) goto L60
            int r8 = r8 - r9
            android.view.ViewGroup$LayoutParams r7 = com.facebook.react.views.view.g.f16429r
            super.addViewInLayout(r0, r8, r7, r3)
            r6.invalidate()
            goto L62
        L60:
            if (r7 == 0) goto L63
        L62:
            r2 = 1
        L63:
            if (r2 == 0) goto L74
            boolean r7 = r0 instanceof com.facebook.react.uimanager.u
            if (r7 == 0) goto L74
            com.facebook.react.uimanager.u r0 = (com.facebook.react.uimanager.u) r0
            boolean r7 = r0.getRemoveClippedSubviews()
            if (r7 == 0) goto L74
            r0.e()
        L74:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.view.g.y(android.graphics.Rect, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z(View view) {
        if (!this.f16432b || getParent() == null) {
            return;
        }
        f6.a.c(this.f16435e);
        f6.a.c(this.f16433c);
        Rect rect = f16430s;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        if (this.f16435e.intersects(rect.left, rect.top, rect.right, rect.bottom) != (view.getParent() != null)) {
            int i10 = 0;
            for (int i11 = 0; i11 < this.f16434d; i11++) {
                View[] viewArr = this.f16433c;
                if (viewArr[i11] == view) {
                    y(this.f16435e, i11, i10);
                    return;
                }
                if (viewArr[i11].getParent() == null) {
                    i10++;
                }
            }
        }
    }

    @Override // com.facebook.react.uimanager.h0
    public int a(int i10) {
        UiThreadUtil.assertOnUiThread();
        return (l() || !getDrawingOrderHelper().d()) ? i10 : getDrawingOrderHelper().a(getChildCount(), i10);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (!l()) {
            getDrawingOrderHelper().b(view);
            setChildrenDrawingOrderEnabled(getDrawingOrderHelper().d());
        } else {
            setChildrenDrawingOrderEnabled(false);
        }
        super.addView(view, i10, layoutParams);
    }

    @Override // com.facebook.react.uimanager.h0
    public void c() {
        if (l()) {
            return;
        }
        getDrawingOrderHelper().e();
        setChildrenDrawingOrderEnabled(getDrawingOrderHelper().d());
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        try {
            m(canvas);
            super.dispatchDraw(canvas);
        } catch (NullPointerException | StackOverflowError e10) {
            i0 a10 = j0.a(this);
            if (a10 != null) {
                a10.d(e10);
            } else if (getContext() instanceof ReactContext) {
                ((ReactContext) getContext()).handleException(new com.facebook.react.uimanager.h("StackOverflowException", this, e10));
            } else {
                throw e10;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    @TargetApi(23)
    public void dispatchProvideStructure(ViewStructure viewStructure) {
        try {
            super.dispatchProvideStructure(viewStructure);
        } catch (NullPointerException e10) {
            z3.a.k("ReactNative", "NullPointerException when executing dispatchProvideStructure", e10);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchSetPressed(boolean z10) {
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j10) {
        boolean z10 = view.getElevation() > 0.0f && ReactFeatureFlags.insertZReorderBarriersOnViewGroupChildren;
        if (z10) {
            com.facebook.react.views.view.a.a(canvas, true);
        }
        boolean drawChild = super.drawChild(canvas, view, j10);
        if (z10) {
            com.facebook.react.views.view.a.a(canvas, false);
        }
        return drawChild;
    }

    @Override // com.facebook.react.uimanager.u
    public void e() {
        if (this.f16432b) {
            f6.a.c(this.f16435e);
            f6.a.c(this.f16433c);
            v.a(this, this.f16435e);
            x(this.f16435e);
        }
    }

    @Override // com.facebook.react.uimanager.z
    public void f(int i10, int i11, int i12, int i13) {
        this.f16431a.set(i10, i11, i12, i13);
    }

    @Override // com.facebook.react.uimanager.u
    public void g(Rect rect) {
        rect.set(this.f16435e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getAllChildrenCount() {
        return this.f16434d;
    }

    public int getBackgroundColor() {
        if (getBackground() != null) {
            return ((e) getBackground()).j();
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i10, int i11) {
        UiThreadUtil.assertOnUiThread();
        return !l() ? getDrawingOrderHelper().a(i10, i11) : i11;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean getChildVisibleRect(View view, Rect rect, Point point) {
        return super.getChildVisibleRect(view, rect, point);
    }

    @Override // v6.c
    public Rect getHitSlopRect() {
        return this.f16436f;
    }

    @Override // com.facebook.react.uimanager.y
    public String getOverflow() {
        return this.f16437g;
    }

    @Override // com.facebook.react.uimanager.z
    public Rect getOverflowInset() {
        return this.f16431a;
    }

    @Override // com.facebook.react.uimanager.a0
    public s getPointerEvents() {
        return this.f16438h;
    }

    @Override // com.facebook.react.uimanager.u
    public boolean getRemoveClippedSubviews() {
        return this.f16432b;
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return this.f16442l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j(View view, int i10) {
        k(view, i10, f16429r);
    }

    void k(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        f6.a.a(this.f16432b);
        f6.a.c(this.f16435e);
        f6.a.c(this.f16433c);
        i(view, i10);
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            if (this.f16433c[i12].getParent() == null) {
                i11++;
            }
        }
        y(this.f16435e, i10, i11);
        view.addOnLayoutChangeListener(this.f16439i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public View n(int i10) {
        return ((View[]) f6.a.c(this.f16433c))[i10];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f16432b) {
            e();
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        s sVar;
        v6.b bVar = this.f16441k;
        if ((bVar != null && bVar.a(this, motionEvent)) || (sVar = this.f16438h) == s.NONE || sVar == s.BOX_ONLY) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        l.a(i10, i11);
        setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i10) {
        e eVar = this.f16440j;
        if (eVar != null) {
            eVar.A(this.f16445o);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (this.f16432b) {
            e();
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        s sVar = this.f16438h;
        return (sVar == s.NONE || sVar == s.BOX_NONE) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void p() {
        f6.a.a(this.f16432b);
        f6.a.c(this.f16433c);
        for (int i10 = 0; i10 < this.f16434d; i10++) {
            this.f16433c[i10].removeOnLayoutChangeListener(this.f16439i);
        }
        removeAllViewsInLayout();
        this.f16434d = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void r(View view) {
        UiThreadUtil.assertOnUiThread();
        f6.a.a(this.f16432b);
        f6.a.c(this.f16435e);
        f6.a.c(this.f16433c);
        view.removeOnLayoutChangeListener(this.f16439i);
        int o10 = o(view);
        if (this.f16433c[o10].getParent() != null) {
            int i10 = 0;
            for (int i11 = 0; i11 < o10; i11++) {
                if (this.f16433c[i11].getParent() == null) {
                    i10++;
                }
            }
            super.removeViewsInLayout(o10 - i10, 1);
        }
        q(o10);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        UiThreadUtil.assertOnUiThread();
        if (!l()) {
            getDrawingOrderHelper().c(view);
            setChildrenDrawingOrderEnabled(getDrawingOrderHelper().d());
        } else {
            setChildrenDrawingOrderEnabled(false);
        }
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int i10) {
        UiThreadUtil.assertOnUiThread();
        if (!l()) {
            getDrawingOrderHelper().c(getChildAt(i10));
            setChildrenDrawingOrderEnabled(getDrawingOrderHelper().d());
        } else {
            setChildrenDrawingOrderEnabled(false);
        }
        super.removeViewAt(i10);
    }

    @Override // android.view.View, android.view.ViewParent
    @SuppressLint({"MissingSuperCall"})
    public void requestLayout() {
    }

    public void s() {
        if (this.f16447q.equals("visible")) {
            setAlpha(this.f16446p);
            return;
        }
        float rotationX = getRotationX();
        float rotationY = getRotationY();
        if (rotationX >= -90.0f && rotationX < 90.0f && rotationY >= -90.0f && rotationY < 90.0f) {
            setAlpha(this.f16446p);
        } else {
            setAlpha(0.0f);
        }
    }

    public void setBackfaceVisibility(String str) {
        this.f16447q = str;
        s();
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        throw new UnsupportedOperationException("This method is not supported for ReactViewGroup instances");
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        if (i10 == 0 && this.f16440j == null) {
            return;
        }
        getOrCreateReactViewBackground().x(i10);
    }

    public void setBorderRadius(float f10) {
        getOrCreateReactViewBackground().y(f10);
    }

    public void setBorderStyle(String str) {
        getOrCreateReactViewBackground().v(str);
    }

    public void setHitSlopRect(Rect rect) {
        this.f16436f = rect;
    }

    public void setNeedsOffscreenAlphaCompositing(boolean z10) {
        this.f16442l = z10;
    }

    @Override // v6.d
    public void setOnInterceptTouchEventListener(v6.b bVar) {
        this.f16441k = bVar;
    }

    public void setOpacityIfPossible(float f10) {
        this.f16446p = f10;
        s();
    }

    public void setOverflow(String str) {
        this.f16437g = str;
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setPointerEvents(s sVar) {
        this.f16438h = sVar;
    }

    public void setRemoveClippedSubviews(boolean z10) {
        if (z10 == this.f16432b) {
            return;
        }
        this.f16432b = z10;
        if (z10) {
            Rect rect = new Rect();
            this.f16435e = rect;
            v.a(this, rect);
            int childCount = getChildCount();
            this.f16434d = childCount;
            this.f16433c = new View[Math.max(12, childCount)];
            this.f16439i = new b(this, null);
            for (int i10 = 0; i10 < this.f16434d; i10++) {
                View childAt = getChildAt(i10);
                this.f16433c[i10] = childAt;
                childAt.addOnLayoutChangeListener(this.f16439i);
            }
            e();
            return;
        }
        f6.a.c(this.f16435e);
        f6.a.c(this.f16433c);
        f6.a.c(this.f16439i);
        for (int i11 = 0; i11 < this.f16434d; i11++) {
            this.f16433c[i11].removeOnLayoutChangeListener(this.f16439i);
        }
        getDrawingRect(this.f16435e);
        x(this.f16435e);
        this.f16433c = null;
        this.f16435e = null;
        this.f16434d = 0;
        this.f16439i = null;
    }

    public void setTranslucentBackgroundDrawable(Drawable drawable) {
        w(null);
        if (this.f16440j != null && drawable != null) {
            w(new LayerDrawable(new Drawable[]{this.f16440j, drawable}));
        } else if (drawable != null) {
            w(drawable);
        }
    }

    public void t(int i10, float f10, float f11) {
        getOrCreateReactViewBackground().t(i10, f10, f11);
    }

    public void u(float f10, int i10) {
        getOrCreateReactViewBackground().z(f10, i10);
    }

    public void v(int i10, float f10) {
        getOrCreateReactViewBackground().w(i10, f10);
    }
}
