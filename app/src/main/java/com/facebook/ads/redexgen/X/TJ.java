package com.facebook.ads.redexgen.X;

import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class TJ implements NP {
    public static byte[] A01;
    public static String[] A02 = {"nV", "0i4Wqrqqd8V", "SjjlSsHq4luZ", "UY2G1G5tdkkQRCLDawUW8PMELrtkam", "x8YzSsjyce", "sMLSYBAewXVAxhh2DbXf8YHA5QSbjC", "Z41BjwW", "WlPnbv1jMaDivlCQdRIz8mOz1GWjjHLQ"};
    public final /* synthetic */ NN A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 111);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-29, -17, -19, -82, -26, -31, -29, -27, -30, -17, -17, -21, -82, -31, -28, -13, -82, -31, -28, -14, -27, -16, -17, -14, -12, -23, -18, -25, -82, -58, -55, -50, -55, -45, -56, -33, -63, -60, -33, -46, -59, -48, -49, -46, -44, -55, -50, -57, -33, -58, -52, -49, -41};
        String[] strArr = A02;
        if (strArr[4].length() == strArr[1].length()) {
            throw new RuntimeException();
        }
        A02[7] = "41BFLxMtpa8zSeOoPh8lyezFWRN0z1Os";
    }

    static {
        A01();
    }

    public TJ(NN nn) {
        this.A00 = nn;
    }

    @Override // com.facebook.ads.redexgen.X.NP
    public final void A42() {
        InterfaceC1110Mq interfaceC1110Mq;
        InterfaceC1110Mq interfaceC1110Mq2;
        interfaceC1110Mq = this.A00.A07;
        if (interfaceC1110Mq != null) {
            interfaceC1110Mq2 = this.A00.A07;
            interfaceC1110Mq2.A3s(A00(0, 53, 17));
        }
    }

    @Override // com.facebook.ads.redexgen.X.NP
    public final void A43() {
        InterfaceC1111Mr interfaceC1111Mr;
        InterfaceC1111Mr interfaceC1111Mr2;
        this.A00.A0M();
        interfaceC1111Mr = this.A00.A08;
        if (interfaceC1111Mr != null) {
            interfaceC1111Mr2 = this.A00.A08;
            interfaceC1111Mr2.AC8(true);
        }
        this.A00.A0B();
    }

    @Override // com.facebook.ads.redexgen.X.NP
    public final void A7t() {
        C2H c2h;
        C2H c2h2;
        C2H c2h3;
        C1400Xy c1400Xy;
        c2h = this.A00.A03;
        if (c2h == null) {
            A43();
            return;
        }
        NN.A01(this.A00);
        c2h2 = this.A00.A03;
        if (c2h2.A02() == null) {
            NN nn = this.A00;
            if (A02[6].length() != 7) {
                throw new RuntimeException();
            }
            A02[7] = "M7aB9yPR9altU9X1FYnvgfaKEANBwcUB";
            nn.A0C();
        } else {
            NN nn2 = this.A00;
            c2h3 = nn2.A03;
            nn2.A0E(c2h3.A02());
        }
        if (Build.VERSION.SDK_INT >= 16) {
            c1400Xy = this.A00.A05;
            if (JR.A1k(c1400Xy)) {
                this.A00.performAccessibilityAction(128, null);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.NP
    public final void A8k() {
        C2D c2d;
        C2G c2g;
        C1400Xy c1400Xy;
        C2D c2d2;
        String str;
        c2d = this.A00.A04;
        if (!TextUtils.isEmpty(c2d.A0I())) {
            LZ lz = new LZ();
            c1400Xy = this.A00.A05;
            c2d2 = this.A00.A04;
            Uri A00 = C1070La.A00(c2d2.A0I());
            str = this.A00.A09;
            LZ.A0E(lz, c1400Xy, A00, str);
        }
        c2g = this.A00.A02;
        c2g.A04();
    }

    @Override // com.facebook.ads.redexgen.X.NP
    public final void A8l() {
        InterfaceC1111Mr interfaceC1111Mr;
        C2D c2d;
        C2G c2g;
        C1400Xy c1400Xy;
        C2D c2d2;
        String str;
        InterfaceC1111Mr interfaceC1111Mr2;
        this.A00.A0M();
        interfaceC1111Mr = this.A00.A08;
        if (interfaceC1111Mr != null) {
            interfaceC1111Mr2 = this.A00.A08;
            interfaceC1111Mr2.AC8(true);
        }
        c2d = this.A00.A04;
        if (!TextUtils.isEmpty(c2d.A0C())) {
            LZ lz = new LZ();
            c1400Xy = this.A00.A05;
            c2d2 = this.A00.A04;
            Uri A00 = C1070La.A00(c2d2.A0C());
            str = this.A00.A09;
            LZ.A0E(lz, c1400Xy, A00, str);
        }
        c2g = this.A00.A02;
        c2g.A06();
        this.A00.A0B();
    }

    @Override // com.facebook.ads.redexgen.X.NP
    public final void ABW(C2F c2f) {
        C2F c2f2;
        C2D c2d;
        C2H A0B;
        C2D c2d2;
        NN.A00(this.A00);
        this.A00.A01 = c2f;
        c2f2 = this.A00.A01;
        if (c2f2 == C2F.A03) {
            c2d2 = this.A00.A04;
            A0B = c2d2.A0A();
        } else {
            c2d = this.A00.A04;
            A0B = c2d.A0B();
        }
        this.A00.A0E(A0B);
    }

    @Override // com.facebook.ads.redexgen.X.NP
    public final void ABf(C2H c2h) {
        C2G c2g;
        NN.A00(this.A00);
        c2g = this.A00.A02;
        c2g.A07(c2h.A01());
        if (!c2h.A05().isEmpty()) {
            this.A00.A0E(c2h);
        } else {
            this.A00.A0D(c2h);
        }
    }
}
