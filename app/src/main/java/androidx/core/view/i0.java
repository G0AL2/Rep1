package androidx.core.view;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

/* compiled from: WindowInsetsCompat.java */
/* loaded from: classes.dex */
public class i0 {

    /* renamed from: b  reason: collision with root package name */
    public static final i0 f2679b;

    /* renamed from: a  reason: collision with root package name */
    private final l f2680a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WindowInsetsCompat.java */
    @SuppressLint({"SoonBlockedPrivateApi"})
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private static Field f2681a;

        /* renamed from: b  reason: collision with root package name */
        private static Field f2682b;

        /* renamed from: c  reason: collision with root package name */
        private static Field f2683c;

        /* renamed from: d  reason: collision with root package name */
        private static boolean f2684d;

        static {
            try {
                Field declaredField = View.class.getDeclaredField("mAttachInfo");
                f2681a = declaredField;
                declaredField.setAccessible(true);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                Field declaredField2 = cls.getDeclaredField("mStableInsets");
                f2682b = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = cls.getDeclaredField("mContentInsets");
                f2683c = declaredField3;
                declaredField3.setAccessible(true);
                f2684d = true;
            } catch (ReflectiveOperationException e10) {
                Log.w("WindowInsetsCompat", "Failed to get visible insets from AttachInfo " + e10.getMessage(), e10);
            }
        }

