package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.Api;
import java.util.List;

/* loaded from: classes.dex */
public class LinearLayoutManager extends RecyclerView.p implements RecyclerView.z.b {
    int A;
    int B;
    private boolean C;
    SavedState D;
    final a E;
    private final b F;
    private int G;
    private int[] H;

    /* renamed from: s  reason: collision with root package name */
    int f3490s;

    /* renamed from: t  reason: collision with root package name */
    private c f3491t;

    /* renamed from: u  reason: collision with root package name */
    j f3492u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f3493v;

    /* renamed from: w  reason: collision with root package name */
    private boolean f3494w;

    /* renamed from: x  reason: collision with root package name */
    boolean f3495x;

    /* renamed from: y  reason: collision with root package name */
    private boolean f3496y;

    /* renamed from: z  reason: collision with root package name */
    private boolean f3497z;

    @SuppressLint({"BanParcelableUsage"})
    /* loaded from: classes.dex */
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        int f3498a;

        /* renamed from: b  reason: collision with root package name */
        int f3499b;

        /* renamed from: c  reason: collision with root package name */
        boolean f3500c;

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

        public SavedState() {
        }

        boolean c() {
            return this.f3498a >= 0;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        void e() {
            this.f3498a = -1;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f3498a);
            parcel.writeInt(this.f3499b);
            parcel.writeInt(this.f3500c ? 1 : 0);
        }

        SavedState(Parcel parcel) {
            this.f3498a = parcel.readInt();
            this.f3499b = parcel.readInt();
            this.f3500c = parcel.readInt() == 1;
        }

        public SavedState(SavedState savedState) {
            this.f3498a = savedState.f3498a;
            this.f3499b = savedState.f3499b;
            this.f3500c = savedState.f3500c;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        j f3501a;

        /* renamed from: b  reason: collision with root package name */
        int f3502b;

        /* renamed from: c  reason: collision with root package name */
        int f3503c;

        /* renamed from: d  reason: collision with root package name */
        boolean f3504d;

        /* renamed from: e  reason: collision with root package name */
        boolean f3505e;

        a() {
            e();
        }

        void a() {
            int m10;
            if (this.f3504d) {
                m10 = this.f3501a.i();
            } else {
                m10 = this.f3501a.m();
            }
            this.f3503c = m10;
        }

        public void b(View view, int i10) {
            if (this.f3504d) {
                this.f3503c = this.f3501a.d(view) + this.f3501a.o();
            } else {
                this.f3503c = this.f3501a.g(view);
            }
            this.f3502b = i10;
        }

        public void c(View view, int i10) {
            int o10 = this.f3501a.o();
            if (o10 >= 0) {
                b(view, i10);
                return;
            }
            this.f3502b = i10;
            if (this.f3504d) {
                int i11 = (this.f3501a.i() - o10) - this.f3501a.d(view);
                this.f3503c = this.f3501a.i() - i11;
                if (i11 > 0) {
                    int e10 = this.f3503c - this.f3501a.e(view);
                    int m10 = this.f3501a.m();
                    int min = e10 - (m10 + Math.min(this.f3501a.g(view) - m10, 0));
                    if (min < 0) {
                        this.f3503c += Math.min(i11, -min);
                        return;
                    }
                    return;
                }
                return;
            }
            int g10 = this.f3501a.g(view);
            int m11 = g10 - this.f3501a.m();
            this.f3503c = g10;
            if (m11 > 0) {
                int i12 = (this.f3501a.i() - Math.min(0, (this.f3501a.i() - o10) - this.f3501a.d(view))) - (g10 + this.f3501a.e(view));
                if (i12 < 0) {
                    this.f3503c -= Math.min(m11, -i12);
                }
            }
        }

        boolean d(View view, RecyclerView.a0 a0Var) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return !qVar.f() && qVar.c() >= 0 && qVar.c() < a0Var.b();
        }

