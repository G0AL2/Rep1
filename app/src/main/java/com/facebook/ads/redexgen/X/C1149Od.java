package com.facebook.ads.redexgen.X;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: com.facebook.ads.redexgen.X.Od  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1149Od {
    public static final int A00 = MS.A00();

    public static void A00(C1400Xy c1400Xy, ViewGroup viewGroup, String str) {
        new T3(viewGroup, c1400Xy).A07(str);
        View view = new View(c1400Xy);
        view.setId(A00);
        view.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        MS.A0R(view, c1400Xy);
        viewGroup.addView(view, 0);
    }
}
