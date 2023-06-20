package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.ba  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1552ba extends C3M {
    public static String[] A01 = {"OZnJYNnF6iNpWafuL0M1gR4fftLtNKLH", "jp3I09eVvza8VUO8I2V9bgD0uqoo2eoT", "o0dN6TNbDPM1OFHwgByg4fes3ij5f0X", "koNydS70AznyGH22QswPXmmCOWqgW7Lp", "FfQJA5dgq067zFURnAgi95yx0TDwU15M", "ldbJEvhnHaVxGyPD7qN3mcBmJCgMtAqs", "ixVhzklDdFphFwHpdcaKVfByjOKIZSaQ", "Bo7wQ6HJBqNsqngGB"};
    public int A00;

    public C1552ba(Context context) {
        super(context);
        this.A00 = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A00(int i10) {
        this.A00 = i10;
    }

    @Override // com.facebook.ads.redexgen.X.C3M, android.view.View
    public final void onMeasure(int i10, int i11) {
        int measuredHeight;
        int h10 = this.A00;
        int i12 = 0;
        while (true) {
            int childCount = getChildCount();
            String[] strArr = A01;
            if (strArr[4].charAt(3) != strArr[0].charAt(3)) {
                throw new RuntimeException();
            }
            A01[2] = "oQM5as2Hx349sp";
            if (i12 < childCount) {
                View childAt = getChildAt(i12);
                childAt.measure(i10, View.MeasureSpec.makeMeasureSpec(0, 0));
                if (A01[3].charAt(2) != 'N') {
                    measuredHeight = childAt.getMeasuredHeight();
                    if (measuredHeight <= h10) {
                        i12++;
                    }
                    h10 = measuredHeight;
                    i12++;
                } else {
                    A01[7] = "8uJesuWryF1bocGxs";
                    measuredHeight = childAt.getMeasuredHeight();
                    if (measuredHeight <= h10) {
                        i12++;
                    }
                    h10 = measuredHeight;
                    i12++;
                }
            } else {
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(h10, 1073741824));
                return;
            }
        }
    }
}
