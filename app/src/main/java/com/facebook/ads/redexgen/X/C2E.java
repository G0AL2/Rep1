package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.util.process.ProcessUtils;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.2E  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C2E {
    public static C2D A00;
    public static byte[] A01;

    static {
        A02();
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 45);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{58, 54, 52, 119, 63, 56, 58, 60, 59, 54, 54, 50, 119, 56, 61, 42, 119, 24, 29, 6, 11, 28, 9, 22, 11, 13, 16, 23, 30, 6, 26, 22, 23, 31, 16, 30};
    }

    public static C2D A00(C1399Xx c1399Xx) {
        if (A00 == null) {
            synchronized (C2D.class) {
                if (A00 == null) {
                    A00 = new C2D(new C1605cW(c1399Xx.getSharedPreferences(ProcessUtils.getProcessSpecificName(A01(0, 36, 116), c1399Xx), 0)));
                }
            }
        }
        return A00;
    }
}
