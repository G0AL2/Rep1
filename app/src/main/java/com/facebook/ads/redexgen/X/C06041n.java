package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.1n  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C06041n {
    public static byte[] A00;
    public static String[] A01 = {"kdNZsDbIr2FjUgQ6", "G4tbE8YXKkBHtbRzjHgF1iVs8BhQX3ki", "rgsd1nh14jUfY0oEDkCzVbJlkUwrdBXO", "6d8i19T6TQ9xRiUYh6SOmARBfT83lkdi", "2FsjHYpAfMpiihTdUse", "xtyrzkpFCSmXtl0pVvZtRxgukiiALNOU", "PnjWz3Ubzat8tEiN6RTB47L4MZQANY1H", "IONaBzwOxfylvpW8Ch"};

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A01;
            if (strArr[6].charAt(12) != strArr[5].charAt(12)) {
                break;
            }
            A01[2] = "wyIfRhN1EoOdsBbK5VRzuRP5Lc7uqmgb";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            byte b10 = (byte) ((copyOfRange[i13] - i12) - 100);
            if (A01[0].length() == 15) {
                break;
            }
            String[] strArr2 = A01;
            strArr2[3] = "fUzr4JaNgjTtoWHz8k6HkVts9HpSP1Qi";
            strArr2[1] = "zuQx1GaumRIGoFj6MrcQJkCLkICnzrhi";
            copyOfRange[i13] = b10;
            i13++;
        }
        throw new RuntimeException();
    }

    public static void A01() {
        A00 = new byte[]{-88, -30, -18, -25, -26};
    }

    static {
        A01();
    }

    public static void A02(C1400Xy c1400Xy, AnonymousClass18 anonymousClass18, boolean z10, InterfaceC06021l interfaceC06021l) {
        if (!JR.A1S(c1400Xy)) {
            C7U c7u = new C7U(c1400Xy);
            C1W A06 = anonymousClass18.A0O().A0D().A06();
            c7u.A0d(new C1036Jp(anonymousClass18.A0U(), c1400Xy.A08()));
            if (A06 == null) {
                interfaceC06021l.ABm(AdError.CACHE_ERROR);
                return;
            } else if (A06.A0J()) {
                interfaceC06021l.ABn();
                if (A01[2].charAt(7) != '1') {
                    throw new RuntimeException();
                }
                A01[0] = "84TqyqDRqUmJCVM8";
                return;
            } else {
                C7Q c7q = new C7Q(A06.A0E(), anonymousClass18.A0Z(), anonymousClass18.A0Y());
                c7q.A04 = true;
                if (JR.A1L(c1400Xy)) {
                    c7q.A03 = A00(0, 5, 22);
                }
                int i10 = C06011k.A00[A06.A09().ordinal()];
                if (i10 == 1 || i10 == 2) {
                    c7u.A0X(c7q);
                }
                c7u.A0b(new C7S(anonymousClass18.A0R().A01(), -1, -1, anonymousClass18.A0Z(), anonymousClass18.A0Y()));
                c7u.A0b(new C7S(A06.A0D(), -1, -1, anonymousClass18.A0Z(), anonymousClass18.A0Y()));
                c7u.A0W(new C1642d8(c1400Xy, interfaceC06021l, c7u, A06, z10), new C7N(anonymousClass18.A0Z(), anonymousClass18.A0Y()));
                return;
            }
        }
        interfaceC06021l.ABn();
    }
}
