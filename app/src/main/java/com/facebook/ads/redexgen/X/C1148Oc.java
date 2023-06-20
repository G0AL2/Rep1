package com.facebook.ads.redexgen.X;

import android.content.res.Resources;
import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.Oc  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1148Oc extends LinearLayout {
    public static String[] A03 = {"lF8IVPZcS3mZAefsIaNZ6E9xMmjOqdH7", "idkW2", "HbWJiF6R60B06srsOI5ot4Pv3KsUxfPN", "7f3O1w3Qg3dv0DYXPvEPDd2nNc", "nnNATfNTHr6hSEkqMWy2MP3i9vksRg0T", "pai30RxYeYeDatKriEp6xPPXjxDmZE6E", "MhBAxeK5XElhMNsb", "N4hTYih9SgQSzhMEA04rsaAJRIerHLwS"};
    public static final float A04 = Resources.getSystem().getDisplayMetrics().density;
    public static final int A05;
    public static final int A06;
    public final TextView A00;
    public final TextView A01;
    public final TextView A02;

    static {
        float f10 = A04;
        A06 = (int) (6.0f * f10);
        A05 = (int) (f10 * 8.0f);
    }

    public C1148Oc(C1400Xy c1400Xy, C1K c1k, boolean z10, int i10, int i11, int i12) {
        super(c1400Xy);
        setOrientation(1);
        this.A02 = new TextView(c1400Xy);
        MS.A0X(this.A02, true, i10);
        this.A02.setEllipsize(TextUtils.TruncateAt.END);
        this.A02.setLineSpacing(A06, 1.0f);
        this.A01 = new TextView(c1400Xy);
        this.A00 = new TextView(c1400Xy);
        MS.A0X(this.A00, false, i11);
        this.A00.setEllipsize(TextUtils.TruncateAt.END);
        this.A00.setLineSpacing(A06, 1.0f);
        addView(this.A02, new LinearLayout.LayoutParams(-1, -2));
        addView(this.A01, new LinearLayout.LayoutParams(-1, -2));
        this.A01.setVisibility(8);
        A00(c1k, z10);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, i12, 0, 0);
        addView(this.A00, layoutParams);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C1148Oc(com.facebook.ads.redexgen.X.C1400Xy r8, com.facebook.ads.redexgen.X.C1K r9, boolean r10, boolean r11, boolean r12) {
        /*
            r7 = this;
            if (r11 == 0) goto L19
            r4 = 18
        L4:
            if (r11 == 0) goto L16
            r5 = 14
        L8:
            int r6 = com.facebook.ads.redexgen.X.C1148Oc.A05
            if (r12 == 0) goto Le
            int r6 = r6 / 2
        Le:
            r0 = r7
            r2 = r9
            r3 = r10
            r1 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        L16:
            r5 = 16
            goto L8
        L19:
            r4 = 22
            goto L4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1148Oc.<init>(com.facebook.ads.redexgen.X.Xy, com.facebook.ads.redexgen.X.1K, boolean, boolean, boolean):void");
    }

    public final void A00(C1K c1k, boolean z10) {
        this.A02.setTextColor(c1k.A06(z10));
        this.A01.setTextColor(c1k.A04(z10));
        this.A00.setTextColor(c1k.A05(z10));
    }

    public final void A01(String str, String str2, @Nullable String str3, boolean z10, boolean z11) {
        boolean z12 = !TextUtils.isEmpty(str);
        boolean z13 = !TextUtils.isEmpty(str2);
        TextView textView = this.A02;
        if (!z12) {
            str = str2;
        }
        textView.setText(str);
        if (str3 != null) {
            this.A01.setText(str3);
        }
        TextView textView2 = this.A00;
        if (!z12) {
            str2 = "";
        }
        textView2.setText(str2);
        if (A03[4].charAt(18) != 'y') {
            throw new RuntimeException();
        }
        A03[4] = "cGsHRNQKRzUTXMDBZCyzngEN4Bg1pclE";
        int i10 = 3;
        if (!z12 || !z13) {
            TextView textView3 = this.A02;
            if (z10) {
                i10 = 2;
            } else if (z11) {
                i10 = 4;
            }
            textView3.setMaxLines(i10);
            return;
        }
        this.A02.setMaxLines(z10 ? 1 : 2);
        this.A00.setMaxLines(z10 ? 1 : z11 ? 3 : 2);
    }

    public TextView getDescriptionTextView() {
        return this.A00;
    }

    public TextView getTitleTextView() {
        return this.A02;
    }

    public void setAlignment(int i10) {
        this.A02.setGravity(i10);
        this.A00.setGravity(i10);
    }

    public void setDescriptionVisibility(int i10) {
        this.A00.setVisibility(i10);
    }
}
