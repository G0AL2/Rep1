package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.6I  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public enum C6I {
    A05(A00(21, 4, 26)),
    A04(A00(16, 5, 36)),
    A06(A00(25, 7, 53));
    
    public static byte[] A01;
    public static String[] A02 = {"0RRWKfJdKrui2m4MHTFQsMJyHOf8C8w9", "8LZ64BEP3t8fC1ORxLDriZfpukd2eG7I", "CwE1gmU02QGgATNS", "IbR7bXcqKLpLj", "qam4zJzNIQZnne6rIhaeaYE3gj58AOpU", "Hd0V98lR5CAMSu3WjOLj94lF2tQwUAfl", "RGEAyvOYfNtgiUZah7VCMfRDLY5FaLk0", "3n2TsZ0kv6VM0Knc"};
    public final String A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A02;
            if (strArr[2].length() != strArr[7].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[5] = "yOKNzT6s9VzW4yFkLY6PsNahhjQJ505W";
            strArr2[1] = "q1cNaQJhP7NVWr6bUrjGcn2AVkCmliVi";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 80);
            i13++;
        }
    }

    public static void A01() {
        A01 = new byte[]{0, 13, 13, 10, 13, -98, -93, -101, -92, -66, -88, -71, -75, -80, -75, -82, -39, -26, -26, -29, -26, -45, -40, -48, -39, -4, -26, -9, -13, -18, -13, -20};
    }

    static {
        A01();
    }

    C6I(String str) {
        this.A00 = str;
    }

    public final String A02() {
        return this.A00;
    }
}
