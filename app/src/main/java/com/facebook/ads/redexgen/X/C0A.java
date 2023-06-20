package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.0A  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C0A {
    public static byte[] A00;

    static {
        A02();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 64);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{71};
    }

    private String A01(String str) {
        int lastIndexOf = str.lastIndexOf(46);
        int lastIndexOf2 = str.lastIndexOf(47);
        if (lastIndexOf != -1 && lastIndexOf > lastIndexOf2 && lastIndexOf + 2 + 4 > str.length()) {
            return str.substring(lastIndexOf + 1, str.length());
        }
        return A00(0, 0, 13);
    }

    public final String A03(String str) {
        String A01 = A01(str);
        String A02 = C0I.A02(str);
        if (TextUtils.isEmpty(A01)) {
            return A02;
        }
        return A02 + A00(0, 1, 41) + A01;
    }
}
