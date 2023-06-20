package f;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DrawableContainer.java */
/* loaded from: classes.dex */
public class b extends Drawable implements Drawable.Callback {

    /* renamed from: a  reason: collision with root package name */
    private d f29852a;

    /* renamed from: b  reason: collision with root package name */
    private Rect f29853b;

    /* renamed from: c  reason: collision with root package name */
    private Drawable f29854c;

    /* renamed from: d  reason: collision with root package name */
    private Drawable f29855d;

    /* renamed from: f  reason: collision with root package name */
    private boolean f29857f;

    /* renamed from: h  reason: collision with root package name */
    private boolean f29859h;

    /* renamed from: i  reason: collision with root package name */
    private Runnable f29860i;

    /* renamed from: j  reason: collision with root package name */
    private long f29861j;

    /* renamed from: k  reason: collision with root package name */
    private long f29862k;

    /* renamed from: l  reason: collision with root package name */
    private c f29863l;

    /* renamed from: e  reason: collision with root package name */
    private int f29856e = 255;

    /* renamed from: g  reason: collision with root package name */
    private int f29858g = -1;

    /* compiled from: DrawableContainer.java */
    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.a(true);
            b.this.invalidateSelf();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DrawableContainer.java */
    /* renamed from: f.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0373b {
        public static boolean a(Drawable.ConstantState constantState) {
            return constantState.canApplyTheme();
        }

        public static void b(Drawable drawable, Outline outline) {
            drawable.getOutline(outline);
        }

        public static Resources c(Resources.Theme theme) {
            return theme.getResources();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DrawableContainer.java */
    /* loaded from: classes.dex */
    public static class c implements Drawable.Callback {

        /* renamed from: a  reason: collision with root package name */
        private Drawable.Callback f29865a;

        c() {
        }

        public Drawable.Callback a() {
            Drawable.Callback callback = this.f29865a;
            this.f29865a = null;
            return callback;
        }

