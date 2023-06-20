package com.facebook.ads.redexgen.X;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.HashMap;

/* loaded from: assets/audience_network.dex */
public abstract class OJ extends LinearLayout {
    public static final LinearLayout.LayoutParams A05 = new LinearLayout.LayoutParams(-2, -2);
    public final int A00;
    public final RelativeLayout A01;
    public final C1400Xy A02;
    public final T1 A03;
    public final OW A04;

    public abstract void A0A(int i10);

    public OJ(C1400Xy c1400Xy, int i10, C1K c1k, boolean z10, String str, InterfaceC1028Jh interfaceC1028Jh, InterfaceC1110Mq interfaceC1110Mq, C1220Qw c1220Qw, MK mk) {
        super(c1400Xy);
        MS.A0K(this);
        this.A02 = c1400Xy;
        this.A00 = i10;
        this.A04 = new OW(c1400Xy);
        MS.A0M(this.A04, 0);
        MS.A0K(this.A04);
        this.A03 = new T1(c1400Xy, str, c1k, z10, interfaceC1028Jh, interfaceC1110Mq, c1220Qw, mk);
        MS.A0G(1001, this.A03);
        this.A01 = new RelativeLayout(c1400Xy);
        this.A01.setLayoutParams(A05);
        MS.A0K(this.A01);
    }

    public void A08() {
    }

    public void A09() {
    }

    public final T1 getCTAButton() {
        return this.A03;
    }

    public View getExpandableLayout() {
        return null;
    }

    @VisibleForTesting
    public final ImageView getIconView() {
        return this.A04;
    }

    public void setInfo(C1I c1i, C1L c1l, String str, String str2, @Nullable OM om) {
        this.A03.setCta(c1l, str, new HashMap(), om);
        T3 t32 = new T3(this.A04, this.A02);
        int i10 = this.A00;
        t32.A05(i10, i10).A07(str2);
    }

    public void setTitleMaxLines(int i10) {
    }
}
