package com.google.android.flexbox;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.g;
import androidx.recyclerview.widget.j;
import com.google.android.flexbox.c;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class FlexboxLayoutManager extends RecyclerView.p implements com.google.android.flexbox.a, RecyclerView.z.b {
    private static final Rect S = new Rect();
    private RecyclerView.w B;
    private RecyclerView.a0 C;
    private c D;
    private j F;
    private j G;
    private SavedState H;
    private boolean M;
    private final Context O;
    private View P;

    /* renamed from: s  reason: collision with root package name */
    private int f21872s;

    /* renamed from: t  reason: collision with root package name */
    private int f21873t;

    /* renamed from: u  reason: collision with root package name */
    private int f21874u;

    /* renamed from: v  reason: collision with root package name */
    private int f21875v;

    /* renamed from: x  reason: collision with root package name */
    private boolean f21877x;

    /* renamed from: y  reason: collision with root package name */
    private boolean f21878y;

    /* renamed from: w  reason: collision with root package name */
    private int f21876w = -1;

    /* renamed from: z  reason: collision with root package name */
    private List<com.google.android.flexbox.b> f21879z = new ArrayList();
    private final com.google.android.flexbox.c A = new com.google.android.flexbox.c(this);
    private b E = new b();
    private int I = -1;
    private int J = RecyclerView.UNDEFINED_DURATION;
    private int K = RecyclerView.UNDEFINED_DURATION;
    private int L = RecyclerView.UNDEFINED_DURATION;
    private SparseArray<View> N = new SparseArray<>();
    private int Q = -1;
    private c.b R = new c.b();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public class b {

        /* renamed from: a  reason: collision with root package name */
        private int f21891a;

        /* renamed from: b  reason: collision with root package name */
        private int f21892b;

        /* renamed from: c  reason: collision with root package name */
        private int f21893c;

        /* renamed from: d  reason: collision with root package name */
        private int f21894d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f21895e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f21896f;

        /* renamed from: g  reason: collision with root package name */
        private boolean f21897g;

        private b() {
            this.f21894d = 0;
        }

        static /* synthetic */ int l(b bVar, int i10) {
            int i11 = bVar.f21894d + i10;
            bVar.f21894d = i11;
            return i11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void r() {
            if (!FlexboxLayoutManager.this.k() && FlexboxLayoutManager.this.f21877x) {
                this.f21893c = this.f21895e ? FlexboxLayoutManager.this.F.i() : FlexboxLayoutManager.this.u0() - FlexboxLayoutManager.this.F.m();
            } else {
                this.f21893c = this.f21895e ? FlexboxLayoutManager.this.F.i() : FlexboxLayoutManager.this.F.m();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void s(View view) {
            j jVar = FlexboxLayoutManager.this.f21873t == 0 ? FlexboxLayoutManager.this.G : FlexboxLayoutManager.this.F;
            if (!FlexboxLayoutManager.this.k() && FlexboxLayoutManager.this.f21877x) {
                if (this.f21895e) {
                    this.f21893c = jVar.g(view) + jVar.o();
                } else {
                    this.f21893c = jVar.d(view);
                }
            } else if (this.f21895e) {
                this.f21893c = jVar.d(view) + jVar.o();
            } else {
                this.f21893c = jVar.g(view);
            }
            this.f21891a = FlexboxLayoutManager.this.n0(view);
            this.f21897g = false;
            int[] iArr = FlexboxLayoutManager.this.A.f21929c;
            int i10 = this.f21891a;
            if (i10 == -1) {
                i10 = 0;
            }
            int i11 = iArr[i10];
            this.f21892b = i11 != -1 ? i11 : 0;
            if (FlexboxLayoutManager.this.f21879z.size() > this.f21892b) {
                this.f21891a = ((com.google.android.flexbox.b) FlexboxLayoutManager.this.f21879z.get(this.f21892b)).f21923o;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void t() {
            this.f21891a = -1;
            this.f21892b = -1;
            this.f21893c = RecyclerView.UNDEFINED_DURATION;
            this.f21896f = false;
            this.f21897g = false;
            if (FlexboxLayoutManager.this.k()) {
                if (FlexboxLayoutManager.this.f21873t == 0) {
                    this.f21895e = FlexboxLayoutManager.this.f21872s == 1;
                } else {
                    this.f21895e = FlexboxLayoutManager.this.f21873t == 2;
                }
            } else if (FlexboxLayoutManager.this.f21873t == 0) {
                this.f21895e = FlexboxLayoutManager.this.f21872s == 3;
            } else {
                this.f21895e = FlexboxLayoutManager.this.f21873t == 2;
            }
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.f21891a + ", mFlexLinePosition=" + this.f21892b + ", mCoordinate=" + this.f21893c + ", mPerpendicularCoordinate=" + this.f21894d + ", mLayoutFromEnd=" + this.f21895e + ", mValid=" + this.f21896f + ", mAssignedFromSavedState=" + this.f21897g + '}';
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        private int f21899a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f21900b;

        /* renamed from: c  reason: collision with root package name */
        private int f21901c;

        /* renamed from: d  reason: collision with root package name */
        private int f21902d;

        /* renamed from: e  reason: collision with root package name */
        private int f21903e;

        /* renamed from: f  reason: collision with root package name */
        private int f21904f;

        /* renamed from: g  reason: collision with root package name */
        private int f21905g;

        /* renamed from: h  reason: collision with root package name */
        private int f21906h;

        /* renamed from: i  reason: collision with root package name */
        private int f21907i;

        /* renamed from: j  reason: collision with root package name */
        private boolean f21908j;

        private c() {
            this.f21906h = 1;
            this.f21907i = 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean D(RecyclerView.a0 a0Var, List<com.google.android.flexbox.b> list) {
            int i10;
            int i11 = this.f21902d;
            return i11 >= 0 && i11 < a0Var.b() && (i10 = this.f21901c) >= 0 && i10 < list.size();
        }

        static /* synthetic */ int c(c cVar, int i10) {
            int i11 = cVar.f21903e + i10;
            cVar.f21903e = i11;
            return i11;
        }

        static /* synthetic */ int d(c cVar, int i10) {
            int i11 = cVar.f21903e - i10;
            cVar.f21903e = i11;
            return i11;
        }

        static /* synthetic */ int i(c cVar, int i10) {
            int i11 = cVar.f21899a - i10;
            cVar.f21899a = i11;
            return i11;
        }

        static /* synthetic */ int l(c cVar) {
            int i10 = cVar.f21901c;
            cVar.f21901c = i10 + 1;
            return i10;
        }

        static /* synthetic */ int m(c cVar) {
            int i10 = cVar.f21901c;
            cVar.f21901c = i10 - 1;
            return i10;
        }

        static /* synthetic */ int n(c cVar, int i10) {
            int i11 = cVar.f21901c + i10;
            cVar.f21901c = i11;
            return i11;
        }

        static /* synthetic */ int q(c cVar, int i10) {
            int i11 = cVar.f21904f + i10;
            cVar.f21904f = i11;
            return i11;
        }

        static /* synthetic */ int u(c cVar, int i10) {
            int i11 = cVar.f21902d + i10;
            cVar.f21902d = i11;
            return i11;
        }

        static /* synthetic */ int v(c cVar, int i10) {
            int i11 = cVar.f21902d - i10;
            cVar.f21902d = i11;
            return i11;
        }

        public String toString() {
            return "LayoutState{mAvailable=" + this.f21899a + ", mFlexLinePosition=" + this.f21901c + ", mPosition=" + this.f21902d + ", mOffset=" + this.f21903e + ", mScrollingOffset=" + this.f21904f + ", mLastScrollDelta=" + this.f21905g + ", mItemDirection=" + this.f21906h + ", mLayoutDirection=" + this.f21907i + '}';
        }
    }

    public FlexboxLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        RecyclerView.p.d o02 = RecyclerView.p.o0(context, attributeSet, i10, i11);
        int i12 = o02.f3586a;
        if (i12 != 0) {
            if (i12 == 1) {
                if (o02.f3588c) {
                    M2(3);
                } else {
                    M2(2);
                }
            }
        } else if (o02.f3588c) {
            M2(1);
        } else {
            M2(0);
        }
        N2(1);
        L2(4);
        this.O = context;
    }

    private int A2(int i10) {
        int i11;
        if (T() == 0 || i10 == 0) {
            return 0;
        }
        i2();
        boolean k10 = k();
        View view = this.P;
        int width = k10 ? view.getWidth() : view.getHeight();
        int u02 = k10 ? u0() : g0();
        if (j0() == 1) {
            int abs = Math.abs(i10);
            if (i10 >= 0) {
                if (this.E.f21894d + i10 <= 0) {
                    return i10;
                }
                i11 = this.E.f21894d;
            } else {
                i11 = Math.min((u02 + this.E.f21894d) - width, abs);
            }
        } else if (i10 <= 0) {
            if (this.E.f21894d + i10 >= 0) {
                return i10;
            }
            i11 = this.E.f21894d;
        } else {
            return Math.min((u02 - this.E.f21894d) - width, i10);
        }
        return -i11;
    }

    private boolean B2(View view, boolean z10) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int u02 = u0() - getPaddingRight();
        int g02 = g0() - getPaddingBottom();
        int w22 = w2(view);
        int y22 = y2(view);
        int x22 = x2(view);
        int u22 = u2(view);
        return z10 ? (paddingLeft <= w22 && u02 >= x22) && (paddingTop <= y22 && g02 >= u22) : (w22 >= u02 || x22 >= paddingLeft) && (y22 >= g02 || u22 >= paddingTop);
    }

    private int C2(com.google.android.flexbox.b bVar, c cVar) {
        if (k()) {
            return D2(bVar, cVar);
        }
        return E2(bVar, cVar);
    }

    private static boolean D0(int i10, int i11, int i12) {
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        if (i12 <= 0 || i10 == i12) {
            if (mode == Integer.MIN_VALUE) {
                return size >= i10;
            } else if (mode != 0) {
                return mode == 1073741824 && size == i10;
            } else {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int D2(com.google.android.flexbox.b r22, com.google.android.flexbox.FlexboxLayoutManager.c r23) {
        /*
            Method dump skipped, instructions count: 423
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.D2(com.google.android.flexbox.b, com.google.android.flexbox.FlexboxLayoutManager$c):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int E2(com.google.android.flexbox.b r26, com.google.android.flexbox.FlexboxLayoutManager.c r27) {
        /*
            Method dump skipped, instructions count: 539
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.E2(com.google.android.flexbox.b, com.google.android.flexbox.FlexboxLayoutManager$c):int");
    }

    private void F2(RecyclerView.w wVar, c cVar) {
        if (cVar.f21908j) {
            if (cVar.f21907i == -1) {
                H2(wVar, cVar);
            } else {
                I2(wVar, cVar);
            }
        }
    }

    private void G2(RecyclerView.w wVar, int i10, int i11) {
        while (i11 >= i10) {
            v1(i11, wVar);
            i11--;
        }
    }

    private void H2(RecyclerView.w wVar, c cVar) {
        int T;
        int i10;
        View S2;
        int i11;
        if (cVar.f21904f < 0 || (T = T()) == 0 || (S2 = S(T - 1)) == null || (i11 = this.A.f21929c[n0(S2)]) == -1) {
            return;
        }
        com.google.android.flexbox.b bVar = this.f21879z.get(i11);
        int i12 = i10;
        while (true) {
            if (i12 < 0) {
                break;
            }
            View S3 = S(i12);
            if (S3 != null) {
                if (!b2(S3, cVar.f21904f)) {
                    break;
                } else if (bVar.f21923o != n0(S3)) {
                    continue;
                } else if (i11 <= 0) {
                    T = i12;
                    break;
                } else {
                    i11 += cVar.f21907i;
                    bVar = this.f21879z.get(i11);
                    T = i12;
                }
            }
            i12--;
        }
        G2(wVar, T, i10);
    }

    private void I2(RecyclerView.w wVar, c cVar) {
        int T;
        View S2;
        if (cVar.f21904f < 0 || (T = T()) == 0 || (S2 = S(0)) == null) {
            return;
        }
        int i10 = this.A.f21929c[n0(S2)];
        int i11 = -1;
        if (i10 == -1) {
            return;
        }
        com.google.android.flexbox.b bVar = this.f21879z.get(i10);
        int i12 = 0;
        while (true) {
            if (i12 >= T) {
                break;
            }
            View S3 = S(i12);
            if (S3 != null) {
                if (!c2(S3, cVar.f21904f)) {
                    break;
                } else if (bVar.f21924p != n0(S3)) {
                    continue;
                } else if (i10 >= this.f21879z.size() - 1) {
                    i11 = i12;
                    break;
                } else {
                    i10 += cVar.f21907i;
                    bVar = this.f21879z.get(i10);
                    i11 = i12;
                }
            }
            i12++;
        }
        G2(wVar, 0, i11);
    }

    private void J2() {
        int v02;
        if (k()) {
            v02 = h0();
        } else {
            v02 = v0();
        }
        this.D.f21900b = v02 == 0 || v02 == Integer.MIN_VALUE;
    }

    private void K2() {
        int j02 = j0();
        int i10 = this.f21872s;
        if (i10 == 0) {
            this.f21877x = j02 == 1;
            this.f21878y = this.f21873t == 2;
        } else if (i10 == 1) {
            this.f21877x = j02 != 1;
            this.f21878y = this.f21873t == 2;
        } else if (i10 == 2) {
            boolean z10 = j02 == 1;
            this.f21877x = z10;
            if (this.f21873t == 2) {
                this.f21877x = !z10;
            }
            this.f21878y = false;
        } else if (i10 != 3) {
            this.f21877x = false;
            this.f21878y = false;
        } else {
            boolean z11 = j02 == 1;
            this.f21877x = z11;
            if (this.f21873t == 2) {
                this.f21877x = !z11;
            }
            this.f21878y = true;
        }
    }

    private boolean N1(View view, int i10, int i11, RecyclerView.q qVar) {
        return (!view.isLayoutRequested() && C0() && D0(view.getWidth(), i10, ((ViewGroup.MarginLayoutParams) qVar).width) && D0(view.getHeight(), i11, ((ViewGroup.MarginLayoutParams) qVar).height)) ? false : true;
    }

    private boolean O2(RecyclerView.a0 a0Var, b bVar) {
        View k22;
        int m10;
        boolean z10 = false;
        if (T() == 0) {
            return false;
        }
        if (bVar.f21895e) {
            k22 = n2(a0Var.b());
        } else {
            k22 = k2(a0Var.b());
        }
        if (k22 != null) {
            bVar.s(k22);
            if (!a0Var.e() && T1()) {
                if ((this.F.g(k22) >= this.F.i() || this.F.d(k22) < this.F.m()) ? true : true) {
                    if (bVar.f21895e) {
                        m10 = this.F.i();
                    } else {
                        m10 = this.F.m();
                    }
                    bVar.f21893c = m10;
                }
            }
            return true;
        }
        return false;
    }

    private boolean P2(RecyclerView.a0 a0Var, b bVar, SavedState savedState) {
        int i10;
        View S2;
        int g10;
        if (!a0Var.e() && (i10 = this.I) != -1) {
            if (i10 >= 0 && i10 < a0Var.b()) {
                bVar.f21891a = this.I;
                bVar.f21892b = this.A.f21929c[bVar.f21891a];
                SavedState savedState2 = this.H;
                if (savedState2 != null && savedState2.j(a0Var.b())) {
                    bVar.f21893c = this.F.m() + savedState.f21890b;
                    bVar.f21897g = true;
                    bVar.f21892b = -1;
                    return true;
                } else if (this.J == Integer.MIN_VALUE) {
                    View M = M(this.I);
                    if (M != null) {
                        if (this.F.e(M) > this.F.n()) {
                            bVar.r();
                            return true;
                        } else if (this.F.g(M) - this.F.m() < 0) {
                            bVar.f21893c = this.F.m();
                            bVar.f21895e = false;
                            return true;
                        } else if (this.F.i() - this.F.d(M) < 0) {
                            bVar.f21893c = this.F.i();
                            bVar.f21895e = true;
                            return true;
                        } else {
                            if (bVar.f21895e) {
                                g10 = this.F.d(M) + this.F.o();
                            } else {
                                g10 = this.F.g(M);
                            }
                            bVar.f21893c = g10;
                        }
                    } else {
                        if (T() > 0 && (S2 = S(0)) != null) {
                            bVar.f21895e = this.I < n0(S2);
                        }
                        bVar.r();
                    }
                    return true;
                } else {
                    if (k() || !this.f21877x) {
                        bVar.f21893c = this.F.m() + this.J;
                    } else {
                        bVar.f21893c = this.J - this.F.j();
                    }
                    return true;
                }
            }
            this.I = -1;
            this.J = RecyclerView.UNDEFINED_DURATION;
        }
        return false;
    }

    private void Q2(RecyclerView.a0 a0Var, b bVar) {
        if (P2(a0Var, bVar, this.H) || O2(a0Var, bVar)) {
            return;
        }
        bVar.r();
        bVar.f21891a = 0;
        bVar.f21892b = 0;
    }

    private void R2(int i10) {
        if (i10 >= p2()) {
            return;
        }
        int T = T();
        this.A.t(T);
        this.A.u(T);
        this.A.s(T);
        if (i10 >= this.A.f21929c.length) {
            return;
        }
        this.Q = i10;
        View v22 = v2();
        if (v22 == null) {
            return;
        }
        this.I = n0(v22);
        if (!k() && this.f21877x) {
            this.J = this.F.d(v22) + this.F.j();
        } else {
            this.J = this.F.g(v22) - this.F.m();
        }
    }

    private void S2(int i10) {
        int i11;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(u0(), v0());
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(g0(), h0());
        int u02 = u0();
        int g02 = g0();
        boolean z10 = true;
        if (k()) {
            int i12 = this.K;
            z10 = (i12 == Integer.MIN_VALUE || i12 == u02) ? false : false;
            i11 = this.D.f21900b ? this.O.getResources().getDisplayMetrics().heightPixels : this.D.f21899a;
        } else {
            int i13 = this.L;
            z10 = (i13 == Integer.MIN_VALUE || i13 == g02) ? false : false;
            if (!this.D.f21900b) {
                i11 = this.D.f21899a;
            } else {
                i11 = this.O.getResources().getDisplayMetrics().widthPixels;
            }
        }
        int i14 = i11;
        this.K = u02;
        this.L = g02;
        int i15 = this.Q;
        if (i15 != -1 || (this.I == -1 && !z10)) {
            int min = i15 != -1 ? Math.min(i15, this.E.f21891a) : this.E.f21891a;
            this.R.a();
            if (k()) {
                if (this.f21879z.size() > 0) {
                    this.A.j(this.f21879z, min);
                    this.A.b(this.R, makeMeasureSpec, makeMeasureSpec2, i14, min, this.E.f21891a, this.f21879z);
                } else {
                    this.A.s(i10);
                    this.A.d(this.R, makeMeasureSpec, makeMeasureSpec2, i14, 0, this.f21879z);
                }
            } else if (this.f21879z.size() > 0) {
                this.A.j(this.f21879z, min);
                this.A.b(this.R, makeMeasureSpec2, makeMeasureSpec, i14, min, this.E.f21891a, this.f21879z);
            } else {
                this.A.s(i10);
                this.A.g(this.R, makeMeasureSpec, makeMeasureSpec2, i14, 0, this.f21879z);
            }
            this.f21879z = this.R.f21932a;
            this.A.q(makeMeasureSpec, makeMeasureSpec2, min);
            this.A.Y(min);
        } else if (this.E.f21895e) {
        } else {
            this.f21879z.clear();
            this.R.a();
            if (k()) {
                this.A.e(this.R, makeMeasureSpec, makeMeasureSpec2, i14, this.E.f21891a, this.f21879z);
            } else {
                this.A.h(this.R, makeMeasureSpec, makeMeasureSpec2, i14, this.E.f21891a, this.f21879z);
            }
            this.f21879z = this.R.f21932a;
            this.A.p(makeMeasureSpec, makeMeasureSpec2);
            this.A.X();
            b bVar = this.E;
            bVar.f21892b = this.A.f21929c[bVar.f21891a];
            this.D.f21901c = this.E.f21892b;
        }
    }

    private void T2(int i10, int i11) {
        this.D.f21907i = i10;
        boolean k10 = k();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(u0(), v0());
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(g0(), h0());
        boolean z10 = !k10 && this.f21877x;
        if (i10 == 1) {
            View S2 = S(T() - 1);
            if (S2 == null) {
                return;
            }
            this.D.f21903e = this.F.d(S2);
            int n02 = n0(S2);
            View o22 = o2(S2, this.f21879z.get(this.A.f21929c[n02]));
            this.D.f21906h = 1;
            c cVar = this.D;
            cVar.f21902d = n02 + cVar.f21906h;
            if (this.A.f21929c.length <= this.D.f21902d) {
                this.D.f21901c = -1;
            } else {
                c cVar2 = this.D;
                cVar2.f21901c = this.A.f21929c[cVar2.f21902d];
            }
            if (z10) {
                this.D.f21903e = this.F.g(o22);
                this.D.f21904f = (-this.F.g(o22)) + this.F.m();
                c cVar3 = this.D;
                cVar3.f21904f = Math.max(cVar3.f21904f, 0);
            } else {
                this.D.f21903e = this.F.d(o22);
                this.D.f21904f = this.F.d(o22) - this.F.i();
            }
            if ((this.D.f21901c == -1 || this.D.f21901c > this.f21879z.size() - 1) && this.D.f21902d <= getFlexItemCount()) {
                int i12 = i11 - this.D.f21904f;
                this.R.a();
                if (i12 > 0) {
                    if (k10) {
                        this.A.d(this.R, makeMeasureSpec, makeMeasureSpec2, i12, this.D.f21902d, this.f21879z);
                    } else {
                        this.A.g(this.R, makeMeasureSpec, makeMeasureSpec2, i12, this.D.f21902d, this.f21879z);
                    }
                    this.A.q(makeMeasureSpec, makeMeasureSpec2, this.D.f21902d);
                    this.A.Y(this.D.f21902d);
                }
            }
        } else {
            View S3 = S(0);
            if (S3 == null) {
                return;
            }
            this.D.f21903e = this.F.g(S3);
            int n03 = n0(S3);
            View l22 = l2(S3, this.f21879z.get(this.A.f21929c[n03]));
            this.D.f21906h = 1;
            int i13 = this.A.f21929c[n03];
            if (i13 == -1) {
                i13 = 0;
            }
            if (i13 > 0) {
                this.D.f21902d = n03 - this.f21879z.get(i13 - 1).b();
            } else {
                this.D.f21902d = -1;
            }
            this.D.f21901c = i13 > 0 ? i13 - 1 : 0;
            if (z10) {
                this.D.f21903e = this.F.d(l22);
                this.D.f21904f = this.F.d(l22) - this.F.i();
                c cVar4 = this.D;
                cVar4.f21904f = Math.max(cVar4.f21904f, 0);
            } else {
                this.D.f21903e = this.F.g(l22);
                this.D.f21904f = (-this.F.g(l22)) + this.F.m();
            }
        }
        c cVar5 = this.D;
        cVar5.f21899a = i11 - cVar5.f21904f;
    }

    private void U2(b bVar, boolean z10, boolean z11) {
        if (z11) {
            J2();
        } else {
            this.D.f21900b = false;
        }
        if (!k() && this.f21877x) {
            this.D.f21899a = bVar.f21893c - getPaddingRight();
        } else {
            this.D.f21899a = this.F.i() - bVar.f21893c;
        }
        this.D.f21902d = bVar.f21891a;
        this.D.f21906h = 1;
        this.D.f21907i = 1;
        this.D.f21903e = bVar.f21893c;
        this.D.f21904f = RecyclerView.UNDEFINED_DURATION;
        this.D.f21901c = bVar.f21892b;
        if (!z10 || this.f21879z.size() <= 1 || bVar.f21892b < 0 || bVar.f21892b >= this.f21879z.size() - 1) {
            return;
        }
        c.l(this.D);
        c.u(this.D, this.f21879z.get(bVar.f21892b).b());
    }

    private void V2(b bVar, boolean z10, boolean z11) {
        if (z11) {
            J2();
        } else {
            this.D.f21900b = false;
        }
        if (!k() && this.f21877x) {
            this.D.f21899a = (this.P.getWidth() - bVar.f21893c) - this.F.m();
        } else {
            this.D.f21899a = bVar.f21893c - this.F.m();
        }
        this.D.f21902d = bVar.f21891a;
        this.D.f21906h = 1;
        this.D.f21907i = -1;
        this.D.f21903e = bVar.f21893c;
        this.D.f21904f = RecyclerView.UNDEFINED_DURATION;
        this.D.f21901c = bVar.f21892b;
        if (!z10 || bVar.f21892b <= 0 || this.f21879z.size() <= bVar.f21892b) {
            return;
        }
        c.m(this.D);
        c.v(this.D, this.f21879z.get(bVar.f21892b).b());
    }

    private boolean b2(View view, int i10) {
        return (k() || !this.f21877x) ? this.F.g(view) >= this.F.h() - i10 : this.F.d(view) <= i10;
    }

    private boolean c2(View view, int i10) {
        return (k() || !this.f21877x) ? this.F.d(view) <= i10 : this.F.h() - this.F.g(view) <= i10;
    }

    private void d2() {
        this.f21879z.clear();
        this.E.t();
        this.E.f21894d = 0;
    }

    private int e2(RecyclerView.a0 a0Var) {
        if (T() == 0) {
            return 0;
        }
        int b10 = a0Var.b();
        i2();
        View k22 = k2(b10);
        View n22 = n2(b10);
        if (a0Var.b() == 0 || k22 == null || n22 == null) {
            return 0;
        }
        return Math.min(this.F.n(), this.F.d(n22) - this.F.g(k22));
    }

    private int f2(RecyclerView.a0 a0Var) {
        if (T() == 0) {
            return 0;
        }
        int b10 = a0Var.b();
        View k22 = k2(b10);
        View n22 = n2(b10);
        if (a0Var.b() != 0 && k22 != null && n22 != null) {
            int n02 = n0(k22);
            int n03 = n0(n22);
            int abs = Math.abs(this.F.d(n22) - this.F.g(k22));
            int[] iArr = this.A.f21929c;
            int i10 = iArr[n02];
            if (i10 != 0 && i10 != -1) {
                return Math.round((i10 * (abs / ((iArr[n03] - i10) + 1))) + (this.F.m() - this.F.g(k22)));
            }
        }
        return 0;
    }

    private int g2(RecyclerView.a0 a0Var) {
        if (T() == 0) {
            return 0;
        }
        int b10 = a0Var.b();
        View k22 = k2(b10);
        View n22 = n2(b10);
        if (a0Var.b() == 0 || k22 == null || n22 == null) {
            return 0;
        }
        int m22 = m2();
        return (int) ((Math.abs(this.F.d(n22) - this.F.g(k22)) / ((p2() - m22) + 1)) * a0Var.b());
    }

    private void h2() {
        if (this.D == null) {
            this.D = new c();
        }
    }

    private void i2() {
        if (this.F != null) {
            return;
        }
        if (k()) {
            if (this.f21873t == 0) {
                this.F = j.a(this);
                this.G = j.c(this);
                return;
            }
            this.F = j.c(this);
            this.G = j.a(this);
        } else if (this.f21873t == 0) {
            this.F = j.c(this);
            this.G = j.a(this);
        } else {
            this.F = j.a(this);
            this.G = j.c(this);
        }
    }

    private int j2(RecyclerView.w wVar, RecyclerView.a0 a0Var, c cVar) {
        if (cVar.f21904f != Integer.MIN_VALUE) {
            if (cVar.f21899a < 0) {
                c.q(cVar, cVar.f21899a);
            }
            F2(wVar, cVar);
        }
        int i10 = cVar.f21899a;
        int i11 = cVar.f21899a;
        int i12 = 0;
        boolean k10 = k();
        while (true) {
            if ((i11 > 0 || this.D.f21900b) && cVar.D(a0Var, this.f21879z)) {
                com.google.android.flexbox.b bVar = this.f21879z.get(cVar.f21901c);
                cVar.f21902d = bVar.f21923o;
                i12 += C2(bVar, cVar);
                if (k10 || !this.f21877x) {
                    c.c(cVar, bVar.a() * cVar.f21907i);
                } else {
                    c.d(cVar, bVar.a() * cVar.f21907i);
                }
                i11 -= bVar.a();
            }
        }
        c.i(cVar, i12);
        if (cVar.f21904f != Integer.MIN_VALUE) {
            c.q(cVar, i12);
            if (cVar.f21899a < 0) {
                c.q(cVar, cVar.f21899a);
            }
            F2(wVar, cVar);
        }
        return i10 - cVar.f21899a;
    }

    private View k2(int i10) {
        View r22 = r2(0, T(), i10);
        if (r22 == null) {
            return null;
        }
        int i11 = this.A.f21929c[n0(r22)];
        if (i11 == -1) {
            return null;
        }
        return l2(r22, this.f21879z.get(i11));
    }

    private View l2(View view, com.google.android.flexbox.b bVar) {
        boolean k10 = k();
        int i10 = bVar.f21916h;
        for (int i11 = 1; i11 < i10; i11++) {
            View S2 = S(i11);
            if (S2 != null && S2.getVisibility() != 8) {
                if (this.f21877x && !k10) {
                    if (this.F.d(view) >= this.F.d(S2)) {
                    }
                    view = S2;
                } else {
                    if (this.F.g(view) <= this.F.g(S2)) {
                    }
                    view = S2;
                }
            }
        }
        return view;
    }

    private View n2(int i10) {
        View r22 = r2(T() - 1, -1, i10);
        if (r22 == null) {
            return null;
        }
        return o2(r22, this.f21879z.get(this.A.f21929c[n0(r22)]));
    }

    private View o2(View view, com.google.android.flexbox.b bVar) {
        boolean k10 = k();
        int T = (T() - bVar.f21916h) - 1;
        for (int T2 = T() - 2; T2 > T; T2--) {
            View S2 = S(T2);
            if (S2 != null && S2.getVisibility() != 8) {
                if (this.f21877x && !k10) {
                    if (this.F.g(view) <= this.F.g(S2)) {
                    }
                    view = S2;
                } else {
                    if (this.F.d(view) >= this.F.d(S2)) {
                    }
                    view = S2;
                }
            }
        }
        return view;
    }

    private View q2(int i10, int i11, boolean z10) {
        int i12 = i11 > i10 ? 1 : -1;
        while (i10 != i11) {
            View S2 = S(i10);
            if (B2(S2, z10)) {
                return S2;
            }
            i10 += i12;
        }
        return null;
    }

    private View r2(int i10, int i11, int i12) {
        int n02;
        i2();
        h2();
        int m10 = this.F.m();
        int i13 = this.F.i();
        int i14 = i11 > i10 ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i10 != i11) {
            View S2 = S(i10);
            if (S2 != null && (n02 = n0(S2)) >= 0 && n02 < i12) {
                if (((RecyclerView.q) S2.getLayoutParams()).f()) {
                    if (view2 == null) {
                        view2 = S2;
                    }
                } else if (this.F.g(S2) >= m10 && this.F.d(S2) <= i13) {
                    return S2;
                } else {
                    if (view == null) {
                        view = S2;
                    }
                }
            }
            i10 += i14;
        }
        return view != null ? view : view2;
    }

    private int s2(int i10, RecyclerView.w wVar, RecyclerView.a0 a0Var, boolean z10) {
        int i11;
        int i12;
        if (!k() && this.f21877x) {
            int m10 = i10 - this.F.m();
            if (m10 <= 0) {
                return 0;
            }
            i11 = z2(m10, wVar, a0Var);
        } else {
            int i13 = this.F.i() - i10;
            if (i13 <= 0) {
                return 0;
            }
            i11 = -z2(-i13, wVar, a0Var);
        }
        int i14 = i10 + i11;
        if (!z10 || (i12 = this.F.i() - i14) <= 0) {
            return i11;
        }
        this.F.r(i12);
        return i12 + i11;
    }

    private int t2(int i10, RecyclerView.w wVar, RecyclerView.a0 a0Var, boolean z10) {
        int i11;
        int m10;
        if (!k() && this.f21877x) {
            int i12 = this.F.i() - i10;
            if (i12 <= 0) {
                return 0;
            }
            i11 = z2(-i12, wVar, a0Var);
        } else {
            int m11 = i10 - this.F.m();
            if (m11 <= 0) {
                return 0;
            }
            i11 = -z2(m11, wVar, a0Var);
        }
        int i13 = i10 + i11;
        if (!z10 || (m10 = i13 - this.F.m()) <= 0) {
            return i11;
        }
        this.F.r(-m10);
        return i11 - m10;
    }

    private int u2(View view) {
        return Y(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.q) view.getLayoutParams())).bottomMargin;
    }

    private View v2() {
        return S(0);
    }

    private int w2(View view) {
        return a0(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.q) view.getLayoutParams())).leftMargin;
    }

    private int x2(View view) {
        return d0(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.q) view.getLayoutParams())).rightMargin;
    }

    private int y2(View view) {
        return e0(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.q) view.getLayoutParams())).topMargin;
    }

    private int z2(int i10, RecyclerView.w wVar, RecyclerView.a0 a0Var) {
        if (T() == 0 || i10 == 0) {
            return 0;
        }
        i2();
        int i11 = 1;
        this.D.f21908j = true;
        boolean z10 = !k() && this.f21877x;
        if (!z10 ? i10 <= 0 : i10 >= 0) {
            i11 = -1;
        }
        int abs = Math.abs(i10);
        T2(i11, abs);
        int j22 = this.D.f21904f + j2(wVar, a0Var, this.D);
        if (j22 < 0) {
            return 0;
        }
        if (z10) {
            if (abs > j22) {
                i10 = (-i11) * j22;
            }
        } else if (abs > j22) {
            i10 = i11 * j22;
        }
        this.F.r(-i10);
        this.D.f21905g = i10;
        return i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int A(RecyclerView.a0 a0Var) {
        return e2(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int B(RecyclerView.a0 a0Var) {
        return f2(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int C(RecyclerView.a0 a0Var) {
        return g2(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int D(RecyclerView.a0 a0Var) {
        return e2(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int E(RecyclerView.a0 a0Var) {
        return f2(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int E1(int i10, RecyclerView.w wVar, RecyclerView.a0 a0Var) {
        if (k() && this.f21873t != 0) {
            int A2 = A2(i10);
            b.l(this.E, A2);
            this.G.r(-A2);
            return A2;
        }
        int z22 = z2(i10, wVar, a0Var);
        this.N.clear();
        return z22;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int F(RecyclerView.a0 a0Var) {
        return g2(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void F1(int i10) {
        this.I = i10;
        this.J = RecyclerView.UNDEFINED_DURATION;
        SavedState savedState = this.H;
        if (savedState != null) {
            savedState.k();
        }
        B1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int G1(int i10, RecyclerView.w wVar, RecyclerView.a0 a0Var) {
        if (!k() && (this.f21873t != 0 || k())) {
            int A2 = A2(i10);
            b.l(this.E, A2);
            this.G.r(-A2);
            return A2;
        }
        int z22 = z2(i10, wVar, a0Var);
        this.N.clear();
        return z22;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void L0(RecyclerView.h hVar, RecyclerView.h hVar2) {
        r1();
    }

    public void L2(int i10) {
        int i11 = this.f21875v;
        if (i11 != i10) {
            if (i11 == 4 || i10 == 4) {
                r1();
                d2();
            }
            this.f21875v = i10;
            B1();
        }
    }

    public void M2(int i10) {
        if (this.f21872s != i10) {
            r1();
            this.f21872s = i10;
            this.F = null;
            this.G = null;
            d2();
            B1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q N() {
        return new LayoutParams(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void N0(RecyclerView recyclerView) {
        super.N0(recyclerView);
        this.P = (View) recyclerView.getParent();
    }

    public void N2(int i10) {
        if (i10 != 2) {
            int i11 = this.f21873t;
            if (i11 != i10) {
                if (i11 == 0 || i10 == 0) {
                    r1();
                    d2();
                }
                this.f21873t = i10;
                this.F = null;
                this.G = null;
                B1();
                return;
            }
            return;
        }
        throw new UnsupportedOperationException("wrap_reverse is not supported in FlexboxLayoutManager");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q O(Context context, AttributeSet attributeSet) {
        return new LayoutParams(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void P0(RecyclerView recyclerView, RecyclerView.w wVar) {
        super.P0(recyclerView, wVar);
        if (this.M) {
            s1(wVar);
            wVar.c();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void Q1(RecyclerView recyclerView, RecyclerView.a0 a0Var, int i10) {
        g gVar = new g(recyclerView.getContext());
        gVar.p(i10);
        R1(gVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void Y0(RecyclerView recyclerView, int i10, int i11) {
        super.Y0(recyclerView, i10, i11);
        R2(i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.z.b
    public PointF a(int i10) {
        View S2;
        if (T() == 0 || (S2 = S(0)) == null) {
            return null;
        }
        int i11 = i10 < n0(S2) ? -1 : 1;
        if (k()) {
            return new PointF(0.0f, i11);
        }
        return new PointF(i11, 0.0f);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void a1(RecyclerView recyclerView, int i10, int i11, int i12) {
        super.a1(recyclerView, i10, i11, i12);
        R2(Math.min(i10, i11));
    }

    @Override // com.google.android.flexbox.a
    public void b(View view, int i10, int i11, com.google.android.flexbox.b bVar) {
        t(view, S);
        if (k()) {
            int k02 = k0(view) + p0(view);
            bVar.f21913e += k02;
            bVar.f21914f += k02;
            return;
        }
        int s02 = s0(view) + R(view);
        bVar.f21913e += s02;
        bVar.f21914f += s02;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void b1(RecyclerView recyclerView, int i10, int i11) {
        super.b1(recyclerView, i10, i11);
        R2(i10);
    }

    @Override // com.google.android.flexbox.a
    public int c(int i10, int i11, int i12) {
        return RecyclerView.p.U(u0(), v0(), i11, i12, u());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void c1(RecyclerView recyclerView, int i10, int i11) {
        super.c1(recyclerView, i10, i11);
        R2(i10);
    }

    @Override // com.google.android.flexbox.a
    public View d(int i10) {
        View view = this.N.get(i10);
        return view != null ? view : this.B.o(i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void d1(RecyclerView recyclerView, int i10, int i11, Object obj) {
        super.d1(recyclerView, i10, i11, obj);
        R2(i10);
    }

    @Override // com.google.android.flexbox.a
    public int e(int i10, int i11, int i12) {
        return RecyclerView.p.U(g0(), h0(), i11, i12, v());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void e1(RecyclerView.w wVar, RecyclerView.a0 a0Var) {
        int i10;
        int i11;
        this.B = wVar;
        this.C = a0Var;
        int b10 = a0Var.b();
        if (b10 == 0 && a0Var.e()) {
            return;
        }
        K2();
        i2();
        h2();
        this.A.t(b10);
        this.A.u(b10);
        this.A.s(b10);
        this.D.f21908j = false;
        SavedState savedState = this.H;
        if (savedState != null && savedState.j(b10)) {
            this.I = this.H.f21889a;
        }
        if (!this.E.f21896f || this.I != -1 || this.H != null) {
            this.E.t();
            Q2(a0Var, this.E);
            this.E.f21896f = true;
        }
        G(wVar);
        if (this.E.f21895e) {
            V2(this.E, false, true);
        } else {
            U2(this.E, false, true);
        }
        S2(b10);
        j2(wVar, a0Var, this.D);
        if (this.E.f21895e) {
            i11 = this.D.f21903e;
            U2(this.E, true, false);
            j2(wVar, a0Var, this.D);
            i10 = this.D.f21903e;
        } else {
            i10 = this.D.f21903e;
            V2(this.E, true, false);
            j2(wVar, a0Var, this.D);
            i11 = this.D.f21903e;
        }
        if (T() > 0) {
            if (this.E.f21895e) {
                t2(i11 + s2(i10, wVar, a0Var, true), wVar, a0Var, false);
            } else {
                s2(i10 + t2(i11, wVar, a0Var, true), wVar, a0Var, false);
            }
        }
    }

    @Override // com.google.android.flexbox.a
    public int f(View view) {
        int k02;
        int p02;
        if (k()) {
            k02 = s0(view);
            p02 = R(view);
        } else {
            k02 = k0(view);
            p02 = p0(view);
        }
        return k02 + p02;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void f1(RecyclerView.a0 a0Var) {
        super.f1(a0Var);
        this.H = null;
        this.I = -1;
        this.J = RecyclerView.UNDEFINED_DURATION;
        this.Q = -1;
        this.E.t();
        this.N.clear();
    }

    @Override // com.google.android.flexbox.a
    public void g(com.google.android.flexbox.b bVar) {
    }

    @Override // com.google.android.flexbox.a
    public int getAlignContent() {
        return 5;
    }

    @Override // com.google.android.flexbox.a
    public int getAlignItems() {
        return this.f21875v;
    }

    @Override // com.google.android.flexbox.a
    public int getFlexDirection() {
        return this.f21872s;
    }

    @Override // com.google.android.flexbox.a
    public int getFlexItemCount() {
        return this.C.b();
    }

    @Override // com.google.android.flexbox.a
    public List<com.google.android.flexbox.b> getFlexLinesInternal() {
        return this.f21879z;
    }

    @Override // com.google.android.flexbox.a
    public int getFlexWrap() {
        return this.f21873t;
    }

    @Override // com.google.android.flexbox.a
    public int getLargestMainSize() {
        if (this.f21879z.size() == 0) {
            return 0;
        }
        int i10 = RecyclerView.UNDEFINED_DURATION;
        int size = this.f21879z.size();
        for (int i11 = 0; i11 < size; i11++) {
            i10 = Math.max(i10, this.f21879z.get(i11).f21913e);
        }
        return i10;
    }

    @Override // com.google.android.flexbox.a
    public int getMaxLine() {
        return this.f21876w;
    }

    @Override // com.google.android.flexbox.a
    public int getSumOfCrossSize() {
        int size = this.f21879z.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            i10 += this.f21879z.get(i11).f21915g;
        }
        return i10;
    }

    @Override // com.google.android.flexbox.a
    public View h(int i10) {
        return d(i10);
    }

    @Override // com.google.android.flexbox.a
    public void i(int i10, View view) {
        this.N.put(i10, view);
    }

    @Override // com.google.android.flexbox.a
    public int j(View view, int i10, int i11) {
        int s02;
        int R;
        if (k()) {
            s02 = k0(view);
            R = p0(view);
        } else {
            s02 = s0(view);
            R = R(view);
        }
        return s02 + R;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void j1(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.H = (SavedState) parcelable;
            B1();
        }
    }

    @Override // com.google.android.flexbox.a
    public boolean k() {
        int i10 = this.f21872s;
        return i10 == 0 || i10 == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public Parcelable k1() {
        if (this.H != null) {
            return new SavedState(this.H);
        }
        SavedState savedState = new SavedState();
        if (T() <= 0) {
            savedState.k();
        } else {
            View v22 = v2();
            savedState.f21889a = n0(v22);
            savedState.f21890b = this.F.g(v22) - this.F.m();
        }
        return savedState;
    }

    public int m2() {
        View q22 = q2(0, T(), false);
        if (q22 == null) {
            return -1;
        }
        return n0(q22);
    }

    public int p2() {
        View q22 = q2(T() - 1, -1, false);
        if (q22 == null) {
            return -1;
        }
        return n0(q22);
    }

    @Override // com.google.android.flexbox.a
    public void setFlexLines(List<com.google.android.flexbox.b> list) {
        this.f21879z = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean u() {
        if (this.f21873t == 0) {
            return k();
        }
        if (k()) {
            int u02 = u0();
            View view = this.P;
            if (u02 <= (view != null ? view.getWidth() : 0)) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean v() {
        if (this.f21873t == 0) {
            return !k();
        }
        if (k()) {
            return true;
        }
        int g02 = g0();
        View view = this.P;
        return g02 > (view != null ? view.getHeight() : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean w(RecyclerView.q qVar) {
        return qVar instanceof LayoutParams;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean y0() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        private int f21889a;

        /* renamed from: b  reason: collision with root package name */
        private int f21890b;

        /* loaded from: classes2.dex */
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

        /* JADX INFO: Access modifiers changed from: private */
        public boolean j(int i10) {
            int i11 = this.f21889a;
            return i11 >= 0 && i11 < i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void k() {
            this.f21889a = -1;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "SavedState{mAnchorPosition=" + this.f21889a + ", mAnchorOffset=" + this.f21890b + '}';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f21889a);
            parcel.writeInt(this.f21890b);
        }

        SavedState() {
        }

        private SavedState(Parcel parcel) {
            this.f21889a = parcel.readInt();
            this.f21890b = parcel.readInt();
        }

        private SavedState(SavedState savedState) {
            this.f21889a = savedState.f21889a;
            this.f21890b = savedState.f21890b;
        }
    }

    /* loaded from: classes2.dex */
    public static class LayoutParams extends RecyclerView.q implements FlexItem {
        public static final Parcelable.Creator<LayoutParams> CREATOR = new a();

        /* renamed from: e  reason: collision with root package name */
        private float f21880e;

        /* renamed from: f  reason: collision with root package name */
        private float f21881f;

        /* renamed from: g  reason: collision with root package name */
        private int f21882g;

        /* renamed from: h  reason: collision with root package name */
        private float f21883h;

        /* renamed from: i  reason: collision with root package name */
        private int f21884i;

        /* renamed from: j  reason: collision with root package name */
        private int f21885j;

        /* renamed from: k  reason: collision with root package name */
        private int f21886k;

        /* renamed from: l  reason: collision with root package name */
        private int f21887l;

        /* renamed from: m  reason: collision with root package name */
        private boolean f21888m;

        /* loaded from: classes2.dex */
        class a implements Parcelable.Creator<LayoutParams> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public LayoutParams createFromParcel(Parcel parcel) {
                return new LayoutParams(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public LayoutParams[] newArray(int i10) {
                return new LayoutParams[i10];
            }
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f21880e = 0.0f;
            this.f21881f = 1.0f;
            this.f21882g = -1;
            this.f21883h = -1.0f;
            this.f21886k = 16777215;
            this.f21887l = 16777215;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int C() {
            return this.f21884i;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int C0() {
            return ((ViewGroup.MarginLayoutParams) this).bottomMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int E0() {
            return ((ViewGroup.MarginLayoutParams) this).leftMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int O() {
            return ((ViewGroup.MarginLayoutParams) this).topMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void T(int i10) {
            this.f21885j = i10;
        }

        @Override // com.google.android.flexbox.FlexItem
        public float U() {
            return this.f21880e;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int U0() {
            return ((ViewGroup.MarginLayoutParams) this).rightMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int Y0() {
            return this.f21885j;
        }

        @Override // com.google.android.flexbox.FlexItem
        public float Z() {
            return this.f21883h;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int b1() {
            return this.f21887l;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.google.android.flexbox.FlexItem
        public boolean g0() {
            return this.f21888m;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getHeight() {
            return ((ViewGroup.MarginLayoutParams) this).height;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getOrder() {
            return 1;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getWidth() {
            return ((ViewGroup.MarginLayoutParams) this).width;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int m0() {
            return this.f21886k;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void setMinWidth(int i10) {
            this.f21884i = i10;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int w() {
            return this.f21882g;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeFloat(this.f21880e);
            parcel.writeFloat(this.f21881f);
            parcel.writeInt(this.f21882g);
            parcel.writeFloat(this.f21883h);
            parcel.writeInt(this.f21884i);
            parcel.writeInt(this.f21885j);
            parcel.writeInt(this.f21886k);
            parcel.writeInt(this.f21887l);
            parcel.writeByte(this.f21888m ? (byte) 1 : (byte) 0);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).bottomMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).leftMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).rightMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).topMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).height);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).width);
        }

        @Override // com.google.android.flexbox.FlexItem
        public float y() {
            return this.f21881f;
        }

        public LayoutParams(int i10, int i11) {
            super(i10, i11);
            this.f21880e = 0.0f;
            this.f21881f = 1.0f;
            this.f21882g = -1;
            this.f21883h = -1.0f;
            this.f21886k = 16777215;
            this.f21887l = 16777215;
        }

        protected LayoutParams(Parcel parcel) {
            super(-2, -2);
            this.f21880e = 0.0f;
            this.f21881f = 1.0f;
            this.f21882g = -1;
            this.f21883h = -1.0f;
            this.f21886k = 16777215;
            this.f21887l = 16777215;
            this.f21880e = parcel.readFloat();
            this.f21881f = parcel.readFloat();
            this.f21882g = parcel.readInt();
            this.f21883h = parcel.readFloat();
            this.f21884i = parcel.readInt();
            this.f21885j = parcel.readInt();
            this.f21886k = parcel.readInt();
            this.f21887l = parcel.readInt();
            this.f21888m = parcel.readByte() != 0;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).leftMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).rightMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).topMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).height = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).width = parcel.readInt();
        }
    }
}
