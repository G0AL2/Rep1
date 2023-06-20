package f1;

import android.graphics.Matrix;
import android.view.View;

/* compiled from: ViewUtilsApi29.java */
/* loaded from: classes.dex */
class h0 extends g0 {
    @Override // f1.d0, f1.i0
    public float c(View view) {
        return view.getTransitionAlpha();
    }

    @Override // f1.f0, f1.i0
    public void e(View view, int i10, int i11, int i12, int i13) {
        view.setLeftTopRightBottom(i10, i11, i12, i13);
    }

    @Override // f1.d0, f1.i0
    public void f(View view, float f10) {
        view.setTransitionAlpha(f10);
    }

    @Override // f1.g0, f1.i0
    public void g(View view, int i10) {
        view.setTransitionVisibility(i10);
    }

    @Override // f1.e0, f1.i0
    public void h(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // f1.e0, f1.i0
    public void i(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
