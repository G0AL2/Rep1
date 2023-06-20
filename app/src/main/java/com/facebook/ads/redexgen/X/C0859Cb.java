package com.facebook.ads.redexgen.X;

import android.util.Pair;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Cb  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0859Cb {
    public static byte[] A00;

    static {
        A03();
    }

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 78);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{30, 59, 49, 55, 60, 33, 55, 22, 39, 32, 51, 38, 59, 61, 60, 0, 55, 63, 51, 59, 60, 59, 60, 53, 7, 59, 54, 46, 53, 54, 52, 60, 19, 34, 37, 54, 35, 62, 56, 57, 5, 50, 58, 54, 62, 57, 62, 57, 48};
    }

    public static long A00(Map<String, String> keyStatus, String str) {
        if (keyStatus != null) {
            try {
                String value = keyStatus.get(str);
                if (value != null) {
                    return Long.parseLong(value);
                }
                return -9223372036854775807L;
            } catch (NumberFormatException unused) {
                return -9223372036854775807L;
            }
        }
        return -9223372036854775807L;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.CL != com.facebook.ads.internal.exoplayer2.drm.DrmSession<?> */
    public static Pair<Long, Long> A01(CL<?> cl2) {
        Map<String, String> keyStatus = cl2.ADT();
        if (keyStatus == null) {
            return null;
        }
        return new Pair<>(Long.valueOf(A00(keyStatus, A02(0, 24, 28))), Long.valueOf(A00(keyStatus, A02(24, 25, 25))));
    }
}
