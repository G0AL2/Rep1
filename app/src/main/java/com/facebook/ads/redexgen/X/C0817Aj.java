package com.facebook.ads.redexgen.X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Aj  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0817Aj extends QK {
    public C0817Aj(C1400Xy c1400Xy) {
        super(c1400Xy);
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public final void onMeasure(int newHeightSpec, int i10) {
        if (View.MeasureSpec.getMode(newHeightSpec) == 1073741824) {
            i10 = newHeightSpec;
        } else if (View.MeasureSpec.getMode(i10) == 1073741824) {
            newHeightSpec = i10;
        }
        super.onMeasure(newHeightSpec, i10);
    }
}
