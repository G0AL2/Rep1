package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;

/* renamed from: com.facebook.ads.redexgen.X.dB  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1645dB implements C7M {
    public static String[] A03 = {"SGxBKOT0PnlxeQ2jGccieZy3bFeI", "1PQaT", "uVEahNbfwTxCxKVGO7p", "rVPhbhRBlKfAg8fviAhE", "2ov", "KrP87Bn8e271VzBAE5Wi", "4No2VIB7eIWgh7ub8hExBeYUcY", "mEjh"};
    public final /* synthetic */ C05941d A00;
    public final /* synthetic */ C1400Xy A01;
    public final /* synthetic */ boolean A02;

    public C1645dB(C05941d c05941d, C1400Xy c1400Xy, boolean z10) {
        this.A00 = c05941d;
        this.A01 = c1400Xy;
        this.A02 = z10;
    }

    private void A00(boolean z10) {
        InterfaceC05931c interfaceC05931c;
        InterfaceC05931c interfaceC05931c2;
        C1653dJ c1653dJ;
        if (!z10) {
            interfaceC05931c = this.A00.A04;
            String[] strArr = A03;
            if (strArr[7].length() == strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A03;
            strArr2[5] = "3TR1ccuSepVqqTAhPt5x";
            strArr2[3] = "2nf30Z9fIqCCPDXuu277";
            interfaceC05931c.A9u(AdError.CACHE_ERROR);
            return;
        }
        if (JR.A1A(this.A01)) {
            boolean z11 = this.A02;
            String[] strArr3 = A03;
            if (strArr3[7].length() == strArr3[0].length()) {
                throw new RuntimeException();
            }
            A03[4] = "td5rO8fwqS2g7pt7eIgv7CCFkrrD";
            if (z11) {
                C05941d c05941d = this.A00;
                C1400Xy c1400Xy = this.A01;
                c1653dJ = c05941d.A03;
                c05941d.A02 = PB.A01(c1400Xy, c1653dJ, 1, new C1646dC(this));
                return;
            }
        }
        interfaceC05931c2 = this.A00.A04;
        interfaceC05931c2.A9v();
    }

    @Override // com.facebook.ads.redexgen.X.C7M
    public final void AAH() {
        A00(false);
    }

    @Override // com.facebook.ads.redexgen.X.C7M
    public final void AAO() {
        A00(true);
    }
}
