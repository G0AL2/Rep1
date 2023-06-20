package com.facebook.ads.redexgen.X;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class IF {
    public static byte[] A00;

    static {
        A03();
    }

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 88);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{-40, -21, -30, -46, -33, -40, -31, -10, 9, 0, -16, 3, -10, -11, -6, 3};
    }

    public static long A00(IE ie2) {
        return ie2.A5X(A02(0, 7, 27), -1L);
    }

    @Nullable
    public static Uri A01(IE ie2) {
        String A5Z = ie2.A5Z(A02(7, 9, 57), null);
        if (A5Z == null) {
            return null;
        }
        return Uri.parse(A5Z);
    }

    public static void A04(IG ig) {
        ig.A01(A02(7, 9, 57));
    }

    public static void A05(IG ig, long j10) {
        ig.A02(A02(0, 7, 27), j10);
    }

    public static void A06(IG ig, Uri uri) {
        ig.A03(A02(7, 9, 57), uri.toString());
    }
}
