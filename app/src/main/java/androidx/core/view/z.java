package androidx.core.view;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContentInfo;
import android.view.Display;
import android.view.KeyEvent;
import android.view.OnReceiveContentListener;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.core.view.a;
import androidx.core.view.i0;
import androidx.core.view.z;
import i0.c;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: ViewCompat.java */
@SuppressLint({"PrivateConstructorForUtilityClass"})
/* loaded from: classes.dex */
public class z {

    /* renamed from: b  reason: collision with root package name */
    private static Field f2725b;

    /* renamed from: c  reason: collision with root package name */
    private static boolean f2726c;

    /* renamed from: d  reason: collision with root package name */
    private static Field f2727d;

    /* renamed from: e  reason: collision with root package name */
    private static boolean f2728e;

    /* renamed from: f  reason: collision with root package name */
    private static WeakHashMap<View, String> f2729f;

    /* renamed from: h  reason: collision with root package name */
    private static Field f2731h;

    /* renamed from: j  reason: collision with root package name */
    private static ThreadLocal<Rect> f2733j;

    /* renamed from: a  reason: collision with root package name */
    private static final AtomicInteger f2724a = new AtomicInteger(1);

    /* renamed from: g  reason: collision with root package name */
    private static WeakHashMap<View, e0> f2730g = null;

    /* renamed from: i  reason: collision with root package name */
    private static boolean f2732i = false;

    /* renamed from: k  reason: collision with root package name */
    private static final androidx.core.view.u f2734k = new androidx.core.view.u() { // from class: androidx.core.view.y
        @Override // androidx.core.view.u
        public final c a(c cVar) {
            c Y;
            Y = z.Y(cVar);
            return Y;
        }
    };

