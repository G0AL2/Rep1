package com.facebook.ads.redexgen.X;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;

/* loaded from: assets/audience_network.dex */
public final class AA extends AbstractC1272Sw {
    public static final int A02 = Resources.getSystem().getDisplayMetrics().widthPixels;
    public final View A00;
    public final boolean A01;

    public AA(C1155Oj c1155Oj, boolean z10) {
        super(c1155Oj, true);
        this.A01 = z10;
        this.A00 = c1155Oj.A02();
        A0f();
        if (this.A01) {
            addView(c1155Oj.A02(), new RelativeLayout.LayoutParams(-1, -1));
        } else {
            FrameLayout frameLayout = new FrameLayout(c1155Oj.A05());
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(2, getAdDetailsView().getId());
            frameLayout.setLayoutParams(layoutParams);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
            layoutParams2.gravity = 17;
            layoutParams2.setMargins(AbstractC1151Of.A08, 0, AbstractC1151Of.A08, 0);
            frameLayout.addView(this.A00, layoutParams2);
            addView(frameLayout);
        }
        getAdDetailsView().bringToFront();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1151Of
    public final boolean A02() {
        return this.A01 && super.A02();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1151Of
    public final boolean A0B() {
        return this.A01 && super.A02();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1272Sw, com.facebook.ads.redexgen.X.AbstractC1151Of
    public final void A0b(C1B c1b, String str, double d10, @Nullable Bundle bundle) {
        super.A0b(c1b, str, d10, bundle);
        if (!this.A01 && d10 > 0.0d) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, (int) ((A02 - (AbstractC1151Of.A08 * 2)) / d10));
            layoutParams.gravity = 17;
            layoutParams.setMargins(AbstractC1151Of.A08, 0, AbstractC1151Of.A08, 0);
            this.A00.setLayoutParams(layoutParams);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1151Of
    public final boolean A0c() {
        return this.A01;
    }
}
