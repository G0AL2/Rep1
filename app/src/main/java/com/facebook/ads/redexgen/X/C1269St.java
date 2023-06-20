package com.facebook.ads.redexgen.X;

import android.content.res.Resources;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.St  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1269St extends AbstractC1151Of {
    public static final int A01 = Resources.getSystem().getDisplayMetrics().widthPixels;
    public final C1160Oo A00;

    public C1269St(C1155Oj c1155Oj, boolean z10) {
        super(c1155Oj, z10);
        this.A00 = new C1160Oo(c1155Oj.A05(), c1155Oj.A02());
        this.A00.A01(getTitleDescContainer(), z10);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(12);
        layoutParams.setMargins(AbstractC1151Of.A08, AbstractC1151Of.A08, AbstractC1151Of.A08, AbstractC1151Of.A08);
        getCtaButton().setLayoutParams(layoutParams);
        FrameLayout frameLayout = new FrameLayout(c1155Oj.A05());
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams2.addRule(2, getCtaButton().getId());
        frameLayout.setLayoutParams(layoutParams2);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams3.gravity = 17;
        layoutParams3.setMargins(AbstractC1151Of.A08, 0, AbstractC1151Of.A08, 0);
        frameLayout.addView(this.A00, layoutParams3);
        addView(frameLayout);
        addView(getCtaButton());
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1151Of
    public final boolean A02() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1151Of
    public final boolean A0B() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1151Of
    public final void A0b(C1B c1b, String str, double d10, @Nullable Bundle bundle) {
        super.A0b(c1b, str, d10, bundle);
        if (d10 > 0.0d) {
            this.A00.A00((int) ((A01 - (AbstractC1151Of.A08 * 2)) / d10));
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1151Of
    public final boolean A0c() {
        return false;
    }
}
