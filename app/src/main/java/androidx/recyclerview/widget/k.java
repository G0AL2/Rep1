package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.Api;

/* compiled from: PagerSnapHelper.java */
/* loaded from: classes.dex */
public class k extends o {

    /* renamed from: d  reason: collision with root package name */
    private j f3801d;

    /* renamed from: e  reason: collision with root package name */
    private j f3802e;

    /* compiled from: PagerSnapHelper.java */
    /* loaded from: classes.dex */
    class a extends g {
        a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.g, androidx.recyclerview.widget.RecyclerView.z
        protected void o(View view, RecyclerView.a0 a0Var, RecyclerView.z.a aVar) {
            k kVar = k.this;
            int[] c10 = kVar.c(kVar.f3809a.getLayoutManager(), view);
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

        @Override // androidx.recyclerview.widget.g
        protected int x(int i10) {
            return Math.min(100, super.x(i10));
        }
    }

    private int m(View view, j jVar) {
        return (jVar.g(view) + (jVar.e(view) / 2)) - (jVar.m() + (jVar.n() / 2));
    }

    private View n(RecyclerView.p pVar, j jVar) {
        int T = pVar.T();
        View view = null;
        if (T == 0) {
            return null;
        }
        int m10 = jVar.m() + (jVar.n() / 2);
        int i10 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        for (int i11 = 0; i11 < T; i11++) {
            View S = pVar.S(i11);
            int abs = Math.abs((jVar.g(S) + (jVar.e(S) / 2)) - m10);
            if (abs < i10) {
                view = S;
                i10 = abs;
            }
        }
        return view;
    }

    private j o(RecyclerView.p pVar) {
        j jVar = this.f3802e;
        if (jVar == null || jVar.f3798a != pVar) {
            this.f3802e = j.a(pVar);
        }
        return this.f3802e;
    }

    private j p(RecyclerView.p pVar) {
        if (pVar.v()) {
            return q(pVar);
        }
        if (pVar.u()) {
            return o(pVar);
        }
        return null;
    }

    private j q(RecyclerView.p pVar) {
        j jVar = this.f3801d;
        if (jVar == null || jVar.f3798a != pVar) {
            this.f3801d = j.c(pVar);
        }
        return this.f3801d;
    }

    private boolean r(RecyclerView.p pVar, int i10, int i11) {
        return pVar.u() ? i10 > 0 : i11 > 0;
    }

    private boolean s(RecyclerView.p pVar) {
        PointF a10;
        int i02 = pVar.i0();
        if (!(pVar instanceof RecyclerView.z.b) || (a10 = ((RecyclerView.z.b) pVar).a(i02 - 1)) == null) {
            return false;
        }
        return a10.x < 0.0f || a10.y < 0.0f;
    }

    @Override // androidx.recyclerview.widget.o
    public int[] c(RecyclerView.p pVar, View view) {
        int[] iArr = new int[2];
        if (pVar.u()) {
            iArr[0] = m(view, o(pVar));
        } else {
            iArr[0] = 0;
        }
        if (pVar.v()) {
            iArr[1] = m(view, q(pVar));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.o
    protected RecyclerView.z e(RecyclerView.p pVar) {
        if (pVar instanceof RecyclerView.z.b) {
            return new a(this.f3809a.getContext());
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.o
    public View h(RecyclerView.p pVar) {
        if (pVar.v()) {
            return n(pVar, q(pVar));
        }
        if (pVar.u()) {
            return n(pVar, o(pVar));
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.o
    public int i(RecyclerView.p pVar, int i10, int i11) {
        j p10;
        int i02 = pVar.i0();
        if (i02 == 0 || (p10 = p(pVar)) == null) {
            return -1;
        }
        int i12 = RecyclerView.UNDEFINED_DURATION;
        int i13 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        int T = pVar.T();
        View view = null;
        View view2 = null;
        for (int i14 = 0; i14 < T; i14++) {
            View S = pVar.S(i14);
            if (S != null) {
                int m10 = m(S, p10);
                if (m10 <= 0 && m10 > i12) {
                    view2 = S;
                    i12 = m10;
                }
                if (m10 >= 0 && m10 < i13) {
                    view = S;
                    i13 = m10;
                }
            }
        }
        boolean r10 = r(pVar, i10, i11);
        if (!r10 || view == null) {
            if (r10 || view2 == null) {
                if (r10) {
                    view = view2;
                }
                if (view == null) {
                    return -1;
                }
                int n02 = pVar.n0(view) + (s(pVar) == r10 ? -1 : 1);
                if (n02 < 0 || n02 >= i02) {
                    return -1;
                }
                return n02;
            }
            return pVar.n0(view2);
        }
        return pVar.n0(view);
    }
}