        public c b(Drawable.Callback callback) {
            this.f29865a = callback;
            return this;
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
            Drawable.Callback callback = this.f29865a;
            if (callback != null) {
                callback.scheduleDrawable(drawable, runnable, j10);
            }
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            Drawable.Callback callback = this.f29865a;
            if (callback != null) {
                callback.unscheduleDrawable(drawable, runnable);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DrawableContainer.java */
    /* loaded from: classes.dex */
    public static abstract class d extends Drawable.ConstantState {
        int A;
        int B;
        boolean C;
        ColorFilter D;
        boolean E;
        ColorStateList F;
        PorterDuff.Mode G;
        boolean H;
        boolean I;

        /* renamed from: a  reason: collision with root package name */
        final b f29866a;

        /* renamed from: b  reason: collision with root package name */
        Resources f29867b;

        /* renamed from: c  reason: collision with root package name */
        int f29868c;

        /* renamed from: d  reason: collision with root package name */
        int f29869d;

        /* renamed from: e  reason: collision with root package name */
        int f29870e;

        /* renamed from: f  reason: collision with root package name */
        SparseArray<Drawable.ConstantState> f29871f;

        /* renamed from: g  reason: collision with root package name */
        Drawable[] f29872g;

        /* renamed from: h  reason: collision with root package name */
        int f29873h;

        /* renamed from: i  reason: collision with root package name */
        boolean f29874i;

        /* renamed from: j  reason: collision with root package name */
        boolean f29875j;

        /* renamed from: k  reason: collision with root package name */
        Rect f29876k;

        /* renamed from: l  reason: collision with root package name */
        boolean f29877l;

        /* renamed from: m  reason: collision with root package name */
        boolean f29878m;

        /* renamed from: n  reason: collision with root package name */
        int f29879n;

        /* renamed from: o  reason: collision with root package name */
        int f29880o;

        /* renamed from: p  reason: collision with root package name */
        int f29881p;

        /* renamed from: q  reason: collision with root package name */
        int f29882q;

        /* renamed from: r  reason: collision with root package name */
        boolean f29883r;

        /* renamed from: s  reason: collision with root package name */
        int f29884s;

        /* renamed from: t  reason: collision with root package name */
        boolean f29885t;

        /* renamed from: u  reason: collision with root package name */
        boolean f29886u;

        /* renamed from: v  reason: collision with root package name */
        boolean f29887v;

        /* renamed from: w  reason: collision with root package name */
        boolean f29888w;

        /* renamed from: x  reason: collision with root package name */
        boolean f29889x;

        /* renamed from: y  reason: collision with root package name */
        boolean f29890y;

        /* renamed from: z  reason: collision with root package name */
        int f29891z;

        /* JADX INFO: Access modifiers changed from: package-private */
        public d(d dVar, b bVar, Resources resources) {
            Resources resources2;
            this.f29874i = false;
            this.f29877l = false;
            this.f29889x = true;
            this.A = 0;
            this.B = 0;
            this.f29866a = bVar;
            if (resources != null) {
                resources2 = resources;
            } else {
                resources2 = dVar != null ? dVar.f29867b : null;
            }
            this.f29867b = resources2;
            int f10 = b.f(resources, dVar != null ? dVar.f29868c : 0);
            this.f29868c = f10;
            if (dVar != null) {
                this.f29869d = dVar.f29869d;
                this.f29870e = dVar.f29870e;
                this.f29887v = true;
                this.f29888w = true;
                this.f29874i = dVar.f29874i;
                this.f29877l = dVar.f29877l;
                this.f29889x = dVar.f29889x;
                this.f29890y = dVar.f29890y;
                this.f29891z = dVar.f29891z;
                this.A = dVar.A;
                this.B = dVar.B;
                this.C = dVar.C;
                this.D = dVar.D;
                this.E = dVar.E;
                this.F = dVar.F;
                this.G = dVar.G;
                this.H = dVar.H;
                this.I = dVar.I;
                if (dVar.f29868c == f10) {
                    if (dVar.f29875j) {
                        this.f29876k = dVar.f29876k != null ? new Rect(dVar.f29876k) : null;
                        this.f29875j = true;
                    }
                    if (dVar.f29878m) {
                        this.f29879n = dVar.f29879n;
                        this.f29880o = dVar.f29880o;
                        this.f29881p = dVar.f29881p;
                        this.f29882q = dVar.f29882q;
                        this.f29878m = true;
                    }
                }
                if (dVar.f29883r) {
                    this.f29884s = dVar.f29884s;
                    this.f29883r = true;
                }
                if (dVar.f29885t) {
                    this.f29886u = dVar.f29886u;
                    this.f29885t = true;
                }
                Drawable[] drawableArr = dVar.f29872g;
                this.f29872g = new Drawable[drawableArr.length];
                this.f29873h = dVar.f29873h;
                SparseArray<Drawable.ConstantState> sparseArray = dVar.f29871f;
                if (sparseArray != null) {
                    this.f29871f = sparseArray.clone();
                } else {
                    this.f29871f = new SparseArray<>(this.f29873h);
                }
                int i10 = this.f29873h;
                for (int i11 = 0; i11 < i10; i11++) {
                    if (drawableArr[i11] != null) {
                        Drawable.ConstantState constantState = drawableArr[i11].getConstantState();
                        if (constantState != null) {
                            this.f29871f.put(i11, constantState);
                        } else {
                            this.f29872g[i11] = drawableArr[i11];
                        }
                    }
                }
                return;
            }
            this.f29872g = new Drawable[10];
            this.f29873h = 0;
        }

        private void e() {
            SparseArray<Drawable.ConstantState> sparseArray = this.f29871f;
            if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i10 = 0; i10 < size; i10++) {
                    this.f29872g[this.f29871f.keyAt(i10)] = s(this.f29871f.valueAt(i10).newDrawable(this.f29867b));
                }
                this.f29871f = null;
            }
        }

        private Drawable s(Drawable drawable) {
            if (Build.VERSION.SDK_INT >= 23) {
                androidx.core.graphics.drawable.a.m(drawable, this.f29891z);
            }
            Drawable mutate = drawable.mutate();
            mutate.setCallback(this.f29866a);
            return mutate;
        }

        public final int a(Drawable drawable) {
            int i10 = this.f29873h;
            if (i10 >= this.f29872g.length) {
                o(i10, i10 + 10);
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            drawable.setCallback(this.f29866a);
            this.f29872g[i10] = drawable;
            this.f29873h++;
            this.f29870e = drawable.getChangingConfigurations() | this.f29870e;
            p();
            this.f29876k = null;
            this.f29875j = false;
            this.f29878m = false;
            this.f29887v = false;
            return i10;
        }

        final void b(Resources.Theme theme) {
            if (theme != null) {
                e();
                int i10 = this.f29873h;
                Drawable[] drawableArr = this.f29872g;
                for (int i11 = 0; i11 < i10; i11++) {
                    if (drawableArr[i11] != null && androidx.core.graphics.drawable.a.b(drawableArr[i11])) {
                        androidx.core.graphics.drawable.a.a(drawableArr[i11], theme);
                        this.f29870e |= drawableArr[i11].getChangingConfigurations();
                    }
                }
                y(C0373b.c(theme));
            }
        }

        public boolean c() {
            if (this.f29887v) {
                return this.f29888w;
            }
            e();
            this.f29887v = true;
            int i10 = this.f29873h;
            Drawable[] drawableArr = this.f29872g;
            for (int i11 = 0; i11 < i10; i11++) {
                if (drawableArr[i11].getConstantState() == null) {
                    this.f29888w = false;
                    return false;
                }
            }
            this.f29888w = true;
            return true;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            int i10 = this.f29873h;
            Drawable[] drawableArr = this.f29872g;
            for (int i11 = 0; i11 < i10; i11++) {
                Drawable drawable = drawableArr[i11];
                if (drawable != null) {
                    if (androidx.core.graphics.drawable.a.b(drawable)) {
                        return true;
                    }
                } else {
                    Drawable.ConstantState constantState = this.f29871f.get(i11);
                    if (constantState != null && C0373b.a(constantState)) {
                        return true;
                    }
                }
            }
            return false;
        }

        protected void d() {
            this.f29878m = true;
            e();
            int i10 = this.f29873h;
            Drawable[] drawableArr = this.f29872g;
            this.f29880o = -1;
            this.f29879n = -1;
            this.f29882q = 0;
            this.f29881p = 0;
            for (int i11 = 0; i11 < i10; i11++) {
                Drawable drawable = drawableArr[i11];
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.f29879n) {
                    this.f29879n = intrinsicWidth;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.f29880o) {
                    this.f29880o = intrinsicHeight;
                }
                int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.f29881p) {
                    this.f29881p = minimumWidth;
                }
                int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.f29882q) {
                    this.f29882q = minimumHeight;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final int f() {
            return this.f29872g.length;
        }

        public final Drawable g(int i10) {
            int indexOfKey;
            Drawable drawable = this.f29872g[i10];
            if (drawable != null) {
                return drawable;
            }
            SparseArray<Drawable.ConstantState> sparseArray = this.f29871f;
            if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i10)) < 0) {
                return null;
            }
            Drawable s10 = s(this.f29871f.valueAt(indexOfKey).newDrawable(this.f29867b));
            this.f29872g[i10] = s10;
            this.f29871f.removeAt(indexOfKey);
            if (this.f29871f.size() == 0) {
                this.f29871f = null;
            }
            return s10;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f29869d | this.f29870e;
        }

