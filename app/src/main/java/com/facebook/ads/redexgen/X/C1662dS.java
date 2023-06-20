package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.dS  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1662dS extends AbstractC05800p {
    public static String[] A05 = {"RwkPFHsv9wotgH8PCqYhpIij5lIi", "drIC7gYxypHASOm9CvVJaHIQeep0", "f0dvIXyq27iv5zRXvkJTu2cqkG", "fzusVvXWPget8SSdASQ7tAMFHi8p37he", "Ar6p", "jDkSEm6Ik6fEWWn08WKTicIvFe3Dtksc", "J7vaKr0jTjoObEFZmlhET1S0K8S4ujA7", "2rimL2d5m8eNJCurq2ysJBza56R6EvG7"};
    public static final String A06 = C1662dS.class.getSimpleName();
    public C1664dU A00;
    public boolean A01;
    public final C1400Xy A02;
    public final InterfaceC1028Jh A03;
    public final O6 A04;

    public C1662dS(C1400Xy c1400Xy, InterfaceC1028Jh interfaceC1028Jh, O6 o62, C1220Qw c1220Qw, AbstractC05810q abstractC05810q) {
        super(c1400Xy, abstractC05810q, c1220Qw);
        this.A03 = interfaceC1028Jh;
        this.A04 = o62;
        this.A02 = c1400Xy;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05800p
    public final void A06(Map<String, String> map) {
        C1664dU c1664dU = this.A00;
        if (c1664dU != null && !TextUtils.isEmpty(c1664dU.A65())) {
            this.A02.A0D().A2Y();
            AnonymousClass29.A00(this.A00.A05());
            InterfaceC1028Jh interfaceC1028Jh = this.A03;
            String A65 = this.A00.A65();
            String[] strArr = A05;
            if (strArr[7].charAt(31) != strArr[6].charAt(31)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A05;
            strArr2[0] = "Tkg0tGhzpCvpbpNuTPjRHtf4b45H";
            strArr2[1] = "dBPpzaB1YNfwJk5banXGE19c57tB";
            interfaceC1028Jh.A93(A65, map);
        }
    }

    public final synchronized void A07() {
        if (!this.A01 && this.A00 != null) {
            this.A01 = true;
            if (!TextUtils.isEmpty(this.A00.A03())) {
                MM.A00(new C1663dT(this));
            }
        }
    }

    public final void A08(C1664dU c1664dU) {
        this.A00 = c1664dU;
    }
}
