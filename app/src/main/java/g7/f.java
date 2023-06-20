package g7;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Point;
import android.view.View;
import android.view.ViewGroup;
import android.widget.OverScroller;
import androidx.core.view.z;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.uimanager.d;
import com.facebook.react.uimanager.r;
import com.facebook.react.uimanager.t0;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: ReactScrollViewHelper.java */
/* loaded from: classes.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    private static String f30665a = g7.d.class.getSimpleName();

    /* renamed from: b  reason: collision with root package name */
    private static boolean f30666b = false;

    /* renamed from: c  reason: collision with root package name */
    private static final Set<g> f30667c = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: d  reason: collision with root package name */
    private static int f30668d = IronSourceConstants.INTERSTITIAL_DAILY_CAPPED;

    /* renamed from: e  reason: collision with root package name */
    private static boolean f30669e = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ReactScrollViewHelper.java */
    /* loaded from: classes.dex */
    public class a implements d.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f30670a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f30671b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f30672c;

        a(int i10, int i11, int i12) {
            this.f30670a = i10;
            this.f30671b = i11;
            this.f30672c = i12;
        }

        @Override // com.facebook.react.uimanager.d.b
        public WritableMap a() {
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putDouble("contentOffsetLeft", r.a(this.f30670a));
            writableNativeMap.putDouble("contentOffsetTop", r.a(this.f30671b));
            writableNativeMap.putDouble("scrollAwayPaddingTop", r.a(this.f30672c));
            return writableNativeMap;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ReactScrollViewHelper.java */
    /* loaded from: classes.dex */
    public class b implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ViewGroup f30673a;

        b(ViewGroup viewGroup) {
            this.f30673a = viewGroup;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            ((d) this.f30673a).getReactScrollViewScrollState().j(true);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ((d) this.f30673a).getReactScrollViewScrollState().k(true);
            f.q(this.f30673a);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C0394f reactScrollViewScrollState = ((d) this.f30673a).getReactScrollViewScrollState();
            reactScrollViewScrollState.j(false);
            reactScrollViewScrollState.k(false);
        }
    }

    /* compiled from: ReactScrollViewHelper.java */
    /* loaded from: classes.dex */
    public interface c {
        void a(int i10, int i11);

        ValueAnimator getFlingAnimator();
    }

    /* compiled from: ReactScrollViewHelper.java */
    /* loaded from: classes.dex */
    public interface d {
        C0394f getReactScrollViewScrollState();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ReactScrollViewHelper.java */
    /* loaded from: classes.dex */
    public static class e extends OverScroller {

        /* renamed from: a  reason: collision with root package name */
        private int f30674a;

        e(Context context) {
            super(context);
            this.f30674a = IronSourceConstants.INTERSTITIAL_DAILY_CAPPED;
        }

        public int a() {
            super.startScroll(0, 0, 0, 0);
            return this.f30674a;
        }

        @Override // android.widget.OverScroller
        public void startScroll(int i10, int i11, int i12, int i13, int i14) {
            this.f30674a = i14;
        }
    }

    /* compiled from: ReactScrollViewHelper.java */
    /* renamed from: g7.f$f  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0394f {

        /* renamed from: a  reason: collision with root package name */
        private final int f30675a;

        /* renamed from: b  reason: collision with root package name */
        private final Point f30676b = new Point();

        /* renamed from: c  reason: collision with root package name */
        private int f30677c = 0;

        /* renamed from: d  reason: collision with root package name */
        private final Point f30678d = new Point(-1, -1);

        /* renamed from: e  reason: collision with root package name */
        private boolean f30679e = false;

        /* renamed from: f  reason: collision with root package name */
        private boolean f30680f = true;

        /* renamed from: g  reason: collision with root package name */
        private float f30681g = 0.985f;

        public C0394f(int i10) {
            this.f30675a = i10;
        }

        public float a() {
            return this.f30681g;
        }

        public Point b() {
            return this.f30676b;
        }

        public boolean c() {
            return this.f30679e;
        }

        public boolean d() {
            return this.f30680f;
        }

        public Point e() {
            return this.f30678d;
        }

        public int f() {
            return this.f30675a;
        }

        public int g() {
            return this.f30677c;
        }

        public C0394f h(float f10) {
            this.f30681g = f10;
            return this;
        }

        public C0394f i(int i10, int i11) {
            this.f30676b.set(i10, i11);
            return this;
        }

        public C0394f j(boolean z10) {
            this.f30679e = z10;
            return this;
        }

        public C0394f k(boolean z10) {
            this.f30680f = z10;
            return this;
        }

        public C0394f l(int i10, int i11) {
            this.f30678d.set(i10, i11);
            return this;
        }

        public C0394f m(int i10) {
            this.f30677c = i10;
            return this;
        }
    }

    /* compiled from: ReactScrollViewHelper.java */
    /* loaded from: classes.dex */
    public interface g {
        void a(ViewGroup viewGroup);

        void b(ViewGroup viewGroup, com.facebook.react.views.scroll.b bVar, float f10, float f11);
    }

    public static void a(ViewGroup viewGroup) {
        for (g gVar : f30667c) {
            gVar.a(viewGroup);
        }
    }

    public static void b(ViewGroup viewGroup) {
        e(viewGroup, com.facebook.react.views.scroll.b.BEGIN_DRAG);
    }

    public static void c(ViewGroup viewGroup, float f10, float f11) {
        f(viewGroup, com.facebook.react.views.scroll.b.END_DRAG, f10, f11);
    }

    public static void d(ViewGroup viewGroup, float f10, float f11) {
        f(viewGroup, com.facebook.react.views.scroll.b.SCROLL, f10, f11);
    }

    private static void e(ViewGroup viewGroup, com.facebook.react.views.scroll.b bVar) {
        f(viewGroup, bVar, 0.0f, 0.0f);
    }

    private static void f(ViewGroup viewGroup, com.facebook.react.views.scroll.b bVar, float f10, float f11) {
        View childAt = viewGroup.getChildAt(0);
        if (childAt == null) {
            return;
        }
        for (g gVar : f30667c) {
            gVar.b(viewGroup, bVar, f10, f11);
        }
        ReactContext reactContext = (ReactContext) viewGroup.getContext();
        int e10 = t0.e(reactContext);
        com.facebook.react.uimanager.events.d c10 = t0.c(reactContext, viewGroup.getId());
        if (c10 != null) {
            c10.g(g7.g.b(e10, viewGroup.getId(), bVar, viewGroup.getScrollX(), viewGroup.getScrollY(), f10, f11, childAt.getWidth(), childAt.getHeight(), viewGroup.getWidth(), viewGroup.getHeight()));
        }
    }

    public static void g(ViewGroup viewGroup, int i10, int i11) {
        f(viewGroup, com.facebook.react.views.scroll.b.MOMENTUM_BEGIN, i10, i11);
    }

    public static void h(ViewGroup viewGroup) {
        e(viewGroup, com.facebook.react.views.scroll.b.MOMENTUM_END);
    }

    public static <T extends ViewGroup & d.a & d & c> void i(T t10) {
        int i10;
        C0394f reactScrollViewScrollState = t10.getReactScrollViewScrollState();
        int g10 = reactScrollViewScrollState.g();
        Point e10 = reactScrollViewScrollState.e();
        int i11 = e10.x;
        int i12 = e10.y;
        if (reactScrollViewScrollState.f() == 1) {
            View childAt = t10.getChildAt(0);
            i10 = -(((childAt != null ? childAt.getWidth() : 0) - i11) - t10.getWidth());
        } else {
            i10 = i11;
        }
        if (f30666b) {
            z3.a.s(f30665a, "updateFabricScrollState[%d] scrollX %d scrollY %d fabricScrollX", Integer.valueOf(t10.getId()), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i10));
        }
        t10.getFabricViewStateManager().c(new a(i11, i12, g10));
    }

    public static int j(Context context) {
        if (!f30669e) {
            f30669e = true;
            try {
                f30668d = new e(context).a();
            } catch (Throwable unused) {
            }
        }
        return f30668d;
    }

    public static <T extends ViewGroup & d.a & d & c> int k(T t10, int i10, int i11, int i12) {
        C0394f reactScrollViewScrollState = t10.getReactScrollViewScrollState();
        return (!reactScrollViewScrollState.d() || (reactScrollViewScrollState.c() && ((i12 != 0 ? i12 / Math.abs(i12) : 0) * (i11 - i10) > 0))) ? i11 : i10;
    }

    public static int l(String str) {
        if (str == null || str.equals("auto")) {
            return 1;
        }
        if (str.equals("always")) {
            return 0;
        }
        if (str.equals("never")) {
            return 2;
        }
        throw new JSApplicationIllegalArgumentException("wrong overScrollMode: " + str);
    }

    public static int m(String str) {
        if (str == null) {
            return 0;
        }
        if ("start".equalsIgnoreCase(str)) {
            return 1;
        }
        if ("center".equalsIgnoreCase(str)) {
            return 2;
        }
        if ("end".equals(str)) {
            return 3;
        }
        throw new JSApplicationIllegalArgumentException("wrong snap alignment value: " + str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T extends ViewGroup & d.a & d & c> Point n(T t10, int i10, int i11, int i12, int i13) {
        C0394f reactScrollViewScrollState = t10.getReactScrollViewScrollState();
        OverScroller overScroller = new OverScroller(t10.getContext());
        overScroller.setFriction(1.0f - reactScrollViewScrollState.a());
        int width = (t10.getWidth() - z.H(t10)) - z.G(t10);
        int height = (t10.getHeight() - t10.getPaddingBottom()) - t10.getPaddingTop();
        Point b10 = reactScrollViewScrollState.b();
        overScroller.fling(k(t10, t10.getScrollX(), b10.x, i10), k(t10, t10.getScrollY(), b10.y, i11), i10, i11, 0, i12, 0, i13, width / 2, height / 2);
        return new Point(overScroller.getFinalX(), overScroller.getFinalY());
    }

    public static <T extends ViewGroup & d.a & d & c> void o(T t10) {
        t10.getFlingAnimator().addListener(new b(t10));
    }

    public static <T extends ViewGroup & d.a & d & c> void p(T t10, int i10, int i11) {
        if (f30666b) {
            z3.a.r(f30665a, "smoothScrollTo[%d] x %d y %d", Integer.valueOf(t10.getId()), Integer.valueOf(i10), Integer.valueOf(i11));
        }
        ValueAnimator flingAnimator = t10.getFlingAnimator();
        if (flingAnimator.getListeners() == null || flingAnimator.getListeners().size() == 0) {
            o(t10);
        }
        t10.getReactScrollViewScrollState().i(i10, i11);
        int scrollX = t10.getScrollX();
        int scrollY = t10.getScrollY();
        if (scrollX != i10) {
            t10.a(scrollX, i10);
        }
        if (scrollY != i11) {
            t10.a(scrollY, i11);
        }
        r(t10, i10, i11);
    }

    public static <T extends ViewGroup & d.a & d & c> boolean q(T t10) {
        return r(t10, t10.getScrollX(), t10.getScrollY());
    }

    public static <T extends ViewGroup & d.a & d & c> boolean r(T t10, int i10, int i11) {
        if (f30666b) {
            z3.a.r(f30665a, "updateFabricScrollState[%d] scrollX %d scrollY %d", Integer.valueOf(t10.getId()), Integer.valueOf(i10), Integer.valueOf(i11));
        }
        if (x6.a.a(t10.getId()) == 1) {
            return false;
        }
        C0394f reactScrollViewScrollState = t10.getReactScrollViewScrollState();
        if (reactScrollViewScrollState.e().equals(i10, i11)) {
            return false;
        }
        reactScrollViewScrollState.l(i10, i11);
        i(t10);
        return true;
    }

    public static <T extends ViewGroup & d.a & d & c> void s(T t10, float f10, float f11) {
        q(t10);
        d(t10, f10, f11);
    }
}
