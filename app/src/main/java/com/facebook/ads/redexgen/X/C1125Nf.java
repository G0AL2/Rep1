package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.Nf  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1125Nf extends LinearLayout {
    public static final int A03 = (int) (Lr.A00 * 40.0f);
    public static final int A04 = (int) (Lr.A00 * 20.0f);
    public static final int A05 = (int) (Lr.A00 * 10.0f);
    public final C2H A00;
    public final C1400Xy A01;
    public final NP A02;

    public C1125Nf(C1400Xy c1400Xy, C2H c2h, NP np, EnumC1094Ma enumC1094Ma) {
        this(c1400Xy, c2h, np, null, enumC1094Ma);
    }

    public C1125Nf(C1400Xy c1400Xy, C2H c2h, NP np, @Nullable String str, EnumC1094Ma enumC1094Ma) {
        super(c1400Xy);
        this.A01 = c1400Xy;
        this.A00 = c2h;
        this.A02 = np;
        setOrientation(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        if (!TextUtils.isEmpty(str)) {
            View A01 = A01(str);
            A01.setPadding(0, 0, 0, 0);
            View view = new View(getContext());
            view.setLayoutParams(new LinearLayout.LayoutParams(-1, 1));
            MS.A0M(view, -10459280);
            addView(A01, layoutParams);
            addView(view);
        }
        if (!TextUtils.isEmpty(this.A00.A03())) {
            View A00 = A00(enumC1094Ma, this.A00.A03());
            int i10 = A05;
            A00.setPadding(0, i10, 0, i10);
            addView(A00, layoutParams);
        }
        ViewGroup A02 = A02();
        A02.setPadding(0, A05, 0, 0);
        addView(A02, layoutParams);
    }

    private View A00(EnumC1094Ma enumC1094Ma, String str) {
        ImageView imageView = new ImageView(getContext());
        imageView.setColorFilter(-10459280);
        int i10 = A04;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i10, i10);
        layoutParams.gravity = 16;
        imageView.setImageBitmap(C1095Mb.A01(enumC1094Ma));
        TextView textView = new TextView(getContext());
        MS.A0X(textView, true, 14);
        textView.setTextColor(-10459280);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        textView.setText(str);
        textView.setPadding(A05, 0, 0, 0);
        textView.setFocusable(true);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.addView(imageView, layoutParams);
        linearLayout.addView(textView, layoutParams2);
        return linearLayout;
    }

    private View A01(String str) {
        ImageView imageView = new ImageView(getContext());
        imageView.setColorFilter(-10459280);
        imageView.setImageBitmap(C1095Mb.A01(EnumC1094Ma.BACK_ARROW));
        int i10 = A05;
        imageView.setPadding(0, i10, i10 * 2, i10);
        int i11 = A03;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i11, i11);
        imageView.setOnClickListener(new View$OnClickListenerC1123Nd(this));
        TextView textView = new TextView(getContext());
        textView.setGravity(17);
        textView.setText(str);
        MS.A0X(textView, true, 16);
        textView.setTextColor(-14934495);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins(0, 0, A03, 0);
        layoutParams2.gravity = 17;
        LinearLayout header = new LinearLayout(getContext());
        header.setOrientation(0);
        header.addView(imageView, layoutParams);
        header.addView(textView, layoutParams2);
        return header;
    }

    private ViewGroup A02() {
        C1131Nl c1131Nl = new C1131Nl(this.A01);
        for (C2H c2h : this.A00.A05()) {
            NR nr = new NR(this.A01);
            nr.setData(c2h.A04(), null);
            nr.setOnClickListener(new View$OnClickListenerC1124Ne(this, nr, c2h));
            c1131Nl.addView(nr);
        }
        return c1131Nl;
    }
}
