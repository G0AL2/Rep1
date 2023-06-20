package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import i0.c;

/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {
    boolean I;
    int J;
    int[] K;
    View[] L;
    final SparseIntArray M;
    final SparseIntArray N;
    c O;
    final Rect P;
    private boolean Q;

    /* loaded from: classes.dex */
    public static final class a extends c {
        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public int e(int i10, int i11) {
            return i10 % i11;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public int f(int i10) {
            return 1;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class c {

        /* renamed from: a  reason: collision with root package name */
        final SparseIntArray f3486a = new SparseIntArray();

        /* renamed from: b  reason: collision with root package name */
        final SparseIntArray f3487b = new SparseIntArray();

        /* renamed from: c  reason: collision with root package name */
        private boolean f3488c = false;

        /* renamed from: d  reason: collision with root package name */
        private boolean f3489d = false;

        static int a(SparseIntArray sparseIntArray, int i10) {
            int size = sparseIntArray.size() - 1;
            int i11 = 0;
            while (i11 <= size) {
                int i12 = (i11 + size) >>> 1;
                if (sparseIntArray.keyAt(i12) < i10) {
                    i11 = i12 + 1;
                } else {
                    size = i12 - 1;
                }
            }
            int i13 = i11 - 1;
            if (i13 < 0 || i13 >= sparseIntArray.size()) {
                return -1;
            }
            return sparseIntArray.keyAt(i13);
        }

        int b(int i10, int i11) {
            if (!this.f3489d) {
                return d(i10, i11);
            }
            int i12 = this.f3487b.get(i10, -1);
            if (i12 != -1) {
                return i12;
            }
            int d10 = d(i10, i11);
            this.f3487b.put(i10, d10);
            return d10;
        }

        int c(int i10, int i11) {
            if (!this.f3488c) {
                return e(i10, i11);
            }
            int i12 = this.f3486a.get(i10, -1);
            if (i12 != -1) {
                return i12;
            }
            int e10 = e(i10, i11);
            this.f3486a.put(i10, e10);
            return e10;
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0043  */
        /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int d(int r7, int r8) {
            /*
                r6 = this;
                boolean r0 = r6.f3489d
                r1 = 0
                if (r0 == 0) goto L24
                android.util.SparseIntArray r0 = r6.f3487b
                int r0 = a(r0, r7)
                r2 = -1
                if (r0 == r2) goto L24
                android.util.SparseIntArray r2 = r6.f3487b
                int r2 = r2.get(r0)
                int r3 = r0 + 1
                int r4 = r6.c(r0, r8)
                int r0 = r6.f(r0)
                int r4 = r4 + r0
                if (r4 != r8) goto L27
                int r2 = r2 + 1
                goto L26
            L24:
                r2 = 0
                r3 = 0
            L26:
                r4 = 0
            L27:
                int r0 = r6.f(r7)
            L2b:
                if (r3 >= r7) goto L40
                int r5 = r6.f(r3)
                int r4 = r4 + r5
                if (r4 != r8) goto L38
                int r2 = r2 + 1
                r4 = 0
                goto L3d
            L38:
                if (r4 <= r8) goto L3d
                int r2 = r2 + 1
                r4 = r5
            L3d:
                int r3 = r3 + 1
                goto L2b
            L40:
                int r4 = r4 + r0
                if (r4 <= r8) goto L45
                int r2 = r2 + 1
            L45:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.c.d(int, int):int");
        }

        public abstract int e(int i10, int i11);

        public abstract int f(int i10);

        public void g() {
            this.f3487b.clear();
        }

        public void h() {
            this.f3486a.clear();
        }
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.I = false;
        this.J = -1;
        this.M = new SparseIntArray();
        this.N = new SparseIntArray();
        this.O = new a();
        this.P = new Rect();
        j3(RecyclerView.p.o0(context, attributeSet, i10, i11).f3587b);
    }

    private void R2(RecyclerView.w wVar, RecyclerView.a0 a0Var, int i10, boolean z10) {
        int i11;
        int i12;
        int i13 = 0;
        int i14 = -1;
        if (z10) {
            i14 = i10;
            i11 = 0;
            i12 = 1;
        } else {
            i11 = i10 - 1;
            i12 = -1;
        }
        while (i11 != i14) {
            View view = this.L[i11];
            b bVar = (b) view.getLayoutParams();
            int e32 = e3(wVar, a0Var, n0(view));
            bVar.f3485f = e32;
            bVar.f3484e = i13;
            i13 += e32;
            i11 += i12;
        }
    }

    private void S2() {
        int T = T();
        for (int i10 = 0; i10 < T; i10++) {
            b bVar = (b) S(i10).getLayoutParams();
            int c10 = bVar.c();
            this.M.put(c10, bVar.i());
            this.N.put(c10, bVar.h());
        }
    }

    private void T2(int i10) {
        this.K = U2(this.K, this.J, i10);
    }

    static int[] U2(int[] iArr, int i10, int i11) {
        int i12;
        if (iArr == null || iArr.length != i10 + 1 || iArr[iArr.length - 1] != i11) {
            iArr = new int[i10 + 1];
        }
        int i13 = 0;
        iArr[0] = 0;
        int i14 = i11 / i10;
        int i15 = i11 % i10;
        int i16 = 0;
        for (int i17 = 1; i17 <= i10; i17++) {
            i13 += i15;
            if (i13 <= 0 || i10 - i13 >= i15) {
                i12 = i14;
            } else {
                i12 = i14 + 1;
                i13 -= i10;
            }
            i16 += i12;
            iArr[i17] = i16;
        }
        return iArr;
    }

    private void V2() {
        this.M.clear();
        this.N.clear();
    }

    private int W2(RecyclerView.a0 a0Var) {
        int max;
        if (T() != 0 && a0Var.b() != 0) {
            b2();
            boolean v22 = v2();
            View f22 = f2(!v22, true);
            View e22 = e2(!v22, true);
            if (f22 != null && e22 != null) {
                int b10 = this.O.b(n0(f22), this.J);
                int b11 = this.O.b(n0(e22), this.J);
                int min = Math.min(b10, b11);
                int max2 = Math.max(b10, b11);
                int b12 = this.O.b(a0Var.b() - 1, this.J) + 1;
                if (this.f3495x) {
                    max = Math.max(0, (b12 - max2) - 1);
                } else {
                    max = Math.max(0, min);
                }
                if (v22) {
                    return Math.round((max * (Math.abs(this.f3492u.d(e22) - this.f3492u.g(f22)) / ((this.O.b(n0(e22), this.J) - this.O.b(n0(f22), this.J)) + 1))) + (this.f3492u.m() - this.f3492u.g(f22)));
                }
                return max;
            }
        }
        return 0;
    }

    private int X2(RecyclerView.a0 a0Var) {
        if (T() != 0 && a0Var.b() != 0) {
            b2();
            View f22 = f2(!v2(), true);
            View e22 = e2(!v2(), true);
            if (f22 != null && e22 != null) {
                if (!v2()) {
                    return this.O.b(a0Var.b() - 1, this.J) + 1;
                }
                int d10 = this.f3492u.d(e22) - this.f3492u.g(f22);
                int b10 = this.O.b(n0(f22), this.J);
                return (int) ((d10 / ((this.O.b(n0(e22), this.J) - b10) + 1)) * (this.O.b(a0Var.b() - 1, this.J) + 1));
            }
        }
        return 0;
    }

    private void Y2(RecyclerView.w wVar, RecyclerView.a0 a0Var, LinearLayoutManager.a aVar, int i10) {
        boolean z10 = i10 == 1;
        int d32 = d3(wVar, a0Var, aVar.f3502b);
        if (z10) {
            while (d32 > 0) {
                int i11 = aVar.f3502b;
                if (i11 <= 0) {
                    return;
                }
                int i12 = i11 - 1;
                aVar.f3502b = i12;
                d32 = d3(wVar, a0Var, i12);
            }
            return;
        }
        int b10 = a0Var.b() - 1;
        int i13 = aVar.f3502b;
        while (i13 < b10) {
            int i14 = i13 + 1;
            int d33 = d3(wVar, a0Var, i14);
            if (d33 <= d32) {
                break;
            }
            i13 = i14;
            d32 = d33;
        }
        aVar.f3502b = i13;
    }

    private void Z2() {
        View[] viewArr = this.L;
        if (viewArr == null || viewArr.length != this.J) {
            this.L = new View[this.J];
        }
    }

    private int c3(RecyclerView.w wVar, RecyclerView.a0 a0Var, int i10) {
        if (!a0Var.e()) {
            return this.O.b(i10, this.J);
        }
        int f10 = wVar.f(i10);
        if (f10 == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i10);
            return 0;
        }
        return this.O.b(f10, this.J);
    }

    private int d3(RecyclerView.w wVar, RecyclerView.a0 a0Var, int i10) {
        if (!a0Var.e()) {
            return this.O.c(i10, this.J);
        }
        int i11 = this.N.get(i10, -1);
        if (i11 != -1) {
            return i11;
        }
        int f10 = wVar.f(i10);
        if (f10 == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i10);
            return 0;
        }
        return this.O.c(f10, this.J);
    }

    private int e3(RecyclerView.w wVar, RecyclerView.a0 a0Var, int i10) {
        if (!a0Var.e()) {
            return this.O.f(i10);
        }
        int i11 = this.M.get(i10, -1);
        if (i11 != -1) {
            return i11;
        }
        int f10 = wVar.f(i10);
        if (f10 == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i10);
            return 1;
        }
        return this.O.f(f10);
    }

    private void g3(float f10, int i10) {
        T2(Math.max(Math.round(f10 * this.J), i10));
    }

    private void h3(View view, int i10, boolean z10) {
        int i11;
        int i12;
        b bVar = (b) view.getLayoutParams();
        Rect rect = bVar.f3591b;
        int i13 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) bVar).topMargin + ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
        int i14 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) bVar).leftMargin + ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
        int a32 = a3(bVar.f3484e, bVar.f3485f);
        if (this.f3490s == 1) {
            i12 = RecyclerView.p.U(a32, i10, i14, ((ViewGroup.MarginLayoutParams) bVar).width, false);
            i11 = RecyclerView.p.U(this.f3492u.n(), h0(), i13, ((ViewGroup.MarginLayoutParams) bVar).height, true);
        } else {
            int U = RecyclerView.p.U(a32, i10, i13, ((ViewGroup.MarginLayoutParams) bVar).height, false);
            int U2 = RecyclerView.p.U(this.f3492u.n(), v0(), i14, ((ViewGroup.MarginLayoutParams) bVar).width, true);
            i11 = U;
            i12 = U2;
        }
        i3(view, i12, i11, z10);
    }

    private void i3(View view, int i10, int i11, boolean z10) {
        boolean N1;
        RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
        if (z10) {
            N1 = P1(view, i10, i11, qVar);
        } else {
            N1 = N1(view, i10, i11, qVar);
        }
        if (N1) {
            view.measure(i10, i11);
        }
    }

    private void k3() {
        int g02;
        int paddingTop;
        if (t2() == 1) {
            g02 = u0() - getPaddingRight();
            paddingTop = getPaddingLeft();
        } else {
            g02 = g0() - getPaddingBottom();
            paddingTop = getPaddingTop();
        }
        T2(g02 - paddingTop);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int B(RecyclerView.a0 a0Var) {
        if (this.Q) {
            return W2(a0Var);
        }
        return super.B(a0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int C(RecyclerView.a0 a0Var) {
        if (this.Q) {
            return X2(a0Var);
        }
        return super.C(a0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int E(RecyclerView.a0 a0Var) {
        if (this.Q) {
            return W2(a0Var);
        }
        return super.E(a0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int E1(int i10, RecyclerView.w wVar, RecyclerView.a0 a0Var) {
        k3();
        Z2();
        return super.E1(i10, wVar, a0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int F(RecyclerView.a0 a0Var) {
        if (this.Q) {
            return X2(a0Var);
        }
        return super.F(a0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int G1(int i10, RecyclerView.w wVar, RecyclerView.a0 a0Var) {
        k3();
        Z2();
        return super.G1(i10, wVar, a0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void I2(boolean z10) {
        if (!z10) {
            super.I2(false);
            return;
        }
        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void K1(Rect rect, int i10, int i11) {
        int x10;
        int x11;
        if (this.K == null) {
            super.K1(rect, i10, i11);
        }
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.f3490s == 1) {
            x11 = RecyclerView.p.x(i11, rect.height() + paddingTop, l0());
            int[] iArr = this.K;
            x10 = RecyclerView.p.x(i10, iArr[iArr.length - 1] + paddingLeft, m0());
        } else {
            x10 = RecyclerView.p.x(i10, rect.width() + paddingLeft, m0());
            int[] iArr2 = this.K;
            x11 = RecyclerView.p.x(i11, iArr2[iArr2.length - 1] + paddingTop, l0());
        }
        J1(x10, x11);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q N() {
        if (this.f3490s == 0) {
            return new b(-2, -1);
        }
        return new b(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q O(Context context, AttributeSet attributeSet) {
        return new b(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q P(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new b((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new b(layoutParams);
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x00d6, code lost:
        if (r13 == (r2 > r15)) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00f6, code lost:
        if (r13 == (r2 > r7)) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0107  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View Q0(android.view.View r24, int r25, androidx.recyclerview.widget.RecyclerView.w r26, androidx.recyclerview.widget.RecyclerView.a0 r27) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.Q0(android.view.View, int, androidx.recyclerview.widget.RecyclerView$w, androidx.recyclerview.widget.RecyclerView$a0):android.view.View");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public boolean T1() {
        return this.D == null && !this.I;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    void V1(RecyclerView.a0 a0Var, LinearLayoutManager.c cVar, RecyclerView.p.c cVar2) {
        int i10 = this.J;
        for (int i11 = 0; i11 < this.J && cVar.c(a0Var) && i10 > 0; i11++) {
            int i12 = cVar.f3513d;
            cVar2.a(i12, Math.max(0, cVar.f3516g));
            i10 -= this.O.f(i12);
            cVar.f3513d += cVar.f3514e;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void W0(RecyclerView.w wVar, RecyclerView.a0 a0Var, View view, i0.c cVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof b)) {
            super.V0(view, cVar);
            return;
        }
        b bVar = (b) layoutParams;
        int c32 = c3(wVar, a0Var, bVar.c());
        if (this.f3490s == 0) {
            cVar.d0(c.C0402c.b(bVar.h(), bVar.i(), c32, 1, false, false));
        } else {
            cVar.d0(c.C0402c.b(c32, 1, bVar.h(), bVar.i(), false, false));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int X(RecyclerView.w wVar, RecyclerView.a0 a0Var) {
        if (this.f3490s == 1) {
            return this.J;
        }
        if (a0Var.b() < 1) {
            return 0;
        }
        return c3(wVar, a0Var, a0Var.b() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void Y0(RecyclerView recyclerView, int i10, int i11) {
        this.O.h();
        this.O.g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void Z0(RecyclerView recyclerView) {
        this.O.h();
        this.O.g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void a1(RecyclerView recyclerView, int i10, int i11, int i12) {
        this.O.h();
        this.O.g();
    }

    int a3(int i10, int i11) {
        if (this.f3490s == 1 && u2()) {
            int[] iArr = this.K;
            int i12 = this.J;
            return iArr[i12 - i10] - iArr[(i12 - i10) - i11];
        }
        int[] iArr2 = this.K;
        return iArr2[i11 + i10] - iArr2[i10];
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void b1(RecyclerView recyclerView, int i10, int i11) {
        this.O.h();
        this.O.g();
    }

    public int b3() {
        return this.J;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void d1(RecyclerView recyclerView, int i10, int i11, Object obj) {
        this.O.h();
        this.O.g();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public void e1(RecyclerView.w wVar, RecyclerView.a0 a0Var) {
        if (a0Var.e()) {
            S2();
        }
        super.e1(wVar, a0Var);
        V2();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public void f1(RecyclerView.a0 a0Var) {
        super.f1(a0Var);
        this.I = false;
    }

    public c f3() {
        return this.O;
    }

    public void j3(int i10) {
        if (i10 == this.J) {
            return;
        }
        this.I = true;
        if (i10 >= 1) {
            this.J = i10;
            this.O.h();
            B1();
            return;
        }
        throw new IllegalArgumentException("Span count should be at least 1. Provided " + i10);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    View n2(RecyclerView.w wVar, RecyclerView.a0 a0Var, boolean z10, boolean z11) {
        int i10;
        int T = T();
        int i11 = -1;
        int i12 = 1;
        if (z11) {
            i10 = T() - 1;
            i12 = -1;
        } else {
            i11 = T;
            i10 = 0;
        }
        int b10 = a0Var.b();
        b2();
        int m10 = this.f3492u.m();
        int i13 = this.f3492u.i();
        View view = null;
        View view2 = null;
        while (i10 != i11) {
            View S = S(i10);
            int n02 = n0(S);
            if (n02 >= 0 && n02 < b10 && d3(wVar, a0Var, n02) == 0) {
                if (((RecyclerView.q) S.getLayoutParams()).f()) {
                    if (view2 == null) {
                        view2 = S;
                    }
                } else if (this.f3492u.g(S) < i13 && this.f3492u.d(S) >= m10) {
                    return S;
                } else {
                    if (view == null) {
                        view = S;
                    }
                }
            }
            i10 += i12;
        }
        return view != null ? view : view2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int q0(RecyclerView.w wVar, RecyclerView.a0 a0Var) {
        if (this.f3490s == 0) {
            return this.J;
        }
        if (a0Var.b() < 1) {
            return 0;
        }
        return c3(wVar, a0Var, a0Var.b() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean w(RecyclerView.q qVar) {
        return qVar instanceof b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x009f, code lost:
        r21.f3507b = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a1, code lost:
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v19 */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void w2(androidx.recyclerview.widget.RecyclerView.w r18, androidx.recyclerview.widget.RecyclerView.a0 r19, androidx.recyclerview.widget.LinearLayoutManager.c r20, androidx.recyclerview.widget.LinearLayoutManager.b r21) {
        /*
            Method dump skipped, instructions count: 564
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.w2(androidx.recyclerview.widget.RecyclerView$w, androidx.recyclerview.widget.RecyclerView$a0, androidx.recyclerview.widget.LinearLayoutManager$c, androidx.recyclerview.widget.LinearLayoutManager$b):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void y2(RecyclerView.w wVar, RecyclerView.a0 a0Var, LinearLayoutManager.a aVar, int i10) {
        super.y2(wVar, a0Var, aVar, i10);
        k3();
        if (a0Var.b() > 0 && !a0Var.e()) {
            Y2(wVar, a0Var, aVar, i10);
        }
        Z2();
    }

    /* loaded from: classes.dex */
    public static class b extends RecyclerView.q {

        /* renamed from: e  reason: collision with root package name */
        int f3484e;

        /* renamed from: f  reason: collision with root package name */
        int f3485f;

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f3484e = -1;
            this.f3485f = 0;
        }

        public int h() {
            return this.f3484e;
        }

        public int i() {
            return this.f3485f;
        }

        public b(int i10, int i11) {
            super(i10, i11);
            this.f3484e = -1;
            this.f3485f = 0;
        }

        public b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f3484e = -1;
            this.f3485f = 0;
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f3484e = -1;
            this.f3485f = 0;
        }
    }

    public GridLayoutManager(Context context, int i10, int i11, boolean z10) {
        super(context, i11, z10);
        this.I = false;
        this.J = -1;
        this.M = new SparseIntArray();
        this.N = new SparseIntArray();
        this.O = new a();
        this.P = new Rect();
        j3(i10);
    }
}
