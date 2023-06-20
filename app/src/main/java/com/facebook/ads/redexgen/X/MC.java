package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.StringTokenizer;

/* loaded from: assets/audience_network.dex */
public final class MC {
    public static byte[] A00;

    static {
        A02();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 97);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{25, 65, 65, 65};
    }

    public static String A01(String truncatedBody) {
        if (truncatedBody != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(truncatedBody, A00(0, 1, 88), true);
            int i10 = 0;
            if (truncatedBody.length() > 90) {
                int length = truncatedBody.length();
                String A002 = A00(1, 3, 14);
                if (length > 93 || !truncatedBody.endsWith(A002)) {
                    while (stringTokenizer.hasMoreTokens()) {
                        int tokenLength = stringTokenizer.nextToken().length();
                        if (i10 + tokenLength < 90) {
                            i10 += tokenLength;
                        }
                    }
                    if (i10 == 0) {
                        return truncatedBody.substring(0, 90) + A002;
                    }
                    return truncatedBody.substring(0, i10) + A002;
                }
                return truncatedBody;
            }
            return truncatedBody;
        }
        return truncatedBody;
    }
}
