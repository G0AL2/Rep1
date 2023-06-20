package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.lang.reflect.Field;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DropDownListView.java */
/* loaded from: classes.dex */
public class h0 extends ListView {

    /* renamed from: a  reason: collision with root package name */
    private final Rect f1521a;

    /* renamed from: b  reason: collision with root package name */
    private int f1522b;

    /* renamed from: c  reason: collision with root package name */
    private int f1523c;

    /* renamed from: d  reason: collision with root package name */
    private int f1524d;

    /* renamed from: e  reason: collision with root package name */
    private int f1525e;

    /* renamed from: f  reason: collision with root package name */
    private int f1526f;

    /* renamed from: g  reason: collision with root package name */
    private Field f1527g;

    /* renamed from: h  reason: collision with root package name */
    private a f1528h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f1529i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f1530j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f1531k;

    /* renamed from: l  reason: collision with root package name */
    private androidx.core.view.e0 f1532l;

    /* renamed from: m  reason: collision with root package name */
    private androidx.core.widget.g f1533m;

    /* renamed from: n  reason: collision with root package name */
    b f1534n;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DropDownListView.java */
    /* loaded from: classes.dex */
    public static class a extends f.c {

        /* renamed from: b  reason: collision with root package name */
        private boolean f1535b;

        a(Drawable drawable) {
            super(drawable);
            this.f1535b = true;
        }

        void c(boolean z10) {
            this.f1535b = z10;
        }

