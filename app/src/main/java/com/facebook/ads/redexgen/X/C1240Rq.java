package com.facebook.ads.redexgen.X;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeAd;
import java.util.ArrayList;

/* renamed from: com.facebook.ads.redexgen.X.Rq  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1240Rq extends FrameLayout implements InterfaceC1193Pv {
    @Nullable
    public TextView A00;
    @Nullable
    public TextView A01;
    @Nullable
    public TextView A02;
    @Nullable
    public TextView A03;
    public final MediaView A04;
    public final NativeAd A05;
    public final C1194Pw A06;
    public final ArrayList<View> A07;
    public static String[] A08 = {"LrUXeZd5oXG5wJ7", "S6ePTdxfK6c7yhvbHMQjZqIgQsLDz3QO", "YqVXoEdDoNpK3nL0El5", "Exhg7LXIw6HgSAmcccR052cOKtX3WF", "LN", "59F20xOEewuTmZzPatOKMeF6XI6ZvB1j", "IRBrDKvf2o0dBHWjf99N02m12yrR0Bg7", "KZ90h8EmVWfLUNKv0pT"};
    public static final int A0E = (int) (Lr.A00 * 6.0f);
    public static final int A0D = (int) (Lr.A00 * 8.0f);
    public static final int A0C = (int) (Lr.A00 * 12.0f);
    public static final int A0A = (int) (Lr.A00 * 350.0f);
    public static final int A09 = (int) (Lr.A00 * 250.0f);
    public static final int A0B = (int) (Lr.A00 * 175.0f);

    public C1240Rq(C1400Xy c1400Xy, NativeAd nativeAd, K7 k72, K8 k82, OW ow, MediaView mediaView, AdOptionsView adOptionsView) {
        super(c1400Xy);
        this.A07 = new ArrayList<>();
        this.A05 = nativeAd;
        this.A04 = mediaView;
        this.A06 = new C1194Pw(c1400Xy, this.A05, k72, ow, adOptionsView);
        C1194Pw c1194Pw = this.A06;
        int i10 = A0C;
        c1194Pw.setPadding(i10, i10, i10, A0E);
        addView(this.A06, new FrameLayout.LayoutParams(-1, -2));
        if (k82 == K8.A09 || k82 == K8.A0B) {
            A07(k72);
        }
        addView(this.A04, new FrameLayout.LayoutParams(-1, -2));
        if (k82 != K8.A0B || this.A05.getAdCreativeType() != NativeAd.AdCreativeType.CAROUSEL) {
            A06(k72);
            A04(k72);
            A05(k72);
        }
        this.A07.add(ow);
        this.A07.add(mediaView);
    }

    private int A00() {
        int i10;
        int i11;
        int i12;
        TextView textView = this.A03;
        int titleHeight = 0;
        if (textView != null && textView.getVisibility() == 0) {
            i10 = this.A03.getMeasuredHeight();
        } else {
            i10 = 0;
        }
        TextView textView2 = this.A02;
        if (A08[1].charAt(0) != 'k') {
            String[] strArr = A08;
            strArr[6] = "SrhbzBCrZmwJCsE1GN19GBhRpshhKBl4";
            strArr[5] = "lZXGEU0s5y97LRskCQS4IC0Q6rEMlB8o";
            if (textView2 != null && textView2.getVisibility() == 0) {
                i11 = this.A02.getMeasuredHeight();
            } else {
                i11 = 0;
            }
            TextView textView3 = this.A00;
            if (textView3 != null && textView3.getVisibility() == 0) {
                i12 = this.A00.getMeasuredHeight();
            } else {
                i12 = 0;
            }
            TextView textView4 = this.A01;
            if (A08[1].charAt(0) != 'k') {
                String[] strArr2 = A08;
                strArr2[6] = "nRuc5lutSXPKh9f7kKzdW2kIhLu3nB9m";
                strArr2[5] = "FuxAmHJZMOFMUG38wB3yXnFuBZuRMBRE";
                if (textView4 != null) {
                    int subtitleHeight = textView4.getVisibility();
                    if (subtitleHeight == 0) {
                        int titleHeight2 = this.A01.getMeasuredHeight();
                        int subtitleHeight2 = A0C;
                        int titleHeight3 = titleHeight2 + subtitleHeight2;
                        int subtitleHeight3 = A0D;
                        titleHeight = titleHeight3 + subtitleHeight3;
                    }
                }
                int measuredHeight = getMeasuredHeight();
                int ctaHeight = this.A06.getMeasuredHeight();
                return ((((measuredHeight - ctaHeight) - i10) - i11) - i12) - titleHeight;
            }
            throw new RuntimeException();
        }
        throw new RuntimeException();
    }

    private void A01() {
        TextView textView = this.A03;
        if (textView != null) {
            textView.setLines(1);
        }
        TextView textView2 = this.A02;
        if (textView2 != null) {
            textView2.setLines(1);
        }
        TextView textView3 = this.A00;
        if (textView3 != null) {
            textView3.setLines(1);
        }
    }

    private void A02(int i10) {
        MS.A0N(this.A04, i10 > A0B ? 0 : 8);
        MS.A0N(this.A03, i10 > A0A ? 0 : 8);
        MS.A0N(this.A00, i10 <= A09 ? 8 : 0);
    }

    public static void A03(int i10, int i11, TextView... textViewArr) {
        for (TextView textView : textViewArr) {
            if (textView != null && textView.getVisibility() == 0) {
                int A04 = MS.A04(textView, i11);
                textView.setLines(A04 + 1);
                textView.measure(i10, View.MeasureSpec.makeMeasureSpec(textView.getMeasuredHeight() + (textView.getLineHeight() * A04), 1073741824));
                i11 -= textView.getLineHeight() * A04;
            }
        }
    }

    private void A04(K7 k72) {
        if (this.A05.getAdBodyText() != null && !this.A05.getAdBodyText().trim().isEmpty()) {
            this.A00 = new TextView(getContext());
            k72.A06(this.A00);
            this.A00.setText(this.A05.getAdBodyText());
            TextView textView = this.A00;
            int i10 = A0C;
            textView.setPadding(i10, 0, i10, 0);
            addView(this.A00, new FrameLayout.LayoutParams(-1, -2));
        }
    }

    private void A05(K7 k72) {
        if (this.A05.hasCallToAction()) {
            this.A01 = new TextView(getContext());
            MS.A0K(this.A01);
            k72.A05(this.A01);
            this.A01.setText(this.A05.getAdCallToAction());
            TextView textView = this.A01;
            int i10 = A0D;
            textView.setPadding(i10, i10, i10, i10);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            int i11 = A0D;
            layoutParams.setMargins(i11, 0, i11, 0);
            addView(this.A01, layoutParams);
            this.A07.add(this.A01);
        }
    }

    private void A06(K7 k72) {
        if (this.A05.getAdHeadline() != null && !this.A05.getAdHeadline().trim().isEmpty()) {
            this.A02 = new TextView(getContext());
            k72.A07(this.A02);
            this.A02.setText(this.A05.getAdHeadline());
            TextView textView = this.A02;
            int i10 = A0C;
            textView.setPadding(i10, A0D, i10, 0);
            addView(this.A02, new FrameLayout.LayoutParams(-1, -2));
        }
    }

    private void A07(K7 k72) {
        if (this.A05.getAdLinkDescription() != null && !this.A05.getAdLinkDescription().trim().isEmpty()) {
            this.A03 = new TextView(getContext());
            k72.A06(this.A03);
            this.A03.setText(this.A05.getAdLinkDescription());
            TextView textView = this.A03;
            int i10 = A0C;
            textView.setPadding(i10, 0, i10, A0D);
            addView(this.A03, new FrameLayout.LayoutParams(-1, -2));
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1193Pv
    public View getView() {
        return this;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1193Pv
    public ArrayList<View> getViewsForInteraction() {
        return this.A07;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        C1194Pw c1194Pw = this.A06;
        c1194Pw.layout(i10, i11, i12, c1194Pw.getMeasuredHeight() + i11);
        int measuredHeight = i11 + this.A06.getMeasuredHeight();
        TextView textView = this.A03;
        if (textView != null && textView.getVisibility() == 0) {
            int measuredHeight2 = this.A03.getMeasuredHeight();
            this.A03.layout(i10, measuredHeight, i12, measuredHeight + measuredHeight2);
            measuredHeight += measuredHeight2;
        }
        MediaView mediaView = this.A04;
        mediaView.layout(i10, measuredHeight, i12, mediaView.getMeasuredHeight() + measuredHeight);
        int measuredHeight3 = measuredHeight + this.A04.getMeasuredHeight();
        TextView textView2 = this.A02;
        if (textView2 != null) {
            textView2.layout(i10, measuredHeight3, i12, textView2.getMeasuredHeight() + measuredHeight3);
            measuredHeight3 += this.A02.getMeasuredHeight();
        }
        TextView textView3 = this.A00;
        if (textView3 != null && textView3.getVisibility() == 0) {
            TextView textView4 = this.A00;
            if (A08[1].charAt(0) == 'k') {
                throw new RuntimeException();
            }
            A08[3] = "gjv6mmFqHT0";
            textView4.layout(i10, measuredHeight3, i12, textView4.getMeasuredHeight() + measuredHeight3);
        }
        TextView textView5 = this.A01;
        if (textView5 != null) {
            int measuredHeight4 = i13 - textView5.getMeasuredHeight();
            int i14 = A0C;
            textView5.layout(A0C + i10, measuredHeight4 - i14, i12 - i14, i13 - i14);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        A02(View.MeasureSpec.getSize(i11));
        A01();
        super.onMeasure(i10, i11);
        int A00 = A00();
        if (this.A04.getMediaWidth() == 0 || this.A04.getMediaHeight() == 0) {
            i12 = A00;
        } else if (((C1555bd) this.A04.getMediaViewApi()).A0N()) {
            i12 = A00;
        } else {
            i12 = Math.min((int) (this.A04.getMeasuredWidth() * (this.A04.getMediaHeight() / this.A04.getMediaWidth())), A00);
        }
        this.A04.measure(i10, View.MeasureSpec.makeMeasureSpec(i12, 1073741824));
        if (i12 < A00) {
            A03(i10, A00 - i12, this.A02, this.A00, this.A03);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1193Pv
    public final void unregisterView() {
        this.A05.unregisterView();
    }
}
