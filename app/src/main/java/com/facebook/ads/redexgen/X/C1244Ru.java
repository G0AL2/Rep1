package com.facebook.ads.redexgen.X;

import android.widget.ImageView;
import android.widget.RelativeLayout;

/* renamed from: com.facebook.ads.redexgen.X.Ru  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1244Ru extends OX {
    public final ImageView A00;
    public final C1400Xy A01;

    public C1244Ru(C1400Xy c1400Xy) {
        super(c1400Xy);
        this.A01 = c1400Xy;
        this.A00 = new ImageView(c1400Xy);
        this.A00.setAdjustViewBounds(true);
        addView(this.A00, new RelativeLayout.LayoutParams(-2, -1));
    }

    public final void A00(String str) {
        T3 t32 = new T3(this.A00, this.A01);
        t32.A04();
        t32.A07(str);
    }
}
