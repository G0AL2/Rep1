package f1;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.view.View;

/* compiled from: ViewUtilsApi21.java */
/* loaded from: classes.dex */
class e0 extends d0 {

    /* renamed from: f  reason: collision with root package name */
    private static boolean f29977f = true;

    /* renamed from: g  reason: collision with root package name */
    private static boolean f29978g = true;

    @Override // f1.i0
    @SuppressLint({"NewApi"})
    public void h(View view, Matrix matrix) {
        if (f29977f) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                f29977f = false;
            }
        }
    }

    @Override // f1.i0
    @SuppressLint({"NewApi"})
    public void i(View view, Matrix matrix) {
        if (f29978g) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                f29978g = false;
            }
        }
    }
}
