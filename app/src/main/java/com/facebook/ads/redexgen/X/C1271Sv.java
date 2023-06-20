package com.facebook.ads.redexgen.X;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.Sv  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1271Sv extends AbstractC1151Of {
    public C1271Sv(C1155Oj c1155Oj, boolean z10) {
        super(c1155Oj, true);
        RelativeLayout relativeLayout = new RelativeLayout(c1155Oj.A05());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(12);
        MS.A0R(relativeLayout, getAdContextWrapper());
        LinearLayout linearLayout = new LinearLayout(c1155Oj.A05());
        linearLayout.setOrientation(!z10 ? 1 : 0);
        linearLayout.setGravity(80);
        MS.A0K(linearLayout);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins(AbstractC1151Of.A08, 0, AbstractC1151Of.A08, AbstractC1151Of.A08);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(z10 ? -2 : -1, -2);
        layoutParams3.setMargins(z10 ? AbstractC1151Of.A08 : 0, z10 ? 0 : AbstractC1151Of.A08, 0, 0);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(z10 ? 0 : -1, -2);
        layoutParams4.setMargins(0, 0, 0, 0);
        layoutParams4.weight = 1.0f;
        LinearLayout auxContainer = getTitleDescContainer();
        linearLayout.addView(auxContainer, layoutParams4);
        linearLayout.addView(getCtaButton(), layoutParams3);
        relativeLayout.addView(linearLayout, layoutParams2);
        addView(c1155Oj.A02(), new RelativeLayout.LayoutParams(-1, -1));
        addView(relativeLayout, layoutParams);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1151Of
    public final void A0b(C1B c1b, String str, double d10, @Nullable Bundle bundle) {
        super.A0b(c1b, str, d10, bundle);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1151Of
    public final boolean A0c() {
        return true;
    }
}
