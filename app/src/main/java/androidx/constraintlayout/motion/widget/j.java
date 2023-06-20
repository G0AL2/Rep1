package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.constraintlayout.motion.widget.l;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.p;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: MotionLayout.java */
/* loaded from: classes.dex */
public class j extends ConstraintLayout implements p {

    /* renamed from: x0  reason: collision with root package name */
    public static boolean f1935x0;
    private int A;
    private boolean B;
    HashMap<View, g> C;
    private long D;
    private float E;
    float F;
    float G;
    private long H;
    float I;
    private boolean J;
    boolean K;
    private d L;
    int M;
    private boolean N;
    private u.b O;
    private androidx.constraintlayout.motion.widget.b P;
    boolean Q;
    float R;
    float S;
    long T;
    float U;
    private boolean V;
    private ArrayList<h> W;

    /* renamed from: g0  reason: collision with root package name */
    private ArrayList<h> f1936g0;

    /* renamed from: h0  reason: collision with root package name */
    private ArrayList<h> f1937h0;

    /* renamed from: i0  reason: collision with root package name */
    private CopyOnWriteArrayList<d> f1938i0;

    /* renamed from: j0  reason: collision with root package name */
    private int f1939j0;

    /* renamed from: k0  reason: collision with root package name */
    private float f1940k0;

    /* renamed from: l0  reason: collision with root package name */
    protected boolean f1941l0;

    /* renamed from: m0  reason: collision with root package name */
    float f1942m0;

    /* renamed from: n0  reason: collision with root package name */
    private q.c f1943n0;

    /* renamed from: o0  reason: collision with root package name */
    private boolean f1944o0;

    /* renamed from: p0  reason: collision with root package name */
    private c f1945p0;

    /* renamed from: q0  reason: collision with root package name */
    private Runnable f1946q0;

    /* renamed from: r0  reason: collision with root package name */
    private int[] f1947r0;

    /* renamed from: s0  reason: collision with root package name */
    int f1948s0;

    /* renamed from: t0  reason: collision with root package name */
    private boolean f1949t0;

    /* renamed from: u  reason: collision with root package name */
    l f1950u;

    /* renamed from: u0  reason: collision with root package name */
    e f1951u0;

    /* renamed from: v  reason: collision with root package name */
    Interpolator f1952v;

    /* renamed from: v0  reason: collision with root package name */
    private boolean f1953v0;

    /* renamed from: w  reason: collision with root package name */
    Interpolator f1954w;

    /* renamed from: w0  reason: collision with root package name */
    ArrayList<Integer> f1955w0;

    /* renamed from: x  reason: collision with root package name */
    float f1956x;

    /* renamed from: y  reason: collision with root package name */
    private int f1957y;

    /* renamed from: z  reason: collision with root package name */
    int f1958z;

    /* compiled from: MotionLayout.java */
    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            j.this.f1945p0.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MotionLayout.java */
    /* loaded from: classes.dex */
    public static /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f1960a;

