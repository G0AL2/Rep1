package com.facebook.ads.redexgen.X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.ads.internal.api.AdNativeComponentView;

/* renamed from: com.facebook.ads.redexgen.X.Mw  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1116Mw extends AdNativeComponentView {
    public static final int A01 = (int) (Lr.A00 * 1.0f);
    public final ImageView A00;

    public C1116Mw(C1400Xy c1400Xy) {
        super(c1400Xy);
        this.A00 = new N8(c1400Xy);
        this.A00.setScaleType(ImageView.ScaleType.CENTER_CROP);
        EnumC1090Lw.A04(this.A00, EnumC1090Lw.A0A);
        addView(this.A00, new ViewGroup.LayoutParams(-1, -1));
        MS.A0M(this.A00, -2130706433);
        int i10 = A01;
        setPadding(i10, i10, i10, i10);
    }

    @Override // com.facebook.ads.internal.api.AdNativeComponentView
    public View getAdContentsView() {
        return this.A00;
    }

    public ImageView getImageCardView() {
        return this.A00;
    }
}
