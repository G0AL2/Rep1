package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;

/* loaded from: assets/audience_network.dex */
public class FB extends C1587cA {
    public final /* synthetic */ FA A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FB(FA fa2, Context context) {
        super(context);
        this.A00 = fa2;
    }

    @Override // com.facebook.ads.redexgen.X.C1587cA, com.facebook.ads.redexgen.X.AbstractC06724g
    public final void A0I(View view, C06744i c06744i, C06704e c06704e) {
        FA fa2 = this.A00;
        int[] A0H = fa2.A0H(((AbstractC1573bv) fa2).A00.getLayoutManager(), view);
        int i10 = A0H[0];
        int i11 = A0H[1];
        int A0M = A0M(Math.max(Math.abs(i10), Math.abs(i11)));
        if (A0M > 0) {
            c06704e.A04(i10, i11, A0M, ((C1587cA) this).A04);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C1587cA
    public final float A0J(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }

    @Override // com.facebook.ads.redexgen.X.C1587cA
    public final int A0L(int i10) {
        return Math.min(100, super.A0L(i10));
    }
}
