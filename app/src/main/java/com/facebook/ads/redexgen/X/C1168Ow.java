package com.facebook.ads.redexgen.X;

import android.graphics.drawable.ColorDrawable;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

/* renamed from: com.facebook.ads.redexgen.X.Ow  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1168Ow {
    public static A3 A00(final C1155Oj c1155Oj, int i10, final String str, final SB sb2) {
        if (i10 == 1) {
            return new A3(c1155Oj, str, sb2) { // from class: com.facebook.ads.redexgen.X.1i
                public static final int A00 = (int) (Lr.A00 * 20.0f);
                public static final int A01 = (int) (Lr.A00 * 16.0f);

                @Override // com.facebook.ads.redexgen.X.AbstractC1151Of
                public final boolean A01() {
                    return false;
                }

                @Override // com.facebook.ads.redexgen.X.A3
                public final void A0j(C1400Xy c1400Xy) {
                    C1148Oc titleDescContainer = getTitleDescContainer();
                    titleDescContainer.setAlignment(3);
                    titleDescContainer.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
                    titleDescContainer.setPadding(0, 0, 0, A00);
                    getCtaButton().setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
                    LinearLayout linearLayout = new LinearLayout(c1400Xy);
                    MS.A0S(linearLayout, new ColorDrawable(-1));
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams.addRule(3, getMediaContainer().getId());
                    linearLayout.setLayoutParams(layoutParams);
                    linearLayout.setOrientation(1);
                    int i11 = A01;
                    linearLayout.setPadding(i11, i11, i11, i11);
                    linearLayout.addView(titleDescContainer);
                    linearLayout.addView(getCtaButton());
                    addView(getMediaContainer());
                    addView(linearLayout);
                }
            };
        }
        return new A3(c1155Oj, str, sb2) { // from class: com.facebook.ads.redexgen.X.26
            public static final int A00 = (int) (Lr.A00 * 12.0f);

            @Override // com.facebook.ads.redexgen.X.AbstractC1151Of
            public final boolean A00() {
                return false;
            }

            @Override // com.facebook.ads.redexgen.X.A3, com.facebook.ads.redexgen.X.AbstractC1151Of
            public final boolean A0B() {
                return false;
            }

            @Override // com.facebook.ads.redexgen.X.A3
            public final void A0j(C1400Xy c1400Xy) {
                C1148Oc titleDescContainer = getTitleDescContainer();
                titleDescContainer.setAlignment(3);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams.addRule(8, getMediaContainer().getId());
                titleDescContainer.setLayoutParams(layoutParams);
                int i11 = A00;
                titleDescContainer.setPadding(i11, i11, i11, i11);
                MS.A0R(titleDescContainer, getAdContextWrapper());
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams2.addRule(3, getMediaContainer().getId());
                getCtaButton().setLayoutParams(layoutParams2);
                addView(getMediaContainer());
                addView(titleDescContainer);
                addView(getCtaButton());
            }
        };
    }
}
