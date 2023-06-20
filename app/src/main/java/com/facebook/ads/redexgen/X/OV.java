package com.facebook.ads.redexgen.X;

import android.graphics.drawable.GradientDrawable;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class OV extends LinearLayout {
    public static String[] A05 = {"JiUd07qZ", "phaLMHqUBlp6P5RZzzm", "VtPMRXbuUkVLmtGCwM", "RgvNiIo52t", "FYi9K2JmgPw1hqWSXD3EPgcEPQmLRiB", "yPPKnDMDveXTdnfoUUkFxo3t2NtgVDwK", "Cr", "5lHXxybE2bQiDNmNKuHItJ8Sueck67l"};
    public int A00;
    public List<GradientDrawable> A01;
    public final int A02;
    public final int A03;
    public final int A04;

    public OV(C1400Xy c1400Xy, C1K c1k, int dotSize) {
        super(c1400Xy);
        this.A00 = -1;
        setOrientation(0);
        setGravity(17);
        float f10 = Lr.A00;
        int i10 = (int) (8.0f * f10);
        int i11 = (int) (6.0f * f10);
        int margin = (int) (1.0f * f10);
        this.A02 = margin;
        int margin2 = c1k.A04(false);
        this.A04 = margin2;
        int margin3 = C2U.A01(this.A04, 128);
        this.A03 = margin3;
        this.A01 = new ArrayList();
        for (int i12 = 0; i12 < dotSize; i12++) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(1);
            gradientDrawable.setSize(i10, i10);
            int margin4 = this.A02;
            gradientDrawable.setStroke(margin4, 0);
            ImageView imageView = new ImageView(c1400Xy);
            LinearLayout.LayoutParams dotImageParams = new LinearLayout.LayoutParams(-2, -2);
            dotImageParams.setMargins(0, 0, i11, 0);
            dotImageParams.gravity = 17;
            imageView.setLayoutParams(dotImageParams);
            imageView.setImageDrawable(gradientDrawable);
            this.A01.add(gradientDrawable);
            addView(imageView);
        }
        A00(0);
    }

    public final void A00(int i10) {
        int i11;
        int i12;
        if (this.A00 == i10) {
            return;
        }
        this.A00 = i10;
        if (A05[2].length() == 22) {
            throw new RuntimeException();
        }
        String[] strArr = A05;
        strArr[4] = "BJqXxH8n0fuaHx3JVwGHjWVcPjmBGjI";
        strArr[7] = "ZUGfW6Md7SIL60yz7Eq8Bq3LU56iFcm";
        for (int i13 = 0; i13 < this.A01.size(); i13++) {
            if (i13 == i10) {
                i11 = this.A04;
                i12 = this.A04;
            } else {
                i11 = this.A03;
                i12 = 0;
            }
            int borderColor = this.A02;
            this.A01.get(i13).setStroke(borderColor, i12);
            this.A01.get(i13).setColor(i11);
            this.A01.get(i13).invalidateSelf();
        }
    }
}
