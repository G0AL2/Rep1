package com.facebook.ads.redexgen.X;

import android.os.Handler;

/* renamed from: com.facebook.ads.redexgen.X.Qz  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1223Qz extends L8 {
    public static String[] A04 = {"pUIboC8CwdUMtM1tPR8iEtPz8p", "ladzvmq", "gZiIZXhhpFNWaRiPv", "vQtAVDGFp8M", "7j30UYRlUEXcM4Kd2wK", "XchzO9Mtzl1GyvdPdWlZd1J0iwZmFx3H", "VTwPVxpRcW0", "YPnzN72MuP4y3lnuBhqZ0NoSyY"};
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ QK A02;
    public final /* synthetic */ EnumC1217Qt A03;

    public C1223Qz(QK qk, EnumC1217Qt enumC1217Qt, int i10, int i11) {
        this.A02 = qk;
        this.A03 = enumC1217Qt;
        this.A00 = i10;
        this.A01 = i11;
    }

    @Override // com.facebook.ads.redexgen.X.L8
    public final void A06() {
        C1400Xy c1400Xy;
        Handler handler;
        C07849b c07849b;
        C1400Xy c1400Xy2;
        C07849b c07849b2;
        C1062Kr c1062Kr;
        Handler handler2;
        C1400Xy c1400Xy3;
        C07849b c07849b3;
        Handler handler3;
        C1400Xy c1400Xy4;
        C1400Xy c1400Xy5;
        C07849b c07849b4;
        C1092Ly c1092Ly;
        Handler handler4;
        C1400Xy c1400Xy6;
        C1400Xy c1400Xy7;
        Handler handler5;
        C07849b c07849b5;
        C07849b c07849b6;
        N5 n52;
        C1400Xy c1400Xy8;
        C07849b c07849b7;
        if (this.A03 == EnumC1217Qt.A07) {
            this.A02.A0L(EnumC1035Jo.A0q);
            c1400Xy8 = this.A02.A0A;
            c1400Xy8.A0D().A2w();
            c07849b7 = this.A02.A0B;
            c07849b7.A02(QK.A0C());
        } else if (this.A03 == EnumC1217Qt.A03) {
            this.A02.A0L(EnumC1035Jo.A0l);
            this.A02.A03 = true;
            c07849b6 = this.A02.A0B;
            n52 = QK.A0G;
            c07849b6.A02(n52);
            this.A02.A0K(this.A00);
        } else {
            EnumC1217Qt enumC1217Qt = this.A03;
            EnumC1217Qt enumC1217Qt2 = EnumC1217Qt.A06;
            String[] strArr = A04;
            if (strArr[0].length() != strArr[7].length()) {
                throw new RuntimeException();
            }
            A04[5] = "Wlqb3PCyph61UkVVxo7ng7VZa1hYfmo4";
            if (enumC1217Qt == enumC1217Qt2) {
                this.A02.A0L(EnumC1035Jo.A0k);
                c1400Xy7 = this.A02.A0A;
                c1400Xy7.A0D().A2o();
                this.A02.A03 = true;
                handler5 = this.A02.A07;
                handler5.removeCallbacksAndMessages(null);
                c07849b5 = this.A02.A0B;
                int i10 = this.A01;
                c07849b5.A02(new AnonymousClass88(i10, i10));
                this.A02.A0K(this.A01);
            } else if (this.A03 == EnumC1217Qt.A0A) {
                c1400Xy4 = this.A02.A0A;
                if (JR.A1I(c1400Xy4)) {
                    c1400Xy6 = this.A02.A0A;
                    c1400Xy6.A09().ACr();
                }
                this.A02.A0L(EnumC1035Jo.A0o);
                c1400Xy5 = this.A02.A0A;
                c1400Xy5.A0D().A33();
                c07849b4 = this.A02.A0B;
                c1092Ly = QK.A0H;
                c07849b4.A02(c1092Ly);
                handler4 = this.A02.A07;
                handler4.removeCallbacksAndMessages(null);
                this.A02.A0H();
            } else if (this.A03 == EnumC1217Qt.A05) {
                this.A02.A0L(EnumC1035Jo.A0n);
                c1400Xy3 = this.A02.A0A;
                c1400Xy3.A0D().A2s();
                c07849b3 = this.A02.A0B;
                c07849b3.A02(new NE(this.A00) { // from class: com.facebook.ads.redexgen.X.85
                });
                handler3 = this.A02.A07;
                handler3.removeCallbacksAndMessages(null);
                this.A02.A0K(this.A00);
            } else if (this.A03 == EnumC1217Qt.A04) {
                this.A02.A0L(EnumC1035Jo.A0m);
                c1400Xy2 = this.A02.A0A;
                c1400Xy2.A0D().A2p();
                c07849b2 = this.A02.A0B;
                c1062Kr = QK.A0K;
                c07849b2.A02(c1062Kr);
                handler2 = this.A02.A07;
                handler2.removeCallbacksAndMessages(null);
            } else if (this.A03 == EnumC1217Qt.A09) {
                this.A02.A0L(EnumC1035Jo.A0k);
                c1400Xy = this.A02.A0A;
                c1400Xy.A0D().A2y();
                this.A02.A03 = true;
                handler = this.A02.A07;
                handler.removeCallbacksAndMessages(null);
                c07849b = this.A02.A0B;
                c07849b.A02(new AnonymousClass88(this.A00, this.A01));
                this.A02.A0K(this.A00);
            }
        }
    }
}