        @Override // f.c, android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            if (this.f1535b) {
                super.draw(canvas);
            }
        }

        @Override // f.c, android.graphics.drawable.Drawable
        public void setHotspot(float f10, float f11) {
            if (this.f1535b) {
                super.setHotspot(f10, f11);
            }
        }

        @Override // f.c, android.graphics.drawable.Drawable
        public void setHotspotBounds(int i10, int i11, int i12, int i13) {
            if (this.f1535b) {
                super.setHotspotBounds(i10, i11, i12, i13);
            }
        }

        @Override // f.c, android.graphics.drawable.Drawable
        public boolean setState(int[] iArr) {
            if (this.f1535b) {
                return super.setState(iArr);
            }
            return false;
        }

        @Override // f.c, android.graphics.drawable.Drawable
        public boolean setVisible(boolean z10, boolean z11) {
            if (this.f1535b) {
                return super.setVisible(z10, z11);
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DropDownListView.java */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        b() {
        }

        public void a() {
            h0 h0Var = h0.this;
            h0Var.f1534n = null;
            h0Var.removeCallbacks(this);
        }

        public void b() {
            h0.this.post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            h0 h0Var = h0.this;
            h0Var.f1534n = null;
            h0Var.drawableStateChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public h0(Context context, boolean z10) {
        super(context, null, d.a.A);
        this.f1521a = new Rect();
        this.f1522b = 0;
        this.f1523c = 0;
        this.f1524d = 0;
        this.f1525e = 0;
        this.f1530j = z10;
        setCacheColorHint(0);
        try {
            Field declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.f1527g = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e10) {
            e10.printStackTrace();
        }
    }

    private void a() {
        this.f1531k = false;
        setPressed(false);
        drawableStateChanged();
        View childAt = getChildAt(this.f1526f - getFirstVisiblePosition());
        if (childAt != null) {
            childAt.setPressed(false);
        }
        androidx.core.view.e0 e0Var = this.f1532l;
        if (e0Var != null) {
            e0Var.b();
            this.f1532l = null;
        }
    }

    private void b(View view, int i10) {
        performItemClick(view, i10, getItemIdAtPosition(i10));
    }

    private void c(Canvas canvas) {
        Drawable selector;
        if (this.f1521a.isEmpty() || (selector = getSelector()) == null) {
            return;
        }
        selector.setBounds(this.f1521a);
        selector.draw(canvas);
    }

    private void f(int i10, View view) {
        Rect rect = this.f1521a;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        rect.left -= this.f1522b;
        rect.top -= this.f1523c;
        rect.right += this.f1524d;
        rect.bottom += this.f1525e;
        try {
            boolean z10 = this.f1527g.getBoolean(this);
            if (view.isEnabled() != z10) {
                this.f1527g.set(this, Boolean.valueOf(!z10));
                if (i10 != -1) {
                    refreshDrawableState();
                }
            }
        } catch (IllegalAccessException e10) {
            e10.printStackTrace();
        }
    }

    private void g(int i10, View view) {
        Drawable selector = getSelector();
        boolean z10 = (selector == null || i10 == -1) ? false : true;
        if (z10) {
            selector.setVisible(false, false);
        }
        f(i10, view);
        if (z10) {
            Rect rect = this.f1521a;
            float exactCenterX = rect.exactCenterX();
            float exactCenterY = rect.exactCenterY();
            selector.setVisible(getVisibility() == 0, false);
            androidx.core.graphics.drawable.a.k(selector, exactCenterX, exactCenterY);
        }
    }

    private void h(int i10, View view, float f10, float f11) {
        g(i10, view);
        Drawable selector = getSelector();
        if (selector == null || i10 == -1) {
            return;
        }
        androidx.core.graphics.drawable.a.k(selector, f10, f11);
    }

    private void i(View view, int i10, float f10, float f11) {
        View childAt;
        this.f1531k = true;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 21) {
            drawableHotspotChanged(f10, f11);
        }
        if (!isPressed()) {
            setPressed(true);
        }
        layoutChildren();
        int i12 = this.f1526f;
        if (i12 != -1 && (childAt = getChildAt(i12 - getFirstVisiblePosition())) != null && childAt != view && childAt.isPressed()) {
            childAt.setPressed(false);
        }
        this.f1526f = i10;
        float left = f10 - view.getLeft();
        float top = f11 - view.getTop();
        if (i11 >= 21) {
            view.drawableHotspotChanged(left, top);
        }
        if (!view.isPressed()) {
            view.setPressed(true);
        }
        h(i10, view, f10, f11);
        setSelectorEnabled(false);
        refreshDrawableState();
    }

    private boolean j() {
        return this.f1531k;
    }

    private void k() {
        Drawable selector = getSelector();
        if (selector != null && j() && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    private void setSelectorEnabled(boolean z10) {
        a aVar = this.f1528h;
        if (aVar != null) {
            aVar.c(z10);
        }
    }

    public int d(int i10, int i11, int i12, int i13, int i14) {
        int makeMeasureSpec;
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int i15 = listPaddingTop + listPaddingBottom;
        dividerHeight = (dividerHeight <= 0 || divider == null) ? 0 : 0;
        int count = adapter.getCount();
        View view = null;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        while (i16 < count) {
            int itemViewType = adapter.getItemViewType(i16);
            if (itemViewType != i17) {
                view = null;
                i17 = itemViewType;
            }
            view = adapter.getView(i16, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i19 = layoutParams.height;
            if (i19 > 0) {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i19, 1073741824);
            } else {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            }
            view.measure(i10, makeMeasureSpec);
            view.forceLayout();
            if (i16 > 0) {
                i15 += dividerHeight;
            }
            i15 += view.getMeasuredHeight();
            if (i15 >= i13) {
                return (i14 < 0 || i16 <= i14 || i18 <= 0 || i15 == i13) ? i13 : i18;
            }
            if (i14 >= 0 && i16 >= i14) {
                i18 = i15;
            }
            i16++;
        }
        return i15;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        c(canvas);
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        if (this.f1534n != null) {
            return;
        }
        super.drawableStateChanged();
        setSelectorEnabled(true);
        k();
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x000c, code lost:
        if (r0 != 3) goto L7;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0048 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean e(android.view.MotionEvent r8, int r9) {
        /*
            r7 = this;
            int r0 = r8.getActionMasked()
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L16
            r3 = 2
            if (r0 == r3) goto L14
            r9 = 3
            if (r0 == r9) goto L11
        Le:
            r9 = 0
            r3 = 1
            goto L46
        L11:
            r9 = 0
            r3 = 0
            goto L46
        L14:
            r3 = 1
            goto L17
        L16:
            r3 = 0
        L17:
            int r9 = r8.findPointerIndex(r9)
            if (r9 >= 0) goto L1e
            goto L11
        L1e:
            float r4 = r8.getX(r9)
            int r4 = (int) r4
            float r9 = r8.getY(r9)
            int r9 = (int) r9
            int r5 = r7.pointToPosition(r4, r9)
            r6 = -1
            if (r5 != r6) goto L31
            r9 = 1
            goto L46
        L31:
            int r3 = r7.getFirstVisiblePosition()
            int r3 = r5 - r3
            android.view.View r3 = r7.getChildAt(r3)
            float r4 = (float) r4
            float r9 = (float) r9
            r7.i(r3, r5, r4, r9)
            if (r0 != r2) goto Le
            r7.b(r3, r5)
            goto Le
        L46:
            if (r3 == 0) goto L4a
            if (r9 == 0) goto L4d
        L4a:
            r7.a()
        L4d:
            if (r3 == 0) goto L65
            androidx.core.widget.g r9 = r7.f1533m
            if (r9 != 0) goto L5a
            androidx.core.widget.g r9 = new androidx.core.widget.g
            r9.<init>(r7)
            r7.f1533m = r9
        L5a:
            androidx.core.widget.g r9 = r7.f1533m
            r9.m(r2)
            androidx.core.widget.g r9 = r7.f1533m
            r9.onTouch(r7, r8)
            goto L6c
        L65:
            androidx.core.widget.g r8 = r7.f1533m
            if (r8 == 0) goto L6c
            r8.m(r1)
        L6c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.h0.e(android.view.MotionEvent, int):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean hasFocus() {
        return this.f1530j || super.hasFocus();
    }

    @Override // android.view.View
    public boolean hasWindowFocus() {
        return this.f1530j || super.hasWindowFocus();
    }

    @Override // android.view.View
    public boolean isFocused() {
        return this.f1530j || super.isFocused();
    }

    @Override // android.view.View
    public boolean isInTouchMode() {
        return (this.f1530j && this.f1529i) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        this.f1534n = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        if (Build.VERSION.SDK_INT < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f1534n == null) {
            b bVar = new b();
            this.f1534n = bVar;
            bVar.b();
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked != 9 && actionMasked != 7) {
            setSelection(-1);
        } else {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (pointToPosition != -1 && pointToPosition != getSelectedItemPosition()) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                }
                k();
            }
        }
        return onHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f1526f = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        b bVar = this.f1534n;
        if (bVar != null) {
            bVar.a();
        }
        return super.onTouchEvent(motionEvent);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setListSelectionHidden(boolean z10) {
        this.f1529i = z10;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        a aVar = drawable != null ? new a(drawable) : null;
        this.f1528h = aVar;
        super.setSelector(aVar);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f1522b = rect.left;
        this.f1523c = rect.top;
        this.f1524d = rect.right;
        this.f1525e = rect.bottom;
    }
}
