package com.facebook.ads.redexgen.X;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.Nullable;

/* loaded from: assets/audience_network.dex */
public final class OD extends FrameLayout {
    public int A00;
    public int A01;
    public final ImageView A02;
    public final ImageView A03;

    public OD(C1400Xy c1400Xy) {
        super(c1400Xy);
        this.A03 = new ImageView(c1400Xy);
        this.A02 = new ImageView(c1400Xy);
        A00();
    }

    public OD(C1400Xy c1400Xy, AttributeSet attributeSet) {
        super(c1400Xy, attributeSet);
        this.A03 = new ImageView(c1400Xy, attributeSet);
        this.A02 = new ImageView(c1400Xy, attributeSet);
        A00();
    }

    public OD(C1400Xy c1400Xy, AttributeSet attributeSet, int i10) {
        super(c1400Xy, attributeSet, i10);
        this.A03 = new ImageView(c1400Xy, attributeSet, i10);
        this.A02 = new ImageView(c1400Xy, attributeSet, i10);
        A00();
    }

    @TargetApi(21)
    public OD(C1400Xy c1400Xy, AttributeSet attributeSet, int i10, int i11) {
        super(c1400Xy, attributeSet, i10, i11);
        this.A03 = new ImageView(c1400Xy, attributeSet, i10, i11);
        this.A02 = new ImageView(c1400Xy, attributeSet, i10, i11);
        A00();
    }

    private void A00() {
        addView(this.A02, new FrameLayout.LayoutParams(-1, -1));
        addView(this.A03, new FrameLayout.LayoutParams(-2, -2));
        EnumC1090Lw.A04(this.A03, EnumC1090Lw.A0A);
        setId(MS.A00());
    }

    public ImageView getBodyImageView() {
        return this.A03;
    }

    public int getImageHeight() {
        return this.A00;
    }

    public int getImageWidth() {
        return this.A01;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int blurBorderViewWidth, int blurBorderViewHeight, int expectedImageHeight, int i10) {
        int i11;
        int i12 = this.A01;
        if (i12 <= 0 || (i11 = this.A00) <= 0) {
            super.onLayout(z10, blurBorderViewWidth, blurBorderViewHeight, expectedImageHeight, i10);
            return;
        }
        int i13 = expectedImageHeight - blurBorderViewWidth;
        int i14 = i10 - blurBorderViewHeight;
        float min = Math.min(i13 / i12, i14 / i11);
        int i15 = (int) (this.A01 * min);
        int i16 = (int) (this.A00 * min);
        this.A02.layout(blurBorderViewWidth, blurBorderViewHeight, expectedImageHeight, i10);
        int i17 = (i13 / 2) + blurBorderViewWidth;
        int i18 = (i14 / 2) + blurBorderViewHeight;
        int centerY = i15 / 2;
        int i19 = i17 - centerY;
        int centerY2 = i16 / 2;
        int centerY3 = i16 / 2;
        this.A03.layout(i19, i18 - centerY2, (i15 / 2) + i17, i18 + centerY3);
        this.A02.setVisibility(0);
    }

    public void setImage(@Nullable Bitmap bitmap, @Nullable Bitmap bitmap2) {
        if (bitmap2 != null) {
            MS.A0S(this.A02, new BitmapDrawable(getContext().getResources(), bitmap2));
        } else {
            MS.A0M(this.A02, 0);
        }
        if (bitmap != null) {
            this.A01 = bitmap.getWidth();
            this.A00 = bitmap.getHeight();
            this.A03.setImageBitmap(Bitmap.createBitmap(bitmap));
            return;
        }
        this.A03.setImageDrawable(null);
    }
}
