package f1;

import android.annotation.SuppressLint;
import android.view.View;

/* compiled from: ViewUtilsApi19.java */
/* loaded from: classes.dex */
class d0 extends i0 {

    /* renamed from: e  reason: collision with root package name */
    private static boolean f29967e = true;

    @Override // f1.i0
    public void a(View view) {
    }

    @Override // f1.i0
    @SuppressLint({"NewApi"})
    public float c(View view) {
        if (f29967e) {
            try {
                return view.getTransitionAlpha();
            } catch (NoSuchMethodError unused) {
                f29967e = false;
            }
        }
        return view.getAlpha();
    }

    @Override // f1.i0
    public void d(View view) {
    }

    @Override // f1.i0
    @SuppressLint({"NewApi"})
    public void f(View view, float f10) {
        if (f29967e) {
            try {
                view.setTransitionAlpha(f10);
                return;
            } catch (NoSuchMethodError unused) {
                f29967e = false;
            }
        }
        view.setAlpha(f10);
    }
}
