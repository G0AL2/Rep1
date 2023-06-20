package m0;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.core.view.z;
import java.util.Arrays;

/* compiled from: ViewDragHelper.java */
/* loaded from: classes.dex */
public class c {

    /* renamed from: w  reason: collision with root package name */
    private static final Interpolator f34151w = new a();

    /* renamed from: a  reason: collision with root package name */
    private int f34152a;

    /* renamed from: b  reason: collision with root package name */
    private int f34153b;

    /* renamed from: d  reason: collision with root package name */
    private float[] f34155d;

    /* renamed from: e  reason: collision with root package name */
    private float[] f34156e;

    /* renamed from: f  reason: collision with root package name */
    private float[] f34157f;

    /* renamed from: g  reason: collision with root package name */
    private float[] f34158g;

    /* renamed from: h  reason: collision with root package name */
    private int[] f34159h;

    /* renamed from: i  reason: collision with root package name */
    private int[] f34160i;

    /* renamed from: j  reason: collision with root package name */
    private int[] f34161j;

    /* renamed from: k  reason: collision with root package name */
    private int f34162k;

    /* renamed from: l  reason: collision with root package name */
    private VelocityTracker f34163l;

    /* renamed from: m  reason: collision with root package name */
    private float f34164m;

    /* renamed from: n  reason: collision with root package name */
    private float f34165n;

    /* renamed from: o  reason: collision with root package name */
    private int f34166o;

    /* renamed from: p  reason: collision with root package name */
    private int f34167p;

    /* renamed from: q  reason: collision with root package name */
    private OverScroller f34168q;

    /* renamed from: r  reason: collision with root package name */
    private final AbstractC0449c f34169r;

    /* renamed from: s  reason: collision with root package name */
    private View f34170s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f34171t;

    /* renamed from: u  reason: collision with root package name */
    private final ViewGroup f34172u;

    /* renamed from: c  reason: collision with root package name */
    private int f34154c = -1;

    /* renamed from: v  reason: collision with root package name */
    private final Runnable f34173v = new b();

    /* compiled from: ViewDragHelper.java */
    /* loaded from: classes.dex */
    static class a implements Interpolator {
        a() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            float f11 = f10 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    }

    /* compiled from: ViewDragHelper.java */
    /* loaded from: classes.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.J(0);
        }
    }

    /* compiled from: ViewDragHelper.java */
    /* renamed from: m0.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0449c {
        public abstract int a(View view, int i10, int i11);

        public abstract int b(View view, int i10, int i11);

        public int c(int i10) {
            return i10;
        }

        public int d(View view) {
            return 0;
        }

        public int e(View view) {
            return 0;
        }

        public void f(int i10, int i11) {
        }

        public boolean g(int i10) {
            return false;
        }

        public void h(int i10, int i11) {
        }

        public void i(View view, int i10) {
        }

        public abstract void j(int i10);

        public abstract void k(View view, int i10, int i11, int i12, int i13);

        public abstract void l(View view, float f10, float f11);

        public abstract boolean m(View view, int i10);
    }

    private c(Context context, ViewGroup viewGroup, AbstractC0449c abstractC0449c) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        }
        if (abstractC0449c != null) {
            this.f34172u = viewGroup;
            this.f34169r = abstractC0449c;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            this.f34166o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
            this.f34153b = viewConfiguration.getScaledTouchSlop();
            this.f34164m = viewConfiguration.getScaledMaximumFlingVelocity();
            this.f34165n = viewConfiguration.getScaledMinimumFlingVelocity();
            this.f34168q = new OverScroller(context, f34151w);
            return;
        }
        throw new IllegalArgumentException("Callback may not be null");
    }

    private boolean C(int i10) {
        if (B(i10)) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i10 + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    private void F() {
        this.f34163l.computeCurrentVelocity(1000, this.f34164m);
        p(g(this.f34163l.getXVelocity(this.f34154c), this.f34165n, this.f34164m), g(this.f34163l.getYVelocity(this.f34154c), this.f34165n, this.f34164m));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r3v3, types: [m0.c$c] */
    private void G(float f10, float f11, int i10) {
        boolean c10 = c(f10, f11, i10, 1);
        boolean z10 = c10;
        if (c(f11, f10, i10, 4)) {
            z10 = c10 | true;
        }
        boolean z11 = z10;
        if (c(f10, f11, i10, 2)) {
            z11 = (z10 ? 1 : 0) | true;
        }
        ?? r02 = z11;
        if (c(f11, f10, i10, 8)) {
            r02 = (z11 ? 1 : 0) | true;
        }
        if (r02 != 0) {
            int[] iArr = this.f34160i;
            iArr[i10] = iArr[i10] | r02;
            this.f34169r.f(r02, i10);
        }
    }

