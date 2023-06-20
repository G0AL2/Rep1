package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ImageView;

/* compiled from: AppCompatImageHelper.java */
/* loaded from: classes.dex */
public class q {

    /* renamed from: a  reason: collision with root package name */
    private final ImageView f1644a;

    /* renamed from: b  reason: collision with root package name */
    private x0 f1645b;

    /* renamed from: c  reason: collision with root package name */
    private x0 f1646c;

    /* renamed from: d  reason: collision with root package name */
    private x0 f1647d;

    /* renamed from: e  reason: collision with root package name */
    private int f1648e = 0;

    public q(ImageView imageView) {
        this.f1644a = imageView;
    }

    private boolean a(Drawable drawable) {
        if (this.f1647d == null) {
            this.f1647d = new x0();
        }
        x0 x0Var = this.f1647d;
        x0Var.a();
        ColorStateList a10 = androidx.core.widget.f.a(this.f1644a);
        if (a10 != null) {
            x0Var.f1753d = true;
            x0Var.f1750a = a10;
        }
        PorterDuff.Mode b10 = androidx.core.widget.f.b(this.f1644a);
        if (b10 != null) {
            x0Var.f1752c = true;
            x0Var.f1751b = b10;
        }
        if (x0Var.f1753d || x0Var.f1752c) {
            k.i(drawable, x0Var, this.f1644a.getDrawableState());
            return true;
        }
        return false;
    }

    private boolean l() {
        int i10 = Build.VERSION.SDK_INT;
        return i10 > 21 ? this.f1645b != null : i10 == 21;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        if (this.f1644a.getDrawable() != null) {
            this.f1644a.getDrawable().setLevel(this.f1648e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c() {
        Drawable drawable = this.f1644a.getDrawable();
        if (drawable != null) {
            g0.b(drawable);
        }
        if (drawable != null) {
            if (l() && a(drawable)) {
                return;
            }
            x0 x0Var = this.f1646c;
            if (x0Var != null) {
                k.i(drawable, x0Var, this.f1644a.getDrawableState());
                return;
            }
            x0 x0Var2 = this.f1645b;
            if (x0Var2 != null) {
                k.i(drawable, x0Var2, this.f1644a.getDrawableState());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ColorStateList d() {
        x0 x0Var = this.f1646c;
        if (x0Var != null) {
            return x0Var.f1750a;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public PorterDuff.Mode e() {
        x0 x0Var = this.f1646c;
        if (x0Var != null) {
            return x0Var.f1751b;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean f() {
        return Build.VERSION.SDK_INT < 21 || !(this.f1644a.getBackground() instanceof RippleDrawable);
    }

    public void g(AttributeSet attributeSet, int i10) {
        int n10;
        Context context = this.f1644a.getContext();
        int[] iArr = d.j.M;
        z0 v10 = z0.v(context, attributeSet, iArr, i10, 0);
        ImageView imageView = this.f1644a;
        androidx.core.view.z.o0(imageView, imageView.getContext(), iArr, attributeSet, v10.r(), i10, 0);
        try {
            Drawable drawable = this.f1644a.getDrawable();
            if (drawable == null && (n10 = v10.n(d.j.N, -1)) != -1 && (drawable = e.a.b(this.f1644a.getContext(), n10)) != null) {
                this.f1644a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                g0.b(drawable);
            }
            int i11 = d.j.O;
            if (v10.s(i11)) {
                androidx.core.widget.f.c(this.f1644a, v10.c(i11));
            }
            int i12 = d.j.P;
            if (v10.s(i12)) {
                androidx.core.widget.f.d(this.f1644a, g0.e(v10.k(i12, -1), null));
            }
        } finally {
            v10.w();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h(Drawable drawable) {
        this.f1648e = drawable.getLevel();
    }

    public void i(int i10) {
        if (i10 != 0) {
            Drawable b10 = e.a.b(this.f1644a.getContext(), i10);
            if (b10 != null) {
                g0.b(b10);
            }
            this.f1644a.setImageDrawable(b10);
        } else {
            this.f1644a.setImageDrawable(null);
        }
        c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j(ColorStateList colorStateList) {
        if (this.f1646c == null) {
            this.f1646c = new x0();
        }
        x0 x0Var = this.f1646c;
        x0Var.f1750a = colorStateList;
        x0Var.f1753d = true;
        c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void k(PorterDuff.Mode mode) {
        if (this.f1646c == null) {
            this.f1646c = new x0();
        }
        x0 x0Var = this.f1646c;
        x0Var.f1751b = mode;
        x0Var.f1752c = true;
        c();
    }
}