    /* renamed from: l  reason: collision with root package name */
    private static final e f2735l = new e();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    public class a extends f<Boolean> {
        a(int i10, Class cls, int i11) {
            super(i10, cls, i11);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.z.f
        /* renamed from: i */
        public Boolean d(View view) {
            return Boolean.valueOf(q.d(view));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.z.f
        /* renamed from: j */
        public void e(View view, Boolean bool) {
            q.i(view, bool.booleanValue());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.z.f
        /* renamed from: k */
        public boolean h(Boolean bool, Boolean bool2) {
            return !a(bool, bool2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    public class b extends f<CharSequence> {
        b(int i10, Class cls, int i11, int i12) {
            super(i10, cls, i11, i12);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.z.f
        /* renamed from: i */
        public CharSequence d(View view) {
            return q.b(view);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.z.f
        /* renamed from: j */
        public void e(View view, CharSequence charSequence) {
            q.h(view, charSequence);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.z.f
        /* renamed from: k */
        public boolean h(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    public class c extends f<CharSequence> {
        c(int i10, Class cls, int i11, int i12) {
            super(i10, cls, i11, i12);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.z.f
        /* renamed from: i */
        public CharSequence d(View view) {
            return s.a(view);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.z.f
        /* renamed from: j */
        public void e(View view, CharSequence charSequence) {
            s.b(view, charSequence);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.z.f
        /* renamed from: k */
        public boolean h(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    public class d extends f<Boolean> {
        d(int i10, Class cls, int i11) {
            super(i10, cls, i11);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.z.f
        /* renamed from: i */
        public Boolean d(View view) {
            return Boolean.valueOf(q.c(view));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.z.f
        /* renamed from: j */
        public void e(View view, Boolean bool) {
            q.g(view, bool.booleanValue());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.z.f
        /* renamed from: k */
        public boolean h(Boolean bool, Boolean bool2) {
            return !a(bool, bool2);
        }
    }

    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    static class e implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

        /* renamed from: a  reason: collision with root package name */
        private final WeakHashMap<View, Boolean> f2736a = new WeakHashMap<>();

        e() {
        }

        private void b(View view, boolean z10) {
            boolean z11 = view.getVisibility() == 0;
            if (z10 != z11) {
                z.Z(view, z11 ? 16 : 32);
                this.f2736a.put(view, Boolean.valueOf(z11));
            }
        }

        private void c(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        private void e(View view) {
            h.o(view.getViewTreeObserver(), this);
        }

        void a(View view) {
            this.f2736a.put(view, Boolean.valueOf(view.getVisibility() == 0));
            view.addOnAttachStateChangeListener(this);
            if (k.b(view)) {
                c(view);
            }
        }

        void d(View view) {
            this.f2736a.remove(view);
            view.removeOnAttachStateChangeListener(this);
            e(view);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (Build.VERSION.SDK_INT < 28) {
                for (Map.Entry<View, Boolean> entry : this.f2736a.entrySet()) {
                    b(entry.getKey(), entry.getValue().booleanValue());
                }
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            c(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    public static abstract class f<T> {

        /* renamed from: a  reason: collision with root package name */
        private final int f2737a;

        /* renamed from: b  reason: collision with root package name */
        private final Class<T> f2738b;

        /* renamed from: c  reason: collision with root package name */
        private final int f2739c;

        /* renamed from: d  reason: collision with root package name */
        private final int f2740d;

        f(int i10, Class<T> cls, int i11) {
            this(i10, cls, 0, i11);
        }

        private boolean b() {
            return Build.VERSION.SDK_INT >= 19;
        }

        private boolean c() {
            return Build.VERSION.SDK_INT >= this.f2739c;
        }

        boolean a(Boolean bool, Boolean bool2) {
            return (bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue());
        }

        abstract T d(View view);

        abstract void e(View view, T t10);

        T f(View view) {
            if (c()) {
                return d(view);
            }
            if (b()) {
                T t10 = (T) view.getTag(this.f2737a);
                if (this.f2738b.isInstance(t10)) {
                    return t10;
                }
                return null;
            }
            return null;
        }

        void g(View view, T t10) {
            if (c()) {
                e(view, t10);
            } else if (b() && h(f(view), t10)) {
                z.k(view);
                view.setTag(this.f2737a, t10);
                z.Z(view, this.f2740d);
            }
        }

        abstract boolean h(T t10, T t11);

        f(int i10, Class<T> cls, int i11, int i12) {
            this.f2737a = i10;
            this.f2738b = cls;
            this.f2740d = i11;
            this.f2739c = i12;
        }
    }

    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    static class g {
        static boolean a(View view) {
            return view.hasOnClickListeners();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    public static class h {
        static AccessibilityNodeProvider a(View view) {
            return view.getAccessibilityNodeProvider();
        }

        static boolean b(View view) {
            return view.getFitsSystemWindows();
        }

        static int c(View view) {
            return view.getImportantForAccessibility();
        }

        static int d(View view) {
            return view.getMinimumHeight();
        }

        static int e(View view) {
            return view.getMinimumWidth();
        }

        static ViewParent f(View view) {
            return view.getParentForAccessibility();
        }

        static int g(View view) {
            return view.getWindowSystemUiVisibility();
        }

        static boolean h(View view) {
            return view.hasOverlappingRendering();
        }

        static boolean i(View view) {
            return view.hasTransientState();
        }

        static boolean j(View view, int i10, Bundle bundle) {
            return view.performAccessibilityAction(i10, bundle);
        }

        static void k(View view) {
            view.postInvalidateOnAnimation();
        }

        static void l(View view, int i10, int i11, int i12, int i13) {
            view.postInvalidateOnAnimation(i10, i11, i12, i13);
        }

        static void m(View view, Runnable runnable) {
            view.postOnAnimation(runnable);
        }

        static void n(View view, Runnable runnable, long j10) {
            view.postOnAnimationDelayed(runnable, j10);
        }

        static void o(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }

        static void p(View view) {
            view.requestFitSystemWindows();
        }

        static void q(View view, Drawable drawable) {
            view.setBackground(drawable);
        }

        static void r(View view, boolean z10) {
            view.setHasTransientState(z10);
        }

        static void s(View view, int i10) {
            view.setImportantForAccessibility(i10);
        }
    }

    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    static class i {
        static int a() {
            return View.generateViewId();
        }

        static Display b(View view) {
            return view.getDisplay();
        }

        static int c(View view) {
            return view.getLabelFor();
        }

        static int d(View view) {
            return view.getLayoutDirection();
        }

        static int e(View view) {
            return view.getPaddingEnd();
        }

        static int f(View view) {
            return view.getPaddingStart();
        }

        static boolean g(View view) {
            return view.isPaddingRelative();
        }

        static void h(View view, int i10) {
            view.setLabelFor(i10);
        }

        static void i(View view, Paint paint) {
            view.setLayerPaint(paint);
        }

        static void j(View view, int i10) {
            view.setLayoutDirection(i10);
        }

        static void k(View view, int i10, int i11, int i12, int i13) {
            view.setPaddingRelative(i10, i11, i12, i13);
        }
    }

    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    static class j {
        static Rect a(View view) {
            return view.getClipBounds();
        }

        static boolean b(View view) {
            return view.isInLayout();
        }

        static void c(View view, Rect rect) {
            view.setClipBounds(rect);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    public static class k {
        static int a(View view) {
            return view.getAccessibilityLiveRegion();
        }

        static boolean b(View view) {
            return view.isAttachedToWindow();
        }

        static boolean c(View view) {
            return view.isLaidOut();
        }

        static boolean d(View view) {
            return view.isLayoutDirectionResolved();
        }

        static void e(ViewParent viewParent, View view, View view2, int i10) {
            viewParent.notifySubtreeAccessibilityStateChanged(view, view2, i10);
        }

        static void f(View view, int i10) {
            view.setAccessibilityLiveRegion(i10);
        }

        static void g(AccessibilityEvent accessibilityEvent, int i10) {
            accessibilityEvent.setContentChangeTypes(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    public static class l {
        static WindowInsets a(View view, WindowInsets windowInsets) {
            return view.dispatchApplyWindowInsets(windowInsets);
        }

        static WindowInsets b(View view, WindowInsets windowInsets) {
            return view.onApplyWindowInsets(windowInsets);
        }

        static void c(View view) {
            view.requestApplyInsets();
        }
    }

    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    private static class m {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ViewCompat.java */
        /* loaded from: classes.dex */
        public class a implements View.OnApplyWindowInsetsListener {

            /* renamed from: a  reason: collision with root package name */
            i0 f2741a = null;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ View f2742b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ androidx.core.view.s f2743c;

            a(View view, androidx.core.view.s sVar) {
                this.f2742b = view;
                this.f2743c = sVar;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                i0 v10 = i0.v(windowInsets, view);
                int i10 = Build.VERSION.SDK_INT;
                if (i10 < 30) {
                    m.a(windowInsets, this.f2742b);
                    if (v10.equals(this.f2741a)) {
                        return this.f2743c.a(view, v10).t();
                    }
                }
                this.f2741a = v10;
                i0 a10 = this.f2743c.a(view, v10);
                if (i10 >= 30) {
                    return a10.t();
                }
                z.n0(view);
                return a10.t();
            }
        }

        static void a(WindowInsets windowInsets, View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(w.c.f38119n);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        static i0 b(View view, i0 i0Var, Rect rect) {
            WindowInsets t10 = i0Var.t();
            if (t10 != null) {
                return i0.v(view.computeSystemWindowInsets(t10, rect), view);
            }
            rect.setEmpty();
            return i0Var;
        }

        static boolean c(View view, float f10, float f11, boolean z10) {
            return view.dispatchNestedFling(f10, f11, z10);
        }

        static boolean d(View view, float f10, float f11) {
            return view.dispatchNestedPreFling(f10, f11);
        }

        static boolean e(View view, int i10, int i11, int[] iArr, int[] iArr2) {
            return view.dispatchNestedPreScroll(i10, i11, iArr, iArr2);
        }

        static boolean f(View view, int i10, int i11, int i12, int i13, int[] iArr) {
            return view.dispatchNestedScroll(i10, i11, i12, i13, iArr);
        }

        static ColorStateList g(View view) {
            return view.getBackgroundTintList();
        }

        static PorterDuff.Mode h(View view) {
            return view.getBackgroundTintMode();
        }

        static float i(View view) {
            return view.getElevation();
        }

        public static i0 j(View view) {
            return i0.a.a(view);
        }

        static String k(View view) {
            return view.getTransitionName();
        }

        static float l(View view) {
            return view.getTranslationZ();
        }

        static float m(View view) {
            return view.getZ();
        }

        static boolean n(View view) {
            return view.hasNestedScrollingParent();
        }

        static boolean o(View view) {
            return view.isImportantForAccessibility();
        }

        static boolean p(View view) {
            return view.isNestedScrollingEnabled();
        }

        static void q(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
        }

        static void r(View view, PorterDuff.Mode mode) {
            view.setBackgroundTintMode(mode);
        }

        static void s(View view, float f10) {
            view.setElevation(f10);
        }

        static void t(View view, boolean z10) {
            view.setNestedScrollingEnabled(z10);
        }

        static void u(View view, androidx.core.view.s sVar) {
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(w.c.f38111f, sVar);
            }
            if (sVar == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(w.c.f38119n));
            } else {
                view.setOnApplyWindowInsetsListener(new a(view, sVar));
            }
        }

        static void v(View view, String str) {
            view.setTransitionName(str);
        }

        static void w(View view, float f10) {
            view.setTranslationZ(f10);
        }

        static void x(View view, float f10) {
            view.setZ(f10);
        }

        static boolean y(View view, int i10) {
            return view.startNestedScroll(i10);
        }

        static void z(View view) {
            view.stopNestedScroll();
        }
    }

    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    private static class n {
        public static i0 a(View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            i0 u10 = i0.u(rootWindowInsets);
            u10.r(u10);
            u10.d(view.getRootView());
            return u10;
        }

        static int b(View view) {
            return view.getScrollIndicators();
        }

        static void c(View view, int i10) {
            view.setScrollIndicators(i10);
        }

        static void d(View view, int i10, int i11) {
            view.setScrollIndicators(i10, i11);
        }
    }

    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    static class o {
        static void a(View view) {
            view.cancelDragAndDrop();
        }

        static void b(View view) {
            view.dispatchFinishTemporaryDetach();
        }

        static void c(View view) {
            view.dispatchStartTemporaryDetach();
        }

        static void d(View view, PointerIcon pointerIcon) {
            view.setPointerIcon(pointerIcon);
        }

        static boolean e(View view, ClipData clipData, View.DragShadowBuilder dragShadowBuilder, Object obj, int i10) {
            return view.startDragAndDrop(clipData, dragShadowBuilder, obj, i10);
        }

        static void f(View view, View.DragShadowBuilder dragShadowBuilder) {
            view.updateDragShadow(dragShadowBuilder);
        }
    }

    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    static class p {
        static void a(View view, Collection<View> collection, int i10) {
            view.addKeyboardNavigationClusters(collection, i10);
        }

        static int b(View view) {
            return view.getImportantForAutofill();
        }

        static int c(View view) {
            return view.getNextClusterForwardId();
        }

        static boolean d(View view) {
            return view.hasExplicitFocusable();
        }

        static boolean e(View view) {
            return view.isFocusedByDefault();
        }

        static boolean f(View view) {
            return view.isImportantForAutofill();
        }

        static boolean g(View view) {
            return view.isKeyboardNavigationCluster();
        }

        static View h(View view, View view2, int i10) {
            return view.keyboardNavigationClusterSearch(view2, i10);
        }

        static boolean i(View view) {
            return view.restoreDefaultFocus();
        }

        static void j(View view, String... strArr) {
            view.setAutofillHints(strArr);
        }

        static void k(View view, boolean z10) {
            view.setFocusedByDefault(z10);
        }

        static void l(View view, int i10) {
            view.setImportantForAutofill(i10);
        }

        static void m(View view, boolean z10) {
            view.setKeyboardNavigationCluster(z10);
        }

        static void n(View view, int i10) {
            view.setNextClusterForwardId(i10);
        }

        static void o(View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    public static class q {
        static void a(View view, final v vVar) {
            int i10 = w.c.f38118m;
            androidx.collection.g gVar = (androidx.collection.g) view.getTag(i10);
            if (gVar == null) {
                gVar = new androidx.collection.g();
                view.setTag(i10, gVar);
            }
            Objects.requireNonNull(vVar);
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener = new View.OnUnhandledKeyEventListener() { // from class: androidx.core.view.a0
                @Override // android.view.View.OnUnhandledKeyEventListener
                public final boolean onUnhandledKeyEvent(View view2, KeyEvent keyEvent) {
                    return z.v.this.onUnhandledKeyEvent(view2, keyEvent);
                }
            };
            gVar.put(vVar, onUnhandledKeyEventListener);
            view.addOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
        }

        static CharSequence b(View view) {
            return view.getAccessibilityPaneTitle();
        }

        static boolean c(View view) {
            return view.isAccessibilityHeading();
        }

        static boolean d(View view) {
            return view.isScreenReaderFocusable();
        }

        static void e(View view, v vVar) {
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
            androidx.collection.g gVar = (androidx.collection.g) view.getTag(w.c.f38118m);
            if (gVar == null || (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) gVar.get(vVar)) == null) {
                return;
            }
            view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
        }

        static <T> T f(View view, int i10) {
            return (T) view.requireViewById(i10);
        }

        static void g(View view, boolean z10) {
            view.setAccessibilityHeading(z10);
        }

        static void h(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        static void i(View view, boolean z10) {
            view.setScreenReaderFocusable(z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    public static class r {
        static View.AccessibilityDelegate a(View view) {
            return view.getAccessibilityDelegate();
        }

        static List<Rect> b(View view) {
            return view.getSystemGestureExclusionRects();
        }

        static void c(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i10, int i11) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i10, i11);
        }

        static void d(View view, List<Rect> list) {
            view.setSystemGestureExclusionRects(list);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    public static class s {
        static CharSequence a(View view) {
            return view.getStateDescription();
        }

        static void b(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }
    }

    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    private static final class t {
        public static String[] a(View view) {
            return view.getReceiveContentMimeTypes();
        }

        public static androidx.core.view.c b(View view, androidx.core.view.c cVar) {
            ContentInfo f10 = cVar.f();
            ContentInfo performReceiveContent = view.performReceiveContent(f10);
            if (performReceiveContent == null) {
                return null;
            }
            return performReceiveContent == f10 ? cVar : androidx.core.view.c.g(performReceiveContent);
        }

        public static void c(View view, String[] strArr, androidx.core.view.t tVar) {
            if (tVar == null) {
                view.setOnReceiveContentListener(strArr, null);
            } else {
                view.setOnReceiveContentListener(strArr, new u(tVar));
            }
        }
    }

    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    private static final class u implements OnReceiveContentListener {

        /* renamed from: a  reason: collision with root package name */
        private final androidx.core.view.t f2744a;

        u(androidx.core.view.t tVar) {
            this.f2744a = tVar;
        }

        @Override // android.view.OnReceiveContentListener
        public ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
            androidx.core.view.c g10 = androidx.core.view.c.g(contentInfo);
            androidx.core.view.c a10 = this.f2744a.a(view, g10);
            if (a10 == null) {
                return null;
            }
            return a10 == g10 ? contentInfo : a10.f();
        }
    }

    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    public interface v {
        boolean onUnhandledKeyEvent(View view, KeyEvent keyEvent);
    }

    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    static class w {

        /* renamed from: d  reason: collision with root package name */
        private static final ArrayList<WeakReference<View>> f2745d = new ArrayList<>();

        /* renamed from: a  reason: collision with root package name */
        private WeakHashMap<View, Boolean> f2746a = null;

        /* renamed from: b  reason: collision with root package name */
        private SparseArray<WeakReference<View>> f2747b = null;

        /* renamed from: c  reason: collision with root package name */
        private WeakReference<KeyEvent> f2748c = null;

        w() {
        }

        static w a(View view) {
            int i10 = w.c.f38117l;
            w wVar = (w) view.getTag(i10);
            if (wVar == null) {
                w wVar2 = new w();
                view.setTag(i10, wVar2);
                return wVar2;
            }
            return wVar;
        }

        private View c(View view, KeyEvent keyEvent) {
            WeakHashMap<View, Boolean> weakHashMap = this.f2746a;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View c10 = c(viewGroup.getChildAt(childCount), keyEvent);
                        if (c10 != null) {
                            return c10;
                        }
                    }
                }
                if (e(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        private SparseArray<WeakReference<View>> d() {
            if (this.f2747b == null) {
                this.f2747b = new SparseArray<>();
            }
            return this.f2747b;
        }

        private boolean e(View view, KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(w.c.f38118m);
            if (arrayList != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    if (((v) arrayList.get(size)).onUnhandledKeyEvent(view, keyEvent)) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }

        private void g() {
            WeakHashMap<View, Boolean> weakHashMap = this.f2746a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList<WeakReference<View>> arrayList = f2745d;
            if (arrayList.isEmpty()) {
                return;
            }
            synchronized (arrayList) {
                if (this.f2746a == null) {
                    this.f2746a = new WeakHashMap<>();
                }
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ArrayList<WeakReference<View>> arrayList2 = f2745d;
                    View view = arrayList2.get(size).get();
                    if (view == null) {
                        arrayList2.remove(size);
                    } else {
                        this.f2746a.put(view, Boolean.TRUE);
                        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                            this.f2746a.put((View) parent, Boolean.TRUE);
                        }
                    }
                }
            }
        }

        boolean b(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                g();
            }
            View c10 = c(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (c10 != null && !KeyEvent.isModifierKey(keyCode)) {
                    d().put(keyCode, new WeakReference<>(c10));
                }
            }
            return c10 != null;
        }

        boolean f(KeyEvent keyEvent) {
            int indexOfKey;
            WeakReference<KeyEvent> weakReference = this.f2748c;
            if (weakReference == null || weakReference.get() != keyEvent) {
                this.f2748c = new WeakReference<>(keyEvent);
                WeakReference<View> weakReference2 = null;
                SparseArray<WeakReference<View>> d10 = d();
                if (keyEvent.getAction() == 1 && (indexOfKey = d10.indexOfKey(keyEvent.getKeyCode())) >= 0) {
                    weakReference2 = d10.valueAt(indexOfKey);
                    d10.removeAt(indexOfKey);
                }
                if (weakReference2 == null) {
                    weakReference2 = d10.get(keyEvent.getKeyCode());
                }
                if (weakReference2 != null) {
                    View view = weakReference2.get();
                    if (view != null && z.T(view)) {
                        e(view, keyEvent);
                    }
                    return true;
                }
                return false;
            }
            return false;
        }
    }

    public static int A(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return h.c(view);
        }
        return 0;
    }

    public static void A0(View view, int i10) {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 19) {
            h.s(view, i10);
        } else if (i11 >= 16) {
            if (i10 == 4) {
                i10 = 2;
            }
            h.s(view, i10);
        }
    }

    @SuppressLint({"InlinedApi"})
    public static int B(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return p.b(view);
        }
        return 0;
    }

    public static void B0(View view, int i10) {
        if (Build.VERSION.SDK_INT >= 26) {
            p.l(view, i10);
        }
    }

    public static int C(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return i.d(view);
        }
        return 0;
    }

    public static void C0(View view, boolean z10) {
        if (Build.VERSION.SDK_INT >= 21) {
            m.t(view, z10);
        } else if (view instanceof androidx.core.view.m) {
            ((androidx.core.view.m) view).setNestedScrollingEnabled(z10);
        }
    }

    public static int D(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return h.d(view);
        }
        if (!f2728e) {
            try {
                Field declaredField = View.class.getDeclaredField("mMinHeight");
                f2727d = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f2728e = true;
        }
        Field field = f2727d;
        if (field != null) {
            try {
                return ((Integer) field.get(view)).intValue();
            } catch (Exception unused2) {
                return 0;
            }
        }
        return 0;
    }

    public static void D0(View view, androidx.core.view.s sVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            m.u(view, sVar);
        }
    }

    public static int E(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return h.e(view);
        }
        if (!f2726c) {
            try {
                Field declaredField = View.class.getDeclaredField("mMinWidth");
                f2725b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f2726c = true;
        }
        Field field = f2725b;
        if (field != null) {
            try {
                return ((Integer) field.get(view)).intValue();
            } catch (Exception unused2) {
                return 0;
            }
        }
        return 0;
    }

    public static void E0(View view, int i10, int i11, int i12, int i13) {
        if (Build.VERSION.SDK_INT >= 17) {
            i.k(view, i10, i11, i12, i13);
        } else {
            view.setPadding(i10, i11, i12, i13);
        }
    }

    public static String[] F(View view) {
        if (Build.VERSION.SDK_INT >= 31) {
            return t.a(view);
        }
        return (String[]) view.getTag(w.c.f38113h);
    }

    public static void F0(View view, androidx.core.view.w wVar) {
        if (Build.VERSION.SDK_INT >= 24) {
            o.d(view, (PointerIcon) (wVar != null ? wVar.a() : null));
        }
    }

    public static int G(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return i.e(view);
        }
        return view.getPaddingRight();
    }

    public static void G0(View view, boolean z10) {
        p0().g(view, Boolean.valueOf(z10));
    }

    public static int H(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return i.f(view);
        }
        return view.getPaddingLeft();
    }

    public static void H0(View view, int i10, int i11) {
        if (Build.VERSION.SDK_INT >= 23) {
            n.d(view, i10, i11);
        }
    }

    public static ViewParent I(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return h.f(view);
        }
        return view.getParent();
    }

    public static void I0(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 19) {
            L0().g(view, charSequence);
        }
    }

    public static i0 J(View view) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 23) {
            return n.a(view);
        }
        if (i10 >= 21) {
            return m.j(view);
        }
        return null;
    }

    public static void J0(View view, String str) {
        if (Build.VERSION.SDK_INT >= 21) {
            m.v(view, str);
            return;
        }
        if (f2729f == null) {
            f2729f = new WeakHashMap<>();
        }
        f2729f.put(view, str);
    }

    public static CharSequence K(View view) {
        return L0().f(view);
    }

    private static void K0(View view) {
        if (A(view) == 0) {
            A0(view, 1);
        }
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            if (A((View) parent) == 4) {
                A0(view, 2);
                return;
            }
        }
    }

    public static String L(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return m.k(view);
        }
        WeakHashMap<View, String> weakHashMap = f2729f;
        if (weakHashMap == null) {
            return null;
        }
        return weakHashMap.get(view);
    }

    private static f<CharSequence> L0() {
        return new c(w.c.f38115j, CharSequence.class, 64, 30);
    }

    @Deprecated
    public static int M(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return h.g(view);
        }
        return 0;
    }

    public static void M0(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            m.z(view);
        } else if (view instanceof androidx.core.view.m) {
            ((androidx.core.view.m) view).stopNestedScroll();
        }
    }

    public static float N(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return m.m(view);
        }
        return 0.0f;
    }

    private static void N0(View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }

    public static boolean O(View view) {
        return n(view) != null;
    }

    public static boolean P(View view) {
        if (Build.VERSION.SDK_INT >= 15) {
            return g.a(view);
        }
        return false;
    }

    public static boolean Q(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return h.h(view);
        }
        return true;
    }

    public static boolean R(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return h.i(view);
        }
        return false;
    }

    public static boolean S(View view) {
        Boolean f10 = b().f(view);
        return f10 != null && f10.booleanValue();
    }

    public static boolean T(View view) {
        if (Build.VERSION.SDK_INT >= 19) {
            return k.b(view);
        }
        return view.getWindowToken() != null;
    }

    public static boolean U(View view) {
        if (Build.VERSION.SDK_INT >= 19) {
            return k.c(view);
        }
        return view.getWidth() > 0 && view.getHeight() > 0;
    }

    public static boolean V(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return m.p(view);
        }
        if (view instanceof androidx.core.view.m) {
            return ((androidx.core.view.m) view).isNestedScrollingEnabled();
        }
        return false;
    }

    public static boolean W(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return i.g(view);
        }
        return false;
    }

    public static boolean X(View view) {
        Boolean f10 = p0().f(view);
        return f10 != null && f10.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ androidx.core.view.c Y(androidx.core.view.c cVar) {
        return cVar;
    }

    static void Z(View view, int i10) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z10 = q(view) != null && view.getVisibility() == 0;
            if (p(view) != 0 || z10) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(z10 ? 32 : 2048);
                k.g(obtain, i10);
                if (z10) {
                    obtain.getText().add(q(view));
                    K0(view);
                }
                view.sendAccessibilityEventUnchecked(obtain);
            } else if (i10 == 32) {
                AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(obtain2);
                obtain2.setEventType(32);
                k.g(obtain2, i10);
                obtain2.setSource(view);
                view.onPopulateAccessibilityEvent(obtain2);
                obtain2.getText().add(q(view));
                accessibilityManager.sendAccessibilityEvent(obtain2);
            } else if (view.getParent() != null) {
                try {
                    k.e(view.getParent(), view, view, i10);
                } catch (AbstractMethodError e10) {
                    Log.e("ViewCompat", view.getParent().getClass().getSimpleName() + " does not fully implement ViewParent", e10);
                }
            }
        }
    }

    public static void a0(View view, int i10) {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 23) {
            view.offsetLeftAndRight(i10);
        } else if (i11 >= 21) {
            Rect x10 = x();
            boolean z10 = false;
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                View view2 = (View) parent;
                x10.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
                z10 = !x10.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
            e(view, i10);
            if (z10 && x10.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                ((View) parent).invalidate(x10);
            }
        } else {
            e(view, i10);
        }
    }

    private static f<Boolean> b() {
        return new d(w.c.f38109d, Boolean.class, 28);
    }

    public static void b0(View view, int i10) {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 23) {
            view.offsetTopAndBottom(i10);
        } else if (i11 >= 21) {
            Rect x10 = x();
            boolean z10 = false;
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                View view2 = (View) parent;
                x10.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
                z10 = !x10.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
            f(view, i10);
            if (z10 && x10.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                ((View) parent).invalidate(x10);
            }
        } else {
            f(view, i10);
        }
    }

    private static void c(View view, c.a aVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            k(view);
            l0(aVar.b(), view);
            r(view).add(aVar);
            Z(view, 0);
        }
    }

    public static i0 c0(View view, i0 i0Var) {
        WindowInsets t10;
        if (Build.VERSION.SDK_INT >= 21 && (t10 = i0Var.t()) != null) {
            WindowInsets b10 = l.b(view, t10);
            if (!b10.equals(t10)) {
                return i0.v(b10, view);
            }
        }
        return i0Var;
    }

    public static e0 d(View view) {
        if (f2730g == null) {
            f2730g = new WeakHashMap<>();
        }
        e0 e0Var = f2730g.get(view);
        if (e0Var == null) {
            e0 e0Var2 = new e0(view);
            f2730g.put(view, e0Var2);
            return e0Var2;
        }
        return e0Var;
    }

    public static void d0(View view, i0.c cVar) {
        view.onInitializeAccessibilityNodeInfo(cVar.E0());
    }

    private static void e(View view, int i10) {
        view.offsetLeftAndRight(i10);
        if (view.getVisibility() == 0) {
            N0(view);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                N0((View) parent);
            }
        }
    }

    private static f<CharSequence> e0() {
        return new b(w.c.f38110e, CharSequence.class, 8, 28);
    }

    private static void f(View view, int i10) {
        view.offsetTopAndBottom(i10);
        if (view.getVisibility() == 0) {
            N0(view);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                N0((View) parent);
            }
        }
    }

    public static boolean f0(View view, int i10, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            return h.j(view, i10, bundle);
        }
        return false;
    }

    public static i0 g(View view, i0 i0Var, Rect rect) {
        return Build.VERSION.SDK_INT >= 21 ? m.b(view, i0Var, rect) : i0Var;
    }

    public static androidx.core.view.c g0(View view, androidx.core.view.c cVar) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + cVar + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return t.b(view, cVar);
        }
        androidx.core.view.t tVar = (androidx.core.view.t) view.getTag(w.c.f38112g);
        if (tVar != null) {
            androidx.core.view.c a10 = tVar.a(view, cVar);
            if (a10 == null) {
                return null;
            }
            return y(view).a(a10);
        }
        return y(view).a(cVar);
    }

    public static i0 h(View view, i0 i0Var) {
        WindowInsets t10;
        if (Build.VERSION.SDK_INT >= 21 && (t10 = i0Var.t()) != null) {
            WindowInsets a10 = l.a(view, t10);
            if (!a10.equals(t10)) {
                return i0.v(a10, view);
            }
        }
        return i0Var;
    }

    public static void h0(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            h.k(view);
        } else {
            view.postInvalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean i(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return w.a(view).b(view, keyEvent);
    }

    public static void i0(View view, Runnable runnable) {
        if (Build.VERSION.SDK_INT >= 16) {
            h.m(view, runnable);
        } else {
            view.postDelayed(runnable, ValueAnimator.getFrameDelay());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean j(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return w.a(view).f(keyEvent);
    }

    @SuppressLint({"LambdaLast"})
    public static void j0(View view, Runnable runnable, long j10) {
        if (Build.VERSION.SDK_INT >= 16) {
            h.n(view, runnable, j10);
        } else {
            view.postDelayed(runnable, ValueAnimator.getFrameDelay() + j10);
        }
    }

    static void k(View view) {
        androidx.core.view.a m10 = m(view);
        if (m10 == null) {
            m10 = new androidx.core.view.a();
        }
        q0(view, m10);
    }

    public static void k0(View view, int i10) {
        if (Build.VERSION.SDK_INT >= 21) {
            l0(i10, view);
            Z(view, 0);
        }
    }

    public static int l() {
        AtomicInteger atomicInteger;
        int i10;
        int i11;
        if (Build.VERSION.SDK_INT >= 17) {
            return i.a();
        }
        do {
            atomicInteger = f2724a;
            i10 = atomicInteger.get();
            i11 = i10 + 1;
            if (i11 > 16777215) {
                i11 = 1;
            }
        } while (!atomicInteger.compareAndSet(i10, i11));
        return i10;
    }

    private static void l0(int i10, View view) {
        List<c.a> r10 = r(view);
        for (int i11 = 0; i11 < r10.size(); i11++) {
            if (r10.get(i11).b() == i10) {
                r10.remove(i11);
                return;
            }
        }
    }

    public static androidx.core.view.a m(View view) {
        View.AccessibilityDelegate n10 = n(view);
        if (n10 == null) {
            return null;
        }
        if (n10 instanceof a.C0050a) {
            return ((a.C0050a) n10).f2642a;
        }
        return new androidx.core.view.a(n10);
    }

    public static void m0(View view, c.a aVar, CharSequence charSequence, i0.f fVar) {
        if (fVar == null && charSequence == null) {
            k0(view, aVar.b());
        } else {
            c(view, aVar.a(charSequence, fVar));
        }
    }

    private static View.AccessibilityDelegate n(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return r.a(view);
        }
        return o(view);
    }

    public static void n0(View view) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 20) {
            l.c(view);
        } else if (i10 >= 16) {
            h.p(view);
        }
    }

    private static View.AccessibilityDelegate o(View view) {
        if (f2732i) {
            return null;
        }
        if (f2731h == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f2731h = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f2732i = true;
                return null;
            }
        }
        try {
            Object obj = f2731h.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f2732i = true;
            return null;
        }
    }

    public static void o0(View view, @SuppressLint({"ContextFirst"}) Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i10, int i11) {
        if (Build.VERSION.SDK_INT >= 29) {
            r.c(view, context, iArr, attributeSet, typedArray, i10, i11);
        }
    }

    public static int p(View view) {
        if (Build.VERSION.SDK_INT >= 19) {
            return k.a(view);
        }
        return 0;
    }

    private static f<Boolean> p0() {
        return new a(w.c.f38114i, Boolean.class, 28);
    }

    public static CharSequence q(View view) {
        return e0().f(view);
    }

    public static void q0(View view, androidx.core.view.a aVar) {
        if (aVar == null && (n(view) instanceof a.C0050a)) {
            aVar = new androidx.core.view.a();
        }
        view.setAccessibilityDelegate(aVar == null ? null : aVar.d());
    }

    private static List<c.a> r(View view) {
        int i10 = w.c.f38107b;
        ArrayList arrayList = (ArrayList) view.getTag(i10);
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            view.setTag(i10, arrayList2);
            return arrayList2;
        }
        return arrayList;
    }

