package com.fyber.inneractive.sdk.player.ui;

import android.content.Context;
import android.widget.ImageView;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.y;
import com.fyber.inneractive.sdk.util.l;
import com.fyber.inneractive.sdk.util.q0;
import com.ironsource.mediationsdk.utils.IronSourceConstants;

/* loaded from: classes2.dex */
public class f extends i {
    public f(Context context) {
        super(context);
    }

    @Override // com.fyber.inneractive.sdk.player.ui.c
    public void a(q0 q0Var, int i10, int i11) {
        if (q0Var == null) {
            return;
        }
        UnitDisplayType unitDisplayType = this.f19767d;
        if (unitDisplayType == UnitDisplayType.SQUARE) {
            int min = Math.min(i10, this.f19765b) - l.b(((y) this.f19766c).f17077f.f16904f.intValue() * 2);
            q0Var.f20323a = min;
            q0Var.f20324b = min;
        } else if (unitDisplayType == UnitDisplayType.LANDSCAPE) {
            int min2 = Math.min(i10, this.f19765b) - l.b(((y) this.f19766c).f17077f.f16904f.intValue() * 2);
            q0Var.f20323a = min2;
            q0Var.f20324b = (min2 * 9) / 16;
        } else if (unitDisplayType == UnitDisplayType.MRECT) {
            q0Var.f20323a = l.b((int) ms.bd.o.Pgl.c.COLLECT_MODE_FINANCE);
            q0Var.f20324b = l.b((int) IronSourceConstants.INTERSTITIAL_DAILY_CAPPED);
        } else if (unitDisplayType == UnitDisplayType.DEFAULT && this.f19783s) {
            a(q0Var, this.f19781q, this.f19782r, i10, i11);
        } else {
            q0Var.f20323a = 0;
            q0Var.f20324b = 0;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.i
    public void g() {
        q0 q0Var = new q0(0, 0);
        this.B = q0Var;
        if (this.f19767d == UnitDisplayType.SQUARE) {
            ImageView imageView = this.f19773i;
            if (imageView != null) {
                imageView.getLayoutParams().width = this.A.f20323a;
                this.f19773i.getLayoutParams().height = this.A.f20323a;
            }
            q0 q0Var2 = this.B;
            int i10 = this.f19781q;
            int i11 = this.f19782r;
            int i12 = this.A.f20323a;
            a(q0Var2, i10, i11, i12, i12);
            return;
        }
        int i13 = this.f19781q;
        int i14 = this.f19782r;
        q0 q0Var3 = this.A;
        a(q0Var, i13, i14, q0Var3.f20323a, q0Var3.f20324b);
        ImageView imageView2 = this.f19773i;
        if (imageView2 != null) {
            imageView2.getLayoutParams().width = this.B.f20323a;
            this.f19773i.getLayoutParams().height = this.B.f20324b;
        }
    }
}
