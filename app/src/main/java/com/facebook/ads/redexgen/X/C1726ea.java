package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.ea  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1726ea {
    public static byte[] A00;
    public static String[] A01 = {"gK21opX6pdVXzizTr5B569byzifByDT1", "VXUYBRMamhge5PldHXwCUhQsvqUwyGaK", "A9eN1weHgCPL1SkQ3ZXjYtrHuOy08x6Y", "MZbjV39kBt4hAqLFGwVFLXlTEV84r4gZ", "MdBS2JQ6", "f1VlKL6T46QLbXXjKJzzCBeajzTILabi", "uaXBHv2Fpyp6t9CjlnIdC1IJtF0IP5s0", "SVJaljzXeB5Am8n"};

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 57);
            String[] strArr = A01;
            if (strArr[1].charAt(18) == strArr[2].charAt(18)) {
                throw new RuntimeException();
            }
            A01[4] = "X228u0Qr";
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{-69, -67, -50, -61, -48, -61, -50, -45, -71, -55, -68, -60, -65, -67, -50, -71, -61, -66, -43, -40, -45, -32, -35, -25, -24, -39, -30, -39, -26, -45, -25, -39, -24, -24, -26, -15, -15, -28, -18, -20, -13, -12, -9, -22, -23, 6, 19, 19, 16, 19, 0, 4, 16, 5, 6, -52, -39, -39, -42, -39, -58, -44, -52, -38, -38, -56, -50, -52, -25, -6, -27, -25, -14, -10, -21, -15, -16, 22, 15, 33, 13, 16, 23, 18, 16, 9, 27, 7, 11, 23, 22, 28, 26, 23, 20, 20, 13, 26, -70, -77, -59, -79, -66, -69, -59, -58, -73, -64, -73, -60, -88, -95, -77, -97, -73, -91, -94, -74, -87, -91, -73, -24, -32, -31, -34, -29, -24, -14, -32, -31, -21, -28, -29, -34, -31, -8, -34, -26, -22, -50, -55, -68, -58, -78, -68, -63, -55, -76, -65, -68, -73, -76, -57, -72, -73, -29, -19, -39, -22, -17, -36, -26, -29, -35, 10, 13, -1, 2, -3, 18, 7, 11, 3, -3, 11, 17, -67, -64, -78, -75, -70, -65, -72, -80, -78, -75, -78, -63, -59, -74, -61, -58, -66, -67, -62, -70, -51, -62, -56, -57, -72, -56, -49, -66, -53, -59, -70, -46, -72, -52, -66, -51, -43, -51, -37, -37, -55, -49, -51, -85, -89, -100, -98, -96, -88, -96, -87, -81, -102, -92, -97, 6, 2, -9, -7, -5, 3, -5, 4, 10, -11, 10, 15, 6, -5, 37, 24, 20, 38, 34, 33, -84, -97, -85, -81, -97, -83, -82, -103, -93, -98, -71, -82, -75, -67, -91, -72, -85, -71, -69, -78, -70, -2, -10, -12, -5, -22, -3, -16, -20, -2, -6, -7, -54, 35, 22, 18, 36, 12, 33, 38, 29, 18, -24, -37, -27, -37, -44, -37, -34, -37, -26, -21};
    }

    static {
        A01();
    }
}
