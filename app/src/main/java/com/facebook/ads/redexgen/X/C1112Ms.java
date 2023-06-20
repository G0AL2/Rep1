package com.facebook.ads.redexgen.X;

import android.graphics.drawable.GradientDrawable;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.facebook.ads.internal.api.AdNativeComponentView;

/* renamed from: com.facebook.ads.redexgen.X.Ms  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1112Ms extends AdNativeComponentView {
    public final LinearLayout A00;
    public final RelativeLayout A01;
    public final RelativeLayout A02;
    public final TextView A03;
    public final TextView A04;
    public final TextView A05;
    public final K7 A06;
    public final TN A07;
    public static String[] A08 = {"uC9D5qmNt6hBQ30WTqHbWjXyd7i1Eya7", "gODvKHA4maP1ueedVTfLSKuHicNhKgsI", "CsSG52h0mPiGpGKpZqt1sL51qY2PgKJk", "t8ZdPgNdDyW7PJ5OFmmKGTW0QKkF2iLl", "957CjoSzFmlmvQzAWdXFvCjH6Z48RGY7", "Wj5TDMvsQRhldaVPvD6nNpKwpdYrUsC9", "EcmINfrxIVIGvxUX8", "04S0zAGn7nkSUB63PmP3o85Q9zROVkT0"};
    public static final int A09 = ((int) Lr.A00) * 500;
    public static final int A0H = (int) (Lr.A00 * 500.0f);
    public static final int A0D = (int) (Lr.A00 * 4.0f);
    public static final int A0B = (int) (Lr.A00 * 8.0f);
    public static final int A0G = (int) (Lr.A00 * 8.0f);
    public static final int A0E = (int) (Lr.A00 * 4.0f);
    public static final int A0C = (int) Lr.A00;
    public static final int A0F = (int) (Lr.A00 * 4.0f);
    public static final int A0A = (int) (Lr.A00 * 0.5d);

    public C1112Ms(C1400Xy c1400Xy, K7 k72) {
        super(c1400Xy);
        this.A06 = k72;
        this.A05 = new TextView(c1400Xy);
        this.A04 = new TextView(c1400Xy);
        this.A03 = new TextView(c1400Xy);
        this.A02 = new RelativeLayout(c1400Xy);
        this.A00 = new LinearLayout(c1400Xy);
        this.A01 = new RelativeLayout(c1400Xy);
        this.A07 = new TN(c1400Xy);
        A09();
        A0D();
        A05();
        A0A();
        A00();
        A0B();
        A03();
        A0A();
        A08();
        A0C();
    }

    private void A00() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.weight = 1.0f;
        layoutParams.gravity = 1;
        this.A00.addView(this.A01, layoutParams);
    }

    private void A01() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(3, this.A04.getId());
        MS.A0J(this.A03);
        this.A02.addView(this.A03, layoutParams);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        this.A02.setBackgroundDrawable(null);
        RelativeLayout relativeLayout = this.A02;
        int i10 = A0G;
        relativeLayout.setPadding(i10, i10, i10, i10);
        MS.A0J(this.A02);
        this.A00.addView(this.A02, layoutParams2);
    }

    private void A02() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        int i10 = A0B;
        int i11 = A0D;
        layoutParams.setMargins(i10, i11, i10, i11);
        MS.A0J(this.A03);
        this.A00.addView(this.A03, layoutParams);
    }

    private void A03() {
        this.A01.addView(this.A07, new LinearLayout.LayoutParams(-2, -1));
    }

    private void A04() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(8, this.A07.getId());
        layoutParams.addRule(5, this.A07.getId());
        layoutParams.addRule(7, this.A07.getId());
        RelativeLayout relativeLayout = this.A02;
        int i10 = A0G;
        relativeLayout.setPadding(i10, 0, i10, 0);
        this.A02.setBackgroundDrawable(new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{-872415232, 0}));
        MS.A0J(this.A02);
        this.A01.addView(this.A02, layoutParams);
    }

    private void A05() {
        addView(this.A00, new LinearLayout.LayoutParams(-2, -2));
    }

    private void A06() {
        this.A05.setTextColor(-1);
        this.A04.setTextColor(-1);
        this.A03.setTextColor(this.A06.A03());
    }

    private void A07() {
        this.A07.setMaxWidth(A0H);
        this.A05.setTextColor(this.A06.A04(0.2f));
        this.A04.setTextColor(this.A06.A04(0.4f));
        this.A03.setTextColor(this.A06.A03());
        ((LinearLayout.LayoutParams) this.A01.getLayoutParams()).gravity = 1;
    }

    private void A08() {
        TextView textView = this.A03;
        int i10 = A0C;
        textView.setPadding(i10, i10, i10, i10);
        this.A03.setTextSize(14.0f);
        MS.A0K(this.A03);
    }

    private void A09() {
        setLayoutParams(new RelativeLayout.LayoutParams(-2, -1));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(this.A06.A01());
        gradientDrawable.setCornerRadius(A0F);
        gradientDrawable.setStroke(1, this.A06.A02());
        setBackgroundDrawable(gradientDrawable);
        int i10 = A0A;
        setPadding(i10, i10, i10, i10);
    }

    private void A0A() {
        MS.A0K(this.A01);
    }

    private void A0B() {
        this.A07.setScaleType(ImageView.ScaleType.FIT_XY);
        TN tn = this.A07;
        int i10 = A0F;
        tn.setRadius(new float[]{i10, i10, i10, i10, 0.0f, 0.0f, 0.0f, 0.0f});
        this.A07.setAdjustViewBounds(true);
        EnumC1090Lw.A04(this.A07, EnumC1090Lw.A0A);
        MS.A0K(this.A07);
    }

    private void A0C() {
        MS.A0K(this.A02);
        this.A05.setTextSize(14.0f);
        MS.A0K(this.A05);
        this.A05.setMaxLines(1);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, 0, 0, A0E);
        this.A02.addView(this.A05, layoutParams);
        this.A04.setTextSize(12.0f);
        MS.A0K(this.A04);
        this.A04.setMaxLines(1);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(3, this.A05.getId());
        layoutParams2.setMargins(0, 0, 0, A0E);
        this.A02.addView(this.A04, layoutParams2);
    }

    private void A0D() {
        this.A00.setOrientation(1);
        MS.A0K(this.A00);
    }

    @Override // com.facebook.ads.internal.api.AdNativeComponentView
    public View getAdContentsView() {
        return this.A07;
    }

    public ImageView getImageCardView() {
        return this.A07;
    }

    @Override // com.facebook.ads.internal.api.AdNativeComponentView, android.widget.RelativeLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        if (View.MeasureSpec.getSize(i11) < ((int) Lr.A00) * JR.A0C(getContext())) {
            int mode = View.MeasureSpec.getMode(i11);
            String[] strArr = A08;
            if (strArr[3].charAt(18) == strArr[0].charAt(18)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A08;
            strArr2[2] = "15DEnWMwGzueTnQFE8qATib1q5d5oHj9";
            strArr2[4] = "kyJeuSgnvxhO6LbcYzomu9S0GmVFz9Qa";
            if (mode != 0) {
                A02();
                A04();
                A06();
                super.onMeasure(i10, i11);
            }
        }
        A01();
        A07();
        super.onMeasure(i10, i11);
    }

    public void setButtonText(String str) {
        if (str == null || str.trim().isEmpty()) {
            this.A03.setVisibility(8);
            return;
        }
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 0);
        this.A03.setText(spannableString);
    }

    public void setSubtitle(String str) {
        if (str == null || str.trim().isEmpty()) {
            this.A04.setVisibility(8);
        }
        this.A04.setText(str);
    }

    public void setTitle(String str) {
        if (str == null || str.trim().isEmpty()) {
            this.A05.setVisibility(8);
        }
        this.A05.setText(str);
    }
}
