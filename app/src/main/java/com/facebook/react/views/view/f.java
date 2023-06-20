package com.facebook.react.views.view;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import androidx.core.view.z;

/* compiled from: ReactViewBackgroundManager.java */
/* loaded from: classes.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    private e f16427a;

    /* renamed from: b  reason: collision with root package name */
    private View f16428b;

    public f(View view) {
        this.f16428b = view;
    }

    private e a() {
        if (this.f16427a == null) {
            this.f16427a = new e(this.f16428b.getContext());
            Drawable background = this.f16428b.getBackground();
            z.u0(this.f16428b, null);
            if (background == null) {
                z.u0(this.f16428b, this.f16427a);
            } else {
                z.u0(this.f16428b, new LayerDrawable(new Drawable[]{this.f16427a, background}));
            }
        }
        return this.f16427a;
    }

    public void b(int i10) {
        if (i10 == 0 && this.f16427a == null) {
            return;
        }
        a().x(i10);
    }

    public void c(int i10, float f10, float f11) {
        a().t(i10, f10, f11);
    }

    public void d(float f10) {
        a().y(f10);
    }

    public void e(float f10, int i10) {
        a().z(f10, i10);
    }

    public void f(String str) {
        a().v(str);
    }

    public void g(int i10, float f10) {
        a().w(i10, f10);
    }
}