        public static i0 a(View view) {
            if (f2684d && view.isAttachedToWindow()) {
                try {
                    Object obj = f2681a.get(view.getRootView());
                    if (obj != null) {
                        Rect rect = (Rect) f2682b.get(obj);
                        Rect rect2 = (Rect) f2683c.get(obj);
                        if (rect != null && rect2 != null) {
                            i0 a10 = new b().b(z.b.c(rect)).c(z.b.c(rect2)).a();
                            a10.r(a10);
                            a10.d(view.getRootView());
                            return a10;
                        }
                    }
                } catch (IllegalAccessException e10) {
                    Log.w("WindowInsetsCompat", "Failed to get insets from AttachInfo. " + e10.getMessage(), e10);
                }
            }
            return null;
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    /* loaded from: classes.dex */
    private static class e extends d {
        e() {
        }

        e(i0 i0Var) {
            super(i0Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: WindowInsetsCompat.java */
    /* loaded from: classes.dex */
    public static class f {

        /* renamed from: a  reason: collision with root package name */
        private final i0 f2693a;

        /* renamed from: b  reason: collision with root package name */
        z.b[] f2694b;

        f() {
            this(new i0((i0) null));
        }

        protected final void a() {
            z.b[] bVarArr = this.f2694b;
            if (bVarArr != null) {
                z.b bVar = bVarArr[m.a(1)];
                z.b bVar2 = this.f2694b[m.a(2)];
                if (bVar2 == null) {
                    bVar2 = this.f2693a.f(2);
                }
                if (bVar == null) {
                    bVar = this.f2693a.f(1);
                }
                f(z.b.a(bVar, bVar2));
                z.b bVar3 = this.f2694b[m.a(16)];
                if (bVar3 != null) {
                    e(bVar3);
                }
                z.b bVar4 = this.f2694b[m.a(32)];
                if (bVar4 != null) {
                    c(bVar4);
                }
                z.b bVar5 = this.f2694b[m.a(64)];
                if (bVar5 != null) {
                    g(bVar5);
                }
            }
        }

        i0 b() {
            a();
            return this.f2693a;
        }

        void c(z.b bVar) {
        }

        void d(z.b bVar) {
        }

        void e(z.b bVar) {
        }

        void f(z.b bVar) {
        }

        void g(z.b bVar) {
        }

        f(i0 i0Var) {
            this.f2693a = i0Var;
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    /* loaded from: classes.dex */
    private static class i extends h {
        i(i0 i0Var, WindowInsets windowInsets) {
            super(i0Var, windowInsets);
        }

        @Override // androidx.core.view.i0.l
        i0 a() {
            return i0.u(this.f2700c.consumeDisplayCutout());
        }

        @Override // androidx.core.view.i0.g, androidx.core.view.i0.l
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof i) {
                i iVar = (i) obj;
                return Objects.equals(this.f2700c, iVar.f2700c) && Objects.equals(this.f2704g, iVar.f2704g);
            }
            return false;
        }

        @Override // androidx.core.view.i0.l
        androidx.core.view.d f() {
            return androidx.core.view.d.e(this.f2700c.getDisplayCutout());
        }

        @Override // androidx.core.view.i0.l
        public int hashCode() {
            return this.f2700c.hashCode();
        }

        i(i0 i0Var, i iVar) {
            super(i0Var, iVar);
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    /* loaded from: classes.dex */
    private static class k extends j {

        /* renamed from: q  reason: collision with root package name */
        static final i0 f2709q = i0.u(WindowInsets.CONSUMED);

        k(i0 i0Var, WindowInsets windowInsets) {
            super(i0Var, windowInsets);
        }

        @Override // androidx.core.view.i0.g, androidx.core.view.i0.l
        final void d(View view) {
        }

        @Override // androidx.core.view.i0.g, androidx.core.view.i0.l
        public z.b g(int i10) {
            return z.b.d(this.f2700c.getInsets(n.a(i10)));
        }

        k(i0 i0Var, k kVar) {
            super(i0Var, kVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: WindowInsetsCompat.java */
    /* loaded from: classes.dex */
    public static class l {

        /* renamed from: b  reason: collision with root package name */
        static final i0 f2710b = new b().a().a().b().c();

        /* renamed from: a  reason: collision with root package name */
        final i0 f2711a;

        l(i0 i0Var) {
            this.f2711a = i0Var;
        }

        i0 a() {
            return this.f2711a;
        }

        i0 b() {
            return this.f2711a;
        }

        i0 c() {
            return this.f2711a;
        }

        void d(View view) {
        }

        void e(i0 i0Var) {
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof l) {
                l lVar = (l) obj;
                return o() == lVar.o() && n() == lVar.n() && h0.c.a(k(), lVar.k()) && h0.c.a(i(), lVar.i()) && h0.c.a(f(), lVar.f());
            }
            return false;
        }

        androidx.core.view.d f() {
            return null;
        }

        z.b g(int i10) {
            return z.b.f39850e;
        }

        z.b h() {
            return k();
        }

        public int hashCode() {
            return h0.c.b(Boolean.valueOf(o()), Boolean.valueOf(n()), k(), i(), f());
        }

        z.b i() {
            return z.b.f39850e;
        }

        z.b j() {
            return k();
        }

        z.b k() {
            return z.b.f39850e;
        }

        z.b l() {
            return k();
        }

        i0 m(int i10, int i11, int i12, int i13) {
            return f2710b;
        }

        boolean n() {
            return false;
        }

        boolean o() {
            return false;
        }

        public void p(z.b[] bVarArr) {
        }

        void q(z.b bVar) {
        }

        void r(i0 i0Var) {
        }

        public void s(z.b bVar) {
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    /* loaded from: classes.dex */
    public static final class m {
        static int a(int i10) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 4) {
                        if (i10 != 8) {
                            if (i10 != 16) {
                                if (i10 != 32) {
                                    if (i10 != 64) {
                                        if (i10 != 128) {
                                            if (i10 == 256) {
                                                return 8;
                                            }
                                            throw new IllegalArgumentException("type needs to be >= FIRST and <= LAST, type=" + i10);
                                        }
                                        return 7;
                                    }
                                    return 6;
                                }
                                return 5;
                            }
                            return 4;
                        }
                        return 3;
                    }
                    return 2;
                }
                return 1;
            }
            return 0;
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    /* loaded from: classes.dex */
    private static final class n {
        static int a(int i10) {
            int statusBars;
            int i11 = 0;
            for (int i12 = 1; i12 <= 256; i12 <<= 1) {
                if ((i10 & i12) != 0) {
                    if (i12 == 1) {
                        statusBars = WindowInsets.Type.statusBars();
                    } else if (i12 == 2) {
                        statusBars = WindowInsets.Type.navigationBars();
                    } else if (i12 == 4) {
                        statusBars = WindowInsets.Type.captionBar();
                    } else if (i12 == 8) {
                        statusBars = WindowInsets.Type.ime();
                    } else if (i12 == 16) {
                        statusBars = WindowInsets.Type.systemGestures();
                    } else if (i12 == 32) {
                        statusBars = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i12 == 64) {
                        statusBars = WindowInsets.Type.tappableElement();
                    } else if (i12 == 128) {
                        statusBars = WindowInsets.Type.displayCutout();
                    }
                    i11 |= statusBars;
                }
            }
            return i11;
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            f2679b = k.f2709q;
        } else {
            f2679b = l.f2710b;
        }
    }

    private i0(WindowInsets windowInsets) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            this.f2680a = new k(this, windowInsets);
        } else if (i10 >= 29) {
            this.f2680a = new j(this, windowInsets);
        } else if (i10 >= 28) {
            this.f2680a = new i(this, windowInsets);
        } else if (i10 >= 21) {
            this.f2680a = new h(this, windowInsets);
        } else if (i10 >= 20) {
            this.f2680a = new g(this, windowInsets);
        } else {
            this.f2680a = new l(this);
        }
    }

    static z.b m(z.b bVar, int i10, int i11, int i12, int i13) {
        int max = Math.max(0, bVar.f39851a - i10);
        int max2 = Math.max(0, bVar.f39852b - i11);
        int max3 = Math.max(0, bVar.f39853c - i12);
        int max4 = Math.max(0, bVar.f39854d - i13);
        return (max == i10 && max2 == i11 && max3 == i12 && max4 == i13) ? bVar : z.b.b(max, max2, max3, max4);
    }

    public static i0 u(WindowInsets windowInsets) {
        return v(windowInsets, null);
    }

    public static i0 v(WindowInsets windowInsets, View view) {
        i0 i0Var = new i0((WindowInsets) h0.g.f(windowInsets));
        if (view != null && z.T(view)) {
            i0Var.r(z.J(view));
            i0Var.d(view.getRootView());
        }
        return i0Var;
    }

    @Deprecated
    public i0 a() {
        return this.f2680a.a();
    }

    @Deprecated
    public i0 b() {
        return this.f2680a.b();
    }

    @Deprecated
    public i0 c() {
        return this.f2680a.c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(View view) {
        this.f2680a.d(view);
    }

    public androidx.core.view.d e() {
        return this.f2680a.f();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i0) {
            return h0.c.a(this.f2680a, ((i0) obj).f2680a);
        }
        return false;
    }

    public z.b f(int i10) {
        return this.f2680a.g(i10);
    }

    @Deprecated
    public z.b g() {
        return this.f2680a.i();
    }

    @Deprecated
    public int h() {
        return this.f2680a.k().f39854d;
    }

    public int hashCode() {
        l lVar = this.f2680a;
        if (lVar == null) {
            return 0;
        }
        return lVar.hashCode();
    }

    @Deprecated
    public int i() {
        return this.f2680a.k().f39851a;
    }

    @Deprecated
    public int j() {
        return this.f2680a.k().f39853c;
    }

    @Deprecated
    public int k() {
        return this.f2680a.k().f39852b;
    }

    public i0 l(int i10, int i11, int i12, int i13) {
        return this.f2680a.m(i10, i11, i12, i13);
    }

    public boolean n() {
        return this.f2680a.n();
    }

    @Deprecated
    public i0 o(int i10, int i11, int i12, int i13) {
        return new b(this).c(z.b.b(i10, i11, i12, i13)).a();
    }

    void p(z.b[] bVarArr) {
        this.f2680a.p(bVarArr);
    }

    void q(z.b bVar) {
        this.f2680a.q(bVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void r(i0 i0Var) {
        this.f2680a.r(i0Var);
    }

    void s(z.b bVar) {
        this.f2680a.s(bVar);
    }

    public WindowInsets t() {
        l lVar = this.f2680a;
        if (lVar instanceof g) {
            return ((g) lVar).f2700c;
        }
        return null;
    }

    /* compiled from: WindowInsetsCompat.java */
    /* loaded from: classes.dex */
    private static class c extends f {

        /* renamed from: e  reason: collision with root package name */
        private static Field f2686e = null;

        /* renamed from: f  reason: collision with root package name */
        private static boolean f2687f = false;

        /* renamed from: g  reason: collision with root package name */
        private static Constructor<WindowInsets> f2688g = null;

        /* renamed from: h  reason: collision with root package name */
        private static boolean f2689h = false;

        /* renamed from: c  reason: collision with root package name */
        private WindowInsets f2690c;

        /* renamed from: d  reason: collision with root package name */
        private z.b f2691d;

        c() {
            this.f2690c = h();
        }

        private static WindowInsets h() {
            if (!f2687f) {
                try {
                    f2686e = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException e10) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e10);
                }
                f2687f = true;
            }
            Field field = f2686e;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get(null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException e11) {
                    Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e11);
                }
            }
            if (!f2689h) {
                try {
                    f2688g = WindowInsets.class.getConstructor(Rect.class);
                } catch (ReflectiveOperationException e12) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e12);
                }
                f2689h = true;
            }
            Constructor<WindowInsets> constructor = f2688g;
            if (constructor != null) {
                try {
                    return constructor.newInstance(new Rect());
                } catch (ReflectiveOperationException e13) {
                    Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e13);
                }
            }
            return null;
        }

        @Override // androidx.core.view.i0.f
        i0 b() {
            a();
            i0 u10 = i0.u(this.f2690c);
            u10.p(this.f2694b);
            u10.s(this.f2691d);
            return u10;
        }

        @Override // androidx.core.view.i0.f
        void d(z.b bVar) {
            this.f2691d = bVar;
        }

        @Override // androidx.core.view.i0.f
        void f(z.b bVar) {
            WindowInsets windowInsets = this.f2690c;
            if (windowInsets != null) {
                this.f2690c = windowInsets.replaceSystemWindowInsets(bVar.f39851a, bVar.f39852b, bVar.f39853c, bVar.f39854d);
            }
        }

        c(i0 i0Var) {
            super(i0Var);
            this.f2690c = i0Var.t();
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    /* loaded from: classes.dex */
    private static class d extends f {

        /* renamed from: c  reason: collision with root package name */
        final WindowInsets.Builder f2692c;

        d() {
            this.f2692c = new WindowInsets.Builder();
        }

        @Override // androidx.core.view.i0.f
        i0 b() {
            a();
            i0 u10 = i0.u(this.f2692c.build());
            u10.p(this.f2694b);
            return u10;
        }

        @Override // androidx.core.view.i0.f
        void c(z.b bVar) {
            this.f2692c.setMandatorySystemGestureInsets(bVar.e());
        }

        @Override // androidx.core.view.i0.f
        void d(z.b bVar) {
            this.f2692c.setStableInsets(bVar.e());
        }

        @Override // androidx.core.view.i0.f
        void e(z.b bVar) {
            this.f2692c.setSystemGestureInsets(bVar.e());
        }

        @Override // androidx.core.view.i0.f
        void f(z.b bVar) {
            this.f2692c.setSystemWindowInsets(bVar.e());
        }

        @Override // androidx.core.view.i0.f
        void g(z.b bVar) {
            this.f2692c.setTappableElementInsets(bVar.e());
        }

        d(i0 i0Var) {
            super(i0Var);
            WindowInsets.Builder builder;
            WindowInsets t10 = i0Var.t();
            if (t10 != null) {
                builder = new WindowInsets.Builder(t10);
            } else {
                builder = new WindowInsets.Builder();
            }
            this.f2692c = builder;
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    /* loaded from: classes.dex */
    private static class h extends g {

        /* renamed from: m  reason: collision with root package name */
        private z.b f2705m;

        h(i0 i0Var, WindowInsets windowInsets) {
            super(i0Var, windowInsets);
            this.f2705m = null;
        }

        @Override // androidx.core.view.i0.l
        i0 b() {
            return i0.u(this.f2700c.consumeStableInsets());
        }

        @Override // androidx.core.view.i0.l
        i0 c() {
            return i0.u(this.f2700c.consumeSystemWindowInsets());
        }

        @Override // androidx.core.view.i0.l
        final z.b i() {
            if (this.f2705m == null) {
                this.f2705m = z.b.b(this.f2700c.getStableInsetLeft(), this.f2700c.getStableInsetTop(), this.f2700c.getStableInsetRight(), this.f2700c.getStableInsetBottom());
            }
            return this.f2705m;
        }

        @Override // androidx.core.view.i0.l
        boolean n() {
            return this.f2700c.isConsumed();
        }

        @Override // androidx.core.view.i0.l
        public void s(z.b bVar) {
            this.f2705m = bVar;
        }

        h(i0 i0Var, h hVar) {
            super(i0Var, hVar);
            this.f2705m = null;
            this.f2705m = hVar.f2705m;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: WindowInsetsCompat.java */
    /* loaded from: classes.dex */
    public static class g extends l {

        /* renamed from: h  reason: collision with root package name */
        private static boolean f2695h = false;

        /* renamed from: i  reason: collision with root package name */
        private static Method f2696i;

        /* renamed from: j  reason: collision with root package name */
        private static Class<?> f2697j;

        /* renamed from: k  reason: collision with root package name */
        private static Field f2698k;

        /* renamed from: l  reason: collision with root package name */
        private static Field f2699l;

        /* renamed from: c  reason: collision with root package name */
        final WindowInsets f2700c;

        /* renamed from: d  reason: collision with root package name */
        private z.b[] f2701d;

        /* renamed from: e  reason: collision with root package name */
        private z.b f2702e;

        /* renamed from: f  reason: collision with root package name */
        private i0 f2703f;

        /* renamed from: g  reason: collision with root package name */
        z.b f2704g;

        g(i0 i0Var, WindowInsets windowInsets) {
            super(i0Var);
            this.f2702e = null;
            this.f2700c = windowInsets;
        }

        @SuppressLint({"WrongConstant"})
        private z.b t(int i10, boolean z10) {
            z.b bVar = z.b.f39850e;
            for (int i11 = 1; i11 <= 256; i11 <<= 1) {
                if ((i10 & i11) != 0) {
                    bVar = z.b.a(bVar, u(i11, z10));
                }
            }
            return bVar;
        }

        private z.b v() {
            i0 i0Var = this.f2703f;
            if (i0Var != null) {
                return i0Var.g();
            }
            return z.b.f39850e;
        }

        private z.b w(View view) {
            if (Build.VERSION.SDK_INT < 30) {
                if (!f2695h) {
                    x();
                }
                Method method = f2696i;
                if (method != null && f2697j != null && f2698k != null) {
                    try {
                        Object invoke = method.invoke(view, new Object[0]);
                        if (invoke == null) {
                            Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                            return null;
                        }
                        Rect rect = (Rect) f2698k.get(f2699l.get(invoke));
                        if (rect != null) {
                            return z.b.c(rect);
                        }
                        return null;
                    } catch (ReflectiveOperationException e10) {
                        Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e10.getMessage(), e10);
                    }
                }
                return null;
            }
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }

        @SuppressLint({"PrivateApi"})
        private static void x() {
            try {
                f2696i = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                f2697j = cls;
                f2698k = cls.getDeclaredField("mVisibleInsets");
                f2699l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                f2698k.setAccessible(true);
                f2699l.setAccessible(true);
            } catch (ReflectiveOperationException e10) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e10.getMessage(), e10);
            }
            f2695h = true;
        }

        @Override // androidx.core.view.i0.l
        void d(View view) {
            z.b w10 = w(view);
            if (w10 == null) {
                w10 = z.b.f39850e;
            }
            q(w10);
        }

        @Override // androidx.core.view.i0.l
        void e(i0 i0Var) {
            i0Var.r(this.f2703f);
            i0Var.q(this.f2704g);
        }

        @Override // androidx.core.view.i0.l
        public boolean equals(Object obj) {
            if (super.equals(obj)) {
                return Objects.equals(this.f2704g, ((g) obj).f2704g);
            }
            return false;
        }

        @Override // androidx.core.view.i0.l
        public z.b g(int i10) {
            return t(i10, false);
        }

        @Override // androidx.core.view.i0.l
        final z.b k() {
            if (this.f2702e == null) {
                this.f2702e = z.b.b(this.f2700c.getSystemWindowInsetLeft(), this.f2700c.getSystemWindowInsetTop(), this.f2700c.getSystemWindowInsetRight(), this.f2700c.getSystemWindowInsetBottom());
            }
            return this.f2702e;
        }

        @Override // androidx.core.view.i0.l
        i0 m(int i10, int i11, int i12, int i13) {
            b bVar = new b(i0.u(this.f2700c));
            bVar.c(i0.m(k(), i10, i11, i12, i13));
            bVar.b(i0.m(i(), i10, i11, i12, i13));
            return bVar.a();
        }

        @Override // androidx.core.view.i0.l
        boolean o() {
            return this.f2700c.isRound();
        }

        @Override // androidx.core.view.i0.l
        public void p(z.b[] bVarArr) {
            this.f2701d = bVarArr;
        }

        @Override // androidx.core.view.i0.l
        void q(z.b bVar) {
            this.f2704g = bVar;
        }

        @Override // androidx.core.view.i0.l
        void r(i0 i0Var) {
            this.f2703f = i0Var;
        }

        protected z.b u(int i10, boolean z10) {
            z.b g10;
            int i11;
            androidx.core.view.d f10;
            if (i10 == 1) {
                if (z10) {
                    return z.b.b(0, Math.max(v().f39852b, k().f39852b), 0, 0);
                }
                return z.b.b(0, k().f39852b, 0, 0);
            }
            if (i10 == 2) {
                if (z10) {
                    z.b v10 = v();
                    z.b i12 = i();
                    return z.b.b(Math.max(v10.f39851a, i12.f39851a), 0, Math.max(v10.f39853c, i12.f39853c), Math.max(v10.f39854d, i12.f39854d));
                }
                z.b k10 = k();
                i0 i0Var = this.f2703f;
                g10 = i0Var != null ? i0Var.g() : null;
                int i13 = k10.f39854d;
                if (g10 != null) {
                    i13 = Math.min(i13, g10.f39854d);
                }
                return z.b.b(k10.f39851a, 0, k10.f39853c, i13);
            } else if (i10 != 8) {
                if (i10 != 16) {
                    if (i10 != 32) {
                        if (i10 != 64) {
                            if (i10 != 128) {
                                return z.b.f39850e;
                            }
                            i0 i0Var2 = this.f2703f;
                            if (i0Var2 != null) {
                                f10 = i0Var2.e();
                            } else {
                                f10 = f();
                            }
                            if (f10 != null) {
                                return z.b.b(f10.b(), f10.d(), f10.c(), f10.a());
                            }
                            return z.b.f39850e;
                        }
                        return l();
                    }
                    return h();
                }
                return j();
            } else {
                z.b[] bVarArr = this.f2701d;
                g10 = bVarArr != null ? bVarArr[m.a(8)] : null;
                if (g10 != null) {
                    return g10;
                }
                z.b k11 = k();
                z.b v11 = v();
                int i14 = k11.f39854d;
                if (i14 > v11.f39854d) {
                    return z.b.b(0, 0, 0, i14);
                }
                z.b bVar = this.f2704g;
                if (bVar != null && !bVar.equals(z.b.f39850e) && (i11 = this.f2704g.f39854d) > v11.f39854d) {
                    return z.b.b(0, 0, 0, i11);
                }
                return z.b.f39850e;
            }
        }

        g(i0 i0Var, g gVar) {
            this(i0Var, new WindowInsets(gVar.f2700c));
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    /* loaded from: classes.dex */
    private static class j extends i {

        /* renamed from: n  reason: collision with root package name */
        private z.b f2706n;

        /* renamed from: o  reason: collision with root package name */
        private z.b f2707o;

        /* renamed from: p  reason: collision with root package name */
        private z.b f2708p;

        j(i0 i0Var, WindowInsets windowInsets) {
            super(i0Var, windowInsets);
            this.f2706n = null;
            this.f2707o = null;
            this.f2708p = null;
        }

        @Override // androidx.core.view.i0.l
        z.b h() {
            if (this.f2707o == null) {
                this.f2707o = z.b.d(this.f2700c.getMandatorySystemGestureInsets());
            }
            return this.f2707o;
        }

        @Override // androidx.core.view.i0.l
        z.b j() {
            if (this.f2706n == null) {
                this.f2706n = z.b.d(this.f2700c.getSystemGestureInsets());
            }
            return this.f2706n;
        }

        @Override // androidx.core.view.i0.l
        z.b l() {
            if (this.f2708p == null) {
                this.f2708p = z.b.d(this.f2700c.getTappableElementInsets());
            }
            return this.f2708p;
        }

        @Override // androidx.core.view.i0.g, androidx.core.view.i0.l
        i0 m(int i10, int i11, int i12, int i13) {
            return i0.u(this.f2700c.inset(i10, i11, i12, i13));
        }

        @Override // androidx.core.view.i0.h, androidx.core.view.i0.l
        public void s(z.b bVar) {
        }

        j(i0 i0Var, j jVar) {
            super(i0Var, jVar);
            this.f2706n = null;
            this.f2707o = null;
            this.f2708p = null;
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final f f2685a;

        public b() {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 30) {
                this.f2685a = new e();
            } else if (i10 >= 29) {
                this.f2685a = new d();
            } else if (i10 >= 20) {
                this.f2685a = new c();
            } else {
                this.f2685a = new f();
            }
        }

        public i0 a() {
            return this.f2685a.b();
        }

        @Deprecated
        public b b(z.b bVar) {
            this.f2685a.d(bVar);
            return this;
        }

        @Deprecated
        public b c(z.b bVar) {
            this.f2685a.f(bVar);
            return this;
        }

        public b(i0 i0Var) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 30) {
                this.f2685a = new e(i0Var);
            } else if (i10 >= 29) {
                this.f2685a = new d(i0Var);
            } else if (i10 >= 20) {
                this.f2685a = new c(i0Var);
            } else {
                this.f2685a = new f(i0Var);
            }
        }
    }

    public i0(i0 i0Var) {
        if (i0Var != null) {
            l lVar = i0Var.f2680a;
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 30 && (lVar instanceof k)) {
                this.f2680a = new k(this, (k) lVar);
            } else if (i10 >= 29 && (lVar instanceof j)) {
                this.f2680a = new j(this, (j) lVar);
            } else if (i10 >= 28 && (lVar instanceof i)) {
                this.f2680a = new i(this, (i) lVar);
            } else if (i10 >= 21 && (lVar instanceof h)) {
                this.f2680a = new h(this, (h) lVar);
            } else if (i10 >= 20 && (lVar instanceof g)) {
                this.f2680a = new g(this, (g) lVar);
            } else {
                this.f2680a = new l(this);
            }
            lVar.e(this);
            return;
        }
        this.f2680a = new l(this);
    }
}
