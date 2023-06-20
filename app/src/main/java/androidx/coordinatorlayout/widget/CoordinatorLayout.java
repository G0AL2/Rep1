package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.core.view.i0;
import androidx.core.view.o;
import androidx.core.view.p;
import androidx.core.view.r;
import androidx.core.view.s;
import androidx.core.view.z;
import androidx.customview.view.AbsSavedState;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements o, p {

    /* renamed from: u  reason: collision with root package name */
    static final String f2422u;

    /* renamed from: v  reason: collision with root package name */
    static final Class<?>[] f2423v;

    /* renamed from: w  reason: collision with root package name */
    static final ThreadLocal<Map<String, Constructor<c>>> f2424w;

    /* renamed from: x  reason: collision with root package name */
    static final Comparator<View> f2425x;

    /* renamed from: y  reason: collision with root package name */
    private static final h0.e<Rect> f2426y;

    /* renamed from: a  reason: collision with root package name */
    private final List<View> f2427a;

    /* renamed from: b  reason: collision with root package name */
    private final androidx.coordinatorlayout.widget.a<View> f2428b;

    /* renamed from: c  reason: collision with root package name */
    private final List<View> f2429c;

    /* renamed from: d  reason: collision with root package name */
    private final List<View> f2430d;

    /* renamed from: e  reason: collision with root package name */
    private Paint f2431e;

    /* renamed from: f  reason: collision with root package name */
    private final int[] f2432f;

    /* renamed from: g  reason: collision with root package name */
    private final int[] f2433g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f2434h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f2435i;

    /* renamed from: j  reason: collision with root package name */
    private int[] f2436j;

    /* renamed from: k  reason: collision with root package name */
    private View f2437k;

    /* renamed from: l  reason: collision with root package name */
    private View f2438l;

    /* renamed from: m  reason: collision with root package name */
    private g f2439m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f2440n;

    /* renamed from: o  reason: collision with root package name */
    private i0 f2441o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f2442p;

    /* renamed from: q  reason: collision with root package name */
    private Drawable f2443q;

    /* renamed from: r  reason: collision with root package name */
    ViewGroup.OnHierarchyChangeListener f2444r;

    /* renamed from: s  reason: collision with root package name */
    private s f2445s;

    /* renamed from: t  reason: collision with root package name */
    private final r f2446t;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements s {
        a() {
        }

        @Override // androidx.core.view.s
        public i0 a(View view, i0 i0Var) {
            return CoordinatorLayout.this.W(i0Var);
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        c getBehavior();
    }

    /* loaded from: classes.dex */
    public static abstract class c<V extends View> {
        public c() {
        }

        public boolean A(CoordinatorLayout coordinatorLayout, V v10, View view, View view2, int i10, int i11) {
            if (i11 == 0) {
                return z(coordinatorLayout, v10, view, view2, i10);
            }
            return false;
        }

        @Deprecated
        public void B(CoordinatorLayout coordinatorLayout, V v10, View view) {
        }

        public void C(CoordinatorLayout coordinatorLayout, V v10, View view, int i10) {
            if (i10 == 0) {
                B(coordinatorLayout, v10, view);
            }
        }

        public boolean D(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
            return false;
        }

        public boolean a(CoordinatorLayout coordinatorLayout, V v10) {
            return d(coordinatorLayout, v10) > 0.0f;
        }

        public boolean b(CoordinatorLayout coordinatorLayout, V v10, Rect rect) {
            return false;
        }

        public int c(CoordinatorLayout coordinatorLayout, V v10) {
            return -16777216;
        }

        public float d(CoordinatorLayout coordinatorLayout, V v10) {
            return 0.0f;
        }

        public boolean e(CoordinatorLayout coordinatorLayout, V v10, View view) {
            return false;
        }

        public i0 f(CoordinatorLayout coordinatorLayout, V v10, i0 i0Var) {
            return i0Var;
        }

        public void g(f fVar) {
        }

        public boolean h(CoordinatorLayout coordinatorLayout, V v10, View view) {
            return false;
        }

        public void i(CoordinatorLayout coordinatorLayout, V v10, View view) {
        }

        public void j() {
        }

        public boolean k(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
            return false;
        }

        public boolean l(CoordinatorLayout coordinatorLayout, V v10, int i10) {
            return false;
        }

        public boolean m(CoordinatorLayout coordinatorLayout, V v10, int i10, int i11, int i12, int i13) {
            return false;
        }

        public boolean n(CoordinatorLayout coordinatorLayout, V v10, View view, float f10, float f11, boolean z10) {
            return false;
        }

        public boolean o(CoordinatorLayout coordinatorLayout, V v10, View view, float f10, float f11) {
            return false;
        }

        @Deprecated
        public void p(CoordinatorLayout coordinatorLayout, V v10, View view, int i10, int i11, int[] iArr) {
        }

        public void q(CoordinatorLayout coordinatorLayout, V v10, View view, int i10, int i11, int[] iArr, int i12) {
            if (i12 == 0) {
                p(coordinatorLayout, v10, view, i10, i11, iArr);
            }
        }

        @Deprecated
        public void r(CoordinatorLayout coordinatorLayout, V v10, View view, int i10, int i11, int i12, int i13) {
        }

        @Deprecated
        public void s(CoordinatorLayout coordinatorLayout, V v10, View view, int i10, int i11, int i12, int i13, int i14) {
            if (i14 == 0) {
                r(coordinatorLayout, v10, view, i10, i11, i12, i13);
            }
        }

        public void t(CoordinatorLayout coordinatorLayout, V v10, View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
            iArr[0] = iArr[0] + i12;
            iArr[1] = iArr[1] + i13;
            s(coordinatorLayout, v10, view, i10, i11, i12, i13, i14);
        }

        @Deprecated
        public void u(CoordinatorLayout coordinatorLayout, V v10, View view, View view2, int i10) {
        }

        public void v(CoordinatorLayout coordinatorLayout, V v10, View view, View view2, int i10, int i11) {
            if (i11 == 0) {
                u(coordinatorLayout, v10, view, view2, i10);
            }
        }

        public boolean w(CoordinatorLayout coordinatorLayout, V v10, Rect rect, boolean z10) {
            return false;
        }

        public void x(CoordinatorLayout coordinatorLayout, V v10, Parcelable parcelable) {
        }

        public Parcelable y(CoordinatorLayout coordinatorLayout, V v10) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        @Deprecated
        public boolean z(CoordinatorLayout coordinatorLayout, V v10, View view, View view2, int i10) {
            return false;
        }

        public c(Context context, AttributeSet attributeSet) {
        }
    }

    @Retention(RetentionPolicy.RUNTIME)
    @Deprecated
    /* loaded from: classes.dex */
    public @interface d {
        Class<? extends c> value();
    }

    /* loaded from: classes.dex */
    private class e implements ViewGroup.OnHierarchyChangeListener {
        e() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f2444r;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout.this.H(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f2444r;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class g implements ViewTreeObserver.OnPreDrawListener {
        g() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            CoordinatorLayout.this.H(0);
            return true;
        }
    }

    /* loaded from: classes.dex */
    static class h implements Comparator<View> {
        h() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(View view, View view2) {
            float N = z.N(view);
            float N2 = z.N(view2);
            if (N > N2) {
                return -1;
            }
            return N < N2 ? 1 : 0;
        }
    }

    static {
        Package r02 = CoordinatorLayout.class.getPackage();
        f2422u = r02 != null ? r02.getName() : null;
        if (Build.VERSION.SDK_INT >= 21) {
            f2425x = new h();
        } else {
            f2425x = null;
        }
        f2423v = new Class[]{Context.class, AttributeSet.class};
        f2424w = new ThreadLocal<>();
        f2426y = new h0.f(12);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, v.a.f37725a);
    }

    private boolean A(View view) {
        return this.f2428b.j(view);
    }

    private void C(View view, int i10) {
        f fVar = (f) view.getLayoutParams();
        Rect a10 = a();
        a10.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
        if (this.f2441o != null && z.z(this) && !z.z(view)) {
            a10.left += this.f2441o.i();
            a10.top += this.f2441o.k();
            a10.right -= this.f2441o.j();
            a10.bottom -= this.f2441o.h();
        }
        Rect a11 = a();
        androidx.core.view.e.a(S(fVar.f2452c), view.getMeasuredWidth(), view.getMeasuredHeight(), a10, a11, i10);
        view.layout(a11.left, a11.top, a11.right, a11.bottom);
        O(a10);
        O(a11);
    }

    private void D(View view, View view2, int i10) {
        Rect a10 = a();
        Rect a11 = a();
        try {
            t(view2, a10);
            u(view, i10, a10, a11);
            view.layout(a11.left, a11.top, a11.right, a11.bottom);
        } finally {
            O(a10);
            O(a11);
        }
    }

    private void E(View view, int i10, int i11) {
        f fVar = (f) view.getLayoutParams();
        int b10 = androidx.core.view.e.b(T(fVar.f2452c), i11);
        int i12 = b10 & 7;
        int i13 = b10 & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (i11 == 1) {
            i10 = width - i10;
        }
        int w10 = w(i10) - measuredWidth;
        int i14 = 0;
        if (i12 == 1) {
            w10 += measuredWidth / 2;
        } else if (i12 == 5) {
            w10 += measuredWidth;
        }
        if (i13 == 16) {
            i14 = 0 + (measuredHeight / 2);
        } else if (i13 == 80) {
            i14 = measuredHeight + 0;
        }
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, Math.min(w10, ((width - getPaddingRight()) - measuredWidth) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, Math.min(i14, ((height - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin));
        view.layout(max, max2, measuredWidth + max, measuredHeight + max2);
    }

    private void F(View view, Rect rect, int i10) {
        boolean z10;
        boolean z11;
        int width;
        int i11;
        int i12;
        int i13;
        int height;
        int i14;
        int i15;
        int i16;
        if (z.U(view) && view.getWidth() > 0 && view.getHeight() > 0) {
            f fVar = (f) view.getLayoutParams();
            c f10 = fVar.f();
            Rect a10 = a();
            Rect a11 = a();
            a11.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            if (f10 != null && f10.b(this, view, a10)) {
                if (!a11.contains(a10)) {
                    throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + a10.toShortString() + " | Bounds:" + a11.toShortString());
                }
            } else {
                a10.set(a11);
            }
            O(a11);
            if (a10.isEmpty()) {
                O(a10);
                return;
            }
            int b10 = androidx.core.view.e.b(fVar.f2457h, i10);
            boolean z12 = true;
            if ((b10 & 48) != 48 || (i15 = (a10.top - ((ViewGroup.MarginLayoutParams) fVar).topMargin) - fVar.f2459j) >= (i16 = rect.top)) {
                z10 = false;
            } else {
                V(view, i16 - i15);
                z10 = true;
            }
            if ((b10 & 80) == 80 && (height = ((getHeight() - a10.bottom) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin) + fVar.f2459j) < (i14 = rect.bottom)) {
                V(view, height - i14);
                z10 = true;
            }
            if (!z10) {
                V(view, 0);
            }
            if ((b10 & 3) != 3 || (i12 = (a10.left - ((ViewGroup.MarginLayoutParams) fVar).leftMargin) - fVar.f2458i) >= (i13 = rect.left)) {
                z11 = false;
            } else {
                U(view, i13 - i12);
                z11 = true;
            }
            if ((b10 & 5) != 5 || (width = ((getWidth() - a10.right) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin) + fVar.f2458i) >= (i11 = rect.right)) {
                z12 = z11;
            } else {
                U(view, width - i11);
            }
            if (!z12) {
                U(view, 0);
            }
            O(a10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static c K(Context context, AttributeSet attributeSet, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(".")) {
            str = context.getPackageName() + str;
        } else if (str.indexOf(46) < 0) {
            String str2 = f2422u;
            if (!TextUtils.isEmpty(str2)) {
                str = str2 + '.' + str;
            }
        }
        try {
            ThreadLocal<Map<String, Constructor<c>>> threadLocal = f2424w;
            Map<String, Constructor<c>> map = threadLocal.get();
            if (map == null) {
                map = new HashMap<>();
                threadLocal.set(map);
            }
            Constructor<c> constructor = map.get(str);
            if (constructor == null) {
                constructor = Class.forName(str, false, context.getClassLoader()).getConstructor(f2423v);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return constructor.newInstance(context, attributeSet);
        } catch (Exception e10) {
            throw new RuntimeException("Could not inflate Behavior subclass " + str, e10);
        }
    }

    private boolean L(MotionEvent motionEvent, int i10) {
        int actionMasked = motionEvent.getActionMasked();
        List<View> list = this.f2429c;
        z(list);
        int size = list.size();
        MotionEvent motionEvent2 = null;
        boolean z10 = false;
        boolean z11 = false;
        for (int i11 = 0; i11 < size; i11++) {
            View view = list.get(i11);
            f fVar = (f) view.getLayoutParams();
            c f10 = fVar.f();
            if (!(z10 || z11) || actionMasked == 0) {
                if (!z10 && f10 != null) {
                    if (i10 == 0) {
                        z10 = f10.k(this, view, motionEvent);
                    } else if (i10 == 1) {
                        z10 = f10.D(this, view, motionEvent);
                    }
                    if (z10) {
                        this.f2437k = view;
                    }
                }
                boolean c10 = fVar.c();
                boolean i12 = fVar.i(this, view);
                z11 = i12 && !c10;
                if (i12 && !z11) {
                    break;
                }
            } else if (f10 != null) {
                if (motionEvent2 == null) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    motionEvent2 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                if (i10 == 0) {
                    f10.k(this, view, motionEvent2);
                } else if (i10 == 1) {
                    f10.D(this, view, motionEvent2);
                }
            }
        }
        list.clear();
        return z10;
    }

    private void M() {
        this.f2427a.clear();
        this.f2428b.c();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            f y10 = y(childAt);
            y10.d(this, childAt);
            this.f2428b.b(childAt);
            for (int i11 = 0; i11 < childCount; i11++) {
                if (i11 != i10) {
                    View childAt2 = getChildAt(i11);
                    if (y10.b(this, childAt, childAt2)) {
                        if (!this.f2428b.d(childAt2)) {
                            this.f2428b.b(childAt2);
                        }
                        this.f2428b.a(childAt2, childAt);
                    }
                }
            }
        }
        this.f2427a.addAll(this.f2428b.i());
        Collections.reverse(this.f2427a);
    }

    private static void O(Rect rect) {
        rect.setEmpty();
        f2426y.a(rect);
    }

    private void Q(boolean z10) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            c f10 = ((f) childAt.getLayoutParams()).f();
            if (f10 != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z10) {
                    f10.k(this, childAt, obtain);
                } else {
                    f10.D(this, childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i11 = 0; i11 < childCount; i11++) {
            ((f) getChildAt(i11).getLayoutParams()).m();
        }
        this.f2437k = null;
        this.f2434h = false;
    }

    private static int R(int i10) {
        if (i10 == 0) {
            return 17;
        }
        return i10;
    }

    private static int S(int i10) {
        if ((i10 & 7) == 0) {
            i10 |= 8388611;
        }
        return (i10 & 112) == 0 ? i10 | 48 : i10;
    }

    private static int T(int i10) {
        if (i10 == 0) {
            return 8388661;
        }
        return i10;
    }

    private void U(View view, int i10) {
        f fVar = (f) view.getLayoutParams();
        int i11 = fVar.f2458i;
        if (i11 != i10) {
            z.a0(view, i10 - i11);
            fVar.f2458i = i10;
        }
    }

    private void V(View view, int i10) {
        f fVar = (f) view.getLayoutParams();
        int i11 = fVar.f2459j;
        if (i11 != i10) {
            z.b0(view, i10 - i11);
            fVar.f2459j = i10;
        }
    }

    private void X() {
        if (Build.VERSION.SDK_INT < 21) {
            return;
        }
        if (z.z(this)) {
            if (this.f2445s == null) {
                this.f2445s = new a();
            }
            z.D0(this, this.f2445s);
            setSystemUiVisibility(1280);
            return;
        }
        z.D0(this, null);
    }

    private static Rect a() {
        Rect b10 = f2426y.b();
        return b10 == null ? new Rect() : b10;
    }

    private static int c(int i10, int i11, int i12) {
        return i10 < i11 ? i11 : i10 > i12 ? i12 : i10;
    }

    private void d(f fVar, Rect rect, int i10, int i11) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i10) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i11) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin));
        rect.set(max, max2, i10 + max, i11 + max2);
    }

    private i0 e(i0 i0Var) {
        c f10;
        if (i0Var.n()) {
            return i0Var;
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (z.z(childAt) && (f10 = ((f) childAt.getLayoutParams()).f()) != null) {
                i0Var = f10.f(this, childAt, i0Var);
                if (i0Var.n()) {
                    break;
                }
            }
        }
        return i0Var;
    }

    private void v(View view, int i10, Rect rect, Rect rect2, f fVar, int i11, int i12) {
        int width;
        int height;
        int b10 = androidx.core.view.e.b(R(fVar.f2452c), i10);
        int b11 = androidx.core.view.e.b(S(fVar.f2453d), i10);
        int i13 = b10 & 7;
        int i14 = b10 & 112;
        int i15 = b11 & 7;
        int i16 = b11 & 112;
        if (i15 == 1) {
            width = rect.left + (rect.width() / 2);
        } else if (i15 != 5) {
            width = rect.left;
        } else {
            width = rect.right;
        }
        if (i16 == 16) {
            height = rect.top + (rect.height() / 2);
        } else if (i16 != 80) {
            height = rect.top;
        } else {
            height = rect.bottom;
        }
        if (i13 == 1) {
            width -= i11 / 2;
        } else if (i13 != 5) {
            width -= i11;
        }
        if (i14 == 16) {
            height -= i12 / 2;
        } else if (i14 != 80) {
            height -= i12;
        }
        rect2.set(width, height, i11 + width, i12 + height);
    }

    private int w(int i10) {
        int[] iArr = this.f2436j;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i10);
            return 0;
        } else if (i10 >= 0 && i10 < iArr.length) {
            return iArr[i10];
        } else {
            Log.e("CoordinatorLayout", "Keyline index " + i10 + " out of range for " + this);
            return 0;
        }
    }

    private void z(List<View> list) {
        list.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i10 = childCount - 1; i10 >= 0; i10--) {
            list.add(getChildAt(isChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i10) : i10));
        }
        Comparator<View> comparator = f2425x;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
    }

    public boolean B(View view, int i10, int i11) {
        Rect a10 = a();
        t(view, a10);
        try {
            return a10.contains(i10, i11);
        } finally {
            O(a10);
        }
    }

    void G(View view, int i10) {
        c f10;
        f fVar = (f) view.getLayoutParams();
        if (fVar.f2460k != null) {
            Rect a10 = a();
            Rect a11 = a();
            Rect a12 = a();
            t(fVar.f2460k, a10);
            boolean z10 = false;
            q(view, false, a11);
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            v(view, i10, a10, a12, fVar, measuredWidth, measuredHeight);
            z10 = (a12.left == a11.left && a12.top == a11.top) ? true : true;
            d(fVar, a12, measuredWidth, measuredHeight);
            int i11 = a12.left - a11.left;
            int i12 = a12.top - a11.top;
            if (i11 != 0) {
                z.a0(view, i11);
            }
            if (i12 != 0) {
                z.b0(view, i12);
            }
            if (z10 && (f10 = fVar.f()) != null) {
                f10.h(this, view, fVar.f2460k);
            }
            O(a10);
            O(a11);
            O(a12);
        }
    }

    final void H(int i10) {
        boolean z10;
        int C = z.C(this);
        int size = this.f2427a.size();
        Rect a10 = a();
        Rect a11 = a();
        Rect a12 = a();
        for (int i11 = 0; i11 < size; i11++) {
            View view = this.f2427a.get(i11);
            f fVar = (f) view.getLayoutParams();
            if (i10 != 0 || view.getVisibility() != 8) {
                for (int i12 = 0; i12 < i11; i12++) {
                    if (fVar.f2461l == this.f2427a.get(i12)) {
                        G(view, C);
                    }
                }
                q(view, true, a11);
                if (fVar.f2456g != 0 && !a11.isEmpty()) {
                    int b10 = androidx.core.view.e.b(fVar.f2456g, C);
                    int i13 = b10 & 112;
                    if (i13 == 48) {
                        a10.top = Math.max(a10.top, a11.bottom);
                    } else if (i13 == 80) {
                        a10.bottom = Math.max(a10.bottom, getHeight() - a11.top);
                    }
                    int i14 = b10 & 7;
                    if (i14 == 3) {
                        a10.left = Math.max(a10.left, a11.right);
                    } else if (i14 == 5) {
                        a10.right = Math.max(a10.right, getWidth() - a11.left);
                    }
                }
                if (fVar.f2457h != 0 && view.getVisibility() == 0) {
                    F(view, a10, C);
                }
                if (i10 != 2) {
                    x(view, a12);
                    if (!a12.equals(a11)) {
                        N(view, a11);
                    }
                }
                for (int i15 = i11 + 1; i15 < size; i15++) {
                    View view2 = this.f2427a.get(i15);
                    f fVar2 = (f) view2.getLayoutParams();
                    c f10 = fVar2.f();
                    if (f10 != null && f10.e(this, view2, view)) {
                        if (i10 == 0 && fVar2.g()) {
                            fVar2.k();
                        } else {
                            if (i10 != 2) {
                                z10 = f10.h(this, view2, view);
                            } else {
                                f10.i(this, view2, view);
                                z10 = true;
                            }
                            if (i10 == 1) {
                                fVar2.p(z10);
                            }
                        }
                    }
                }
            }
        }
        O(a10);
        O(a11);
        O(a12);
    }

    public void I(View view, int i10) {
        f fVar = (f) view.getLayoutParams();
        if (!fVar.a()) {
            View view2 = fVar.f2460k;
            if (view2 != null) {
                D(view, view2, i10);
                return;
            }
            int i11 = fVar.f2454e;
            if (i11 >= 0) {
                E(view, i11, i10);
                return;
            } else {
                C(view, i10);
                return;
            }
        }
        throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
    }

    public void J(View view, int i10, int i11, int i12, int i13) {
        measureChildWithMargins(view, i10, i11, i12, i13);
    }

    void N(View view, Rect rect) {
        ((f) view.getLayoutParams()).q(rect);
    }

    void P() {
        if (this.f2435i && this.f2439m != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f2439m);
        }
        this.f2440n = false;
    }

    final i0 W(i0 i0Var) {
        if (h0.c.a(this.f2441o, i0Var)) {
            return i0Var;
        }
        this.f2441o = i0Var;
        boolean z10 = true;
        boolean z11 = i0Var != null && i0Var.k() > 0;
        this.f2442p = z11;
        setWillNotDraw((z11 || getBackground() != null) ? false : false);
        i0 e10 = e(i0Var);
        requestLayout();
        return e10;
    }

    void b() {
        if (this.f2435i) {
            if (this.f2439m == null) {
                this.f2439m = new g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f2439m);
        }
        this.f2440n = true;
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof f) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j10) {
        f fVar = (f) view.getLayoutParams();
        c cVar = fVar.f2450a;
        if (cVar != null) {
            float d10 = cVar.d(this, view);
            if (d10 > 0.0f) {
                if (this.f2431e == null) {
                    this.f2431e = new Paint();
                }
                this.f2431e.setColor(fVar.f2450a.c(this, view));
                this.f2431e.setAlpha(c(Math.round(d10 * 255.0f), 0, 255));
                int save = canvas.save();
                if (view.isOpaque()) {
                    canvas.clipRect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), Region.Op.DIFFERENCE);
                }
                canvas.drawRect(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom(), this.f2431e);
                canvas.restoreToCount(save);
            }
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f2443q;
        boolean z10 = false;
        if (drawable != null && drawable.isStateful()) {
            z10 = false | drawable.setState(drawableState);
        }
        if (z10) {
            invalidate();
        }
    }

    public void f(View view) {
        List g10 = this.f2428b.g(view);
        if (g10 == null || g10.isEmpty()) {
            return;
        }
        for (int i10 = 0; i10 < g10.size(); i10++) {
            View view2 = (View) g10.get(i10);
            c f10 = ((f) view2.getLayoutParams()).f();
            if (f10 != null) {
                f10.h(this, view2, view);
            }
        }
    }

    void g() {
        int childCount = getChildCount();
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= childCount) {
                break;
            } else if (A(getChildAt(i10))) {
                z10 = true;
                break;
            } else {
                i10++;
            }
        }
        if (z10 != this.f2440n) {
            if (z10) {
                b();
            } else {
                P();
            }
        }
    }

    final List<View> getDependencySortedChildren() {
        M();
        return Collections.unmodifiableList(this.f2427a);
    }

    public final i0 getLastWindowInsets() {
        return this.f2441o;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f2446t.a();
    }

    public Drawable getStatusBarBackground() {
        return this.f2443q;
    }

    @Override // android.view.View
    protected int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    @Override // android.view.View
    protected int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: h */
    public f generateDefaultLayoutParams() {
        return new f(-2, -2);
    }

    @Override // androidx.core.view.o
    public void i(View view, View view2, int i10, int i11) {
        c f10;
        this.f2446t.c(view, view2, i10, i11);
        this.f2438l = view2;
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            f fVar = (f) childAt.getLayoutParams();
            if (fVar.j(i11) && (f10 = fVar.f()) != null) {
                f10.v(this, childAt, view, view2, i10, i11);
            }
        }
    }

    @Override // androidx.core.view.o
    public void j(View view, int i10) {
        this.f2446t.e(view, i10);
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            f fVar = (f) childAt.getLayoutParams();
            if (fVar.j(i10)) {
                c f10 = fVar.f();
                if (f10 != null) {
                    f10.C(this, childAt, view, i10);
                }
                fVar.l(i10);
                fVar.k();
            }
        }
        this.f2438l = null;
    }

    @Override // androidx.core.view.o
    public void k(View view, int i10, int i11, int[] iArr, int i12) {
        c f10;
        int childCount = getChildCount();
        boolean z10 = false;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.j(i12) && (f10 = fVar.f()) != null) {
                    int[] iArr2 = this.f2432f;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    f10.q(this, childAt, view, i10, i11, iArr2, i12);
                    int[] iArr3 = this.f2432f;
                    i13 = i10 > 0 ? Math.max(i13, iArr3[0]) : Math.min(i13, iArr3[0]);
                    int[] iArr4 = this.f2432f;
                    i14 = i11 > 0 ? Math.max(i14, iArr4[1]) : Math.min(i14, iArr4[1]);
                    z10 = true;
                }
            }
        }
        iArr[0] = i13;
        iArr[1] = i14;
        if (z10) {
            H(1);
        }
    }

    @Override // android.view.ViewGroup
    /* renamed from: l */
    public f generateLayoutParams(AttributeSet attributeSet) {
        return new f(getContext(), attributeSet);
    }

    @Override // androidx.core.view.p
    public void m(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        c f10;
        int min;
        int childCount = getChildCount();
        boolean z10 = false;
        int i15 = 0;
        int i16 = 0;
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt = getChildAt(i17);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.j(i14) && (f10 = fVar.f()) != null) {
                    int[] iArr2 = this.f2432f;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    f10.t(this, childAt, view, i10, i11, i12, i13, i14, iArr2);
                    int[] iArr3 = this.f2432f;
                    i15 = i12 > 0 ? Math.max(i15, iArr3[0]) : Math.min(i15, iArr3[0]);
                    if (i13 > 0) {
                        min = Math.max(i16, this.f2432f[1]);
                    } else {
                        min = Math.min(i16, this.f2432f[1]);
                    }
                    i16 = min;
                    z10 = true;
                }
            }
        }
        iArr[0] = iArr[0] + i15;
        iArr[1] = iArr[1] + i16;
        if (z10) {
            H(1);
        }
    }

    @Override // androidx.core.view.o
    public void n(View view, int i10, int i11, int i12, int i13, int i14) {
        m(view, i10, i11, i12, i13, 0, this.f2433g);
    }

    @Override // androidx.core.view.o
    public boolean o(View view, View view2, int i10, int i11) {
        int childCount = getChildCount();
        boolean z10 = false;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                c f10 = fVar.f();
                if (f10 != null) {
                    boolean A = f10.A(this, childAt, view, view2, i10, i11);
                    z10 |= A;
                    fVar.r(i11, A);
                } else {
                    fVar.r(i11, false);
                }
            }
        }
        return z10;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Q(false);
        if (this.f2440n) {
            if (this.f2439m == null) {
                this.f2439m = new g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f2439m);
        }
        if (this.f2441o == null && z.z(this)) {
            z.n0(this);
        }
        this.f2435i = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Q(false);
        if (this.f2440n && this.f2439m != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f2439m);
        }
        View view = this.f2438l;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.f2435i = false;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f2442p || this.f2443q == null) {
            return;
        }
        i0 i0Var = this.f2441o;
        int k10 = i0Var != null ? i0Var.k() : 0;
        if (k10 > 0) {
            this.f2443q.setBounds(0, 0, getWidth(), k10);
            this.f2443q.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            Q(true);
        }
        boolean L = L(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            Q(true);
        }
        return L;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        c f10;
        int C = z.C(this);
        int size = this.f2427a.size();
        for (int i14 = 0; i14 < size; i14++) {
            View view = this.f2427a.get(i14);
            if (view.getVisibility() != 8 && ((f10 = ((f) view.getLayoutParams()).f()) == null || !f10.l(this, view, C))) {
                I(view, C);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x011a, code lost:
        if (r0.m(r30, r20, r11, r21, r23, 0) == false) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x011d  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onMeasure(int r31, int r32) {
        /*
            Method dump skipped, instructions count: 391
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.q
    public boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        c f12;
        int childCount = getChildCount();
        boolean z11 = false;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.j(0) && (f12 = fVar.f()) != null) {
                    z11 |= f12.n(this, childAt, view, f10, f11, z10);
                }
            }
        }
        if (z11) {
            H(1);
        }
        return z11;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.q
    public boolean onNestedPreFling(View view, float f10, float f11) {
        c f12;
        int childCount = getChildCount();
        boolean z10 = false;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.j(0) && (f12 = fVar.f()) != null) {
                    z10 |= f12.o(this, childAt, view, f10, f11);
                }
            }
        }
        return z10;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.q
    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        k(view, i10, i11, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.q
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        n(view, i10, i11, i12, i13, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.q
    public void onNestedScrollAccepted(View view, View view2, int i10) {
        i(view, view2, i10, 0);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.c());
        SparseArray<Parcelable> sparseArray = savedState.f2447c;
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            int id2 = childAt.getId();
            c f10 = y(childAt).f();
            if (id2 != -1 && f10 != null && (parcelable2 = sparseArray.get(id2)) != null) {
                f10.x(this, childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Parcelable y10;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            int id2 = childAt.getId();
            c f10 = ((f) childAt.getLayoutParams()).f();
            if (id2 != -1 && f10 != null && (y10 = f10.y(this, childAt)) != null) {
                sparseArray.append(id2, y10);
            }
        }
        savedState.f2447c = sparseArray;
        return savedState;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.q
    public boolean onStartNestedScroll(View view, View view2, int i10) {
        return o(view, view2, i10, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.q
    public void onStopNestedScroll(View view) {
        j(view, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
        if (r3 != false) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r18.getActionMasked()
            android.view.View r3 = r0.f2437k
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L15
            boolean r3 = r0.L(r1, r4)
            if (r3 == 0) goto L2b
            goto L16
        L15:
            r3 = 0
        L16:
            android.view.View r6 = r0.f2437k
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r6 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r6
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r6 = r6.f()
            if (r6 == 0) goto L2b
            android.view.View r7 = r0.f2437k
            boolean r6 = r6.D(r0, r7, r1)
            goto L2c
        L2b:
            r6 = 0
        L2c:
            android.view.View r7 = r0.f2437k
            r8 = 0
            if (r7 != 0) goto L37
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L4a
        L37:
            if (r3 == 0) goto L4a
            long r11 = android.os.SystemClock.uptimeMillis()
            r13 = 3
            r14 = 0
            r15 = 0
            r16 = 0
            r9 = r11
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L4a:
            if (r8 == 0) goto L4f
            r8.recycle()
        L4f:
            if (r2 == r4) goto L54
            r1 = 3
            if (r2 != r1) goto L57
        L54:
            r0.Q(r5)
        L57:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: p */
    public f generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof f) {
            return new f((f) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new f((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new f(layoutParams);
    }

    void q(View view, boolean z10, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z10) {
            t(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    public List<View> r(View view) {
        List<View> h10 = this.f2428b.h(view);
        this.f2430d.clear();
        if (h10 != null) {
            this.f2430d.addAll(h10);
        }
        return this.f2430d;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        c f10 = ((f) view.getLayoutParams()).f();
        if (f10 == null || !f10.w(this, view, rect, z10)) {
            return super.requestChildRectangleOnScreen(view, rect, z10);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        super.requestDisallowInterceptTouchEvent(z10);
        if (!z10 || this.f2434h) {
            return;
        }
        Q(false);
        this.f2434h = true;
    }

    public List<View> s(View view) {
        List g10 = this.f2428b.g(view);
        this.f2430d.clear();
        if (g10 != null) {
            this.f2430d.addAll(g10);
        }
        return this.f2430d;
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z10) {
        super.setFitsSystemWindows(z10);
        X();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f2444r = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.f2443q;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable mutate = drawable != null ? drawable.mutate() : null;
            this.f2443q = mutate;
            if (mutate != null) {
                if (mutate.isStateful()) {
                    this.f2443q.setState(getDrawableState());
                }
                androidx.core.graphics.drawable.a.m(this.f2443q, z.C(this));
                this.f2443q.setVisible(getVisibility() == 0, false);
                this.f2443q.setCallback(this);
            }
            z.h0(this);
        }
    }

    public void setStatusBarBackgroundColor(int i10) {
        setStatusBarBackground(new ColorDrawable(i10));
    }

    public void setStatusBarBackgroundResource(int i10) {
        setStatusBarBackground(i10 != 0 ? androidx.core.content.b.f(getContext(), i10) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z10 = i10 == 0;
        Drawable drawable = this.f2443q;
        if (drawable == null || drawable.isVisible() == z10) {
            return;
        }
        this.f2443q.setVisible(z10, false);
    }

    void t(View view, Rect rect) {
        androidx.coordinatorlayout.widget.b.a(this, view, rect);
    }

    void u(View view, int i10, Rect rect, Rect rect2) {
        f fVar = (f) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        v(view, i10, rect, rect2, fVar, measuredWidth, measuredHeight);
        d(fVar, rect2, measuredWidth, measuredHeight);
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f2443q;
    }

    void x(View view, Rect rect) {
        rect.set(((f) view.getLayoutParams()).h());
    }

    f y(View view) {
        f fVar = (f) view.getLayoutParams();
        if (!fVar.f2451b) {
            if (view instanceof b) {
                c behavior = ((b) view).getBehavior();
                if (behavior == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                fVar.o(behavior);
                fVar.f2451b = true;
            } else {
                d dVar = null;
                for (Class<?> cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                    dVar = (d) cls.getAnnotation(d.class);
                    if (dVar != null) {
                        break;
                    }
                }
                if (dVar != null) {
                    try {
                        fVar.o(dVar.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                    } catch (Exception e10) {
                        Log.e("CoordinatorLayout", "Default behavior class " + dVar.value().getName() + " could not be instantiated. Did you forget a default constructor?", e10);
                    }
                }
                fVar.f2451b = true;
            }
        }
        return fVar;
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        TypedArray obtainStyledAttributes;
        this.f2427a = new ArrayList();
        this.f2428b = new androidx.coordinatorlayout.widget.a<>();
        this.f2429c = new ArrayList();
        this.f2430d = new ArrayList();
        this.f2432f = new int[2];
        this.f2433g = new int[2];
        this.f2446t = new r(this);
        if (i10 == 0) {
            obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, v.c.f37727a, 0, v.b.f37726a);
        } else {
            obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, v.c.f37727a, i10, 0);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            if (i10 == 0) {
                saveAttributeDataForStyleable(context, v.c.f37727a, attributeSet, obtainStyledAttributes, 0, v.b.f37726a);
            } else {
                saveAttributeDataForStyleable(context, v.c.f37727a, attributeSet, obtainStyledAttributes, i10, 0);
            }
        }
        int resourceId = obtainStyledAttributes.getResourceId(v.c.f37728b, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.f2436j = resources.getIntArray(resourceId);
            float f10 = resources.getDisplayMetrics().density;
            int length = this.f2436j.length;
            for (int i11 = 0; i11 < length; i11++) {
                int[] iArr = this.f2436j;
                iArr[i11] = (int) (iArr[i11] * f10);
            }
        }
        this.f2443q = obtainStyledAttributes.getDrawable(v.c.f37729c);
        obtainStyledAttributes.recycle();
        X();
        super.setOnHierarchyChangeListener(new e());
        if (z.A(this) == 0) {
            z.A0(this, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        SparseArray<Parcelable> f2447c;

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
            int readInt = parcel.readInt();
            int[] iArr = new int[readInt];
            parcel.readIntArray(iArr);
            Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
            this.f2447c = new SparseArray<>(readInt);
            for (int i10 = 0; i10 < readInt; i10++) {
                this.f2447c.append(iArr[i10], readParcelableArray[i10]);
            }
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            SparseArray<Parcelable> sparseArray = this.f2447c;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i11 = 0; i11 < size; i11++) {
                iArr[i11] = this.f2447c.keyAt(i11);
                parcelableArr[i11] = this.f2447c.valueAt(i11);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i10);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* loaded from: classes.dex */
    public static class f extends ViewGroup.MarginLayoutParams {

        /* renamed from: a  reason: collision with root package name */
        c f2450a;

        /* renamed from: b  reason: collision with root package name */
        boolean f2451b;

        /* renamed from: c  reason: collision with root package name */
        public int f2452c;

        /* renamed from: d  reason: collision with root package name */
        public int f2453d;

        /* renamed from: e  reason: collision with root package name */
        public int f2454e;

        /* renamed from: f  reason: collision with root package name */
        int f2455f;

        /* renamed from: g  reason: collision with root package name */
        public int f2456g;

        /* renamed from: h  reason: collision with root package name */
        public int f2457h;

        /* renamed from: i  reason: collision with root package name */
        int f2458i;

        /* renamed from: j  reason: collision with root package name */
        int f2459j;

        /* renamed from: k  reason: collision with root package name */
        View f2460k;

        /* renamed from: l  reason: collision with root package name */
        View f2461l;

        /* renamed from: m  reason: collision with root package name */
        private boolean f2462m;

        /* renamed from: n  reason: collision with root package name */
        private boolean f2463n;

        /* renamed from: o  reason: collision with root package name */
        private boolean f2464o;

        /* renamed from: p  reason: collision with root package name */
        private boolean f2465p;

        /* renamed from: q  reason: collision with root package name */
        final Rect f2466q;

        public f(int i10, int i11) {
            super(i10, i11);
            this.f2451b = false;
            this.f2452c = 0;
            this.f2453d = 0;
            this.f2454e = -1;
            this.f2455f = -1;
            this.f2456g = 0;
            this.f2457h = 0;
            this.f2466q = new Rect();
        }

        private void n(View view, CoordinatorLayout coordinatorLayout) {
            View findViewById = coordinatorLayout.findViewById(this.f2455f);
            this.f2460k = findViewById;
            if (findViewById == null) {
                if (coordinatorLayout.isInEditMode()) {
                    this.f2461l = null;
                    this.f2460k = null;
                    return;
                }
                throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + coordinatorLayout.getResources().getResourceName(this.f2455f) + " to anchor view " + view);
            } else if (findViewById == coordinatorLayout) {
                if (coordinatorLayout.isInEditMode()) {
                    this.f2461l = null;
                    this.f2460k = null;
                    return;
                }
                throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
            } else {
                for (ViewParent parent = findViewById.getParent(); parent != coordinatorLayout && parent != null; parent = parent.getParent()) {
                    if (parent == view) {
                        if (coordinatorLayout.isInEditMode()) {
                            this.f2461l = null;
                            this.f2460k = null;
                            return;
                        }
                        throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                    }
                    if (parent instanceof View) {
                        findViewById = (View) parent;
                    }
                }
                this.f2461l = findViewById;
            }
        }

        private boolean s(View view, int i10) {
            int b10 = androidx.core.view.e.b(((f) view.getLayoutParams()).f2456g, i10);
            return b10 != 0 && (androidx.core.view.e.b(this.f2457h, i10) & b10) == b10;
        }

        private boolean t(View view, CoordinatorLayout coordinatorLayout) {
            if (this.f2460k.getId() != this.f2455f) {
                return false;
            }
            View view2 = this.f2460k;
            for (ViewParent parent = view2.getParent(); parent != coordinatorLayout; parent = parent.getParent()) {
                if (parent != null && parent != view) {
                    if (parent instanceof View) {
                        view2 = (View) parent;
                    }
                } else {
                    this.f2461l = null;
                    this.f2460k = null;
                    return false;
                }
            }
            this.f2461l = view2;
            return true;
        }

        boolean a() {
            return this.f2460k == null && this.f2455f != -1;
        }

        boolean b(CoordinatorLayout coordinatorLayout, View view, View view2) {
            c cVar;
            return view2 == this.f2461l || s(view2, z.C(coordinatorLayout)) || ((cVar = this.f2450a) != null && cVar.e(coordinatorLayout, view, view2));
        }

        boolean c() {
            if (this.f2450a == null) {
                this.f2462m = false;
            }
            return this.f2462m;
        }

        View d(CoordinatorLayout coordinatorLayout, View view) {
            if (this.f2455f == -1) {
                this.f2461l = null;
                this.f2460k = null;
                return null;
            }
            if (this.f2460k == null || !t(view, coordinatorLayout)) {
                n(view, coordinatorLayout);
            }
            return this.f2460k;
        }

        public int e() {
            return this.f2455f;
        }

        public c f() {
            return this.f2450a;
        }

        boolean g() {
            return this.f2465p;
        }

        Rect h() {
            return this.f2466q;
        }

        boolean i(CoordinatorLayout coordinatorLayout, View view) {
            boolean z10 = this.f2462m;
            if (z10) {
                return true;
            }
            c cVar = this.f2450a;
            boolean a10 = (cVar != null ? cVar.a(coordinatorLayout, view) : false) | z10;
            this.f2462m = a10;
            return a10;
        }

        boolean j(int i10) {
            if (i10 != 0) {
                if (i10 != 1) {
                    return false;
                }
                return this.f2464o;
            }
            return this.f2463n;
        }

        void k() {
            this.f2465p = false;
        }

        void l(int i10) {
            r(i10, false);
        }

        void m() {
            this.f2462m = false;
        }

        public void o(c cVar) {
            c cVar2 = this.f2450a;
            if (cVar2 != cVar) {
                if (cVar2 != null) {
                    cVar2.j();
                }
                this.f2450a = cVar;
                this.f2451b = true;
                if (cVar != null) {
                    cVar.g(this);
                }
            }
        }

        void p(boolean z10) {
            this.f2465p = z10;
        }

        void q(Rect rect) {
            this.f2466q.set(rect);
        }

        void r(int i10, boolean z10) {
            if (i10 == 0) {
                this.f2463n = z10;
            } else if (i10 != 1) {
            } else {
                this.f2464o = z10;
            }
        }

        f(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f2451b = false;
            this.f2452c = 0;
            this.f2453d = 0;
            this.f2454e = -1;
            this.f2455f = -1;
            this.f2456g = 0;
            this.f2457h = 0;
            this.f2466q = new Rect();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, v.c.f37730d);
            this.f2452c = obtainStyledAttributes.getInteger(v.c.f37731e, 0);
            this.f2455f = obtainStyledAttributes.getResourceId(v.c.f37732f, -1);
            this.f2453d = obtainStyledAttributes.getInteger(v.c.f37733g, 0);
            this.f2454e = obtainStyledAttributes.getInteger(v.c.f37737k, -1);
            this.f2456g = obtainStyledAttributes.getInt(v.c.f37736j, 0);
            this.f2457h = obtainStyledAttributes.getInt(v.c.f37735i, 0);
            int i10 = v.c.f37734h;
            boolean hasValue = obtainStyledAttributes.hasValue(i10);
            this.f2451b = hasValue;
            if (hasValue) {
                this.f2450a = CoordinatorLayout.K(context, attributeSet, obtainStyledAttributes.getString(i10));
            }
            obtainStyledAttributes.recycle();
            c cVar = this.f2450a;
            if (cVar != null) {
                cVar.g(this);
            }
        }

        public f(f fVar) {
            super((ViewGroup.MarginLayoutParams) fVar);
            this.f2451b = false;
            this.f2452c = 0;
            this.f2453d = 0;
            this.f2454e = -1;
            this.f2455f = -1;
            this.f2456g = 0;
            this.f2457h = 0;
            this.f2466q = new Rect();
        }

        public f(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f2451b = false;
            this.f2452c = 0;
            this.f2453d = 0;
            this.f2454e = -1;
            this.f2455f = -1;
            this.f2456g = 0;
            this.f2457h = 0;
            this.f2466q = new Rect();
        }

        public f(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f2451b = false;
            this.f2452c = 0;
            this.f2453d = 0;
            this.f2454e = -1;
            this.f2455f = -1;
            this.f2456g = 0;
            this.f2457h = 0;
            this.f2466q = new Rect();
        }
    }
}
