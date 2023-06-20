package com.facebook.ads.redexgen.X;

import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import com.facebook.proguard.annotations.DoNotStrip;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.dN  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC1657dN extends C4H<C1277Tc> {
    public static final int A05 = (int) (Lr.A00 * 4.0f);
    @Nullable
    public AnonymousClass17 A00;
    public final List<UB> A01;
    public final int A02;
    public final C1400Xy A03;
    @DoNotStrip
    public final AbstractC1219Qv A04 = new C1659dP(this);

    public AbstractC1657dN(C1A c1a, List<UB> list, C1400Xy c1400Xy) {
        this.A03 = c1400Xy;
        this.A02 = c1a.getChildSpacing();
        this.A01 = list;
    }

    private ViewGroup.MarginLayoutParams A02(int i10) {
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -1);
        int i11 = this.A02;
        if (i10 == 0) {
            i11 *= 2;
        }
        marginLayoutParams.setMargins(i11, 0, i10 >= this.A01.size() + (-1) ? this.A02 * 2 : this.A02, 0);
        return marginLayoutParams;
    }

    @Override // com.facebook.ads.redexgen.X.C4H
    public final int A0D() {
        return this.A01.size();
    }

    public final void A0F(ImageView imageView, int i10) {
        UB ub2 = this.A01.get(i10);
        K5 adCoverImage = ub2.getAdCoverImage();
        if (adCoverImage != null) {
            T3 A04 = new T3(imageView, this.A03).A04();
            A04.A06(new C1658dO(this, i10, ub2));
            A04.A07(adCoverImage.getUrl());
        }
    }

    public final void A0G(AnonymousClass17 anonymousClass17) {
        this.A00 = anonymousClass17;
    }

    @Override // com.facebook.ads.redexgen.X.C4H
    /* renamed from: A0H */
    public void A0E(C1277Tc c1277Tc, int i10) {
        c1277Tc.A0l().setLayoutParams(A02(i10));
    }
}
