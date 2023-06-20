package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ScrollbarHelper.java */
/* loaded from: classes.dex */
public class m {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(RecyclerView.a0 a0Var, j jVar, View view, View view2, RecyclerView.p pVar, boolean z10) {
        if (pVar.T() == 0 || a0Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z10) {
            return Math.abs(pVar.n0(view) - pVar.n0(view2)) + 1;
        }
        return Math.min(jVar.n(), jVar.d(view2) - jVar.g(view));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(RecyclerView.a0 a0Var, j jVar, View view, View view2, RecyclerView.p pVar, boolean z10, boolean z11) {
        int max;
        if (pVar.T() == 0 || a0Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int min = Math.min(pVar.n0(view), pVar.n0(view2));
        int max2 = Math.max(pVar.n0(view), pVar.n0(view2));
        if (z11) {
            max = Math.max(0, (a0Var.b() - max2) - 1);
        } else {
            max = Math.max(0, min);
        }
        if (z10) {
            return Math.round((max * (Math.abs(jVar.d(view2) - jVar.g(view)) / (Math.abs(pVar.n0(view) - pVar.n0(view2)) + 1))) + (jVar.m() - jVar.g(view)));
        }
        return max;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int c(RecyclerView.a0 a0Var, j jVar, View view, View view2, RecyclerView.p pVar, boolean z10) {
        if (pVar.T() == 0 || a0Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z10) {
            return a0Var.b();
        }
        return (int) (((jVar.d(view2) - jVar.g(view)) / (Math.abs(pVar.n0(view) - pVar.n0(view2)) + 1)) * a0Var.b());
    }
}
