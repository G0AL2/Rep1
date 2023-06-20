package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.z;
import ha.k;
import xa.g;
import xa.h;

/* loaded from: classes2.dex */
public class MaterialToolbar extends Toolbar {
    private static final int R = k.f31266o;

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, ha.b.D);
    }

    private void S(Context context) {
        Drawable background = getBackground();
        if (background == null || (background instanceof ColorDrawable)) {
            g gVar = new g();
            gVar.U(ColorStateList.valueOf(background != null ? ((ColorDrawable) background).getColor() : 0));
            gVar.L(context);
            gVar.T(z.w(this));
            z.u0(this, gVar);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        h.e(this);
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        h.d(this, f10);
    }

    public MaterialToolbar(Context context, AttributeSet attributeSet, int i10) {
        super(com.google.android.material.internal.g.f(context, attributeSet, i10, R), attributeSet, i10);
        S(getContext());
    }
}
