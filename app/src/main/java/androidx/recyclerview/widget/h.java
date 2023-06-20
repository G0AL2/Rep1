package androidx.recyclerview.widget;

import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.Api;

/* compiled from: LinearSnapHelper.java */
/* loaded from: classes.dex */
public class h extends o {

    /* renamed from: d  reason: collision with root package name */
    private j f3795d;

    /* renamed from: e  reason: collision with root package name */
    private j f3796e;

    private float m(RecyclerView.p pVar, j jVar) {
        int T = pVar.T();
        if (T == 0) {
            return 1.0f;
        }
        View view = null;
        View view2 = null;
        int i10 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        int i11 = RecyclerView.UNDEFINED_DURATION;
        for (int i12 = 0; i12 < T; i12++) {
            View S = pVar.S(i12);
            int n02 = pVar.n0(S);
            if (n02 != -1) {
                if (n02 < i10) {
                    view = S;
                    i10 = n02;
                }
                if (n02 > i11) {
                    view2 = S;
                    i11 = n02;
                }
            }
        }
        if (view == null || view2 == null) {
            return 1.0f;
        }
        int max = Math.max(jVar.d(view), jVar.d(view2)) - Math.min(jVar.g(view), jVar.g(view2));
        if (max == 0) {
            return 1.0f;
        }
        return (max * 1.0f) / ((i11 - i10) + 1);
    }

    private int n(View view, j jVar) {
        return (jVar.g(view) + (jVar.e(view) / 2)) - (jVar.m() + (jVar.n() / 2));
    }

    private int o(RecyclerView.p pVar, j jVar, int i10, int i11) {
        int[] d10 = d(i10, i11);
        float m10 = m(pVar, jVar);
        if (m10 <= 0.0f) {
            return 0;
        }
        return Math.round((Math.abs(d10[0]) > Math.abs(d10[1]) ? d10[0] : d10[1]) / m10);
    }

    private View p(RecyclerView.p pVar, j jVar) {
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

    private j q(RecyclerView.p pVar) {
        j jVar = this.f3796e;
        if (jVar == null || jVar.f3798a != pVar) {
            this.f3796e = j.a(pVar);
        }
        return this.f3796e;
    }

    private j r(RecyclerView.p pVar) {
        j jVar = this.f3795d;
        if (jVar == null || jVar.f3798a != pVar) {
            this.f3795d = j.c(pVar);
        }
        return this.f3795d;
    }

    @Override // androidx.recyclerview.widget.o
    public int[] c(RecyclerView.p pVar, View view) {
        int[] iArr = new int[2];
        if (pVar.u()) {
            iArr[0] = n(view, q(pVar));
        } else {
            iArr[0] = 0;
        }
        if (pVar.v()) {
            iArr[1] = n(view, r(pVar));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.o
    public View h(RecyclerView.p pVar) {
        if (pVar.v()) {
            return p(pVar, r(pVar));
        }
        if (pVar.u()) {
            return p(pVar, q(pVar));
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.o
    public int i(RecyclerView.p pVar, int i10, int i11) {
        int i02;
        View h10;
        int n02;
        int i12;
        PointF a10;
        int i13;
        int i14;
        if (!(pVar instanceof RecyclerView.z.b) || (i02 = pVar.i0()) == 0 || (h10 = h(pVar)) == null || (n02 = pVar.n0(h10)) == -1 || (a10 = ((RecyclerView.z.b) pVar).a(i02 - 1)) == null) {
            return -1;
        }
        if (pVar.u()) {
            i13 = o(pVar, q(pVar), i10, 0);
            if (a10.x < 0.0f) {
                i13 = -i13;
            }
        } else {
            i13 = 0;
        }
        if (pVar.v()) {
            i14 = o(pVar, r(pVar), 0, i11);
            if (a10.y < 0.0f) {
                i14 = -i14;
            }
        } else {
            i14 = 0;
        }
        if (pVar.v()) {
            i13 = i14;
        }
        if (i13 == 0) {
            return -1;
        }
        int i15 = n02 + i13;
        int i16 = i15 >= 0 ? i15 : 0;
        return i16 >= i02 ? i12 : i16;
    }
}