        public final int h() {
            return this.f29873h;
        }

        public final int i() {
            if (!this.f29878m) {
                d();
            }
            return this.f29880o;
        }

        public final int j() {
            if (!this.f29878m) {
                d();
            }
            return this.f29882q;
        }

        public final int k() {
            if (!this.f29878m) {
                d();
            }
            return this.f29881p;
        }

        public final Rect l() {
            Rect rect = null;
            if (this.f29874i) {
                return null;
            }
            Rect rect2 = this.f29876k;
            if (rect2 != null || this.f29875j) {
                return rect2;
            }
            e();
            Rect rect3 = new Rect();
            int i10 = this.f29873h;
            Drawable[] drawableArr = this.f29872g;
            for (int i11 = 0; i11 < i10; i11++) {
                if (drawableArr[i11].getPadding(rect3)) {
                    if (rect == null) {
                        rect = new Rect(0, 0, 0, 0);
                    }
                    int i12 = rect3.left;
                    if (i12 > rect.left) {
                        rect.left = i12;
                    }
                    int i13 = rect3.top;
                    if (i13 > rect.top) {
                        rect.top = i13;
                    }
                    int i14 = rect3.right;
                    if (i14 > rect.right) {
                        rect.right = i14;
                    }
                    int i15 = rect3.bottom;
                    if (i15 > rect.bottom) {
                        rect.bottom = i15;
                    }
                }
            }
            this.f29875j = true;
            this.f29876k = rect;
            return rect;
        }

        public final int m() {
            if (!this.f29878m) {
                d();
            }
            return this.f29879n;
        }

        public final int n() {
            if (this.f29883r) {
                return this.f29884s;
            }
            e();
            int i10 = this.f29873h;
            Drawable[] drawableArr = this.f29872g;
            int opacity = i10 > 0 ? drawableArr[0].getOpacity() : -2;
            for (int i11 = 1; i11 < i10; i11++) {
                opacity = Drawable.resolveOpacity(opacity, drawableArr[i11].getOpacity());
            }
            this.f29884s = opacity;
            this.f29883r = true;
            return opacity;
        }