    public static void r0(View view, boolean z10) {
        b().g(view, Boolean.valueOf(z10));
    }

    public static ColorStateList s(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return m.g(view);
        }
        if (view instanceof x) {
            return ((x) view).getSupportBackgroundTintList();
        }
        return null;
    }

    public static void s0(View view, int i10) {
        if (Build.VERSION.SDK_INT >= 19) {
            k.f(view, i10);
        }
    }

    public static PorterDuff.Mode t(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return m.h(view);
        }
        if (view instanceof x) {
            return ((x) view).getSupportBackgroundTintMode();
        }
        return null;
    }

    public static void t0(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 19) {
            e0().g(view, charSequence);
            if (charSequence != null) {
                f2735l.a(view);
            } else {
                f2735l.d(view);
            }
        }
    }

    public static Rect u(View view) {
        if (Build.VERSION.SDK_INT >= 18) {
            return j.a(view);
        }
        return null;
    }

    public static void u0(View view, Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 16) {
            h.q(view, drawable);
        } else {
            view.setBackgroundDrawable(drawable);
        }
    }

    public static Display v(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return i.b(view);
        }
        if (T(view)) {
            return ((WindowManager) view.getContext().getSystemService("window")).getDefaultDisplay();
        }
        return null;
    }

    public static void v0(View view, ColorStateList colorStateList) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 21) {
            m.q(view, colorStateList);
            if (i10 == 21) {
                Drawable background = view.getBackground();
                boolean z10 = (m.g(view) == null && m.h(view) == null) ? false : true;
                if (background == null || !z10) {
                    return;
                }
                if (background.isStateful()) {
                    background.setState(view.getDrawableState());
                }
                h.q(view, background);
            }
        } else if (view instanceof x) {
            ((x) view).setSupportBackgroundTintList(colorStateList);
        }
    }

    public static float w(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return m.i(view);
        }
        return 0.0f;
    }

    public static void w0(View view, PorterDuff.Mode mode) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 21) {
            m.r(view, mode);
            if (i10 == 21) {
                Drawable background = view.getBackground();
                boolean z10 = (m.g(view) == null && m.h(view) == null) ? false : true;
                if (background == null || !z10) {
                    return;
                }
                if (background.isStateful()) {
                    background.setState(view.getDrawableState());
                }
                h.q(view, background);
            }
        } else if (view instanceof x) {
            ((x) view).setSupportBackgroundTintMode(mode);
        }
    }

    private static Rect x() {
        if (f2733j == null) {
            f2733j = new ThreadLocal<>();
        }
        Rect rect = f2733j.get();
        if (rect == null) {
            rect = new Rect();
            f2733j.set(rect);
        }
        rect.setEmpty();
        return rect;
    }

    public static void x0(View view, Rect rect) {
        if (Build.VERSION.SDK_INT >= 18) {
            j.c(view, rect);
        }
    }

    private static androidx.core.view.u y(View view) {
        if (view instanceof androidx.core.view.u) {
            return (androidx.core.view.u) view;
        }
        return f2734k;
    }

    public static void y0(View view, float f10) {
        if (Build.VERSION.SDK_INT >= 21) {
            m.s(view, f10);
        }
    }

    public static boolean z(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return h.b(view);
        }
        return false;
    }

    public static void z0(View view, boolean z10) {
        if (Build.VERSION.SDK_INT >= 16) {
            h.r(view, z10);
        }
    }
}
