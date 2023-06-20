package com.facebook.ads.redexgen.X;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public enum PJ {
    A0A(A01(310, 10, 13)),
    A0E(A01(351, 24, 96)),
    A03(A01(244, 13, 76)),
    A06(A01(281, 18, 105)),
    A05(A01(262, 19, 19)),
    A0D(A01(341, 10, 39)),
    A0F(A01(375, 3, 12)),
    A04(A01(257, 5, 2)),
    A09(A01(304, 6, 81)),
    A0H(A01(388, 10, 14)),
    A0M(A01(457, 15, 119)),
    A07(A01(299, 5, 1)),
    A0G(A01(378, 10, 20)),
    A0C(A01(331, 10, 83)),
    A0N(A01(472, 10, 4)),
    A0K(A01(418, 10, 38)),
    A0J(A01(TTAdConstant.DOWNLOAD_APP_INFO_CODE, 11, 121)),
    A0P(A01(482, 12, 102)),
    A0L(A01(446, 11, 11)),
    A0B(A01(320, 11, 93)),
    A08(A01(428, 18, 20)),
    A0I(A01(398, 9, 16)),
    A0O(A01(0, 0, 107));
    
    public static byte[] A01;
    public final String A00;

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 92);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{-21, -12, -9, -5, -19, 7, -22, -6, -9, -1, -5, -19, -6, -44, -43, -46, -27, -41, -82, -77, -67, -85, -84, -74, -81, -55, -84, -85, -83, -75, -55, -84, -65, -66, -66, -71, -72, -25, -16, -29, -28, -18, -25, 1, -28, -29, -27, -19, 1, -28, -9, -10, -10, -15, -16, -40, -27, -27, -30, -27, -12, 3, -6, -6, 1, -15, 0, -13, -13, -4, 22, 37, 30, 30, 21, 28, -41, -48, -35, -45, -37, -44, -18, -46, -29, -48, -62, -69, -56, -66, -58, -65, -39, -64, -68, -52, -48, 20, 21, 16, 17, 43, 34, 21, 16, 17, 27, 21, 25, 28, 30, 17, 31, 31, 21, 27, 26, 25, 14, 34, 27, 16, 21, 44, 14, 17, 44, 31, 18, 29, 28, 31, 33, 22, 27, 20, -22, -19, -27, -30, -22, -23, -38, -12, -21, -34, -39, -38, -28, -33, -42, -24, -16, -41, -26, -33, -33, -42, -35, -24, -23, -34, -25, -8, -27, -30, -25, -28, -31, -46, -26, -28, -42, -16, -25, -38, -43, -42, -32, -20, -24, -35, -11, -5, -14, -27, -32, -31, -21, 28, 15, 11, 14, 41, 29, 30, 28, 19, 24, 17, -2, -15, 3, -19, -2, -16, 11, -17, -5, -7, -4, -8, -15, 0, -15, -75, -83, -85, -78, -63, -72, -85, -90, -89, -79, -36, -43, -46, -43, -42, -34, -43, -37, -42, -51, -40, -55, -29, -41, -40, -42, -51, -46, -53, 11, 20, 23, 27, 13, 7, 10, 26, 23, 31, 27, 13, 26, -62, -61, -64, -45, -59, -45, -40, -30, -48, -47, -37, -44, -50, -47, -48, -46, -38, -50, -47, -28, -29, -29, -34, -35, 42, 51, 38, 39, 49, 42, 36, 39, 38, 40, 48, 36, 39, 58, 57, 57, 52, 51, -62, -49, -49, -52, -49, 19, 34, 27, 27, 18, 25, -47, -54, -41, -51, -43, -50, -56, -52, -35, -54, 33, 26, 39, 29, 37, 30, 24, 31, 27, 43, 47, 23, 24, 19, 20, 14, 37, 24, 19, 20, 30, -20, -16, -13, -11, -24, -10, -10, -20, -14, -15, 40, 29, 49, 42, 31, 36, 27, 29, 32, 27, 46, 33, 44, 43, 46, 48, 37, 42, 35, 27, 34, 40, 43, 51, -44, -41, -49, -35, -27, -28, -43, -49, -26, -39, -44, -43, -33, -40, -49, -31, -55, -48, -33, -40, -40, -49, -42, -37, -36, -47, -38, -53, -40, -43, -38, -41, 69, 54, 74, 72, 58, 52, 75, 62, 57, 58, 68, -14, -18, -29, -5, -31, -8, -21, -26, -25, -15, -32, -30, -43, -29, -43, -34, -28, -49, -42, -27, -36, -36, -29, -45, -30, -43, -43, -34, -39, -52, -56, -53, -58, -38, -37, -39, -48, -43, -50, 69, 56, 74, 52, 69, 55, 50, 54, 66, 64, 67, 63, 56, 71, 56, -45, -53, -55, -48, -65, -42, -55, -60, -59, -49, 57, 52, 43, 54, 39, 33, 53, 54, 52, 43, 48, 41};
    }

    static {
        A02();
    }

    PJ(String str) {
        this.A00 = str;
    }

    public static PJ A00(String str) {
        PJ[] values;
        for (PJ pj : values()) {
            if (pj.A00.equalsIgnoreCase(str)) {
                return pj;
            }
        }
        return A0O;
    }
}