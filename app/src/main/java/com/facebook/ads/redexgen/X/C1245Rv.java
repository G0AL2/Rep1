package com.facebook.ads.redexgen.X;

import android.view.ViewGroup;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Rv  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1245Rv extends C4H<C1243Rt> {
    public final int A00;
    public final C1400Xy A01;
    public final List<String> A02;

    public C1245Rv(C1400Xy c1400Xy, List<String> screenshotUrls, int i10) {
        this.A02 = screenshotUrls;
        this.A00 = i10;
        this.A01 = c1400Xy;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C4H
    /* renamed from: A01 */
    public final C1243Rt A06(ViewGroup viewGroup, int i10) {
        return new C1243Rt(new C1244Ru(this.A01));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C4H
    /* renamed from: A02 */
    public final void A0E(C1243Rt c1243Rt, int leftMargin) {
        int i10;
        String str = this.A02.get(leftMargin);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -1);
        int i11 = this.A00;
        int startSpacing = i11 * 4;
        if (leftMargin == 0) {
            i11 = startSpacing;
        }
        int startSpacing2 = A0D();
        if (leftMargin >= startSpacing2 - 1) {
            int startSpacing3 = this.A00;
            i10 = startSpacing3 * 4;
        } else {
            i10 = this.A00;
        }
        marginLayoutParams.setMargins(i11, 0, i10, 0);
        c1243Rt.A0l().setLayoutParams(marginLayoutParams);
        c1243Rt.A0l().A00(str);
    }

    @Override // com.facebook.ads.redexgen.X.C4H
    public final int A0D() {
        return this.A02.size();
    }
}