        public void o(int i10, int i11) {
            Drawable[] drawableArr = new Drawable[i11];
            Drawable[] drawableArr2 = this.f29872g;
            if (drawableArr2 != null) {
                System.arraycopy(drawableArr2, 0, drawableArr, 0, i10);
            }
            this.f29872g = drawableArr;
        }

        void p() {
            this.f29883r = false;
            this.f29885t = false;
        }

        public final boolean q() {
            return this.f29877l;
        }

        abstract void r();

        public final void t(boolean z10) {
            this.f29877l = z10;
        }

        public final void u(int i10) {
            this.A = i10;
        }

        public final void v(int i10) {
            this.B = i10;
        }

        final boolean w(int i10, int i11) {
            int i12 = this.f29873h;
            Drawable[] drawableArr = this.f29872g;
            boolean z10 = false;
            for (int i13 = 0; i13 < i12; i13++) {
                if (drawableArr[i13] != null) {
                    boolean m10 = Build.VERSION.SDK_INT >= 23 ? androidx.core.graphics.drawable.a.m(drawableArr[i13], i10) : false;
                    if (i13 == i11) {
                        z10 = m10;
                    }
                }
            }
            this.f29891z = i10;
            return z10;
        }

        public final void x(boolean z10) {
            this.f29874i = z10;
        }

