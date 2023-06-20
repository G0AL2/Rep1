package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.view.View;
import androidx.annotation.Nullable;
import com.facebook.infer.annotation.Nullsafe;

@Nullsafe(Nullsafe.Mode.LOCAL)
/* renamed from: com.facebook.ads.redexgen.X.eC  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1702eC {
    public final C1713eN A00;
    public final C1711eL A01;

    public C1702eC(AbstractC1718eS abstractC1718eS, C1711eL c1711eL, C1713eN c1713eN) {
        this.A00 = c1713eN;
        this.A01 = c1711eL;
        abstractC1718eS.A02(new GK(c1711eL));
    }

    public static C1702eC A00(AbstractC1718eS abstractC1718eS, InterfaceC1722eW interfaceC1722eW, GL gl) {
        C1713eN c1713eN = new C1713eN();
        return new C1702eC(abstractC1718eS, new C1711eL(interfaceC1722eW, new GP(), gl, c1713eN, new Handler()), c1713eN);
    }

    public final void A01(View view) {
        this.A00.A01(view);
    }

    public final void A02(View view, C1720eU c1720eU) {
        this.A00.A02(view, c1720eU);
    }

    public final void A03(@Nullable InterfaceC1717eR interfaceC1717eR) {
        this.A01.A0B(interfaceC1717eR);
    }

    public final void A04(@Nullable InterfaceC1715eP interfaceC1715eP) {
        this.A01.A0C(interfaceC1715eP);
    }
}