        static {
            int[] iArr = new int[e.values().length];
            f1960a = iArr;
            try {
                iArr[e.UNDEFINED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1960a[e.SETUP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1960a[e.MOVING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1960a[e.FINISHED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MotionLayout.java */
    /* loaded from: classes.dex */
    public class c {

        /* renamed from: a  reason: collision with root package name */
        float f1961a = Float.NaN;

        /* renamed from: b  reason: collision with root package name */
        float f1962b = Float.NaN;

        /* renamed from: c  reason: collision with root package name */
        int f1963c = -1;

        /* renamed from: d  reason: collision with root package name */
        int f1964d = -1;

        c() {
        }

        void a() {
            int i10 = this.f1963c;
            if (i10 != -1 || this.f1964d != -1) {
                if (i10 == -1) {
                    j.this.N(this.f1964d);
                } else {
                    int i11 = this.f1964d;
                    if (i11 == -1) {
                        j.this.K(i10, -1, -1);
                    } else {
                        j.this.L(i10, i11);
                    }
                }
                j.this.setState(e.SETUP);
            }
            if (Float.isNaN(this.f1962b)) {
                if (Float.isNaN(this.f1961a)) {
                    return;
                }
                j.this.setProgress(this.f1961a);
                return;
            }
            j.this.J(this.f1961a, this.f1962b);
            this.f1961a = Float.NaN;
            this.f1962b = Float.NaN;
            this.f1963c = -1;
            this.f1964d = -1;
        }

        public Bundle b() {
            Bundle bundle = new Bundle();
            bundle.putFloat("motion.progress", this.f1961a);
            bundle.putFloat("motion.velocity", this.f1962b);
            bundle.putInt("motion.StartState", this.f1963c);
            bundle.putInt("motion.EndState", this.f1964d);
            return bundle;
        }

        public void c() {
            this.f1964d = j.this.A;
            this.f1963c = j.this.f1957y;
            this.f1962b = j.this.getVelocity();
            this.f1961a = j.this.getProgress();
        }

        public void d(int i10) {
            this.f1964d = i10;
        }

        public void e(float f10) {
            this.f1961a = f10;
        }

        public void f(int i10) {
            this.f1963c = i10;
        }

        public void g(Bundle bundle) {
            this.f1961a = bundle.getFloat("motion.progress");
            this.f1962b = bundle.getFloat("motion.velocity");
            this.f1963c = bundle.getInt("motion.StartState");
            this.f1964d = bundle.getInt("motion.EndState");
        }

        public void h(float f10) {
            this.f1962b = f10;
        }
    }

    /* compiled from: MotionLayout.java */
    /* loaded from: classes.dex */
    public interface d {
        void a(j jVar, int i10, int i11, float f10);

        void b(j jVar, int i10);

        void c(j jVar, int i10, int i11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MotionLayout.java */
    /* loaded from: classes.dex */
    public enum e {
        UNDEFINED,
        SETUP,
        MOVING,
        FINISHED
    }

    private void F() {
        CopyOnWriteArrayList<d> copyOnWriteArrayList;
        if ((this.L == null && ((copyOnWriteArrayList = this.f1938i0) == null || copyOnWriteArrayList.isEmpty())) || this.f1940k0 == this.F) {
            return;
        }
        if (this.f1939j0 != -1) {
            d dVar = this.L;
            if (dVar != null) {
                dVar.c(this, this.f1957y, this.A);
            }
            CopyOnWriteArrayList<d> copyOnWriteArrayList2 = this.f1938i0;
            if (copyOnWriteArrayList2 != null) {
                Iterator<d> it = copyOnWriteArrayList2.iterator();
                while (it.hasNext()) {
                    it.next().c(this, this.f1957y, this.A);
                }
            }
        }
        this.f1939j0 = -1;
        float f10 = this.F;
        this.f1940k0 = f10;
        d dVar2 = this.L;
        if (dVar2 != null) {
            dVar2.a(this, this.f1957y, this.A, f10);
        }
        CopyOnWriteArrayList<d> copyOnWriteArrayList3 = this.f1938i0;
        if (copyOnWriteArrayList3 != null) {
            Iterator<d> it2 = copyOnWriteArrayList3.iterator();
            while (it2.hasNext()) {
                it2.next().a(this, this.f1957y, this.A, this.F);
            }
        }
    }

    private void I() {
        CopyOnWriteArrayList<d> copyOnWriteArrayList;
        if (this.L == null && ((copyOnWriteArrayList = this.f1938i0) == null || copyOnWriteArrayList.isEmpty())) {
            return;
        }
        Iterator<Integer> it = this.f1955w0.iterator();
        while (it.hasNext()) {
            Integer next = it.next();
            d dVar = this.L;
            if (dVar != null) {
                dVar.b(this, next.intValue());
            }
            CopyOnWriteArrayList<d> copyOnWriteArrayList2 = this.f1938i0;
            if (copyOnWriteArrayList2 != null) {
                Iterator<d> it2 = copyOnWriteArrayList2.iterator();
                while (it2.hasNext()) {
                    it2.next().b(this, next.intValue());
                }
            }
        }
        this.f1955w0.clear();
    }

    void D(float f10) {
    }

    void E(boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        int i10;
        float interpolation;
        boolean z14;
        boolean z15;
        if (this.H == -1) {
            this.H = getNanoTime();
        }
        float f10 = this.G;
        if (f10 > 0.0f && f10 < 1.0f) {
            this.f1958z = -1;
        }
        if (this.V || (this.K && (z10 || this.I != f10))) {
            float signum = Math.signum(this.I - f10);
            long nanoTime = getNanoTime();
            Interpolator interpolator = this.f1952v;
            float f11 = !(interpolator instanceof i) ? ((((float) (nanoTime - this.H)) * signum) * 1.0E-9f) / this.E : 0.0f;
            float f12 = this.G + f11;
            if (this.J) {
                f12 = this.I;
            }
            int i11 = (signum > 0.0f ? 1 : (signum == 0.0f ? 0 : -1));
            if ((i11 <= 0 || f12 < this.I) && (signum > 0.0f || f12 > this.I)) {
                z11 = false;
            } else {
                f12 = this.I;
                this.K = false;
                z11 = true;
            }
            this.G = f12;
            this.F = f12;
            this.H = nanoTime;
            if (interpolator != null && !z11) {
                if (this.N) {
                    interpolation = interpolator.getInterpolation(((float) (nanoTime - this.D)) * 1.0E-9f);
                    Interpolator interpolator2 = this.f1952v;
                    if (interpolator2 != this.O) {
                        this.G = interpolation;
                        this.H = nanoTime;
                        if (interpolator2 instanceof i) {
                            float a10 = ((i) interpolator2).a();
                            this.f1956x = a10;
                            int i12 = ((Math.abs(a10) * this.E) > 1.0E-5f ? 1 : ((Math.abs(a10) * this.E) == 1.0E-5f ? 0 : -1));
                            if (a10 <= 0.0f || interpolation < 1.0f) {
                                z14 = false;
                            } else {
                                this.G = 1.0f;
                                z14 = false;
                                this.K = false;
                                interpolation = 1.0f;
                            }
                            if (a10 < 0.0f && interpolation <= 0.0f) {
                                this.G = 0.0f;
                                this.K = z14;
                                f12 = 0.0f;
                            }
                        }
                    } else {
                        throw null;
                    }
                } else {
                    interpolation = interpolator.getInterpolation(f12);
                    Interpolator interpolator3 = this.f1952v;
                    if (interpolator3 instanceof i) {
                        this.f1956x = ((i) interpolator3).a();
                    } else {
                        this.f1956x = ((interpolator3.getInterpolation(f12 + f11) - interpolation) * signum) / f11;
                    }
                }
                f12 = interpolation;
            } else {
                this.f1956x = f11;
            }
            if (Math.abs(this.f1956x) > 1.0E-5f) {
                setState(e.MOVING);
            }
            if ((i11 > 0 && f12 >= this.I) || (signum <= 0.0f && f12 <= this.I)) {
                f12 = this.I;
                this.K = false;
            }
            if (f12 >= 1.0f || f12 <= 0.0f) {
                z12 = false;
                this.K = false;
                setState(e.FINISHED);
            } else {
                z12 = false;
            }
            int childCount = getChildCount();
            this.V = z12;
            long nanoTime2 = getNanoTime();
            this.f1942m0 = f12;
            Interpolator interpolator4 = this.f1954w;
            float interpolation2 = interpolator4 == null ? f12 : interpolator4.getInterpolation(f12);
            Interpolator interpolator5 = this.f1954w;
            if (interpolator5 != null) {
                float interpolation3 = interpolator5.getInterpolation((signum / this.E) + f12);
                this.f1956x = interpolation3;
                this.f1956x = interpolation3 - this.f1954w.getInterpolation(f12);
            }
            for (int i13 = 0; i13 < childCount; i13++) {
                View childAt = getChildAt(i13);
                g gVar = this.C.get(childAt);
                if (gVar != null) {
                    this.V = gVar.c(childAt, interpolation2, nanoTime2, this.f1943n0) | this.V;
                }
            }
            boolean z16 = (i11 > 0 && f12 >= this.I) || (signum <= 0.0f && f12 <= this.I);
            if (!this.V && !this.K && z16) {
                setState(e.FINISHED);
            }
            if (this.f1941l0) {
                requestLayout();
            }
            z13 = true;
            boolean z17 = this.V | (!z16);
            this.V = z17;
            if (f12 <= 0.0f && (i10 = this.f1957y) != -1 && this.f1958z != i10) {
                this.f1958z = i10;
                throw null;
            }
            if (f12 >= 1.0d) {
                int i14 = this.f1958z;
                int i15 = this.A;
                if (i14 != i15) {
                    this.f1958z = i15;
                    throw null;
                }
            }
            if (z17 || this.K) {
                invalidate();
            } else if ((i11 > 0 && f12 == 1.0f) || (signum < 0.0f && f12 == 0.0f)) {
                setState(e.FINISHED);
            }
            if (!this.V && !this.K && ((i11 > 0 && f12 == 1.0f) || (signum < 0.0f && f12 == 0.0f))) {
                H();
            }
        } else {
            z13 = true;
        }
        float f13 = this.G;
        if (f13 >= 1.0f) {
            int i16 = this.f1958z;
            int i17 = this.A;
            if (i16 == i17) {
                z13 = false;
            }
            this.f1958z = i17;
        } else if (f13 <= 0.0f) {
            int i18 = this.f1958z;
            int i19 = this.f1957y;
            if (i18 == i19) {
                z13 = false;
            }
            this.f1958z = i19;
        } else {
            z15 = false;
            this.f1953v0 |= z15;
            if (z15 && !this.f1944o0) {
                requestLayout();
            }
            this.F = this.G;
        }
        z15 = z13;
        this.f1953v0 |= z15;
        if (z15) {
            requestLayout();
        }
        this.F = this.G;
    }

    protected void G() {
        int i10;
        CopyOnWriteArrayList<d> copyOnWriteArrayList;
        if ((this.L != null || ((copyOnWriteArrayList = this.f1938i0) != null && !copyOnWriteArrayList.isEmpty())) && this.f1939j0 == -1) {
            this.f1939j0 = this.f1958z;
            if (this.f1955w0.isEmpty()) {
                i10 = -1;
            } else {
                ArrayList<Integer> arrayList = this.f1955w0;
                i10 = arrayList.get(arrayList.size() - 1).intValue();
            }
            int i11 = this.f1958z;
            if (i10 != i11 && i11 != -1) {
                this.f1955w0.add(Integer.valueOf(i11));
            }
        }
        I();
        Runnable runnable = this.f1946q0;
        if (runnable != null) {
            runnable.run();
        }
        int[] iArr = this.f1947r0;
        if (iArr == null || this.f1948s0 <= 0) {
            return;
        }
        N(iArr[0]);
        int[] iArr2 = this.f1947r0;
        System.arraycopy(iArr2, 1, iArr2, 0, iArr2.length - 1);
        this.f1948s0--;
    }

    void H() {
    }

    public void J(float f10, float f11) {
        if (!isAttachedToWindow()) {
            if (this.f1945p0 == null) {
                this.f1945p0 = new c();
            }
            this.f1945p0.e(f10);
            this.f1945p0.h(f11);
            return;
        }
        setProgress(f10);
        setState(e.MOVING);
        this.f1956x = f11;
        int i10 = (f11 > 0.0f ? 1 : (f11 == 0.0f ? 0 : -1));
        if (i10 != 0) {
            D(i10 <= 0 ? 0.0f : 1.0f);
        } else if (f10 == 0.0f || f10 == 1.0f) {
        } else {
            D(f10 <= 0.5f ? 0.0f : 1.0f);
        }
    }

    public void K(int i10, int i11, int i12) {
        setState(e.SETUP);
        this.f1958z = i10;
        this.f1957y = -1;
        this.A = -1;
        androidx.constraintlayout.widget.d dVar = this.f1999k;
        if (dVar != null) {
            dVar.d(i10, i11, i12);
        }
    }

    public void L(int i10, int i11) {
        if (isAttachedToWindow()) {
            return;
        }
        if (this.f1945p0 == null) {
            this.f1945p0 = new c();
        }
        this.f1945p0.f(i10);
        this.f1945p0.d(i11);
    }

    public void M() {
        D(1.0f);
        this.f1946q0 = null;
    }

    public void N(int i10) {
        if (!isAttachedToWindow()) {
            if (this.f1945p0 == null) {
                this.f1945p0 = new c();
            }
            this.f1945p0.d(i10);
            return;
        }
        O(i10, -1, -1);
    }

    public void O(int i10, int i11, int i12) {
        P(i10, i11, i12, -1);
    }

    public void P(int i10, int i11, int i12, int i13) {
        int i14 = this.f1958z;
        if (i14 == i10) {
            return;
        }
        if (this.f1957y == i10) {
            D(0.0f);
            if (i13 > 0) {
                this.E = i13 / 1000.0f;
            }
        } else if (this.A == i10) {
            D(1.0f);
            if (i13 > 0) {
                this.E = i13 / 1000.0f;
            }
        } else {
            this.A = i10;
            if (i14 != -1) {
                L(i14, i10);
                D(1.0f);
                this.G = 0.0f;
                M();
                if (i13 > 0) {
                    this.E = i13 / 1000.0f;
                    return;
                }
                return;
            }
            this.N = false;
            this.I = 1.0f;
            this.F = 0.0f;
            this.G = 0.0f;
            this.H = getNanoTime();
            this.D = getNanoTime();
            this.J = false;
            this.f1952v = null;
            if (i13 == -1) {
                throw null;
            }
            this.f1957y = -1;
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        ArrayList<h> arrayList = this.f1937h0;
        if (arrayList != null) {
            Iterator<h> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().w(canvas);
            }
        }
        E(false);
        super.dispatchDraw(canvas);
    }

    public int[] getConstraintSetIds() {
        return null;
    }

    public int getCurrentState() {
        return this.f1958z;
    }

    public ArrayList<l.a> getDefinedTransitions() {
        return null;
    }

    public androidx.constraintlayout.motion.widget.b getDesignTool() {
        if (this.P == null) {
            this.P = new androidx.constraintlayout.motion.widget.b(this);
        }
        return this.P;
    }

    public int getEndState() {
        return this.A;
    }

    protected long getNanoTime() {
        return System.nanoTime();
    }

    public float getProgress() {
        return this.G;
    }

    public l getScene() {
        return this.f1950u;
    }

    public int getStartState() {
        return this.f1957y;
    }

    public float getTargetPosition() {
        return this.I;
    }

    public Bundle getTransitionState() {
        if (this.f1945p0 == null) {
            this.f1945p0 = new c();
        }
        this.f1945p0.c();
        return this.f1945p0.b();
    }

    public long getTransitionTimeMs() {
        return this.E * 1000.0f;
    }

    public float getVelocity() {
        return this.f1956x;
    }

    @Override // androidx.core.view.o
    public void i(View view, View view2, int i10, int i11) {
        this.T = getNanoTime();
        this.U = 0.0f;
        this.R = 0.0f;
        this.S = 0.0f;
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        if (Build.VERSION.SDK_INT >= 19) {
            return super.isAttachedToWindow();
        }
        return getWindowToken() != null;
    }

    @Override // androidx.core.view.o
    public void j(View view, int i10) {
    }

    @Override // androidx.core.view.o
    public void k(View view, int i10, int i11, int[] iArr, int i12) {
    }

    @Override // androidx.core.view.p
    public void m(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        if (this.Q || i10 != 0 || i11 != 0) {
            iArr[0] = iArr[0] + i12;
            iArr[1] = iArr[1] + i13;
        }
        this.Q = false;
    }

    @Override // androidx.core.view.o
    public void n(View view, int i10, int i11, int i12, int i13, int i14) {
    }

    @Override // androidx.core.view.o
    public boolean o(View view, View view2, int i10, int i11) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        Display display;
        super.onAttachedToWindow();
        if (Build.VERSION.SDK_INT >= 17 && (display = getDisplay()) != null) {
            display.getRotation();
        }
        H();
        c cVar = this.f1945p0;
        if (cVar != null) {
            if (this.f1949t0) {
                post(new a());
            } else {
                cVar.a();
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        this.f1944o0 = true;
        try {
            super.onLayout(z10, i10, i11, i12, i13);
        } finally {
            this.f1944o0 = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.q
    public boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.q
    public boolean onNestedPreFling(View view, float f10, float f11) {
        return false;
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i10) {
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view instanceof h) {
            h hVar = (h) view;
            if (this.f1938i0 == null) {
                this.f1938i0 = new CopyOnWriteArrayList<>();
            }
            this.f1938i0.add(hVar);
            if (hVar.v()) {
                if (this.W == null) {
                    this.W = new ArrayList<>();
                }
                this.W.add(hVar);
            }
            if (hVar.u()) {
                if (this.f1936g0 == null) {
                    this.f1936g0 = new ArrayList<>();
                }
                this.f1936g0.add(hVar);
            }
            if (hVar.t()) {
                if (this.f1937h0 == null) {
                    this.f1937h0 = new ArrayList<>();
                }
                this.f1937h0.add(hVar);
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        ArrayList<h> arrayList = this.W;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        ArrayList<h> arrayList2 = this.f1936g0;
        if (arrayList2 != null) {
            arrayList2.remove(view);
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (!this.f1941l0) {
            int i10 = this.f1958z;
        }
        super.requestLayout();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    protected void s(int i10) {
        this.f1999k = null;
    }

    public void setDebugMode(int i10) {
        this.M = i10;
        invalidate();
    }

    public void setDelayedApplicationOfInitialState(boolean z10) {
        this.f1949t0 = z10;
    }

    public void setInteractionEnabled(boolean z10) {
        this.B = z10;
    }

    public void setInterpolatedProgress(float f10) {
        setProgress(f10);
    }

    public void setOnHide(float f10) {
        ArrayList<h> arrayList = this.f1936g0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f1936g0.get(i10).setProgress(f10);
            }
        }
    }

    public void setOnShow(float f10) {
        ArrayList<h> arrayList = this.W;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.W.get(i10).setProgress(f10);
            }
        }
    }

    public void setProgress(float f10) {
        int i10 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
        if (i10 < 0 || f10 > 1.0f) {
            Log.w("MotionLayout", "Warning! Progress is defined for values between 0.0 and 1.0 inclusive");
        }
        if (!isAttachedToWindow()) {
            if (this.f1945p0 == null) {
                this.f1945p0 = new c();
            }
            this.f1945p0.e(f10);
        } else if (i10 <= 0) {
            if (this.G == 1.0f && this.f1958z == this.A) {
                setState(e.MOVING);
            }
            this.f1958z = this.f1957y;
            if (this.G == 0.0f) {
                setState(e.FINISHED);
            }
        } else if (f10 >= 1.0f) {
            if (this.G == 0.0f && this.f1958z == this.f1957y) {
                setState(e.MOVING);
            }
            this.f1958z = this.A;
            if (this.G == 1.0f) {
                setState(e.FINISHED);
            }
        } else {
            this.f1958z = -1;
            setState(e.MOVING);
        }
    }

    public void setScene(l lVar) {
        q();
        throw null;
    }

    void setStartState(int i10) {
        if (!isAttachedToWindow()) {
            if (this.f1945p0 == null) {
                this.f1945p0 = new c();
            }
            this.f1945p0.f(i10);
            this.f1945p0.d(i10);
            return;
        }
        this.f1958z = i10;
    }

    void setState(e eVar) {
        e eVar2 = e.FINISHED;
        if (eVar == eVar2 && this.f1958z == -1) {
            return;
        }
        e eVar3 = this.f1951u0;
        this.f1951u0 = eVar;
        e eVar4 = e.MOVING;
        if (eVar3 == eVar4 && eVar == eVar4) {
            F();
        }
        int i10 = b.f1960a[eVar3.ordinal()];
        if (i10 != 1 && i10 != 2) {
            if (i10 == 3 && eVar == eVar2) {
                G();
                return;
            }
            return;
        }
        if (eVar == eVar4) {
            F();
        }
        if (eVar == eVar2) {
            G();
        }
    }

    public void setTransition(int i10) {
    }

    protected void setTransition(l.a aVar) {
        throw null;
    }

    public void setTransitionDuration(int i10) {
        Log.e("MotionLayout", "MotionScene not defined");
    }

    public void setTransitionListener(d dVar) {
        this.L = dVar;
    }

    public void setTransitionState(Bundle bundle) {
        if (this.f1945p0 == null) {
            this.f1945p0 = new c();
        }
        this.f1945p0.g(bundle);
        if (isAttachedToWindow()) {
            this.f1945p0.a();
        }
    }

    @Override // android.view.View
    public String toString() {
        Context context = getContext();
        return androidx.constraintlayout.motion.widget.a.a(context, this.f1957y) + "->" + androidx.constraintlayout.motion.widget.a.a(context, this.A) + " (pos:" + this.G + " Dpos/Dt:" + this.f1956x;
    }
}
