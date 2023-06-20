package com.facebook.ads.redexgen.X;

import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.NativeAd;

/* renamed from: com.facebook.ads.redexgen.X.Pw  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1194Pw extends LinearLayout {
    public static final int A00 = (int) (Lr.A00 * 32.0f);
    public static final int A01 = (int) (Lr.A00 * 8.0f);

    public C1194Pw(C1400Xy c1400Xy, NativeAd nativeAd, K7 k72, OW ow, AdOptionsView adOptionsView) {
        super(c1400Xy);
        setOrientation(0);
        ow.setFullCircleCorners(true);
        int i10 = A00;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i10, i10);
        layoutParams.gravity = 16;
        layoutParams.setMargins(0, 0, A01, 0);
        addView(ow, layoutParams);
        TextView textView = new TextView(c1400Xy);
        k72.A08(textView);
        textView.setMaxLines(1);
        textView.setText(nativeAd.getAdvertiserName());
        TextView textView2 = new TextView(c1400Xy);
        k72.A06(textView2);
        textView2.setMaxLines(1);
        textView2.setText(nativeAd.getSponsoredTranslation());
        LinearLayout linearLayout = new LinearLayout(c1400Xy);
        linearLayout.setOrientation(1);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, -2);
        layoutParams2.weight = 1.0f;
        layoutParams2.gravity = 16;
        linearLayout.addView(textView, new LinearLayout.LayoutParams(-1, -2));
        linearLayout.addView(textView2, new LinearLayout.LayoutParams(-1, -2));
        addView(linearLayout, layoutParams2);
        addView(adOptionsView, new LinearLayout.LayoutParams(-2, -2));
    }
}
