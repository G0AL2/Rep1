package com.facebook.ads.redexgen.X;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: assets/audience_network.dex */
public final class PU {
    public final int[] A00(View view, int i10, int i11) {
        C4U c4u = (C4U) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i10, view.getPaddingLeft() + view.getPaddingRight(), c4u.width), ViewGroup.getChildMeasureSpec(i11, view.getPaddingTop() + view.getPaddingBottom(), c4u.height));
        return new int[]{view.getMeasuredWidth() + c4u.leftMargin + c4u.rightMargin, view.getMeasuredHeight() + c4u.bottomMargin + c4u.topMargin};
    }
}
