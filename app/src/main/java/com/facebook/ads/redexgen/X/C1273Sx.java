package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import java.text.NumberFormat;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Sx  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1273Sx extends OJ {
    public static byte[] A0H;
    public static String[] A0I = {"ZYFZvgakVe", "Z9juamcNffZ", "L6NhnuluGVbfOuIZp07EBLc1k7rVfOba", "poGipFcmqzgO1AN9d1VwktKUuwbeuE2x", "1MA0bi3k", "zUZ", "l0mlyabDLiJh1QvHe0VixDkOpEP8aZzg", "KStQaqdBmF0CfboN9Wjc4"};
    public static final int A0J;
    public static final int A0K;
    public static final int A0L;
    public static final int A0M;
    public static final int A0N;
    public static final int A0O;
    public static final int A0P;
    public static final int A0Q;
    public int A00;
    public int A01;
    public LinearLayout A02;
    public TextView A03;
    public TextView A04;
    public TextView A05;
    public C1I A06;
    public C1K A07;
    public C1L A08;
    public OY A09;
    public boolean A0A;
    public boolean A0B;
    public final LinearLayout A0C;
    public final RelativeLayout A0D;
    public final RelativeLayout A0E;
    public final TextView A0F;
    public final C1400Xy A0G;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0H, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 99);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A0H = new byte[]{-111, -20};
    }

    static {
        A07();
        A0P = C2U.A01(-1, 77);
        A0M = (int) (Lr.A00 * 12.0f);
        A0N = (int) (Lr.A00 * 8.0f);
        A0J = (int) (Lr.A00 * 26.0f);
        A0L = (int) (Lr.A00 * 144.0f);
        A0K = (int) (Lr.A00 * 48.0f);
        A0O = (int) (Lr.A00 * 16.0f);
        A0Q = (int) (Lr.A00 * 14.0f);
    }

    public C1273Sx(C1400Xy c1400Xy, int i10, boolean z10, C1K c1k, boolean z11, String str, InterfaceC1028Jh interfaceC1028Jh, InterfaceC1110Mq interfaceC1110Mq, C1220Qw c1220Qw, MK mk) {
        super(c1400Xy, i10, c1k, z11, str, interfaceC1028Jh, interfaceC1110Mq, c1220Qw, mk);
        this.A0B = false;
        this.A00 = 0;
        this.A01 = 0;
        this.A0G = c1400Xy;
        super.A04.setFullCircleCorners(z10);
        int i11 = A0M;
        setPadding(i11, i11, i11, A0J);
        this.A0D = new RelativeLayout(getContext());
        this.A05 = new TextView(getContext());
        this.A02 = new LinearLayout(getContext());
        this.A09 = new OY(this.A0G, A0Q, 5, A0P, -1);
        this.A0E = new RelativeLayout(getContext());
        this.A0C = new LinearLayout(getContext());
        this.A04 = new TextView(getContext());
        this.A03 = new TextView(getContext());
        super.A01.addView(this.A0D);
        super.A01.addView(this.A0C);
        this.A0F = new TextView(getContext());
        this.A07 = c1k;
        MS.A0R(this, c1400Xy);
        this.A0A = JR.A1l(this.A0G);
        A05();
    }

    private void A01() {
        super.A03.setPadding(0, 0, 0, 0);
        super.A03.setLayoutParams(new LinearLayout.LayoutParams(-1, A0K));
    }

    private void A02() {
        this.A0C.setOrientation(1);
        this.A0C.setPadding(0, 0, 0, A0M);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(3, this.A0D.getId());
        this.A0C.setLayoutParams(layoutParams);
        this.A0C.removeAllViews();
        this.A03.setMaxLines(2);
        this.A03.setEllipsize(TextUtils.TruncateAt.END);
        this.A03.setGravity(16);
        this.A03.setTextColor(this.A0A ? this.A07.A05(true) : -1);
        MS.A0X(this.A03, false, 16);
        this.A0C.addView(this.A03, new LinearLayout.LayoutParams(-1, -2));
    }

    private void A03() {
        this.A0D.removeAllViews();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.bottomMargin = A0M;
        this.A0D.setLayoutParams(layoutParams);
        MS.A0K(this.A0D);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(super.A00, super.A00);
        layoutParams2.addRule(15);
        layoutParams2.addRule(9);
        this.A0D.addView(super.A04, layoutParams2);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.leftMargin = A0N;
        layoutParams3.addRule(1, super.A04.getId());
        layoutParams3.addRule(15);
        this.A0D.addView(this.A0E, layoutParams3);
        this.A0E.removeAllViews();
        MS.A0K(this.A05);
        this.A05.setLayoutParams(OJ.A05);
        this.A05.setTextColor(this.A0A ? this.A07.A06(true) : -1);
        MS.A0X(this.A05, true, 18);
        this.A0E.addView(this.A05);
        this.A02.setOrientation(0);
        this.A02.setGravity(16);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, A0O);
        layoutParams4.topMargin = A0N / 2;
        layoutParams4.addRule(3, this.A05.getId());
        this.A0E.addView(this.A02, layoutParams4);
        this.A02.removeAllViews();
        this.A09.setGravity(16);
        this.A02.addView(this.A09, new LinearLayout.LayoutParams(-2, -1));
        this.A04.setTextColor(this.A0A ? this.A07.A06(true) : -1);
        this.A04.setGravity(16);
        this.A04.setIncludeFontPadding(false);
        MS.A0X(this.A04, false, 14);
        LinearLayout.LayoutParams starRatingContainerParams = new LinearLayout.LayoutParams(-2, -1);
        starRatingContainerParams.leftMargin = A0N;
        this.A02.addView(this.A04, starRatingContainerParams);
    }

    private void A04() {
        this.A0F.setMaxLines(1);
        this.A0F.setEllipsize(TextUtils.TruncateAt.END);
        this.A0F.setGravity(17);
        this.A0F.setTextColor(this.A0A ? this.A07.A06(true) : -1);
        this.A0F.setAllCaps(true);
        MS.A0X(this.A0F, false, 12);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = A0M;
        this.A0F.setLayoutParams(layoutParams);
    }

    private void A05() {
        removeAllViews();
        super.A01.setLayoutParams(OJ.A05);
        A03();
        A02();
        A01();
        A04();
        A06();
        MS.A0J(super.A01);
        MS.A0J(super.A03);
        MS.A0J(this.A0F);
        addView(super.A01);
        addView(super.A03);
        addView(this.A0F);
    }

    private void A06() {
        C1I c1i = this.A06;
        if (c1i == null) {
            return;
        }
        this.A05.setText(c1i.A06());
        this.A03.setText(this.A06.A01());
        this.A0F.setText(this.A06.A04());
        if (TextUtils.isEmpty(this.A08.A04())) {
            MS.A0H(super.A03);
        }
        if (TextUtils.isEmpty(this.A06.A04())) {
            MS.A0H(this.A0F);
        }
        if (TextUtils.isEmpty(this.A06.A03())) {
            this.A02.setVisibility(8);
            return;
        }
        this.A02.setVisibility(0);
        OY oy = this.A09;
        String A03 = this.A06.A03();
        if (A0I[0].length() == 17) {
            throw new RuntimeException();
        }
        String[] strArr = A0I;
        strArr[2] = "VSVKlO90K15ihGB4A0qZPRqEppX5OU7U";
        strArr[6] = "xs76xd0mQfWREabMq0mbrfEp6FCRmbTD";
        oy.setRating(Float.parseFloat(A03));
        if (this.A06.A02() == null) {
            return;
        }
        TextView textView = this.A04;
        textView.setText(A00(0, 1, 6) + NumberFormat.getNumberInstance().format(Integer.parseInt(this.A06.A02())) + A00(1, 1, 96));
    }

    @Override // com.facebook.ads.redexgen.X.OJ
    public final void A08() {
        MS.A0H(super.A04);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.A0E.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.leftMargin = 0;
        }
    }

    @Override // com.facebook.ads.redexgen.X.OJ
    public final void A09() {
        MS.A0H(this.A0F);
    }

    @Override // com.facebook.ads.redexgen.X.OJ
    public final void A0A(int i10) {
        int i11 = 1;
        boolean z10 = i10 == 1;
        if (!z10) {
            i11 = 0;
        }
        setOrientation(i11);
        if (!z10) {
            setWeightSum(5.0f);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2);
            layoutParams.weight = 4.0f;
            layoutParams.bottomMargin = A0J - A0M;
            super.A01.setLayoutParams(layoutParams);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, A0K);
            layoutParams2.bottomMargin = A0J / 2;
            layoutParams2.weight = 1.0f;
            layoutParams2.gravity = 80;
            super.A03.setLayoutParams(layoutParams2);
            super.A03.setMinWidth(A0L);
            MS.A0J(this.A0F);
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -1);
            layoutParams3.topMargin = 0;
            layoutParams3.bottomMargin = A0N;
            this.A0C.addView(this.A0F, layoutParams3);
            this.A0C.setPadding(0, 0, 0, 0);
            this.A0F.setGravity(3);
        } else {
            A05();
        }
        bringToFront();
    }

    @Override // com.facebook.ads.redexgen.X.OJ
    public final View getExpandableLayout() {
        return this.A0C;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.A00 == 0) {
            this.A00 = this.A03.getHeight();
            this.A01 = this.A0F.getHeight();
        }
    }

    @Override // com.facebook.ads.redexgen.X.OJ
    public void setInfo(C1I c1i, C1L c1l, String str, String str2, @Nullable OM om) {
        super.setInfo(c1i, c1l, str, str2, om);
        this.A06 = c1i;
        this.A08 = c1l;
        A06();
    }

    @Override // com.facebook.ads.redexgen.X.OJ
    public void setTitleMaxLines(int i10) {
        this.A05.setMaxLines(i10);
        this.A05.setEllipsize(TextUtils.TruncateAt.END);
    }
}
