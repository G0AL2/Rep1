package com.facebook.ads.redexgen.X;

import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;

/* loaded from: assets/audience_network.dex */
public class BG extends C1587cA {
    public final /* synthetic */ BF A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BG(BF bf2, C1400Xy c1400Xy) {
        super(c1400Xy);
        this.A00 = bf2;
    }

    @Override // com.facebook.ads.redexgen.X.C1587cA
    public final float A0J(DisplayMetrics displayMetrics) {
        float f10;
        f10 = this.A00.A00;
        return f10 / displayMetrics.densityDpi;
    }

    @Override // com.facebook.ads.redexgen.X.C1587cA
    public final int A0K() {
        return -1;
    }

    @Override // com.facebook.ads.redexgen.X.C1587cA
    public final int A0O(View view, int left) {
        int i10;
        C4T A08 = A08();
        if (!A08.A24()) {
            return 0;
        }
        C4U c4u = (C4U) view.getLayoutParams();
        int start = A08.A0k(view) - c4u.leftMargin;
        int end = A08.A0n(view) + c4u.rightMargin;
        int A0N = A0N(start, end, A08.A0e(), A08.A0h() - A08.A0f(), left);
        i10 = this.A00.A02;
        return A0N + i10;
    }

    @Override // com.facebook.ads.redexgen.X.C1587cA
    public final PointF A0P(int i10) {
        return this.A00.A45(i10);
    }
}