        final void y(Resources resources) {
            if (resources != null) {
                this.f29867b = resources;
                int f10 = b.f(resources, this.f29868c);
                int i10 = this.f29868c;
                this.f29868c = f10;
                if (i10 != f10) {
                    this.f29878m = false;
                    this.f29875j = false;
                }
            }
        }
    }

    private void d(Drawable drawable) {
        if (this.f29863l == null) {
            this.f29863l = new c();
        }
        drawable.setCallback(this.f29863l.b(drawable.getCallback()));
        try {
            if (this.f29852a.A <= 0 && this.f29857f) {
                drawable.setAlpha(this.f29856e);
            }
            d dVar = this.f29852a;
            if (dVar.E) {
                drawable.setColorFilter(dVar.D);
            } else {
                if (dVar.H) {
                    androidx.core.graphics.drawable.a.o(drawable, dVar.F);
                }
                d dVar2 = this.f29852a;
                if (dVar2.I) {
                    androidx.core.graphics.drawable.a.p(drawable, dVar2.G);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f29852a.f29889x);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 23) {
                androidx.core.graphics.drawable.a.m(drawable, androidx.core.graphics.drawable.a.f(this));
            }
            if (i10 >= 19) {
                androidx.core.graphics.drawable.a.j(drawable, this.f29852a.C);
            }
            Rect rect = this.f29853b;
            if (i10 >= 21 && rect != null) {
                androidx.core.graphics.drawable.a.l(drawable, rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            drawable.setCallback(this.f29863l.a());
        }
    }

    private boolean e() {
        return isAutoMirrored() && androidx.core.graphics.drawable.a.f(this) == 1;
    }

    static int f(Resources resources, int i10) {
        if (resources != null) {
            i10 = resources.getDisplayMetrics().densityDpi;
        }
        if (i10 == 0) {
            return 160;
        }
        return i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void a(boolean r14) {
        /*
            r13 = this;
            r0 = 1
            r13.f29857f = r0
            long r1 = android.os.SystemClock.uptimeMillis()
            android.graphics.drawable.Drawable r3 = r13.f29854c
            r4 = 255(0xff, double:1.26E-321)
            r6 = 0
            r7 = 0
            if (r3 == 0) goto L38
            long r9 = r13.f29861j
            int r11 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r11 == 0) goto L3a
            int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r11 > 0) goto L22
            int r9 = r13.f29856e
            r3.setAlpha(r9)
            r13.f29861j = r7
            goto L3a
        L22:
            long r9 = r9 - r1
            long r9 = r9 * r4
            int r10 = (int) r9
            f.b$d r9 = r13.f29852a
            int r9 = r9.A
            int r10 = r10 / r9
            int r9 = 255 - r10
            int r10 = r13.f29856e
            int r9 = r9 * r10
            int r9 = r9 / 255
            r3.setAlpha(r9)
            r3 = 1
            goto L3b
        L38:
            r13.f29861j = r7
        L3a:
            r3 = 0
        L3b:
            android.graphics.drawable.Drawable r9 = r13.f29855d
            if (r9 == 0) goto L65
            long r10 = r13.f29862k
            int r12 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r12 == 0) goto L67
            int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r12 > 0) goto L52
            r9.setVisible(r6, r6)
            r0 = 0
            r13.f29855d = r0
            r13.f29862k = r7
            goto L67
        L52:
            long r10 = r10 - r1
            long r10 = r10 * r4
            int r3 = (int) r10
            f.b$d r4 = r13.f29852a
            int r4 = r4.B
            int r3 = r3 / r4
            int r4 = r13.f29856e
            int r3 = r3 * r4
            int r3 = r3 / 255
            r9.setAlpha(r3)
            goto L68
        L65:
            r13.f29862k = r7
        L67:
            r0 = r3
        L68:
            if (r14 == 0) goto L74
            if (r0 == 0) goto L74
            java.lang.Runnable r14 = r13.f29860i
            r3 = 16
            long r1 = r1 + r3
            r13.scheduleSelf(r14, r1)
        L74:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f.b.a(boolean):void");
    }

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        this.f29852a.b(theme);
    }

    d b() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int c() {
        return this.f29858g;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        return this.f29852a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f29854c;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f29855d;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean g(int r10) {
        /*
            r9 = this;
            int r0 = r9.f29858g
            r1 = 0
            if (r10 != r0) goto L6
            return r1
        L6:
            long r2 = android.os.SystemClock.uptimeMillis()
            f.b$d r0 = r9.f29852a
            int r0 = r0.B
            r4 = 0
            r5 = 0
            if (r0 <= 0) goto L2e
            android.graphics.drawable.Drawable r0 = r9.f29855d
            if (r0 == 0) goto L1a
            r0.setVisible(r1, r1)
        L1a:
            android.graphics.drawable.Drawable r0 = r9.f29854c
            if (r0 == 0) goto L29
            r9.f29855d = r0
            f.b$d r0 = r9.f29852a
            int r0 = r0.B
            long r0 = (long) r0
            long r0 = r0 + r2
            r9.f29862k = r0
            goto L35
        L29:
            r9.f29855d = r4
            r9.f29862k = r5
            goto L35
        L2e:
            android.graphics.drawable.Drawable r0 = r9.f29854c
            if (r0 == 0) goto L35
            r0.setVisible(r1, r1)
        L35:
            if (r10 < 0) goto L55
            f.b$d r0 = r9.f29852a
            int r1 = r0.f29873h
            if (r10 >= r1) goto L55
            android.graphics.drawable.Drawable r0 = r0.g(r10)
            r9.f29854c = r0
            r9.f29858g = r10
            if (r0 == 0) goto L5a
            f.b$d r10 = r9.f29852a
            int r10 = r10.A
            if (r10 <= 0) goto L51
            long r7 = (long) r10
            long r2 = r2 + r7
            r9.f29861j = r2
        L51:
            r9.d(r0)
            goto L5a
        L55:
            r9.f29854c = r4
            r10 = -1
            r9.f29858g = r10
        L5a:
            long r0 = r9.f29861j
            r10 = 1
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 != 0) goto L67
            long r0 = r9.f29862k
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 == 0) goto L79
        L67:
            java.lang.Runnable r0 = r9.f29860i
            if (r0 != 0) goto L73
            f.b$a r0 = new f.b$a
            r0.<init>()
            r9.f29860i = r0
            goto L76
        L73:
            r9.unscheduleSelf(r0)
        L76:
            r9.a(r10)
        L79:
            r9.invalidateSelf()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: f.b.g(int):boolean");
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f29856e;
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f29852a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f29852a.c()) {
            this.f29852a.f29869d = getChangingConfigurations();
            return this.f29852a;
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.f29854c;
    }

    @Override // android.graphics.drawable.Drawable
    public void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f29853b;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        if (this.f29852a.q()) {
            return this.f29852a.i();
        }
        Drawable drawable = this.f29854c;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        if (this.f29852a.q()) {
            return this.f29852a.m();
        }
        Drawable drawable = this.f29854c;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        if (this.f29852a.q()) {
            return this.f29852a.j();
        }
        Drawable drawable = this.f29854c;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        if (this.f29852a.q()) {
            return this.f29852a.k();
        }
        Drawable drawable = this.f29854c;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f29854c;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        return this.f29852a.n();
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        Drawable drawable = this.f29854c;
        if (drawable != null) {
            C0373b.b(drawable, outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        boolean padding;
        Rect l10 = this.f29852a.l();
        if (l10 != null) {
            rect.set(l10);
            padding = (l10.right | ((l10.left | l10.top) | l10.bottom)) != 0;
        } else {
            Drawable drawable = this.f29854c;
            if (drawable != null) {
                padding = drawable.getPadding(rect);
            } else {
                padding = super.getPadding(rect);
            }
        }
        if (e()) {
            int i10 = rect.left;
            rect.left = rect.right;
            rect.right = i10;
        }
        return padding;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h(d dVar) {
        this.f29852a = dVar;
        int i10 = this.f29858g;
        if (i10 >= 0) {
            Drawable g10 = dVar.g(i10);
            this.f29854c = g10;
            if (g10 != null) {
                d(g10);
            }
        }
        this.f29855d = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void i(Resources resources) {
        this.f29852a.y(resources);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        d dVar = this.f29852a;
        if (dVar != null) {
            dVar.p();
        }
        if (drawable != this.f29854c || getCallback() == null) {
            return;
        }
        getCallback().invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return this.f29852a.C;
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        boolean z10;
        Drawable drawable = this.f29855d;
        boolean z11 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f29855d = null;
            z10 = true;
        } else {
            z10 = false;
        }
        Drawable drawable2 = this.f29854c;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f29857f) {
                this.f29854c.setAlpha(this.f29856e);
            }
        }
        if (this.f29862k != 0) {
            this.f29862k = 0L;
            z10 = true;
        }
        if (this.f29861j != 0) {
            this.f29861j = 0L;
        } else {
            z11 = z10;
        }
        if (z11) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f29859h && super.mutate() == this) {
            d b10 = b();
            b10.r();
            h(b10);
            this.f29859h = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f29855d;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f29854c;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i10) {
        return this.f29852a.w(i10, c());
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i10) {
        Drawable drawable = this.f29855d;
        if (drawable != null) {
            return drawable.setLevel(i10);
        }
        Drawable drawable2 = this.f29854c;
        if (drawable2 != null) {
            return drawable2.setLevel(i10);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f29855d;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        Drawable drawable2 = this.f29854c;
        if (drawable2 != null) {
            return drawable2.setState(iArr);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        if (drawable != this.f29854c || getCallback() == null) {
            return;
        }
        getCallback().scheduleDrawable(this, runnable, j10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        if (this.f29857f && this.f29856e == i10) {
            return;
        }
        this.f29857f = true;
        this.f29856e = i10;
        Drawable drawable = this.f29854c;
        if (drawable != null) {
            if (this.f29861j == 0) {
                drawable.setAlpha(i10);
            } else {
                a(false);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z10) {
        d dVar = this.f29852a;
        if (dVar.C != z10) {
            dVar.C = z10;
            Drawable drawable = this.f29854c;
            if (drawable != null) {
                androidx.core.graphics.drawable.a.j(drawable, z10);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        d dVar = this.f29852a;
        dVar.E = true;
        if (dVar.D != colorFilter) {
            dVar.D = colorFilter;
            Drawable drawable = this.f29854c;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z10) {
        d dVar = this.f29852a;
        if (dVar.f29889x != z10) {
            dVar.f29889x = z10;
            Drawable drawable = this.f29854c;
            if (drawable != null) {
                drawable.setDither(z10);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f10, float f11) {
        Drawable drawable = this.f29854c;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.k(drawable, f10, f11);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i10, int i11, int i12, int i13) {
        Rect rect = this.f29853b;
        if (rect == null) {
            this.f29853b = new Rect(i10, i11, i12, i13);
        } else {
            rect.set(i10, i11, i12, i13);
        }
        Drawable drawable = this.f29854c;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.l(drawable, i10, i11, i12, i13);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        d dVar = this.f29852a;
        dVar.H = true;
        if (dVar.F != colorStateList) {
            dVar.F = colorStateList;
            androidx.core.graphics.drawable.a.o(this.f29854c, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        d dVar = this.f29852a;
        dVar.I = true;
        if (dVar.G != mode) {
            dVar.G = mode;
            androidx.core.graphics.drawable.a.p(this.f29854c, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        boolean visible = super.setVisible(z10, z11);
        Drawable drawable = this.f29855d;
        if (drawable != null) {
            drawable.setVisible(z10, z11);
        }
        Drawable drawable2 = this.f29854c;
        if (drawable2 != null) {
            drawable2.setVisible(z10, z11);
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable != this.f29854c || getCallback() == null) {
            return;
        }
        getCallback().unscheduleDrawable(this, runnable);
    }
}