    private void H(float f10, float f11, int i10) {
        s(i10);
        float[] fArr = this.f34155d;
        this.f34157f[i10] = f10;
        fArr[i10] = f10;
        float[] fArr2 = this.f34156e;
        this.f34158g[i10] = f11;
        fArr2[i10] = f11;
        this.f34159h[i10] = x((int) f10, (int) f11);
        this.f34162k |= 1 << i10;
    }

    private void I(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i10 = 0; i10 < pointerCount; i10++) {
            int pointerId = motionEvent.getPointerId(i10);
            if (C(pointerId)) {
                float x10 = motionEvent.getX(i10);
                float y10 = motionEvent.getY(i10);
                this.f34157f[pointerId] = x10;
                this.f34158g[pointerId] = y10;
            }
        }
    }

    private boolean c(float f10, float f11, int i10, int i11) {
        float abs = Math.abs(f10);
        float abs2 = Math.abs(f11);
        if ((this.f34159h[i10] & i11) != i11 || (this.f34167p & i11) == 0 || (this.f34161j[i10] & i11) == i11 || (this.f34160i[i10] & i11) == i11) {
            return false;
        }
        int i12 = this.f34153b;
        if (abs > i12 || abs2 > i12) {
            if (abs >= abs2 * 0.5f || !this.f34169r.g(i11)) {
                return (this.f34160i[i10] & i11) == 0 && abs > ((float) this.f34153b);
            }
            int[] iArr = this.f34161j;
            iArr[i10] = iArr[i10] | i11;
            return false;
        }
        return false;
    }

    private boolean f(View view, float f10, float f11) {
        if (view == null) {
            return false;
        }
        boolean z10 = this.f34169r.d(view) > 0;
        boolean z11 = this.f34169r.e(view) > 0;
        if (!z10 || !z11) {
            return z10 ? Math.abs(f10) > ((float) this.f34153b) : z11 && Math.abs(f11) > ((float) this.f34153b);
        }
        int i10 = this.f34153b;
        return (f10 * f10) + (f11 * f11) > ((float) (i10 * i10));
    }

    private float g(float f10, float f11, float f12) {
        float abs = Math.abs(f10);
        if (abs < f11) {
            return 0.0f;
        }
        return abs > f12 ? f10 > 0.0f ? f12 : -f12 : f10;
    }

    private int h(int i10, int i11, int i12) {
        int abs = Math.abs(i10);
        if (abs < i11) {
            return 0;
        }
        return abs > i12 ? i10 > 0 ? i12 : -i12 : i10;
    }

    private void i() {
        float[] fArr = this.f34155d;
        if (fArr == null) {
            return;
        }
        Arrays.fill(fArr, 0.0f);
        Arrays.fill(this.f34156e, 0.0f);
        Arrays.fill(this.f34157f, 0.0f);
        Arrays.fill(this.f34158g, 0.0f);
        Arrays.fill(this.f34159h, 0);
        Arrays.fill(this.f34160i, 0);
        Arrays.fill(this.f34161j, 0);
        this.f34162k = 0;
    }

    private void j(int i10) {
        if (this.f34155d == null || !B(i10)) {
            return;
        }
        this.f34155d[i10] = 0.0f;
        this.f34156e[i10] = 0.0f;
        this.f34157f[i10] = 0.0f;
        this.f34158g[i10] = 0.0f;
        this.f34159h[i10] = 0;
        this.f34160i[i10] = 0;
        this.f34161j[i10] = 0;
        this.f34162k = (~(1 << i10)) & this.f34162k;
    }

    private int k(int i10, int i11, int i12) {
        int abs;
        if (i10 == 0) {
            return 0;
        }
        int width = this.f34172u.getWidth();
        float f10 = width / 2;
        float q10 = f10 + (q(Math.min(1.0f, Math.abs(i10) / width)) * f10);
        int abs2 = Math.abs(i11);
        if (abs2 > 0) {
            abs = Math.round(Math.abs(q10 / abs2) * 1000.0f) * 4;
        } else {
            abs = (int) (((Math.abs(i10) / i12) + 1.0f) * 256.0f);
        }
        return Math.min(abs, 600);
    }

    private int l(View view, int i10, int i11, int i12, int i13) {
        float f10;
        float f11;
        float f12;
        float f13;
        int h10 = h(i12, (int) this.f34165n, (int) this.f34164m);
        int h11 = h(i13, (int) this.f34165n, (int) this.f34164m);
        int abs = Math.abs(i10);
        int abs2 = Math.abs(i11);
        int abs3 = Math.abs(h10);
        int abs4 = Math.abs(h11);
        int i14 = abs3 + abs4;
        int i15 = abs + abs2;
        if (h10 != 0) {
            f10 = abs3;
            f11 = i14;
        } else {
            f10 = abs;
            f11 = i15;
        }
        float f14 = f10 / f11;
        if (h11 != 0) {
            f12 = abs4;
            f13 = i14;
        } else {
            f12 = abs2;
            f13 = i15;
        }
        return (int) ((k(i10, h10, this.f34169r.d(view)) * f14) + (k(i11, h11, this.f34169r.e(view)) * (f12 / f13)));
    }

    public static c n(ViewGroup viewGroup, float f10, AbstractC0449c abstractC0449c) {
        c o10 = o(viewGroup, abstractC0449c);
        o10.f34153b = (int) (o10.f34153b * (1.0f / f10));
        return o10;
    }

    public static c o(ViewGroup viewGroup, AbstractC0449c abstractC0449c) {
        return new c(viewGroup.getContext(), viewGroup, abstractC0449c);
    }

    private void p(float f10, float f11) {
        this.f34171t = true;
        this.f34169r.l(this.f34170s, f10, f11);
        this.f34171t = false;
        if (this.f34152a == 1) {
            J(0);
        }
    }

    private float q(float f10) {
        return (float) Math.sin((f10 - 0.5f) * 0.47123894f);
    }

    private void r(int i10, int i11, int i12, int i13) {
        int left = this.f34170s.getLeft();
        int top = this.f34170s.getTop();
        if (i12 != 0) {
            i10 = this.f34169r.a(this.f34170s, i10, i12);
            z.a0(this.f34170s, i10 - left);
        }
        int i14 = i10;
        if (i13 != 0) {
            i11 = this.f34169r.b(this.f34170s, i11, i13);
            z.b0(this.f34170s, i11 - top);
        }
        int i15 = i11;
        if (i12 == 0 && i13 == 0) {
            return;
        }
        this.f34169r.k(this.f34170s, i14, i15, i14 - left, i15 - top);
    }

    private void s(int i10) {
        float[] fArr = this.f34155d;
        if (fArr == null || fArr.length <= i10) {
            int i11 = i10 + 1;
            float[] fArr2 = new float[i11];
            float[] fArr3 = new float[i11];
            float[] fArr4 = new float[i11];
            float[] fArr5 = new float[i11];
            int[] iArr = new int[i11];
            int[] iArr2 = new int[i11];
            int[] iArr3 = new int[i11];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f34156e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f34157f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f34158g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f34159h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f34160i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f34161j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f34155d = fArr2;
            this.f34156e = fArr3;
            this.f34157f = fArr4;
            this.f34158g = fArr5;
            this.f34159h = iArr;
            this.f34160i = iArr2;
            this.f34161j = iArr3;
        }
    }

    private boolean u(int i10, int i11, int i12, int i13) {
        int left = this.f34170s.getLeft();
        int top = this.f34170s.getTop();
        int i14 = i10 - left;
        int i15 = i11 - top;
        if (i14 == 0 && i15 == 0) {
            this.f34168q.abortAnimation();
            J(0);
            return false;
        }
        this.f34168q.startScroll(left, top, i14, i15, l(this.f34170s, i14, i15, i12, i13));
        J(2);
        return true;
    }

    private int x(int i10, int i11) {
        int i12 = i10 < this.f34172u.getLeft() + this.f34166o ? 1 : 0;
        if (i11 < this.f34172u.getTop() + this.f34166o) {
            i12 |= 4;
        }
        if (i10 > this.f34172u.getRight() - this.f34166o) {
            i12 |= 2;
        }
        return i11 > this.f34172u.getBottom() - this.f34166o ? i12 | 8 : i12;
    }

    public boolean A(int i10, int i11) {
        return D(this.f34170s, i10, i11);
    }

    public boolean B(int i10) {
        return ((1 << i10) & this.f34162k) != 0;
    }

    public boolean D(View view, int i10, int i11) {
        return view != null && i10 >= view.getLeft() && i10 < view.getRight() && i11 >= view.getTop() && i11 < view.getBottom();
    }

    public void E(MotionEvent motionEvent) {
        int i10;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.f34163l == null) {
            this.f34163l = VelocityTracker.obtain();
        }
        this.f34163l.addMovement(motionEvent);
        int i11 = 0;
        if (actionMasked == 0) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View t10 = t((int) x10, (int) y10);
            H(x10, y10, pointerId);
            P(t10, pointerId);
            int i12 = this.f34159h[pointerId];
            int i13 = this.f34167p;
            if ((i12 & i13) != 0) {
                this.f34169r.h(i12 & i13, pointerId);
            }
        } else if (actionMasked == 1) {
            if (this.f34152a == 1) {
                F();
            }
            a();
        } else if (actionMasked == 2) {
            if (this.f34152a == 1) {
                if (C(this.f34154c)) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.f34154c);
                    float x11 = motionEvent.getX(findPointerIndex);
                    float y11 = motionEvent.getY(findPointerIndex);
                    float[] fArr = this.f34157f;
                    int i14 = this.f34154c;
                    int i15 = (int) (x11 - fArr[i14]);
                    int i16 = (int) (y11 - this.f34158g[i14]);
                    r(this.f34170s.getLeft() + i15, this.f34170s.getTop() + i16, i15, i16);
                    I(motionEvent);
                    return;
                }
                return;
            }
            int pointerCount = motionEvent.getPointerCount();
            while (i11 < pointerCount) {
                int pointerId2 = motionEvent.getPointerId(i11);
                if (C(pointerId2)) {
                    float x12 = motionEvent.getX(i11);
                    float y12 = motionEvent.getY(i11);
                    float f10 = x12 - this.f34155d[pointerId2];
                    float f11 = y12 - this.f34156e[pointerId2];
                    G(f10, f11, pointerId2);
                    if (this.f34152a != 1) {
                        View t11 = t((int) x12, (int) y12);
                        if (f(t11, f10, f11) && P(t11, pointerId2)) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                i11++;
            }
            I(motionEvent);
        } else if (actionMasked == 3) {
            if (this.f34152a == 1) {
                p(0.0f, 0.0f);
            }
            a();
        } else if (actionMasked == 5) {
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            float x13 = motionEvent.getX(actionIndex);
            float y13 = motionEvent.getY(actionIndex);
            H(x13, y13, pointerId3);
            if (this.f34152a == 0) {
                P(t((int) x13, (int) y13), pointerId3);
                int i17 = this.f34159h[pointerId3];
                int i18 = this.f34167p;
                if ((i17 & i18) != 0) {
                    this.f34169r.h(i17 & i18, pointerId3);
                }
            } else if (A((int) x13, (int) y13)) {
                P(this.f34170s, pointerId3);
            }
        } else if (actionMasked != 6) {
        } else {
            int pointerId4 = motionEvent.getPointerId(actionIndex);
            if (this.f34152a == 1 && pointerId4 == this.f34154c) {
                int pointerCount2 = motionEvent.getPointerCount();
                while (true) {
                    if (i11 >= pointerCount2) {
                        i10 = -1;
                        break;
                    }
                    int pointerId5 = motionEvent.getPointerId(i11);
                    if (pointerId5 != this.f34154c) {
                        View t12 = t((int) motionEvent.getX(i11), (int) motionEvent.getY(i11));
                        View view = this.f34170s;
                        if (t12 == view && P(view, pointerId5)) {
                            i10 = this.f34154c;
                            break;
                        }
                    }
                    i11++;
                }
                if (i10 == -1) {
                    F();
                }
            }
            j(pointerId4);
        }
    }

    void J(int i10) {
        this.f34172u.removeCallbacks(this.f34173v);
        if (this.f34152a != i10) {
            this.f34152a = i10;
            this.f34169r.j(i10);
            if (this.f34152a == 0) {
                this.f34170s = null;
            }
        }
    }

    public void K(int i10) {
        this.f34167p = i10;
    }

    public void L(float f10) {
        this.f34165n = f10;
    }

    public boolean M(int i10, int i11) {
        if (this.f34171t) {
            return u(i10, i11, (int) this.f34163l.getXVelocity(this.f34154c), (int) this.f34163l.getYVelocity(this.f34154c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00dd, code lost:
        if (r12 != r11) goto L57;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean N(android.view.MotionEvent r17) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.c.N(android.view.MotionEvent):boolean");
    }

    public boolean O(View view, int i10, int i11) {
        this.f34170s = view;
        this.f34154c = -1;
        boolean u10 = u(i10, i11, 0, 0);
        if (!u10 && this.f34152a == 0 && this.f34170s != null) {
            this.f34170s = null;
        }
        return u10;
    }

    boolean P(View view, int i10) {
        if (view == this.f34170s && this.f34154c == i10) {
            return true;
        }
        if (view == null || !this.f34169r.m(view, i10)) {
            return false;
        }
        this.f34154c = i10;
        b(view, i10);
        return true;
    }

    public void a() {
        this.f34154c = -1;
        i();
        VelocityTracker velocityTracker = this.f34163l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f34163l = null;
        }
    }

    public void b(View view, int i10) {
        if (view.getParent() == this.f34172u) {
            this.f34170s = view;
            this.f34154c = i10;
            this.f34169r.i(view, i10);
            J(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.f34172u + ")");
    }

    public boolean d(int i10) {
        int length = this.f34155d.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (e(i10, i11)) {
                return true;
            }
        }
        return false;
    }

    public boolean e(int i10, int i11) {
        if (B(i11)) {
            boolean z10 = (i10 & 1) == 1;
            boolean z11 = (i10 & 2) == 2;
            float f10 = this.f34157f[i11] - this.f34155d[i11];
            float f11 = this.f34158g[i11] - this.f34156e[i11];
            if (!z10 || !z11) {
                return z10 ? Math.abs(f10) > ((float) this.f34153b) : z11 && Math.abs(f11) > ((float) this.f34153b);
            }
            int i12 = this.f34153b;
            return (f10 * f10) + (f11 * f11) > ((float) (i12 * i12));
        }
        return false;
    }

    public boolean m(boolean z10) {
        if (this.f34152a == 2) {
            boolean computeScrollOffset = this.f34168q.computeScrollOffset();
            int currX = this.f34168q.getCurrX();
            int currY = this.f34168q.getCurrY();
            int left = currX - this.f34170s.getLeft();
            int top = currY - this.f34170s.getTop();
            if (left != 0) {
                z.a0(this.f34170s, left);
            }
            if (top != 0) {
                z.b0(this.f34170s, top);
            }
            if (left != 0 || top != 0) {
                this.f34169r.k(this.f34170s, currX, currY, left, top);
            }
            if (computeScrollOffset && currX == this.f34168q.getFinalX() && currY == this.f34168q.getFinalY()) {
                this.f34168q.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                if (z10) {
                    this.f34172u.post(this.f34173v);
                } else {
                    J(0);
                }
            }
        }
        return this.f34152a == 2;
    }

    public View t(int i10, int i11) {
        for (int childCount = this.f34172u.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.f34172u.getChildAt(this.f34169r.c(childCount));
            if (i10 >= childAt.getLeft() && i10 < childAt.getRight() && i11 >= childAt.getTop() && i11 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public View v() {
        return this.f34170s;
    }

    public int w() {
        return this.f34166o;
    }

    public int y() {
        return this.f34153b;
    }

    public int z() {
        return this.f34152a;
    }
}