        void e() {
            this.f3502b = -1;
            this.f3503c = RecyclerView.UNDEFINED_DURATION;
            this.f3504d = false;
            this.f3505e = false;
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.f3502b + ", mCoordinate=" + this.f3503c + ", mLayoutFromEnd=" + this.f3504d + ", mValid=" + this.f3505e + '}';
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public int f3506a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f3507b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f3508c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f3509d;

        protected b() {
        }

        void a() {
            this.f3506a = 0;
            this.f3507b = false;
            this.f3508c = false;
            this.f3509d = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: b  reason: collision with root package name */
        int f3511b;

        /* renamed from: c  reason: collision with root package name */
        int f3512c;

        /* renamed from: d  reason: collision with root package name */
        int f3513d;

        /* renamed from: e  reason: collision with root package name */
        int f3514e;

        /* renamed from: f  reason: collision with root package name */
        int f3515f;

        /* renamed from: g  reason: collision with root package name */
        int f3516g;

        /* renamed from: j  reason: collision with root package name */
        boolean f3519j;

        /* renamed from: k  reason: collision with root package name */
        int f3520k;

        /* renamed from: m  reason: collision with root package name */
        boolean f3522m;

        /* renamed from: a  reason: collision with root package name */
        boolean f3510a = true;

        /* renamed from: h  reason: collision with root package name */
        int f3517h = 0;

        /* renamed from: i  reason: collision with root package name */
        int f3518i = 0;

        /* renamed from: l  reason: collision with root package name */
        List<RecyclerView.d0> f3521l = null;

        c() {
        }

        private View e() {
            int size = this.f3521l.size();
            for (int i10 = 0; i10 < size; i10++) {
                View view = this.f3521l.get(i10).itemView;
                RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
                if (!qVar.f() && this.f3513d == qVar.c()) {
                    b(view);
                    return view;
                }
            }
            return null;
        }

        public void a() {
            b(null);
        }

        public void b(View view) {
            View f10 = f(view);
            if (f10 == null) {
                this.f3513d = -1;
            } else {
                this.f3513d = ((RecyclerView.q) f10.getLayoutParams()).c();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean c(RecyclerView.a0 a0Var) {
            int i10 = this.f3513d;
            return i10 >= 0 && i10 < a0Var.b();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public View d(RecyclerView.w wVar) {
            if (this.f3521l != null) {
                return e();
            }
            View o10 = wVar.o(this.f3513d);
            this.f3513d += this.f3514e;
            return o10;
        }

        public View f(View view) {
            int c10;
            int size = this.f3521l.size();
            View view2 = null;
            int i10 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            for (int i11 = 0; i11 < size; i11++) {
                View view3 = this.f3521l.get(i11).itemView;
                RecyclerView.q qVar = (RecyclerView.q) view3.getLayoutParams();
                if (view3 != view && !qVar.f() && (c10 = (qVar.c() - this.f3513d) * this.f3514e) >= 0 && c10 < i10) {
                    view2 = view3;
                    if (c10 == 0) {
                        break;
                    }
                    i10 = c10;
                }
            }
            return view2;
        }
    }

    public LinearLayoutManager(Context context) {
        this(context, 1, false);
    }

    private void A2(RecyclerView.w wVar, int i10, int i11) {
        if (i10 == i11) {
            return;
        }
        if (i11 <= i10) {
            while (i10 > i11) {
                v1(i10, wVar);
                i10--;
            }
            return;
        }
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            v1(i12, wVar);
        }
    }

    private void B2(RecyclerView.w wVar, int i10, int i11) {
        int T = T();
        if (i10 < 0) {
            return;
        }
        int h10 = (this.f3492u.h() - i10) + i11;
        if (this.f3495x) {
            for (int i12 = 0; i12 < T; i12++) {
                View S = S(i12);
                if (this.f3492u.g(S) < h10 || this.f3492u.q(S) < h10) {
                    A2(wVar, 0, i12);
                    return;
                }
            }
            return;
        }
        int i13 = T - 1;
        for (int i14 = i13; i14 >= 0; i14--) {
            View S2 = S(i14);
            if (this.f3492u.g(S2) < h10 || this.f3492u.q(S2) < h10) {
                A2(wVar, i13, i14);
                return;
            }
        }
    }

    private void C2(RecyclerView.w wVar, int i10, int i11) {
        if (i10 < 0) {
            return;
        }
        int i12 = i10 - i11;
        int T = T();
        if (!this.f3495x) {
            for (int i13 = 0; i13 < T; i13++) {
                View S = S(i13);
                if (this.f3492u.d(S) > i12 || this.f3492u.p(S) > i12) {
                    A2(wVar, 0, i13);
                    return;
                }
            }
            return;
        }
        int i14 = T - 1;
        for (int i15 = i14; i15 >= 0; i15--) {
            View S2 = S(i15);
            if (this.f3492u.d(S2) > i12 || this.f3492u.p(S2) > i12) {
                A2(wVar, i14, i15);
                return;
            }
        }
    }

    private void E2() {
        if (this.f3490s != 1 && u2()) {
            this.f3495x = !this.f3494w;
        } else {
            this.f3495x = this.f3494w;
        }
    }

    private boolean J2(RecyclerView.w wVar, RecyclerView.a0 a0Var, a aVar) {
        View n22;
        boolean z10 = false;
        if (T() == 0) {
            return false;
        }
        View f02 = f0();
        if (f02 != null && aVar.d(f02, a0Var)) {
            aVar.c(f02, n0(f02));
            return true;
        }
        boolean z11 = this.f3493v;
        boolean z12 = this.f3496y;
        if (z11 == z12 && (n22 = n2(wVar, a0Var, aVar.f3504d, z12)) != null) {
            aVar.b(n22, n0(n22));
            if (!a0Var.e() && T1()) {
                int g10 = this.f3492u.g(n22);
                int d10 = this.f3492u.d(n22);
                int m10 = this.f3492u.m();
                int i10 = this.f3492u.i();
                boolean z13 = d10 <= m10 && g10 < m10;
                if (g10 >= i10 && d10 > i10) {
                    z10 = true;
                }
                if (z13 || z10) {
                    if (aVar.f3504d) {
                        m10 = i10;
                    }
                    aVar.f3503c = m10;
                }
            }
            return true;
        }
        return false;
    }

    private boolean K2(RecyclerView.a0 a0Var, a aVar) {
        int i10;
        int g10;
        if (!a0Var.e() && (i10 = this.A) != -1) {
            if (i10 >= 0 && i10 < a0Var.b()) {
                aVar.f3502b = this.A;
                SavedState savedState = this.D;
                if (savedState != null && savedState.c()) {
                    boolean z10 = this.D.f3500c;
                    aVar.f3504d = z10;
                    if (z10) {
                        aVar.f3503c = this.f3492u.i() - this.D.f3499b;
                    } else {
                        aVar.f3503c = this.f3492u.m() + this.D.f3499b;
                    }
                    return true;
                } else if (this.B == Integer.MIN_VALUE) {
                    View M = M(this.A);
                    if (M != null) {
                        if (this.f3492u.e(M) > this.f3492u.n()) {
                            aVar.a();
                            return true;
                        } else if (this.f3492u.g(M) - this.f3492u.m() < 0) {
                            aVar.f3503c = this.f3492u.m();
                            aVar.f3504d = false;
                            return true;
                        } else if (this.f3492u.i() - this.f3492u.d(M) < 0) {
                            aVar.f3503c = this.f3492u.i();
                            aVar.f3504d = true;
                            return true;
                        } else {
                            if (aVar.f3504d) {
                                g10 = this.f3492u.d(M) + this.f3492u.o();
                            } else {
                                g10 = this.f3492u.g(M);
                            }
                            aVar.f3503c = g10;
                        }
                    } else {
                        if (T() > 0) {
                            aVar.f3504d = (this.A < n0(S(0))) == this.f3495x;
                        }
                        aVar.a();
                    }
                    return true;
                } else {
                    boolean z11 = this.f3495x;
                    aVar.f3504d = z11;
                    if (z11) {
                        aVar.f3503c = this.f3492u.i() - this.B;
                    } else {
                        aVar.f3503c = this.f3492u.m() + this.B;
                    }
                    return true;
                }
            }
            this.A = -1;
            this.B = RecyclerView.UNDEFINED_DURATION;
        }
        return false;
    }

    private void L2(RecyclerView.w wVar, RecyclerView.a0 a0Var, a aVar) {
        if (K2(a0Var, aVar) || J2(wVar, a0Var, aVar)) {
            return;
        }
        aVar.a();
        aVar.f3502b = this.f3496y ? a0Var.b() - 1 : 0;
    }

    private void M2(int i10, int i11, boolean z10, RecyclerView.a0 a0Var) {
        int m10;
        this.f3491t.f3522m = D2();
        this.f3491t.f3515f = i10;
        int[] iArr = this.H;
        iArr[0] = 0;
        iArr[1] = 0;
        U1(a0Var, iArr);
        int max = Math.max(0, this.H[0]);
        int max2 = Math.max(0, this.H[1]);
        boolean z11 = i10 == 1;
        c cVar = this.f3491t;
        int i12 = z11 ? max2 : max;
        cVar.f3517h = i12;
        if (!z11) {
            max = max2;
        }
        cVar.f3518i = max;
        if (z11) {
            cVar.f3517h = i12 + this.f3492u.j();
            View q22 = q2();
            c cVar2 = this.f3491t;
            cVar2.f3514e = this.f3495x ? -1 : 1;
            int n02 = n0(q22);
            c cVar3 = this.f3491t;
            cVar2.f3513d = n02 + cVar3.f3514e;
            cVar3.f3511b = this.f3492u.d(q22);
            m10 = this.f3492u.d(q22) - this.f3492u.i();
        } else {
            View r22 = r2();
            this.f3491t.f3517h += this.f3492u.m();
            c cVar4 = this.f3491t;
            cVar4.f3514e = this.f3495x ? 1 : -1;
            int n03 = n0(r22);
            c cVar5 = this.f3491t;
            cVar4.f3513d = n03 + cVar5.f3514e;
            cVar5.f3511b = this.f3492u.g(r22);
            m10 = (-this.f3492u.g(r22)) + this.f3492u.m();
        }
        c cVar6 = this.f3491t;
        cVar6.f3512c = i11;
        if (z10) {
            cVar6.f3512c = i11 - m10;
        }
        cVar6.f3516g = m10;
    }

    private void N2(int i10, int i11) {
        this.f3491t.f3512c = this.f3492u.i() - i11;
        c cVar = this.f3491t;
        cVar.f3514e = this.f3495x ? -1 : 1;
        cVar.f3513d = i10;
        cVar.f3515f = 1;
        cVar.f3511b = i11;
        cVar.f3516g = RecyclerView.UNDEFINED_DURATION;
    }

    private void O2(a aVar) {
        N2(aVar.f3502b, aVar.f3503c);
    }

    private void P2(int i10, int i11) {
        this.f3491t.f3512c = i11 - this.f3492u.m();
        c cVar = this.f3491t;
        cVar.f3513d = i10;
        cVar.f3514e = this.f3495x ? 1 : -1;
        cVar.f3515f = -1;
        cVar.f3511b = i11;
        cVar.f3516g = RecyclerView.UNDEFINED_DURATION;
    }

    private void Q2(a aVar) {
        P2(aVar.f3502b, aVar.f3503c);
    }

    private int W1(RecyclerView.a0 a0Var) {
        if (T() == 0) {
            return 0;
        }
        b2();
        return m.a(a0Var, this.f3492u, f2(!this.f3497z, true), e2(!this.f3497z, true), this, this.f3497z);
    }

    private int X1(RecyclerView.a0 a0Var) {
        if (T() == 0) {
            return 0;
        }
        b2();
        return m.b(a0Var, this.f3492u, f2(!this.f3497z, true), e2(!this.f3497z, true), this, this.f3497z, this.f3495x);
    }

    private int Y1(RecyclerView.a0 a0Var) {
        if (T() == 0) {
            return 0;
        }
        b2();
        return m.c(a0Var, this.f3492u, f2(!this.f3497z, true), e2(!this.f3497z, true), this, this.f3497z);
    }

    private View d2() {
        return j2(0, T());
    }

    private View h2() {
        return j2(T() - 1, -1);
    }

    private View l2() {
        return this.f3495x ? d2() : h2();
    }

    private View m2() {
        return this.f3495x ? h2() : d2();
    }

    private int o2(int i10, RecyclerView.w wVar, RecyclerView.a0 a0Var, boolean z10) {
        int i11;
        int i12 = this.f3492u.i() - i10;
        if (i12 > 0) {
            int i13 = -F2(-i12, wVar, a0Var);
            int i14 = i10 + i13;
            if (!z10 || (i11 = this.f3492u.i() - i14) <= 0) {
                return i13;
            }
            this.f3492u.r(i11);
            return i11 + i13;
        }
        return 0;
    }

    private int p2(int i10, RecyclerView.w wVar, RecyclerView.a0 a0Var, boolean z10) {
        int m10;
        int m11 = i10 - this.f3492u.m();
        if (m11 > 0) {
            int i11 = -F2(m11, wVar, a0Var);
            int i12 = i10 + i11;
            if (!z10 || (m10 = i12 - this.f3492u.m()) <= 0) {
                return i11;
            }
            this.f3492u.r(-m10);
            return i11 - m10;
        }
        return 0;
    }

    private View q2() {
        return S(this.f3495x ? 0 : T() - 1);
    }

    private View r2() {
        return S(this.f3495x ? T() - 1 : 0);
    }

    private void x2(RecyclerView.w wVar, RecyclerView.a0 a0Var, int i10, int i11) {
        if (!a0Var.g() || T() == 0 || a0Var.e() || !T1()) {
            return;
        }
        List<RecyclerView.d0> k10 = wVar.k();
        int size = k10.size();
        int n02 = n0(S(0));
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < size; i14++) {
            RecyclerView.d0 d0Var = k10.get(i14);
            if (!d0Var.isRemoved()) {
                if (((d0Var.getLayoutPosition() < n02) != this.f3495x ? (char) 65535 : (char) 1) == 65535) {
                    i12 += this.f3492u.e(d0Var.itemView);
                } else {
                    i13 += this.f3492u.e(d0Var.itemView);
                }
            }
        }
        this.f3491t.f3521l = k10;
        if (i12 > 0) {
            P2(n0(r2()), i10);
            c cVar = this.f3491t;
            cVar.f3517h = i12;
            cVar.f3512c = 0;
            cVar.a();
            c2(wVar, this.f3491t, a0Var, false);
        }
        if (i13 > 0) {
            N2(n0(q2()), i11);
            c cVar2 = this.f3491t;
            cVar2.f3517h = i13;
            cVar2.f3512c = 0;
            cVar2.a();
            c2(wVar, this.f3491t, a0Var, false);
        }
        this.f3491t.f3521l = null;
    }

    private void z2(RecyclerView.w wVar, c cVar) {
        if (!cVar.f3510a || cVar.f3522m) {
            return;
        }
        int i10 = cVar.f3516g;
        int i11 = cVar.f3518i;
        if (cVar.f3515f == -1) {
            B2(wVar, i10, i11);
        } else {
            C2(wVar, i10, i11);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int A(RecyclerView.a0 a0Var) {
        return W1(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int B(RecyclerView.a0 a0Var) {
        return X1(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int C(RecyclerView.a0 a0Var) {
        return Y1(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int D(RecyclerView.a0 a0Var) {
        return W1(a0Var);
    }

    boolean D2() {
        return this.f3492u.k() == 0 && this.f3492u.h() == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int E(RecyclerView.a0 a0Var) {
        return X1(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int E1(int i10, RecyclerView.w wVar, RecyclerView.a0 a0Var) {
        if (this.f3490s == 1) {
            return 0;
        }
        return F2(i10, wVar, a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int F(RecyclerView.a0 a0Var) {
        return Y1(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void F1(int i10) {
        this.A = i10;
        this.B = RecyclerView.UNDEFINED_DURATION;
        SavedState savedState = this.D;
        if (savedState != null) {
            savedState.e();
        }
        B1();
    }

    int F2(int i10, RecyclerView.w wVar, RecyclerView.a0 a0Var) {
        if (T() == 0 || i10 == 0) {
            return 0;
        }
        b2();
        this.f3491t.f3510a = true;
        int i11 = i10 > 0 ? 1 : -1;
        int abs = Math.abs(i10);
        M2(i11, abs, true, a0Var);
        c cVar = this.f3491t;
        int c22 = cVar.f3516g + c2(wVar, cVar, a0Var, false);
        if (c22 < 0) {
            return 0;
        }
        if (abs > c22) {
            i10 = i11 * c22;
        }
        this.f3492u.r(-i10);
        this.f3491t.f3520k = i10;
        return i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int G1(int i10, RecyclerView.w wVar, RecyclerView.a0 a0Var) {
        if (this.f3490s == 0) {
            return 0;
        }
        return F2(i10, wVar, a0Var);
    }

    public void G2(int i10) {
        if (i10 != 0 && i10 != 1) {
            throw new IllegalArgumentException("invalid orientation:" + i10);
        }
        q(null);
        if (i10 != this.f3490s || this.f3492u == null) {
            j b10 = j.b(this, i10);
            this.f3492u = b10;
            this.E.f3501a = b10;
            this.f3490s = i10;
            B1();
        }
    }

    public void H2(boolean z10) {
        q(null);
        if (z10 == this.f3494w) {
            return;
        }
        this.f3494w = z10;
        B1();
    }

    public void I2(boolean z10) {
        q(null);
        if (this.f3496y == z10) {
            return;
        }
        this.f3496y = z10;
        B1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public View M(int i10) {
        int T = T();
        if (T == 0) {
            return null;
        }
        int n02 = i10 - n0(S(0));
        if (n02 >= 0 && n02 < T) {
            View S = S(n02);
            if (n0(S) == i10) {
                return S;
            }
        }
        return super.M(i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q N() {
        return new RecyclerView.q(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    boolean O1() {
        return (h0() == 1073741824 || v0() == 1073741824 || !w0()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void P0(RecyclerView recyclerView, RecyclerView.w wVar) {
        super.P0(recyclerView, wVar);
        if (this.C) {
            s1(wVar);
            wVar.c();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public View Q0(View view, int i10, RecyclerView.w wVar, RecyclerView.a0 a0Var) {
        int Z1;
        View l22;
        View q22;
        E2();
        if (T() == 0 || (Z1 = Z1(i10)) == Integer.MIN_VALUE) {
            return null;
        }
        b2();
        M2(Z1, (int) (this.f3492u.n() * 0.33333334f), false, a0Var);
        c cVar = this.f3491t;
        cVar.f3516g = RecyclerView.UNDEFINED_DURATION;
        cVar.f3510a = false;
        c2(wVar, cVar, a0Var, true);
        if (Z1 == -1) {
            l22 = m2();
        } else {
            l22 = l2();
        }
        if (Z1 == -1) {
            q22 = r2();
        } else {
            q22 = q2();
        }
        if (q22.hasFocusable()) {
            if (l22 == null) {
                return null;
            }
            return q22;
        }
        return l22;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void Q1(RecyclerView recyclerView, RecyclerView.a0 a0Var, int i10) {
        g gVar = new g(recyclerView.getContext());
        gVar.p(i10);
        R1(gVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void R0(AccessibilityEvent accessibilityEvent) {
        super.R0(accessibilityEvent);
        if (T() > 0) {
            accessibilityEvent.setFromIndex(g2());
            accessibilityEvent.setToIndex(i2());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean T1() {
        return this.D == null && this.f3493v == this.f3496y;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void U1(RecyclerView.a0 a0Var, int[] iArr) {
        int i10;
        int s22 = s2(a0Var);
        if (this.f3491t.f3515f == -1) {
            i10 = 0;
        } else {
            i10 = s22;
            s22 = 0;
        }
        iArr[0] = s22;
        iArr[1] = i10;
    }

    void V1(RecyclerView.a0 a0Var, c cVar, RecyclerView.p.c cVar2) {
        int i10 = cVar.f3513d;
        if (i10 < 0 || i10 >= a0Var.b()) {
            return;
        }
        cVar2.a(i10, Math.max(0, cVar.f3516g));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int Z1(int i10) {
        if (i10 == 1) {
            return (this.f3490s != 1 && u2()) ? 1 : -1;
        } else if (i10 == 2) {
            return (this.f3490s != 1 && u2()) ? -1 : 1;
        } else if (i10 == 17) {
            if (this.f3490s == 0) {
                return -1;
            }
            return RecyclerView.UNDEFINED_DURATION;
        } else if (i10 == 33) {
            if (this.f3490s == 1) {
                return -1;
            }
            return RecyclerView.UNDEFINED_DURATION;
        } else if (i10 != 66) {
            if (i10 == 130 && this.f3490s == 1) {
                return 1;
            }
            return RecyclerView.UNDEFINED_DURATION;
        } else if (this.f3490s == 0) {
            return 1;
        } else {
            return RecyclerView.UNDEFINED_DURATION;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.z.b
    public PointF a(int i10) {
        if (T() == 0) {
            return null;
        }
        int i11 = (i10 < n0(S(0))) != this.f3495x ? -1 : 1;
        if (this.f3490s == 0) {
            return new PointF(i11, 0.0f);
        }
        return new PointF(0.0f, i11);
    }

    c a2() {
        return new c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b2() {
        if (this.f3491t == null) {
            this.f3491t = a2();
        }
    }

    int c2(RecyclerView.w wVar, c cVar, RecyclerView.a0 a0Var, boolean z10) {
        int i10 = cVar.f3512c;
        int i11 = cVar.f3516g;
        if (i11 != Integer.MIN_VALUE) {
            if (i10 < 0) {
                cVar.f3516g = i11 + i10;
            }
            z2(wVar, cVar);
        }
        int i12 = cVar.f3512c + cVar.f3517h;
        b bVar = this.F;
        while (true) {
            if ((!cVar.f3522m && i12 <= 0) || !cVar.c(a0Var)) {
                break;
            }
            bVar.a();
            w2(wVar, a0Var, cVar, bVar);
            if (!bVar.f3507b) {
                cVar.f3511b += bVar.f3506a * cVar.f3515f;
                if (!bVar.f3508c || cVar.f3521l != null || !a0Var.e()) {
                    int i13 = cVar.f3512c;
                    int i14 = bVar.f3506a;
                    cVar.f3512c = i13 - i14;
                    i12 -= i14;
                }
                int i15 = cVar.f3516g;
                if (i15 != Integer.MIN_VALUE) {
                    int i16 = i15 + bVar.f3506a;
                    cVar.f3516g = i16;
                    int i17 = cVar.f3512c;
                    if (i17 < 0) {
                        cVar.f3516g = i16 + i17;
                    }
                    z2(wVar, cVar);
                }
                if (z10 && bVar.f3509d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i10 - cVar.f3512c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void e1(RecyclerView.w wVar, RecyclerView.a0 a0Var) {
        int i10;
        int i11;
        int i12;
        int i13;
        int o22;
        int i14;
        View M;
        int g10;
        int i15;
        int i16 = -1;
        if ((this.D != null || this.A != -1) && a0Var.b() == 0) {
            s1(wVar);
            return;
        }
        SavedState savedState = this.D;
        if (savedState != null && savedState.c()) {
            this.A = this.D.f3498a;
        }
        b2();
        this.f3491t.f3510a = false;
        E2();
        View f02 = f0();
        a aVar = this.E;
        if (aVar.f3505e && this.A == -1 && this.D == null) {
            if (f02 != null && (this.f3492u.g(f02) >= this.f3492u.i() || this.f3492u.d(f02) <= this.f3492u.m())) {
                this.E.c(f02, n0(f02));
            }
        } else {
            aVar.e();
            a aVar2 = this.E;
            aVar2.f3504d = this.f3495x ^ this.f3496y;
            L2(wVar, a0Var, aVar2);
            this.E.f3505e = true;
        }
        c cVar = this.f3491t;
        cVar.f3515f = cVar.f3520k >= 0 ? 1 : -1;
        int[] iArr = this.H;
        iArr[0] = 0;
        iArr[1] = 0;
        U1(a0Var, iArr);
        int max = Math.max(0, this.H[0]) + this.f3492u.m();
        int max2 = Math.max(0, this.H[1]) + this.f3492u.j();
        if (a0Var.e() && (i14 = this.A) != -1 && this.B != Integer.MIN_VALUE && (M = M(i14)) != null) {
            if (this.f3495x) {
                i15 = this.f3492u.i() - this.f3492u.d(M);
                g10 = this.B;
            } else {
                g10 = this.f3492u.g(M) - this.f3492u.m();
                i15 = this.B;
            }
            int i17 = i15 - g10;
            if (i17 > 0) {
                max += i17;
            } else {
                max2 -= i17;
            }
        }
        a aVar3 = this.E;
        if (!aVar3.f3504d ? !this.f3495x : this.f3495x) {
            i16 = 1;
        }
        y2(wVar, a0Var, aVar3, i16);
        G(wVar);
        this.f3491t.f3522m = D2();
        this.f3491t.f3519j = a0Var.e();
        this.f3491t.f3518i = 0;
        a aVar4 = this.E;
        if (aVar4.f3504d) {
            Q2(aVar4);
            c cVar2 = this.f3491t;
            cVar2.f3517h = max;
            c2(wVar, cVar2, a0Var, false);
            c cVar3 = this.f3491t;
            i11 = cVar3.f3511b;
            int i18 = cVar3.f3513d;
            int i19 = cVar3.f3512c;
            if (i19 > 0) {
                max2 += i19;
            }
            O2(this.E);
            c cVar4 = this.f3491t;
            cVar4.f3517h = max2;
            cVar4.f3513d += cVar4.f3514e;
            c2(wVar, cVar4, a0Var, false);
            c cVar5 = this.f3491t;
            i10 = cVar5.f3511b;
            int i20 = cVar5.f3512c;
            if (i20 > 0) {
                P2(i18, i11);
                c cVar6 = this.f3491t;
                cVar6.f3517h = i20;
                c2(wVar, cVar6, a0Var, false);
                i11 = this.f3491t.f3511b;
            }
        } else {
            O2(aVar4);
            c cVar7 = this.f3491t;
            cVar7.f3517h = max2;
            c2(wVar, cVar7, a0Var, false);
            c cVar8 = this.f3491t;
            i10 = cVar8.f3511b;
            int i21 = cVar8.f3513d;
            int i22 = cVar8.f3512c;
            if (i22 > 0) {
                max += i22;
            }
            Q2(this.E);
            c cVar9 = this.f3491t;
            cVar9.f3517h = max;
            cVar9.f3513d += cVar9.f3514e;
            c2(wVar, cVar9, a0Var, false);
            c cVar10 = this.f3491t;
            i11 = cVar10.f3511b;
            int i23 = cVar10.f3512c;
            if (i23 > 0) {
                N2(i21, i10);
                c cVar11 = this.f3491t;
                cVar11.f3517h = i23;
                c2(wVar, cVar11, a0Var, false);
                i10 = this.f3491t.f3511b;
            }
        }
        if (T() > 0) {
            if (this.f3495x ^ this.f3496y) {
                int o23 = o2(i10, wVar, a0Var, true);
                i12 = i11 + o23;
                i13 = i10 + o23;
                o22 = p2(i12, wVar, a0Var, false);
            } else {
                int p22 = p2(i11, wVar, a0Var, true);
                i12 = i11 + p22;
                i13 = i10 + p22;
                o22 = o2(i13, wVar, a0Var, false);
            }
            i11 = i12 + o22;
            i10 = i13 + o22;
        }
        x2(wVar, a0Var, i11, i10);
        if (!a0Var.e()) {
            this.f3492u.s();
        } else {
            this.E.e();
        }
        this.f3493v = this.f3496y;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public View e2(boolean z10, boolean z11) {
        if (this.f3495x) {
            return k2(0, T(), z10, z11);
        }
        return k2(T() - 1, -1, z10, z11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void f1(RecyclerView.a0 a0Var) {
        super.f1(a0Var);
        this.D = null;
        this.A = -1;
        this.B = RecyclerView.UNDEFINED_DURATION;
        this.E.e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public View f2(boolean z10, boolean z11) {
        if (this.f3495x) {
            return k2(T() - 1, -1, z10, z11);
        }
        return k2(0, T(), z10, z11);
    }

    public int g2() {
        View k22 = k2(0, T(), false, true);
        if (k22 == null) {
            return -1;
        }
        return n0(k22);
    }

    public int i2() {
        View k22 = k2(T() - 1, -1, false, true);
        if (k22 == null) {
            return -1;
        }
        return n0(k22);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void j1(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.D = savedState;
            if (this.A != -1) {
                savedState.e();
            }
            B1();
        }
    }

    View j2(int i10, int i11) {
        int i12;
        int i13;
        b2();
        if ((i11 > i10 ? (char) 1 : i11 < i10 ? (char) 65535 : (char) 0) == 0) {
            return S(i10);
        }
        if (this.f3492u.g(S(i10)) < this.f3492u.m()) {
            i12 = 16644;
            i13 = 16388;
        } else {
            i12 = 4161;
            i13 = 4097;
        }
        if (this.f3490s == 0) {
            return this.f3570e.a(i10, i11, i12, i13);
        }
        return this.f3571f.a(i10, i11, i12, i13);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public Parcelable k1() {
        if (this.D != null) {
            return new SavedState(this.D);
        }
        SavedState savedState = new SavedState();
        if (T() > 0) {
            b2();
            boolean z10 = this.f3493v ^ this.f3495x;
            savedState.f3500c = z10;
            if (z10) {
                View q22 = q2();
                savedState.f3499b = this.f3492u.i() - this.f3492u.d(q22);
                savedState.f3498a = n0(q22);
            } else {
                View r22 = r2();
                savedState.f3498a = n0(r22);
                savedState.f3499b = this.f3492u.g(r22) - this.f3492u.m();
            }
        } else {
            savedState.e();
        }
        return savedState;
    }

    View k2(int i10, int i11, boolean z10, boolean z11) {
        b2();
        int i12 = z10 ? 24579 : 320;
        int i13 = z11 ? 320 : 0;
        if (this.f3490s == 0) {
            return this.f3570e.a(i10, i11, i12, i13);
        }
        return this.f3571f.a(i10, i11, i12, i13);
    }

    View n2(RecyclerView.w wVar, RecyclerView.a0 a0Var, boolean z10, boolean z11) {
        int i10;
        int i11;
        b2();
        int T = T();
        int i12 = -1;
        if (z11) {
            i10 = T() - 1;
            i11 = -1;
        } else {
            i12 = T;
            i10 = 0;
            i11 = 1;
        }
        int b10 = a0Var.b();
        int m10 = this.f3492u.m();
        int i13 = this.f3492u.i();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (i10 != i12) {
            View S = S(i10);
            int n02 = n0(S);
            int g10 = this.f3492u.g(S);
            int d10 = this.f3492u.d(S);
            if (n02 >= 0 && n02 < b10) {
                if (!((RecyclerView.q) S.getLayoutParams()).f()) {
                    boolean z12 = d10 <= m10 && g10 < m10;
                    boolean z13 = g10 >= i13 && d10 > i13;
                    if (!z12 && !z13) {
                        return S;
                    }
                    if (z10) {
                        if (!z13) {
                            if (view != null) {
                            }
                            view = S;
                        }
                        view2 = S;
                    } else {
                        if (!z12) {
                            if (view != null) {
                            }
                            view = S;
                        }
                        view2 = S;
                    }
                } else if (view3 == null) {
                    view3 = S;
                }
            }
            i10 += i11;
        }
        return view != null ? view : view2 != null ? view2 : view3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void q(String str) {
        if (this.D == null) {
            super.q(str);
        }
    }

    @Deprecated
    protected int s2(RecyclerView.a0 a0Var) {
        if (a0Var.d()) {
            return this.f3492u.n();
        }
        return 0;
    }

    public int t2() {
        return this.f3490s;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean u() {
        return this.f3490s == 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean u2() {
        return j0() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean v() {
        return this.f3490s == 1;
    }

    public boolean v2() {
        return this.f3497z;
    }

    void w2(RecyclerView.w wVar, RecyclerView.a0 a0Var, c cVar, b bVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        int f10;
        View d10 = cVar.d(wVar);
        if (d10 == null) {
            bVar.f3507b = true;
            return;
        }
        RecyclerView.q qVar = (RecyclerView.q) d10.getLayoutParams();
        if (cVar.f3521l == null) {
            if (this.f3495x == (cVar.f3515f == -1)) {
                n(d10);
            } else {
                o(d10, 0);
            }
        } else {
            if (this.f3495x == (cVar.f3515f == -1)) {
                l(d10);
            } else {
                m(d10, 0);
            }
        }
        H0(d10, 0, 0);
        bVar.f3506a = this.f3492u.e(d10);
        if (this.f3490s == 1) {
            if (u2()) {
                f10 = u0() - getPaddingRight();
                i13 = f10 - this.f3492u.f(d10);
            } else {
                i13 = getPaddingLeft();
                f10 = this.f3492u.f(d10) + i13;
            }
            if (cVar.f3515f == -1) {
                int i14 = cVar.f3511b;
                i12 = i14;
                i11 = f10;
                i10 = i14 - bVar.f3506a;
            } else {
                int i15 = cVar.f3511b;
                i10 = i15;
                i11 = f10;
                i12 = bVar.f3506a + i15;
            }
        } else {
            int paddingTop = getPaddingTop();
            int f11 = this.f3492u.f(d10) + paddingTop;
            if (cVar.f3515f == -1) {
                int i16 = cVar.f3511b;
                i11 = i16;
                i10 = paddingTop;
                i12 = f11;
                i13 = i16 - bVar.f3506a;
            } else {
                int i17 = cVar.f3511b;
                i10 = paddingTop;
                i11 = bVar.f3506a + i17;
                i12 = f11;
                i13 = i17;
            }
        }
        G0(d10, i13, i10, i11, i12);
        if (qVar.f() || qVar.e()) {
            bVar.f3508c = true;
        }
        bVar.f3509d = d10.hasFocusable();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void y(int i10, int i11, RecyclerView.a0 a0Var, RecyclerView.p.c cVar) {
        if (this.f3490s != 0) {
            i10 = i11;
        }
        if (T() == 0 || i10 == 0) {
            return;
        }
        b2();
        M2(i10 > 0 ? 1 : -1, Math.abs(i10), true, a0Var);
        V1(a0Var, this.f3491t, cVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean y0() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void y2(RecyclerView.w wVar, RecyclerView.a0 a0Var, a aVar, int i10) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void z(int i10, RecyclerView.p.c cVar) {
        boolean z10;
        int i11;
        SavedState savedState = this.D;
        if (savedState != null && savedState.c()) {
            SavedState savedState2 = this.D;
            z10 = savedState2.f3500c;
            i11 = savedState2.f3498a;
        } else {
            E2();
            z10 = this.f3495x;
            i11 = this.A;
            if (i11 == -1) {
                i11 = z10 ? i10 - 1 : 0;
            }
        }
        int i12 = z10 ? -1 : 1;
        for (int i13 = 0; i13 < this.G && i11 >= 0 && i11 < i10; i13++) {
            cVar.a(i11, 0);
            i11 += i12;
        }
    }

    public LinearLayoutManager(Context context, int i10, boolean z10) {
        this.f3490s = 1;
        this.f3494w = false;
        this.f3495x = false;
        this.f3496y = false;
        this.f3497z = true;
        this.A = -1;
        this.B = RecyclerView.UNDEFINED_DURATION;
        this.D = null;
        this.E = new a();
        this.F = new b();
        this.G = 2;
        this.H = new int[2];
        G2(i10);
        H2(z10);
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f3490s = 1;
        this.f3494w = false;
        this.f3495x = false;
        this.f3496y = false;
        this.f3497z = true;
        this.A = -1;
        this.B = RecyclerView.UNDEFINED_DURATION;
        this.D = null;
        this.E = new a();
        this.F = new b();
        this.G = 2;
        this.H = new int[2];
        RecyclerView.p.d o02 = RecyclerView.p.o0(context, attributeSet, i10, i11);
        G2(o02.f3586a);
        H2(o02.f3588c);
        I2(o02.f3589d);
    }
}
