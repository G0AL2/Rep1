package androidx.core.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import androidx.core.view.p;
import androidx.core.view.r;
import androidx.core.view.z;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.Api;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import i0.c;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements p, androidx.core.view.m {
    private static final a A = new a();
    private static final int[] B = {16843130};

    /* renamed from: a  reason: collision with root package name */
    private long f2749a;

    /* renamed from: b  reason: collision with root package name */
    private final Rect f2750b;

    /* renamed from: c  reason: collision with root package name */
    private OverScroller f2751c;

    /* renamed from: d  reason: collision with root package name */
    public EdgeEffect f2752d;

    /* renamed from: e  reason: collision with root package name */
    public EdgeEffect f2753e;

    /* renamed from: f  reason: collision with root package name */
    private int f2754f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f2755g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f2756h;

    /* renamed from: i  reason: collision with root package name */
    private View f2757i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f2758j;

    /* renamed from: k  reason: collision with root package name */
    private VelocityTracker f2759k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f2760l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f2761m;

    /* renamed from: n  reason: collision with root package name */
    private int f2762n;

    /* renamed from: o  reason: collision with root package name */
    private int f2763o;

    /* renamed from: p  reason: collision with root package name */
    private int f2764p;

    /* renamed from: q  reason: collision with root package name */
    private int f2765q;

    /* renamed from: r  reason: collision with root package name */
    private final int[] f2766r;

    /* renamed from: s  reason: collision with root package name */
    private final int[] f2767s;

    /* renamed from: t  reason: collision with root package name */
    private int f2768t;

    /* renamed from: u  reason: collision with root package name */
    private int f2769u;

    /* renamed from: v  reason: collision with root package name */
    private SavedState f2770v;

    /* renamed from: w  reason: collision with root package name */
    private final r f2771w;

    /* renamed from: x  reason: collision with root package name */
    private final androidx.core.view.n f2772x;

    /* renamed from: y  reason: collision with root package name */
    private float f2773y;

    /* renamed from: z  reason: collision with root package name */
    private b f2774z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        public int f2775a;

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

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.f2775a + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f2775a);
        }

        SavedState(Parcel parcel) {
            super(parcel);
            this.f2775a = parcel.readInt();
        }
    }

    /* loaded from: classes.dex */
    static class a extends androidx.core.view.a {
        a() {
        }

        @Override // androidx.core.view.a
        public void f(View view, AccessibilityEvent accessibilityEvent) {
            super.f(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            i0.e.a(accessibilityEvent, nestedScrollView.getScrollX());
            i0.e.b(accessibilityEvent, nestedScrollView.getScrollRange());
        }

        @Override // androidx.core.view.a
        public void g(View view, i0.c cVar) {
            int scrollRange;
            super.g(view, cVar);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            cVar.a0(ScrollView.class.getName());
            if (!nestedScrollView.isEnabled() || (scrollRange = nestedScrollView.getScrollRange()) <= 0) {
                return;
            }
            cVar.v0(true);
            if (nestedScrollView.getScrollY() > 0) {
                cVar.b(c.a.f31495j);
                cVar.b(c.a.f31499n);
            }
            if (nestedScrollView.getScrollY() < scrollRange) {
                cVar.b(c.a.f31494i);
                cVar.b(c.a.f31500o);
            }
        }

        @Override // androidx.core.view.a
        public boolean j(View view, int i10, Bundle bundle) {
            if (super.j(view, i10, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (nestedScrollView.isEnabled()) {
                if (i10 != 4096) {
                    if (i10 == 8192 || i10 == 16908344) {
                        int max = Math.max(nestedScrollView.getScrollY() - ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                        if (max != nestedScrollView.getScrollY()) {
                            nestedScrollView.P(0, max, true);
                            return true;
                        }
                        return false;
                    } else if (i10 != 16908346) {
                        return false;
                    }
                }
                int min = Math.min(nestedScrollView.getScrollY() + ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
                if (min != nestedScrollView.getScrollY()) {
                    nestedScrollView.P(0, min, true);
                    return true;
                }
                return false;
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(NestedScrollView nestedScrollView, int i10, int i11, int i12, int i13);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, w.a.f38103c);
    }

    private static boolean A(View view, View view2) {
        if (view == view2) {
            return true;
        }
        ViewParent parent = view.getParent();
        return (parent instanceof ViewGroup) && A((View) parent, view2);
    }

    private boolean B(View view, int i10, int i11) {
        view.getDrawingRect(this.f2750b);
        offsetDescendantRectToMyCoords(view, this.f2750b);
        return this.f2750b.bottom + i10 >= getScrollY() && this.f2750b.top - i10 <= getScrollY() + i11;
    }

    private void C(int i10, int i11, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i10);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f2772x.e(0, scrollY2, 0, i10 - scrollY2, null, i11, iArr);
    }

    private void D(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f2765q) {
            int i10 = actionIndex == 0 ? 1 : 0;
            this.f2754f = (int) motionEvent.getY(i10);
            this.f2765q = motionEvent.getPointerId(i10);
            VelocityTracker velocityTracker = this.f2759k;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    private void G() {
        VelocityTracker velocityTracker = this.f2759k;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f2759k = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int H(int r4, float r5) {
        /*
            r3 = this;
            int r0 = r3.getWidth()
            float r0 = (float) r0
            float r5 = r5 / r0
            float r4 = (float) r4
            int r0 = r3.getHeight()
            float r0 = (float) r0
            float r4 = r4 / r0
            android.widget.EdgeEffect r0 = r3.f2752d
            float r0 = androidx.core.widget.e.b(r0)
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L31
            android.widget.EdgeEffect r0 = r3.f2752d
            float r4 = -r4
            float r4 = androidx.core.widget.e.d(r0, r4, r5)
            float r4 = -r4
            android.widget.EdgeEffect r5 = r3.f2752d
            float r5 = androidx.core.widget.e.b(r5)
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 != 0) goto L2f
            android.widget.EdgeEffect r5 = r3.f2752d
            r5.onRelease()
        L2f:
            r1 = r4
            goto L54
        L31:
            android.widget.EdgeEffect r0 = r3.f2753e
            float r0 = androidx.core.widget.e.b(r0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L54
            android.widget.EdgeEffect r0 = r3.f2753e
            r2 = 1065353216(0x3f800000, float:1.0)
            float r2 = r2 - r5
            float r4 = androidx.core.widget.e.d(r0, r4, r2)
            android.widget.EdgeEffect r5 = r3.f2753e
            float r5 = androidx.core.widget.e.b(r5)
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 != 0) goto L2f
            android.widget.EdgeEffect r5 = r3.f2753e
            r5.onRelease()
            goto L2f
        L54:
            int r4 = r3.getHeight()
            float r4 = (float) r4
            float r1 = r1 * r4
            int r4 = java.lang.Math.round(r1)
            if (r4 == 0) goto L64
            r3.invalidate()
        L64:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.H(int, float):int");
    }

    private void I(boolean z10) {
        if (z10) {
            Q(2, 1);
        } else {
            S(1);
        }
        this.f2769u = getScrollY();
        z.h0(this);
    }

    private boolean J(int i10, int i11, int i12) {
        int height = getHeight();
        int scrollY = getScrollY();
        int i13 = height + scrollY;
        boolean z10 = false;
        boolean z11 = i10 == 33;
        View r10 = r(z11, i11, i12);
        if (r10 == null) {
            r10 = this;
        }
        if (i11 < scrollY || i12 > i13) {
            h(z11 ? i11 - scrollY : i12 - i13);
            z10 = true;
        }
        if (r10 != findFocus()) {
            r10.requestFocus(i10);
        }
        return z10;
    }

    private void K(View view) {
        view.getDrawingRect(this.f2750b);
        offsetDescendantRectToMyCoords(view, this.f2750b);
        int e10 = e(this.f2750b);
        if (e10 != 0) {
            scrollBy(0, e10);
        }
    }

    private boolean L(Rect rect, boolean z10) {
        int e10 = e(rect);
        boolean z11 = e10 != 0;
        if (z11) {
            if (z10) {
                scrollBy(0, e10);
            } else {
                M(0, e10);
            }
        }
        return z11;
    }

    private void N(int i10, int i11, int i12, boolean z10) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f2749a > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int scrollY = getScrollY();
            OverScroller overScroller = this.f2751c;
            int scrollX = getScrollX();
            overScroller.startScroll(scrollX, scrollY, 0, Math.max(0, Math.min(i11 + scrollY, Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom())))) - scrollY, i12);
            I(z10);
        } else {
            if (!this.f2751c.isFinished()) {
                a();
            }
            scrollBy(i10, i11);
        }
        this.f2749a = AnimationUtils.currentAnimationTimeMillis();
    }

    private boolean R(MotionEvent motionEvent) {
        boolean z10;
        if (e.b(this.f2752d) != 0.0f) {
            e.d(this.f2752d, 0.0f, motionEvent.getY() / getHeight());
            z10 = true;
        } else {
            z10 = false;
        }
        if (e.b(this.f2753e) != 0.0f) {
            e.d(this.f2753e, 0.0f, 1.0f - (motionEvent.getY() / getHeight()));
            return true;
        }
        return z10;
    }

    private void a() {
        this.f2751c.abortAnimation();
        S(1);
    }

    private boolean c() {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            return (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom();
        }
        return false;
    }

    private static int d(int i10, int i11, int i12) {
        if (i11 >= i12 || i10 < 0) {
            return 0;
        }
        return i11 + i10 > i12 ? i12 - i11 : i10;
    }

    private float getVerticalScrollFactorCompat() {
        if (this.f2773y == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                this.f2773y = typedValue.getDimension(context.getResources().getDisplayMetrics());
            } else {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
        }
        return this.f2773y;
    }

    private void h(int i10) {
        if (i10 != 0) {
            if (this.f2761m) {
                M(0, i10);
            } else {
                scrollBy(0, i10);
            }
        }
    }

    private boolean l(int i10) {
        if (e.b(this.f2752d) != 0.0f) {
            this.f2752d.onAbsorb(i10);
        } else if (e.b(this.f2753e) == 0.0f) {
            return false;
        } else {
            this.f2753e.onAbsorb(-i10);
        }
        return true;
    }

    private void p() {
        this.f2758j = false;
        G();
        S(0);
        this.f2752d.onRelease();
        this.f2753e.onRelease();
    }

    private View r(boolean z10, int i10, int i11) {
        ArrayList focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z11 = false;
        for (int i12 = 0; i12 < size; i12++) {
            View view2 = (View) focusables.get(i12);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i10 < bottom && top < i11) {
                boolean z12 = i10 < top && bottom < i11;
                if (view == null) {
                    view = view2;
                    z11 = z12;
                } else {
                    boolean z13 = (z10 && top < view.getTop()) || (!z10 && bottom > view.getBottom());
                    if (z11) {
                        if (z12) {
                            if (!z13) {
                            }
                            view = view2;
                        }
                    } else if (z12) {
                        view = view2;
                        z11 = true;
                    } else {
                        if (!z13) {
                        }
                        view = view2;
                    }
                }
            }
        }
        return view;
    }

    private boolean v(int i10, int i11) {
        if (getChildCount() > 0) {
            int scrollY = getScrollY();
            View childAt = getChildAt(0);
            return i11 >= childAt.getTop() - scrollY && i11 < childAt.getBottom() - scrollY && i10 >= childAt.getLeft() && i10 < childAt.getRight();
        }
        return false;
    }

    private void w() {
        VelocityTracker velocityTracker = this.f2759k;
        if (velocityTracker == null) {
            this.f2759k = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    private void x() {
        this.f2751c = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f2762n = viewConfiguration.getScaledTouchSlop();
        this.f2763o = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f2764p = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    private void y() {
        if (this.f2759k == null) {
            this.f2759k = VelocityTracker.obtain();
        }
    }

    private boolean z(View view) {
        return !B(view, 0, getHeight());
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0083 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    boolean E(int r13, int r14, int r15, int r16, int r17, int r18, int r19, int r20, boolean r21) {
        /*
            r12 = this;
            r0 = r12
            int r1 = r12.getOverScrollMode()
            int r2 = r12.computeHorizontalScrollRange()
            int r3 = r12.computeHorizontalScrollExtent()
            r4 = 0
            r5 = 1
            if (r2 <= r3) goto L13
            r2 = 1
            goto L14
        L13:
            r2 = 0
        L14:
            int r3 = r12.computeVerticalScrollRange()
            int r6 = r12.computeVerticalScrollExtent()
            if (r3 <= r6) goto L20
            r3 = 1
            goto L21
        L20:
            r3 = 0
        L21:
            if (r1 == 0) goto L2a
            if (r1 != r5) goto L28
            if (r2 == 0) goto L28
            goto L2a
        L28:
            r2 = 0
            goto L2b
        L2a:
            r2 = 1
        L2b:
            if (r1 == 0) goto L34
            if (r1 != r5) goto L32
            if (r3 == 0) goto L32
            goto L34
        L32:
            r1 = 0
            goto L35
        L34:
            r1 = 1
        L35:
            int r3 = r15 + r13
            if (r2 != 0) goto L3b
            r2 = 0
            goto L3d
        L3b:
            r2 = r19
        L3d:
            int r6 = r16 + r14
            if (r1 != 0) goto L43
            r1 = 0
            goto L45
        L43:
            r1 = r20
        L45:
            int r7 = -r2
            int r2 = r2 + r17
            int r8 = -r1
            int r1 = r1 + r18
            if (r3 <= r2) goto L50
            r3 = r2
        L4e:
            r2 = 1
            goto L55
        L50:
            if (r3 >= r7) goto L54
            r3 = r7
            goto L4e
        L54:
            r2 = 0
        L55:
            if (r6 <= r1) goto L5a
            r6 = r1
        L58:
            r1 = 1
            goto L5f
        L5a:
            if (r6 >= r8) goto L5e
            r6 = r8
            goto L58
        L5e:
            r1 = 0
        L5f:
            if (r1 == 0) goto L7e
            boolean r7 = r12.u(r5)
            if (r7 != 0) goto L7e
            android.widget.OverScroller r7 = r0.f2751c
            r8 = 0
            r9 = 0
            r10 = 0
            int r11 = r12.getScrollRange()
            r13 = r7
            r14 = r3
            r15 = r6
            r16 = r8
            r17 = r9
            r18 = r10
            r19 = r11
            r13.springBack(r14, r15, r16, r17, r18, r19)
        L7e:
            r12.onOverScrolled(r3, r6, r2, r1)
            if (r2 != 0) goto L85
            if (r1 == 0) goto L86
        L85:
            r4 = 1
        L86:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.E(int, int, int, int, int, int, int, int, boolean):boolean");
    }

    public boolean F(int i10) {
        boolean z10 = i10 == 130;
        int height = getHeight();
        if (z10) {
            this.f2750b.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
                Rect rect = this.f2750b;
                if (rect.top + height > bottom) {
                    rect.top = bottom - height;
                }
            }
        } else {
            this.f2750b.top = getScrollY() - height;
            Rect rect2 = this.f2750b;
            if (rect2.top < 0) {
                rect2.top = 0;
            }
        }
        Rect rect3 = this.f2750b;
        int i11 = rect3.top;
        int i12 = height + i11;
        rect3.bottom = i12;
        return J(i10, i11, i12);
    }

    public final void M(int i10, int i11) {
        N(i10, i11, IronSourceConstants.INTERSTITIAL_DAILY_CAPPED, false);
    }

    void O(int i10, int i11, int i12, boolean z10) {
        N(i10 - getScrollX(), i11 - getScrollY(), i12, z10);
    }

    void P(int i10, int i11, boolean z10) {
        O(i10, i11, IronSourceConstants.INTERSTITIAL_DAILY_CAPPED, z10);
    }

    public boolean Q(int i10, int i11) {
        return this.f2772x.q(i10, i11);
    }

    public void S(int i10) {
        this.f2772x.s(i10);
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public boolean b(int i10) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i10);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus != null && B(findNextFocus, maxScrollAmount, getHeight())) {
            findNextFocus.getDrawingRect(this.f2750b);
            offsetDescendantRectToMyCoords(findNextFocus, this.f2750b);
            h(e(this.f2750b));
            findNextFocus.requestFocus(i10);
        } else {
            if (i10 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i10 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getScrollY() + getHeight()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i10 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            h(maxScrollAmount);
        }
        if (findFocus != null && findFocus.isFocused() && z(findFocus)) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
            return true;
        }
        return true;
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.f2751c.isFinished()) {
            return;
        }
        this.f2751c.computeScrollOffset();
        int currY = this.f2751c.getCurrY();
        int i10 = currY - this.f2769u;
        this.f2769u = currY;
        int[] iArr = this.f2767s;
        boolean z10 = false;
        iArr[1] = 0;
        f(0, i10, iArr, null, 1);
        int i11 = i10 - this.f2767s[1];
        int scrollRange = getScrollRange();
        if (i11 != 0) {
            int scrollY = getScrollY();
            E(0, i11, getScrollX(), scrollY, 0, scrollRange, 0, 0, false);
            int scrollY2 = getScrollY() - scrollY;
            int i12 = i11 - scrollY2;
            int[] iArr2 = this.f2767s;
            iArr2[1] = 0;
            g(0, scrollY2, 0, i12, this.f2766r, 1, iArr2);
            i11 = i12 - this.f2767s[1];
        }
        if (i11 != 0) {
            int overScrollMode = getOverScrollMode();
            if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                z10 = true;
            }
            if (z10) {
                if (i11 < 0) {
                    if (this.f2752d.isFinished()) {
                        this.f2752d.onAbsorb((int) this.f2751c.getCurrVelocity());
                    }
                } else if (this.f2753e.isFinished()) {
                    this.f2753e.onAbsorb((int) this.f2751c.getCurrVelocity());
                }
            }
            a();
        }
        if (!this.f2751c.isFinished()) {
            z.h0(this);
        } else {
            S(1);
        }
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > max ? bottom + (scrollY - max) : bottom;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || q(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f10, float f11, boolean z10) {
        return this.f2772x.a(f10, f11, z10);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f10, float f11) {
        return this.f2772x.b(f10, f11);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return f(i10, i11, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return this.f2772x.f(i10, i11, i12, i13, iArr);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int paddingLeft;
        super.draw(canvas);
        int scrollY = getScrollY();
        int i10 = 0;
        if (!this.f2752d.isFinished()) {
            int save = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int min = Math.min(0, scrollY);
            int i11 = Build.VERSION.SDK_INT;
            if (i11 < 21 || getClipToPadding()) {
                width -= getPaddingLeft() + getPaddingRight();
                paddingLeft = getPaddingLeft() + 0;
            } else {
                paddingLeft = 0;
            }
            if (i11 >= 21 && getClipToPadding()) {
                height -= getPaddingTop() + getPaddingBottom();
                min += getPaddingTop();
            }
            canvas.translate(paddingLeft, min);
            this.f2752d.setSize(width, height);
            if (this.f2752d.draw(canvas)) {
                z.h0(this);
            }
            canvas.restoreToCount(save);
        }
        if (this.f2753e.isFinished()) {
            return;
        }
        int save2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int max = Math.max(getScrollRange(), scrollY) + height2;
        int i12 = Build.VERSION.SDK_INT;
        if (i12 < 21 || getClipToPadding()) {
            width2 -= getPaddingLeft() + getPaddingRight();
            i10 = 0 + getPaddingLeft();
        }
        if (i12 >= 21 && getClipToPadding()) {
            height2 -= getPaddingTop() + getPaddingBottom();
            max -= getPaddingBottom();
        }
        canvas.translate(i10 - width2, max);
        canvas.rotate(180.0f, width2, 0.0f);
        this.f2753e.setSize(width2, height2);
        if (this.f2753e.draw(canvas)) {
            z.h0(this);
        }
        canvas.restoreToCount(save2);
    }

    protected int e(Rect rect) {
        int i10;
        int i11;
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i12 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i13 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i12 - verticalFadingEdgeLength : i12;
        int i14 = rect.bottom;
        if (i14 > i13 && rect.top > scrollY) {
            if (rect.height() > height) {
                i11 = rect.top - scrollY;
            } else {
                i11 = rect.bottom - i13;
            }
            return Math.min(i11 + 0, (childAt.getBottom() + layoutParams.bottomMargin) - i12);
        } else if (rect.top >= scrollY || i14 >= i13) {
            return 0;
        } else {
            if (rect.height() > height) {
                i10 = 0 - (i13 - rect.bottom);
            } else {
                i10 = 0 - (scrollY - rect.top);
            }
            return Math.max(i10, -getScrollY());
        }
    }

    public boolean f(int i10, int i11, int[] iArr, int[] iArr2, int i12) {
        return this.f2772x.d(i10, i11, iArr, iArr2, i12);
    }

    public void g(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        this.f2772x.e(i10, i11, i12, i13, iArr, i14, iArr2);
    }

    @Override // android.view.View
    protected float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f2771w.a();
    }

    int getScrollRange() {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
        }
        return 0;
    }

    @Override // android.view.View
    protected float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return u(0);
    }

    @Override // androidx.core.view.o
    public void i(View view, View view2, int i10, int i11) {
        this.f2771w.c(view, view2, i10, i11);
        Q(2, i11);
    }

    @Override // android.view.View, androidx.core.view.m
    public boolean isNestedScrollingEnabled() {
        return this.f2772x.m();
    }

    @Override // androidx.core.view.o
    public void j(View view, int i10) {
        this.f2771w.e(view, i10);
        S(i10);
    }

    @Override // androidx.core.view.o
    public void k(View view, int i10, int i11, int[] iArr, int i12) {
        f(i10, i11, iArr, null, i12);
    }

    @Override // androidx.core.view.p
    public void m(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        C(i13, i14, iArr);
    }

    @Override // android.view.ViewGroup
    protected void measureChild(View view, int i10, int i11) {
        view.measure(FrameLayout.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    protected void measureChildWithMargins(View view, int i10, int i11, int i12, int i13) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(FrameLayout.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    @Override // androidx.core.view.o
    public void n(View view, int i10, int i11, int i12, int i13, int i14) {
        C(i13, i14, null);
    }

    @Override // androidx.core.view.o
    public boolean o(View view, View view2, int i10, int i11) {
        return (i10 & 2) != 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f2756h = false;
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) != 0 && motionEvent.getAction() == 8 && !this.f2758j) {
            float axisValue = motionEvent.getAxisValue(9);
            if (axisValue != 0.0f) {
                int scrollRange = getScrollRange();
                int scrollY = getScrollY();
                int verticalScrollFactorCompat = scrollY - ((int) (axisValue * getVerticalScrollFactorCompat()));
                if (verticalScrollFactorCompat < 0) {
                    scrollRange = 0;
                } else if (verticalScrollFactorCompat <= scrollRange) {
                    scrollRange = verticalScrollFactorCompat;
                }
                if (scrollRange != scrollY) {
                    super.scrollTo(getScrollX(), scrollRange);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z10 = true;
        if (action == 2 && this.f2758j) {
            return true;
        }
        int i10 = action & 255;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    int i11 = this.f2765q;
                    if (i11 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i11);
                        if (findPointerIndex == -1) {
                            Log.e("NestedScrollView", "Invalid pointerId=" + i11 + " in onInterceptTouchEvent");
                        } else {
                            int y10 = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y10 - this.f2754f) > this.f2762n && (2 & getNestedScrollAxes()) == 0) {
                                this.f2758j = true;
                                this.f2754f = y10;
                                y();
                                this.f2759k.addMovement(motionEvent);
                                this.f2768t = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                } else if (i10 != 3) {
                    if (i10 == 6) {
                        D(motionEvent);
                    }
                }
            }
            this.f2758j = false;
            this.f2765q = -1;
            G();
            if (this.f2751c.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                z.h0(this);
            }
            S(0);
        } else {
            int y11 = (int) motionEvent.getY();
            if (!v((int) motionEvent.getX(), y11)) {
                if (!R(motionEvent) && this.f2751c.isFinished()) {
                    z10 = false;
                }
                this.f2758j = z10;
                G();
            } else {
                this.f2754f = y11;
                this.f2765q = motionEvent.getPointerId(0);
                w();
                this.f2759k.addMovement(motionEvent);
                this.f2751c.computeScrollOffset();
                if (!R(motionEvent) && this.f2751c.isFinished()) {
                    z10 = false;
                }
                this.f2758j = z10;
                Q(2, 0);
            }
        }
        return this.f2758j;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int i14 = 0;
        this.f2755g = false;
        View view = this.f2757i;
        if (view != null && A(view, this)) {
            K(this.f2757i);
        }
        this.f2757i = null;
        if (!this.f2756h) {
            if (this.f2770v != null) {
                scrollTo(getScrollX(), this.f2770v.f2775a);
                this.f2770v = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i14 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = ((i13 - i11) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int d10 = d(scrollY, paddingTop, i14);
            if (d10 != scrollY) {
                scrollTo(getScrollX(), d10);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f2756h = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f2760l && View.MeasureSpec.getMode(i11) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(FrameLayout.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.q
    public boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        if (z10) {
            return false;
        }
        dispatchNestedFling(0.0f, f11, true);
        s((int) f11);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.q
    public boolean onNestedPreFling(View view, float f10, float f11) {
        return dispatchNestedPreFling(f10, f11);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.q
    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        k(view, i10, i11, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.q
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        C(i13, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.q
    public void onNestedScrollAccepted(View view, View view2, int i10) {
        i(view, view2, i10, 0);
    }

    @Override // android.view.View
    protected void onOverScrolled(int i10, int i11, boolean z10, boolean z11) {
        super.scrollTo(i10, i11);
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i10, Rect rect) {
        View findNextFocusFromRect;
        if (i10 == 2) {
            i10 = 130;
        } else if (i10 == 1) {
            i10 = 33;
        }
        if (rect == null) {
            findNextFocusFromRect = FocusFinder.getInstance().findNextFocus(this, null, i10);
        } else {
            findNextFocusFromRect = FocusFinder.getInstance().findNextFocusFromRect(this, rect, i10);
        }
        if (findNextFocusFromRect == null || z(findNextFocusFromRect)) {
            return false;
        }
        return findNextFocusFromRect.requestFocus(i10, rect);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f2770v = savedState;
        requestLayout();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f2775a = getScrollY();
        return savedState;
    }

    @Override // android.view.View
    protected void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        b bVar = this.f2774z;
        if (bVar != null) {
            bVar.a(this, i10, i11, i12, i13);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        View findFocus = findFocus();
        if (findFocus == null || this == findFocus || !B(findFocus, 0, i13)) {
            return;
        }
        findFocus.getDrawingRect(this.f2750b);
        offsetDescendantRectToMyCoords(findFocus, this.f2750b);
        h(e(this.f2750b));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.q
    public boolean onStartNestedScroll(View view, View view2, int i10) {
        return o(view, view2, i10, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.q
    public void onStopNestedScroll(View view) {
        j(view, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x01d8  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r24) {
        /*
            Method dump skipped, instructions count: 618
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean q(KeyEvent keyEvent) {
        this.f2750b.setEmpty();
        if (!c()) {
            if (!isFocused() || keyEvent.getKeyCode() == 4) {
                return false;
            }
            View findFocus = findFocus();
            if (findFocus == this) {
                findFocus = null;
            }
            View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, 130);
            return (findNextFocus == null || findNextFocus == this || !findNextFocus.requestFocus(130)) ? false : true;
        } else if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 19) {
                if (!keyEvent.isAltPressed()) {
                    return b(33);
                }
                return t(33);
            } else if (keyCode == 20) {
                if (!keyEvent.isAltPressed()) {
                    return b(130);
                }
                return t(130);
            } else if (keyCode != 62) {
                return false;
            } else {
                F(keyEvent.isShiftPressed() ? 33 : 130);
                return false;
            }
        } else {
            return false;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (!this.f2755g) {
            K(view2);
        } else {
            this.f2757i = view2;
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        return L(rect, z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        if (z10) {
            G();
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.f2755g = true;
        super.requestLayout();
    }

    public void s(int i10) {
        if (getChildCount() > 0) {
            this.f2751c.fling(getScrollX(), getScrollY(), 0, i10, 0, 0, RecyclerView.UNDEFINED_DURATION, Api.BaseClientBuilder.API_PRIORITY_OTHER, 0, 0);
            I(true);
        }
    }

    @Override // android.view.View
    public void scrollTo(int i10, int i11) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int d10 = d(i10, (getWidth() - getPaddingLeft()) - getPaddingRight(), childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin);
            int d11 = d(i11, (getHeight() - getPaddingTop()) - getPaddingBottom(), childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin);
            if (d10 == getScrollX() && d11 == getScrollY()) {
                return;
            }
            super.scrollTo(d10, d11);
        }
    }

    public void setFillViewport(boolean z10) {
        if (z10 != this.f2760l) {
            this.f2760l = z10;
            requestLayout();
        }
    }

    @Override // android.view.View, androidx.core.view.m
    public void setNestedScrollingEnabled(boolean z10) {
        this.f2772x.n(z10);
    }

    public void setOnScrollChangeListener(b bVar) {
        this.f2774z = bVar;
    }

    public void setSmoothScrollingEnabled(boolean z10) {
        this.f2761m = z10;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i10) {
        return Q(i10, 0);
    }

    @Override // android.view.View, androidx.core.view.m
    public void stopNestedScroll() {
        S(0);
    }

    public boolean t(int i10) {
        int childCount;
        boolean z10 = i10 == 130;
        int height = getHeight();
        Rect rect = this.f2750b;
        rect.top = 0;
        rect.bottom = height;
        if (z10 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.f2750b.bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
            Rect rect2 = this.f2750b;
            rect2.top = rect2.bottom - height;
        }
        Rect rect3 = this.f2750b;
        return J(i10, rect3.top, rect3.bottom);
    }

    public boolean u(int i10) {
        return this.f2772x.l(i10);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f2750b = new Rect();
        this.f2755g = true;
        this.f2756h = false;
        this.f2757i = null;
        this.f2758j = false;
        this.f2761m = true;
        this.f2765q = -1;
        this.f2766r = new int[2];
        this.f2767s = new int[2];
        this.f2752d = e.a(context, attributeSet);
        this.f2753e = e.a(context, attributeSet);
        x();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, B, i10, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.f2771w = new r(this);
        this.f2772x = new androidx.core.view.n(this);
        setNestedScrollingEnabled(true);
        z.q0(this, A);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10) {
        if (getChildCount() <= 0) {
            super.addView(view, i10);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i10, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }
}
