package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.1o  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C06051o {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 18);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{25, 95, 67, 90, 91, 124, 107, 121, 111, 124, 106, 107, 106, 81, 120, 103, 106, 107, 97};
    }

    public static void A02(C1400Xy c1400Xy, C7U c7u, C1649dF c1649dF) {
        c7u.A0c(new C7S(c1649dF.A0R().A01(), PZ.A04, PZ.A04, c1649dF.A0Z(), A00(5, 14, 28)));
        boolean A0r = c1649dF.A0r();
        if (A0r) {
            C7Q c7q = new C7Q(c1649dF.A0V(), c1649dF.A0Z(), A00(5, 14, 28));
            c7q.A04 = true;
            c7q.A03 = A00(0, 5, 37);
            c7u.A0X(c7q);
        }
        boolean A27 = JR.A27(c1400Xy, C1204Qg.A03());
        C7Q c7q2 = new C7Q(c1649dF.A0O().A0D().A08(), c1649dF.A0Z(), A00(5, 14, 28), c1649dF.A0O().A0D().A05());
        if (A0r && !A27) {
            c7u.A0X(c7q2);
        } else {
            c7u.A0a(c7q2);
        }
        c7u.A0c(new C7S(c1649dF.A0O().A0D().A07(), C06001j.A00(c1649dF.A0O().A0D()), C06001j.A01(c1649dF.A0O().A0D()), c1649dF.A0Z(), A00(5, 14, 28)));
        for (String str : c1649dF.A0O().A0G().A00()) {
            c7u.A0c(new C7S(str, -1, -1, c1649dF.A0Z(), A00(5, 14, 28)));
        }
    }
}
