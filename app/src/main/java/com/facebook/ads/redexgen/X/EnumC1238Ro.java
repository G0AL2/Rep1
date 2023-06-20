package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.Locale;

/* renamed from: com.facebook.ads.redexgen.X.Ro  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public enum EnumC1238Ro {
    A03(A01(35, 4, 104)),
    A04(A01(39, 4, 113));
    
    public static byte[] A01;
    public String A00;

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 86);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{-99, -84, -93, -93, -22, 15, 23, 2, 13, 10, 5, -63, 20, 6, 19, 23, 6, 19, -63, 19, 6, 20, 17, 16, 15, 20, 6, -37, -63, -58, 20, -34, -40, -40, -29, 36, 51, 42, 42, 50, 44, 44, 55};
    }

    static {
        A02();
    }

    EnumC1238Ro(String str) {
        this.A00 = str;
    }

    public static EnumC1238Ro A00(String str) {
        EnumC1238Ro[] values;
        for (EnumC1238Ro enumC1238Ro : values()) {
            if (enumC1238Ro.A00.equals(str)) {
                return enumC1238Ro;
            }
        }
        throw new IllegalArgumentException(String.format(Locale.US, A01(4, 27, 75), str));
    }
}
