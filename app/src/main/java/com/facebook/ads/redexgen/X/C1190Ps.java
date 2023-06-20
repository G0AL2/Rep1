package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.NativeBannerAd;

/* renamed from: com.facebook.ads.redexgen.X.Ps  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1190Ps extends LinearLayout {
    public C1190Ps(C1400Xy c1400Xy, NativeBannerAd nativeBannerAd, K8 k82, K7 k72, AdOptionsView adOptionsView) {
        super(c1400Xy);
        TextView textView = new TextView(getContext());
        k72.A08(textView);
        textView.setText(nativeBannerAd.getAdvertiserName());
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setMaxLines(1);
        TextView textView2 = new TextView(getContext());
        k72.A06(textView2);
        textView2.setText(nativeBannerAd.getAdUntrimmedBodyText());
        textView2.setLines(k82 == K8.A07 ? 2 : 1);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2);
        layoutParams.weight = 1.0f;
        linearLayout.addView(textView, layoutParams);
        linearLayout.addView(adOptionsView, new LinearLayout.LayoutParams(-2, -2));
        setOrientation(1);
        ViewGroup.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        addView(linearLayout, layoutParams2);
        addView(textView2, layoutParams2);
    }
}
