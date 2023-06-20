package com.facebook.ads.redexgen.X;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.Mz  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1119Mz extends RelativeLayout {
    @Nullable
    public TextView A00;
    public final Button A01;
    public final Button A02;
    public final ImageView A03;
    public final LinearLayout A04;
    public final TextView A05;
    public static final int A08 = (int) (Lr.A00 * 60.0f);
    public static final int A07 = (int) (Lr.A00 * 8.0f);
    public static final int A09 = (int) (Lr.A00 * 16.0f);
    public static final int A0A = (int) (Lr.A00 * 24.0f);
    public static final int A06 = (int) (Lr.A00 * 12.0f);

    public C1119Mz(C1400Xy c1400Xy, int i10, int i11, String str, @Nullable String str2, String str3, String str4, Bitmap bitmap) {
        super(c1400Xy);
        this.A05 = new TextView(c1400Xy);
        this.A02 = new Button(c1400Xy);
        this.A01 = new Button(c1400Xy);
        this.A03 = new ImageView(c1400Xy);
        this.A04 = new LinearLayout(c1400Xy);
        if (!TextUtils.isEmpty(str2)) {
            this.A00 = new TextView(c1400Xy);
        }
        this.A05.setText(str);
        this.A05.setTextColor(i10);
        MS.A0X(this.A05, true, 20);
        TextView textView = this.A00;
        if (textView != null) {
            textView.setText(str2);
            this.A00.setTextColor(i10);
            MS.A0X(this.A00, false, 18);
        }
        this.A03.setImageBitmap(bitmap);
        this.A03.setColorFilter(i10);
        this.A02.setText(str3);
        MS.A0X(this.A02, true, 18);
        this.A02.setAllCaps(true);
        this.A02.setTextColor(i11);
        Button button = this.A02;
        int i12 = A06;
        button.setPadding(i12, i12, i12, i12);
        this.A01.setText(str4);
        MS.A0X(this.A01, true, 18);
        this.A01.setAllCaps(true);
        this.A01.setTextColor(i10);
        Button button2 = this.A01;
        int i13 = A06;
        button2.setPadding(i13, i13, i13, i13);
        int A01 = C2U.A01(i11, 20);
        MS.A0O(this.A02, i10, A07);
        MS.A0O(this.A01, A01, A07);
        A00();
        setGravity(17);
    }

    private void A00() {
        int i10 = A0A;
        setPadding(i10, i10, i10, i10);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        this.A04.setOrientation(1);
        this.A04.setGravity(14);
        addView(this.A04, layoutParams);
        int i11 = A08;
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(i11, i11);
        layoutParams2.setMargins(0, 0, 0, A09);
        layoutParams2.gravity = 1;
        this.A04.addView(this.A03, layoutParams2);
        LinearLayout.LayoutParams titleParams = new LinearLayout.LayoutParams(-1, -2);
        titleParams.setMargins(0, 0, 0, A09 / 2);
        this.A05.setGravity(17);
        this.A04.addView(this.A05, titleParams);
        if (this.A00 != null) {
            LinearLayout.LayoutParams titleParams2 = new LinearLayout.LayoutParams(-1, -2);
            titleParams2.setMargins(0, 0, 0, A09);
            this.A00.setGravity(17);
            this.A04.addView(this.A00, titleParams2);
        }
        LinearLayout.LayoutParams titleParams3 = new LinearLayout.LayoutParams(-1, -2);
        titleParams3.setMargins(0, 0, 0, A09);
        this.A04.addView(this.A02, titleParams3);
        this.A04.addView(this.A01, titleParams3);
    }
}
