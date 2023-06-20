package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.Api;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends RecyclerView.p implements RecyclerView.z.b {
    private BitSet B;
    private boolean G;
    private boolean H;
    private SavedState I;
    private int J;
    private int[] O;

    /* renamed from: t  reason: collision with root package name */
    d[] f3625t;

    /* renamed from: u  reason: collision with root package name */
    j f3626u;

    /* renamed from: v  reason: collision with root package name */
    j f3627v;

    /* renamed from: w  reason: collision with root package name */
    private int f3628w;

    /* renamed from: x  reason: collision with root package name */
    private int f3629x;

    /* renamed from: y  reason: collision with root package name */
    private final f f3630y;

    /* renamed from: s  reason: collision with root package name */
    private int f3624s = -1;

    /* renamed from: z  reason: collision with root package name */
    boolean f3631z = false;
    boolean A = false;
    int C = -1;
    int D = RecyclerView.UNDEFINED_DURATION;
    LazySpanLookup E = new LazySpanLookup();
    private int F = 2;
    private final Rect K = new Rect();
    private final b L = new b();
    private boolean M = false;
    private boolean N = true;
    private final Runnable P = new a();

    @SuppressLint({"BanParcelableUsage"})
    /* loaded from: classes.dex */
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        int f3638a;

        /* renamed from: b  reason: collision with root package name */
        int f3639b;

        /* renamed from: c  reason: collision with root package name */
        int f3640c;

        /* renamed from: d  reason: collision with root package name */
        int[] f3641d;

        /* renamed from: e  reason: collision with root package name */
        int f3642e;

        /* renamed from: f  reason: collision with root package name */
        int[] f3643f;

        /* renamed from: g  reason: collision with root package name */
        List<LazySpanLookup.FullSpanItem> f3644g;

        /* renamed from: h  reason: collision with root package name */
        boolean f3645h;

        /* renamed from: i  reason: collision with root package name */
        boolean f3646i;

        /* renamed from: j  reason: collision with root package name */
        boolean f3647j;

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

        void c() {
            this.f3641d = null;
            this.f3640c = 0;
            this.f3638a = -1;
            this.f3639b = -1;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        void e() {
            this.f3641d = null;
            this.f3640c = 0;
            this.f3642e = 0;
            this.f3643f = null;
            this.f3644g = null;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f3638a);
            parcel.writeInt(this.f3639b);
            parcel.writeInt(this.f3640c);
            if (this.f3640c > 0) {
                parcel.writeIntArray(this.f3641d);
            }
            parcel.writeInt(this.f3642e);
            if (this.f3642e > 0) {
                parcel.writeIntArray(this.f3643f);
            }
            parcel.writeInt(this.f3645h ? 1 : 0);
            parcel.writeInt(this.f3646i ? 1 : 0);
            parcel.writeInt(this.f3647j ? 1 : 0);
            parcel.writeList(this.f3644g);
        }

        SavedState(Parcel parcel) {
            this.f3638a = parcel.readInt();
            this.f3639b = parcel.readInt();
            int readInt = parcel.readInt();
            this.f3640c = readInt;
            if (readInt > 0) {
                int[] iArr = new int[readInt];
                this.f3641d = iArr;
                parcel.readIntArray(iArr);
            }
            int readInt2 = parcel.readInt();
            this.f3642e = readInt2;
            if (readInt2 > 0) {
                int[] iArr2 = new int[readInt2];
                this.f3643f = iArr2;
                parcel.readIntArray(iArr2);
            }
            this.f3645h = parcel.readInt() == 1;
            this.f3646i = parcel.readInt() == 1;
            this.f3647j = parcel.readInt() == 1;
            this.f3644g = parcel.readArrayList(LazySpanLookup.FullSpanItem.class.getClassLoader());
        }

        public SavedState(SavedState savedState) {
            this.f3640c = savedState.f3640c;
            this.f3638a = savedState.f3638a;
            this.f3639b = savedState.f3639b;
            this.f3641d = savedState.f3641d;
            this.f3642e = savedState.f3642e;
            this.f3643f = savedState.f3643f;
            this.f3645h = savedState.f3645h;
            this.f3646i = savedState.f3646i;
            this.f3647j = savedState.f3647j;
            this.f3644g = savedState.f3644g;
        }
    }

    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            StaggeredGridLayoutManager.this.a2();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b {

        /* renamed from: a  reason: collision with root package name */
        int f3649a;

        /* renamed from: b  reason: collision with root package name */
        int f3650b;

        /* renamed from: c  reason: collision with root package name */
        boolean f3651c;

        /* renamed from: d  reason: collision with root package name */
        boolean f3652d;

        /* renamed from: e  reason: collision with root package name */
        boolean f3653e;

        /* renamed from: f  reason: collision with root package name */
        int[] f3654f;

        b() {
            c();
        }

        void a() {
            this.f3650b = this.f3651c ? StaggeredGridLayoutManager.this.f3626u.i() : StaggeredGridLayoutManager.this.f3626u.m();
        }

        void b(int i10) {
            if (this.f3651c) {
                this.f3650b = StaggeredGridLayoutManager.this.f3626u.i() - i10;
            } else {
                this.f3650b = StaggeredGridLayoutManager.this.f3626u.m() + i10;
            }
        }

        void c() {
            this.f3649a = -1;
            this.f3650b = RecyclerView.UNDEFINED_DURATION;
            this.f3651c = false;
            this.f3652d = false;
            this.f3653e = false;
            int[] iArr = this.f3654f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }

        void d(d[] dVarArr) {
            int length = dVarArr.length;
            int[] iArr = this.f3654f;
            if (iArr == null || iArr.length < length) {
                this.f3654f = new int[StaggeredGridLayoutManager.this.f3625t.length];
            }
            for (int i10 = 0; i10 < length; i10++) {
                this.f3654f[i10] = dVarArr[i10].p(RecyclerView.UNDEFINED_DURATION);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class c extends RecyclerView.q {

        /* renamed from: e  reason: collision with root package name */
        d f3656e;

        /* renamed from: f  reason: collision with root package name */
        boolean f3657f;

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public boolean h() {
            return this.f3657f;
        }

        public c(int i10, int i11) {
            super(i10, i11);
        }

        public c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d {

        /* renamed from: a  reason: collision with root package name */
        ArrayList<View> f3658a = new ArrayList<>();

        /* renamed from: b  reason: collision with root package name */
        int f3659b = RecyclerView.UNDEFINED_DURATION;

        /* renamed from: c  reason: collision with root package name */
        int f3660c = RecyclerView.UNDEFINED_DURATION;

        /* renamed from: d  reason: collision with root package name */
        int f3661d = 0;

        /* renamed from: e  reason: collision with root package name */
        final int f3662e;

        d(int i10) {
            this.f3662e = i10;
        }

        void a(View view) {
            c n10 = n(view);
            n10.f3656e = this;
            this.f3658a.add(view);
            this.f3660c = RecyclerView.UNDEFINED_DURATION;
            if (this.f3658a.size() == 1) {
                this.f3659b = RecyclerView.UNDEFINED_DURATION;
            }
            if (n10.f() || n10.e()) {
                this.f3661d += StaggeredGridLayoutManager.this.f3626u.e(view);
            }
        }

        void b(boolean z10, int i10) {
            int p10;
            if (z10) {
                p10 = l(RecyclerView.UNDEFINED_DURATION);
            } else {
                p10 = p(RecyclerView.UNDEFINED_DURATION);
            }
            e();
            if (p10 == Integer.MIN_VALUE) {
                return;
            }
            if (!z10 || p10 >= StaggeredGridLayoutManager.this.f3626u.i()) {
                if (z10 || p10 <= StaggeredGridLayoutManager.this.f3626u.m()) {
                    if (i10 != Integer.MIN_VALUE) {
                        p10 += i10;
                    }
                    this.f3660c = p10;
                    this.f3659b = p10;
                }
            }
        }

        void c() {
            LazySpanLookup.FullSpanItem f10;
            ArrayList<View> arrayList = this.f3658a;
            View view = arrayList.get(arrayList.size() - 1);
            c n10 = n(view);
            this.f3660c = StaggeredGridLayoutManager.this.f3626u.d(view);
            if (n10.f3657f && (f10 = StaggeredGridLayoutManager.this.E.f(n10.c())) != null && f10.f3635b == 1) {
                this.f3660c += f10.c(this.f3662e);
            }
        }

        void d() {
            LazySpanLookup.FullSpanItem f10;
            View view = this.f3658a.get(0);
            c n10 = n(view);
            this.f3659b = StaggeredGridLayoutManager.this.f3626u.g(view);
            if (n10.f3657f && (f10 = StaggeredGridLayoutManager.this.E.f(n10.c())) != null && f10.f3635b == -1) {
                this.f3659b -= f10.c(this.f3662e);
            }
        }

        void e() {
            this.f3658a.clear();
            q();
            this.f3661d = 0;
        }

        public int f() {
            if (StaggeredGridLayoutManager.this.f3631z) {
                return i(this.f3658a.size() - 1, -1, true);
            }
            return i(0, this.f3658a.size(), true);
        }

        public int g() {
            if (StaggeredGridLayoutManager.this.f3631z) {
                return i(0, this.f3658a.size(), true);
            }
            return i(this.f3658a.size() - 1, -1, true);
        }

        int h(int i10, int i11, boolean z10, boolean z11, boolean z12) {
            int m10 = StaggeredGridLayoutManager.this.f3626u.m();
            int i12 = StaggeredGridLayoutManager.this.f3626u.i();
            int i13 = i11 > i10 ? 1 : -1;
            while (i10 != i11) {
                View view = this.f3658a.get(i10);
                int g10 = StaggeredGridLayoutManager.this.f3626u.g(view);
                int d10 = StaggeredGridLayoutManager.this.f3626u.d(view);
                boolean z13 = false;
                boolean z14 = !z12 ? g10 >= i12 : g10 > i12;
                if (!z12 ? d10 > m10 : d10 >= m10) {
                    z13 = true;
                }
                if (z14 && z13) {
                    if (z10 && z11) {
                        if (g10 >= m10 && d10 <= i12) {
                            return StaggeredGridLayoutManager.this.n0(view);
                        }
                    } else if (z11) {
                        return StaggeredGridLayoutManager.this.n0(view);
                    } else {
                        if (g10 < m10 || d10 > i12) {
                            return StaggeredGridLayoutManager.this.n0(view);
                        }
                    }
                }
                i10 += i13;
            }
            return -1;
        }

        int i(int i10, int i11, boolean z10) {
            return h(i10, i11, false, false, z10);
        }

        public int j() {
            return this.f3661d;
        }

        int k() {
            int i10 = this.f3660c;
            if (i10 != Integer.MIN_VALUE) {
                return i10;
            }
            c();
            return this.f3660c;
        }

        int l(int i10) {
            int i11 = this.f3660c;
            if (i11 != Integer.MIN_VALUE) {
                return i11;
            }
            if (this.f3658a.size() == 0) {
                return i10;
            }
            c();
            return this.f3660c;
        }

        public View m(int i10, int i11) {
            View view = null;
            if (i11 == -1) {
                int size = this.f3658a.size();
                int i12 = 0;
                while (i12 < size) {
                    View view2 = this.f3658a.get(i12);
                    StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager.f3631z && staggeredGridLayoutManager.n0(view2) <= i10) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager2.f3631z && staggeredGridLayoutManager2.n0(view2) >= i10) || !view2.hasFocusable()) {
                        break;
                    }
                    i12++;
                    view = view2;
                }
            } else {
                int size2 = this.f3658a.size() - 1;
                while (size2 >= 0) {
                    View view3 = this.f3658a.get(size2);
                    StaggeredGridLayoutManager staggeredGridLayoutManager3 = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager3.f3631z && staggeredGridLayoutManager3.n0(view3) >= i10) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager4 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager4.f3631z && staggeredGridLayoutManager4.n0(view3) <= i10) || !view3.hasFocusable()) {
                        break;
                    }
                    size2--;
                    view = view3;
                }
            }
            return view;
        }

        c n(View view) {
            return (c) view.getLayoutParams();
        }

        int o() {
            int i10 = this.f3659b;
            if (i10 != Integer.MIN_VALUE) {
                return i10;
            }
            d();
            return this.f3659b;
        }

        int p(int i10) {
            int i11 = this.f3659b;
            if (i11 != Integer.MIN_VALUE) {
                return i11;
            }
            if (this.f3658a.size() == 0) {
                return i10;
            }
            d();
            return this.f3659b;
        }

        void q() {
            this.f3659b = RecyclerView.UNDEFINED_DURATION;
            this.f3660c = RecyclerView.UNDEFINED_DURATION;
        }

        void r(int i10) {
            int i11 = this.f3659b;
            if (i11 != Integer.MIN_VALUE) {
                this.f3659b = i11 + i10;
            }
            int i12 = this.f3660c;
            if (i12 != Integer.MIN_VALUE) {
                this.f3660c = i12 + i10;
            }
        }

        void s() {
            int size = this.f3658a.size();
            View remove = this.f3658a.remove(size - 1);
            c n10 = n(remove);
            n10.f3656e = null;
            if (n10.f() || n10.e()) {
                this.f3661d -= StaggeredGridLayoutManager.this.f3626u.e(remove);
            }
            if (size == 1) {
                this.f3659b = RecyclerView.UNDEFINED_DURATION;
            }
            this.f3660c = RecyclerView.UNDEFINED_DURATION;
        }

        void t() {
            View remove = this.f3658a.remove(0);
            c n10 = n(remove);
            n10.f3656e = null;
            if (this.f3658a.size() == 0) {
                this.f3660c = RecyclerView.UNDEFINED_DURATION;
            }
            if (n10.f() || n10.e()) {
                this.f3661d -= StaggeredGridLayoutManager.this.f3626u.e(remove);
            }
            this.f3659b = RecyclerView.UNDEFINED_DURATION;
        }

        void u(View view) {
            c n10 = n(view);
            n10.f3656e = this;
            this.f3658a.add(0, view);
            this.f3659b = RecyclerView.UNDEFINED_DURATION;
            if (this.f3658a.size() == 1) {
                this.f3660c = RecyclerView.UNDEFINED_DURATION;
            }
            if (n10.f() || n10.e()) {
                this.f3661d += StaggeredGridLayoutManager.this.f3626u.e(view);
            }
        }

        void v(int i10) {
            this.f3659b = i10;
            this.f3660c = i10;
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        RecyclerView.p.d o02 = RecyclerView.p.o0(context, attributeSet, i10, i11);
        Q2(o02.f3586a);
        S2(o02.f3587b);
        R2(o02.f3588c);
        this.f3630y = new f();
        i2();
    }

    private void D2(View view, int i10, int i11, boolean z10) {
        boolean N1;
        t(view, this.K);
        c cVar = (c) view.getLayoutParams();
        int i12 = ((ViewGroup.MarginLayoutParams) cVar).leftMargin;
        Rect rect = this.K;
        int a32 = a3(i10, i12 + rect.left, ((ViewGroup.MarginLayoutParams) cVar).rightMargin + rect.right);
        int i13 = ((ViewGroup.MarginLayoutParams) cVar).topMargin;
        Rect rect2 = this.K;
        int a33 = a3(i11, i13 + rect2.top, ((ViewGroup.MarginLayoutParams) cVar).bottomMargin + rect2.bottom);
        if (z10) {
            N1 = P1(view, a32, a33, cVar);
        } else {
            N1 = N1(view, a32, a33, cVar);
        }
        if (N1) {
            view.measure(a32, a33);
        }
    }

    private void E2(View view, c cVar, boolean z10) {
        if (cVar.f3657f) {
            if (this.f3628w == 1) {
                D2(view, this.J, RecyclerView.p.U(g0(), h0(), getPaddingTop() + getPaddingBottom(), ((ViewGroup.MarginLayoutParams) cVar).height, true), z10);
            } else {
                D2(view, RecyclerView.p.U(u0(), v0(), getPaddingLeft() + getPaddingRight(), ((ViewGroup.MarginLayoutParams) cVar).width, true), this.J, z10);
            }
        } else if (this.f3628w == 1) {
            D2(view, RecyclerView.p.U(this.f3629x, v0(), 0, ((ViewGroup.MarginLayoutParams) cVar).width, false), RecyclerView.p.U(g0(), h0(), getPaddingTop() + getPaddingBottom(), ((ViewGroup.MarginLayoutParams) cVar).height, true), z10);
        } else {
            D2(view, RecyclerView.p.U(u0(), v0(), getPaddingLeft() + getPaddingRight(), ((ViewGroup.MarginLayoutParams) cVar).width, true), RecyclerView.p.U(this.f3629x, h0(), 0, ((ViewGroup.MarginLayoutParams) cVar).height, false), z10);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x0157, code lost:
        if (a2() != false) goto L83;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void F2(androidx.recyclerview.widget.RecyclerView.w r9, androidx.recyclerview.widget.RecyclerView.a0 r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 379
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.F2(androidx.recyclerview.widget.RecyclerView$w, androidx.recyclerview.widget.RecyclerView$a0, boolean):void");
    }

    private boolean G2(int i10) {
        if (this.f3628w == 0) {
            return (i10 == -1) != this.A;
        }
        return ((i10 == -1) == this.A) == C2();
    }

    private void I2(View view) {
        for (int i10 = this.f3624s - 1; i10 >= 0; i10--) {
            this.f3625t[i10].u(view);
        }
    }

    private void J2(RecyclerView.w wVar, f fVar) {
        int min;
        int min2;
        if (!fVar.f3778a || fVar.f3786i) {
            return;
        }
        if (fVar.f3779b == 0) {
            if (fVar.f3782e == -1) {
                K2(wVar, fVar.f3784g);
            } else {
                L2(wVar, fVar.f3783f);
            }
        } else if (fVar.f3782e == -1) {
            int i10 = fVar.f3783f;
            int u22 = i10 - u2(i10);
            if (u22 < 0) {
                min2 = fVar.f3784g;
            } else {
                min2 = fVar.f3784g - Math.min(u22, fVar.f3779b);
            }
            K2(wVar, min2);
        } else {
            int v22 = v2(fVar.f3784g) - fVar.f3784g;
            if (v22 < 0) {
                min = fVar.f3783f;
            } else {
                min = Math.min(v22, fVar.f3779b) + fVar.f3783f;
            }
            L2(wVar, min);
        }
    }

    private void K2(RecyclerView.w wVar, int i10) {
        for (int T = T() - 1; T >= 0; T--) {
            View S = S(T);
            if (this.f3626u.g(S) < i10 || this.f3626u.q(S) < i10) {
                return;
            }
            c cVar = (c) S.getLayoutParams();
            if (cVar.f3657f) {
                for (int i11 = 0; i11 < this.f3624s; i11++) {
                    if (this.f3625t[i11].f3658a.size() == 1) {
                        return;
                    }
                }
                for (int i12 = 0; i12 < this.f3624s; i12++) {
                    this.f3625t[i12].s();
                }
            } else if (cVar.f3656e.f3658a.size() == 1) {
                return;
            } else {
                cVar.f3656e.s();
            }
            u1(S, wVar);
        }
    }

    private void L2(RecyclerView.w wVar, int i10) {
        while (T() > 0) {
            View S = S(0);
            if (this.f3626u.d(S) > i10 || this.f3626u.p(S) > i10) {
                return;
            }
            c cVar = (c) S.getLayoutParams();
            if (cVar.f3657f) {
                for (int i11 = 0; i11 < this.f3624s; i11++) {
                    if (this.f3625t[i11].f3658a.size() == 1) {
                        return;
                    }
                }
                for (int i12 = 0; i12 < this.f3624s; i12++) {
                    this.f3625t[i12].t();
                }
            } else if (cVar.f3656e.f3658a.size() == 1) {
                return;
            } else {
                cVar.f3656e.t();
            }
            u1(S, wVar);
        }
    }

    private void M2() {
        if (this.f3627v.k() == 1073741824) {
            return;
        }
        float f10 = 0.0f;
        int T = T();
        for (int i10 = 0; i10 < T; i10++) {
            View S = S(i10);
            float e10 = this.f3627v.e(S);
            if (e10 >= f10) {
                if (((c) S.getLayoutParams()).h()) {
                    e10 = (e10 * 1.0f) / this.f3624s;
                }
                f10 = Math.max(f10, e10);
            }
        }
        int i11 = this.f3629x;
        int round = Math.round(f10 * this.f3624s);
        if (this.f3627v.k() == Integer.MIN_VALUE) {
            round = Math.min(round, this.f3627v.n());
        }
        Y2(round);
        if (this.f3629x == i11) {
            return;
        }
        for (int i12 = 0; i12 < T; i12++) {
            View S2 = S(i12);
            c cVar = (c) S2.getLayoutParams();
            if (!cVar.f3657f) {
                if (C2() && this.f3628w == 1) {
                    int i13 = this.f3624s;
                    int i14 = cVar.f3656e.f3662e;
                    S2.offsetLeftAndRight(((-((i13 - 1) - i14)) * this.f3629x) - ((-((i13 - 1) - i14)) * i11));
                } else {
                    int i15 = cVar.f3656e.f3662e;
                    int i16 = this.f3629x * i15;
                    int i17 = i15 * i11;
                    if (this.f3628w == 1) {
                        S2.offsetLeftAndRight(i16 - i17);
                    } else {
                        S2.offsetTopAndBottom(i16 - i17);
                    }
                }
            }
        }
    }

    private void N2() {
        if (this.f3628w != 1 && C2()) {
            this.A = !this.f3631z;
        } else {
            this.A = this.f3631z;
        }
    }

    private void P2(int i10) {
        f fVar = this.f3630y;
        fVar.f3782e = i10;
        fVar.f3781d = this.A != (i10 == -1) ? -1 : 1;
    }

    private void T2(int i10, int i11) {
        for (int i12 = 0; i12 < this.f3624s; i12++) {
            if (!this.f3625t[i12].f3658a.isEmpty()) {
                Z2(this.f3625t[i12], i10, i11);
            }
        }
    }

    private void U1(View view) {
        for (int i10 = this.f3624s - 1; i10 >= 0; i10--) {
            this.f3625t[i10].a(view);
        }
    }

    private boolean U2(RecyclerView.a0 a0Var, b bVar) {
        int k22;
        if (this.G) {
            k22 = o2(a0Var.b());
        } else {
            k22 = k2(a0Var.b());
        }
        bVar.f3649a = k22;
        bVar.f3650b = RecyclerView.UNDEFINED_DURATION;
        return true;
    }

    private void V1(b bVar) {
        int m10;
        SavedState savedState = this.I;
        int i10 = savedState.f3640c;
        if (i10 > 0) {
            if (i10 == this.f3624s) {
                for (int i11 = 0; i11 < this.f3624s; i11++) {
                    this.f3625t[i11].e();
                    SavedState savedState2 = this.I;
                    int i12 = savedState2.f3641d[i11];
                    if (i12 != Integer.MIN_VALUE) {
                        if (savedState2.f3646i) {
                            m10 = this.f3626u.i();
                        } else {
                            m10 = this.f3626u.m();
                        }
                        i12 += m10;
                    }
                    this.f3625t[i11].v(i12);
                }
            } else {
                savedState.e();
                SavedState savedState3 = this.I;
                savedState3.f3638a = savedState3.f3639b;
            }
        }
        SavedState savedState4 = this.I;
        this.H = savedState4.f3647j;
        R2(savedState4.f3645h);
        N2();
        SavedState savedState5 = this.I;
        int i13 = savedState5.f3638a;
        if (i13 != -1) {
            this.C = i13;
            bVar.f3651c = savedState5.f3646i;
        } else {
            bVar.f3651c = this.A;
        }
        if (savedState5.f3642e > 1) {
            LazySpanLookup lazySpanLookup = this.E;
            lazySpanLookup.f3632a = savedState5.f3643f;
            lazySpanLookup.f3633b = savedState5.f3644g;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void X2(int r5, androidx.recyclerview.widget.RecyclerView.a0 r6) {
        /*
            r4 = this;
            androidx.recyclerview.widget.f r0 = r4.f3630y
            r1 = 0
            r0.f3779b = r1
            r0.f3780c = r5
            boolean r0 = r4.E0()
            r2 = 1
            if (r0 == 0) goto L2e
            int r6 = r6.c()
            r0 = -1
            if (r6 == r0) goto L2e
            boolean r0 = r4.A
            if (r6 >= r5) goto L1b
            r5 = 1
            goto L1c
        L1b:
            r5 = 0
        L1c:
            if (r0 != r5) goto L25
            androidx.recyclerview.widget.j r5 = r4.f3626u
            int r5 = r5.n()
            goto L2f
        L25:
            androidx.recyclerview.widget.j r5 = r4.f3626u
            int r5 = r5.n()
            r6 = r5
            r5 = 0
            goto L30
        L2e:
            r5 = 0
        L2f:
            r6 = 0
        L30:
            boolean r0 = r4.W()
            if (r0 == 0) goto L4d
            androidx.recyclerview.widget.f r0 = r4.f3630y
            androidx.recyclerview.widget.j r3 = r4.f3626u
            int r3 = r3.m()
            int r3 = r3 - r6
            r0.f3783f = r3
            androidx.recyclerview.widget.f r6 = r4.f3630y
            androidx.recyclerview.widget.j r0 = r4.f3626u
            int r0 = r0.i()
            int r0 = r0 + r5
            r6.f3784g = r0
            goto L5d
        L4d:
            androidx.recyclerview.widget.f r0 = r4.f3630y
            androidx.recyclerview.widget.j r3 = r4.f3626u
            int r3 = r3.h()
            int r3 = r3 + r5
            r0.f3784g = r3
            androidx.recyclerview.widget.f r5 = r4.f3630y
            int r6 = -r6
            r5.f3783f = r6
        L5d:
            androidx.recyclerview.widget.f r5 = r4.f3630y
            r5.f3785h = r1
            r5.f3778a = r2
            androidx.recyclerview.widget.j r6 = r4.f3626u
            int r6 = r6.k()
            if (r6 != 0) goto L74
            androidx.recyclerview.widget.j r6 = r4.f3626u
            int r6 = r6.h()
            if (r6 != 0) goto L74
            r1 = 1
        L74:
            r5.f3786i = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.X2(int, androidx.recyclerview.widget.RecyclerView$a0):void");
    }

    private void Y1(View view, c cVar, f fVar) {
        if (fVar.f3782e == 1) {
            if (cVar.f3657f) {
                U1(view);
            } else {
                cVar.f3656e.a(view);
            }
        } else if (cVar.f3657f) {
            I2(view);
        } else {
            cVar.f3656e.u(view);
        }
    }

    private int Z1(int i10) {
        if (T() == 0) {
            return this.A ? 1 : -1;
        }
        return (i10 < r2()) != this.A ? -1 : 1;
    }

    private void Z2(d dVar, int i10, int i11) {
        int j10 = dVar.j();
        if (i10 == -1) {
            if (dVar.o() + j10 <= i11) {
                this.B.set(dVar.f3662e, false);
            }
        } else if (dVar.k() - j10 >= i11) {
            this.B.set(dVar.f3662e, false);
        }
    }

    private int a3(int i10, int i11, int i12) {
        if (i11 == 0 && i12 == 0) {
            return i10;
        }
        int mode = View.MeasureSpec.getMode(i10);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i10) - i11) - i12), mode) : i10;
    }

    private boolean b2(d dVar) {
        if (this.A) {
            if (dVar.k() < this.f3626u.i()) {
                ArrayList<View> arrayList = dVar.f3658a;
                return !dVar.n(arrayList.get(arrayList.size() - 1)).f3657f;
            }
        } else if (dVar.o() > this.f3626u.m()) {
            return !dVar.n(dVar.f3658a.get(0)).f3657f;
        }
        return false;
    }

    private int c2(RecyclerView.a0 a0Var) {
        if (T() == 0) {
            return 0;
        }
        return m.a(a0Var, this.f3626u, m2(!this.N), l2(!this.N), this, this.N);
    }

    private int d2(RecyclerView.a0 a0Var) {
        if (T() == 0) {
            return 0;
        }
        return m.b(a0Var, this.f3626u, m2(!this.N), l2(!this.N), this, this.N, this.A);
    }

    private int e2(RecyclerView.a0 a0Var) {
        if (T() == 0) {
            return 0;
        }
        return m.c(a0Var, this.f3626u, m2(!this.N), l2(!this.N), this, this.N);
    }

    private int f2(int i10) {
        if (i10 == 1) {
            return (this.f3628w != 1 && C2()) ? 1 : -1;
        } else if (i10 == 2) {
            return (this.f3628w != 1 && C2()) ? -1 : 1;
        } else if (i10 == 17) {
            if (this.f3628w == 0) {
                return -1;
            }
            return RecyclerView.UNDEFINED_DURATION;
        } else if (i10 == 33) {
            if (this.f3628w == 1) {
                return -1;
            }
            return RecyclerView.UNDEFINED_DURATION;
        } else if (i10 != 66) {
            if (i10 == 130 && this.f3628w == 1) {
                return 1;
            }
            return RecyclerView.UNDEFINED_DURATION;
        } else if (this.f3628w == 0) {
            return 1;
        } else {
            return RecyclerView.UNDEFINED_DURATION;
        }
    }

    private LazySpanLookup.FullSpanItem g2(int i10) {
        LazySpanLookup.FullSpanItem fullSpanItem = new LazySpanLookup.FullSpanItem();
        fullSpanItem.f3636c = new int[this.f3624s];
        for (int i11 = 0; i11 < this.f3624s; i11++) {
            fullSpanItem.f3636c[i11] = i10 - this.f3625t[i11].l(i10);
        }
        return fullSpanItem;
    }

    private LazySpanLookup.FullSpanItem h2(int i10) {
        LazySpanLookup.FullSpanItem fullSpanItem = new LazySpanLookup.FullSpanItem();
        fullSpanItem.f3636c = new int[this.f3624s];
        for (int i11 = 0; i11 < this.f3624s; i11++) {
            fullSpanItem.f3636c[i11] = this.f3625t[i11].p(i10) - i10;
        }
        return fullSpanItem;
    }

    private void i2() {
        this.f3626u = j.b(this, this.f3628w);
        this.f3627v = j.b(this, 1 - this.f3628w);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v7 */
    private int j2(RecyclerView.w wVar, f fVar, RecyclerView.a0 a0Var) {
        int i10;
        int i11;
        int m10;
        int t22;
        d dVar;
        int e10;
        int i12;
        int i13;
        int e11;
        boolean X1;
        ?? r92 = 0;
        this.B.set(0, this.f3624s, true);
        if (this.f3630y.f3786i) {
            i11 = fVar.f3782e == 1 ? Api.BaseClientBuilder.API_PRIORITY_OTHER : RecyclerView.UNDEFINED_DURATION;
        } else {
            if (fVar.f3782e == 1) {
                i10 = fVar.f3784g + fVar.f3779b;
            } else {
                i10 = fVar.f3783f - fVar.f3779b;
            }
            i11 = i10;
        }
        T2(fVar.f3782e, i11);
        if (this.A) {
            m10 = this.f3626u.i();
        } else {
            m10 = this.f3626u.m();
        }
        int i14 = m10;
        boolean z10 = false;
        while (fVar.a(a0Var) && (this.f3630y.f3786i || !this.B.isEmpty())) {
            View b10 = fVar.b(wVar);
            c cVar = (c) b10.getLayoutParams();
            int c10 = cVar.c();
            int g10 = this.E.g(c10);
            boolean z11 = g10 == -1;
            if (z11) {
                dVar = cVar.f3657f ? this.f3625t[r92] : x2(fVar);
                this.E.n(c10, dVar);
            } else {
                dVar = this.f3625t[g10];
            }
            d dVar2 = dVar;
            cVar.f3656e = dVar2;
            if (fVar.f3782e == 1) {
                n(b10);
            } else {
                o(b10, r92);
            }
            E2(b10, cVar, r92);
            if (fVar.f3782e == 1) {
                int t23 = cVar.f3657f ? t2(i14) : dVar2.l(i14);
                int e12 = this.f3626u.e(b10) + t23;
                if (z11 && cVar.f3657f) {
                    LazySpanLookup.FullSpanItem g22 = g2(t23);
                    g22.f3635b = -1;
                    g22.f3634a = c10;
                    this.E.a(g22);
                }
                i12 = e12;
                e10 = t23;
            } else {
                int w22 = cVar.f3657f ? w2(i14) : dVar2.p(i14);
                e10 = w22 - this.f3626u.e(b10);
                if (z11 && cVar.f3657f) {
                    LazySpanLookup.FullSpanItem h22 = h2(w22);
                    h22.f3635b = 1;
                    h22.f3634a = c10;
                    this.E.a(h22);
                }
                i12 = w22;
            }
            if (cVar.f3657f && fVar.f3781d == -1) {
                if (z11) {
                    this.M = true;
                } else {
                    if (fVar.f3782e == 1) {
                        X1 = W1();
                    } else {
                        X1 = X1();
                    }
                    if (!X1) {
                        LazySpanLookup.FullSpanItem f10 = this.E.f(c10);
                        if (f10 != null) {
                            f10.f3637d = true;
                        }
                        this.M = true;
                    }
                }
            }
            Y1(b10, cVar, fVar);
            if (C2() && this.f3628w == 1) {
                int i15 = cVar.f3657f ? this.f3627v.i() : this.f3627v.i() - (((this.f3624s - 1) - dVar2.f3662e) * this.f3629x);
                e11 = i15;
                i13 = i15 - this.f3627v.e(b10);
            } else {
                int m11 = cVar.f3657f ? this.f3627v.m() : (dVar2.f3662e * this.f3629x) + this.f3627v.m();
                i13 = m11;
                e11 = this.f3627v.e(b10) + m11;
            }
            if (this.f3628w == 1) {
                G0(b10, i13, e10, e11, i12);
            } else {
                G0(b10, e10, i13, i12, e11);
            }
            if (cVar.f3657f) {
                T2(this.f3630y.f3782e, i11);
            } else {
                Z2(dVar2, this.f3630y.f3782e, i11);
            }
            J2(wVar, this.f3630y);
            if (this.f3630y.f3785h && b10.hasFocusable()) {
                if (cVar.f3657f) {
                    this.B.clear();
                } else {
                    this.B.set(dVar2.f3662e, false);
                    z10 = true;
                    r92 = 0;
                }
            }
            z10 = true;
            r92 = 0;
        }
        if (!z10) {
            J2(wVar, this.f3630y);
        }
        if (this.f3630y.f3782e == -1) {
            t22 = this.f3626u.m() - w2(this.f3626u.m());
        } else {
            t22 = t2(this.f3626u.i()) - this.f3626u.i();
        }
        if (t22 > 0) {
            return Math.min(fVar.f3779b, t22);
        }
        return 0;
    }

    private int k2(int i10) {
        int T = T();
        for (int i11 = 0; i11 < T; i11++) {
            int n02 = n0(S(i11));
            if (n02 >= 0 && n02 < i10) {
                return n02;
            }
        }
        return 0;
    }

    private int o2(int i10) {
        for (int T = T() - 1; T >= 0; T--) {
            int n02 = n0(S(T));
            if (n02 >= 0 && n02 < i10) {
                return n02;
            }
        }
        return 0;
    }

    private void p2(RecyclerView.w wVar, RecyclerView.a0 a0Var, boolean z10) {
        int i10;
        int t22 = t2(RecyclerView.UNDEFINED_DURATION);
        if (t22 != Integer.MIN_VALUE && (i10 = this.f3626u.i() - t22) > 0) {
            int i11 = i10 - (-O2(-i10, wVar, a0Var));
            if (!z10 || i11 <= 0) {
                return;
            }
            this.f3626u.r(i11);
        }
    }

    private void q2(RecyclerView.w wVar, RecyclerView.a0 a0Var, boolean z10) {
        int m10;
        int w22 = w2(Api.BaseClientBuilder.API_PRIORITY_OTHER);
        if (w22 != Integer.MAX_VALUE && (m10 = w22 - this.f3626u.m()) > 0) {
            int O2 = m10 - O2(m10, wVar, a0Var);
            if (!z10 || O2 <= 0) {
                return;
            }
            this.f3626u.r(-O2);
        }
    }

    private int t2(int i10) {
        int l10 = this.f3625t[0].l(i10);
        for (int i11 = 1; i11 < this.f3624s; i11++) {
            int l11 = this.f3625t[i11].l(i10);
            if (l11 > l10) {
                l10 = l11;
            }
        }
        return l10;
    }

    private int u2(int i10) {
        int p10 = this.f3625t[0].p(i10);
        for (int i11 = 1; i11 < this.f3624s; i11++) {
            int p11 = this.f3625t[i11].p(i10);
            if (p11 > p10) {
                p10 = p11;
            }
        }
        return p10;
    }

    private int v2(int i10) {
        int l10 = this.f3625t[0].l(i10);
        for (int i11 = 1; i11 < this.f3624s; i11++) {
            int l11 = this.f3625t[i11].l(i10);
            if (l11 < l10) {
                l10 = l11;
            }
        }
        return l10;
    }

    private int w2(int i10) {
        int p10 = this.f3625t[0].p(i10);
        for (int i11 = 1; i11 < this.f3624s; i11++) {
            int p11 = this.f3625t[i11].p(i10);
            if (p11 < p10) {
                p10 = p11;
            }
        }
        return p10;
    }

    private d x2(f fVar) {
        int i10;
        int i11;
        int i12 = -1;
        if (G2(fVar.f3782e)) {
            i10 = this.f3624s - 1;
            i11 = -1;
        } else {
            i10 = 0;
            i12 = this.f3624s;
            i11 = 1;
        }
        d dVar = null;
        if (fVar.f3782e == 1) {
            int i13 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            int m10 = this.f3626u.m();
            while (i10 != i12) {
                d dVar2 = this.f3625t[i10];
                int l10 = dVar2.l(m10);
                if (l10 < i13) {
                    dVar = dVar2;
                    i13 = l10;
                }
                i10 += i11;
            }
            return dVar;
        }
        int i14 = RecyclerView.UNDEFINED_DURATION;
        int i15 = this.f3626u.i();
        while (i10 != i12) {
            d dVar3 = this.f3625t[i10];
            int p10 = dVar3.p(i15);
            if (p10 > i14) {
                dVar = dVar3;
                i14 = p10;
            }
            i10 += i11;
        }
        return dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void z2(int r7, int r8, int r9) {
        /*
            r6 = this;
            boolean r0 = r6.A
            if (r0 == 0) goto L9
            int r0 = r6.s2()
            goto Ld
        L9:
            int r0 = r6.r2()
        Ld:
            r1 = 8
            if (r9 != r1) goto L1a
            if (r7 >= r8) goto L16
            int r2 = r8 + 1
            goto L1c
        L16:
            int r2 = r7 + 1
            r3 = r8
            goto L1d
        L1a:
            int r2 = r7 + r8
        L1c:
            r3 = r7
        L1d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r4 = r6.E
            r4.h(r3)
            r4 = 1
            if (r9 == r4) goto L3c
            r5 = 2
            if (r9 == r5) goto L36
            if (r9 == r1) goto L2b
            goto L41
        L2b:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r9 = r6.E
            r9.k(r7, r4)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r7 = r6.E
            r7.j(r8, r4)
            goto L41
        L36:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r9 = r6.E
            r9.k(r7, r8)
            goto L41
        L3c:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r9 = r6.E
            r9.j(r7, r8)
        L41:
            if (r2 > r0) goto L44
            return
        L44:
            boolean r7 = r6.A
            if (r7 == 0) goto L4d
            int r7 = r6.r2()
            goto L51
        L4d:
            int r7 = r6.s2()
        L51:
            if (r3 > r7) goto L56
            r6.B1()
        L56:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.z2(int, int, int):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int A(RecyclerView.a0 a0Var) {
        return c2(a0Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0074, code lost:
        if (r10 == r11) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0086, code lost:
        if (r10 == r11) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0088, code lost:
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x008a, code lost:
        r10 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    android.view.View A2() {
        /*
            r12 = this;
            int r0 = r12.T()
            r1 = 1
            int r0 = r0 - r1
            java.util.BitSet r2 = new java.util.BitSet
            int r3 = r12.f3624s
            r2.<init>(r3)
            int r3 = r12.f3624s
            r4 = 0
            r2.set(r4, r3, r1)
            int r3 = r12.f3628w
            r5 = -1
            if (r3 != r1) goto L20
            boolean r3 = r12.C2()
            if (r3 == 0) goto L20
            r3 = 1
            goto L21
        L20:
            r3 = -1
        L21:
            boolean r6 = r12.A
            if (r6 == 0) goto L27
            r6 = -1
            goto L2b
        L27:
            int r0 = r0 + 1
            r6 = r0
            r0 = 0
        L2b:
            if (r0 >= r6) goto L2e
            r5 = 1
        L2e:
            if (r0 == r6) goto Lab
            android.view.View r7 = r12.S(r0)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r8 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) r8
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r8.f3656e
            int r9 = r9.f3662e
            boolean r9 = r2.get(r9)
            if (r9 == 0) goto L54
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r8.f3656e
            boolean r9 = r12.b2(r9)
            if (r9 == 0) goto L4d
            return r7
        L4d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r8.f3656e
            int r9 = r9.f3662e
            r2.clear(r9)
        L54:
            boolean r9 = r8.f3657f
            if (r9 == 0) goto L59
            goto La9
        L59:
            int r9 = r0 + r5
            if (r9 == r6) goto La9
            android.view.View r9 = r12.S(r9)
            boolean r10 = r12.A
            if (r10 == 0) goto L77
            androidx.recyclerview.widget.j r10 = r12.f3626u
            int r10 = r10.d(r7)
            androidx.recyclerview.widget.j r11 = r12.f3626u
            int r11 = r11.d(r9)
            if (r10 >= r11) goto L74
            return r7
        L74:
            if (r10 != r11) goto L8a
            goto L88
        L77:
            androidx.recyclerview.widget.j r10 = r12.f3626u
            int r10 = r10.g(r7)
            androidx.recyclerview.widget.j r11 = r12.f3626u
            int r11 = r11.g(r9)
            if (r10 <= r11) goto L86
            return r7
        L86:
            if (r10 != r11) goto L8a
        L88:
            r10 = 1
            goto L8b
        L8a:
            r10 = 0
        L8b:
            if (r10 == 0) goto La9
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) r9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r8 = r8.f3656e
            int r8 = r8.f3662e
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r9.f3656e
            int r9 = r9.f3662e
            int r8 = r8 - r9
            if (r8 >= 0) goto La0
            r8 = 1
            goto La1
        La0:
            r8 = 0
        La1:
            if (r3 >= 0) goto La5
            r9 = 1
            goto La6
        La5:
            r9 = 0
        La6:
            if (r8 == r9) goto La9
            return r7
        La9:
            int r0 = r0 + r5
            goto L2e
        Lab:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.A2():android.view.View");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int B(RecyclerView.a0 a0Var) {
        return d2(a0Var);
    }

    public void B2() {
        this.E.b();
        B1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int C(RecyclerView.a0 a0Var) {
        return e2(a0Var);
    }

    boolean C2() {
        return j0() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int D(RecyclerView.a0 a0Var) {
        return c2(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int E(RecyclerView.a0 a0Var) {
        return d2(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int E1(int i10, RecyclerView.w wVar, RecyclerView.a0 a0Var) {
        return O2(i10, wVar, a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int F(RecyclerView.a0 a0Var) {
        return e2(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void F1(int i10) {
        SavedState savedState = this.I;
        if (savedState != null && savedState.f3638a != i10) {
            savedState.c();
        }
        this.C = i10;
        this.D = RecyclerView.UNDEFINED_DURATION;
        B1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int G1(int i10, RecyclerView.w wVar, RecyclerView.a0 a0Var) {
        return O2(i10, wVar, a0Var);
    }

    void H2(int i10, RecyclerView.a0 a0Var) {
        int r22;
        int i11;
        if (i10 > 0) {
            r22 = s2();
            i11 = 1;
        } else {
            r22 = r2();
            i11 = -1;
        }
        this.f3630y.f3778a = true;
        X2(r22, a0Var);
        P2(i11);
        f fVar = this.f3630y;
        fVar.f3780c = r22 + fVar.f3781d;
        fVar.f3779b = Math.abs(i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void J0(int i10) {
        super.J0(i10);
        for (int i11 = 0; i11 < this.f3624s; i11++) {
            this.f3625t[i11].r(i10);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void K0(int i10) {
        super.K0(i10);
        for (int i11 = 0; i11 < this.f3624s; i11++) {
            this.f3625t[i11].r(i10);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void K1(Rect rect, int i10, int i11) {
        int x10;
        int x11;
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.f3628w == 1) {
            x11 = RecyclerView.p.x(i11, rect.height() + paddingTop, l0());
            x10 = RecyclerView.p.x(i10, (this.f3629x * this.f3624s) + paddingLeft, m0());
        } else {
            x10 = RecyclerView.p.x(i10, rect.width() + paddingLeft, m0());
            x11 = RecyclerView.p.x(i11, (this.f3629x * this.f3624s) + paddingTop, l0());
        }
        J1(x10, x11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void L0(RecyclerView.h hVar, RecyclerView.h hVar2) {
        this.E.b();
        for (int i10 = 0; i10 < this.f3624s; i10++) {
            this.f3625t[i10].e();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q N() {
        if (this.f3628w == 0) {
            return new c(-2, -1);
        }
        return new c(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q O(Context context, AttributeSet attributeSet) {
        return new c(context, attributeSet);
    }

    int O2(int i10, RecyclerView.w wVar, RecyclerView.a0 a0Var) {
        if (T() == 0 || i10 == 0) {
            return 0;
        }
        H2(i10, a0Var);
        int j22 = j2(wVar, this.f3630y, a0Var);
        if (this.f3630y.f3779b >= j22) {
            i10 = i10 < 0 ? -j22 : j22;
        }
        this.f3626u.r(-i10);
        this.G = this.A;
        f fVar = this.f3630y;
        fVar.f3779b = 0;
        J2(wVar, fVar);
        return i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q P(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new c((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new c(layoutParams);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void P0(RecyclerView recyclerView, RecyclerView.w wVar) {
        super.P0(recyclerView, wVar);
        w1(this.P);
        for (int i10 = 0; i10 < this.f3624s; i10++) {
            this.f3625t[i10].e();
        }
        recyclerView.requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public View Q0(View view, int i10, RecyclerView.w wVar, RecyclerView.a0 a0Var) {
        View L;
        int r22;
        int g10;
        int g11;
        int g12;
        View m10;
        if (T() == 0 || (L = L(view)) == null) {
            return null;
        }
        N2();
        int f22 = f2(i10);
        if (f22 == Integer.MIN_VALUE) {
            return null;
        }
        c cVar = (c) L.getLayoutParams();
        boolean z10 = cVar.f3657f;
        d dVar = cVar.f3656e;
        if (f22 == 1) {
            r22 = s2();
        } else {
            r22 = r2();
        }
        X2(r22, a0Var);
        P2(f22);
        f fVar = this.f3630y;
        fVar.f3780c = fVar.f3781d + r22;
        fVar.f3779b = (int) (this.f3626u.n() * 0.33333334f);
        f fVar2 = this.f3630y;
        fVar2.f3785h = true;
        fVar2.f3778a = false;
        j2(wVar, fVar2, a0Var);
        this.G = this.A;
        if (z10 || (m10 = dVar.m(r22, f22)) == null || m10 == L) {
            if (G2(f22)) {
                for (int i11 = this.f3624s - 1; i11 >= 0; i11--) {
                    View m11 = this.f3625t[i11].m(r22, f22);
                    if (m11 != null && m11 != L) {
                        return m11;
                    }
                }
            } else {
                for (int i12 = 0; i12 < this.f3624s; i12++) {
                    View m12 = this.f3625t[i12].m(r22, f22);
                    if (m12 != null && m12 != L) {
                        return m12;
                    }
                }
            }
            boolean z11 = (this.f3631z ^ true) == (f22 == -1);
            if (!z10) {
                if (z11) {
                    g12 = dVar.f();
                } else {
                    g12 = dVar.g();
                }
                View M = M(g12);
                if (M != null && M != L) {
                    return M;
                }
            }
            if (G2(f22)) {
                for (int i13 = this.f3624s - 1; i13 >= 0; i13--) {
                    if (i13 != dVar.f3662e) {
                        if (z11) {
                            g11 = this.f3625t[i13].f();
                        } else {
                            g11 = this.f3625t[i13].g();
                        }
                        View M2 = M(g11);
                        if (M2 != null && M2 != L) {
                            return M2;
                        }
                    }
                }
            } else {
                for (int i14 = 0; i14 < this.f3624s; i14++) {
                    if (z11) {
                        g10 = this.f3625t[i14].f();
                    } else {
                        g10 = this.f3625t[i14].g();
                    }
                    View M3 = M(g10);
                    if (M3 != null && M3 != L) {
                        return M3;
                    }
                }
            }
            return null;
        }
        return m10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void Q1(RecyclerView recyclerView, RecyclerView.a0 a0Var, int i10) {
        g gVar = new g(recyclerView.getContext());
        gVar.p(i10);
        R1(gVar);
    }

    public void Q2(int i10) {
        if (i10 != 0 && i10 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        q(null);
        if (i10 == this.f3628w) {
            return;
        }
        this.f3628w = i10;
        j jVar = this.f3626u;
        this.f3626u = this.f3627v;
        this.f3627v = jVar;
        B1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void R0(AccessibilityEvent accessibilityEvent) {
        super.R0(accessibilityEvent);
        if (T() > 0) {
            View m22 = m2(false);
            View l22 = l2(false);
            if (m22 == null || l22 == null) {
                return;
            }
            int n02 = n0(m22);
            int n03 = n0(l22);
            if (n02 < n03) {
                accessibilityEvent.setFromIndex(n02);
                accessibilityEvent.setToIndex(n03);
                return;
            }
            accessibilityEvent.setFromIndex(n03);
            accessibilityEvent.setToIndex(n02);
        }
    }

    public void R2(boolean z10) {
        q(null);
        SavedState savedState = this.I;
        if (savedState != null && savedState.f3645h != z10) {
            savedState.f3645h = z10;
        }
        this.f3631z = z10;
        B1();
    }

    public void S2(int i10) {
        q(null);
        if (i10 != this.f3624s) {
            B2();
            this.f3624s = i10;
            this.B = new BitSet(this.f3624s);
            this.f3625t = new d[this.f3624s];
            for (int i11 = 0; i11 < this.f3624s; i11++) {
                this.f3625t[i11] = new d(i11);
            }
            B1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean T1() {
        return this.I == null;
    }

    boolean V2(RecyclerView.a0 a0Var, b bVar) {
        int i10;
        int m10;
        if (!a0Var.e() && (i10 = this.C) != -1) {
            if (i10 >= 0 && i10 < a0Var.b()) {
                SavedState savedState = this.I;
                if (savedState != null && savedState.f3638a != -1 && savedState.f3640c >= 1) {
                    bVar.f3650b = RecyclerView.UNDEFINED_DURATION;
                    bVar.f3649a = this.C;
                } else {
                    View M = M(this.C);
                    if (M != null) {
                        bVar.f3649a = this.A ? s2() : r2();
                        if (this.D != Integer.MIN_VALUE) {
                            if (bVar.f3651c) {
                                bVar.f3650b = (this.f3626u.i() - this.D) - this.f3626u.d(M);
                            } else {
                                bVar.f3650b = (this.f3626u.m() + this.D) - this.f3626u.g(M);
                            }
                            return true;
                        } else if (this.f3626u.e(M) > this.f3626u.n()) {
                            if (bVar.f3651c) {
                                m10 = this.f3626u.i();
                            } else {
                                m10 = this.f3626u.m();
                            }
                            bVar.f3650b = m10;
                            return true;
                        } else {
                            int g10 = this.f3626u.g(M) - this.f3626u.m();
                            if (g10 < 0) {
                                bVar.f3650b = -g10;
                                return true;
                            }
                            int i11 = this.f3626u.i() - this.f3626u.d(M);
                            if (i11 < 0) {
                                bVar.f3650b = i11;
                                return true;
                            }
                            bVar.f3650b = RecyclerView.UNDEFINED_DURATION;
                        }
                    } else {
                        int i12 = this.C;
                        bVar.f3649a = i12;
                        int i13 = this.D;
                        if (i13 == Integer.MIN_VALUE) {
                            bVar.f3651c = Z1(i12) == 1;
                            bVar.a();
                        } else {
                            bVar.b(i13);
                        }
                        bVar.f3652d = true;
                    }
                }
                return true;
            }
            this.C = -1;
            this.D = RecyclerView.UNDEFINED_DURATION;
        }
        return false;
    }

    boolean W1() {
        int l10 = this.f3625t[0].l(RecyclerView.UNDEFINED_DURATION);
        for (int i10 = 1; i10 < this.f3624s; i10++) {
            if (this.f3625t[i10].l(RecyclerView.UNDEFINED_DURATION) != l10) {
                return false;
            }
        }
        return true;
    }

    void W2(RecyclerView.a0 a0Var, b bVar) {
        if (V2(a0Var, bVar) || U2(a0Var, bVar)) {
            return;
        }
        bVar.a();
        bVar.f3649a = 0;
    }

    boolean X1() {
        int p10 = this.f3625t[0].p(RecyclerView.UNDEFINED_DURATION);
        for (int i10 = 1; i10 < this.f3624s; i10++) {
            if (this.f3625t[i10].p(RecyclerView.UNDEFINED_DURATION) != p10) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void Y0(RecyclerView recyclerView, int i10, int i11) {
        z2(i10, i11, 1);
    }

    void Y2(int i10) {
        this.f3629x = i10 / this.f3624s;
        this.J = View.MeasureSpec.makeMeasureSpec(i10, this.f3627v.k());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void Z0(RecyclerView recyclerView) {
        this.E.b();
        B1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.z.b
    public PointF a(int i10) {
        int Z1 = Z1(i10);
        PointF pointF = new PointF();
        if (Z1 == 0) {
            return null;
        }
        if (this.f3628w == 0) {
            pointF.x = Z1;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = Z1;
        }
        return pointF;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void a1(RecyclerView recyclerView, int i10, int i11, int i12) {
        z2(i10, i11, 8);
    }

    boolean a2() {
        int r22;
        int s22;
        if (T() == 0 || this.F == 0 || !x0()) {
            return false;
        }
        if (this.A) {
            r22 = s2();
            s22 = r2();
        } else {
            r22 = r2();
            s22 = s2();
        }
        if (r22 == 0 && A2() != null) {
            this.E.b();
            C1();
            B1();
            return true;
        } else if (this.M) {
            int i10 = this.A ? -1 : 1;
            int i11 = s22 + 1;
            LazySpanLookup.FullSpanItem e10 = this.E.e(r22, i11, i10, true);
            if (e10 == null) {
                this.M = false;
                this.E.d(i11);
                return false;
            }
            LazySpanLookup.FullSpanItem e11 = this.E.e(r22, e10.f3634a, i10 * (-1), true);
            if (e11 == null) {
                this.E.d(e10.f3634a);
            } else {
                this.E.d(e11.f3634a + 1);
            }
            C1();
            B1();
            return true;
        } else {
            return false;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void b1(RecyclerView recyclerView, int i10, int i11) {
        z2(i10, i11, 2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void d1(RecyclerView recyclerView, int i10, int i11, Object obj) {
        z2(i10, i11, 4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void e1(RecyclerView.w wVar, RecyclerView.a0 a0Var) {
        F2(wVar, a0Var, true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void f1(RecyclerView.a0 a0Var) {
        super.f1(a0Var);
        this.C = -1;
        this.D = RecyclerView.UNDEFINED_DURATION;
        this.I = null;
        this.L.c();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void j1(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.I = savedState;
            if (this.C != -1) {
                savedState.c();
                this.I.e();
            }
            B1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public Parcelable k1() {
        int p10;
        int m10;
        int[] iArr;
        if (this.I != null) {
            return new SavedState(this.I);
        }
        SavedState savedState = new SavedState();
        savedState.f3645h = this.f3631z;
        savedState.f3646i = this.G;
        savedState.f3647j = this.H;
        LazySpanLookup lazySpanLookup = this.E;
        if (lazySpanLookup != null && (iArr = lazySpanLookup.f3632a) != null) {
            savedState.f3643f = iArr;
            savedState.f3642e = iArr.length;
            savedState.f3644g = lazySpanLookup.f3633b;
        } else {
            savedState.f3642e = 0;
        }
        if (T() > 0) {
            savedState.f3638a = this.G ? s2() : r2();
            savedState.f3639b = n2();
            int i10 = this.f3624s;
            savedState.f3640c = i10;
            savedState.f3641d = new int[i10];
            for (int i11 = 0; i11 < this.f3624s; i11++) {
                if (this.G) {
                    p10 = this.f3625t[i11].l(RecyclerView.UNDEFINED_DURATION);
                    if (p10 != Integer.MIN_VALUE) {
                        m10 = this.f3626u.i();
                        p10 -= m10;
                        savedState.f3641d[i11] = p10;
                    } else {
                        savedState.f3641d[i11] = p10;
                    }
                } else {
                    p10 = this.f3625t[i11].p(RecyclerView.UNDEFINED_DURATION);
                    if (p10 != Integer.MIN_VALUE) {
                        m10 = this.f3626u.m();
                        p10 -= m10;
                        savedState.f3641d[i11] = p10;
                    } else {
                        savedState.f3641d[i11] = p10;
                    }
                }
            }
        } else {
            savedState.f3638a = -1;
            savedState.f3639b = -1;
            savedState.f3640c = 0;
        }
        return savedState;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void l1(int i10) {
        if (i10 == 0) {
            a2();
        }
    }

    View l2(boolean z10) {
        int m10 = this.f3626u.m();
        int i10 = this.f3626u.i();
        View view = null;
        for (int T = T() - 1; T >= 0; T--) {
            View S = S(T);
            int g10 = this.f3626u.g(S);
            int d10 = this.f3626u.d(S);
            if (d10 > m10 && g10 < i10) {
                if (d10 <= i10 || !z10) {
                    return S;
                }
                if (view == null) {
                    view = S;
                }
            }
        }
        return view;
    }

    View m2(boolean z10) {
        int m10 = this.f3626u.m();
        int i10 = this.f3626u.i();
        int T = T();
        View view = null;
        for (int i11 = 0; i11 < T; i11++) {
            View S = S(i11);
            int g10 = this.f3626u.g(S);
            if (this.f3626u.d(S) > m10 && g10 < i10) {
                if (g10 >= m10 || !z10) {
                    return S;
                }
                if (view == null) {
                    view = S;
                }
            }
        }
        return view;
    }

    int n2() {
        View l22 = this.A ? l2(true) : m2(true);
        if (l22 == null) {
            return -1;
        }
        return n0(l22);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void q(String str) {
        if (this.I == null) {
            super.q(str);
        }
    }

    int r2() {
        if (T() == 0) {
            return 0;
        }
        return n0(S(0));
    }

    int s2() {
        int T = T();
        if (T == 0) {
            return 0;
        }
        return n0(S(T - 1));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean u() {
        return this.f3628w == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean v() {
        return this.f3628w == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean w(RecyclerView.q qVar) {
        return qVar instanceof c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void y(int i10, int i11, RecyclerView.a0 a0Var, RecyclerView.p.c cVar) {
        int l10;
        int i12;
        if (this.f3628w != 0) {
            i10 = i11;
        }
        if (T() == 0 || i10 == 0) {
            return;
        }
        H2(i10, a0Var);
        int[] iArr = this.O;
        if (iArr == null || iArr.length < this.f3624s) {
            this.O = new int[this.f3624s];
        }
        int i13 = 0;
        for (int i14 = 0; i14 < this.f3624s; i14++) {
            f fVar = this.f3630y;
            if (fVar.f3781d == -1) {
                l10 = fVar.f3783f;
                i12 = this.f3625t[i14].p(l10);
            } else {
                l10 = this.f3625t[i14].l(fVar.f3784g);
                i12 = this.f3630y.f3784g;
            }
            int i15 = l10 - i12;
            if (i15 >= 0) {
                this.O[i13] = i15;
                i13++;
            }
        }
        Arrays.sort(this.O, 0, i13);
        for (int i16 = 0; i16 < i13 && this.f3630y.a(a0Var); i16++) {
            cVar.a(this.f3630y.f3780c, this.O[i16]);
            f fVar2 = this.f3630y;
            fVar2.f3780c += fVar2.f3781d;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean y0() {
        return this.F != 0;
    }

    public int y2() {
        return this.f3624s;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class LazySpanLookup {

        /* renamed from: a  reason: collision with root package name */
        int[] f3632a;

        /* renamed from: b  reason: collision with root package name */
        List<FullSpanItem> f3633b;

        LazySpanLookup() {
        }

        private int i(int i10) {
            if (this.f3633b == null) {
                return -1;
            }
            FullSpanItem f10 = f(i10);
            if (f10 != null) {
                this.f3633b.remove(f10);
            }
            int size = this.f3633b.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    i11 = -1;
                    break;
                } else if (this.f3633b.get(i11).f3634a >= i10) {
                    break;
                } else {
                    i11++;
                }
            }
            if (i11 != -1) {
                this.f3633b.remove(i11);
                return this.f3633b.get(i11).f3634a;
            }
            return -1;
        }

        private void l(int i10, int i11) {
            List<FullSpanItem> list = this.f3633b;
            if (list == null) {
                return;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = this.f3633b.get(size);
                int i12 = fullSpanItem.f3634a;
                if (i12 >= i10) {
                    fullSpanItem.f3634a = i12 + i11;
                }
            }
        }

        private void m(int i10, int i11) {
            List<FullSpanItem> list = this.f3633b;
            if (list == null) {
                return;
            }
            int i12 = i10 + i11;
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = this.f3633b.get(size);
                int i13 = fullSpanItem.f3634a;
                if (i13 >= i10) {
                    if (i13 < i12) {
                        this.f3633b.remove(size);
                    } else {
                        fullSpanItem.f3634a = i13 - i11;
                    }
                }
            }
        }

        public void a(FullSpanItem fullSpanItem) {
            if (this.f3633b == null) {
                this.f3633b = new ArrayList();
            }
            int size = this.f3633b.size();
            for (int i10 = 0; i10 < size; i10++) {
                FullSpanItem fullSpanItem2 = this.f3633b.get(i10);
                if (fullSpanItem2.f3634a == fullSpanItem.f3634a) {
                    this.f3633b.remove(i10);
                }
                if (fullSpanItem2.f3634a >= fullSpanItem.f3634a) {
                    this.f3633b.add(i10, fullSpanItem);
                    return;
                }
            }
            this.f3633b.add(fullSpanItem);
        }

        void b() {
            int[] iArr = this.f3632a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f3633b = null;
        }

        void c(int i10) {
            int[] iArr = this.f3632a;
            if (iArr == null) {
                int[] iArr2 = new int[Math.max(i10, 10) + 1];
                this.f3632a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i10 >= iArr.length) {
                int[] iArr3 = new int[o(i10)];
                this.f3632a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.f3632a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        int d(int i10) {
            List<FullSpanItem> list = this.f3633b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    if (this.f3633b.get(size).f3634a >= i10) {
                        this.f3633b.remove(size);
                    }
                }
            }
            return h(i10);
        }

        public FullSpanItem e(int i10, int i11, int i12, boolean z10) {
            List<FullSpanItem> list = this.f3633b;
            if (list == null) {
                return null;
            }
            int size = list.size();
            for (int i13 = 0; i13 < size; i13++) {
                FullSpanItem fullSpanItem = this.f3633b.get(i13);
                int i14 = fullSpanItem.f3634a;
                if (i14 >= i11) {
                    return null;
                }
                if (i14 >= i10 && (i12 == 0 || fullSpanItem.f3635b == i12 || (z10 && fullSpanItem.f3637d))) {
                    return fullSpanItem;
                }
            }
            return null;
        }

        public FullSpanItem f(int i10) {
            List<FullSpanItem> list = this.f3633b;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = this.f3633b.get(size);
                if (fullSpanItem.f3634a == i10) {
                    return fullSpanItem;
                }
            }
            return null;
        }

        int g(int i10) {
            int[] iArr = this.f3632a;
            if (iArr == null || i10 >= iArr.length) {
                return -1;
            }
            return iArr[i10];
        }

        int h(int i10) {
            int[] iArr = this.f3632a;
            if (iArr != null && i10 < iArr.length) {
                int i11 = i(i10);
                if (i11 == -1) {
                    int[] iArr2 = this.f3632a;
                    Arrays.fill(iArr2, i10, iArr2.length, -1);
                    return this.f3632a.length;
                }
                int min = Math.min(i11 + 1, this.f3632a.length);
                Arrays.fill(this.f3632a, i10, min, -1);
                return min;
            }
            return -1;
        }

        void j(int i10, int i11) {
            int[] iArr = this.f3632a;
            if (iArr == null || i10 >= iArr.length) {
                return;
            }
            int i12 = i10 + i11;
            c(i12);
            int[] iArr2 = this.f3632a;
            System.arraycopy(iArr2, i10, iArr2, i12, (iArr2.length - i10) - i11);
            Arrays.fill(this.f3632a, i10, i12, -1);
            l(i10, i11);
        }

        void k(int i10, int i11) {
            int[] iArr = this.f3632a;
            if (iArr == null || i10 >= iArr.length) {
                return;
            }
            int i12 = i10 + i11;
            c(i12);
            int[] iArr2 = this.f3632a;
            System.arraycopy(iArr2, i12, iArr2, i10, (iArr2.length - i10) - i11);
            int[] iArr3 = this.f3632a;
            Arrays.fill(iArr3, iArr3.length - i11, iArr3.length, -1);
            m(i10, i11);
        }

        void n(int i10, d dVar) {
            c(i10);
            this.f3632a[i10] = dVar.f3662e;
        }

        int o(int i10) {
            int length = this.f3632a.length;
            while (length <= i10) {
                length *= 2;
            }
            return length;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @SuppressLint({"BanParcelableUsage"})
        /* loaded from: classes.dex */
        public static class FullSpanItem implements Parcelable {
            public static final Parcelable.Creator<FullSpanItem> CREATOR = new a();

            /* renamed from: a  reason: collision with root package name */
            int f3634a;

            /* renamed from: b  reason: collision with root package name */
            int f3635b;

            /* renamed from: c  reason: collision with root package name */
            int[] f3636c;

            /* renamed from: d  reason: collision with root package name */
            boolean f3637d;

            /* loaded from: classes.dex */
            class a implements Parcelable.Creator<FullSpanItem> {
                a() {
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: a */
                public FullSpanItem createFromParcel(Parcel parcel) {
                    return new FullSpanItem(parcel);
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b */
                public FullSpanItem[] newArray(int i10) {
                    return new FullSpanItem[i10];
                }
            }

            FullSpanItem(Parcel parcel) {
                this.f3634a = parcel.readInt();
                this.f3635b = parcel.readInt();
                this.f3637d = parcel.readInt() == 1;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    this.f3636c = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            int c(int i10) {
                int[] iArr = this.f3636c;
                if (iArr == null) {
                    return 0;
                }
                return iArr[i10];
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public String toString() {
                return "FullSpanItem{mPosition=" + this.f3634a + ", mGapDir=" + this.f3635b + ", mHasUnwantedGapAfter=" + this.f3637d + ", mGapPerSpan=" + Arrays.toString(this.f3636c) + '}';
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i10) {
                parcel.writeInt(this.f3634a);
                parcel.writeInt(this.f3635b);
                parcel.writeInt(this.f3637d ? 1 : 0);
                int[] iArr = this.f3636c;
                if (iArr != null && iArr.length > 0) {
                    parcel.writeInt(iArr.length);
                    parcel.writeIntArray(this.f3636c);
                    return;
                }
                parcel.writeInt(0);
            }

            FullSpanItem() {
            }
        }
    }
}
