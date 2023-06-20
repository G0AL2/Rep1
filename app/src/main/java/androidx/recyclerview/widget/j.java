package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: OrientationHelper.java */
/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a  reason: collision with root package name */
    protected final RecyclerView.p f3798a;

    /* renamed from: b  reason: collision with root package name */
    private int f3799b;

    /* renamed from: c  reason: collision with root package name */
    final Rect f3800c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OrientationHelper.java */
    /* loaded from: classes.dex */
    public class a extends j {
        a(RecyclerView.p pVar) {
            super(pVar, null);
        }

        @Override // androidx.recyclerview.widget.j
        public int d(View view) {
            return this.f3798a.d0(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.q) view.getLayoutParams())).rightMargin;
        }

        @Override // androidx.recyclerview.widget.j
        public int e(View view) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return this.f3798a.c0(view) + ((ViewGroup.MarginLayoutParams) qVar).leftMargin + ((ViewGroup.MarginLayoutParams) qVar).rightMargin;
        }

        @Override // androidx.recyclerview.widget.j
        public int f(View view) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return this.f3798a.b0(view) + ((ViewGroup.MarginLayoutParams) qVar).topMargin + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.j
        public int g(View view) {
            return this.f3798a.a0(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.q) view.getLayoutParams())).leftMargin;
        }

        @Override // androidx.recyclerview.widget.j
        public int h() {
            return this.f3798a.u0();
        }

        @Override // androidx.recyclerview.widget.j
        public int i() {
            return this.f3798a.u0() - this.f3798a.getPaddingRight();
        }

        @Override // androidx.recyclerview.widget.j
        public int j() {
            return this.f3798a.getPaddingRight();
        }

        @Override // androidx.recyclerview.widget.j
        public int k() {
            return this.f3798a.v0();
        }

        @Override // androidx.recyclerview.widget.j
        public int l() {
            return this.f3798a.h0();
        }

        @Override // androidx.recyclerview.widget.j
        public int m() {
            return this.f3798a.getPaddingLeft();
        }

        @Override // androidx.recyclerview.widget.j
        public int n() {
            return (this.f3798a.u0() - this.f3798a.getPaddingLeft()) - this.f3798a.getPaddingRight();
        }

        @Override // androidx.recyclerview.widget.j
        public int p(View view) {
            this.f3798a.t0(view, true, this.f3800c);
            return this.f3800c.right;
        }

        @Override // androidx.recyclerview.widget.j
        public int q(View view) {
            this.f3798a.t0(view, true, this.f3800c);
            return this.f3800c.left;
        }

        @Override // androidx.recyclerview.widget.j
        public void r(int i10) {
            this.f3798a.J0(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OrientationHelper.java */
    /* loaded from: classes.dex */
    public class b extends j {
        b(RecyclerView.p pVar) {
            super(pVar, null);
        }

        @Override // androidx.recyclerview.widget.j
        public int d(View view) {
            return this.f3798a.Y(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.q) view.getLayoutParams())).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.j
        public int e(View view) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return this.f3798a.b0(view) + ((ViewGroup.MarginLayoutParams) qVar).topMargin + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.j
        public int f(View view) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return this.f3798a.c0(view) + ((ViewGroup.MarginLayoutParams) qVar).leftMargin + ((ViewGroup.MarginLayoutParams) qVar).rightMargin;
        }

        @Override // androidx.recyclerview.widget.j
        public int g(View view) {
            return this.f3798a.e0(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.q) view.getLayoutParams())).topMargin;
        }

        @Override // androidx.recyclerview.widget.j
        public int h() {
            return this.f3798a.g0();
        }

        @Override // androidx.recyclerview.widget.j
        public int i() {
            return this.f3798a.g0() - this.f3798a.getPaddingBottom();
        }

        @Override // androidx.recyclerview.widget.j
        public int j() {
            return this.f3798a.getPaddingBottom();
        }

        @Override // androidx.recyclerview.widget.j
        public int k() {
            return this.f3798a.h0();
        }

        @Override // androidx.recyclerview.widget.j
        public int l() {
            return this.f3798a.v0();
        }

        @Override // androidx.recyclerview.widget.j
        public int m() {
            return this.f3798a.getPaddingTop();
        }

        @Override // androidx.recyclerview.widget.j
        public int n() {
            return (this.f3798a.g0() - this.f3798a.getPaddingTop()) - this.f3798a.getPaddingBottom();
        }

        @Override // androidx.recyclerview.widget.j
        public int p(View view) {
            this.f3798a.t0(view, true, this.f3800c);
            return this.f3800c.bottom;
        }

        @Override // androidx.recyclerview.widget.j
        public int q(View view) {
            this.f3798a.t0(view, true, this.f3800c);
            return this.f3800c.top;
        }

        @Override // androidx.recyclerview.widget.j
        public void r(int i10) {
            this.f3798a.K0(i10);
        }
    }

    /* synthetic */ j(RecyclerView.p pVar, a aVar) {
        this(pVar);
    }

    public static j a(RecyclerView.p pVar) {
        return new a(pVar);
    }

    public static j b(RecyclerView.p pVar, int i10) {
        if (i10 != 0) {
            if (i10 == 1) {
                return c(pVar);
            }
            throw new IllegalArgumentException("invalid orientation");
        }
        return a(pVar);
    }

    public static j c(RecyclerView.p pVar) {
        return new b(pVar);
    }

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f(View view);

    public abstract int g(View view);

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public abstract int m();

    public abstract int n();

    public int o() {
        if (Integer.MIN_VALUE == this.f3799b) {
            return 0;
        }
        return n() - this.f3799b;
    }

    public abstract int p(View view);

    public abstract int q(View view);

    public abstract void r(int i10);

    public void s() {
        this.f3799b = n();
    }

    private j(RecyclerView.p pVar) {
        this.f3799b = RecyclerView.UNDEFINED_DURATION;
        this.f3800c = new Rect();
        this.f3798a = pVar;
    }
}
