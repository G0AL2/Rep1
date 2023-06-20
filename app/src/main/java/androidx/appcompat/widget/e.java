package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AppCompatBackgroundHelper.java */
/* loaded from: classes.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    private final View f1485a;

    /* renamed from: d  reason: collision with root package name */
    private x0 f1488d;

    /* renamed from: e  reason: collision with root package name */
    private x0 f1489e;

    /* renamed from: f  reason: collision with root package name */
    private x0 f1490f;

    /* renamed from: c  reason: collision with root package name */
    private int f1487c = -1;

    /* renamed from: b  reason: collision with root package name */
    private final k f1486b = k.b();

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(View view) {
        this.f1485a = view;
    }

    private boolean a(Drawable drawable) {
        if (this.f1490f == null) {
            this.f1490f = new x0();
        }
        x0 x0Var = this.f1490f;
        x0Var.a();
        ColorStateList s10 = androidx.core.view.z.s(this.f1485a);
        if (s10 != null) {
            x0Var.f1753d = true;
            x0Var.f1750a = s10;
        }
        PorterDuff.Mode t10 = androidx.core.view.z.t(this.f1485a);
        if (t10 != null) {
            x0Var.f1752c = true;
            x0Var.f1751b = t10;
        }
        if (x0Var.f1753d || x0Var.f1752c) {
            k.i(drawable, x0Var, this.f1485a.getDrawableState());
            return true;
        }
        return false;
    }

    private boolean k() {
        int i10 = Build.VERSION.SDK_INT;
        return i10 > 21 ? this.f1488d != null : i10 == 21;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        Drawable background = this.f1485a.getBackground();
        if (background != null) {
            if (k() && a(background)) {
                return;
            }
            x0 x0Var = this.f1489e;
            if (x0Var != null) {
                k.i(background, x0Var, this.f1485a.getDrawableState());
                return;
            }
            x0 x0Var2 = this.f1488d;
            if (x0Var2 != null) {
                k.i(background, x0Var2, this.f1485a.getDrawableState());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ColorStateList c() {
        x0 x0Var = this.f1489e;
        if (x0Var != null) {
            return x0Var.f1750a;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public PorterDuff.Mode d() {
        x0 x0Var = this.f1489e;
        if (x0Var != null) {
            return x0Var.f1751b;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(AttributeSet attributeSet, int i10) {
        Context context = this.f1485a.getContext();
        int[] iArr = d.j.G3;
        z0 v10 = z0.v(context, attributeSet, iArr, i10, 0);
        View view = this.f1485a;
        androidx.core.view.z.o0(view, view.getContext(), iArr, attributeSet, v10.r(), i10, 0);
        try {
            int i11 = d.j.H3;
            if (v10.s(i11)) {
                this.f1487c = v10.n(i11, -1);
                ColorStateList f10 = this.f1486b.f(this.f1485a.getContext(), this.f1487c);
                if (f10 != null) {
                    h(f10);
                }
            }
            int i12 = d.j.I3;
            if (v10.s(i12)) {
                androidx.core.view.z.v0(this.f1485a, v10.c(i12));
            }
            int i13 = d.j.J3;
            if (v10.s(i13)) {
                androidx.core.view.z.w0(this.f1485a, g0.e(v10.k(i13, -1), null));
            }
        } finally {
            v10.w();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f(Drawable drawable) {
        this.f1487c = -1;
        h(null);
        b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g(int i10) {
        this.f1487c = i10;
        k kVar = this.f1486b;
        h(kVar != null ? kVar.f(this.f1485a.getContext(), i10) : null);
        b();
    }

    void h(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f1488d == null) {
                this.f1488d = new x0();
            }
            x0 x0Var = this.f1488d;
            x0Var.f1750a = colorStateList;
            x0Var.f1753d = true;
        } else {
            this.f1488d = null;
        }
        b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i(ColorStateList colorStateList) {
        if (this.f1489e == null) {
            this.f1489e = new x0();
        }
        x0 x0Var = this.f1489e;
        x0Var.f1750a = colorStateList;
        x0Var.f1753d = true;
        b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j(PorterDuff.Mode mode) {
        if (this.f1489e == null) {
            this.f1489e = new x0();
        }
        x0 x0Var = this.f1489e;
        x0Var.f1751b = mode;
        x0Var.f1752c = true;
        b();
    }
}
