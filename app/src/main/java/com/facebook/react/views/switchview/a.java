package com.facebook.react.views.switchview;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import androidx.appcompat.widget.t0;

/* compiled from: ReactSwitch.java */
/* loaded from: classes.dex */
class a extends t0 {
    private boolean T;
    private Integer U;
    private Integer V;

    public a(Context context) {
        super(context);
        this.T = true;
        this.U = null;
        this.V = null;
    }

    private ColorStateList r(Integer num) {
        return new ColorStateList(new int[][]{new int[]{16842919}}, new int[]{num.intValue()});
    }

    private void w(boolean z10) {
        Integer num = this.V;
        if (num == null && this.U == null) {
            return;
        }
        if (!z10) {
            num = this.U;
        }
        v(num);
    }

    void s(Drawable drawable, Integer num) {
        if (num == null) {
            drawable.clearColorFilter();
        } else {
            drawable.setColorFilter(num.intValue(), PorterDuff.Mode.MULTIPLY);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        if (Build.VERSION.SDK_INT >= 21) {
            setBackground(new RippleDrawable(r(Integer.valueOf(i10)), new ColorDrawable(i10), null));
        } else {
            super.setBackgroundColor(i10);
        }
    }

    @Override // androidx.appcompat.widget.t0, android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z10) {
        if (this.T && isChecked() != z10) {
            this.T = false;
            super.setChecked(z10);
            w(z10);
            return;
        }
        super.setChecked(isChecked());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void t(boolean z10) {
        if (isChecked() != z10) {
            super.setChecked(z10);
            w(z10);
        }
        this.T = true;
    }

    public void u(Integer num) {
        s(super.getThumbDrawable(), num);
        if (num == null || !(super.getBackground() instanceof RippleDrawable)) {
            return;
        }
        ((RippleDrawable) super.getBackground()).setColor(r(num));
    }

    public void v(Integer num) {
        s(super.getTrackDrawable(), num);
    }

    public void x(Integer num) {
        if (num == this.U) {
            return;
        }
        this.U = num;
        if (isChecked()) {
            return;
        }
        v(this.U);
    }

    public void y(Integer num) {
        if (num == this.V) {
            return;
        }
        this.V = num;
        if (isChecked()) {
            v(this.V);
        }
    }
}
