package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdSize;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Lf  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1075Lf {
    public static byte[] A00;
    public static String[] A01 = {"gFe3mTVqEc", "o3XICwck3thy8t5khkuFfgIyTYcE10rb", "CXZamXhEArpjjLRWzP01hTJHhdHKIPhL", "oFEH5ENhqq8Jzm18l75xaKQx7AXJNwzV", "R1QKRY6v8stJjzPTGoE1sFm3d511QSKK", "fRlItu1oZcW1vgjv2TfsauDW1x1gg146", "rMZj8KW6uJSswCV0wJ61u4oJuHgPLcpr", "VRcOG4k1oxgWu574CIBxVkEWQ"};
    public static final Map<KK, KM> A02;

    public static String A06(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 25);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A00 = new byte[]{125, 95, 80, 25, 74, 30, 93, 76, 91, 95, 74, 91, 30, Byte.MAX_VALUE, 90, 109, 87, 68, 91, 30, 75, 77, 87, 80, 89, 30, 74, 86, 87, 77, 30, 73, 87, 90, 74, 86, 30, 95, 80, 90, 30, 86, 91, 87, 89, 86, 74, 16, 115, 72, 77, 72, 73, 81, 72, 6, 103, 66, 117, 79, 92, 67, 6, 82, 95, 86, 67, 8};
    }

    static {
        A07();
        A02 = new HashMap();
        A02.put(KK.A08, KM.A0C);
        A02.put(KK.A06, KM.A0E);
        A02.put(KK.A05, KM.A0D);
    }

    public static AdSize A00(KK kk) {
        return AdSize.fromWidthAndHeight(kk.A03(), kk.A02());
    }

    public static AdSize A01(KM km) {
        for (Map.Entry<KK, KM> entry : A02.entrySet()) {
            if (entry.getValue() == km) {
                return A00(entry.getKey());
            }
        }
        AdSize adSize = AdSize.BANNER_320_50;
        if (A01[2].charAt(13) != 'L') {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[3] = "8yxIcOBY3dyXYw8tx9RnPYEelWv3PiEU";
        strArr[5] = "RuT7gwLbx9UlwnZGushHq4GsGVsr9kdh";
        return adSize;
    }

    public static KK A02(int i10) {
        if (i10 != 4) {
            if (i10 != 5) {
                if (i10 != 6) {
                    if (i10 != 7) {
                        if (i10 == 100) {
                            return KK.A07;
                        }
                        throw new IllegalArgumentException(A06(48, 20, 63));
                    }
                    return KK.A08;
                }
                return KK.A06;
            }
            return KK.A05;
        }
        return KK.A04;
    }

    public static KK A03(int i10, int i11) {
        if (KK.A07.A02() == i11 && KK.A07.A03() == i10) {
            KK kk = KK.A07;
            if (A01[2].charAt(13) != 'L') {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[4] = "oPyqycdUDaMLkpnFUSD1lOVVut5Ak4ux";
            strArr[6] = "t44MnsVi8idfM7jbHI01veBsrnLqKP4H";
            return kk;
        } else if (KK.A04.A02() == i11 && KK.A04.A03() == i10) {
            return KK.A04;
        } else {
            if (KK.A05.A02() == i11 && KK.A05.A03() == i10) {
                KK kk2 = KK.A05;
                if (A01[1].charAt(1) != 'd') {
                    String[] strArr2 = A01;
                    strArr2[4] = "zTuOoFSTcjvo6siKnZ91TQqR6FN8Kxgy";
                    strArr2[6] = "bIxUq8CGRMwo1zGvdui1T5X5wsDAfXTH";
                    return kk2;
                }
                throw new RuntimeException();
            } else if (KK.A06.A02() == i11 && KK.A06.A03() == i10) {
                return KK.A06;
            } else {
                if (KK.A08.A02() == i11 && KK.A08.A03() == i10) {
                    return KK.A08;
                }
                throw new IllegalArgumentException(A06(0, 48, 39));
            }
        }
    }

    public static KK A04(AdSize adSize) {
        return A03(adSize.getWidth(), adSize.getHeight());
    }

    public static KM A05(KK kk) {
        KM km = A02.get(kk);
        if (km == null) {
            KM adTemplate = KM.A0F;
            if (A01[1].charAt(1) != 'd') {
                String[] strArr = A01;
                strArr[3] = "UG6JCyDXDBzWMb76AfK0hQ3l3bgkgswO";
                strArr[5] = "9YhmwLNWXnVy8pTRO5fFllqJZ4ALiPvn";
                return adTemplate;
            }
            throw new RuntimeException();
        }
        return km;
    }
}
