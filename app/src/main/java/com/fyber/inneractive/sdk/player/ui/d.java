package com.fyber.inneractive.sdk.player.ui;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.util.q0;

/* loaded from: classes2.dex */
public class d extends i {
    public d(Context context) {
        super(context);
    }

    @Override // com.fyber.inneractive.sdk.player.ui.c
    public void a(q0 q0Var, int i10, int i11) {
        if (this.f19767d == UnitDisplayType.DEFAULT && this.f19783s) {
            a(q0Var, this.f19781q, this.f19782r, i10, i11);
        }
        q0Var.f20323a = 0;
        q0Var.f20324b = 0;
    }

    @Override // com.fyber.inneractive.sdk.player.ui.i
    public void g() {
        q0 q0Var = new q0(0, 0);
        this.B = q0Var;
        if (this.f19767d == UnitDisplayType.SQUARE) {
            int min = Math.min(this.A.f20323a, this.f19765b);
            ViewGroup viewGroup = this.f19774j;
            if (viewGroup != null) {
                viewGroup.getLayoutParams().width = min;
                this.f19774j.getLayoutParams().height = min;
            }
            ImageView imageView = this.f19773i;
            if (imageView != null) {
                imageView.getLayoutParams().width = min;
                this.f19773i.getLayoutParams().height = min;
            }
            a(this.B, this.f19781q, this.f19782r, min, min);
            return;
        }
        int i10 = this.f19781q;
        int i11 = this.f19782r;
        q0 q0Var2 = this.A;
        a(q0Var, i10, i11, q0Var2.f20323a, q0Var2.f20324b);
        ImageView imageView2 = this.f19773i;
        if (imageView2 != null) {
            imageView2.getLayoutParams().width = this.B.f20323a;
            this.f19773i.getLayoutParams().height = this.B.f20324b;
        }
    }
}
