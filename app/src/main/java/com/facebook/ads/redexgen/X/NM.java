package com.facebook.ads.redexgen.X;

import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

/* loaded from: assets/audience_network.dex */
public final class NM extends RelativeLayout {
    public final int A00;
    public final int A01;
    public final C2D A02;
    public final C1400Xy A03;
    public final NP A04;
    public final boolean A05;
    public static final int A09 = (int) (Lr.A00 * 16.0f);
    public static final int A0A = (int) (Lr.A00 * 8.0f);
    public static final int A0D = (int) (Lr.A00 * 44.0f);
    public static final int A08 = (int) (Lr.A00 * 10.0f);
    public static final int A07 = A09 - A08;
    public static final int A0E = (int) (Lr.A00 * 75.0f);
    public static final int A0B = (int) (Lr.A00 * 25.0f);
    public static final int A0F = (int) (Lr.A00 * 45.0f);
    public static final int A0C = (int) (Lr.A00 * 15.0f);
    public static final int A06 = (int) (Lr.A00 * 16.0f);

    public NM(NL nl) {
        super(NL.A01(nl));
        this.A03 = NL.A01(nl);
        this.A02 = C2E.A00(this.A03.A00());
        this.A04 = NL.A03(nl);
        this.A01 = NL.A09(nl) ? A0E : A0F;
        this.A00 = NL.A09(nl) ? A0B : A0C;
        this.A05 = NL.A0A(nl);
        setFocusable(true);
        View A01 = A01(nl);
        View A00 = A00(nl);
        View footerView = getFooterView();
        MS.A0K(A01);
        MS.A0K(A00);
        MS.A0K(footerView);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(10);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams2.addRule(13);
        layoutParams2.addRule(3, A01.getId());
        layoutParams2.addRule(2, footerView.getId());
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams3.addRule(12);
        int i10 = A09;
        layoutParams3.setMargins(i10, 0, i10, i10);
        addView(A01, layoutParams);
        addView(A00, layoutParams2);
        addView(footerView, layoutParams3);
        footerView.setVisibility(NL.A0B(nl) ? 0 : 8);
    }

    public /* synthetic */ NM(NL nl, NJ nj) {
        this(nl);
    }

    private View A00(NL nl) {
        ImageView imageView = new ImageView(getContext());
        int i10 = this.A00;
        imageView.setPadding(i10, i10, i10, i10);
        imageView.setImageBitmap(C1095Mb.A01(NL.A02(nl)));
        imageView.setColorFilter(-1);
        int i11 = this.A01;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i11, i11);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(NL.A00(nl));
        MS.A0S(imageView, gradientDrawable);
        layoutParams.gravity = 17;
        int i12 = A09;
        layoutParams.setMargins(i12, 0, i12, i12);
        TextView textView = new TextView(getContext());
        MS.A0X(textView, true, 20);
        textView.setTextColor(-14934495);
        textView.setText(NL.A04(nl));
        textView.setGravity(17);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        int i13 = A09;
        layoutParams2.setMargins(i13, 0, i13, i13);
        TextView textView2 = new TextView(getContext());
        MS.A0X(textView2, false, 16);
        textView2.setTextColor(-10459280);
        textView2.setText(NL.A05(nl));
        textView2.setGravity(17);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        int i14 = A09;
        layoutParams3.setMargins(i14, 0, i14, i14);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.addView(imageView, layoutParams);
        linearLayout.addView(textView, layoutParams2);
        linearLayout.addView(textView2, layoutParams3);
        if (NL.A08(nl)) {
            LinearLayout linearLayout2 = new LinearLayout(getContext());
            linearLayout2.setOrientation(0);
            linearLayout2.setGravity(17);
            if (!TextUtils.isEmpty(NL.A06(nl))) {
                OW ow = new OW(this.A03);
                int i15 = A0F;
                LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(i15, i15);
                layoutParams4.setMargins(0, 0, A0A, 0);
                ow.setFullCircleCorners(true);
                T3 t32 = new T3(ow, this.A03);
                int i16 = A0F;
                t32.A05(i16, i16).A07(NL.A06(nl));
                linearLayout2.addView(ow, layoutParams4);
            }
            NR nr = new NR(this.A03);
            nr.setData(NL.A07(nl), EnumC1094Ma.CHECKMARK);
            nr.setSelected(true);
            LinearLayout.LayoutParams selectedOptionParams = new LinearLayout.LayoutParams(-2, -2);
            linearLayout2.addView(nr, selectedOptionParams);
            linearLayout.addView(linearLayout2);
        }
        return linearLayout;
    }

    private View A01(NL nl) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        if (NL.A0C(nl)) {
            ImageView imageView = new ImageView(getContext());
            int i10 = A08;
            imageView.setPadding(i10, i10, i10, i10);
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageView.setImageBitmap(C1095Mb.A01(EnumC1094Ma.CROSS));
            imageView.setOnClickListener(new NJ(this));
            int i11 = A0D;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i11, i11);
            int i12 = A07;
            layoutParams.setMargins(i12, i12, i12, i12);
            linearLayout.addView(imageView, layoutParams);
        }
        return linearLayout;
    }

    private View getFooterView() {
        ImageView imageView = new ImageView(getContext());
        imageView.setImageBitmap(C1095Mb.A01(EnumC1094Ma.SETTINGS));
        imageView.setColorFilter(-13272859);
        int i10 = A06;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i10, i10);
        layoutParams.gravity = 17;
        TextView textView = new TextView(getContext());
        MS.A0X(textView, false, 16);
        textView.setTextColor(-13272859);
        int i11 = A0A;
        textView.setPadding(i11, i11, i11, i11);
        textView.setText(this.A02.A0J());
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 17;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        linearLayout.setOnClickListener(new NK(this));
        linearLayout.addView(imageView, layoutParams);
        linearLayout.addView(textView, layoutParams2);
        return linearLayout;
    }
}
