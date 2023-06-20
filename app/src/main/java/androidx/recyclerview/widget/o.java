package androidx.recyclerview.widget;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.Api;

/* compiled from: SnapHelper.java */
/* loaded from: classes.dex */
public abstract class o extends RecyclerView.s {

    /* renamed from: a  reason: collision with root package name */
    RecyclerView f3809a;

    /* renamed from: b  reason: collision with root package name */
    private Scroller f3810b;

    /* renamed from: c  reason: collision with root package name */
    private final RecyclerView.u f3811c = new a();

    /* compiled from: SnapHelper.java */
    /* loaded from: classes.dex */
    class a extends RecyclerView.u {

        /* renamed from: a  reason: collision with root package name */
        boolean f3812a = false;

        a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void a(RecyclerView recyclerView, int i10) {
            super.a(recyclerView, i10);
            if (i10 == 0 && this.f3812a) {
                this.f3812a = false;
                o.this.l();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void b(RecyclerView recyclerView, int i10, int i11) {
            if (i10 == 0 && i11 == 0) {
                return;
            }
            this.f3812a = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SnapHelper.java */
    /* loaded from: classes.dex */
    public class b extends g {
        b(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.g, androidx.recyclerview.widget.RecyclerView.z
        protected void o(View view, RecyclerView.a0 a0Var, RecyclerView.z.a aVar) {
            o oVar = o.this;
            RecyclerView recyclerView = oVar.f3809a;
            if (recyclerView == null) {
                return;
            }
            int[] c10 = oVar.c(recyclerView.getLayoutManager(), view);
            int i10 = c10[0];
            int i11 = c10[1];
            int w10 = w(Math.max(Math.abs(i10), Math.abs(i11)));
            if (w10 > 0) {
                aVar.d(i10, i11, w10, this.f3788j);
            }
        }

        @Override // androidx.recyclerview.widget.g
        protected float v(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }
    }

    private void g() {
        this.f3809a.removeOnScrollListener(this.f3811c);
        this.f3809a.setOnFlingListener(null);
    }

    private void j() throws IllegalStateException {
        if (this.f3809a.getOnFlingListener() == null) {
            this.f3809a.addOnScrollListener(this.f3811c);
            this.f3809a.setOnFlingListener(this);
            return;
        }
        throw new IllegalStateException("An instance of OnFlingListener already set.");
    }

    private boolean k(RecyclerView.p pVar, int i10, int i11) {
        RecyclerView.z e10;
        int i12;
        if (!(pVar instanceof RecyclerView.z.b) || (e10 = e(pVar)) == null || (i12 = i(pVar, i10, i11)) == -1) {
            return false;
        }
        e10.p(i12);
        pVar.R1(e10);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public boolean a(int i10, int i11) {
        RecyclerView.p layoutManager = this.f3809a.getLayoutManager();
        if (layoutManager == null || this.f3809a.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.f3809a.getMinFlingVelocity();
        return (Math.abs(i11) > minFlingVelocity || Math.abs(i10) > minFlingVelocity) && k(layoutManager, i10, i11);
    }

    public void b(RecyclerView recyclerView) throws IllegalStateException {
        RecyclerView recyclerView2 = this.f3809a;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            g();
        }
        this.f3809a = recyclerView;
        if (recyclerView != null) {
            j();
            this.f3810b = new Scroller(this.f3809a.getContext(), new DecelerateInterpolator());
            l();
        }
    }

    public abstract int[] c(RecyclerView.p pVar, View view);

    public int[] d(int i10, int i11) {
        this.f3810b.fling(0, 0, i10, i11, RecyclerView.UNDEFINED_DURATION, Api.BaseClientBuilder.API_PRIORITY_OTHER, RecyclerView.UNDEFINED_DURATION, Api.BaseClientBuilder.API_PRIORITY_OTHER);
        return new int[]{this.f3810b.getFinalX(), this.f3810b.getFinalY()};
    }

    protected RecyclerView.z e(RecyclerView.p pVar) {
        return f(pVar);
    }

    @Deprecated
    protected g f(RecyclerView.p pVar) {
        if (pVar instanceof RecyclerView.z.b) {
            return new b(this.f3809a.getContext());
        }
        return null;
    }

    public abstract View h(RecyclerView.p pVar);

    public abstract int i(RecyclerView.p pVar, int i10, int i11);

    void l() {
        RecyclerView.p layoutManager;
        View h10;
        RecyclerView recyclerView = this.f3809a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (h10 = h(layoutManager)) == null) {
            return;
        }
        int[] c10 = c(layoutManager, h10);
        if (c10[0] == 0 && c10[1] == 0) {
            return;
        }
        this.f3809a.smoothScrollBy(c10[0], c10[1]);
    }
}
