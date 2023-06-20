package com.facebook.ads.redexgen.X;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: assets/audience_network.dex */
public class TS implements InterfaceC1108Mo {
    public static String[] A01 = {"h2gmCgzeOSwPpQadyubORmPME", "FUsicmE", "hn4NyL1W4e9kqLwlHKvUfsHZQMREJpya", "eHNPFabCzKzaRImgdDwbhByrCj67ZmIn", "6elmdBIgNV", "KYWsfvA8UKVAEYMYl", "OScpkLbA9Akq1WCCJj9B2P18mljyrRf1", "CLPqh0UltEqIAscKXF8yE5GQF7q0sxf27"};
    public final /* synthetic */ TO A00;

    public TS(TO to) {
        this.A00 = to;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1108Mo
    public final void AAK() {
        boolean A0Z;
        boolean z10;
        C1036Jp c1036Jp;
        InterfaceC1110Mq interfaceC1110Mq;
        NI ni;
        AtomicBoolean atomicBoolean;
        boolean A0Y;
        AtomicBoolean atomicBoolean2;
        OU ou;
        A0Z = this.A00.A0Z();
        if (A0Z) {
            TO to = this.A00;
            if (A01[5].length() != 17) {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[2] = "BQfapZ2cL00AEaaE3FSFtmiC2NvNVd8B";
            strArr[7] = "2Eilcj8Fw7KGtRQsL0qtkyDrsBY20NGQL";
            atomicBoolean2 = to.A0Q;
            if (!atomicBoolean2.get()) {
                ou = this.A00.A0O;
                ou.A07(this.A00);
                return;
            }
        }
        z10 = this.A00.A0S;
        if (z10) {
            atomicBoolean = this.A00.A0Q;
            boolean z11 = atomicBoolean.get();
            String[] strArr2 = A01;
            if (strArr2[1].length() == strArr2[4].length()) {
                throw new RuntimeException();
            }
            A01[5] = "H8RzDb7PgK43jKvxQ";
            if (!z11) {
                A0Y = this.A00.A0Y();
                if (A0Y) {
                    this.A00.A0V.setToolbarActionMode(0);
                    TO to2 = this.A00;
                    String[] strArr3 = A01;
                    if (strArr3[1].length() != strArr3[4].length()) {
                        A01[3] = "HnGIws8hCrqNeUOcBeXjDBOXn0GrcMNy";
                        to2.A0M();
                        return;
                    }
                    to2.A0M();
                    return;
                }
            }
        }
        c1036Jp = this.A00.A0I;
        c1036Jp.A02(EnumC1035Jo.A07, null);
        interfaceC1110Mq = this.A00.A0L;
        ni = this.A00.A0M;
        interfaceC1110Mq.A3s(ni.A6U());
    }
}
